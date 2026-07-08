package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.composer.task.DownloadVideoTask$runInternal$2", f = "DownloadVideoTask.kt", l = {163}, m = "invokeSuspend")
public final class C567260MMq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C567180MMi>, Object> {
    public ForwardMediaDownloader LL;
    public int LLILLJJLI;
    public final /* synthetic */ C567250MMp LLILLL;
    public final /* synthetic */ C567230MMn LLILZ;
    public final /* synthetic */ ForwardMediaDownloader LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567260MMq(C567250MMp c567250MMp, C567230MMn c567230MMn, ForwardMediaDownloader forwardMediaDownloader, InterfaceC1364105Vn<? super C567260MMq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c567250MMp;
        this.LLILZ = c567230MMn;
        this.LLILZIL = forwardMediaDownloader;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567260MMq(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C567180MMi> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("DownloadVideoTask@71b9.runInternal$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C534580Kxs c534580Kxs = C534580Kxs.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Executing download on IO dispatcher, current thread: ");
            sbLIZ.append(C786410Ut5.u3().getName());
            C201955140j.LIZLLL(c534580Kxs, "DownloadVideoTask", C2188811AlT.LIZIZ(sbLIZ));
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "download_high_priority_thread_optimization", true, false)) {
                C201955140j.LIZLLL(c534580Kxs, "DownloadVideoTask", "AB test enabled - attempting to set high thread priority");
                try {
                    Thread threadU3 = C786410Ut5.u3();
                    int priority = threadU3.getPriority();
                    C201955140j.LIZLLL(c534580Kxs, "DownloadVideoTask", "Setting Android process priority to URGENT_DISPLAY (-8)");
                    Process.setThreadPriority(-8);
                    C201955140j.LIZLLL(c534580Kxs, "DownloadVideoTask", "Setting Java thread priority to MAX_PRIORITY (10)");
                    ThreadMethodProxy.setPriority(threadU3, 10);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Thread priority successfully updated - Original: ");
                    sbLIZ2.append(priority);
                    sbLIZ2.append(", New: ");
                    sbLIZ2.append(threadU3.getPriority());
                    C201955140j.LIZLLL(c534580Kxs, "DownloadVideoTask", C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C534580Kxs c534580Kxs2 = C534580Kxs.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Failed to set thread priority: ");
                    sbLIZ3.append(e.getMessage());
                    C201955140j.LJIIIZ(c534580Kxs2, "DownloadVideoTask", C2188811AlT.LIZIZ(sbLIZ3), e);
                }
            } else {
                C201955140j.LIZLLL(c534580Kxs, "DownloadVideoTask", "AB test not enabled - using default thread priority");
            }
            C534580Kxs c534580Kxs3 = C534580Kxs.LIZIZ;
            C201955140j.LIZLLL(c534580Kxs3, "DownloadVideoTask", "Starting suspendCoroutine for download operation");
            final C567250MMp c567250MMp = this.LLILLL;
            C567230MMn c567230MMn = this.LLILZ;
            ForwardMediaDownloader forwardMediaDownloader = this.LLILZIL;
            this.LL = forwardMediaDownloader;
            this.LLILLJJLI = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            c567250MMp.getClass();
            ForwardMediaDownloader.DownloadListener downloadListener = new ForwardMediaDownloader.DownloadListener() { // from class: X.0MMs
                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                public final void onFileHeaderInfoReady(boolean z2) {
                }

                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                public final void onSuccess(String str) {
                    C2243608qg.LIZ(new C567180MMi(str, null), c23260099m);
                }

                @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader.DownloadListener
                public final void onError(int i2, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult) {
                    c567250MMp.getClass();
                    CancellationException cancellationExceptionLIZJ = C567250MMp.LIZJ(i2, str);
                    C2243608qg.LIZ(new C567180MMi("", cancellationExceptionLIZJ), c23260099m);
                }
            };
            ForwardMediaDownloader.DownloadConfig downloadConfig = c567230MMn.LIZIZ;
            if (downloadConfig.useStreamingEntry) {
                C201955140j.LIZLLL(c534580Kxs3, "DownloadVideoTask", "Performing partial download (streaming entry)");
                ForwardVideo forwardVideo = c567230MMn.LIZ;
                ForwardMediaDownloader.DownloadConfig downloadConfig2 = c567230MMn.LIZIZ;
                forwardMediaDownloader.partialDownload(forwardVideo, downloadConfig2, null, false, downloadListener, downloadConfig2.minDurationMs);
            } else {
                if (downloadConfig.minDurationMs != -1) {
                    z = false;
                }
                if (z) {
                    C201955140j.LIZLLL(c534580Kxs3, "DownloadVideoTask", "Performing full download");
                    forwardMediaDownloader.download(c567230MMn.LIZ, c567230MMn.LIZIZ, null, false, downloadListener);
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Performing partial download with min duration: ");
                    sbLIZ4.append(downloadConfig.minDurationMs);
                    sbLIZ4.append("ms");
                    C201955140j.LIZLLL(c534580Kxs3, "DownloadVideoTask", C2188811AlT.LIZIZ(sbLIZ4));
                    ForwardVideo forwardVideo2 = c567230MMn.LIZ;
                    ForwardMediaDownloader.DownloadConfig downloadConfig3 = c567230MMn.LIZIZ;
                    forwardMediaDownloader.partialDownload(forwardVideo2, downloadConfig3, null, false, downloadListener, downloadConfig3.minDurationMs);
                }
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DownloadVideoTask@71b9.runInternal$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DownloadVideoTask@71b9.runInternal$2");
        return objLIZ;
    }
}
