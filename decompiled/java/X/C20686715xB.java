package X;

import Y.ARunnableS124S0100000_24;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15xB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20686715xB extends C09AY implements Function2<VideoUserCardAssem, Boolean, Unit> {
    public C20686715xB() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoUserCardAssem videoUserCardAssem, Boolean bool) {
        boolean z;
        VideoUserCardAssem videoUserCardAssem2 = videoUserCardAssem;
        boolean zBooleanValue = bool.booleanValue();
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set isVisible: ");
        sbLIZ.append(zBooleanValue);
        c2276471E8n.LIZIZ("common_feed", "VideoRecUser", C2188811AlT.LIZIZ(sbLIZ));
        int i = 0;
        if (videoUserCardAssem2.getContentView().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != zBooleanValue) {
            videoUserCardAssem2.getContentView().clearAnimation();
            if (zBooleanValue) {
                AnimationSet animationSet = new AnimationSet(false);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setDuration(100L);
                alphaAnimation.setInterpolator(VideoUserCardAssem.LLJLLL);
                animationSet.addAnimation(alphaAnimation);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.06f, 1, 0.0f);
                translateAnimation.setFillEnabled(true);
                translateAnimation.setFillAfter(true);
                translateAnimation.setDuration(300L);
                translateAnimation.setInterpolator(C1619980sG4.LIZIZ());
                animationSet.addAnimation(translateAnimation);
                animationSet.setAnimationListener(new C16H6(videoUserCardAssem2, 0));
                animationSet.setFillAfter(true);
                videoUserCardAssem2.getContentView().startAnimation(animationSet);
                videoUserCardAssem2.up(true, true);
                C20686015x4 c20686015x4 = C20686015x4.LIZ;
                Keva keva = C20686015x4.LIZIZ;
                c20686015x4.getClass();
                int i2 = keva.getInt(C20686015x4.LIZLLL(), 0) + 1;
                if (i2 >= 3) {
                    int i3 = C2187451AjH.LIZ;
                    C1720106oR.LJI("RecMore", "record video, limit max show cnt!");
                    keva.storeInt(C20686015x4.LIZJ(), C1387310mCn.LIZ(System.currentTimeMillis()));
                } else {
                    i = i2;
                }
                keva.storeInt(C20686015x4.LIZLLL(), i);
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("record video, rec user show! cnt: ");
                sbLIZ2.append(i);
                C1720106oR.LJI("RecMore", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                videoUserCardAssem2.getContentView().animate().alpha(0.0f).setDuration(150L).setInterpolator(VideoUserCardAssem.LLJLLL).withEndAction(new ARunnableS124S0100000_24(videoUserCardAssem2, 26)).start();
            }
        }
        return Unit.LIZ;
    }
}
