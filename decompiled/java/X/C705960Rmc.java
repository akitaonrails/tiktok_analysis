package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.ecommerce.ECommerceFYPService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPService;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.analyticsinspiration.AnalyticsInspirationButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.collab.CollabInvitedButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.duetbutton.VideoDuetButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPTrigger;
import com.ss.android.ugc.aweme.feed.assem.incentive.IncentiveBottomButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.incentive.IncentiveShareButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTAButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.pugc.VideoTemplateButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.pushsurvey.PushSurveyAssemTrigger;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.FriendTabQuickCommentTrigger;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentTrigger;
import com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxTrigger;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnTrigger;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationTrigger;
import com.ss.android.ugc.aweme.feed.assem.stitchbutton.VideoStitchButtonTrigger;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceTrigger;
import com.ss.android.ugc.aweme.feed.assem.unreadshare.ShareUnreadVideoQuickDMTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.guide.publish.IProGuidePublishService;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerAssem;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0Rmc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705960Rmc {
    public static final C705960Rmc LIZ = new C705960Rmc();
    public static final Set<String> LIZIZ = C093Y.LJ("bottom_button_inspiration_idea", "bottom_button_drama", "bottom_button_pro_guide_publish", "bottom_button_template", "bottom_button_collab_review", "bottom_button_dm_box_unread_video", "bottom_button_follow", "bottom_button_user_suggestion", "bottom_button_try_same_effect", "bottom_button_quick_comment", "bottom_button_share_info", "bottom_button_duet", "bottom_button_add_favorite", "bottom_button_stitch", "bottom_button_retag_poi", "bottom_button_see_translation", "bottom_button_start_new_video", "bottom_button_add_yours_entrance", "bottom_button_video_skip", "bottom_button_music_shoot", "bottom_button_story_message", "bottom_button_early_feedback", "bottom_button_low_active_survey", "bottom_button_share_to_story", "bottom_button_dm_quick_reply", "bottom_button_view_more_stories", "bottom_button_product_add", "bottom_button_incentive_share", "bottom_button_quick_share", "bottom_button_live_notify", "bottom_button_survey", "bottom_button_prompt", "bottom_button_dm_join_group", "bottom_button_quick_external_share", "bottom_button_promote_post_button", "bottom_button_promote_bottom_button", "bottom_button_shop_video_guide_with_shop_cart", "bottom_button_shop_video_guide");
    public static final Map<String, C695950RRp> LIZJ = C2097608Jq.LJIIJ(new Pair("bottom_button_follow", new C695950RRp(1, "social")), new Pair("bottom_button_user_suggestion", new C695950RRp(2, "social")), new Pair("bottom_button_quick_comment", new C695950RRp(3, "social")), new Pair("bottom_button_share_info", new C695950RRp(4, "social")), new Pair("bottom_button_duet", new C695950RRp(7, "create")), new Pair("bottom_button_add_favorite", new C695950RRp(8, "music")), new Pair("bottom_button_try_same_effect", new C695950RRp(10, "social")), new Pair("bottom_button_stitch", new C695950RRp(11, "create")), new Pair("bottom_button_start_new_video", new C695950RRp(12, "creator monetization")), new Pair("bottom_button_see_translation", new C695950RRp(14, "big_see_translation")), new Pair("bottom_button_video_skip", new C695950RRp(17, "search")), new Pair("bottom_button_add_yours_entrance", new C695950RRp(18, "add_yours")), new Pair("bottom_button_music_shoot", new C695950RRp(19, "search")), new Pair("bottom_button_story_message", new C695950RRp(21, "social")), new Pair("bottom_button_early_feedback", new C695950RRp(22, "ug")), new Pair("bottom_button_share_to_story", new C695950RRp(23, "social")), new Pair("bottom_button_dm_quick_reply", new C695950RRp(24, "social")), new Pair("bottom_button_view_more_stories", new C695950RRp(25, "social")), new Pair("bottom_button_product_add", new C695950RRp(26, "ecommerce")), new Pair("bottom_button_dm_box_unread_video", new C695950RRp(27, "social")), new Pair("bottom_button_incentive_share", new C695950RRp(28, "ug")), new Pair("bottom_button_quick_share", new C695950RRp(29, "social")), new Pair("bottom_button_prompt", new C695950RRp(30, "feed")), new Pair("bottom_button_template", new C695950RRp(31, "create")), new Pair("bottom_button_dm_join_group", new C695950RRp(32, "social")), new Pair("bottom_button_quick_external_share", new C695950RRp(33, "ug")), new Pair("bottom_button_low_active_survey", new C695950RRp(34, "ug")), new Pair("bottom_button_pro_guide_publish", new C695950RRp(35, "ug")), new Pair("bottom_button_shop_video_guide", new C695950RRp(35, "ecommerce")), new Pair("bottom_button_drama", new C695950RRp(36, "ogc")), new Pair("bottom_button_shop_video_guide_with_shop_cart", new C695950RRp(37, "ecommerce")), new Pair("bottom_button_inspiration_idea", new C695950RRp(38, "pgc")), new Pair("bottom_button_promote_post_button", new C695950RRp(38, "promote")), new Pair("bottom_button_promote_bottom_button", new C695950RRp(38, "promote")));

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(FeedBottomButtonContainer feedBottomButtonContainer, C0RYN c0ryn, InterfaceC697220RWm interfaceC697220RWm, C697520RXq c697520RXq) throws IllegalAccessException, InstantiationException {
        Aweme aweme;
        IECommerceFYPService eCommerceFYPService;
        LifecycleOwner lifecycleOwner;
        PriorityProtocol priorityProtocolLJII;
        PriorityProtocol priorityProtocolLJJI;
        PriorityProtocol priorityProtocolLJJII;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(feedBottomButtonContainer);
        C705960Rmc c705960Rmc = LIZ;
        String str = feedBottomButtonContainer.nJ2().eventType;
        c705960Rmc.getClass();
        ArrayList arrayList = new ArrayList();
        VideoRelationBtnTrigger videoRelationBtnTrigger = new VideoRelationBtnTrigger();
        String strLIZ = C694180RKu.LIZ(videoRelationBtnTrigger);
        VideoItemParams videoItemParamsLIZ = c0ryn.LIZ();
        if (videoItemParamsLIZ != null) {
            aweme = videoItemParamsLIZ.getAweme();
        } else {
            aweme = null;
        }
        if (!C299790Bp3.LIZIZ(aweme, strLIZ)) {
            arrayList.add(videoRelationBtnTrigger);
        }
        arrayList.add(new VideoDuetButtonTrigger());
        if (((Number) C269030AgX.LIZ.getValue()).intValue() == 1) {
            arrayList.add(new VideoTemplateButtonTrigger());
        }
        arrayList.add(new FollowButtonFFPTrigger());
        arrayList.add(new VideoExposeSharerInformationTrigger());
        if (C0R93.LIZ(str) && C0BJT.LIZ()) {
            arrayList.add(new FriendTabQuickCommentTrigger());
        } else {
            arrayList.add(new VideoQuickCommentTrigger());
        }
        arrayList.add(new VideoStitchButtonTrigger());
        arrayList.add(new AnalyticsInspirationButtonTrigger());
        arrayList.add(new AddYoursEntranceButtonTrigger());
        arrayList.add(new QuickDMEntranceTrigger());
        if (((Boolean) C0A5N.LIZ.getValue()).booleanValue()) {
            arrayList.add(new LiveNoticeCTAButtonTrigger());
        }
        arrayList.add(new EarlyFeedbackButtonTrigger());
        arrayList.add(new PushSurveyAssemTrigger());
        PriorityProtocol priorityProtocolLJIJJ = C1618440sDa.LIZIZ.LJJIIJ().LJIJJ();
        if (priorityProtocolLJIJJ != null) {
            arrayList.add(priorityProtocolLJIJJ);
        }
        if (C705980Rme.LIZ().enableLike == 1 || C705970Rmd.LIZ().enableLike == 1 || C706080Rmo.LIZ().enableLike == 1 || C706070Rmn.LIZ().enableLike == 1 || C1A1F.LIZIZ(str)) {
            arrayList.add(new MUFQuickDMBoxTrigger());
        }
        arrayList.add(new ShareUnreadVideoQuickDMTrigger());
        Object objLIZ = C04TD.LIZ(IECommerceFYPService.class, false);
        if (objLIZ != null) {
            eCommerceFYPService = (IECommerceFYPService) objLIZ;
        } else {
            eCommerceFYPService = new ECommerceFYPService();
        }
        PriorityProtocol priorityProtocolLIZ = eCommerceFYPService.LIZ();
        if (priorityProtocolLIZ != null) {
            arrayList.add(priorityProtocolLIZ);
        }
        arrayList.add(new IncentiveShareButtonTrigger());
        arrayList.add(new IncentiveBottomButtonTrigger());
        arrayList.add(new CollabInvitedButtonTrigger());
        IInternalShareApi.LIZ.getClass();
        C19719912Dl c19719912DlLJIIIZ = C1370970lmR.LIZ().LIZIZ().LJIIIZ();
        if (c19719912DlLJIIIZ != null) {
            Object objNewInstance = C09R7.LIZ(c19719912DlLJIIIZ).newInstance();
            if ((objNewInstance instanceof PriorityProtocol) && objNewInstance != null) {
                arrayList.add(objNewInstance);
            }
        }
        IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
        if (iMGroupChatApiLIZ != null && (priorityProtocolLJJII = iMGroupChatApiLIZ.LJJII()) != null) {
            arrayList.add(priorityProtocolLJJII);
        } else {
            if (interfaceC665370Q7zLJIIL instanceof LifecycleOwner) {
                lifecycleOwner = (LifecycleOwner) interfaceC665370Q7zLJIIL;
            } else {
                lifecycleOwner = null;
            }
            C1618506Vj.LIZJ(lifecycleOwner, new AwS590S0100000_11(interfaceC665370Q7zLJIIL, 484));
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null && (priorityProtocolLJJI = iEcomSearchService.LJJI(str)) != null) {
            arrayList.add(priorityProtocolLJJI);
        }
        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
        if (iECommerceMallService != null && (priorityProtocolLJII = iECommerceMallService.LJII()) != null) {
            arrayList.add(priorityProtocolLJII);
        }
        PriorityProtocol priorityProtocolLJIIIZ = ((IProGuidePublishService) ServiceManager.get().getService(IProGuidePublishService.class)).LJIIIZ();
        if (priorityProtocolLJIIIZ != null) {
            arrayList.add(priorityProtocolLJIIIZ);
        }
        C13IQ<? extends ReusedUIAssem<? extends C03H5>> c13iqLJI = C0SFC.LIZIZ.LJI();
        if (c13iqLJI != null) {
            Object objNewInstance2 = C09R7.LIZ(c13iqLJI).newInstance();
            if ((objNewInstance2 instanceof PriorityProtocol) && objNewInstance2 != null) {
                arrayList.add(objNewInstance2);
            }
        }
        arrayList.add(new FcpContainerAssem(new C721702rn(c0ryn), "standardized_bottom_button", interfaceC697220RWm, AFwS190S0000000_4.get$arr$(4298), c697520RXq));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, PriorityProtocol.class, C1697810uHb.LJIILJJIL(it2.next()));
        }
    }
}
