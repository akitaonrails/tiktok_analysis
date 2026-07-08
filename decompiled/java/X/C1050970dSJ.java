package X;

import Y.AUListenerS13S0100001_16;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.animation.DecelerateInterpolator;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;

/* JADX INFO: renamed from: X.0dSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050970dSJ {
    public static final C1050970dSJ LIZ = new C1050970dSJ();

    public static final C1050980dSK LIZ(InterfaceC665370Q7z interfaceC665370Q7z, Activity activity, String str, int i) {
        VideoShrinkAbility videoShrinkAbility;
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        if (activity == null || i == 0 || ((i != 1 && ((iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || !interfaceC20673515v3K4.Mn(str))) || interfaceC665370Q7z == null || (videoShrinkAbility = (VideoShrinkAbility) C1558520qew.LIZ(interfaceC665370Q7z, VideoShrinkAbility.class, null)) == null)) {
            return null;
        }
        videoShrinkAbility.t1(1, 3);
        C1050980dSK c1050980dSK = new C1050980dSK(videoShrinkAbility, (int) (C12ES.LJIIIIZZ(activity) * 0.7f));
        ValueAnimator valueAnimator = c1050980dSK.LIZLLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = c1050980dSK.LIZ;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS13S0100001_16(c1050980dSK, f, 1));
        valueAnimatorOfFloat.start();
        c1050980dSK.LIZLLL = valueAnimatorOfFloat;
        return c1050980dSK;
    }
}
