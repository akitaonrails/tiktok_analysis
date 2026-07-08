package X;

import Y.AComparatorS48S0000000_29;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11RB, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RB implements C11RH {
    public static final C2203208kA LIZJ = new InterfaceC1517990pbZ() { // from class: X.08kA
        @Override // X.InterfaceC1517990pbZ, X.InterfaceC1487280oo2
        public final Object apply(Object obj) {
            Lifecycle.Event event = (Lifecycle.Event) obj;
            int i = C2203108k9.LIZ[event.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Lifecycle.Event.ON_STOP;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Lifecycle has ended! Last event was ");
                        sbLIZ.append(event);
                        throw new C2203308kB(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return Lifecycle.Event.ON_PAUSE;
                }
                return Lifecycle.Event.ON_STOP;
            }
            return Lifecycle.Event.ON_DESTROY;
        }
    };
    public final InterfaceC1517990pbZ<Lifecycle.Event> LIZ;
    public final LifecycleEventsObservable LIZIZ;

    @Override // X.C11RH
    public final C11IV LIZ() throws Exception {
        final AComparatorS48S0000000_29 aComparatorS48S0000000_29;
        LifecycleEventsObservable lifecycleEventsObservable = this.LIZIZ;
        lifecycleEventsObservable.getClass();
        int i = C500090JjL.LIZ[lifecycleEventsObservable.LL.getCurrentState().ordinal()];
        lifecycleEventsObservable.LLILLJJLI.onNext(i != 1 ? i != 2 ? (i == 3 || i == 4) ? Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_DESTROY : Lifecycle.Event.ON_START : Lifecycle.Event.ON_CREATE);
        Lifecycle.Event eventLJLZ = this.LIZIZ.LLILLJJLI.LJLZ();
        InterfaceC1517990pbZ<Lifecycle.Event> interfaceC1517990pbZ = this.LIZ;
        if (eventLJLZ == null) {
            throw new C2203508kD();
        }
        try {
            final Lifecycle.Event eventApply = interfaceC1517990pbZ.apply(eventLJLZ);
            LifecycleEventsObservable lifecycleEventsObservable2 = this.LIZIZ;
            InterfaceC19483011Ki c19774912Yp = (!(eventApply instanceof Comparable) || (aComparatorS48S0000000_29 = C11RI.LIZ) == null) ? new C19774912Yp(eventApply, 5) : new InterfaceC19483011Ki() { // from class: X.11RG
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    if (aComparatorS48S0000000_29.compare(obj, eventApply) >= 0) {
                        return true;
                    }
                    return false;
                }
            };
            lifecycleEventsObservable2.getClass();
            return new C11IW(new C19484611Ky(new C19475811Ho(lifecycleEventsObservable2), c19774912Yp));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof C2203308kB) {
                throw e;
            }
            return AbstractC19486711Lt.LJIIJ(e);
        }
    }

    public static C11RB LIZIZ(LifecycleOwner lifecycleOwner) {
        return new C11RB(lifecycleOwner.getLifecycle(), LIZJ);
    }

    public C11RB(Lifecycle lifecycle, InterfaceC1517990pbZ<Lifecycle.Event> interfaceC1517990pbZ) {
        this.LIZIZ = new LifecycleEventsObservable(lifecycle);
        this.LIZ = interfaceC1517990pbZ;
    }

    public static C11RB LIZJ(LifecycleOwner lifecycleOwner, final Lifecycle.Event event) {
        return new C11RB(lifecycleOwner.getLifecycle(), new InterfaceC1517990pbZ<Lifecycle.Event>(event) { // from class: X.11RE
            public final Lifecycle.Event LL;

            {
                this.LL = event;
            }

            @Override // X.InterfaceC1517990pbZ, X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return this.LL;
            }
        });
    }
}
