package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.component.idlepreload.eventrack.CommerceIdlePreloadEventTracker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001510cAX implements Comparable<C1001510cAX> {
    public final C1001420cAO LL;
    public final Function1<EnumC1001490cAV, Integer> LLILLJJLI;
    public int LLILLL;
    public final long LLILZ = System.currentTimeMillis();
    public long LLILZIL;
    public final CommerceIdlePreloadEventTracker LLILZLL;

    public final void LIZJ(EnumC1001490cAV enumC1001490cAV) {
        int iIntValue = this.LLILLJJLI.invoke(enumC1001490cAV).intValue();
        this.LLILZIL = System.currentTimeMillis() - this.LLILZ;
        CommerceIdlePreloadEventTracker commerceIdlePreloadEventTracker = this.LLILZLL;
        C1001790cAz.LIZ.getClass();
        commerceIdlePreloadEventTracker.log(C1001790cAz.LIZJ, new AwS124S0101000_16(this, iIntValue, 18));
    }

    public final void LJFF(boolean z) {
        Object c098200Yq;
        EnumC1001490cAV enumC1001490cAV;
        Object c098200Yq2;
        C1001520cAY c1001520cAY;
        LJI(EnumC1001490cAV.RUNNING);
        if (this.LL instanceof C1001520cAY) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                C1001420cAO c1001420cAO = this.LL;
                c098200Yq2 = null;
                if ((c1001420cAO instanceof C1001520cAY) && (c1001520cAY = (C1001520cAY) c1001420cAO) != null) {
                    new AwS595S0100000_16(c1001520cAY, 197).invoke(new InterfaceC1001530cAZ() { // from class: X.0cAW
                        @Override // X.InterfaceC1001530cAZ
                        public final void LIZ() {
                            this.LJI(EnumC1001490cAV.FAILED);
                        }

                        @Override // X.InterfaceC1001530cAZ
                        public final void LIZIZ() {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("task run duration = ");
                            sbLIZ.append(jCurrentTimeMillis2);
                            C2188811AlT.LIZIZ(sbLIZ);
                            this.LJI(EnumC1001490cAV.COMPLETED);
                        }
                    });
                    c098200Yq2 = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl != null) {
                if (thM5exceptionOrNullimpl instanceof CancellationException) {
                    LJI(EnumC1001490cAV.CANCELLED);
                    return;
                } else {
                    LJI(EnumC1001490cAV.FAILED);
                    return;
                }
            }
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        try {
            this.LL.getClass();
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("task run duration = ");
            sbLIZ.append(jCurrentTimeMillis3);
            C2188811AlT.LIZIZ(sbLIZ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            if (z) {
                enumC1001490cAV = EnumC1001490cAV.FORCE_RUN_COMPLETED;
            } else {
                enumC1001490cAV = EnumC1001490cAV.COMPLETED;
            }
            LJI(enumC1001490cAV);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl2 != null) {
            if (thM5exceptionOrNullimpl2 instanceof CancellationException) {
                LJI(EnumC1001490cAV.CANCELLED);
            } else {
                LJI(EnumC1001490cAV.FAILED);
            }
        }
    }

    public final void LJI(EnumC1001490cAV enumC1001490cAV) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateState ");
        sbLIZ.append(this.LL.LJFF);
        sbLIZ.append(" to ");
        sbLIZ.append(enumC1001490cAV);
        C2188811AlT.LIZIZ(sbLIZ);
        C1001420cAO c1001420cAO = this.LL;
        if (enumC1001490cAV == c1001420cAO.LJFF) {
            return;
        }
        c1001420cAO.LJFF = enumC1001490cAV;
        int i = C1001460cAS.LIZ[enumC1001490cAV.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return;
            }
            LIZJ(enumC1001490cAV);
            return;
        }
        LIZJ(enumC1001490cAV);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1001510cAX c1001510cAX) {
        return Intrinsics.LJI(this.LL.LIZLLL.getPriority(), c1001510cAX.LL.LIZLLL.getPriority());
    }

    public C1001510cAX(C1001420cAO c1001420cAO, AwS588S0100000_9 awS588S0100000_9) {
        this.LL = c1001420cAO;
        this.LLILLJJLI = awS588S0100000_9;
        CommerceIdlePreloadEventTracker commerceIdlePreloadEventTracker = new CommerceIdlePreloadEventTracker(new Object[]{c1001420cAO});
        this.LLILZLL = commerceIdlePreloadEventTracker;
        LJI(EnumC1001490cAV.PENDING);
        C1001790cAz.LIZ.getClass();
        commerceIdlePreloadEventTracker.log(C1001790cAz.LIZIZ);
    }
}
