package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874160YRa {
    public final C0YH7 LIZ;
    public final C0YHF LIZIZ;
    public final ConcurrentLinkedQueue<AbstractRunnableC874200YRe<?, ?, ?>> LIZJ = new ConcurrentLinkedQueue<>();
    public final ConcurrentLinkedQueue<AbstractRunnableC874200YRe<?, ?, ?>> LIZLLL = new ConcurrentLinkedQueue<>();
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 22));
    public volatile ExecutorService LJFF;

    public final int LIZ() {
        return ((Number) this.LJ.getValue()).intValue();
    }

    public final ExecutorService LIZIZ() {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create Thread Pool: thread count = ");
        sbLIZ.append(LIZ());
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMMediaUploadScheduler", C2188811AlT.LIZIZ(sbLIZ), 4);
        C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
        c2123408To.LIZJ = LIZ();
        c2123408To.LIZIZ = "im_media_plugin_upload_thread_pool";
        return C823050WQl.LIZ(new C2123508Tp(c2123408To));
    }

    public final void LIZJ() {
        AbstractRunnableC874200YRe<?, ?, ?> abstractRunnableC874200YRePoll;
        ExecutorService executorServiceLIZIZ;
        if (this.LIZJ.size() == 0 && this.LIZLLL.size() == 0) {
            this.LIZ.LIZLLL().LJIIIIZZ("IMMediaUploadScheduler", "queue are empty", null);
            return;
        }
        if (this.LIZJ.size() >= LIZ() || (abstractRunnableC874200YRePoll = this.LIZLLL.poll()) == null) {
            return;
        }
        this.LIZJ.add(abstractRunnableC874200YRePoll);
        synchronized (this) {
            try {
                executorServiceLIZIZ = this.LJFF;
                if (executorServiceLIZIZ == null) {
                    executorServiceLIZIZ = LIZIZ();
                    this.LJFF = executorServiceLIZIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        executorServiceLIZIZ.submit(abstractRunnableC874200YRePoll);
        Function2<String, Integer, Unit> function2 = abstractRunnableC874200YRePoll.LL.LIZ().LIZ;
        if (function2 != null) {
            function2.invoke(abstractRunnableC874200YRePoll.LL.LIZIZ(), Integer.valueOf(this.LIZJ.size()));
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submit wait ");
        sbLIZ.append(abstractRunnableC874200YRePoll);
        c868780Y6iLIZLLL.LJIIIIZZ("IMMediaUploadScheduler", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public C874160YRa(C0YH7 c0yh7, C0YHF c0yhf) {
        this.LIZ = c0yh7;
        this.LIZIZ = c0yhf;
    }
}
