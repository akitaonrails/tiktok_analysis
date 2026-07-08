package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09c3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2407709c3 implements Runnable {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C2408009c6 LLILZLL;

    public final void LIZ() {
        boolean zH1 = C2407909c5.LIZJ.h1();
        if (!this.LL && !zH1) {
            C2223208nO.LIZ("LocalMemDump", "no leak find");
            setResultData("fail as no leak find");
        } else if (this.LLILLJJLI) {
            new BPEAThread() { // from class: X.09c4
                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("LocalDumpHelper@6424.register$1$onReceive$1$1");
                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                    try {
                        bpea_origin_run();
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("LocalDumpHelper@6424.register$1$onReceive$1$1");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        throw th;
                    }
                }

                public final void bpea_origin_run() {
                    try {
                        super.run();
                        C2223208nO.LIZ("LocalMemDump", "dumpHprof And Report in sub thread");
                        RunnableC2407709c3 runnableC2407709c3 = this.LL;
                        C2405709bj.LIZ(new C2406409bq(true, runnableC2407709c3.LLILLL), runnableC2407709c3.LLILZ, runnableC2407709c3.LLILZIL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }

                {
                    super("manual-dump");
                }
            }.start();
        } else {
            C2223208nO.LIZ("LocalMemDump", "dumpHprof And Report in main thread");
            C2405709bj.LIZ(new C2406409bq(true, this.LLILLL), this.LLILZ, this.LLILZIL);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LocalDumpHelper@6424.register$1$onReceive$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocalDumpHelper@6424.register$1$onReceive$1");
    }

    public RunnableC2407709c3(C2408009c6 c2408009c6, boolean z, boolean z2, int i, boolean z3, String str) {
        this.LLILZLL = c2408009c6;
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = i;
        this.LLILZ = z3;
        this.LLILZIL = str;
    }
}
