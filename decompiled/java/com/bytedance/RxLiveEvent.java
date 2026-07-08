package com.bytedance;

import X.C01GW;
import X.C11JF;
import X.C11RK;
import X.C452501pT;
import X.C560530Lyd;
import X.C786410Ut5;
import X.InterfaceC1441305kZ;
import Y.ARunnableS94S0200000_25;
import Y.AfS194S0100000_25;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class RxLiveEvent<T> extends C560530Lyd<T> {
    public T LJIIIIZZ;
    public final C11RK<T> LJII = new C11RK<>();
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(73));

    @Override // com.bytedance.als.LiveEvent
    public final T LJI() {
        return this.LJIIIIZZ;
    }

    @Override // com.bytedance.als.LiveEvent, X.InterfaceC540980LJo
    public final void LIZIZ(InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        throw new RuntimeException("use lifecycleOwner instead");
    }

    @Override // com.bytedance.als.LiveEvent
    public final void LJIIIIZZ(InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        this.LJII.LJJLJLI(new AfS194S0100000_25(interfaceC1441305kZ, 1));
    }

    @Override // X.C560530Lyd
    public final void LJIIIZ(T t) {
        C786410Ut5.LJJZZIII((Handler) this.LJIIIZ.getValue(), new ARunnableS94S0200000_25(this, t, 0));
    }

    @Override // X.C560530Lyd
    public final void LJIIJ(T t) {
        if (t == null) {
            return;
        }
        this.LJIIIIZZ = t;
        this.LJII.onNext(t);
    }

    @Override // com.bytedance.als.LiveEvent, X.InterfaceC540980LJo
    public final void LIZ(LifecycleOwner lifecycleOwner, InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        if (lifecycleOwner == null || interfaceC1441305kZ == null || lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        final C11JF c11jf = (C11JF) this.LJII.LJJLJLI(new AfS194S0100000_25(interfaceC1441305kZ, 0));
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.RxLiveEvent$observe$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                c11jf.dispose();
            }
        });
    }
}
