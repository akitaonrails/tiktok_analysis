package com.bytedance.als.ui.state;

import X.C13LP;
import X.C1563460qmu;
import X.C2217381BqS;
import X.C385670FAf;
import X.InterfaceC1441305kZ;
import X.InterfaceC2217241BqE;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveState<T> extends C385670FAf<T> {
    public final Function0<T> LIZ;
    public Object LIZIZ;
    public final ArrayList<LiveState<T>.CallbackWithLifecycle> LIZJ = new ArrayList<>();
    public final HashMap<InterfaceC1441305kZ<T>, LiveState<T>.CallbackWithLifecycle> LIZLLL = new HashMap<>();
    public final HashMap<LiveState<T>.CallbackWithLifecycle, InterfaceC1441305kZ<T>> LJ = new HashMap<>();
    public final HashMap<InterfaceC2217241BqE<?, ?>, LiveState<?>> LJFF = new HashMap<>();
    public boolean LJI;
    public int LJII;

    @Override // X.C385670FAf
    public final synchronized T LIZJ() {
        if (!this.LJI) {
            this.LIZIZ = this.LIZ.invoke();
            this.LJII++;
            this.LJI = true;
        }
        return (T) this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveState(Function0<? extends T> function0) {
        this.LIZ = function0;
    }

    @Override // X.C385670FAf, X.InterfaceC540980LJo
    public final void LIZIZ(InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        LiveState<T>.CallbackWithLifecycle callbackWithLifecycleRemove;
        if (interfaceC1441305kZ != null && this.LIZLLL.size() != 0 && (callbackWithLifecycleRemove = this.LIZLLL.remove(interfaceC1441305kZ)) != null) {
            this.LIZJ.remove(callbackWithLifecycleRemove);
            callbackWithLifecycleRemove.LL.getLifecycle().removeObserver(callbackWithLifecycleRemove);
            this.LJ.remove(callbackWithLifecycleRemove);
        }
    }

    @Override // X.C385670FAf
    public final void LIZLLL(InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        if (interfaceC1441305kZ != null && this.LIZLLL.get(interfaceC1441305kZ) == null) {
            AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(interfaceC1441305kZ, 16);
            C1563460qmu c1563460qmu = new C1563460qmu();
            c1563460qmu.LL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            LiveState<T>.CallbackWithLifecycle callbackWithLifecycle = new CallbackWithLifecycle(c1563460qmu, awS608S0100000_29, Lifecycle.State.CREATED);
            this.LIZLLL.put(interfaceC1441305kZ, callbackWithLifecycle);
            this.LJ.put(callbackWithLifecycle, interfaceC1441305kZ);
            LJIIJJI(c1563460qmu, callbackWithLifecycle);
        }
    }

    @Override // X.C385670FAf
    public final void LJI(LifecycleOwner lifecycleOwner) {
        ArrayList<LiveState<T>.CallbackWithLifecycle> arrayList = this.LIZJ;
        ArrayList arrayList2 = new ArrayList();
        for (LiveState<T>.CallbackWithLifecycle callbackWithLifecycle : arrayList) {
            if (Intrinsics.LJFF(callbackWithLifecycle.LL, lifecycleOwner)) {
                arrayList2.add(callbackWithLifecycle);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            LJIIL((CallbackWithLifecycle) it2.next());
        }
    }

    public final void LJII(boolean z) {
        if (!this.LJI) {
            this.LJI = true;
        }
        T tInvoke = this.LIZ.invoke();
        if (!Intrinsics.LJFF(tInvoke, this.LIZIZ)) {
            this.LIZIZ = tInvoke;
            this.LJII++;
            Iterator it2 = C13LP.LLIIII(this.LIZJ).iterator();
            while (it2.hasNext()) {
                ((CallbackWithLifecycle) it2.next()).LIZ(this.LJII, tInvoke, z);
            }
        }
        Iterator<T> it3 = this.LJFF.values().iterator();
        while (it3.hasNext()) {
            ((LiveState) it3.next()).LJII(z);
        }
    }

    public final LiveState LJIIIIZZ(C2217381BqS c2217381BqS) {
        synchronized (this) {
            LiveState<?> liveState = this.LJFF.get(c2217381BqS);
            if (liveState != null) {
                return liveState;
            }
            LiveState<?> liveState2 = new LiveState<>(new AwS426S0200000_25(c2217381BqS, this, 132));
            this.LJFF.put(c2217381BqS, liveState2);
            return liveState2;
        }
    }

    public final void LJIIL(LiveState<T>.CallbackWithLifecycle callbackWithLifecycle) {
        InterfaceC1441305kZ<T> interfaceC1441305kZRemove;
        this.LIZJ.remove(callbackWithLifecycle);
        callbackWithLifecycle.LL.getLifecycle().removeObserver(callbackWithLifecycle);
        if (this.LJ.size() != 0 && (interfaceC1441305kZRemove = this.LJ.remove(callbackWithLifecycle)) != null) {
            this.LIZLLL.remove(interfaceC1441305kZRemove);
        }
    }

    public final class CallbackWithLifecycle implements LifecycleEventObserver {
        public final LifecycleOwner LL;
        public final Function1<T, Unit> LLILLJJLI;
        public final Lifecycle.State LLILLL;
        public int LLILZ;

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (this.LL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                LiveState.this.LJIIL(this);
                return;
            }
            int i = this.LLILZ;
            LiveState<T> liveState = LiveState.this;
            if (i == liveState.LJII) {
                return;
            }
            LIZ(LiveState.this.LJII, liveState.LIZJ(), true);
        }

        public final void LIZ(int i, Object obj, boolean z) {
            if (this.LL.getLifecycle().getCurrentState().isAtLeast(this.LLILLL) && z) {
                this.LLILZ = i;
                this.LLILLJJLI.invoke(obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CallbackWithLifecycle(LifecycleOwner lifecycleOwner, Function1<? super T, Unit> function1, Lifecycle.State state) {
            this.LL = lifecycleOwner;
            this.LLILLJJLI = function1;
            this.LLILLL = state;
        }
    }

    @Override // X.C385670FAf, X.InterfaceC540980LJo
    public final void LIZ(LifecycleOwner lifecycleOwner, InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        if (lifecycleOwner != null && lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED && interfaceC1441305kZ != null && this.LIZLLL.get(interfaceC1441305kZ) == null) {
            LiveState<T>.CallbackWithLifecycle callbackWithLifecycle = new CallbackWithLifecycle(lifecycleOwner, new AwS608S0100000_29(interfaceC1441305kZ, 15), Lifecycle.State.STARTED);
            this.LIZLLL.put(interfaceC1441305kZ, callbackWithLifecycle);
            this.LJ.put(callbackWithLifecycle, interfaceC1441305kZ);
            LJIIJJI(lifecycleOwner, callbackWithLifecycle);
        }
    }

    @Override // X.C385670FAf
    public final void LJ(LifecycleOwner lifecycleOwner, InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        if (lifecycleOwner != null && lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED && interfaceC1441305kZ != null && this.LIZLLL.get(interfaceC1441305kZ) == null) {
            LiveState<T>.CallbackWithLifecycle callbackWithLifecycle = new CallbackWithLifecycle(lifecycleOwner, new AwS608S0100000_29(interfaceC1441305kZ, 17), Lifecycle.State.STARTED);
            this.LIZLLL.put(interfaceC1441305kZ, callbackWithLifecycle);
            this.LJ.put(callbackWithLifecycle, interfaceC1441305kZ);
            LJIIJJI(lifecycleOwner, callbackWithLifecycle);
        }
    }

    public final Function0<Unit> LJIIJJI(LifecycleOwner lifecycleOwner, LiveState<T>.CallbackWithLifecycle callbackWithLifecycle) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return AFwS218S0000000_29.get$arr$(19);
        }
        this.LIZJ.add(callbackWithLifecycle);
        callbackWithLifecycle.LIZ(this.LJII, LIZJ(), true);
        lifecycleOwner.getLifecycle().addObserver(callbackWithLifecycle);
        return new AwS430S0200000_29(this, callbackWithLifecycle, 3);
    }

    public final Function0<Unit> LJIIIZ(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function1<? super T, Unit> function1) {
        return LJIIJJI(lifecycleOwner, new CallbackWithLifecycle(lifecycleOwner, function1, state));
    }
}
