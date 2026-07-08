package X;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.live.ttquic.PreloadManager;
import com.ss.videoarch.live.ttquic.TTEvent;
import com.ss.videoarch.live.ttquic.TTRequestParam;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0v1J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class RunnableC1726150v1J implements Runnable {
    public TTRequestParam LLIZLLLIL;
    public Bundle LLJ;
    public final /* synthetic */ PreloadManager LLJIJIL;
    public String LL = "";
    public int LLILLJJLI = -1;
    public final AtomicInteger LLILLL = new AtomicInteger(0);
    public long LLILZ = -1;
    public long LLILZIL = -1;
    public int LLILZLL = 0;
    public int LLIZ = -1;
    public final CountDownLatch LLJI = new CountDownLatch(1);

    public final void LIZ() {
        int iNative_preload;
        String strJ4;
        if (this.LLILLL.get() == 1 || this.LLILLL.get() == 6) {
            PreloadManager preloadManager = this.LLJIJIL;
            iNative_preload = preloadManager.native_preload(preloadManager.mNativePtr, this.LLIZLLLIL);
            if (iNative_preload == 0) {
                try {
                    this.LLJI.await();
                    return;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            strJ4 = "invoke native_preload error";
        } else {
            strJ4 = C786410Ut5.j4("PreloadTask state invalid : %d", new Object[]{Integer.valueOf(this.LLILLL.get())});
            iNative_preload = -3007;
        }
        TTEvent tTEvent = new TTEvent();
        tTEvent.what = 2;
        tTEvent.url = this.LL;
        tTEvent.error = strJ4;
        tTEvent.code = iNative_preload;
        Message messageObtainMessage = this.LLJIJIL.mEventHandler.obtainMessage();
        messageObtainMessage.what = tTEvent.what;
        messageObtainMessage.obj = tTEvent;
        C786410Ut5.LJLJJL(this.LLJIJIL.mEventHandler, messageObtainMessage);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PreloadManager$PreloadTask@1a19.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadManager$PreloadTask@1a19.run");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadTask{url='");
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(", playerId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", cachedTime=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", requestParam=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", scheduleTime=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RunnableC1726150v1J(PreloadManager preloadManager) {
        this.LLJIJIL = preloadManager;
    }
}
