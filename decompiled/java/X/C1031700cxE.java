package X;

import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.ui.RewardAdContainer;

/* JADX INFO: renamed from: X.0cxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031700cxE {
    public final /* synthetic */ RewardAdContainer LIZ;

    public final long LIZ() {
        return this.LIZ.RR().LIZIZ().LIZJ();
    }

    public final void LIZJ() {
        IVideoPlayTaskManager iVideoPlayTaskManager = (IVideoPlayTaskManager) this.LIZ.LLJLLIL.getValue();
        if (iVideoPlayTaskManager != null) {
            iVideoPlayTaskManager.reset();
        }
    }

    public C1031700cxE(RewardAdContainer rewardAdContainer) {
        this.LIZ = rewardAdContainer;
    }

    public final void LIZIZ(C988290bpD c988290bpD) {
        IVideoPlayTaskManager iVideoPlayTaskManager = (IVideoPlayTaskManager) this.LIZ.LLJLLIL.getValue();
        if (iVideoPlayTaskManager != null) {
            iVideoPlayTaskManager.LLIFFJFJJ(c988290bpD);
        }
    }
}
