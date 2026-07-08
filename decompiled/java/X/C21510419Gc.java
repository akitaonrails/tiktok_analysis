package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19Gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21510419Gc implements InterfaceC2214261BlQ {
    public static C21510419Gc LJFF;
    public WeakReference<AbstractC1387200mCc> LIZ;
    public WeakReference<AbstractC1387200mCc> LIZIZ;
    public long LIZLLL;
    public final ConcurrentHashMap<String, C21510619Ge> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, WeakReference<AbstractC1387200mCc>> LJ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC2214261BlQ
    public final void LIZLLL(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJFF(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJI(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJII(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIIIIZZ(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIIIZ(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIIJJI(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIILIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIILJJIL(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIILL(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIILLIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIJI(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIJJ(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIJJLI(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIL(AbstractC1387200mCc abstractC1387200mCc) {
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJJ(AbstractC1387200mCc abstractC1387200mCc) {
    }

    public static C21510919Gh LIZ(AbstractC1387200mCc abstractC1387200mCc) {
        String strLIZLLL;
        String name;
        if (abstractC1387200mCc instanceof C1397950mTx) {
            Activity activity = ((C1397950mTx) abstractC1387200mCc).LIZLLL;
            Intent intent = activity.getIntent();
            if (intent != null) {
                try {
                    name = intent.getStringExtra("POWER_FRAGMENT_CLASS_NAME");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (name == null) {
                    name = activity.getClass().getName();
                }
            } else {
                name = activity.getClass().getName();
            }
            return new C21510919Gh("Activity", name, activity.getClass().getName());
        }
        String str = "";
        if (abstractC1387200mCc instanceof C1844400y62) {
            F f = ((C1844400y62) abstractC1387200mCc).LIZLLL;
            C19EG activity2 = f.getActivity();
            if (activity2 != null && (strLIZLLL = C13LE.LIZ(activity2.getClass()).LIZLLL()) != null) {
                str = strLIZLLL;
            }
            return new C21510919Gh("SAFFragment", f.getClass().getName(), str);
        }
        return new C21510919Gh("Unknown", abstractC1387200mCc.LIZ.getClass().getName(), "");
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
        this.LIZLLL = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LIZJ(AbstractC1387200mCc abstractC1387200mCc) {
        AbstractC1387200mCc abstractC1387200mCc2;
        final C21510919Gh c21510919GhLIZ;
        final long j;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            final C21510919Gh c21510919GhLIZ2 = LIZ(abstractC1387200mCc);
            this.LIZIZ = this.LIZ;
            this.LIZ = new WeakReference<>(abstractC1387200mCc);
            final C21510619Ge c21510619Ge = this.LIZJ.get(c21510919GhLIZ2.LIZIZ);
            if (c21510619Ge == null) {
                return;
            }
            WeakReference<AbstractC1387200mCc> weakReference = this.LIZIZ;
            if (weakReference != null && (abstractC1387200mCc2 = weakReference.get()) != null && (c21510919GhLIZ = LIZ(abstractC1387200mCc2)) != null && !Intrinsics.LJFF(c21510919GhLIZ.LIZIZ, c21510919GhLIZ2.LIZIZ)) {
                final long j2 = jElapsedRealtime - c21510619Ge.LIZ;
                long j3 = this.LIZLLL;
                if (j3 > 0) {
                    j = jElapsedRealtime - j3;
                } else {
                    j = j2;
                }
                C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.19Gd
                    public final void LIZ() {
                        Lifecycle lifecycle;
                        Lifecycle.State currentState;
                        C21510419Gc c21510419Gc = this.LL;
                        C21510919Gh c21510919Gh = c21510919GhLIZ;
                        C21510919Gh c21510919Gh2 = c21510919GhLIZ2;
                        C21510619Ge c21510619Ge2 = c21510619Ge;
                        long j4 = j2;
                        long j5 = j;
                        c21510419Gc.getClass();
                        Runtime runtime = Runtime.getRuntime();
                        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
                        long j6 = 1024;
                        long j7 = (jFreeMemory / j6) / j6;
                        Iterator<Map.Entry<String, WeakReference<AbstractC1387200mCc>>> it2 = c21510419Gc.LJ.entrySet().iterator();
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        int i6 = 0;
                        while (it2.hasNext()) {
                            AbstractC1387200mCc abstractC1387200mCc3 = it2.next().getValue().get();
                            if (abstractC1387200mCc3 == null) {
                                it2.remove();
                            } else {
                                i++;
                                if (abstractC1387200mCc3 instanceof C1397950mTx) {
                                    i2++;
                                } else if (abstractC1387200mCc3 instanceof C1844400y62) {
                                    i3++;
                                }
                                LifecycleOwner lifecycleOwnerLJFF = abstractC1387200mCc3.LJFF();
                                if (lifecycleOwnerLJFF != null && (lifecycle = lifecycleOwnerLJFF.getLifecycle()) != null && (currentState = lifecycle.getCurrentState()) != null) {
                                    int i7 = C19467311Eh.LIZ[currentState.ordinal()];
                                    if (i7 == 1) {
                                        i4++;
                                    } else if (i7 == 2) {
                                        i5++;
                                    } else if (i7 == 3) {
                                        i6++;
                                    }
                                }
                            }
                        }
                        C21510819Gg c21510819Gg = new C21510819Gg(i, i2, i3, i4, i5, i6);
                        c21510419Gc.LIZJ.remove(c21510919Gh2.LIZIZ);
                        C725430Scv.LIZIZ(C1561990qkX.LIZ, new C21510719Gf(c21510919Gh, c21510919Gh2, c21510619Ge2, j7, j4, j5, c21510819Gg));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PageNavigationTracker@775c.onPageResumed$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PageNavigationTracker@775c.onPageResumed$1");
                    }
                });
                return;
            }
            this.LIZJ.remove(c21510919GhLIZ2.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJ(AbstractC1387200mCc abstractC1387200mCc) {
        AbstractC1387200mCc abstractC1387200mCc2;
        AbstractC1387200mCc abstractC1387200mCc3;
        try {
            C21510919Gh c21510919GhLIZ = LIZ(abstractC1387200mCc);
            this.LIZJ.remove(c21510919GhLIZ.LIZIZ);
            WeakReference<AbstractC1387200mCc> weakReference = this.LIZ;
            if (weakReference != null) {
                abstractC1387200mCc2 = weakReference.get();
            } else {
                abstractC1387200mCc2 = null;
            }
            if (Intrinsics.LJFF(abstractC1387200mCc2, abstractC1387200mCc)) {
                this.LIZ = null;
            }
            WeakReference<AbstractC1387200mCc> weakReference2 = this.LIZIZ;
            if (weakReference2 != null) {
                abstractC1387200mCc3 = weakReference2.get();
            } else {
                abstractC1387200mCc3 = null;
            }
            if (Intrinsics.LJFF(abstractC1387200mCc3, abstractC1387200mCc)) {
                this.LIZIZ = null;
            }
            this.LJ.remove(c21510919GhLIZ.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
        LJJI(abstractC1387200mCc, bundle);
    }

    @Override // X.InterfaceC2214261BlQ
    public final void LJIIZILJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
        LJJI(abstractC1387200mCc, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(X.AbstractC1387200mCc r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21510419Gc.LJJI(X.0mCc, android.os.Bundle):void");
    }
}
