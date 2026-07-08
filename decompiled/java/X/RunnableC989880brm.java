package X;

import com.ss.android.ugc.aweme.ad.experiment.AdScrollToJumpExperiment;
import com.ss.android.ugc.aweme.api.component.slide.CommerceSlideConfigAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0brm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC989880brm implements Runnable {
    public final CommerceSlideConfigAssem LL;
    public boolean LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CommerceSlideConfigAssem$DelayEnableRunnable@f2b.run");
        try {
            this.LL.ip(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme(), true);
            this.LL.hp(((Boolean) AdScrollToJumpExperiment.LIZJ.getValue()).booleanValue());
            this.LLILLJJLI = true;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceSlideConfigAssem$DelayEnableRunnable@f2b.run");
    }

    public RunnableC989880brm(CommerceSlideConfigAssem commerceSlideConfigAssem) {
        this.LL = commerceSlideConfigAssem;
    }
}
