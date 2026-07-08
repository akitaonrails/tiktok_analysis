package X;

import X.C1869040yjm;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.journey.NewUserSignalService;
import com.ss.android.ugc.aweme.journey.events.NujPerformanceTrackerV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10P5, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10P5<T extends C1869040yjm> implements C10P7<T> {
    public final C1912470zrp LIZ;
    public final C10P6 LIZIZ;
    public Function1<? super C19240810Pe, Unit> LIZJ;
    public long LIZLLL;
    public final EnumC1284970jXj LJ = EnumC1284970jXj.EXTERNAL;

    @Override // X.C10P7
    public boolean LIZJ() {
        return !(this instanceof C1912530zrv);
    }

    public void LJ() {
        Function1<? super C19240810Pe, Unit> function1 = this.LIZJ;
        if (function1 != null) {
            function1.invoke(null);
        }
        this.LIZJ = null;
        if (LJFF() == EnumC1284970jXj.EXTERNAL) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZLLL;
            NewUserSignalService.LIZJ().LIZ(jElapsedRealtime, type().toString());
            boolean z = type() == C10NW.JOURNEY_AGE_GATE_ID || type() == C10NW.JOURNEY_LOGIN_ID;
            NujPerformanceTrackerV2 nujPerformanceTrackerV2 = NujPerformanceTrackerV2.LIZ;
            C0NJH c0njh = C0NJH.UX_DURATION;
            String desc = type().getDesc();
            nujPerformanceTrackerV2.getClass();
            NujPerformanceTrackerV2.LJFF(c0njh, desc, jElapsedRealtime, z);
        }
    }

    public EnumC1284970jXj LJFF() {
        return this.LJ;
    }

    public C10P5(C1912470zrp c1912470zrp, C10P6 c10p6) {
        this.LIZ = c1912470zrp;
        this.LIZIZ = c10p6;
    }

    @Override // X.C10P7
    public void LIZLLL(C1912470zrp c1912470zrp, T t, Function1<? super C19240810Pe, Unit> function1) {
        this.LIZJ = function1;
        if (LJFF() == EnumC1284970jXj.EXTERNAL) {
            this.LIZLLL = SystemClock.elapsedRealtime();
        }
    }
}
