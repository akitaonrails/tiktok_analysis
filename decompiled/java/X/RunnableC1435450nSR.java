package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0nSR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class RunnableC1435450nSR implements Runnable {
    public final ExecutorService LL;
    public final AbstractC1433570nPP LLILLJJLI;
    public final String LLILLL;
    public final C1434800nRO LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PcsCourseVideoPublishScheduler$PcsCoursePublishTask@ea2e.run");
        try {
            AbstractC489980JJk abstractC489980JJk = new AbstractC489980JJk() { // from class: X.0nSS
                @Override // X.AbstractC1433570nPP
                public final void onProgress(int i, Object obj) {
                    this.LIZ.LLILLJJLI.onProgress(i, obj);
                }

                @Override // X.AbstractC1433570nPP
                public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
                    this.LIZ.LLILLJJLI.onFinish(abstractC1433460nPE, obj, publishModel);
                    RunnableC1435450nSR runnableC1435450nSR = this.LIZ;
                    synchronized ("lock") {
                        try {
                            C1435410nSN c1435410nSN = C1435410nSN.LIZ;
                            C1435410nSN.LIZLLL = null;
                            if (!(abstractC1433460nPE instanceof C1433450nPD)) {
                                C1435410nSN.LIZIZ.remove(runnableC1435450nSR.LLILLL);
                            }
                            C1435410nSN.LIZLLL = C1435410nSN.LIZJ.poll();
                            if (C1435410nSN.LIZLLL != null) {
                                C1435410nSN.LJ.execute(C1435410nSN.LIZLLL);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // X.AbstractC1433570nPP
                public final void onStageUpdate(String str, AbstractC1433380nP6 abstractC1433380nP6, Object obj) {
                    this.LIZ.LLILLJJLI.onStageUpdate(str, abstractC1433380nP6, obj);
                }
            };
            C1435480nSU c1435480nSU = C1435480nSU.LIZ;
            EnumC1434950nRd enumC1434950nRd = EnumC1434950nRd.START_PUBLISH;
            C1435410nSN.LIZ.getClass();
            int size = C1435410nSN.LIZJ.size();
            c1435480nSU.getClass();
            C1435480nSU.LIZ(enumC1434950nRd, null, null, null, null, size);
            this.LLILZ.LJIIZILJ(abstractC489980JJk);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PcsCourseVideoPublishScheduler$PcsCoursePublishTask@ea2e.run");
    }

    public RunnableC1435450nSR(PublishModel publishModel, ExecutorService executorService, C0JHH c0jhh, String str) {
        this.LL = executorService;
        this.LLILLJJLI = c0jhh;
        this.LLILLL = str;
        this.LLILZ = new C1434800nRO(publishModel, new C1430790nKv(), executorService, str);
    }
}
