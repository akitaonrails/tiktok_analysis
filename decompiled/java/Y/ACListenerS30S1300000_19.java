package Y;

import X.C01GW;
import X.C1242590iRN;
import X.C1242620iRQ;
import X.C1260250itr;
import X.C1260490iuF;
import X.C1260520iuI;
import X.C1260610iuR;
import X.C1260670iuX;
import X.C1397580mTM;
import X.C20515215Pi;
import X.C2188811AlT;
import X.EnumC1260930iux;
import android.app.Activity;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.experiment.PhotoModeBannerLearnMoreConfig;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS30S1300000_19 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS30S1300000_19 aCListenerS30S1300000_19, View view) {
        C1242620iRQ c1242620iRQLJI = ((C1242590iRN) aCListenerS30S1300000_19.l1).LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LIZ(EnumC1260930iux.ENTER_PROFILE);
        }
        C1242620iRQ c1242620iRQLJI2 = ((C1242590iRN) aCListenerS30S1300000_19.l1).LJI();
        if (c1242620iRQLJI2 != null) {
            c1242620iRQLJI2.LIZIZ("click_profile");
        }
        C1242590iRN.LJIILJJIL((C1242590iRN) aCListenerS30S1300000_19.l1, (User) aCListenerS30S1300000_19.l3, ((C1397580mTM) aCListenerS30S1300000_19.l2).LIZ, aCListenerS30S1300000_19.s0);
    }

    public static final void onClick$1(ACListenerS30S1300000_19 aCListenerS30S1300000_19, View view) {
        C1242620iRQ c1242620iRQLJI = ((C1242590iRN) aCListenerS30S1300000_19.l1).LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LIZIZ("click_avatar");
        }
        ((C1242590iRN) aCListenerS30S1300000_19.l1).LJIIIIZZ(((SmartAvatarImageView) aCListenerS30S1300000_19.l3).getContext(), (User) aCListenerS30S1300000_19.l2, aCListenerS30S1300000_19.s0);
    }

    public static final void onClick$2(ACListenerS30S1300000_19 aCListenerS30S1300000_19, View view) {
        C1260670iuX c1260670iuX = (C1260670iuX) aCListenerS30S1300000_19.l1;
        BannerDisplayInfo bannerDisplayInfo = (BannerDisplayInfo) aCListenerS30S1300000_19.l2;
        String str = aCListenerS30S1300000_19.s0;
        Activity activity = c1260670iuX.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C01GW c01gw = C1260610iuR.LIZIZ;
        sbLIZ.append(((PhotoModeBannerLearnMoreConfig) c01gw.getValue()).container);
        sbLIZ.append(((PhotoModeBannerLearnMoreConfig) c01gw.getValue()).url);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("&category=");
        sbLIZ2.append(bannerDisplayInfo.category);
        sbLIZ.append(URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ2), "UTF-8"));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("&num_of_people=");
        sbLIZ3.append(bannerDisplayInfo.searchCount);
        sbLIZ.append(URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ3), "UTF-8"));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("&session_id=");
        sbLIZ4.append(str);
        sbLIZ.append(URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ4), "UTF-8"));
        sbLIZ.append(((PhotoModeBannerLearnMoreConfig) c01gw.getValue()).containerParameter);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("use_spark", 1);
        smartRouteBuildRoute.withParam("loading_bgcolor", "000000");
        smartRouteBuildRoute.withParam("container_bg_color", "000000");
        smartRouteBuildRoute.withParam("status_bar_color", "000000");
        smartRouteBuildRoute.withParam("nav_bar_color", "000000");
        smartRouteBuildRoute.withParam("navigation_bar_bg_color", "000000");
        smartRouteBuildRoute.withParam("status_font_dark", 0);
        smartRouteBuildRoute.withParam("hide_nav_bar", 1);
        smartRouteBuildRoute.withParam("disable_bounces", 1);
        smartRouteBuildRoute.withParam("disable_swipe", 1);
        smartRouteBuildRoute.open();
        ((C20515215Pi) aCListenerS30S1300000_19.l3).LIZIZ();
        C1260250itr.LIZ().LIZ(Integer.valueOf(((BannerDisplayInfo) aCListenerS30S1300000_19.l2).hashCode()));
        C1260250itr.LIZ().LJFF(1);
        C1260490iuF.LJII(C1260250itr.LIZ());
        C1260250itr.LIZ().LIZIZ();
        C1260520iuI.LIZIZ.LIZJ(PhotoTopicBannerReadStatus.ENTER, null, null, null, null);
        C1260670iuX.LIZJ((C1260670iuX) aCListenerS30S1300000_19.l1, null, "educate_phase_iii", null, String.valueOf(((BannerDisplayInfo) aCListenerS30S1300000_19.l2).category), aCListenerS30S1300000_19.s0, 101);
    }

    public ACListenerS30S1300000_19(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }
}
