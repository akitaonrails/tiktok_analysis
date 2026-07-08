package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440610nal {
    public final long LIZ;
    public final int LIZIZ;
    public Function0<Unit> LIZJ;
    public Function0<Boolean> LIZLLL;
    public volatile boolean LJ;
    public final C01GW LJFF;
    public long LJI;
    public final C01GW LJII;
    public long LJIIIIZZ;

    public C1440610nal() {
        this(0);
    }

    public final void LIZIZ() {
        if (this.LJ) {
            this.LJ = false;
            try {
                C189200o6.m2constructorimpl(Boolean.valueOf(((HandlerThread) this.LJFF.getValue()).quit()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LIZJ.invoke();
            C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishHeartbeatManager", "stop(" + System.currentTimeMillis() + ')');
        }
    }

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ping(");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(')');
        C201955140j.LIZLLL(C830690WiJ.LIZIZ, "PublishHeartbeatManager", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLJJI(3, this.LIZ, (Handler) this.LJII.getValue());
    }

    public /* synthetic */ C1440610nal(int i) {
        this(10000L, 30000);
    }

    public C1440610nal(long j, int i) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = AFwS210S0000000_22.get$arr$(426);
        this.LIZLLL = AFwS210S0000000_22.get$arr$(425);
        this.LJFF = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(427));
        this.LJI = -1L;
        this.LJII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 987));
    }
}
