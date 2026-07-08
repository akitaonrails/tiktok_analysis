package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0cYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016230cYH {
    public final View LIZ;

    public C1016230cYH(View view) {
        this.LIZ = view;
    }

    public final void LIZ(boolean z) {
        String str;
        if (z) {
            str = "#99000000";
        } else {
            str = "#99333333";
        }
        View view = this.LIZ;
        if (view != null) {
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.tis);
            if (tuxIconView != null) {
                LJ(tuxIconView, false);
                LIZLLL(R.raw.icon_flag, tuxIconView, str);
            }
            TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.tie);
            if (tuxIconView2 != null) {
                LJ(tuxIconView2, true);
                LIZLLL(R.raw.icon_x_mark, tuxIconView2, str);
            }
        }
    }

    public static Animator LIZIZ(View view, AnoleComponentAnimationModel anoleComponentAnimationModel) {
        Double dValueOf;
        Double dValueOf2;
        Double initialOpacityValue = anoleComponentAnimationModel.getInitialOpacityValue();
        if (initialOpacityValue != null && (dValueOf = Double.valueOf(initialOpacityValue.doubleValue() / ((double) 100))) != null) {
            double dDoubleValue = dValueOf.doubleValue();
            Double finalOpacityValue = anoleComponentAnimationModel.getFinalOpacityValue();
            if (finalOpacityValue != null && (dValueOf2 = Double.valueOf(finalOpacityValue.doubleValue() / ((double) 100))) != null) {
                double dDoubleValue2 = dValueOf2.doubleValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getOpacityAnimator\n initialOpacityValue:");
                sbLIZ.append(dDoubleValue);
                sbLIZ.append("\nfinalOpacityValue:");
                sbLIZ.append(dDoubleValue2);
                C2188811AlT.LIZIZ(sbLIZ);
                Interpolator interpolatorLIZ = C1016660cYy.LIZ(anoleComponentAnimationModel.curve);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", (float) dDoubleValue, (float) dDoubleValue2);
                objectAnimatorOfFloat.setDuration(anoleComponentAnimationModel.duration);
                objectAnimatorOfFloat.setStartDelay(anoleComponentAnimationModel.delay);
                if (interpolatorLIZ != null) {
                    objectAnimatorOfFloat.setInterpolator(interpolatorLIZ);
                }
                return objectAnimatorOfFloat;
            }
        }
        return null;
    }

    public static void LJ(TuxIconView tuxIconView, boolean z) {
        int i;
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            if (z) {
                i = 12;
            } else {
                i = 63;
            }
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
            C786410Ut5.W5(tuxIconView, marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static void LIZJ(Context context, String str, InterfaceC1031540cwy interfaceC1031540cwy) {
        AwemeRawAd awemeRawAd;
        UrlModel clickTrackUrlList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_lynx", 0);
        linkedHashMap.put("is_anole_cta", "1");
        interfaceC1031540cwy.handleTap(context, C2097608Jq.LJIIIIZZ(new Pair(EnumC1005420cGq.ENTER_FROM, 70), new Pair(EnumC1005420cGq.REFER, str)), interfaceC1031540cwy.getHostModel());
        HashMap map = new HashMap();
        map.putAll(linkedHashMap);
        map.putAll(interfaceC1031540cwy.getCustomAdExtraDataParams());
        interfaceC1031540cwy.trackEvent(new C1031310cwb("draw_ad", "click", str, map), interfaceC1031540cwy.getHostModel());
        RewardAdModel rewardAdModel = interfaceC1031540cwy.getRewardAdModel();
        if (rewardAdModel != null && (awemeRawAd = rewardAdModel.awemeRawAd) != null && (clickTrackUrlList = awemeRawAd.getClickTrackUrlList()) != null) {
            interfaceC1031540cwy.track3rdPartyURL(new C1031370cwh(clickTrackUrlList, "click", 12), interfaceC1031540cwy.getHostModel());
        }
    }

    public static void LIZLLL(int i, TuxIconView tuxIconView, String str) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZLLL = -1;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(C0SVC.LIZIZ(C0SVC.LIZ, str));
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
    }
}
