package X;

import com.ss.android.ugc.aweme.strategy.CaptionStrategyServiceImpl;

/* JADX INFO: renamed from: X.161X, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C161X implements Runnable {
    public final /* synthetic */ CaptionStrategyServiceImpl LL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CaptionStrategyServiceImpl@9733.unblockRunnable$1");
        try {
            this.LL.LIZLLL.setValue(Boolean.FALSE);
            this.LL.LIZ.removeCallbacks(this);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CaptionStrategyServiceImpl@9733.unblockRunnable$1");
    }

    public C161X(CaptionStrategyServiceImpl captionStrategyServiceImpl) {
        this.LL = captionStrategyServiceImpl;
    }
}
