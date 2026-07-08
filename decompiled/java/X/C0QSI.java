package X;

import X.C0QSJ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QSI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QSI<T> implements InterfaceC687730QyJ {
    public final Class<T> LIZ;
    public final List<Class<Object>> LIZIZ;
    public WeakReference<T> LIZJ;
    public boolean LIZLLL;
    public final List<Function1<T, Unit>> LJ = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public C0QSI(Class<T> cls, List<? extends Class<Object>> list) {
        this.LIZ = cls;
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC687730QyJ
    public final boolean LIZ(Object obj, Class cls) {
        if (Intrinsics.LJFF(cls, this.LIZ)) {
            this.LIZJ = new WeakReference<>(obj);
            Iterator it2 = ((ArrayList) this.LJ).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(obj);
            }
            ((ArrayList) this.LJ).clear();
            return true;
        }
        return false;
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, Function1<? super T, Unit> function1) {
        T t;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(lifecycleOwner);
        if (!C1562540qlQ.LIZLLL) {
            if (!this.LIZLLL) {
                this.LIZLLL = true;
                WeakReference<T> weakReference = this.LIZJ;
                if (weakReference == null || weakReference.get() == null) {
                    Class[] clsArr = (Class[]) this.LIZIZ.toArray(new Class[0]);
                    final C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJIIIZ, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    if (c0qsjLIZJ != null) {
                        Object ability = c0qsjLIZJ.getAbility(this.LIZ);
                        if (ability == null) {
                            if (c0qsjLIZJ != null) {
                                c0qsjLIZJ.registerAbilityLoadListener(this);
                            }
                            lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: tiktok.communication.LazyAbility$initOnline$1
                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                    C0QSJ c0qsj;
                                    if (event == Lifecycle.Event.ON_DESTROY && (c0qsj = c0qsjLIZJ) != null) {
                                        c0qsj.unregisterAbilityLoadListener(this);
                                    }
                                }
                            });
                        } else {
                            this.LIZJ = new WeakReference<>(ability);
                        }
                    } else {
                        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: tiktok.communication.LazyAbility$initOnline$1
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                C0QSJ c0qsj;
                                if (event == Lifecycle.Event.ON_DESTROY && (c0qsj = c0qsjLIZJ) != null) {
                                    c0qsj.unregisterAbilityLoadListener(this);
                                }
                            }
                        });
                    }
                }
            }
        } else if (!this.LIZLLL) {
            this.LIZLLL = true;
            WeakReference<T> weakReference2 = this.LIZJ;
            if (weakReference2 == null || weakReference2.get() == null) {
                Iterator<Class<Object>> it2 = this.LIZIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    final C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(interfaceC665370Q7zLJIIIZ, it2.next());
                    if (c0qsjLIZJ2 != null) {
                        Object ability2 = c0qsjLIZJ2.getAbility(this.LIZ);
                        if (ability2 == null) {
                            if (c0qsjLIZJ2 != null) {
                                c0qsjLIZJ2.registerAbilityLoadListener(this);
                            }
                        } else {
                            this.LIZJ = new WeakReference<>(ability2);
                            break;
                        }
                    }
                    lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: tiktok.communication.LazyAbility$init$1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                            C0QSJ c0qsj;
                            if (event == Lifecycle.Event.ON_DESTROY && (c0qsj = c0qsjLIZJ2) != null) {
                                c0qsj.unregisterAbilityLoadListener(this);
                            }
                        }
                    });
                }
            }
        }
        WeakReference<T> weakReference3 = this.LIZJ;
        if (weakReference3 != null && (t = weakReference3.get()) != null) {
            function1.invoke(t);
        } else {
            ((ArrayList) this.LJ).add(function1);
        }
    }
}
