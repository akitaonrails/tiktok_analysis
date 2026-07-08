package X;

import android.content.Intent;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;

/* JADX INFO: renamed from: X.0j7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1268520j7C implements Runnable {
    public int LL;
    public Intent LLILLJJLI;
    public C1269510j8n LLILLL;
    public final /* synthetic */ LiveStreamVideoCapture LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveStreamVideoCapture$SwitchCaptureRunnable@a575.run");
        try {
            C1269500j8m.LIZJ().LJFF(0, this.LLILLL);
            LiveStreamVideoCapture liveStreamVideoCapture = this.LLILZ;
            liveStreamVideoCapture.LLJJIJIIJIL = this.LLILLJJLI;
            int i = this.LL;
            liveStreamVideoCapture.LLJZ = i;
            liveStreamVideoCapture.LLJJI(i);
            C1269500j8m.LIZJ().LIZLLL(0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamVideoCapture$SwitchCaptureRunnable@a575.run");
    }

    public RunnableC1268520j7C(LiveStreamVideoCapture liveStreamVideoCapture) {
        this.LLILZ = liveStreamVideoCapture;
    }
}
