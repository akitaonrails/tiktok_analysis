package Y;

import X.C0OBG;
import X.C1554300qY8;
import X.C1572910r29;
import X.C19510311Uv;
import X.C19737512Kf;
import X.C1C1T;
import X.C20515215Pi;
import X.C20684815ws;
import X.C2203191BKr;
import X.C2222971BzT;
import X.C2238031Cif;
import X.C2238041Cig;
import X.C2238051Cih;
import X.C2238061Cii;
import X.C2238141Ciq;
import X.C2238151Cir;
import X.C2238171Cit;
import X.C2344009Gk;
import X.C688120Qyw;
import X.InterfaceC2202321BHi;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SeclinkConfig;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerCampaign;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p2.StoryExternalLinkComponent;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.ButtonInfo;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.OutreachBannerData;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class ACListenerS136S0200000_34 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        List<String> list = ((OAuthScope) aCListenerS136S0200000_34.l0).scopeLearnMoreContents;
        if (list != null) {
            ((I18nAuthorizeFragment) aCListenerS136S0200000_34.l1).gT(list);
        }
    }

    public static final void onClick$1(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        List<String> list = ((OAuthScope) aCListenerS136S0200000_34.l0).scopeLearnMoreContents;
        if (list != null) {
            ((I18nAuthorizeFragment) aCListenerS136S0200000_34.l1).gT(list);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(10:7|(0)(1:11)|12|(1:16)|17|57|22|(4:24|(4:26|(2:29|27)|59|30)|31|(1:63)(6:39|(1:41)|42|(1:50)|51|52))|55|56)(1:18)|19|(2:12|(2:14|16))|17|57|22|(0)|55|56) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01de, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01df, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$10(Y.ACListenerS136S0200000_34 r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS136S0200000_34.onClick$10(Y.ACListenerS136S0200000_34, android.view.View):void");
    }

    public static final void onClick$11(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        C2222971BzT c2222971BzT;
        String str;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        TuxSheet tuxSheet = ((StoryExternalLinkComponent) aCListenerS136S0200000_34.l0).LLJLLIL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        ((StoryExternalLinkComponent) aCListenerS136S0200000_34.l0).getClass();
        StoryExternalLinkComponent.Ep("proceed");
        C1C1T c1c1t = C2203191BKr.LIZ(((VideoItemParams) aCListenerS136S0200000_34.l1).getAweme()).socialBlob;
        if (c1c1t != null && (c2222971BzT = c1c1t.attribution_link_story_anchor_blob) != null && (str = c2222971BzT.link_address) != null) {
            StoryExternalLinkComponent storyExternalLinkComponent = (StoryExternalLinkComponent) aCListenerS136S0200000_34.l0;
            storyExternalLinkComponent.getClass();
            Context context = storyExternalLinkComponent.getContext();
            if (context != null) {
                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                sparkThirdContext.seclinkConfig = new SeclinkConfig(true, "bio_url");
                sparkThirdContext.url = str;
                sparkThirdContext.bizCert = new ThirdPartyBizCert(402665477);
                sparkThirdContext.antiJump = new InterfaceC2202321BHi() { // from class: X.07j9
                    @Override // X.InterfaceC2202321BHi
                    public final boolean LIZ(Context context2, String str2) {
                        if (C13LP.LJJJJ(UriProtector.parse(str2).getScheme(), C13LQ.LJLIIL(new String[]{"http", "https"}))) {
                            return true;
                        }
                        return false;
                    }
                };
                C1554300qY8.LIZIZ(context, sparkThirdContext);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static final void onClick$2(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        ((C19737512Kf) aCListenerS136S0200000_34.l0).LJFF(new C19510311Uv());
        ((EditCaptionScene) aCListenerS136S0200000_34.l1).LLLLIILL();
        ((EditCaptionScene) aCListenerS136S0200000_34.l1).LLLZLL();
    }

    public static final void onClick$3(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        ((C2238051Cih) aCListenerS136S0200000_34.l0).getClass();
        C2238051Cih.LJIIL("view_button");
        SmartRouter.buildRoute(((C688120Qyw) aCListenerS136S0200000_34.l1).LIZ, C2238061Cii.LIZ().scheme).open();
        ((C2238051Cih) aCListenerS136S0200000_34.l0).LL.LIZIZ();
    }

    public static final void onClick$4(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        Context context;
        C1572910r29 c1572910r29 = C1572910r29.LIZ;
        C2238041Cig c2238041Cig = (C2238041Cig) aCListenerS136S0200000_34.l0;
        String str = c2238041Cig.LLILLL.awareBannerSchema;
        String str2 = c2238041Cig.LL;
        String str3 = c2238041Cig.LLILLJJLI;
        c1572910r29.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("campaign_id", str);
        c2344009Gk.LJIIIIZZ("position", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        C20684815ws.LJIILLIIL("paid_content_profile_banner_link_click_mobile_creation", c2344009Gk.LIZ);
        C688120Qyw c688120QywI2 = ((C2238041Cig) aCListenerS136S0200000_34.l0).scene.i2();
        if (c688120QywI2 != null && (context = c688120QywI2.LIZ) != null) {
            SmartRouter.buildRoute(context, ((C2238041Cig) aCListenerS136S0200000_34.l0).LLILLL.awareBannerSchema).open();
        }
        ((C20515215Pi) aCListenerS136S0200000_34.l1).LIZIZ();
    }

    public static final void onClick$5(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        Context context;
        C2238141Ciq c2238141Ciq = C2238141Ciq.LIZ;
        C2238031Cif c2238031Cif = (C2238031Cif) aCListenerS136S0200000_34.l0;
        PaidContentBannerCampaign paidContentBannerCampaign = c2238031Cif.LLILLL;
        String str = paidContentBannerCampaign.paidContentBannerCampaignId;
        String str2 = c2238031Cif.LL;
        String str3 = c2238031Cif.LLILLJJLI;
        Map<String, String> map = paidContentBannerCampaign.extraParams;
        c2238141Ciq.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("campaign_id", str);
        c2344009Gk.LJIIIIZZ("position", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL("paid_content_profile_banner_link_click", c2344009Gk.LIZ);
        C688120Qyw c688120QywI2 = ((C2238031Cif) aCListenerS136S0200000_34.l0).scene.i2();
        if (c688120QywI2 != null && (context = c688120QywI2.LIZ) != null) {
            SmartRouter.buildRoute(context, ((C2238031Cif) aCListenerS136S0200000_34.l0).LLILLL.paidContentBannerSchema).open();
        }
        ((C20515215Pi) aCListenerS136S0200000_34.l1).LIZIZ();
    }

    public static final void onClick$6(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        ((C2238171Cit) aCListenerS136S0200000_34.l0).LIZIZ(((OutreachBannerData) aCListenerS136S0200000_34.l1).schemaUrl);
        C2238151Cir.LIZ((OutreachBannerData) aCListenerS136S0200000_34.l1, "click_outreach");
    }

    public static final void onClick$7(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        String str;
        C2238171Cit c2238171Cit = (C2238171Cit) aCListenerS136S0200000_34.l0;
        ButtonInfo buttonInfo = ((OutreachBannerData) aCListenerS136S0200000_34.l1).buttonInfo;
        if (buttonInfo != null) {
            str = buttonInfo.schemaUrl;
        } else {
            str = null;
        }
        c2238171Cit.LIZIZ(str);
        C2238151Cir.LIZ((OutreachBannerData) aCListenerS136S0200000_34.l1, "click_open_button");
    }

    public static final void onClick$8(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        ((C2238171Cit) aCListenerS136S0200000_34.l0).LIZIZ(((OutreachBannerData) aCListenerS136S0200000_34.l1).schemaUrl);
        C2238151Cir.LIZ((OutreachBannerData) aCListenerS136S0200000_34.l1, "click_outreach");
    }

    public static final void onClick$9(ACListenerS136S0200000_34 aCListenerS136S0200000_34, View view) {
        String str;
        C2238171Cit c2238171Cit = (C2238171Cit) aCListenerS136S0200000_34.l0;
        ButtonInfo buttonInfo = ((OutreachBannerData) aCListenerS136S0200000_34.l1).buttonInfo;
        if (buttonInfo != null) {
            str = buttonInfo.schemaUrl;
        } else {
            str = null;
        }
        c2238171Cit.LIZIZ(str);
        C2238151Cir.LIZ((OutreachBannerData) aCListenerS136S0200000_34.l1, "click_open_button");
    }

    public ACListenerS136S0200000_34(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
