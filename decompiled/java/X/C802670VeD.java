package X;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.0VeD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802670VeD extends BPEAThread {
    public final LinkedBlockingQueue<Long> LL;
    public final /* synthetic */ C802620Ve8 LLILLJJLI;

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("AnrInfoMonitor$LightAnrInfoGetThread@1c3b.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        while (true) {
            try {
                Long lTake = this.LL.take();
                if (lTake != null) {
                    LIZJ(lTake.longValue());
                } else {
                    System.out.println("get_anr_info_start_time_null");
                }
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                } catch (Throwable th2) {
                    try {
                        TryCatchGuardChecker.doCheck(th2);
                        if (!C2179971ATj.LIZ(th2)) {
                            throw th2;
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("AnrInfoMonitor$LightAnrInfoGetThread@1c3b.run");
                        return;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C802670VeD(C802620Ve8 c802620Ve8) {
        super("FetchingAnrInfo");
        this.LLILLJJLI = c802620Ve8;
        this.LL = new LinkedBlockingQueue<>();
    }

    public final void LIZJ(long j) {
        try {
            PrintStream printStream = System.out;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get_anr_info_start_");
            sbLIZ.append(j);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            String strLIZ = C802700VeG.LIZ(this.LLILLJJLI.LIZJ);
            if (TextUtils.isEmpty(strLIZ)) {
                System.out.println("get_anr_info_is_empty");
                strLIZ = "silent anr no anr info";
            }
            C0VSJ c0vsj = new C0VSJ(this.LLILLJJLI.LIZLLL, C802620Ve8.LIZIZ(Process.myPid(), j, true));
            C2112008Pe.LJII(c0vsj, strLIZ);
            C802430Vdp.LIZIZ(c0vsj, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0VSJ c0vsj2 = new C0VSJ(this.LLILLJJLI.LIZLLL, C802620Ve8.LIZIZ(Process.myPid(), j, true));
            C2112008Pe.LJII(c0vsj2, "silent anr no anr info");
            C802430Vdp.LIZIZ(c0vsj2, j);
        }
    }
}
