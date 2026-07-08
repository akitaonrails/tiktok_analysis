package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0p4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1497670p4n implements Runnable {
    public ByteBuffer LL;
    public final /* synthetic */ CronetUrlRequest LLILLJJLI;

    public final void LIZ() {
        this.LLILLJJLI.LJJI();
        ByteBuffer byteBuffer = this.LL;
        this.LL = null;
        try {
            synchronized (this.LLILLJJLI.LJFF) {
                try {
                    if (this.LLILLJJLI.LJJIIJZLJL()) {
                        return;
                    }
                    CronetUrlRequest cronetUrlRequest = this.LLILLJJLI;
                    cronetUrlRequest.LJ = true;
                    cronetUrlRequest.LJIIIZ.LIZJ(cronetUrlRequest, cronetUrlRequest.LJJII, byteBuffer);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LJJIIZI(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CronetUrlRequest$OnReadCompletedRunnable@2945.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CronetUrlRequest$OnReadCompletedRunnable@2945.run");
    }

    public RunnableC1497670p4n(CronetUrlRequest cronetUrlRequest) {
        this.LLILLJJLI = cronetUrlRequest;
    }
}
