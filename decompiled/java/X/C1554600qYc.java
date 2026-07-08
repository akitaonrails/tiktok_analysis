package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.InteractTitleScope;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.InteractionGuideScope;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.MultiHostScope;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchPowerUpScope;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchScope;
import com.bytedance.android.live.scope.LiveFragmentScope;
import com.bytedance.android.live.walletclean.presentation.assem.WalletRechargePanelScope;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.scope.PcsIndustrySelectScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.dialog.PcsServicePlusOptinScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.BoardPageScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.CustomizedBoardScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.BoardSaveScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.BoardSceneryScope;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouScope;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SubSpaceDetailFragmentScope;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubWaveEmotePageScope;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.GiftAnchorPanelGiftPageScope;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.GiftAnchorPanelRecordPageScope;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.GiftAnchorPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidgetScope;
import com.bytedance.pipo.stellar.base.fragment.StellarFragmentScope;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenDataScope;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenEventScope;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.AdsReviewTabScope;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.DetailBottomKeyboardVScope;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.scope.DetailPageBottomBarScope;
import com.ss.android.ugc.aweme.comment.exposedcmt.FypExposedCommentScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerCellScope;
import com.ss.android.ugc.aweme.comment.photocomment.util.CommentPhotoDetailScope;
import com.ss.android.ugc.aweme.commentv2.CommentPageScope;
import com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.SingleCommentKeyboardVScope;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.scope.CommerceAgentFragmentScope;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentAnswerCardScope;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.base.CommerceAgentSendCardScope;
import com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusVSCope;
import com.ss.android.ugc.aweme.detail.DetailFragmentScope;
import com.ss.android.ugc.aweme.detail.lynxcard.DetailLynxCardScope;
import com.ss.android.ugc.aweme.dsp.arch.AudioCardScope;
import com.ss.android.ugc.aweme.dsp.arch.FragmentScope;
import com.ss.android.ugc.aweme.dsp.journey.JourneyScope;
import com.ss.android.ugc.aweme.dsp.library.LibraryScope;
import com.ss.android.ugc.aweme.dsp.minittm.adjusttag.TabFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitPageScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.SeaHeadViewHolderScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.SkuPropDropdownActionScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuPropValueSelectionActionScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.shared.SkuPropTitleActionScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.bottom.EcVideoGuideBottomButtonScope;
import com.ss.android.ugc.aweme.ecommerce.mall.service.ability.ShopMainMixFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixContainerScope;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixDataCenterScope;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.EcSearchMiddlePagerContainerScope;
import com.ss.android.ugc.aweme.ecommerce.search.page.ECSearchPageScope;
import com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchScope;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.SearchVerticalScope;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.EcSearchNoCartFypBottomButtonScope;
import com.ss.android.ugc.aweme.ecommerce.search.vision.ability.PhotoSearchRootFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoScope;
import com.ss.android.ugc.aweme.explore.scope.ExploreFeedComponentScope;
import com.ss.android.ugc.aweme.explore.scope.ExploreFragmentContainerScope;
import com.ss.android.ugc.aweme.fangroup.joinpanel.scheme.FanGroupJoinPanelScope;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.FeedBottomButtonContainerScope;
import com.ss.android.ugc.aweme.feed.adapter.PanelScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoBottomDescLabelContainerScope;
import com.ss.android.ugc.aweme.feed.assem.addyours.mob.AddYoursBottomButtonScope;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackScope;
import com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTABCope;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentScope;
import com.ss.android.ugc.aweme.feed.assem.quickreply.QuickDMFeedReplyScope;
import com.ss.android.ugc.aweme.feed.flexible.FlexibleRootFragmentScope;
import com.ss.android.ugc.aweme.feed.scope.LandscapeFeedScope;
import com.ss.android.ugc.aweme.feed.title.TitlePanelRootScope;
import com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragmentVScope;
import com.ss.android.ugc.aweme.friendstab.ui.tab.scope.FriendsFeedFragmentV3Scope;
import com.ss.android.ugc.aweme.friendstab.utils.FriendsFeedScope;
import com.ss.android.ugc.aweme.home.scope.WalletHomeScope;
import com.ss.android.ugc.aweme.im.actionbar.api.scope.ActionBarDataControllerScope;
import com.ss.android.ugc.aweme.im.actionbar.api.scope.ActionBarScope;
import com.ss.android.ugc.aweme.im.callroom.ui.CallRoomScope;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.scope.MessageRequestPageScope;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.creative.edit.impl.ui.IMEditPageScope;
import com.ss.android.ugc.aweme.im.creative.record.impl.framework.IMRecordPageScope;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailPageScope;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.util.EditShareScope;
import com.ss.android.ugc.aweme.im.ui.scope.HistorySearchFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.FollowerFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.notification.NotificationResultFragmentScope;
import com.ss.android.ugc.aweme.interactive.task.game.result.scope.GameResultPageScope;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVSCope;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.ContactAssemScope;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.OperationAssemScope;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SendAssemScope;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ShareImRootScope;
import com.ss.android.ugc.aweme.internalshare.impl.sharetouser.InternalShareDirectInputScope;
import com.ss.android.ugc.aweme.lemon.postmode.scope.LemonPostFragmentComponentScope;
import com.ss.android.ugc.aweme.minidrama.common.component.ad.DetailFeedFragmentScope;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainFragmentScope;
import com.ss.android.ugc.aweme.minis.page.main.scope.MinisMainScope;
import com.ss.android.ugc.aweme.music.highlight.HighlightScope;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleRenderScope;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import com.ss.android.ugc.aweme.notification.sysnotice.ability.SystemNotificationFragmentScope;
import com.ss.android.ugc.aweme.nows.ability.NowArchiveScope;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimFragmentScope;
import com.ss.android.ugc.aweme.poi.creator.PromoteStoresScope;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailScope;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiDishesGalleryScope;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryScope;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryScope;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitScope;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitFragmentScope;
import com.ss.android.ugc.aweme.poi.search.PoiSearchScope;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionScope;
import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ProfileTabBarScope;
import com.ss.android.ugc.aweme.protocol.PhotoViewCellScope;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainFragmentScope;
import com.ss.android.ugc.aweme.scope.MainPageFragmentScope;
import com.ss.android.ugc.aweme.scope.PhotoSlideScope;
import com.ss.android.ugc.aweme.scope.PostModeDetailScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.communication.SearchGridScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.communication.SearchHorizontalListScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.core.SearchUIComponentScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.detail.bottom.SearchDetailBottomBarScope;
import com.ss.android.ugc.aweme.search.detail.comment.ability.SearchDetailCommentScope;
import com.ss.android.ugc.aweme.search.detail.keyframe.vscope.SearchDetailKeyFrameBottomAssemVScope;
import com.ss.android.ugc.aweme.search.detail.keyframe.vscope.SearchDetailKeyFrameBottomTriggerVScope;
import com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope;
import com.ss.android.ugc.aweme.search.entry.searchbox.communication.SearchBoxComponentScope;
import com.ss.android.ugc.aweme.search.entry.visualsearch.communication.VisualSearchTagContainerScope;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentScope;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.communication.ChooseSearchMusicScope;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.communication.SearchMusicMiddlePageScope;
import com.ss.android.ugc.aweme.search.pages.core.ui.assem.SearchContainerFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.aigc.landingpage.ui.Top1AIGCLandingPageVScope;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoScope;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleClickScope;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleScope;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoScope;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingScope;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.container.SearchNimbleContainerCardScope;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.container.vertical.SearchVerticalNimbleScope;
import com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.SearchPovLandingPageVScope;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.ui.VideoSubCardScope;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentSource;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.SearchSevenSplitScreenRootFragmentScope;
import com.ss.android.ugc.aweme.search.pages.visualsearch.historysearch.ability.VisualSearchHistoryFragmentScope;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.VisualSearchRootFragmentScope;
import com.ss.android.ugc.aweme.search.pages.visualsearch.smartsearch.ability.SmartSearchRootFragmentScope;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner.BannerInteractAreaScope;
import com.ss.android.ugc.aweme.sidebar.components.protocol.SideBarScope;
import com.ss.android.ugc.aweme.stemfeed.scope.StemFeedFragmentScope;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryGuideCardScope;
import com.ss.android.ugc.aweme.story.feed.immersive.protocol.StoryGalleryActivityScope;
import com.ss.android.ugc.aweme.story.feed.immersive.scope.StoryBottomBarScope;
import com.ss.android.ugc.aweme.story.feed.immersive.scope.StoryTitleBarScope;
import com.ss.android.ugc.aweme.tako.aivideo.detail.scope.TakoAIVideoDetailScope;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerCardScope;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoCardCellScope;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoMixCardComponentScope;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoSendCardScope;
import com.ss.android.ugc.aweme.tako.camera.record.TakoSurfaceScope;
import com.ss.android.ugc.aweme.tako.detail.keyframe.vscope.TakoDetailKeyFrameBottomAssemVScope;
import com.ss.android.ugc.aweme.tako.detail.keyframe.vscope.TakoDetailKeyFrameBottomTriggerVScope;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoCreateTemplateScope;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewScope;
import com.ss.android.ugc.aweme.topicfeed.scope.TopicFeedFragmentScope;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusScope;
import com.ss.android.ugc.aweme.ui.page.CollabEditPageScope;
import com.ss.android.ugc.feed.platform.cell.RootCellScope;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.VideoAnnotationContainerScope;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.assem.FcpContainerScope;
import com.ss.android.ugc.feed.platform.container.scope.BottomBarComponentScope;
import com.ss.android.ugc.feed.platform.container.scope.CommonBannerProviderScope;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import com.ss.android.ugc.feed.platform.container.scope.FcpMetaTagContainerScope;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.feed.platform.container.scope.VideoTagComponentScope;
import com.ss.android.ugc.feed.platform.panel.RootPanelScope;
import com.ss.android.ugc.nearby.container.NearbyFragmentScope;
import com.ss.android.ugc.nearby.roaming.NearbyRegionScope;
import com.ss.android.ugc.now.interaction.CommentListFragmentScope;
import com.ss.android.ugc.now.interaction.InteractionFragmentScope;
import com.ss.android.ugc.profile.business.profile.tab.card.protocol.GuideCardScope;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsScope;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowScope;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarScope;
import com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformScope;
import com.ss.android.ugc.tiktok.addyours.hub.AddYoursHubScope;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursDetailScope;
import com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteScope;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.SelectorContentPageContainerScope;
import java.util.List;

/* JADX INFO: renamed from: X.0qYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554600qYc {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1558510qev());

    public static final List<Class<Object>> LIZIZ(Class<?> cls) {
        Class[] clsArr;
        switch (cls.getCanonicalName().hashCode()) {
            case -2134517744:
                clsArr = new Class[]{SearchPlayerScope.class};
                break;
            case -2104937216:
                clsArr = new Class[]{CommentListFragmentScope.class};
                break;
            case -2084430433:
                clsArr = new Class[]{TranslationStatusScope.class};
                break;
            case -2070872612:
                clsArr = new Class[]{RootCellScope.class};
                break;
            case -2056145780:
                clsArr = new Class[]{CommentInnerCellScope.class};
                break;
            case -2055274713:
                clsArr = new Class[]{MixCardScope.class};
                break;
            case -2042693600:
                clsArr = new Class[]{ECSearchPageScope.class};
                break;
            case -2036996255:
                clsArr = new Class[]{SearchResultFragmentScope.class};
                break;
            case -2027317921:
                clsArr = new Class[]{TakoCreateTemplateScope.class};
                break;
            case -2006464570:
                clsArr = new Class[]{CellInteractAreaScope.class};
                break;
            case -2005867118:
                clsArr = new Class[]{RavenEventScope.class, RavenDataScope.class};
                break;
            case -2002131048:
                clsArr = new Class[]{SearchFragmentScope.class};
                break;
            case -1990187301:
                clsArr = new Class[]{SeaPdpFragmentScope.class};
                break;
            case -1989202358:
                clsArr = new Class[]{SearchCardScope.class};
                break;
            case -1987814245:
                clsArr = new Class[]{SearchVideoScope.class, SearchCLASubtitleClickScope.class};
                break;
            case -1950174511:
                clsArr = new Class[]{TakoMixCardComponentScope.class};
                break;
            case -1921604184:
                clsArr = new Class[]{CampusFlowScope.class};
                break;
            case -1906364372:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case -1906364371:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case -1904872155:
                clsArr = new Class[]{SearchHorizontalListScope.class};
                break;
            case -1890032488:
                clsArr = new Class[]{FriendsFeedFragmentV3Scope.class};
                break;
            case -1887089139:
                clsArr = new Class[]{GameResultPageScope.class};
                break;
            case -1867628725:
                clsArr = new Class[]{ShareImRootScope.class};
                break;
            case -1858839323:
                clsArr = new Class[]{VisualSearchRootFragmentScope.class};
                break;
            case -1857608731:
                clsArr = new Class[]{ProfileTabBarScope.class};
                break;
            case -1812965106:
                clsArr = new Class[]{VideoSubCardScope.class};
                break;
            case -1805047585:
                clsArr = new Class[]{TakoDetailKeyFrameBottomTriggerVScope.class};
                break;
            case -1801777670:
                clsArr = new Class[]{SearchFragmentScope.class};
                break;
            case -1788470484:
                clsArr = new Class[]{EcVideoGuideBottomButtonScope.class};
                break;
            case -1785502189:
                clsArr = new Class[]{TakoFragmentScope.class, TakoMultiImagePreviewScope.class};
                break;
            case -1772576120:
                clsArr = new Class[]{PhotoSlideScope.class};
                break;
            case -1771510138:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -1771220873:
                clsArr = new Class[]{CommerceAgentSendCardScope.class};
                break;
            case -1768757260:
                clsArr = new Class[]{HistorySearchFragmentScope.class};
                break;
            case -1767172570:
                clsArr = new Class[]{ContactSelectorFragmentScope.class};
                break;
            case -1745278508:
                clsArr = new Class[]{NavbarScope.class};
                break;
            case -1701629269:
                clsArr = new Class[]{NotificationResultFragmentScope.class};
                break;
            case -1687457743:
                clsArr = new Class[]{RootPanelScope.class};
                break;
            case -1658083618:
                clsArr = new Class[]{MultiHostScope.class};
                break;
            case -1654901441:
                clsArr = new Class[]{VideoCellScope.class, CommonVideoCellScope.class};
                break;
            case -1652822058:
                clsArr = new Class[]{LiveFragmentScope.class};
                break;
            case -1652755029:
                clsArr = new Class[]{LinkMicScope.class};
                break;
            case -1637423932:
                clsArr = new Class[]{AddYoursBottomButtonScope.class};
                break;
            case -1636422406:
                clsArr = new Class[]{BulletinFragmentScope.class};
                break;
            case -1631962246:
                clsArr = new Class[]{ShopMainMixFragmentScope.class};
                break;
            case -1627100918:
                clsArr = new Class[]{CreatorNoticeTabScope.class};
                break;
            case -1626355639:
                clsArr = new Class[]{GiftAnchorPanelScope.class};
                break;
            case -1616564642:
                clsArr = new Class[]{TakoSendCardScope.class};
                break;
            case -1606058149:
                clsArr = new Class[]{TranslationStatusScope.class};
                break;
            case -1602175514:
                clsArr = new Class[]{SearchDetailBottomBarScope.class};
                break;
            case -1591297363:
                clsArr = new Class[]{SearchPovLandingPageVScope.class};
                break;
            case -1585356909:
                clsArr = new Class[]{BulletinFragmentScope.class};
                break;
            case -1546181682:
                clsArr = new Class[]{ChatDetailPageScope.class};
                break;
            case -1545335901:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -1543786288:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -1515372478:
                clsArr = new Class[]{EcSearchMiddlePagerContainerScope.class};
                break;
            case -1498738039:
                clsArr = new Class[]{CommentPageScope.class};
                break;
            case -1490700451:
                clsArr = new Class[]{VideoTagComponentScope.class};
                break;
            case -1488224799:
                clsArr = new Class[]{PoiPublishExtensionScope.class};
                break;
            case -1464118425:
                clsArr = new Class[]{SendAssemScope.class};
                break;
            case -1456201684:
                clsArr = new Class[]{InboxFragmentScope.class};
                break;
            case -1433292230:
                clsArr = new Class[]{SearchBoxComponentScope.class};
                break;
            case -1409806425:
                clsArr = new Class[]{TakoFragmentScope.class};
                break;
            case -1393202620:
                clsArr = new Class[]{SelectorContentPageContainerScope.class};
                break;
            case -1368801365:
                clsArr = new Class[]{GuideCardScope.class};
                break;
            case -1365421664:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case -1362348535:
                clsArr = new Class[]{MixDataCenterScope.class, MixContainerScope.class, MixEventCenterScope.class};
                break;
            case -1349227419:
                clsArr = new Class[]{QuickDMFeedReplyScope.class};
                break;
            case -1344517303:
                clsArr = new Class[]{SearchGridScope.class};
                break;
            case -1343354853:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -1315108572:
                clsArr = new Class[]{FindSchoolFriendsScope.class};
                break;
            case -1294692575:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -1286960942:
                clsArr = new Class[]{PhotoSearchRootFragmentScope.class};
                break;
            case -1285970045:
                clsArr = new Class[]{DetailPageBottomBarScope.class};
                break;
            case -1278980258:
                clsArr = new Class[]{VideoPlayerFragmentScope.class};
                break;
            case -1270292503:
                clsArr = new Class[]{Top1AIGCLandingPageVScope.class};
                break;
            case -1243989479:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -1221863294:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -1199228213:
                clsArr = new Class[]{VideoSubCardScope.class};
                break;
            case -1175813632:
                clsArr = new Class[]{TitlePanelRootScope.class, CommentRootFragmentScope.class, CommentPageScope.class};
                break;
            case -1171373722:
                clsArr = new Class[]{MatchScope.class};
                break;
            case -1166216110:
                clsArr = new Class[]{PcsIndustrySelectScope.class};
                break;
            case -1149532754:
                clsArr = new Class[]{SearchFragmentScope.class};
                break;
            case -1109711039:
                clsArr = new Class[]{BottomBarComponentScope.class};
                break;
            case -1105884824:
                clsArr = new Class[]{PoiGalleryScope.class};
                break;
            case -1089025460:
                clsArr = new Class[]{CommerceAgentFragmentScope.class};
                break;
            case -1086635990:
                clsArr = new Class[]{ChatDetailPageScope.class};
                break;
            case -1086396140:
                clsArr = new Class[]{DramaTopTabMainFragmentScope.class};
                break;
            case -1086361239:
                clsArr = new Class[]{PoiRevisitFragmentScope.class};
                break;
            case -1077393433:
                clsArr = new Class[]{CampaignPanelScope.class};
                break;
            case -1057154648:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -1049408778:
                clsArr = new Class[]{CommentKeyboardScope.class};
                break;
            case -1048489475:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -1034780811:
                clsArr = new Class[]{SearchVerticalScope.class};
                break;
            case -1027908171:
                clsArr = new Class[]{FeedBottomButtonContainerScope.class};
                break;
            case -1014138488:
                clsArr = new Class[]{FollowerFragmentScope.class};
                break;
            case -975096015:
                clsArr = new Class[]{PoiClaimFragmentScope.class};
                break;
            case -967785960:
                clsArr = new Class[]{SearchFragmentScope.class};
                break;
            case -960547254:
                clsArr = new Class[]{BannerInteractAreaScope.class};
                break;
            case -940699097:
                clsArr = new Class[]{LinkMicScope.class};
                break;
            case -938638404:
                clsArr = new Class[]{FcpContainerScope.class};
                break;
            case -926518651:
                clsArr = new Class[]{FragmentScope.class};
                break;
            case -921574820:
                clsArr = new Class[]{ExploreFeedComponentScope.class};
                break;
            case -913595192:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -900240837:
                clsArr = new Class[]{SearchMusicMiddlePageScope.class};
                break;
            case -877450963:
                clsArr = new Class[]{SearchFragmentScope.class};
                break;
            case -877363999:
                clsArr = new Class[]{ExploreFeedComponentScope.class};
                break;
            case -846478621:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case -840422530:
                clsArr = new Class[]{FanGroupJoinPanelScope.class};
                break;
            case -835021819:
                clsArr = new Class[]{SideBarScope.class};
                break;
            case -803900759:
                clsArr = new Class[]{ActionBarDataControllerScope.class};
                break;
            case -802852593:
                clsArr = new Class[]{TabFragmentScope.class};
                break;
            case -721834929:
                clsArr = new Class[]{SearchPlayerScope.class};
                break;
            case -713197691:
                clsArr = new Class[]{SingleCommentKeyboardVScope.class};
                break;
            case -702298763:
                clsArr = new Class[]{IMEditPageScope.class};
                break;
            case -693459058:
                clsArr = new Class[]{SearchVerticalScope.class};
                break;
            case -677205291:
                clsArr = new Class[]{EarlyFeedbackScope.class};
                break;
            case -676746501:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -644928036:
                clsArr = new Class[]{MessageRequestPageScope.class};
                break;
            case -643858183:
                clsArr = new Class[]{TakoDetailKeyFrameBottomAssemVScope.class};
                break;
            case -624003238:
                clsArr = new Class[]{DetailFeedFragmentScope.class};
                break;
            case -572231513:
                clsArr = new Class[]{VideoSubCardScope.class};
                break;
            case -556242106:
                clsArr = new Class[]{ChatDetailPageScope.class};
                break;
            case -552670043:
                clsArr = new Class[]{VideoTagComponentScope.class};
                break;
            case -546169605:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -544288268:
                clsArr = new Class[]{ECSearchPageScope.class};
                break;
            case -534792762:
                clsArr = new Class[]{BoardSaveScope.class};
                break;
            case -527733476:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case -527733475:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case -527733474:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case -527733473:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case -518014394:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -484335496:
                clsArr = new Class[]{CommentPageScope.class};
                break;
            case -469879308:
                clsArr = new Class[]{DramaTopTabMainFragmentScope.class};
                break;
            case -468290587:
                clsArr = new Class[]{BulletinFragmentScope.class};
                break;
            case -467664744:
                clsArr = new Class[]{VisualSearchTagContainerScope.class};
                break;
            case -465135313:
                clsArr = new Class[]{PanelScope.class};
                break;
            case -464645713:
                clsArr = new Class[]{StoryGalleryActivityScope.class};
                break;
            case -455130301:
                clsArr = new Class[]{FriendsFeedFragmentV3Scope.class};
                break;
            case -453155410:
                clsArr = new Class[]{CommonVideoCellScope.class};
                break;
            case -441703197:
                clsArr = new Class[]{OrderSubmitPageScope.class};
                break;
            case -438828038:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -425013710:
                clsArr = new Class[]{VideoAnnotationContainerScope.class};
                break;
            case -411261796:
                clsArr = new Class[]{ExploreFragmentContainerScope.class};
                break;
            case -409100715:
                clsArr = new Class[]{PdpCarouselScope.class};
                break;
            case -408720268:
                clsArr = new Class[]{CellInteractAreaScope.class};
                break;
            case -408291522:
                clsArr = new Class[]{GiftAnchorPanelGiftPageScope.class};
                break;
            case -407418683:
                clsArr = new Class[]{SeaHeadViewHolderScope.class};
                break;
            case -404315768:
                clsArr = new Class[]{NearbyRegionScope.class};
                break;
            case -401933125:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case -395798047:
                clsArr = new Class[]{InternalShareDirectInputScope.class};
                break;
            case -393687431:
                clsArr = new Class[]{CallRoomScope.class};
                break;
            case -390512940:
                clsArr = new Class[]{ChatRoomScope.class};
                break;
            case -387493606:
                clsArr = new Class[]{SearchPlayerScope.class};
                break;
            case -386557129:
                clsArr = new Class[]{CommentRootFragmentScope.class};
                break;
            case -381376915:
                clsArr = new Class[]{SearchCLASubtitleScope.class};
                break;
            case -369283029:
                clsArr = new Class[]{SearchPlayerScope.class};
                break;
            case -284499256:
                clsArr = new Class[]{SearchMusicMiddlePageScope.class};
                break;
            case -280139755:
                clsArr = new Class[]{RootCellScope.class};
                break;
            case -263195922:
                clsArr = new Class[]{VisualSearchHistoryFragmentScope.class};
                break;
            case -257350380:
                clsArr = new Class[]{FlexibleRootFragmentScope.class};
                break;
            case -254319450:
                clsArr = new Class[]{ProfilePlatformScope.class};
                break;
            case -239675944:
                clsArr = new Class[]{PhotoSearchRootFragmentScope.class};
                break;
            case -237922348:
                clsArr = new Class[]{EcSearchNoCartFypBottomButtonScope.class};
                break;
            case -237138791:
                clsArr = new Class[]{HighlightScope.class};
                break;
            case -227520207:
                clsArr = new Class[]{SearchDetailKeyFrameBottomTriggerVScope.class};
                break;
            case -220480886:
                clsArr = new Class[]{SearchCLASubtitleScope.class};
                break;
            case -217008280:
                clsArr = new Class[]{TakoAnswerCardScope.class};
                break;
            case -216612277:
                clsArr = new Class[]{LiveNoticeCTABCope.class};
                break;
            case -208339241:
                clsArr = new Class[]{SearchPlayerScope.class};
                break;
            case -171145753:
                clsArr = new Class[]{SearchHorizontalListScope.class};
                break;
            case -165279679:
                clsArr = new Class[]{PcsServicePlusOptinScope.class};
                break;
            case -150664603:
                clsArr = new Class[]{StellarFragmentScope.class};
                break;
            case -145986708:
                clsArr = new Class[]{PostModeDetailScope.class};
                break;
            case -126511029:
                clsArr = new Class[]{SearchVerticalScope.class};
                break;
            case -122968496:
                clsArr = new Class[]{BoardPageScope.class};
                break;
            case -114893246:
                clsArr = new Class[]{MessageRequestPageScope.class};
                break;
            case -112314384:
                clsArr = new Class[]{EcTakePhotoScope.class};
                break;
            case -73768173:
                clsArr = new Class[]{VideoBottomDescLabelContainerScope.class};
                break;
            case -57893017:
                clsArr = new Class[]{SearchDetailKeyFrameBottomAssemVScope.class};
                break;
            case -20426534:
                clsArr = new Class[]{CommerceAgentFragmentScope.class};
                break;
            case -2543091:
                clsArr = new Class[]{SearchDetailCommentScope.class};
                break;
            case 3378297:
                clsArr = new Class[]{InteractionFragmentScope.class};
                break;
            case 8464934:
                clsArr = new Class[]{FriendsFeedScope.class};
                break;
            case 9666320:
                clsArr = new Class[]{TabFragmentScope.class};
                break;
            case 19141621:
                clsArr = new Class[]{SearchTopFragmentSource.class};
                break;
            case 47049963:
                clsArr = new Class[]{LibraryScope.class};
                break;
            case 49136189:
                clsArr = new Class[]{SearchHorizontalListScope.class};
                break;
            case 67714502:
                clsArr = new Class[]{CommentKeyboardScope.class};
                break;
            case 111543259:
                clsArr = new Class[]{RootCellScope.class};
                break;
            case 131376383:
                clsArr = new Class[]{ChooseSearchMusicScope.class};
                break;
            case 134288843:
                clsArr = new Class[]{SearchHorizontalListScope.class};
                break;
            case 140522014:
                clsArr = new Class[]{GiftAnchorPanelScope.class};
                break;
            case 198502316:
                clsArr = new Class[]{PoiRecommendDishesGalleryScope.class};
                break;
            case 205663415:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 221764739:
                clsArr = new Class[]{TakoMultiImagePreviewScope.class};
                break;
            case 229787986:
                clsArr = new Class[]{SystemNotificationFragmentScope.class};
                break;
            case 271564615:
                clsArr = new Class[]{VisualSearchRootFragmentScope.class};
                break;
            case 277349653:
                clsArr = new Class[]{SubSpaceDetailFragmentScope.class};
                break;
            case 290258766:
                clsArr = new Class[]{AudioCardScope.class};
                break;
            case 303194441:
                clsArr = new Class[]{MainPageFragmentScope.class};
                break;
            case 325160030:
                clsArr = new Class[]{CommentPageScope.class};
                break;
            case 325160031:
                clsArr = new Class[]{CommentPageScope.class};
                break;
            case 348209159:
                clsArr = new Class[]{RootPanelScope.class};
                break;
            case 350211234:
                clsArr = new Class[]{SearchCLASubtitleClickScope.class};
                break;
            case 352067607:
                clsArr = new Class[]{MainActivityScope.class};
                break;
            case 353507820:
                clsArr = new Class[]{PoiDishesGalleryScope.class};
                break;
            case 426172392:
                clsArr = new Class[]{MatchScope.class};
                break;
            case 432376585:
                clsArr = new Class[]{LandscapeFeedScope.class};
                break;
            case 438073930:
                clsArr = new Class[]{LandscapeFeedScope.class, CommonVideoCellScope.class};
                break;
            case 438909828:
                clsArr = new Class[]{SearchVideoScope.class};
                break;
            case 445550213:
                clsArr = new Class[]{ChatRoomScope.class};
                break;
            case 472576449:
                clsArr = new Class[]{QuickDMFeedReplyScope.class};
                break;
            case 482160091:
                clsArr = new Class[]{BundlePanelFragmentScope.class};
                break;
            case 486862223:
                clsArr = new Class[]{SearchUIComponentScope.class};
                break;
            case 492470864:
                clsArr = new Class[]{SearchFragmentScope.class};
                break;
            case 494074270:
                clsArr = new Class[]{DetailBottomKeyboardVScope.class};
                break;
            case 494891358:
                clsArr = new Class[]{SearchPlayerScope.class};
                break;
            case 524344290:
                clsArr = new Class[]{SearchContainerFragmentScope.class};
                break;
            case 530326693:
                clsArr = new Class[]{MatchScope.class};
                break;
            case 549443090:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case 553872877:
                clsArr = new Class[]{SubWaveEmotePageScope.class};
                break;
            case 555730631:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 556042200:
                clsArr = new Class[]{InteractTitleScope.class};
                break;
            case 565580622:
                clsArr = new Class[]{NearbyFragmentScope.class};
                break;
            case 573276719:
                clsArr = new Class[]{CollabEditPageScope.class};
                break;
            case 573850906:
                clsArr = new Class[]{PhotoViewCellScope.class};
                break;
            case 596106803:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case 598518425:
                clsArr = new Class[]{EcAISearchScope.class};
                break;
            case 616763034:
                clsArr = new Class[]{SkuPropValueSelectionActionScope.class, SkuPropTitleActionScope.class};
                break;
            case 626113610:
                clsArr = new Class[]{TakoFragmentScope.class, TakoMultiImagePreviewScope.class};
                break;
            case 627088573:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 628057954:
                clsArr = new Class[]{DetailFragmentScope.class};
                break;
            case 643851182:
                clsArr = new Class[]{SearchPlayerScope.class};
                break;
            case 683138905:
                clsArr = new Class[]{MainActivityScope.class};
                break;
            case 685268328:
                clsArr = new Class[]{LinkMicScope.class};
                break;
            case 688836250:
                clsArr = new Class[]{MainFragmentScope.class};
                break;
            case 699778421:
                clsArr = new Class[]{AdsReviewTabScope.class};
                break;
            case 701541796:
                clsArr = new Class[]{SearchCardScope.class, SearchCLASubtitleScope.class};
                break;
            case 721741016:
                clsArr = new Class[]{PanelScope.class};
                break;
            case 727562609:
                clsArr = new Class[]{ContactSelectorFragmentScope.class};
                break;
            case 729750295:
                clsArr = new Class[]{WalletRechargePanelScope.class};
                break;
            case 751905320:
                clsArr = new Class[]{ActionBarScope.class};
                break;
            case 775225114:
                clsArr = new Class[]{SearchVerticalScope.class};
                break;
            case 785928008:
                clsArr = new Class[]{RootCellScope.class};
                break;
            case 805390446:
                clsArr = new Class[]{StemFeedFragmentScope.class};
                break;
            case 819470803:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 831840625:
                clsArr = new Class[]{BoardSceneryScope.class};
                break;
            case 832022906:
                clsArr = new Class[]{SmartSearchRootFragmentScope.class};
                break;
            case 835436468:
                clsArr = new Class[]{JourneyScope.class};
                break;
            case 845052826:
                clsArr = new Class[]{TakoFragmentScope.class, TakoMultiImagePreviewScope.class};
                break;
            case 871952340:
                clsArr = new Class[]{SkuPropDropdownActionScope.class, SkuPropTitleActionScope.class};
                break;
            case 882326271:
                clsArr = new Class[]{ContactAssemScope.class};
                break;
            case 899397942:
                clsArr = new Class[]{ChatRoomScope.class};
                break;
            case 901725015:
                clsArr = new Class[]{RootCellScope.class};
                break;
            case 919442117:
                clsArr = new Class[]{LiveFragmentScope.class};
                break;
            case 919871871:
                clsArr = new Class[]{IMRecordPageScope.class};
                break;
            case 930941814:
                clsArr = new Class[]{CommonVideoCellScope.class};
                break;
            case 937658203:
                clsArr = new Class[]{TakoCardCellScope.class};
                break;
            case 938177895:
                clsArr = new Class[]{FcpContainerScope.class};
                break;
            case 953901732:
                clsArr = new Class[]{StoryTitleBarScope.class};
                break;
            case 959250132:
                clsArr = new Class[]{SearchResultFragmentScope.class};
                break;
            case 988018184:
                clsArr = new Class[]{SearchVerticalNimbleScope.class};
                break;
            case 995426343:
                clsArr = new Class[]{EditShareScope.class};
                break;
            case 999101359:
                clsArr = new Class[]{CommentRootFragmentScope.class};
                break;
            case 1004048052:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 1004640020:
                clsArr = new Class[]{SearchCardScope.class};
                break;
            case 1005917116:
                clsArr = new Class[]{GiftAnchorPanelRecordPageScope.class};
                break;
            case 1037495939:
                clsArr = new Class[]{TcmOrderStatusVSCope.class};
                break;
            case 1056870367:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 1062405767:
                clsArr = new Class[]{PoiOrderSubmitScope.class};
                break;
            case 1064747253:
                clsArr = new Class[]{ChatDetailPageScope.class};
                break;
            case 1067921359:
                clsArr = new Class[]{OrderSubmitPageScope.class};
                break;
            case 1100459253:
                clsArr = new Class[]{AddYoursDetailScope.class};
                break;
            case 1101420641:
                clsArr = new Class[]{CampaignPanelScope.class};
                break;
            case 1108699384:
                clsArr = new Class[]{AddYoursHubScope.class};
                break;
            case 1116678056:
                clsArr = new Class[]{SearchNimbleContainerCardScope.class};
                break;
            case 1123183036:
                clsArr = new Class[]{SearchCLASubtitleClickScope.class};
                break;
            case 1126079664:
                clsArr = new Class[]{SearchFragmentScope.class};
                break;
            case 1128551856:
                clsArr = new Class[]{SearchHorizontalListScope.class};
                break;
            case 1145984415:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 1182925484:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 1186503363:
                clsArr = new Class[]{LinkMicScope.class};
                break;
            case 1206351331:
                clsArr = new Class[]{CustomizedBoardScope.class};
                break;
            case 1236361559:
                clsArr = new Class[]{PhotoSearchRootFragmentScope.class};
                break;
            case 1257961281:
                clsArr = new Class[]{CommentPhotoDetailScope.class};
                break;
            case 1264753061:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 1301554146:
                clsArr = new Class[]{FcpMetaTagContainerScope.class};
                break;
            case 1313830532:
                clsArr = new Class[]{PoiSearchScope.class};
                break;
            case 1333796056:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 1337580644:
                clsArr = new Class[]{LemonPostFragmentComponentScope.class};
                break;
            case 1368284193:
                clsArr = new Class[]{BulletinEditFragmentScope.class, BulletinFragmentScope.class};
                break;
            case 1383791980:
                clsArr = new Class[]{ChatRoomScope.class};
                break;
            case 1411340091:
                clsArr = new Class[]{ChatDetailPageScope.class};
                break;
            case 1412414620:
                clsArr = new Class[]{BulletinEditFragmentScope.class};
                break;
            case 1413091201:
                clsArr = new Class[]{NimbleRenderScope.class};
                break;
            case 1421016993:
                clsArr = new Class[]{AddYoursInviteScope.class};
                break;
            case 1440616721:
                clsArr = new Class[]{EcTakePhotoScope.class};
                break;
            case 1457853874:
                clsArr = new Class[]{RootCellScope.class};
                break;
            case 1465387084:
                clsArr = new Class[]{TakoAIVideoDetailScope.class};
                break;
            case 1482209089:
                clsArr = new Class[]{CommerceAgentAnswerCardScope.class};
                break;
            case 1510760809:
                clsArr = new Class[]{SearchPhotoScope.class};
                break;
            case 1519655029:
                clsArr = new Class[]{CampaignPanelScope.class};
                break;
            case 1524153894:
                clsArr = new Class[]{StoryBottomBarScope.class};
                break;
            case 1556348888:
                clsArr = new Class[]{FriendsTextPublishKeyboardFragmentVScope.class};
                break;
            case 1567162919:
                clsArr = new Class[]{TakoFragmentScope.class};
                break;
            case 1575488543:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 1581088794:
                clsArr = new Class[]{MinisMainScope.class};
                break;
            case 1583284963:
                clsArr = new Class[]{CommonVideoCellScope.class};
                break;
            case 1596010621:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 1601588492:
                clsArr = new Class[]{CommonVideoCellScope.class};
                break;
            case 1602476128:
                clsArr = new Class[]{StoryGuideCardScope.class};
                break;
            case 1638841988:
                clsArr = new Class[]{InboxSearchFragmentScope.class};
                break;
            case 1648078678:
                clsArr = new Class[]{PromoteStoresScope.class};
                break;
            case 1663275958:
                clsArr = new Class[]{ExploreFragmentContainerScope.class};
                break;
            case 1682822038:
                clsArr = new Class[]{VideoQuickCommentScope.class};
                break;
            case 1689033418:
                clsArr = new Class[]{FcpContainerScope.class};
                break;
            case 1714804262:
                clsArr = new Class[]{DetailLynxCardScope.class};
                break;
            case 1727960444:
                clsArr = new Class[]{InteractionGuideScope.class};
                break;
            case 1728961211:
                clsArr = new Class[]{NowArchiveScope.class};
                break;
            case 1772741099:
                clsArr = new Class[]{SearchImageLandingScope.class};
                break;
            case 1782604696:
                clsArr = new Class[]{OperationAssemScope.class};
                break;
            case 1815854849:
                clsArr = new Class[]{BulletinFragmentScope.class};
                break;
            case 1820244752:
                clsArr = new Class[]{RootCellScope.class};
                break;
            case 1825368255:
                clsArr = new Class[]{CallRoomScope.class};
                break;
            case 1848340752:
                clsArr = new Class[]{CommonBannerProviderScope.class};
                break;
            case 1854442395:
                clsArr = new Class[]{IntelligentBoardTemplateForYouScope.class};
                break;
            case 1856900677:
                clsArr = new Class[]{PoiDetailScope.class};
                break;
            case 1857838317:
                clsArr = new Class[]{RootPanelScope.class};
                break;
            case 1857862849:
                clsArr = new Class[]{GiftWidgetScope.class};
                break;
            case 1878427196:
                clsArr = new Class[]{ExploreFeedComponentScope.class};
                break;
            case 1886037827:
                clsArr = new Class[]{TopicFeedFragmentScope.class};
                break;
            case 1898010656:
                clsArr = new Class[]{CommonBannerProviderScope.class};
                break;
            case 1903257200:
                clsArr = new Class[]{TakoSurfaceScope.class};
                break;
            case 1904943454:
                clsArr = new Class[]{LiveFragmentScope.class};
                break;
            case 1918542045:
                clsArr = new Class[]{SearchPlayerScope.class};
                break;
            case 1918832960:
                clsArr = new Class[]{RootCellScope.class};
                break;
            case 1931263561:
                clsArr = new Class[]{PdpFragmentScope.class};
                break;
            case 1944096575:
                clsArr = new Class[]{VideoCellScope.class};
                break;
            case 1948673448:
                clsArr = new Class[]{FypExposedCommentScope.class};
                break;
            case 1962881940:
                clsArr = new Class[]{QuickShareVSCope.class};
                break;
            case 1972378803:
                clsArr = new Class[]{WalletHomeScope.class};
                break;
            case 1975184186:
                clsArr = new Class[]{SearchSevenSplitScreenRootFragmentScope.class};
                break;
            case 1976109200:
                clsArr = new Class[]{MatchPowerUpScope.class};
                break;
            case 1986905177:
                clsArr = new Class[]{com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment.SubSpaceDetailFragmentScope.class};
                break;
            case 2026425670:
                clsArr = new Class[]{ChatDetailPageScope.class};
                break;
            case 2048428180:
                clsArr = new Class[]{BoardSaveScope.class};
                break;
            case 2059268199:
                clsArr = new Class[]{RootPanelScope.class};
                break;
            case 2141273201:
                clsArr = new Class[]{LinkMicScope.class};
                break;
            default:
                return C13BV.INSTANCE;
        }
        List<Class<Object>> listLJJLL = C13LQ.LJJLL(clsArr);
        if (listLJJLL != null) {
            return listLJJLL;
        }
        return C13BV.INSTANCE;
    }

    public static final InterfaceC665370Q7z LIZ(Object obj) {
        if (obj instanceof C19EG) {
            return C1558360qeg.LJI((C19EG) obj, null);
        }
        if (obj instanceof Fragment) {
            return C1558360qeg.LJFF((Fragment) obj, null);
        }
        if (obj instanceof AbstractC738140SxQ) {
            return C1558520qew.LJIIL((AbstractC738140SxQ) obj);
        }
        if (obj instanceof InterfaceC713360RyY) {
            return C1558420qem.LIZIZ((InterfaceC713360RyY) obj);
        }
        if (!(obj instanceof InterfaceC665370Q7z)) {
            return null;
        }
        return (InterfaceC665370Q7z) obj;
    }

    public static final Object LIZLLL(Object obj) {
        if (obj instanceof C19EG) {
            return null;
        }
        if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            if (fragment.getParentFragment() == null) {
                return fragment.getActivity();
            }
            return fragment.getParentFragment();
        }
        if (obj instanceof AbstractC738140SxQ) {
            return ((AbstractC738140SxQ) obj).getParent();
        }
        if (obj instanceof InterfaceC713360RyY) {
            InterfaceC665370Q7z interfaceC665370Q7zK0 = ((InterfaceC713360RyY) obj).k0();
            if (interfaceC665370Q7zK0 == null) {
                return null;
            }
            return interfaceC665370Q7zK0.getHost();
        }
        if (obj instanceof View) {
            View view = (View) obj;
            Fragment fragmentLIZ = C946803n0.LIZ(view);
            if (fragmentLIZ != null) {
                return fragmentLIZ;
            }
            return view.getContext();
        }
        if (!(obj instanceof InterfaceC665370Q7z)) {
            return null;
        }
        return ((InterfaceC665370Q7z) obj).getTree().LJIIIIZZ();
    }

    public static final <T extends InterfaceC494301wD> String LIZJ(InterfaceC665370Q7z interfaceC665370Q7z, Class<? extends T> cls) {
        InterfaceC2753014t source;
        InterfaceC1554640qYg interfaceC1554640qYg;
        InterfaceC494301wD interfaceC494301wDProvideAbility;
        Context context;
        C1554630qYf c1554630qYf;
        InterfaceC1554640qYg interfaceC1554640qYg2;
        C1554630qYf c1554630qYf2;
        Object objLIZ = null;
        String strLJFF = C1558520qew.LJFF(cls, null);
        if (strLJFF == null) {
            strLJFF = "source_default_key";
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, strLJFF, C1554630qYf.class, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("class > ");
        sbLIZ.append(cls);
        sbLIZ.append(" >>>>host > ");
        sbLIZ.append(interfaceC665370Q7z.getHost());
        sbLIZ.append(" >>>>is source null? > ");
        sbLIZ.append(interfaceC1555100qZQLIZIZ);
        sbLIZ.append(" >>>> is source.value null? > ");
        if (interfaceC1555100qZQLIZIZ != null) {
            source = interfaceC1555100qZQLIZIZ.getSource();
        } else {
            source = null;
        }
        sbLIZ.append(source);
        sbLIZ.append(" >>>> is source.ability null? > ");
        if (interfaceC1555100qZQLIZIZ != null && (c1554630qYf2 = (C1554630qYf) interfaceC1555100qZQLIZIZ.getSource()) != null) {
            interfaceC1554640qYg = c1554630qYf2.LL;
        } else {
            interfaceC1554640qYg = null;
        }
        sbLIZ.append(interfaceC1554640qYg);
        sbLIZ.append(" >>>> is can not provide ability? > ");
        if (interfaceC1555100qZQLIZIZ != null && (c1554630qYf = (C1554630qYf) interfaceC1555100qZQLIZIZ.getSource()) != null && (interfaceC1554640qYg2 = c1554630qYf.LL) != null) {
            interfaceC494301wDProvideAbility = interfaceC1554640qYg2.provideAbility(cls.getCanonicalName());
        } else {
            interfaceC494301wDProvideAbility = null;
        }
        sbLIZ.append(interfaceC494301wDProvideAbility);
        sbLIZ.append(" >>>> current activity is ");
        Object host = interfaceC665370Q7z.getHost();
        if (host instanceof C19EG) {
            objLIZ = host;
        } else if (host instanceof Fragment) {
            objLIZ = ((Fragment) host).getActivity();
        } else if (host instanceof View) {
            View view = (View) host;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            if (context instanceof C19EG) {
                objLIZ = context;
            }
        } else if (host instanceof AbstractC738140SxQ) {
            objLIZ = C724240Sb0.LIZ((AbstractC738140SxQ) host);
        }
        sbLIZ.append(objLIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
