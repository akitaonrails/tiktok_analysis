package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0dSK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050980dSK extends AbstractC1177930gl5 {
    public final int LIZ;
    public final WeakReference<VideoShrinkAbility> LIZIZ;
    public ValueAnimator LIZLLL;
    public final C20571215eY LIZJ = new C20571215eY(false, 0, 1023);
    public int LJ = 5;

    public C1050980dSK(VideoShrinkAbility videoShrinkAbility, int i) {
        this.LIZ = i;
        this.LIZIZ = new WeakReference<>(videoShrinkAbility);
    }

    @Override // X.AbstractC1177930gl5
    public final void LIZJ(View view, float f) {
        VideoShrinkAbility videoShrinkAbility = this.LIZIZ.get();
        if (videoShrinkAbility == null) {
            return;
        }
        ValueAnimator valueAnimator = this.LIZLLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LIZLLL;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.LIZLLL = null;
        }
        int height = view.getHeight();
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = this.LIZ + ((height - r0) * f);
        } else {
            float f3 = this.LIZ * (f + 1.0f);
            if (f3 >= 0.0f) {
                f2 = f3;
            }
        }
        float f4 = this.LIZ;
        if (f2 > f4) {
            f2 = f4;
        }
        videoShrinkAbility.ob(f2, f4, this.LIZJ);
    }

    @Override // X.AbstractC1177930gl5
    public final void LIZLLL(int i, View view) {
        ILiveHostOuterService iLiveHostOuterService;
        VideoShrinkAbility videoShrinkAbility = this.LIZIZ.get();
        int i2 = this.LJ;
        this.LJ = i;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return;
                    }
                } else {
                    if (videoShrinkAbility != null) {
                        videoShrinkAbility.t1(4, 1);
                    }
                    ValueAnimator valueAnimator = this.LIZLLL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    this.LIZLLL = null;
                    ILiveHostOuterService iLiveHostOuterService2 = (ILiveHostOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveHostOuterService.class, false, false, false, 14, null);
                    if (iLiveHostOuterService2 == null) {
                        return;
                    }
                    iLiveHostOuterService2.tryChangeShortVideoPlayingStatus(Boolean.TRUE);
                    return;
                }
            }
            if (i2 != 3 || (iLiveHostOuterService = (ILiveHostOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveHostOuterService.class, false, false, false, 14, null)) == null) {
                return;
            }
            iLiveHostOuterService.tryChangeShortVideoPlayingStatus(Boolean.TRUE);
            return;
        }
        ILiveHostOuterService iLiveHostOuterService3 = (ILiveHostOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveHostOuterService.class, false, false, false, 14, null);
        if (iLiveHostOuterService3 == null) {
            return;
        }
        iLiveHostOuterService3.tryChangeShortVideoPlayingStatus(Boolean.FALSE);
    }
}
