package Y;

import X.C0WZX;
import X.C1041870dDd;
import X.C1701330uNH;
import X.C1ASW;
import X.C20684815ws;
import X.C2162308dZ;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2429209fW;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.DetailBottomFakeInput;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: loaded from: classes17.dex */
public class ACListenerS28S1300000_16 implements View.OnClickListener {
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
        }
    }

    public static final void onClick$0(ACListenerS28S1300000_16 aCListenerS28S1300000_16, View view) {
        String string;
        String creativeId;
        String adId;
        String advId;
        String creativeId2;
        String itemId;
        Long lValueOf;
        AwemeCommerceStruct commerceVideoAuthInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        try {
            StringBuilder sb = new StringBuilder("aweme://webview/?url=");
            SettingsManager.LIZLLL().getClass();
            sb.append(SettingsManager.LJI("report_ads_problem_schema_setting", "https%3A%2F%2Finapp.tiktokv.com%2Fad%2Ftetris%2Fexperience%2Ffeedback_form%3fhide_nav_bar%3d1%26report_type%3d3"));
            string = sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            string = C1041870dDd.LIZ;
        }
        sbLIZ.append(string);
        sbLIZ.append("%26selectTab%3d");
        sbLIZ.append(aCListenerS28S1300000_16.s0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2344009Gk c2344009Gk = new C2344009Gk();
        Aweme aweme = (Aweme) aCListenerS28S1300000_16.l1;
        String desc = null;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            creativeId = commerceVideoAuthInfo.getCreativeId();
        } else {
            creativeId = null;
        }
        c2344009Gk.LJIIIIZZ("creativeId", creativeId);
        C20684815ws.LJIILLIIL("select_report_ads", c2344009Gk.LIZ);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((DetailBottomFakeInput) aCListenerS28S1300000_16.l2).getContext(), strLIZIZ);
        AwemeCommerceStruct awemeCommerceStruct = (AwemeCommerceStruct) aCListenerS28S1300000_16.l3;
        if (awemeCommerceStruct != null) {
            adId = awemeCommerceStruct.getAdId();
        } else {
            adId = null;
        }
        smartRouteBuildRoute.withParam("bundle_ad_id_from_aweme", adId);
        AwemeCommerceStruct awemeCommerceStruct2 = (AwemeCommerceStruct) aCListenerS28S1300000_16.l3;
        if (awemeCommerceStruct2 != null) {
            advId = awemeCommerceStruct2.getAdvId();
        } else {
            advId = null;
        }
        smartRouteBuildRoute.withParam("bundle_advertiser_id_from_aweme", advId);
        AwemeCommerceStruct awemeCommerceStruct3 = (AwemeCommerceStruct) aCListenerS28S1300000_16.l3;
        if (awemeCommerceStruct3 != null) {
            creativeId2 = awemeCommerceStruct3.getCreativeId();
        } else {
            creativeId2 = null;
        }
        smartRouteBuildRoute.withParam("bundle_creative_id_from_aweme", creativeId2);
        AwemeCommerceStruct awemeCommerceStruct4 = (AwemeCommerceStruct) aCListenerS28S1300000_16.l3;
        if (awemeCommerceStruct4 != null) {
            itemId = awemeCommerceStruct4.getItemId();
        } else {
            itemId = null;
        }
        smartRouteBuildRoute.withParam("bundle_item_id_from_aweme", itemId);
        AwemeCommerceStruct awemeCommerceStruct5 = (AwemeCommerceStruct) aCListenerS28S1300000_16.l3;
        if (awemeCommerceStruct5 != null) {
            lValueOf = Long.valueOf(awemeCommerceStruct5.getLastViewTime());
        } else {
            lValueOf = null;
        }
        smartRouteBuildRoute.withParam("bundle_view_time_from_aweme", lValueOf);
        Aweme aweme2 = (Aweme) aCListenerS28S1300000_16.l1;
        if (aweme2 != null) {
            desc = aweme2.getDesc();
        }
        smartRouteBuildRoute.withParam("bundle_desc_from_aweme", desc);
        Aweme aweme3 = (Aweme) aCListenerS28S1300000_16.l1;
        if (aweme3.getVideo() != null && aweme3.getVideo().getCover() != null && aweme3.getVideo().getCover().getUrlList() != null && aweme3.getVideo().getCover().getUrlList().size() > 0) {
            smartRouteBuildRoute.withParam("bundle_cover_url_from_aweme", (String) ListProtector.get(aweme3.getVideo().getCover().getUrlList(), 0));
        }
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(ACListenerS28S1300000_16 aCListenerS28S1300000_16, View view) {
        Intent intentLIZIZ = C2162308dZ.LIZIZ((Activity) aCListenerS28S1300000_16.l1, aCListenerS28S1300000_16.s0);
        intentLIZIZ.setFlags(268468224);
        C2429209fW.LIZ().appendDataFlowId(intentLIZIZ, 1207964161);
        Activity activity = (Activity) aCListenerS28S1300000_16.l1;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZIZ, "Context_startActivity_1");
        C1701330uNH.LIZ(intentLIZIZ, activity);
        C2204961BRm.LJIILLIIL(activity, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4atHN1SLy2IsGdCA4grYdb5YUn3zpoxgPqakyuQvzUkThcYx7D+RXZjwtwg==", null));
        AwemeRawAd awemeRawAd = ((Aweme) aCListenerS28S1300000_16.l2).getAwemeRawAd();
        if (awemeRawAd != null) {
            ((C1ASW) aCListenerS28S1300000_16.l3).LLILLL.LJIIIIZZ(awemeRawAd).LJJIIZ();
        }
    }

    public ACListenerS28S1300000_16(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
