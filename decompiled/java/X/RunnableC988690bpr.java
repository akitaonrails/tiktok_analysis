package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0bpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC988690bpr implements Runnable {
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final WeakReference<CommerceVideoDelegateKt> LLILLJJLI;

    public final void LIZ() {
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LLILLJJLI.get();
        if (commerceVideoDelegateKt == null) {
            return;
        }
        Aweme aweme = commerceVideoDelegateKt.aweme;
        long currentPosition = C1483410ohn.LJLJJI().getCurrentPosition();
        if (aweme != null && C988820bq4.LJII(aweme) && currentPosition >= C988820bq4.LIZ(aweme)) {
            C988820bq4 c988820bq4 = C988820bq4.LIZ;
            c988820bq4.getClass();
            if ((C988820bq4.LIZJ(c988820bq4, aweme) & 2) == 0) {
                C988820bq4.LJ(aweme, "play");
                c988820bq4.LJI(aweme);
            }
        }
        this.LL.removeCallbacks(this);
        C786410Ut5.LJLIIL(200L, this.LL, this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CommerceVideoDelegateKt$UpdateProgressTask@3243.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceVideoDelegateKt$UpdateProgressTask@3243.run");
    }

    public RunnableC988690bpr(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        this.LLILLJJLI = new WeakReference<>(commerceVideoDelegateKt);
    }
}
