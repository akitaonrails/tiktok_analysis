package X;

import com.bytedance.realx.video.SurfaceEglRenderer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0jR3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RunnableC1280830jR3 implements Runnable {
    public final /* synthetic */ CountDownLatch LL;

    public /* synthetic */ RunnableC1280830jR3(CountDownLatch countDownLatch) {
        this.LL = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceEglRenderer.lambda$semisugar$countDown$0(this.LL);
    }
}
