package com.bytedance.android.live.service.initializer;

import X.C006A;
import X.C0TI7;
import X.C1105280eru;
import X.C1109420eya;
import X.C1161920gLG;
import X.C1ED4;
import X.C823050WQl;
import X.InterfaceC1161930gLH;
import Y.ARunnableS135S0100000_35;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.CommentService;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.SlotService;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService;
import com.bytedance.android.live.ai.api.pitaya.feature.ILiveFeaturesService;
import com.bytedance.android.live.ai.api.trigger.ILiveTriggerService;
import com.bytedance.android.live.ai.impl.pitaya.LiveClientAIServiceImpl;
import com.bytedance.android.live.ai.impl.pitaya.features.LiveFeaturesServiceImpl;
import com.bytedance.android.live.ai.impl.trigger.LiveTriggerServiceImpl;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import com.bytedance.android.live.aireply.IAIReplyWatcherManagerService;
import com.bytedance.android.live.banner.BannerService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.ILiveBroadcastLifecycleExposed;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IGamePartnershipWebviewDialogService;
import com.bytedance.android.live.browser.IHostJsbRegisterService;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridLegacyStorageService;
import com.bytedance.android.live.browser.IHybridMonitorService;
import com.bytedance.android.live.browser.IHybridPBService;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.browser.IHybridPropsService;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.live.browser.dummy.GamePartnershipWebviewDialogDummyService;
import com.bytedance.android.live.commonactionpanel.ISheetPanelService;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.live.effect.EffectService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.IGiftTestService;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;
import com.bytedance.android.live.hashtag.IHashTagService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.iap.service.IapServiceClass;
import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.IMatchViolationEventHelper;
import com.bytedance.android.live.liveinteract.api.IMultiGuestRenderEffectService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionInternalService;
import com.bytedance.android.live.liveinteract.competition.service.LiveCompetitionExternalServiceImpl;
import com.bytedance.android.live.liveinteract.competition.service.LiveCompetitionInternalServiceImpl;
import com.bytedance.android.live.liveinteract.gamelink.GameLinkMicService;
import com.bytedance.android.live.liveinteract.linkroom.InteractService;
import com.bytedance.android.live.liveinteract.linkroom.LinkMicInteractAbilityService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.match.service.IMatchAICommentaryService;
import com.bytedance.android.live.liveinteract.matchv2.service.LiveMatchService;
import com.bytedance.android.live.liveinteract.matchv2.service.MatchAICommentaryService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestRenderEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.service.MultiGuestV3InternalServiceImplV2;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.QuickCoHostService;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService;
import com.bytedance.android.live.liveinteract.multihost.event.LiveHostCrossRoomEventHelper;
import com.bytedance.android.live.liveinteract.multimatch.tracer.MatchViolationEventHelper;
import com.bytedance.android.live.livepullstream.PullStreamService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.marketing.service.ILiveMarketingService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.moderator.IModeratorService;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.notify.ILiveNotifyService;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.enigma.IEnigmaPublicScreenService;
import com.bytedance.android.live.publicscreen.impl.PublicScreenService;
import com.bytedance.android.live.publicscreen.impl.enigma.EnigmaPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.slot.IBcToggleService;
import com.bytedance.android.live.slot.ILiveShopBagSlotManager;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.LiveShopBagSlotManagerDummy;
import com.bytedance.android.live.slot.util.BcToggleToggleService;
import com.bytedance.android.live.toolbar.IToolbarBtmService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.unityanimation.service.IUnityAnimationService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.live.wallet.IWalletExceptionService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExceptionService;
import com.bytedance.android.live.wallet.WalletService;
import com.bytedance.android.live.wallet.api.ILocationPickerService;
import com.bytedance.android.live.walletnew.ui.LocationService;
import com.bytedance.android.livesdk.BarrageServiceImpl;
import com.bytedance.android.livesdk.GiftServiceKt;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.MessageService;
import com.bytedance.android.livesdk.actionhandler.ActionHandlerService;
import com.bytedance.android.livesdk.adminsetting.AdminSettingService;
import com.bytedance.android.livesdk.aireply.AIReplyAnchorManagerService;
import com.bytedance.android.livesdk.aireply.AIReplyWatcherManagerService;
import com.bytedance.android.livesdk.api.coin.incentive.CoinIncentiveServiceDummy;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.api.revenue.IRevenueService;
import com.bytedance.android.livesdk.api.revenue.announcement.IAnnouncementService;
import com.bytedance.android.livesdk.api.revenue.asr.ILiveAsrHostService;
import com.bytedance.android.livesdk.api.revenue.crm.ICRMGoalService;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaPurchaseService;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.api.revenue.guardian.IGuardianService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.multiimageloader.IMultiImageLoader;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.automationtest.GiftTestService;
import com.bytedance.android.livesdk.avoidance.BusinessAvoidanceService;
import com.bytedance.android.livesdk.billboard.BillboardService;
import com.bytedance.android.livesdk.broadcast.BroadcastService;
import com.bytedance.android.livesdk.broadcast.LiveBroadcastLifecycleExposed;
import com.bytedance.android.livesdk.browser.pb.HybridPBService;
import com.bytedance.android.livesdk.clearscreen.ClearScreenService;
import com.bytedance.android.livesdk.clientstrategy.EPIStrategyService;
import com.bytedance.android.livesdk.commonactionpanel.SheetPanelService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService;
import com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameDualDeviceService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.comp.api.image.IImageService;
import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.comp.impl.debug.DebugService;
import com.bytedance.android.livesdk.comp.impl.decoration.DonationStickerOuterService;
import com.bytedance.android.livesdk.comp.impl.decoration.RoomStickerOuterService;
import com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService;
import com.bytedance.android.livesdk.comp.impl.game.GameDualDeviceService;
import com.bytedance.android.livesdk.comp.impl.game.GameService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.GamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.image.ImageService;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdk.comp.impl.linkcore.impl.LinkMicService;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.LiveEventStickerService;
import com.bytedance.android.livesdk.comp.impl.logger.service.LoggerService;
import com.bytedance.android.livesdk.comp.impl.musicgift.MusicGiftService;
import com.bytedance.android.livesdk.comp.impl.network.NetworkService;
import com.bytedance.android.livesdk.comp.impl.pcs.PcsService;
import com.bytedance.android.livesdk.comp.impl.performance.PerformanceService;
import com.bytedance.android.livesdk.comp.impl.subscription.SubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.status.SubscriptionStatusService;
import com.bytedance.android.livesdk.definition.DefinitionService;
import com.bytedance.android.livesdk.feed.tab.FeedUrlService;
import com.bytedance.android.livesdk.function.RoomFunctionService;
import com.bytedance.android.livesdk.game.GameTopicService;
import com.bytedance.android.livesdk.giftlimitnotification.GiftReminderService;
import com.bytedance.android.livesdk.grouplive.service.GroupLiveServiceImpl;
import com.bytedance.android.livesdk.grouplive.service.IGroupLiveService;
import com.bytedance.android.livesdk.hashtag.HashTagService;
import com.bytedance.android.livesdk.impl.revenue.RevenueService;
import com.bytedance.android.livesdk.impl.revenue.announcement.AnnouncementService;
import com.bytedance.android.livesdk.impl.revenue.asr.LiveAsrHostServiceImpl;
import com.bytedance.android.livesdk.impl.revenue.crm.CRMGoalService;
import com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaService;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;
import com.bytedance.android.livesdk.impl.revenue.goodybag.GoodyBagService;
import com.bytedance.android.livesdk.impl.revenue.guardian.GuardianService;
import com.bytedance.android.livesdk.impl.revenue.level.UserLevelService;
import com.bytedance.android.livesdk.impl.revenue.multiimageloader.MultiImageLoader;
import com.bytedance.android.livesdk.impl.revenue.starcomment.StarCommentService;
import com.bytedance.android.livesdk.impl.revenue.strategy.RevenueStrategy;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.TreasureBoxService;
import com.bytedance.android.livesdk.layer.LayerService;
import com.bytedance.android.livesdk.livedecision.LiveDecisionService;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.marketing.service.LiveMarketingService;
import com.bytedance.android.livesdk.microom.MicRoomService;
import com.bytedance.android.livesdk.moderator.ModeratorService;
import com.bytedance.android.livesdk.module.BrowserService;
import com.bytedance.android.livesdk.module.HostJsbRegisterService;
import com.bytedance.android.livesdk.module.HybridContainerManageService;
import com.bytedance.android.livesdk.module.HybridContainerService;
import com.bytedance.android.livesdk.module.HybridLegacyStorageService;
import com.bytedance.android.livesdk.module.HybridMonitorService;
import com.bytedance.android.livesdk.module.HybridPerformanceService;
import com.bytedance.android.livesdk.module.HybridPropsService;
import com.bytedance.android.livesdk.module.HybridStorageService;
import com.bytedance.android.livesdk.module.LiveSparkService;
import com.bytedance.android.livesdk.notify.BusinessAvoidConflictNotifyService;
import com.bytedance.android.livesdk.notify.LiveNotifyService;
import com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService;
import com.bytedance.android.livesdk.pad.IPadMultiScreenService;
import com.bytedance.android.livesdk.pad.PadAutoRotateScreenService;
import com.bytedance.android.livesdk.pad.PadMultiScreenService;
import com.bytedance.android.livesdk.performance.mem.MemoryTriggerCoordinator;
import com.bytedance.android.livesdk.performance.memory.LiveMemoryTrigger;
import com.bytedance.android.livesdk.performancetune.PTFServiceImpl;
import com.bytedance.android.livesdk.pincard.service.PinCardService;
import com.bytedance.android.livesdk.player.LiveGiftDelegatePlayerService;
import com.bytedance.android.livesdk.profile.service.LiveProfileService;
import com.bytedance.android.livesdk.programmedlive.ProgrammedLiveService;
import com.bytedance.android.livesdk.push.LivePushService;
import com.bytedance.android.livesdk.qa.QAService;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.impl.RankService;
import com.bytedance.android.livesdk.revenue.effect.LiveEffectRenderService;
import com.bytedance.android.livesdk.revenue.level.api.effect.ILiveEffectRenderService;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.FansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.service.UserLevelBackService;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.android.livesdk.share.ShareService;
import com.bytedance.android.livesdk.shorttouch.service.ShortTouchService;
import com.bytedance.android.livesdk.toolbar.ToolbarBtmService;
import com.bytedance.android.livesdk.toolbar.ToolbarService;
import com.bytedance.android.livesdk.unityanimation.service.UnityAnimationService;
import com.bytedance.android.livesdk.userinfowidget.UserInfoWidgetService;
import com.bytedance.android.livesdk.usermanage.UserManageService;
import com.bytedance.android.livesdk.variant.service.IVariantCardService;
import com.bytedance.android.livesdk.variant.service.VariantCardService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdk.watch.WatchLiveService;
import com.bytedance.android.livesdk.watch.clearscreen.IClearScreenService;
import com.bytedance.android.livesdk.watch.push.ILivePushService;
import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.livestrategy.ILiveStrategyCenterService;
import com.bytedance.android.livestrategy.LiveFeatureCenterService;
import com.bytedance.android.livestrategy.LiveStrategyCenterService;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.live.render.engine.alphaplayer.api.ILiveGiftAlphaPlayerService;
import com.bytedance.live.render.engine.alphaplayer.player.LiveGiftPlayerService;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tiktok.kmp.live.socialgamebusiness.service.LiveDanceService;
import com.tiktok.kmp.live.socialgamebusinessapi.service.ILiveDanceService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes36.dex */
public final class ServiceInitializerV3 implements InterfaceC1161930gLH {
    public IAIReplyAnchorManagerService aIReplyAnchorManagerService;
    public IAIReplyWatcherManagerService aIReplyWatcherManagerService;
    public IActionHandlerService actionHandlerService;
    public IAdminSettingService adminSettingService;
    public IAnnouncementService announcementService;
    public IapService apService;
    public IBannerService bannerService;
    public IBarrageService barrageService;
    public IBcToggleService bcToggleService;
    public IBillboardService billboardService;
    public IBroadcastService broadcastService;
    public IBrowserService browserService;
    public IBusinessAvoidConflictNotifyService businessAvoidConflictNotifyService;
    public IBusinessAvoidanceService businessAvoidanceService;
    public ICRMGoalService cRMGoalService;
    public IClearScreenService clearScreenService;
    public ICoinIncentiveService coinIncentiveService;
    public ICommentService commentService;
    public IDebugService debugService;
    public IDefinitionService definitionService;
    public IDonationStickerOuterService donationStickerOuterService;
    public IEPIStrategyService ePIStrategyService;
    public IEffectService effectService;
    public IEnigmaPublicScreenService enigmaPublicScreenService;
    public IEnigmaPurchaseService enigmaPurchaseService;
    public IEnigmaService enigmaService;
    public IFansClubService fansClubService;
    public IGameDualDeviceService gameDualDeviceService;
    public IGameLinkMicService gameLinkMicService;
    public IGamePartnershipService gamePartnershipService;
    public IGamePartnershipWebviewDialogService gamePartnershipWebviewDialogService;
    public IGameService gameService;
    public IGameTopicService gameTopicService;
    public IGiftReminderService giftReminderService;
    public IGiftService giftService;
    public IGiftTestService giftTestService;
    public IGoodyBagService goodyBagService;
    public IGroupLiveService groupLiveService;
    public IGuardianService guardianService;
    public IHashTagService hashTagService;
    public IHostJsbRegisterService hostJsbRegisterService;
    public IHybridContainerManageService hybridContainerManageService;
    public IHybridContainerService hybridContainerService;
    public IHybridLegacyStorageService hybridLegacyStorageService;
    public IHybridMonitorService hybridMonitorService;
    public IHybridPBService hybridPBService;
    public IHybridPerformanceService hybridPerformanceService;
    public IHybridPropsService hybridPropsService;
    public IHybridStorageService hybridStorageService;
    public IImageService imageService;
    public IInteractService interactService;
    public ILayerService layerService;
    public ILinkCoreService linkCoreService;
    public ILinkMicInteractAbilityService linkMicInteractAbilityService;
    public ILinkMicService linkMicService;
    public ILiveAsrHostService liveAsrHostService;
    public ILiveBroadcastLifecycleExposed liveBroadcastLifecycleExposed;
    public ILiveClientAIService liveClientAIService;
    public ILiveCompetitionExternalService liveCompetitionExternalService;
    public ILiveCompetitionInternalService liveCompetitionInternalService;
    public ILiveDanceService liveDanceService;
    public ILiveDecisionService liveDecisionService;
    public ILiveEffectRenderService liveEffectRenderService;
    public ILiveEventService liveEventService;
    public ILiveEventStickerService liveEventStickerService;
    public ILiveFeatureCenterService liveFeatureCenterService;
    public ILiveFeaturesService liveFeaturesService;
    public ILiveFeedApiService liveFeedApiService;
    public ILiveGiftAlphaPlayerService liveGiftAlphaPlayerService;
    public ILiveGiftDelegatePlayerService liveGiftDelegatePlayerService;
    public ILiveHostCrossRoomEventHelper liveHostCrossRoomEventHelper;
    public ILiveMarketingService liveMarketingService;
    public ILiveMatchService liveMatchService;
    public LiveMemoryTrigger liveMemoryTrigger;
    public ILiveNotifyService liveNotifyService;
    public ILiveProfileService liveProfileService;
    public ILivePushService livePushService;
    public ILiveShopBagSlotManager liveShopBagSlotManager;
    public ILiveSparkService liveSparkService;
    public ILiveStrategyCenterService liveStrategyCenterService;
    public ILiveTriggerService liveTriggerService;
    public ILocationPickerService locationPickerService;
    public ILoggerService loggerService;
    public IMatchAICommentaryService matchAICommentaryService;
    public IMatchViolationEventHelper matchViolationEventHelper;
    public IMessageService messageService;
    public IMicRoomService micRoomService;
    public IModeratorService moderatorService;
    public IMultiGuestRenderEffectService multiGuestRenderEffectService;
    public IMultiGuestV3InternalServiceV2 multiGuestV3InternalServiceV2;
    public IMultiHostCrossAdapter multiHostCrossAdapter;
    public IMultiHostService multiHostService;
    public IMultiImageLoader multiImageLoader;
    public IMusicGiftService musicGiftService;
    public INetworkService networkService;
    public IPTFService pTFService;
    public IPadAutoRotateScreenService padAutoRotateScreenService;
    public IPadMultiScreenService padMultiScreenService;
    public IPcsService pcsService;
    public IPerformanceService performanceService;
    public IPinCardService pinCardService;
    public IProgrammedLiveService programmedLiveService;
    public IPublicScreenService publicScreenService;
    public IPullStreamService pullStreamService;
    public IQAService qAService;
    public IQuickCoHostService quickCoHostService;
    public IRankService rankService;
    public IRevenueService revenueService;
    public IRevenueStrategyService revenueStrategyService;
    public IRoomFunctionService roomFunctionService;
    public IRoomStickerOuterService roomStickerOuterService;
    public final ConcurrentHashMap<Class<?>, Integer> serviceClazz2Index = new ConcurrentHashMap<>();
    public final HashMap<String, Integer> serviceName2Index;
    public IShareService shareService;
    public ISheetPanelService sheetPanelService;
    public IShortTouchService shortTouchService;
    public ISlotService slotService;
    public IStarCommentService starCommentService;
    public ISubscribeService subscribeService;
    public ISubscriptionStatusService subscriptionStatusService;
    public IToolbarBtmService toolbarBtmService;
    public IToolbarService toolbarService;
    public ITreasureBoxService treasureBoxService;
    public IUnityAnimationService unityAnimationService;
    public IUserInfoWidgetService userInfoWidgetService;
    public IUserLevelBackService userLevelBackService;
    public IUserLevelService userLevelService;
    public IUserManageService userManageService;
    public IVariantCardService variantCardService;
    public IWalletExceptionService walletExceptionService;
    public IWalletService walletService;
    public IWatchLiveService watchLiveService;

    public ServiceInitializerV3() {
        HashMap<String, Integer> map = new HashMap<>();
        this.serviceName2Index = map;
        map.put("ILiveFeedApiService", 0);
        map.put("ICommentService", 1);
        map.put("IActionHandlerService", 2);
        map.put("IAdminSettingService", 3);
        map.put("ILiveClientAIService", 4);
        map.put("ILiveFeaturesService", 5);
        map.put("ILiveTriggerService", 6);
        map.put("IAIReplyAnchorManagerService", 7);
        map.put("IAIReplyWatcherManagerService", 8);
        map.put("IBannerService", 9);
        map.put("IBillboardService", 10);
        map.put("IBroadcastService", 11);
        map.put("ILiveBroadcastLifecycleExposed", 12);
        map.put("IBrowserService", 13);
        map.put("IGamePartnershipWebviewDialogService", 14);
        map.put("IHostJsbRegisterService", 15);
        map.put("IHybridContainerManageService", 16);
        map.put("IHybridContainerService", 17);
        map.put("IHybridLegacyStorageService", 18);
        map.put("IHybridMonitorService", 19);
        map.put("IHybridPBService", 20);
        map.put("IHybridPerformanceService", 21);
        map.put("IHybridPropsService", 22);
        map.put("IHybridStorageService", 23);
        map.put("ILiveSparkService", 24);
        map.put("ISheetPanelService", 25);
        map.put("IDefinitionService", 26);
        map.put("IEPIStrategyService", 27);
        map.put("IEffectService", 28);
        map.put("IRoomFunctionService", 29);
        map.put("IGameTopicService", 30);
        map.put("IGiftReminderService", 31);
        map.put("IGiftService", 32);
        map.put("IGiftTestService", 33);
        map.put("ILiveGiftDelegatePlayerService", 34);
        map.put("IHashTagService", 35);
        map.put("IapService", 36);
        map.put("ILayerService", 37);
        map.put("ILiveDecisionService", 38);
        map.put("IInteractService", 39);
        map.put("IMatchViolationEventHelper", 40);
        map.put("IMultiGuestRenderEffectService", 41);
        map.put("ILiveCompetitionExternalService", 42);
        map.put("ILiveCompetitionInternalService", 43);
        map.put("ILiveMatchService", 44);
        map.put("IMatchAICommentaryService", 45);
        map.put("IMultiGuestV3InternalServiceV2", 46);
        map.put("IQuickCoHostService", 47);
        map.put("IMultiHostCrossAdapter", 48);
        map.put("IMultiHostService", 49);
        map.put("IPullStreamService", 50);
        map.put("ILiveMarketingService", 51);
        map.put("IMicRoomService", 52);
        map.put("IModeratorService", 53);
        map.put("IBusinessAvoidConflictNotifyService", 54);
        map.put("ILiveNotifyService", 55);
        map.put("IPinCardService", 56);
        map.put("ILiveProfileService", 57);
        map.put("IProgrammedLiveService", 58);
        map.put("IPublicScreenService", 59);
        map.put("IEnigmaPublicScreenService", 60);
        map.put("IQAService", 61);
        map.put("IShareService", 62);
        map.put("IShortTouchService", 63);
        map.put("IBcToggleService", 64);
        map.put("ILiveShopBagSlotManager", 65);
        map.put("ISlotService", 66);
        map.put("IToolbarBtmService", 67);
        map.put("IToolbarService", 68);
        map.put("IUnityAnimationService", 69);
        map.put("IUserInfoWidgetService", 70);
        map.put("IUserManageService", 71);
        map.put("IWalletExceptionService", 72);
        map.put("IWalletService", 73);
        map.put("ILocationPickerService", 74);
        map.put("IBarrageService", 75);
        map.put("ICoinIncentiveService", 76);
        map.put("IRevenueService", 77);
        map.put("IAnnouncementService", 78);
        map.put("ILiveAsrHostService", 79);
        map.put("ICRMGoalService", 80);
        map.put("IEnigmaPurchaseService", 81);
        map.put("IEnigmaService", 82);
        map.put("IGoodyBagService", 83);
        map.put("IGuardianService", 84);
        map.put("IUserLevelService", 85);
        map.put("IMultiImageLoader", 86);
        map.put("IStarCommentService", 87);
        map.put("IRevenueStrategyService", 88);
        map.put("ITreasureBoxService", 89);
        map.put("IDebugService", 90);
        map.put("IDonationStickerOuterService", 91);
        map.put("ILiveEventStickerService", 92);
        map.put("IRoomStickerOuterService", 93);
        map.put("ILiveEventService", 94);
        map.put("IGameLinkMicService", 95);
        map.put("IGameDualDeviceService", 96);
        map.put("IGamePartnershipService", 97);
        map.put("IGameService", 98);
        map.put("IImageService", 99);
        map.put("ILinkCoreService", 100);
        map.put("ILinkMicService", 101);
        map.put("ILoggerService", 102);
        map.put("IMusicGiftService", 103);
        map.put("INetworkService", 104);
        map.put("IPcsService", 105);
        map.put("IPerformanceService", 106);
        map.put("ISubscribeService", 107);
        map.put("ISubscriptionStatusService", 108);
        map.put("IGroupLiveService", 109);
        map.put("IPadAutoRotateScreenService", 110);
        map.put("IPadMultiScreenService", 111);
        map.put("LiveMemoryTrigger", 112);
        map.put("IRankService", 113);
        map.put("ILiveEffectRenderService", 114);
        map.put("IFansClubService", 115);
        map.put("IUserLevelBackService", 116);
        map.put("ILinkMicInteractAbilityService", 117);
        map.put("IVariantCardService", 118);
        map.put("IWatchLiveService", 119);
        map.put("IClearScreenService", 120);
        map.put("ILivePushService", 121);
        map.put("IBusinessAvoidanceService", 122);
        map.put("ILiveHostCrossRoomEventHelper", 123);
        map.put("ILiveFeatureCenterService", 124);
        map.put("ILiveStrategyCenterService", 125);
        map.put("IMessageService", 126);
        map.put("IPTFService", 127);
        map.put("ILiveGiftAlphaPlayerService", 128);
        map.put("ILiveDanceService", 129);
    }

    @Override // X.InterfaceC1161930gLH
    public <T extends C006A> T getService(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        switch (getServiceType(cls)) {
            case 0:
                if (this.liveFeedApiService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveFeedApiService == null) {
                                FeedUrlService feedUrlService = new FeedUrlService();
                                feedUrlService.onInit();
                                this.liveFeedApiService = feedUrlService;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                ILiveFeedApiService iLiveFeedApiService = this.liveFeedApiService;
                if (iLiveFeedApiService instanceof C006A) {
                    return iLiveFeedApiService;
                }
                return null;
            case 1:
                if (this.commentService == null) {
                    synchronized (cls) {
                        try {
                            if (this.commentService == null) {
                                this.commentService = new CommentService();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                ICommentService iCommentService = this.commentService;
                if (iCommentService instanceof C006A) {
                    return iCommentService;
                }
                return null;
            case 2:
                if (this.actionHandlerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.actionHandlerService == null) {
                                ActionHandlerService actionHandlerService = new ActionHandlerService();
                                actionHandlerService.onInit();
                                this.actionHandlerService = actionHandlerService;
                            }
                        } catch (Throwable th22) {
                            throw th22;
                        }
                        break;
                    }
                }
                IActionHandlerService iActionHandlerService = this.actionHandlerService;
                if (iActionHandlerService instanceof C006A) {
                    return iActionHandlerService;
                }
                return null;
            case 3:
                if (this.adminSettingService == null) {
                    synchronized (cls) {
                        try {
                            if (this.adminSettingService == null) {
                                this.adminSettingService = new AdminSettingService();
                            }
                        } catch (Throwable th222) {
                            throw th222;
                        }
                        break;
                    }
                }
                IAdminSettingService iAdminSettingService = this.adminSettingService;
                if (iAdminSettingService instanceof C006A) {
                    return iAdminSettingService;
                }
                return null;
            case 4:
                if (this.liveClientAIService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveClientAIService == null) {
                                this.liveClientAIService = new LiveClientAIServiceImpl();
                            }
                        } catch (Throwable th2222) {
                            throw th2222;
                        }
                        break;
                    }
                }
                ILiveClientAIService iLiveClientAIService = this.liveClientAIService;
                if (iLiveClientAIService instanceof C006A) {
                    return iLiveClientAIService;
                }
                return null;
            case 5:
                if (this.liveFeaturesService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveFeaturesService == null) {
                                this.liveFeaturesService = new LiveFeaturesServiceImpl();
                            }
                        } catch (Throwable th22222) {
                            throw th22222;
                        }
                        break;
                    }
                }
                ILiveFeaturesService iLiveFeaturesService = this.liveFeaturesService;
                if (iLiveFeaturesService instanceof C006A) {
                    return iLiveFeaturesService;
                }
                return null;
            case 6:
                if (this.liveTriggerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveTriggerService == null) {
                                this.liveTriggerService = new LiveTriggerServiceImpl();
                            }
                        } catch (Throwable th222222) {
                            throw th222222;
                        }
                        break;
                    }
                }
                ILiveTriggerService iLiveTriggerService = this.liveTriggerService;
                if (iLiveTriggerService instanceof C006A) {
                    return iLiveTriggerService;
                }
                return null;
            case 7:
                if (this.aIReplyAnchorManagerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.aIReplyAnchorManagerService == null) {
                                AIReplyAnchorManagerService aIReplyAnchorManagerService = new AIReplyAnchorManagerService();
                                aIReplyAnchorManagerService.onInit();
                                this.aIReplyAnchorManagerService = aIReplyAnchorManagerService;
                            }
                        } catch (Throwable th2222222) {
                            throw th2222222;
                        }
                        break;
                    }
                }
                IAIReplyAnchorManagerService iAIReplyAnchorManagerService = this.aIReplyAnchorManagerService;
                if (iAIReplyAnchorManagerService instanceof C006A) {
                    return iAIReplyAnchorManagerService;
                }
                return null;
            case 8:
                if (this.aIReplyWatcherManagerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.aIReplyWatcherManagerService == null) {
                                AIReplyWatcherManagerService aIReplyWatcherManagerService = new AIReplyWatcherManagerService();
                                aIReplyWatcherManagerService.onInit();
                                this.aIReplyWatcherManagerService = aIReplyWatcherManagerService;
                            }
                        } catch (Throwable th22222222) {
                            throw th22222222;
                        }
                        break;
                    }
                }
                IAIReplyWatcherManagerService iAIReplyWatcherManagerService = this.aIReplyWatcherManagerService;
                if (iAIReplyWatcherManagerService instanceof C006A) {
                    return iAIReplyWatcherManagerService;
                }
                return null;
            case BdTuring.TYPE_ECAF /* 9 */:
                if (this.bannerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.bannerService == null) {
                                this.bannerService = new BannerService();
                            }
                        } catch (Throwable th222222222) {
                            throw th222222222;
                        }
                        break;
                    }
                }
                IBannerService iBannerService = this.bannerService;
                if (iBannerService instanceof C006A) {
                    return iBannerService;
                }
                return null;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                if (this.billboardService == null) {
                    synchronized (cls) {
                        try {
                            if (this.billboardService == null) {
                                this.billboardService = new BillboardService();
                            }
                        } catch (Throwable th2222222222) {
                            throw th2222222222;
                        }
                        break;
                    }
                }
                IBillboardService iBillboardService = this.billboardService;
                if (iBillboardService instanceof C006A) {
                    return iBillboardService;
                }
                return null;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (this.broadcastService == null) {
                    synchronized (cls) {
                        try {
                            if (this.broadcastService == null) {
                                BroadcastService broadcastService = new BroadcastService();
                                broadcastService.onInit();
                                this.broadcastService = broadcastService;
                            }
                        } catch (Throwable th22222222222) {
                            throw th22222222222;
                        }
                        break;
                    }
                }
                IBroadcastService iBroadcastService = this.broadcastService;
                if (iBroadcastService instanceof C006A) {
                    return iBroadcastService;
                }
                return null;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (this.liveBroadcastLifecycleExposed == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveBroadcastLifecycleExposed == null) {
                                LiveBroadcastLifecycleExposed liveBroadcastLifecycleExposed = new LiveBroadcastLifecycleExposed();
                                liveBroadcastLifecycleExposed.onInit();
                                this.liveBroadcastLifecycleExposed = liveBroadcastLifecycleExposed;
                            }
                        } catch (Throwable th222222222222) {
                            throw th222222222222;
                        }
                        break;
                    }
                }
                ILiveBroadcastLifecycleExposed iLiveBroadcastLifecycleExposed = this.liveBroadcastLifecycleExposed;
                if (iLiveBroadcastLifecycleExposed instanceof C006A) {
                    return iLiveBroadcastLifecycleExposed;
                }
                return null;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                if (this.browserService == null) {
                    synchronized (cls) {
                        try {
                            if (this.browserService == null) {
                                this.browserService = new BrowserService();
                            }
                        } catch (Throwable th2222222222222) {
                            throw th2222222222222;
                        }
                        break;
                    }
                }
                IBrowserService iBrowserService = this.browserService;
                if (iBrowserService instanceof C006A) {
                    return iBrowserService;
                }
                return null;
            case 14:
                if (this.gamePartnershipWebviewDialogService == null) {
                    synchronized (cls) {
                        try {
                            if (this.gamePartnershipWebviewDialogService == null) {
                                this.gamePartnershipWebviewDialogService = new GamePartnershipWebviewDialogDummyService();
                            }
                        } catch (Throwable th22222222222222) {
                            throw th22222222222222;
                        }
                        break;
                    }
                }
                IGamePartnershipWebviewDialogService iGamePartnershipWebviewDialogService = this.gamePartnershipWebviewDialogService;
                if (iGamePartnershipWebviewDialogService instanceof C006A) {
                    return iGamePartnershipWebviewDialogService;
                }
                return null;
            case 15:
                if (this.hostJsbRegisterService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hostJsbRegisterService == null) {
                                this.hostJsbRegisterService = new HostJsbRegisterService();
                            }
                        } catch (Throwable th222222222222222) {
                            throw th222222222222222;
                        }
                        break;
                    }
                }
                IHostJsbRegisterService iHostJsbRegisterService = this.hostJsbRegisterService;
                if (iHostJsbRegisterService instanceof C006A) {
                    return iHostJsbRegisterService;
                }
                return null;
            case 16:
                if (this.hybridContainerManageService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridContainerManageService == null) {
                                this.hybridContainerManageService = new HybridContainerManageService();
                            }
                        } catch (Throwable th2222222222222222) {
                            throw th2222222222222222;
                        }
                        break;
                    }
                }
                IHybridContainerManageService iHybridContainerManageService = this.hybridContainerManageService;
                if (iHybridContainerManageService instanceof C006A) {
                    return iHybridContainerManageService;
                }
                return null;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                if (this.hybridContainerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridContainerService == null) {
                                this.hybridContainerService = new HybridContainerService();
                            }
                        } catch (Throwable th22222222222222222) {
                            throw th22222222222222222;
                        }
                        break;
                    }
                }
                IHybridContainerService iHybridContainerService = this.hybridContainerService;
                if (iHybridContainerService instanceof C006A) {
                    return iHybridContainerService;
                }
                return null;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                if (this.hybridLegacyStorageService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridLegacyStorageService == null) {
                                this.hybridLegacyStorageService = new HybridLegacyStorageService();
                            }
                        } catch (Throwable th222222222222222222) {
                            throw th222222222222222222;
                        }
                        break;
                    }
                }
                IHybridLegacyStorageService iHybridLegacyStorageService = this.hybridLegacyStorageService;
                if (iHybridLegacyStorageService instanceof C006A) {
                    return iHybridLegacyStorageService;
                }
                return null;
            case 19:
                if (this.hybridMonitorService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridMonitorService == null) {
                                this.hybridMonitorService = new HybridMonitorService();
                            }
                        } catch (Throwable th2222222222222222222) {
                            throw th2222222222222222222;
                        }
                        break;
                    }
                }
                IHybridMonitorService iHybridMonitorService = this.hybridMonitorService;
                if (iHybridMonitorService instanceof C006A) {
                    return iHybridMonitorService;
                }
                return null;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                if (this.hybridPBService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridPBService == null) {
                                this.hybridPBService = new HybridPBService();
                            }
                        } catch (Throwable th22222222222222222222) {
                            throw th22222222222222222222;
                        }
                        break;
                    }
                }
                IHybridPBService iHybridPBService = this.hybridPBService;
                if (iHybridPBService instanceof C006A) {
                    return iHybridPBService;
                }
                return null;
            case 21:
                if (this.hybridPerformanceService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridPerformanceService == null) {
                                this.hybridPerformanceService = new HybridPerformanceService();
                            }
                        } catch (Throwable th222222222222222222222) {
                            throw th222222222222222222222;
                        }
                        break;
                    }
                }
                IHybridPerformanceService iHybridPerformanceService = this.hybridPerformanceService;
                if (iHybridPerformanceService instanceof C006A) {
                    return iHybridPerformanceService;
                }
                return null;
            case 22:
                if (this.hybridPropsService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridPropsService == null) {
                                this.hybridPropsService = new HybridPropsService();
                            }
                        } catch (Throwable th2222222222222222222222) {
                            throw th2222222222222222222222;
                        }
                        break;
                    }
                }
                IHybridPropsService iHybridPropsService = this.hybridPropsService;
                if (iHybridPropsService instanceof C006A) {
                    return iHybridPropsService;
                }
                return null;
            case 23:
                if (this.hybridStorageService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hybridStorageService == null) {
                                this.hybridStorageService = new HybridStorageService();
                            }
                        } catch (Throwable th22222222222222222222222) {
                            throw th22222222222222222222222;
                        }
                        break;
                    }
                }
                IHybridStorageService iHybridStorageService = this.hybridStorageService;
                if (iHybridStorageService instanceof C006A) {
                    return iHybridStorageService;
                }
                return null;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                if (this.liveSparkService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveSparkService == null) {
                                this.liveSparkService = new LiveSparkService();
                            }
                        } catch (Throwable th222222222222222222222222) {
                            throw th222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveSparkService iLiveSparkService = this.liveSparkService;
                if (iLiveSparkService instanceof C006A) {
                    return iLiveSparkService;
                }
                return null;
            case 25:
                if (this.sheetPanelService == null) {
                    synchronized (cls) {
                        try {
                            if (this.sheetPanelService == null) {
                                this.sheetPanelService = new SheetPanelService();
                            }
                        } catch (Throwable th2222222222222222222222222) {
                            throw th2222222222222222222222222;
                        }
                        break;
                    }
                }
                ISheetPanelService iSheetPanelService = this.sheetPanelService;
                if (iSheetPanelService instanceof C006A) {
                    return iSheetPanelService;
                }
                return null;
            case 26:
                if (this.definitionService == null) {
                    synchronized (cls) {
                        try {
                            if (this.definitionService == null) {
                                this.definitionService = new DefinitionService();
                            }
                        } catch (Throwable th22222222222222222222222222) {
                            throw th22222222222222222222222222;
                        }
                        break;
                    }
                }
                IDefinitionService iDefinitionService = this.definitionService;
                if (iDefinitionService instanceof C006A) {
                    return iDefinitionService;
                }
                return null;
            case 27:
                if (this.ePIStrategyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.ePIStrategyService == null) {
                                this.ePIStrategyService = new EPIStrategyService();
                            }
                        } catch (Throwable th222222222222222222222222222) {
                            throw th222222222222222222222222222;
                        }
                        break;
                    }
                }
                IEPIStrategyService iEPIStrategyService = this.ePIStrategyService;
                if (iEPIStrategyService instanceof C006A) {
                    return iEPIStrategyService;
                }
                return null;
            case 28:
                if (this.effectService == null) {
                    synchronized (cls) {
                        try {
                            if (this.effectService == null) {
                                EffectService effectService = new EffectService();
                                effectService.onInit();
                                this.effectService = effectService;
                            }
                        } catch (Throwable th2222222222222222222222222222) {
                            throw th2222222222222222222222222222;
                        }
                        break;
                    }
                }
                IEffectService iEffectService = this.effectService;
                if (iEffectService instanceof C006A) {
                    return iEffectService;
                }
                return null;
            case 29:
                if (this.roomFunctionService == null) {
                    synchronized (cls) {
                        try {
                            if (this.roomFunctionService == null) {
                                RoomFunctionService roomFunctionService = new RoomFunctionService();
                                roomFunctionService.onInit();
                                this.roomFunctionService = roomFunctionService;
                            }
                        } catch (Throwable th22222222222222222222222222222) {
                            throw th22222222222222222222222222222;
                        }
                        break;
                    }
                }
                IRoomFunctionService iRoomFunctionService = this.roomFunctionService;
                if (iRoomFunctionService instanceof C006A) {
                    return iRoomFunctionService;
                }
                return null;
            case 30:
                if (this.gameTopicService == null) {
                    synchronized (cls) {
                        try {
                            if (this.gameTopicService == null) {
                                this.gameTopicService = new GameTopicService();
                            }
                        } catch (Throwable th222222222222222222222222222222) {
                            throw th222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGameTopicService iGameTopicService = this.gameTopicService;
                if (iGameTopicService instanceof C006A) {
                    return iGameTopicService;
                }
                return null;
            case 31:
                if (this.giftReminderService == null) {
                    synchronized (cls) {
                        try {
                            if (this.giftReminderService == null) {
                                this.giftReminderService = new GiftReminderService();
                            }
                        } catch (Throwable th2222222222222222222222222222222) {
                            throw th2222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGiftReminderService iGiftReminderService = this.giftReminderService;
                if (iGiftReminderService instanceof C006A) {
                    return iGiftReminderService;
                }
                return null;
            case 32:
                if (this.giftService == null) {
                    synchronized (cls) {
                        try {
                            if (this.giftService == null) {
                                GiftServiceKt giftServiceKt = new GiftServiceKt();
                                giftServiceKt.onInit();
                                this.giftService = giftServiceKt;
                            }
                        } catch (Throwable th22222222222222222222222222222222) {
                            throw th22222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGiftService iGiftService = this.giftService;
                if (iGiftService instanceof C006A) {
                    return iGiftService;
                }
                return null;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                if (this.giftTestService == null) {
                    synchronized (cls) {
                        try {
                            if (this.giftTestService == null) {
                                this.giftTestService = new GiftTestService();
                            }
                        } catch (Throwable th222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGiftTestService iGiftTestService = this.giftTestService;
                if (iGiftTestService instanceof C006A) {
                    return iGiftTestService;
                }
                return null;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                if (this.liveGiftDelegatePlayerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveGiftDelegatePlayerService == null) {
                                LiveGiftDelegatePlayerService liveGiftDelegatePlayerService = new LiveGiftDelegatePlayerService();
                                liveGiftDelegatePlayerService.onInit();
                                this.liveGiftDelegatePlayerService = liveGiftDelegatePlayerService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveGiftDelegatePlayerService iLiveGiftDelegatePlayerService = this.liveGiftDelegatePlayerService;
                if (iLiveGiftDelegatePlayerService instanceof C006A) {
                    return iLiveGiftDelegatePlayerService;
                }
                return null;
            case 35:
                if (this.hashTagService == null) {
                    synchronized (cls) {
                        try {
                            if (this.hashTagService == null) {
                                this.hashTagService = new HashTagService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IHashTagService iHashTagService = this.hashTagService;
                if (iHashTagService instanceof C006A) {
                    return iHashTagService;
                }
                return null;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                if (this.apService == null) {
                    synchronized (cls) {
                        try {
                            if (this.apService == null) {
                                this.apService = new IapServiceClass();
                            }
                        } catch (Throwable th222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IapService iapService = this.apService;
                if (iapService instanceof C006A) {
                    return iapService;
                }
                return null;
            case 37:
                if (this.layerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.layerService == null) {
                                this.layerService = new LayerService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILayerService iLayerService = this.layerService;
                if (iLayerService instanceof C006A) {
                    return iLayerService;
                }
                return null;
            case 38:
                if (this.liveDecisionService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveDecisionService == null) {
                                LiveDecisionService liveDecisionService = new LiveDecisionService();
                                liveDecisionService.onInit();
                                this.liveDecisionService = liveDecisionService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveDecisionService iLiveDecisionService = this.liveDecisionService;
                if (iLiveDecisionService instanceof C006A) {
                    return iLiveDecisionService;
                }
                return null;
            case 39:
                if (this.interactService == null) {
                    synchronized (cls) {
                        try {
                            if (this.interactService == null) {
                                InteractService interactService = new InteractService();
                                interactService.onInit();
                                this.interactService = interactService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IInteractService iInteractService = this.interactService;
                if (iInteractService instanceof C006A) {
                    return iInteractService;
                }
                return null;
            case 40:
                if (this.matchViolationEventHelper == null) {
                    synchronized (cls) {
                        try {
                            if (this.matchViolationEventHelper == null) {
                                MatchViolationEventHelper matchViolationEventHelper = new MatchViolationEventHelper();
                                matchViolationEventHelper.onInit();
                                this.matchViolationEventHelper = matchViolationEventHelper;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMatchViolationEventHelper iMatchViolationEventHelper = this.matchViolationEventHelper;
                if (iMatchViolationEventHelper instanceof C006A) {
                    return iMatchViolationEventHelper;
                }
                return null;
            case 41:
                if (this.multiGuestRenderEffectService == null) {
                    synchronized (cls) {
                        try {
                            if (this.multiGuestRenderEffectService == null) {
                                MultiGuestRenderEffectService multiGuestRenderEffectService = new MultiGuestRenderEffectService();
                                multiGuestRenderEffectService.onInit();
                                this.multiGuestRenderEffectService = multiGuestRenderEffectService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMultiGuestRenderEffectService iMultiGuestRenderEffectService = this.multiGuestRenderEffectService;
                if (iMultiGuestRenderEffectService instanceof C006A) {
                    return iMultiGuestRenderEffectService;
                }
                return null;
            case 42:
                if (this.liveCompetitionExternalService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveCompetitionExternalService == null) {
                                this.liveCompetitionExternalService = new LiveCompetitionExternalServiceImpl();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveCompetitionExternalService iLiveCompetitionExternalService = this.liveCompetitionExternalService;
                if (iLiveCompetitionExternalService instanceof C006A) {
                    return iLiveCompetitionExternalService;
                }
                return null;
            case 43:
                if (this.liveCompetitionInternalService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveCompetitionInternalService == null) {
                                this.liveCompetitionInternalService = new LiveCompetitionInternalServiceImpl();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveCompetitionInternalService iLiveCompetitionInternalService = this.liveCompetitionInternalService;
                if (iLiveCompetitionInternalService instanceof C006A) {
                    return iLiveCompetitionInternalService;
                }
                return null;
            case 44:
                if (this.liveMatchService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveMatchService == null) {
                                this.liveMatchService = new LiveMatchService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveMatchService iLiveMatchService = this.liveMatchService;
                if (iLiveMatchService instanceof C006A) {
                    return iLiveMatchService;
                }
                return null;
            case 45:
                if (this.matchAICommentaryService == null) {
                    synchronized (cls) {
                        try {
                            if (this.matchAICommentaryService == null) {
                                this.matchAICommentaryService = new MatchAICommentaryService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMatchAICommentaryService iMatchAICommentaryService = this.matchAICommentaryService;
                if (iMatchAICommentaryService instanceof C006A) {
                    return iMatchAICommentaryService;
                }
                return null;
            case 46:
                if (this.multiGuestV3InternalServiceV2 == null) {
                    synchronized (cls) {
                        try {
                            if (this.multiGuestV3InternalServiceV2 == null) {
                                this.multiGuestV3InternalServiceV2 = new MultiGuestV3InternalServiceImplV2();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMultiGuestV3InternalServiceV2 iMultiGuestV3InternalServiceV2 = this.multiGuestV3InternalServiceV2;
                if (iMultiGuestV3InternalServiceV2 instanceof C006A) {
                    return iMultiGuestV3InternalServiceV2;
                }
                return null;
            case 47:
                if (this.quickCoHostService == null) {
                    synchronized (cls) {
                        try {
                            if (this.quickCoHostService == null) {
                                this.quickCoHostService = new QuickCoHostService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IQuickCoHostService iQuickCoHostService = this.quickCoHostService;
                if (iQuickCoHostService instanceof C006A) {
                    return iQuickCoHostService;
                }
                return null;
            case 48:
                if (this.multiHostCrossAdapter == null) {
                    synchronized (cls) {
                        try {
                            if (this.multiHostCrossAdapter == null) {
                                this.multiHostCrossAdapter = new MultiHostCrossAdapterImpl();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMultiHostCrossAdapter iMultiHostCrossAdapter = this.multiHostCrossAdapter;
                if (iMultiHostCrossAdapter instanceof C006A) {
                    return iMultiHostCrossAdapter;
                }
                return null;
            case 49:
                if (this.multiHostService == null) {
                    synchronized (cls) {
                        try {
                            if (this.multiHostService == null) {
                                this.multiHostService = new MultiHostService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMultiHostService iMultiHostService = this.multiHostService;
                if (iMultiHostService instanceof C006A) {
                    return iMultiHostService;
                }
                return null;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                if (this.pullStreamService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pullStreamService == null) {
                                PullStreamService pullStreamService = new PullStreamService();
                                if (LiveServiceManagerOptSetting.enable()) {
                                    C823050WQl.LIZIZ().submit(new ARunnableS135S0100000_35(pullStreamService, 1));
                                } else {
                                    C0TI7.LIZ = new C1ED4();
                                }
                                this.pullStreamService = pullStreamService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPullStreamService iPullStreamService = this.pullStreamService;
                if (iPullStreamService instanceof C006A) {
                    return iPullStreamService;
                }
                return null;
            case 51:
                if (this.liveMarketingService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveMarketingService == null) {
                                this.liveMarketingService = new LiveMarketingService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveMarketingService iLiveMarketingService = this.liveMarketingService;
                if (iLiveMarketingService instanceof C006A) {
                    return iLiveMarketingService;
                }
                return null;
            case 52:
                if (this.micRoomService == null) {
                    synchronized (cls) {
                        try {
                            if (this.micRoomService == null) {
                                this.micRoomService = new MicRoomService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMicRoomService iMicRoomService = this.micRoomService;
                if (iMicRoomService instanceof C006A) {
                    return iMicRoomService;
                }
                return null;
            case 53:
                if (this.moderatorService == null) {
                    synchronized (cls) {
                        try {
                            if (this.moderatorService == null) {
                                this.moderatorService = new ModeratorService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IModeratorService iModeratorService = this.moderatorService;
                if (iModeratorService instanceof C006A) {
                    return iModeratorService;
                }
                return null;
            case 54:
                if (this.businessAvoidConflictNotifyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.businessAvoidConflictNotifyService == null) {
                                this.businessAvoidConflictNotifyService = new BusinessAvoidConflictNotifyService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IBusinessAvoidConflictNotifyService iBusinessAvoidConflictNotifyService = this.businessAvoidConflictNotifyService;
                if (iBusinessAvoidConflictNotifyService instanceof C006A) {
                    return iBusinessAvoidConflictNotifyService;
                }
                return null;
            case 55:
                if (this.liveNotifyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveNotifyService == null) {
                                this.liveNotifyService = new LiveNotifyService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveNotifyService iLiveNotifyService = this.liveNotifyService;
                if (iLiveNotifyService instanceof C006A) {
                    return iLiveNotifyService;
                }
                return null;
            case 56:
                if (this.pinCardService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pinCardService == null) {
                                this.pinCardService = new PinCardService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPinCardService iPinCardService = this.pinCardService;
                if (iPinCardService instanceof C006A) {
                    return iPinCardService;
                }
                return null;
            case 57:
                if (this.liveProfileService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveProfileService == null) {
                                this.liveProfileService = new LiveProfileService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveProfileService iLiveProfileService = this.liveProfileService;
                if (iLiveProfileService instanceof C006A) {
                    return iLiveProfileService;
                }
                return null;
            case 58:
                if (this.programmedLiveService == null) {
                    synchronized (cls) {
                        try {
                            if (this.programmedLiveService == null) {
                                this.programmedLiveService = new ProgrammedLiveService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IProgrammedLiveService iProgrammedLiveService = this.programmedLiveService;
                if (iProgrammedLiveService instanceof C006A) {
                    return iProgrammedLiveService;
                }
                return null;
            case 59:
                if (this.publicScreenService == null) {
                    synchronized (cls) {
                        try {
                            if (this.publicScreenService == null) {
                                PublicScreenService publicScreenService = new PublicScreenService();
                                publicScreenService.onInit();
                                this.publicScreenService = publicScreenService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPublicScreenService iPublicScreenService = this.publicScreenService;
                if (iPublicScreenService instanceof C006A) {
                    return iPublicScreenService;
                }
                return null;
            case 60:
                if (this.enigmaPublicScreenService == null) {
                    synchronized (cls) {
                        try {
                            if (this.enigmaPublicScreenService == null) {
                                this.enigmaPublicScreenService = new EnigmaPublicScreenService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IEnigmaPublicScreenService iEnigmaPublicScreenService = this.enigmaPublicScreenService;
                if (iEnigmaPublicScreenService instanceof C006A) {
                    return iEnigmaPublicScreenService;
                }
                return null;
            case 61:
                if (this.qAService == null) {
                    synchronized (cls) {
                        try {
                            if (this.qAService == null) {
                                QAService qAService = new QAService();
                                if (!LiveServiceManagerOptSetting.enable()) {
                                    qAService.LL = true;
                                    ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).jc0(new C1109420eya());
                                }
                                this.qAService = qAService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IQAService iQAService = this.qAService;
                if (iQAService instanceof C006A) {
                    return iQAService;
                }
                return null;
            case BaseNotice.CREATOR /* 62 */:
                if (this.shareService == null) {
                    synchronized (cls) {
                        try {
                            if (this.shareService == null) {
                                this.shareService = new ShareService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IShareService iShareService = this.shareService;
                if (iShareService instanceof C006A) {
                    return iShareService;
                }
                return null;
            case 63:
                if (this.shortTouchService == null) {
                    synchronized (cls) {
                        try {
                            if (this.shortTouchService == null) {
                                this.shortTouchService = new ShortTouchService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IShortTouchService iShortTouchService = this.shortTouchService;
                if (iShortTouchService instanceof C006A) {
                    return iShortTouchService;
                }
                return null;
            case 64:
                if (this.bcToggleService == null) {
                    synchronized (cls) {
                        try {
                            if (this.bcToggleService == null) {
                                this.bcToggleService = new BcToggleToggleService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IBcToggleService iBcToggleService = this.bcToggleService;
                if (iBcToggleService instanceof C006A) {
                    return iBcToggleService;
                }
                return null;
            case 65:
                if (this.liveShopBagSlotManager == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveShopBagSlotManager == null) {
                                this.liveShopBagSlotManager = new LiveShopBagSlotManagerDummy();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveShopBagSlotManager iLiveShopBagSlotManager = this.liveShopBagSlotManager;
                if (iLiveShopBagSlotManager instanceof C006A) {
                    return iLiveShopBagSlotManager;
                }
                return null;
            case 66:
                if (this.slotService == null) {
                    synchronized (cls) {
                        try {
                            if (this.slotService == null) {
                                SlotService slotService = new SlotService();
                                slotService.onInit();
                                this.slotService = slotService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISlotService iSlotService = this.slotService;
                if (iSlotService instanceof C006A) {
                    return iSlotService;
                }
                return null;
            case 67:
                if (this.toolbarBtmService == null) {
                    synchronized (cls) {
                        try {
                            if (this.toolbarBtmService == null) {
                                this.toolbarBtmService = new ToolbarBtmService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IToolbarBtmService iToolbarBtmService = this.toolbarBtmService;
                if (iToolbarBtmService instanceof C006A) {
                    return iToolbarBtmService;
                }
                return null;
            case 68:
                if (this.toolbarService == null) {
                    synchronized (cls) {
                        try {
                            if (this.toolbarService == null) {
                                this.toolbarService = new ToolbarService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IToolbarService iToolbarService = this.toolbarService;
                if (iToolbarService instanceof C006A) {
                    return iToolbarService;
                }
                return null;
            case 69:
                if (this.unityAnimationService == null) {
                    synchronized (cls) {
                        try {
                            if (this.unityAnimationService == null) {
                                this.unityAnimationService = new UnityAnimationService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IUnityAnimationService iUnityAnimationService = this.unityAnimationService;
                if (iUnityAnimationService instanceof C006A) {
                    return iUnityAnimationService;
                }
                return null;
            case 70:
                if (this.userInfoWidgetService == null) {
                    synchronized (cls) {
                        try {
                            if (this.userInfoWidgetService == null) {
                                this.userInfoWidgetService = new UserInfoWidgetService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IUserInfoWidgetService iUserInfoWidgetService = this.userInfoWidgetService;
                if (iUserInfoWidgetService instanceof C006A) {
                    return iUserInfoWidgetService;
                }
                return null;
            case 71:
                if (this.userManageService == null) {
                    synchronized (cls) {
                        try {
                            if (this.userManageService == null) {
                                this.userManageService = new UserManageService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IUserManageService iUserManageService = this.userManageService;
                if (iUserManageService instanceof C006A) {
                    return iUserManageService;
                }
                return null;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                if (this.walletExceptionService == null) {
                    synchronized (cls) {
                        try {
                            if (this.walletExceptionService == null) {
                                this.walletExceptionService = new WalletExceptionService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IWalletExceptionService iWalletExceptionService = this.walletExceptionService;
                if (iWalletExceptionService instanceof C006A) {
                    return iWalletExceptionService;
                }
                return null;
            case 73:
                if (this.walletService == null) {
                    synchronized (cls) {
                        try {
                            if (this.walletService == null) {
                                WalletService walletService = new WalletService();
                                walletService.onInit();
                                this.walletService = walletService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IWalletService iWalletService = this.walletService;
                if (iWalletService instanceof C006A) {
                    return iWalletService;
                }
                return null;
            case 74:
                if (this.locationPickerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.locationPickerService == null) {
                                this.locationPickerService = new LocationService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILocationPickerService iLocationPickerService = this.locationPickerService;
                if (iLocationPickerService instanceof C006A) {
                    return iLocationPickerService;
                }
                return null;
            case 75:
                if (this.barrageService == null) {
                    synchronized (cls) {
                        try {
                            if (this.barrageService == null) {
                                this.barrageService = new BarrageServiceImpl();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IBarrageService iBarrageService = this.barrageService;
                if (iBarrageService instanceof C006A) {
                    return iBarrageService;
                }
                return null;
            case 76:
                if (this.coinIncentiveService == null) {
                    synchronized (cls) {
                        try {
                            if (this.coinIncentiveService == null) {
                                this.coinIncentiveService = new CoinIncentiveServiceDummy();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ICoinIncentiveService iCoinIncentiveService = this.coinIncentiveService;
                if (iCoinIncentiveService instanceof C006A) {
                    return iCoinIncentiveService;
                }
                return null;
            case 77:
                if (this.revenueService == null) {
                    synchronized (cls) {
                        try {
                            if (this.revenueService == null) {
                                RevenueService revenueService = new RevenueService();
                                revenueService.onInit();
                                this.revenueService = revenueService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IRevenueService iRevenueService = this.revenueService;
                if (iRevenueService instanceof C006A) {
                    return iRevenueService;
                }
                return null;
            case 78:
                if (this.announcementService == null) {
                    synchronized (cls) {
                        try {
                            if (this.announcementService == null) {
                                this.announcementService = new AnnouncementService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IAnnouncementService iAnnouncementService = this.announcementService;
                if (iAnnouncementService instanceof C006A) {
                    return iAnnouncementService;
                }
                return null;
            case 79:
                if (this.liveAsrHostService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveAsrHostService == null) {
                                this.liveAsrHostService = new LiveAsrHostServiceImpl();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveAsrHostService iLiveAsrHostService = this.liveAsrHostService;
                if (iLiveAsrHostService instanceof C006A) {
                    return iLiveAsrHostService;
                }
                return null;
            case 80:
                if (this.cRMGoalService == null) {
                    synchronized (cls) {
                        try {
                            if (this.cRMGoalService == null) {
                                this.cRMGoalService = new CRMGoalService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ICRMGoalService iCRMGoalService = this.cRMGoalService;
                if (iCRMGoalService instanceof C006A) {
                    return iCRMGoalService;
                }
                return null;
            case 81:
                if (this.enigmaPurchaseService == null) {
                    synchronized (cls) {
                        try {
                            if (this.enigmaPurchaseService == null) {
                                this.enigmaPurchaseService = new EnigmaPurchaseService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IEnigmaPurchaseService iEnigmaPurchaseService = this.enigmaPurchaseService;
                if (iEnigmaPurchaseService instanceof C006A) {
                    return iEnigmaPurchaseService;
                }
                return null;
            case 82:
                if (this.enigmaService == null) {
                    synchronized (cls) {
                        try {
                            if (this.enigmaService == null) {
                                this.enigmaService = new EnigmaService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IEnigmaService iEnigmaService = this.enigmaService;
                if (iEnigmaService instanceof C006A) {
                    return iEnigmaService;
                }
                return null;
            case 83:
                if (this.goodyBagService == null) {
                    synchronized (cls) {
                        try {
                            if (this.goodyBagService == null) {
                                this.goodyBagService = new GoodyBagService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGoodyBagService iGoodyBagService = this.goodyBagService;
                if (iGoodyBagService instanceof C006A) {
                    return iGoodyBagService;
                }
                return null;
            case 84:
                if (this.guardianService == null) {
                    synchronized (cls) {
                        try {
                            if (this.guardianService == null) {
                                this.guardianService = new GuardianService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGuardianService iGuardianService = this.guardianService;
                if (iGuardianService instanceof C006A) {
                    return iGuardianService;
                }
                return null;
            case 85:
                if (this.userLevelService == null) {
                    synchronized (cls) {
                        try {
                            if (this.userLevelService == null) {
                                this.userLevelService = new UserLevelService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IUserLevelService iUserLevelService = this.userLevelService;
                if (iUserLevelService instanceof C006A) {
                    return iUserLevelService;
                }
                return null;
            case 86:
                if (this.multiImageLoader == null) {
                    synchronized (cls) {
                        try {
                            if (this.multiImageLoader == null) {
                                this.multiImageLoader = new MultiImageLoader();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMultiImageLoader iMultiImageLoader = this.multiImageLoader;
                if (iMultiImageLoader instanceof C006A) {
                    return iMultiImageLoader;
                }
                return null;
            case 87:
                if (this.starCommentService == null) {
                    synchronized (cls) {
                        try {
                            if (this.starCommentService == null) {
                                this.starCommentService = new StarCommentService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IStarCommentService iStarCommentService = this.starCommentService;
                if (iStarCommentService instanceof C006A) {
                    return iStarCommentService;
                }
                return null;
            case 88:
                if (this.revenueStrategyService == null) {
                    synchronized (cls) {
                        try {
                            if (this.revenueStrategyService == null) {
                                this.revenueStrategyService = new RevenueStrategy();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IRevenueStrategyService iRevenueStrategyService = this.revenueStrategyService;
                if (iRevenueStrategyService instanceof C006A) {
                    return iRevenueStrategyService;
                }
                return null;
            case 89:
                if (this.treasureBoxService == null) {
                    synchronized (cls) {
                        try {
                            if (this.treasureBoxService == null) {
                                this.treasureBoxService = new TreasureBoxService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ITreasureBoxService iTreasureBoxService = this.treasureBoxService;
                if (iTreasureBoxService instanceof C006A) {
                    return iTreasureBoxService;
                }
                return null;
            case 90:
                if (this.debugService == null) {
                    synchronized (cls) {
                        try {
                            if (this.debugService == null) {
                                this.debugService = new DebugService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IDebugService iDebugService = this.debugService;
                if (iDebugService instanceof C006A) {
                    return iDebugService;
                }
                return null;
            case 91:
                if (this.donationStickerOuterService == null) {
                    synchronized (cls) {
                        try {
                            if (this.donationStickerOuterService == null) {
                                this.donationStickerOuterService = new DonationStickerOuterService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IDonationStickerOuterService iDonationStickerOuterService = this.donationStickerOuterService;
                if (iDonationStickerOuterService instanceof C006A) {
                    return iDonationStickerOuterService;
                }
                return null;
            case 92:
                if (this.liveEventStickerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveEventStickerService == null) {
                                this.liveEventStickerService = new LiveEventStickerService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveEventStickerService iLiveEventStickerService = this.liveEventStickerService;
                if (iLiveEventStickerService instanceof C006A) {
                    return iLiveEventStickerService;
                }
                return null;
            case 93:
                if (this.roomStickerOuterService == null) {
                    synchronized (cls) {
                        try {
                            if (this.roomStickerOuterService == null) {
                                RoomStickerOuterService roomStickerOuterService = new RoomStickerOuterService();
                                roomStickerOuterService.onInit();
                                this.roomStickerOuterService = roomStickerOuterService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IRoomStickerOuterService iRoomStickerOuterService = this.roomStickerOuterService;
                if (iRoomStickerOuterService instanceof C006A) {
                    return iRoomStickerOuterService;
                }
                return null;
            case 94:
                if (this.liveEventService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveEventService == null) {
                                this.liveEventService = new LiveEventService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveEventService iLiveEventService = this.liveEventService;
                if (iLiveEventService instanceof C006A) {
                    return iLiveEventService;
                }
                return null;
            case 95:
                if (this.gameLinkMicService == null) {
                    synchronized (cls) {
                        try {
                            if (this.gameLinkMicService == null) {
                                this.gameLinkMicService = new GameLinkMicService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGameLinkMicService iGameLinkMicService = this.gameLinkMicService;
                if (iGameLinkMicService instanceof C006A) {
                    return iGameLinkMicService;
                }
                return null;
            case 96:
                if (this.gameDualDeviceService == null) {
                    synchronized (cls) {
                        try {
                            if (this.gameDualDeviceService == null) {
                                this.gameDualDeviceService = new GameDualDeviceService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGameDualDeviceService iGameDualDeviceService = this.gameDualDeviceService;
                if (iGameDualDeviceService instanceof C006A) {
                    return iGameDualDeviceService;
                }
                return null;
            case 97:
                if (this.gamePartnershipService == null) {
                    synchronized (cls) {
                        try {
                            if (this.gamePartnershipService == null) {
                                this.gamePartnershipService = new GamePartnershipService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGamePartnershipService iGamePartnershipService = this.gamePartnershipService;
                if (iGamePartnershipService instanceof C006A) {
                    return iGamePartnershipService;
                }
                return null;
            case 98:
                if (this.gameService == null) {
                    synchronized (cls) {
                        try {
                            if (this.gameService == null) {
                                GameService gameService = new GameService();
                                gameService.onInit();
                                this.gameService = gameService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGameService iGameService = this.gameService;
                if (iGameService instanceof C006A) {
                    return iGameService;
                }
                return null;
            case 99:
                if (this.imageService == null) {
                    synchronized (cls) {
                        try {
                            if (this.imageService == null) {
                                this.imageService = new ImageService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IImageService iImageService = this.imageService;
                if (iImageService instanceof C006A) {
                    return iImageService;
                }
                return null;
            case 100:
                if (this.linkCoreService == null) {
                    synchronized (cls) {
                        try {
                            if (this.linkCoreService == null) {
                                this.linkCoreService = new LinkCoreService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILinkCoreService iLinkCoreService = this.linkCoreService;
                if (iLinkCoreService instanceof C006A) {
                    return iLinkCoreService;
                }
                return null;
            case 101:
                if (this.linkMicService == null) {
                    synchronized (cls) {
                        try {
                            if (this.linkMicService == null) {
                                this.linkMicService = new LinkMicService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILinkMicService iLinkMicService = this.linkMicService;
                if (iLinkMicService instanceof C006A) {
                    return iLinkMicService;
                }
                return null;
            case 102:
                if (this.loggerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.loggerService == null) {
                                this.loggerService = new LoggerService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILoggerService iLoggerService = this.loggerService;
                if (iLoggerService instanceof C006A) {
                    return iLoggerService;
                }
                return null;
            case 103:
                if (this.musicGiftService == null) {
                    synchronized (cls) {
                        try {
                            if (this.musicGiftService == null) {
                                this.musicGiftService = new MusicGiftService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMusicGiftService iMusicGiftService = this.musicGiftService;
                if (iMusicGiftService instanceof C006A) {
                    return iMusicGiftService;
                }
                return null;
            case 104:
                if (this.networkService == null) {
                    synchronized (cls) {
                        try {
                            if (this.networkService == null) {
                                this.networkService = new NetworkService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                INetworkService iNetworkService = this.networkService;
                if (iNetworkService instanceof C006A) {
                    return iNetworkService;
                }
                return null;
            case 105:
                if (this.pcsService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pcsService == null) {
                                PcsService pcsService = new PcsService();
                                pcsService.onInit();
                                this.pcsService = pcsService;
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPcsService iPcsService = this.pcsService;
                if (iPcsService instanceof C006A) {
                    return iPcsService;
                }
                return null;
            case 106:
                if (this.performanceService == null) {
                    synchronized (cls) {
                        try {
                            if (this.performanceService == null) {
                                this.performanceService = new PerformanceService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPerformanceService iPerformanceService = this.performanceService;
                if (iPerformanceService instanceof C006A) {
                    return iPerformanceService;
                }
                return null;
            case 107:
                if (this.subscribeService == null) {
                    synchronized (cls) {
                        try {
                            if (this.subscribeService == null) {
                                SubscribeService subscribeService = new SubscribeService();
                                subscribeService.onInit();
                                this.subscribeService = subscribeService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISubscribeService iSubscribeService = this.subscribeService;
                if (iSubscribeService instanceof C006A) {
                    return iSubscribeService;
                }
                return null;
            case 108:
                if (this.subscriptionStatusService == null) {
                    synchronized (cls) {
                        try {
                            if (this.subscriptionStatusService == null) {
                                this.subscriptionStatusService = new SubscriptionStatusService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ISubscriptionStatusService iSubscriptionStatusService = this.subscriptionStatusService;
                if (iSubscriptionStatusService instanceof C006A) {
                    return iSubscriptionStatusService;
                }
                return null;
            case 109:
                if (this.groupLiveService == null) {
                    synchronized (cls) {
                        try {
                            if (this.groupLiveService == null) {
                                this.groupLiveService = new GroupLiveServiceImpl();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IGroupLiveService iGroupLiveService = this.groupLiveService;
                if (iGroupLiveService instanceof C006A) {
                    return iGroupLiveService;
                }
                return null;
            case 110:
                if (this.padAutoRotateScreenService == null) {
                    synchronized (cls) {
                        try {
                            if (this.padAutoRotateScreenService == null) {
                                this.padAutoRotateScreenService = new PadAutoRotateScreenService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPadAutoRotateScreenService iPadAutoRotateScreenService = this.padAutoRotateScreenService;
                if (iPadAutoRotateScreenService instanceof C006A) {
                    return iPadAutoRotateScreenService;
                }
                return null;
            case 111:
                if (this.padMultiScreenService == null) {
                    synchronized (cls) {
                        try {
                            if (this.padMultiScreenService == null) {
                                this.padMultiScreenService = new PadMultiScreenService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPadMultiScreenService iPadMultiScreenService = this.padMultiScreenService;
                if (iPadMultiScreenService instanceof C006A) {
                    return iPadMultiScreenService;
                }
                return null;
            case 112:
                if (this.liveMemoryTrigger == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveMemoryTrigger == null) {
                                this.liveMemoryTrigger = new MemoryTriggerCoordinator();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                LiveMemoryTrigger liveMemoryTrigger = this.liveMemoryTrigger;
                if (liveMemoryTrigger instanceof C006A) {
                    return liveMemoryTrigger;
                }
                return null;
            case 113:
                if (this.rankService == null) {
                    synchronized (cls) {
                        try {
                            if (this.rankService == null) {
                                RankService rankService = new RankService();
                                rankService.onInit();
                                this.rankService = rankService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IRankService iRankService = this.rankService;
                if (iRankService instanceof C006A) {
                    return iRankService;
                }
                return null;
            case 114:
                if (this.liveEffectRenderService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveEffectRenderService == null) {
                                this.liveEffectRenderService = new LiveEffectRenderService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveEffectRenderService iLiveEffectRenderService = this.liveEffectRenderService;
                if (iLiveEffectRenderService instanceof C006A) {
                    return iLiveEffectRenderService;
                }
                return null;
            case 115:
                if (this.fansClubService == null) {
                    synchronized (cls) {
                        try {
                            if (this.fansClubService == null) {
                                FansClubService fansClubService = new FansClubService();
                                fansClubService.onInit();
                                this.fansClubService = fansClubService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IFansClubService iFansClubService = this.fansClubService;
                if (iFansClubService instanceof C006A) {
                    return iFansClubService;
                }
                return null;
            case 116:
                if (this.userLevelBackService == null) {
                    synchronized (cls) {
                        try {
                            if (this.userLevelBackService == null) {
                                this.userLevelBackService = new UserLevelBackService();
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IUserLevelBackService iUserLevelBackService = this.userLevelBackService;
                if (iUserLevelBackService instanceof C006A) {
                    return iUserLevelBackService;
                }
                return null;
            case 117:
                if (this.linkMicInteractAbilityService == null) {
                    synchronized (cls) {
                        try {
                            if (this.linkMicInteractAbilityService == null) {
                                this.linkMicInteractAbilityService = new LinkMicInteractAbilityService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILinkMicInteractAbilityService iLinkMicInteractAbilityService = this.linkMicInteractAbilityService;
                if (iLinkMicInteractAbilityService instanceof C006A) {
                    return iLinkMicInteractAbilityService;
                }
                return null;
            case 118:
                if (this.variantCardService == null) {
                    synchronized (cls) {
                        try {
                            if (this.variantCardService == null) {
                                this.variantCardService = new VariantCardService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IVariantCardService iVariantCardService = this.variantCardService;
                if (iVariantCardService instanceof C006A) {
                    return iVariantCardService;
                }
                return null;
            case 119:
                if (this.watchLiveService == null) {
                    synchronized (cls) {
                        try {
                            if (this.watchLiveService == null) {
                                WatchLiveService watchLiveService = new WatchLiveService();
                                C1105280eru.LIZIZ(null, Collections.singleton(Integer.valueOf(R.layout.hyi)));
                                this.watchLiveService = watchLiveService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IWatchLiveService iWatchLiveService = this.watchLiveService;
                if (iWatchLiveService instanceof C006A) {
                    return iWatchLiveService;
                }
                return null;
            case 120:
                if (this.clearScreenService == null) {
                    synchronized (cls) {
                        try {
                            if (this.clearScreenService == null) {
                                this.clearScreenService = new ClearScreenService();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IClearScreenService iClearScreenService = this.clearScreenService;
                if (iClearScreenService instanceof C006A) {
                    return iClearScreenService;
                }
                return null;
            case 121:
                if (this.livePushService == null) {
                    synchronized (cls) {
                        try {
                            if (this.livePushService == null) {
                                this.livePushService = new LivePushService();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                ILivePushService iLivePushService = this.livePushService;
                if (iLivePushService instanceof C006A) {
                    return iLivePushService;
                }
                return null;
            case 122:
                if (this.businessAvoidanceService == null) {
                    synchronized (cls) {
                        try {
                            if (this.businessAvoidanceService == null) {
                                this.businessAvoidanceService = new BusinessAvoidanceService();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                IBusinessAvoidanceService iBusinessAvoidanceService = this.businessAvoidanceService;
                if (iBusinessAvoidanceService instanceof C006A) {
                    return iBusinessAvoidanceService;
                }
                return null;
            case 123:
                if (this.liveHostCrossRoomEventHelper == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveHostCrossRoomEventHelper == null) {
                                LiveHostCrossRoomEventHelper liveHostCrossRoomEventHelper = new LiveHostCrossRoomEventHelper();
                                liveHostCrossRoomEventHelper.onInit();
                                this.liveHostCrossRoomEventHelper = liveHostCrossRoomEventHelper;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = this.liveHostCrossRoomEventHelper;
                if (iLiveHostCrossRoomEventHelper instanceof C006A) {
                    return iLiveHostCrossRoomEventHelper;
                }
                return null;
            case 124:
                if (this.liveFeatureCenterService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveFeatureCenterService == null) {
                                this.liveFeatureCenterService = new LiveFeatureCenterService();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveFeatureCenterService iLiveFeatureCenterService = this.liveFeatureCenterService;
                if (iLiveFeatureCenterService instanceof C006A) {
                    return iLiveFeatureCenterService;
                }
                return null;
            case 125:
                if (this.liveStrategyCenterService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveStrategyCenterService == null) {
                                this.liveStrategyCenterService = new LiveStrategyCenterService();
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveStrategyCenterService iLiveStrategyCenterService = this.liveStrategyCenterService;
                if (iLiveStrategyCenterService instanceof C006A) {
                    return iLiveStrategyCenterService;
                }
                return null;
            case 126:
                if (this.messageService == null) {
                    synchronized (cls) {
                        try {
                            if (this.messageService == null) {
                                MessageService messageService = new MessageService();
                                messageService.onInit();
                                this.messageService = messageService;
                            }
                        } catch (Throwable th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IMessageService iMessageService = this.messageService;
                if (iMessageService instanceof C006A) {
                    return iMessageService;
                }
                return null;
            case 127:
                if (this.pTFService == null) {
                    synchronized (cls) {
                        try {
                            if (this.pTFService == null) {
                                this.pTFService = new PTFServiceImpl();
                            }
                        } catch (Throwable th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                IPTFService iPTFService = this.pTFService;
                if (iPTFService instanceof C006A) {
                    return iPTFService;
                }
                return null;
            case 128:
                if (this.liveGiftAlphaPlayerService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveGiftAlphaPlayerService == null) {
                                LiveGiftPlayerService liveGiftPlayerService = new LiveGiftPlayerService();
                                liveGiftPlayerService.onInit();
                                this.liveGiftAlphaPlayerService = liveGiftPlayerService;
                            }
                        } catch (Throwable th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222) {
                            throw th2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222;
                        }
                        break;
                    }
                }
                ILiveGiftAlphaPlayerService iLiveGiftAlphaPlayerService = this.liveGiftAlphaPlayerService;
                if (iLiveGiftAlphaPlayerService instanceof C006A) {
                    return iLiveGiftAlphaPlayerService;
                }
                return null;
            case 129:
                if (this.liveDanceService == null) {
                    synchronized (cls) {
                        try {
                            if (this.liveDanceService == null) {
                                this.liveDanceService = new LiveDanceService();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                ILiveDanceService iLiveDanceService = this.liveDanceService;
                if (iLiveDanceService instanceof C006A) {
                    return iLiveDanceService;
                }
                return null;
            default:
                return null;
        }
    }

    private final int getServiceType(Class<?> cls) {
        if (cls == null) {
            return -1;
        }
        Integer num = this.serviceClazz2Index.get(cls);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = this.serviceName2Index.get(cls.getSimpleName());
        if (num2 == null) {
            return -1;
        }
        this.serviceClazz2Index.put(cls, num2);
        return num2.intValue();
    }
}
