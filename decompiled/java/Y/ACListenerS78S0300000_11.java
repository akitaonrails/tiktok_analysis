package Y;

import X.C0SH1;
import X.C0SQ0;
import X.C0SQ1;
import X.C1388190mED;
import X.C1609960rzu;
import X.C1893580zNM;
import X.C1894320zOY;
import X.C19EG;
import X.C1AV3;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C631370Opb;
import X.C714560S1e;
import X.C737450SwJ;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.api.model.CommonFeedButton;
import com.bytedance.touchpoint.api.model.FeedBottomButton;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.incentive.IncentiveBottomButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.incentive.IncentiveShareButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.QuickDMBoxAssem;
import com.ss.android.ugc.aweme.feed.assem.quickreply.QuickDMViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.PlaylistRouterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow1.StoryShareReshareSubtitleComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerCell;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public class ACListenerS78S0300000_11 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public static final void onClick$0(ACListenerS78S0300000_11 aCListenerS78S0300000_11, View view) {
        Integer numValueOf;
        PlaylistRouterService.LIZIZ().LIZ((Context) aCListenerS78S0300000_11.l0, (Aweme) aCListenerS78S0300000_11.l1, "homepage_hot", false, true);
        IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        String mixId = ((PlayListInfo) aCListenerS78S0300000_11.l2).getMixId();
        String authorUid = AwemeExtKt.getAuthorUid((Aweme) aCListenerS78S0300000_11.l1);
        Video video = ((Aweme) aCListenerS78S0300000_11.l1).getVideo();
        if (video != null) {
            numValueOf = Integer.valueOf(video.getDuration());
        } else {
            numValueOf = null;
        }
        iMixFeedService.LJIILIIL("homepage_hot", mixId, null, authorUid, 0.0f, "click_banner", null, numValueOf, null, null);
    }

    public static final void onClick$1(ACListenerS78S0300000_11 aCListenerS78S0300000_11, View view) {
        ((AIGCOverLabelBannerAssem) aCListenerS78S0300000_11.l0).Gp(C1AV3.LIZ(10, "Feed", null, "aigc_overlabel_banner"));
        ((FeedCommonBannerProtocol) aCListenerS78S0300000_11.l1).LJI().LIZIZ(BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_SEARCH_TAKO_TEXT_ICON, new C0SH1((BannerCommonAction) aCListenerS78S0300000_11.l2, 1));
    }

    public static final void onClick$2(ACListenerS78S0300000_11 aCListenerS78S0300000_11, View view) {
        ((StoryViewerCell) aCListenerS78S0300000_11.l0).L5().CQ2(((StoryViewerCell) aCListenerS78S0300000_11.l0).itemView.getContext(), (User) aCListenerS78S0300000_11.l1, (StoryInteraction) aCListenerS78S0300000_11.l2);
    }

    public static final void onClick$3(ACListenerS78S0300000_11 aCListenerS78S0300000_11, View view) {
        ((QuickDMBoxAssem) aCListenerS78S0300000_11.l0).Bp().vQ2((C714560S1e) aCListenerS78S0300000_11.l1, (VideoItemParams) C631370Opb.LIZ((QuickDMBoxAssem) aCListenerS78S0300000_11.l0), (Context) aCListenerS78S0300000_11.l2);
        QuickDMViewModel quickDMViewModelBp = ((QuickDMBoxAssem) aCListenerS78S0300000_11.l0).Bp();
        quickDMViewModelBp.getClass();
        quickDMViewModelBp.setState(AFwS243S0000000_11.get$arr$(740));
    }

    public static final void onClick$4(ACListenerS78S0300000_11 aCListenerS78S0300000_11, View view) {
        ((QuickDMBoxAssem) aCListenerS78S0300000_11.l0).Bp().vQ2((C714560S1e) aCListenerS78S0300000_11.l1, (VideoItemParams) C631370Opb.LIZ((QuickDMBoxAssem) aCListenerS78S0300000_11.l0), (Context) aCListenerS78S0300000_11.l2);
        QuickDMViewModel quickDMViewModelBp = ((QuickDMBoxAssem) aCListenerS78S0300000_11.l0).Bp();
        quickDMViewModelBp.getClass();
        quickDMViewModelBp.setState(AFwS243S0000000_11.get$arr$(740));
    }

    public static final void onClick$5(ACListenerS78S0300000_11 aCListenerS78S0300000_11, View view) {
        String str;
        String aid;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C0SQ1 c0sq1 = (C0SQ1) aCListenerS78S0300000_11.l0;
        String str2 = null;
        if (c0sq1 != null) {
            str = c0sq1.LIZIZ;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        Aweme aweme = (Aweme) aCListenerS78S0300000_11.l1;
        String str3 = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        Aweme aweme2 = (Aweme) aCListenerS78S0300000_11.l1;
        if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
            str3 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        c2344009Gk.LJIIIIZZ("anchor_type", "low_interest");
        C20684815ws.LJIILLIIL("tag_anchor_click", c2344009Gk.LIZ);
        if (((Aweme) aCListenerS78S0300000_11.l1) != null) {
            C737450SwJ c737450SwJ = C737450SwJ.LIZIZ;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C0SQ0) aCListenerS78S0300000_11.l2).getContext());
            Aweme aweme3 = (Aweme) aCListenerS78S0300000_11.l1;
            C0SQ1 c0sq12 = (C0SQ1) aCListenerS78S0300000_11.l0;
            if (c0sq12 != null) {
                str2 = c0sq12.LIZIZ;
            }
            c737450SwJ.LJI(c19egLIZIZ, aweme3, str2, "low_interest");
        }
    }

    public static final void onClick$6(ACListenerS78S0300000_11 aCListenerS78S0300000_11, View view) {
        StoryShareReshareSubtitleComponent storyShareReshareSubtitleComponent = (StoryShareReshareSubtitleComponent) aCListenerS78S0300000_11.l0;
        Aweme aweme = (Aweme) aCListenerS78S0300000_11.l1;
        MentionStruct mentionStruct = (MentionStruct) aCListenerS78S0300000_11.l2;
        Context context = storyShareReshareSubtitleComponent.getContext();
        if (context != null) {
            String userId = mentionStruct.getUserId();
            if (userId == null || userId.length() <= 0) {
                Long lValueOf = Long.valueOf(C1609960rzu.LJI(aweme));
                if (lValueOf.longValue() > 0) {
                    userId = lValueOf.toString();
                } else {
                    return;
                }
            }
            StoryShareReshareSubtitleComponent.Ep(aweme, "click", "mention", userId, null);
            try {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile");
                smartRouteBuildRoute.withParam("uid", userId);
                String secUid = mentionStruct.getSecUid();
                if (secUid == null) {
                    secUid = "";
                }
                smartRouteBuildRoute.withParam("sec_user_id", secUid);
                smartRouteBuildRoute.open();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void onClick$7(ACListenerS78S0300000_11 aCListenerS78S0300000_11, View view) {
        Context context = ((IncentiveBottomButtonAssem) aCListenerS78S0300000_11.l0).getContext();
        if (context != null) {
            CommonFeedButton commonFeedButton = (CommonFeedButton) aCListenerS78S0300000_11.l1;
            VideoItemParams videoItemParams = (VideoItemParams) aCListenerS78S0300000_11.l2;
            C1893580zNM c1893580zNM = C1893580zNM.LIZ;
            String str = commonFeedButton.jumpLink;
            if (str == null) {
                str = "";
            }
            C1893580zNM.LJ(c1893580zNM, context, 95, str, null, false, null, null, videoItemParams.getAweme().getAid(), 120);
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("click_position", "confirm"));
            Integer num = commonFeedButton.LIZJ;
            c1894320zOY.getClass();
            C1894320zOY.LJIILJJIL(95, mapLJIIJ, num, null, null);
        }
    }

    public static final void onClick$8(ACListenerS78S0300000_11 aCListenerS78S0300000_11, View view) {
        Context context = ((IncentiveShareButtonAssem) aCListenerS78S0300000_11.l0).getContext();
        if (context != null) {
            C1893580zNM.LJ(C1893580zNM.LIZ, context, 39, ((FeedBottomButton) aCListenerS78S0300000_11.l1).button.jumpLink, null, false, null, null, ((VideoItemParams) aCListenerS78S0300000_11.l2).getAweme().getAid(), 120);
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c1894320zOY.getClass();
            C1894320zOY.LJIILJJIL(39, linkedHashMap, null, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$9(Y.ACListenerS78S0300000_11 r15, android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS78S0300000_11.onClick$9(Y.ACListenerS78S0300000_11, android.view.View):void");
    }

    public ACListenerS78S0300000_11(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
