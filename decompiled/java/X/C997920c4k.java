package X;

import Y.AAListenerS29S0301000_16;
import Y.AAListenerS323S0100000_12;
import Y.AUListenerS146S0300000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997920c4k extends C09AY implements Function2<QuickShareButtonAssem, C1365870leD, Unit> {
    public C997920c4k() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(QuickShareButtonAssem quickShareButtonAssem, C1365870leD c1365870leD) {
        Object obj;
        Object obj2;
        AnimatorSet animatorSet;
        int i;
        QuickShareButtonAssem quickShareButtonAssem2 = quickShareButtonAssem;
        C1365870leD c1365870leD2 = c1365870leD;
        if (c1365870leD2 != null && Intrinsics.LJFF(c1365870leD2.LJI, ((VideoItemParams) C631370Opb.LIZ(quickShareButtonAssem2)).getAweme().getAid())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shareAwemeStartEvent ");
            C724270Sb3 c724270Sb3 = quickShareButtonAssem2.LLJI;
            Object obj3 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            sbLIZ.append(QuickShareButtonAssem.Ip((VideoItemParams) obj));
            C1720006oQ.LJ("QuickShareAssem", C2188811AlT.LIZIZ(sbLIZ));
            C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
            C724270Sb3 c724270Sb32 = quickShareButtonAssem2.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            } else {
                obj2 = null;
            }
            String aid = ((VideoItemParams) obj2).getAweme().getAid();
            c1004550cFR.getClass();
            if (aid != null) {
                C1004550cFR.LJFF.remove(aid);
            }
            C724270Sb3 c724270Sb33 = quickShareButtonAssem2.LLJI;
            if (c724270Sb33 != null) {
                obj3 = c724270Sb33.LL;
            }
            String aid2 = ((VideoItemParams) obj3).getAweme().getAid();
            if (aid2 != null) {
                C1004550cFR.LIZLLL.add(aid2);
            }
            C997930c4l c997930c4l = (C997930c4l) quickShareButtonAssem2.LLJLLIL.getValue();
            View viewLJJIJL = quickShareButtonAssem2.LJJIJL();
            int height = quickShareButtonAssem2.getContentView().getHeight();
            AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(quickShareButtonAssem2, 320);
            AnimatorSet animatorSet2 = c997930c4l.LIZ;
            if (animatorSet2 != null && animatorSet2.isRunning()) {
                animatorSet2.cancel();
            }
            if (viewLJJIJL.getVisibility() != 8 && (((animatorSet = c997930c4l.LIZIZ) == null || !animatorSet.isRunning()) && (viewLJJIJL.getParent() instanceof ViewGroup))) {
                ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(viewLJJIJL);
                if (marginLayoutParamsLJI != null) {
                    i = marginLayoutParamsLJI.bottomMargin;
                } else {
                    i = 0;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewLJJIJL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                objectAnimatorOfFloat.setInterpolator((Interpolator) c997930c4l.LIZJ.getValue());
                objectAnimatorOfFloat.setDuration(300L);
                int i2 = -height;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("transitOut sourceHeight=");
                sbLIZ2.append(height);
                sbLIZ2.append("   originalMarginBottom=");
                sbLIZ2.append(i);
                C2188811AlT.LIZIZ(sbLIZ2);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
                valueAnimatorOfInt.setInterpolator((Interpolator) c997930c4l.LIZLLL.getValue());
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS146S0300000_2(valueAnimatorOfInt, marginLayoutParamsLJI, viewLJJIJL, 0));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
                animatorSet3.addListener(new AAListenerS323S0100000_12(viewLJJIJL, 6));
                animatorSet3.addListener(new AAListenerS29S0301000_16(viewLJJIJL, marginLayoutParamsLJI, i2, awS560S0100000_16, 0));
                animatorSet3.addListener(new AAListenerS29S0301000_16(viewLJJIJL, marginLayoutParamsLJI, i2, awS560S0100000_16, 1));
                c997930c4l.LIZIZ = animatorSet3;
                animatorSet3.start();
            }
        }
        return Unit.LIZ;
    }
}
