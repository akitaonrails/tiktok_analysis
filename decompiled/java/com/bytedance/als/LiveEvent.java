package com.bytedance.als;

import X.C0WIY;
import X.InterfaceC1441305kZ;
import X.InterfaceC540980LJo;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes30.dex */
public class LiveEvent<T> implements InterfaceC540980LJo<T> {
    public LiveEvent<T>.ActiveAwareLiveData LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final Set<InterfaceC1441305kZ<T>> LJ = new HashSet();
    public final List<C0WIY<InterfaceC1441305kZ<T>, LifecycleOwner>> LJFF = new ArrayList();
    public Map<InterfaceC1441305kZ<T>, LiveEvent<T>.LifecycleBoundObserver> LJI = null;

    public final void LJFF() {
        this.LIZIZ = true;
        LiveEvent<T>.ActiveAwareLiveData activeAwareLiveData = this.LIZ;
        if (activeAwareLiveData == null) {
            this.LIZ = new ActiveAwareLiveData();
        } else if (activeAwareLiveData.getValue() != null) {
            Iterator it2 = ((ArrayList) this.LJFF).iterator();
            while (it2.hasNext()) {
                this.LIZ.removeObserver((Observer) ((C0WIY) it2.next()).LIZ);
            }
            this.LIZ = new ActiveAwareLiveData();
            for (C0WIY c0wiy : (ArrayList) this.LJFF) {
                S s = c0wiy.LIZIZ;
                if (s != 0) {
                    this.LIZ.observe((LifecycleOwner) s, (Observer) c0wiy.LIZ);
                } else {
                    this.LIZ.observeForever((Observer) c0wiy.LIZ);
                }
            }
        }
        this.LIZIZ = false;
    }

    public class ActiveAwareLiveData extends MutableLiveData<T> {
        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            super.onActive();
            LiveEvent.this.LIZLLL();
        }

        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            LiveEvent.this.LJ();
        }

        public ActiveAwareLiveData() {
        }
    }

    public final void LIZLLL() {
        Map<InterfaceC1441305kZ<T>, LiveEvent<T>.LifecycleBoundObserver> map = this.LJI;
        boolean z = map == null || map.isEmpty() || this.LIZJ > 0;
        if (this.LIZLLL || this.LIZIZ || !z) {
            return;
        }
        this.LIZLLL = true;
    }

    public final void LJ() {
        boolean z = this.LIZJ == 0;
        if (this.LIZLLL && !this.LIZIZ && z) {
            this.LIZLLL = false;
        }
    }

    public T LJI() {
        LiveEvent<T>.ActiveAwareLiveData activeAwareLiveData = this.LIZ;
        if (activeAwareLiveData != null) {
            return activeAwareLiveData.getValue();
        }
        return null;
    }

    public class LifecycleBoundObserver implements LifecycleEventObserver, InterfaceC1441305kZ<T> {
        public final LifecycleOwner LL;
        public final Lifecycle.State LLILLJJLI;
        public final InterfaceC1441305kZ<T> LLILLL;
        public boolean LLILZ;
        public boolean LLILZIL;
        public final LinkedList<T> LLILZLL;

        public LifecycleBoundObserver() {
            throw null;
        }

        public final void LIZ(boolean z) {
            if (this.LLILZIL == z) {
                return;
            }
            this.LLILZIL = z;
            if (z) {
                LiveEvent.this.LIZJ++;
            } else {
                LiveEvent liveEvent = LiveEvent.this;
                liveEvent.LIZJ--;
            }
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(T t) {
            if (this.LL.getLifecycle().getCurrentState().isAtLeast(this.LLILLJJLI)) {
                this.LLILLL.onChanged(t);
            } else {
                this.LLILZ = true;
                this.LLILZLL.offer(t);
            }
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (this.LL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                LiveEvent.this.LIZIZ(this.LLILLL);
                this.LLILZ = false;
                this.LLILZLL.clear();
                LiveEvent.this.LJ();
                return;
            }
            if (this.LL.getLifecycle().getCurrentState().isAtLeast(this.LLILLJJLI)) {
                LIZ(true);
                LiveEvent.this.LIZLLL();
                if (this.LLILZ) {
                    Iterator<T> it2 = this.LLILZLL.iterator();
                    while (it2.hasNext()) {
                        this.LLILLL.onChanged(it2.next());
                        it2.remove();
                    }
                    this.LLILZ = false;
                    return;
                }
                return;
            }
            LIZ(false);
            LiveEvent.this.LJ();
        }

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC1441305kZ interfaceC1441305kZ) {
            this.LLILZLL = new LinkedList<>();
            this.LLILLL = interfaceC1441305kZ;
            this.LLILLJJLI = state;
            this.LL = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    @Override // X.InterfaceC540980LJo
    public void LIZIZ(InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        LiveEvent<T>.ActiveAwareLiveData activeAwareLiveData;
        if (interfaceC1441305kZ != null && (activeAwareLiveData = this.LIZ) != null) {
            Map<InterfaceC1441305kZ<T>, LiveEvent<T>.LifecycleBoundObserver> map = this.LJI;
            if (map != null) {
                LiveEvent<T>.LifecycleBoundObserver lifecycleBoundObserverRemove = map.remove(interfaceC1441305kZ);
                if (lifecycleBoundObserverRemove != null) {
                    lifecycleBoundObserverRemove.LL.getLifecycle().removeObserver(lifecycleBoundObserverRemove);
                    lifecycleBoundObserverRemove.LIZ(false);
                    this.LIZ.removeObserver(lifecycleBoundObserverRemove);
                    LIZJ(lifecycleBoundObserverRemove);
                    return;
                }
                this.LIZ.removeObserver(interfaceC1441305kZ);
                LIZJ(interfaceC1441305kZ);
                return;
            }
            activeAwareLiveData.removeObserver(interfaceC1441305kZ);
            LIZJ(interfaceC1441305kZ);
        }
    }

    public final void LIZJ(InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        ((HashSet) this.LJ).remove(interfaceC1441305kZ);
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((C0WIY) it2.next()).LIZ == interfaceC1441305kZ) {
                it2.remove();
                break;
            }
        }
        LiveEvent<T>.ActiveAwareLiveData activeAwareLiveData = this.LIZ;
        if (activeAwareLiveData != null && !activeAwareLiveData.hasObservers()) {
            this.LIZ = null;
        }
    }

    public void LJIIIIZZ(InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        Map<InterfaceC1441305kZ<T>, LiveEvent<T>.LifecycleBoundObserver> map = this.LJI;
        if (map != null && map.containsKey(interfaceC1441305kZ)) {
            throw new IllegalArgumentException("Can't add the same observer twice");
        }
        if (!((HashSet) this.LJ).contains(interfaceC1441305kZ)) {
            ((HashSet) this.LJ).add(interfaceC1441305kZ);
            LJFF();
            ((ArrayList) this.LJFF).add(new C0WIY(interfaceC1441305kZ, null));
            this.LIZ.observeForever(interfaceC1441305kZ);
            return;
        }
        throw new IllegalArgumentException("Can't add the same observer twice");
    }

    @Override // X.InterfaceC540980LJo
    public void LIZ(LifecycleOwner lifecycleOwner, final InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        if (lifecycleOwner != null && interfaceC1441305kZ != null && lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            Map<InterfaceC1441305kZ<T>, LiveEvent<T>.LifecycleBoundObserver> map = this.LJI;
            if (map != null && map.containsKey(interfaceC1441305kZ)) {
                throw new IllegalArgumentException("Can't add the same observer twice");
            }
            if (!((HashSet) this.LJ).contains(interfaceC1441305kZ)) {
                ((HashSet) this.LJ).add(interfaceC1441305kZ);
                LJFF();
                ((ArrayList) this.LJFF).add(new C0WIY(interfaceC1441305kZ, lifecycleOwner));
                this.LIZ.observe(lifecycleOwner, interfaceC1441305kZ);
                lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.als.LiveEvent.1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public void onDestroy() {
                        LiveEvent.this.LIZJ(interfaceC1441305kZ);
                    }
                });
                return;
            }
            throw new IllegalArgumentException("Can't add the same observer twice");
        }
    }

    public final void LJII(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC1441305kZ<T> interfaceC1441305kZ) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (!((HashSet) this.LJ).contains(interfaceC1441305kZ)) {
            Map<InterfaceC1441305kZ<T>, LiveEvent<T>.LifecycleBoundObserver> map = this.LJI;
            if (map != null && ((HashMap) map).containsKey(interfaceC1441305kZ)) {
                throw new IllegalArgumentException("Can't add the same observer twice");
            }
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, state, interfaceC1441305kZ);
            if (this.LJI == null) {
                this.LJI = new HashMap();
            }
            ((HashMap) this.LJI).put(interfaceC1441305kZ, lifecycleBoundObserver);
            LJIIIIZZ(lifecycleBoundObserver);
            return;
        }
        throw new IllegalArgumentException("Can't add the same observer twice");
    }
}
