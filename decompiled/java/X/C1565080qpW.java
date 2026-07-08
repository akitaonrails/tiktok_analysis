package X;

import com.bytedance.tiktok.homepage.mainactivity.LegacyPlayerActivityAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.LegoAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageLogAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageTabA11yAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.main.AccountMainActivityAssem;
import com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem;
import com.ss.android.ugc.aweme.api.component.panel.CommercePanelComponent;
import com.ss.android.ugc.aweme.assem.CaptionMainActivityAssem;
import com.ss.android.ugc.aweme.assem.FriendsMainPageFragmentAssem;
import com.ss.android.ugc.aweme.cache.FollowingFeedAssem;
import com.ss.android.ugc.aweme.casting.ui.casting.CastingPanelComponent;
import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionLogicComponent;
import com.ss.android.ugc.aweme.comment.service.assem.CommentHomeViewPagerAssem;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.MallMainActivityAssem;
import com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch.EcAfterSearchFeedBubbleComponent;
import com.ss.android.ugc.aweme.ecommerce.ug.coldbootdowngrade.service.IEcUgColdBootDowngradeService;
import com.ss.android.ugc.aweme.ecommerce.ug.common.assem.EcUgMainAssem;
import com.ss.android.ugc.aweme.experiment.ColdBootDegradeAssem;
import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import com.ss.android.ugc.aweme.explore.assem.ExploreAssem;
import com.ss.android.ugc.aweme.feed.assem.mainactivityobserver.CommonFeedActivityAssem;
import com.ss.android.ugc.aweme.feed.assem.music.MusicPreloadTask;
import com.ss.android.ugc.aweme.feed.assems.LiveMainActivityAssem;
import com.ss.android.ugc.aweme.feed.assems.LiveMainFragmentAssem;
import com.ss.android.ugc.aweme.feed.component.ColdCacheRevertInsertComponent;
import com.ss.android.ugc.aweme.feed.component.FeedRefreshRecoverComponent;
import com.ss.android.ugc.aweme.feed.component.GoldenHouseComponent;
import com.ss.android.ugc.aweme.feed.component.LandscapeInnerSyncComponent;
import com.ss.android.ugc.aweme.feed.component.ReachBottomCacheComponent;
import com.ss.android.ugc.aweme.feed.component.RecommendFeedComponent;
import com.ss.android.ugc.aweme.feed.component.RecommendInstantFeedComponent;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.flexible.FlexibleSheetComponent;
import com.ss.android.ugc.aweme.feed.flexible.spark.FlexibleSparkPreloadTask;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeAutoRotationSwipeGuideUIComponent;
import com.ss.android.ugc.aweme.feed.lynxcard.FeedLynxCardLoaderComponent;
import com.ss.android.ugc.aweme.feed.referral.lynxcard.IncentiveForYouFeedLynxCardComponent;
import com.ss.android.ugc.aweme.feed.survey.component.PromptComponent;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.assem.MainPageFriendsAssem;
import com.ss.android.ugc.aweme.im.service.impl.deeplink.IMDeepLinkHandlerAssem;
import com.ss.android.ugc.aweme.inbox.assem.InboxEnterMobEventByPushAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.task.BulletinBoardInitAssem;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushColdStartExp;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushFeedListUIComponent;
import com.ss.android.ugc.aweme.live.SubsServiceMainActivityAssem;
import com.ss.android.ugc.aweme.live.assem.FollowWidgetAssem;
import com.ss.android.ugc.aweme.main.LauncherAssem;
import com.ss.android.ugc.aweme.main.LiveMainActivityColdStartAssem;
import com.ss.android.ugc.aweme.main.MainActivityLaunchScene;
import com.ss.android.ugc.aweme.main.PerformanceActivityAssem;
import com.ss.android.ugc.aweme.main.PerformanceOptAssem;
import com.ss.android.ugc.aweme.main.assems.BackRefreshStrategyAssem;
import com.ss.android.ugc.aweme.main.assems.DialogAssem;
import com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem;
import com.ss.android.ugc.aweme.main.assems.MainLegacyEventBusAssem;
import com.ss.android.ugc.aweme.main.assems.MainPageImmersiveTopBottomAssem;
import com.ss.android.ugc.aweme.main.assems.MainPageNewUserAssem;
import com.ss.android.ugc.aweme.main.assems.NewUserOptAssem;
import com.ss.android.ugc.aweme.main.assems.main.MainActivityLogAssem;
import com.ss.android.ugc.aweme.main.assems.main.MainActivityRelaunchMonitorAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.BottomTabAssemBase;
import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFComplianceAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFFeedAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFMobEventAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFPubAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFSocialAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MainFragmentBusinessAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.TopTabAssem;
import com.ss.android.ugc.aweme.main.assems.ui.HomepageViewPagerAssem;
import com.ss.android.ugc.aweme.main.preload.MainActivityApplyAssemPreload;
import com.ss.android.ugc.aweme.main.preload.MainActivityApplyUIAssemPreload;
import com.ss.android.ugc.aweme.main.preload.MainFragmentApplyAssemPreload;
import com.ss.android.ugc.aweme.main.preload.MainPageFragmentApplyCreateAssemPreload;
import com.ss.android.ugc.aweme.main.preload.MainPageFragmentApplyViewCreatedAssemPreload;
import com.ss.android.ugc.aweme.main.preload.ShopDotAssemPreloader;
import com.ss.android.ugc.aweme.minis.feed.instantplay.panel.MinisInstantPlayFypPanelComponent;
import com.ss.android.ugc.aweme.mix.api.PlaylistDetailPreloadTask;
import com.ss.android.ugc.aweme.mix.api.PlaylistVideosPreloadTask;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorCustomPreloadTask;
import com.ss.android.ugc.aweme.paid.content.consumption.SeriesAnchorEntrancePreloadTask;
import com.ss.android.ugc.aweme.performance.preload.PostModeTaskPreloadComponent;
import com.ss.android.ugc.aweme.pipfeed.assem.PipFeedMainActivityAssem;
import com.ss.android.ugc.aweme.poi.p009switch.PoiFypAnchorEnableComponent;
import com.ss.android.ugc.aweme.poi.preload.PoiAnchorPreloadTask;
import com.ss.android.ugc.aweme.search.widget.core.videwmodel.SearchLaunchAssem;
import com.ss.android.ugc.aweme.search.widget.core.videwmodel.SearchWidgetAssem;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner.SeriesBottomBannerEntrancePreloadTask;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton.SeriesBottomButtonEntrancePreloadTask;
import com.ss.android.ugc.aweme.service.IFeedRecommendInfoDebugService;
import com.ss.android.ugc.aweme.services.popsuite.PopSuiteTabSwitchAssem;
import com.ss.android.ugc.aweme.services.popsuite.PopSuiteTabSwitchAssemStrategy;
import com.ss.android.ugc.aweme.ug.appstart.MainActivityHelperAssem;
import com.ss.android.ugc.aweme.ui.assem.MainPagePerformanceAssem;
import com.ss.android.ugc.feed.platform.ab.FeedPagingDurationConfig;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarPreload;
import com.ss.android.ugc.feed.platform.panel.accessibility.A11yFeedToolComponent;
import com.ss.android.ugc.feed.platform.panel.adaption.impl.FeedRecommendScreenAdaptionComponent;
import com.ss.android.ugc.feed.platform.panel.autoscroll.TabletDefaultAutoScrollComponent;
import com.ss.android.ugc.feed.platform.panel.bubble.EcomSearchMallBubbleComponent;
import com.ss.android.ugc.feed.platform.panel.clean.FeedCleanComponent;
import com.ss.android.ugc.feed.platform.panel.dailyscreentime.ScreenTimePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerPanelComponent;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControlComponent;
import com.ss.android.ugc.feed.platform.panel.follow.AwemeChangedComponent;
import com.ss.android.ugc.feed.platform.panel.incentive.IncentiveFeedComponent;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveCardDeleteGapComponent;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveScrollConfigComponent;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import com.ss.android.ugc.feed.platform.panel.live.FeedRecommendInfoComponent;
import com.ss.android.ugc.feed.platform.panel.live.GamePartnershipComponent;
import com.ss.android.ugc.feed.platform.panel.live.LiveBusinessComponent;
import com.ss.android.ugc.feed.platform.panel.live.LiveLostFocusComponent;
import com.ss.android.ugc.feed.platform.panel.live.LivePreCreatePlayerComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import com.ss.android.ugc.feed.platform.panel.login.LoginFollowComponent;
import com.ss.android.ugc.feed.platform.panel.midad.MidAdComponent;
import com.ss.android.ugc.feed.platform.panel.mutantcard.MutantCardComponent;
import com.ss.android.ugc.feed.platform.panel.nonperson.FeedNonPersonalizedComponent;
import com.ss.android.ugc.feed.platform.panel.pause.PausePanelComponent;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponent;
import com.ss.android.ugc.feed.platform.panel.player.PlayerEventPanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.ResumePlayPanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.VideoPlayBehaviorMobComponent;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.RefreshPanelComponent;
import com.ss.android.ugc.feed.platform.panel.screenshot.ScreenShotPanelComponent;
import com.ss.android.ugc.feed.platform.panel.share.ShareCoinIncentiveComponent;
import com.ss.android.ugc.feed.platform.panel.signalcollect.EcomSignalCollectComponent;
import com.ss.android.ugc.feed.platform.panel.system.SystemComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPagingDurationComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerScrollAngleComponent;
import com.ss.android.ugc.feed.platform.popup.component.FeedPopupPanelComponent;
import com.ss.android.ugc.feed.platform.popup.exp.FeedDynamicBugfixConfig;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.profile.business.ci.SocialActivityAssem;
import com.ss.android.ugc.tiktok.anchor.StickerPreloadEffectTask;
import com.ss.android.ugc.tiktok.location.component.LocationFypGpsFetchComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0qpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565080qpW {
    public static List<C2238901Ck4<?, ?>> LIZIZ(String str) {
        ArrayList arrayList;
        C2238901Ck4 c2238901Ck4;
        int iHashCode = str.hashCode();
        if (iHashCode == -1686294865) {
            arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                arrayList2.add(new C1581220rFY(SeriesBottomBannerEntrancePreloadTask.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                arrayList2.add(new C1581220rFY(MusicPreloadTask.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                arrayList2.add(new C1581220rFY(FeedSearchBottomBarPreload.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                arrayList2.add(new C1581220rFY(SeriesAnchorEntrancePreloadTask.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                arrayList2.add(new C1581220rFY(SeriesBottomButtonEntrancePreloadTask.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                arrayList2.add(new C1581220rFY(PoiAnchorPreloadTask.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                arrayList2.add(new C1581220rFY(PlaylistDetailPreloadTask.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                arrayList2.add(new C1581220rFY(ShopWindowAnchorCustomPreloadTask.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                arrayList2.add(new C1581220rFY(StickerPreloadEffectTask.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                arrayList2.add(new C1581220rFY(PlaylistVideosPreloadTask.class, new C1565320qpu() { // from class: X.0qpp
                }));
            } catch (NoClassDefFoundError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            c2238901Ck4 = new C2238901Ck4(C718590SGr.class, AbsFcpDataPreloadTask.class, arrayList2);
        } else if (iHashCode == -809811072) {
            arrayList = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            try {
                arrayList3.add(new C1581220rFY(LoadMorePerfComponent.class, new C1565200qpi() { // from class: X.0qpF
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return ((Number) C283220B8e.LIZ.getValue()).intValue() == 1;
                    }
                }));
            } catch (NoClassDefFoundError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                arrayList3.add(new C1581220rFY(MainPageFriendsAssem.class, new C1565210qpj() { // from class: X.0qpl
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return !C1586520rO6.LIZIZ();
                    }
                }));
            } catch (NoClassDefFoundError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                arrayList3.add(new C1581220rFY(IncentiveFeedComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedNonPersonalizedComponent.class, new C1565200qpi() { // from class: X.0qpY
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return ComplianceServiceProvider.LJI().LJIIJ(false);
                    }
                }));
            } catch (NoClassDefFoundError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                arrayList3.add(new C1581220rFY(SocialPublishLandingAssem.class, new C1565210qpj() { // from class: X.0qpk
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return false;
                    }
                }));
            } catch (NoClassDefFoundError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                arrayList3.add(new C1581220rFY(MinisInstantPlayFypPanelComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                arrayList3.add(new C1581220rFY(MFSocialAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
            try {
                arrayList3.add(new C1581220rFY(LiveBusinessComponent.class, new C1565200qpi() { // from class: X.0qpR
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C0IVH.LIZLLL();
                    }
                }));
            } catch (NoClassDefFoundError e18) {
                TryCatchGuardChecker.doCheck(e18);
            }
            try {
                arrayList3.add(new C1581220rFY(GoldenHouseComponent.class, new C1565200qpi() { // from class: X.0qpV
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C0NHD.LIZIZ();
                    }
                }));
            } catch (NoClassDefFoundError e19) {
                TryCatchGuardChecker.doCheck(e19);
            }
            try {
                arrayList3.add(new C1581220rFY(A11yFeedToolComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e20) {
                TryCatchGuardChecker.doCheck(e20);
            }
            try {
                arrayList3.add(new C1581220rFY(SearchWidgetAssem.class, new C1565210qpj() { // from class: X.0qpb
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return !C1157804fw.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e21) {
                TryCatchGuardChecker.doCheck(e21);
            }
            try {
                arrayList3.add(new C1581220rFY(EarphonePlayerControlComponent.class, new C1565200qpi() { // from class: X.0qpd
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        IEarphonePlayerControlService iEarphonePlayerControlService = (IEarphonePlayerControlService) PluggableExtentionKt.pluggableSpi$default(IEarphonePlayerControlService.class, false, false, false, 14, null);
                        return iEarphonePlayerControlService != null && iEarphonePlayerControlService.LJ();
                    }
                }));
            } catch (NoClassDefFoundError e22) {
                TryCatchGuardChecker.doCheck(e22);
            }
            try {
                arrayList3.add(new C1581220rFY(MFPubAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e23) {
                TryCatchGuardChecker.doCheck(e23);
            }
            try {
                arrayList3.add(new C1581220rFY(MainPagePerformanceAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e24) {
                TryCatchGuardChecker.doCheck(e24);
            }
            try {
                arrayList3.add(new C1581220rFY(VideoPlayBehaviorMobComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e25) {
                TryCatchGuardChecker.doCheck(e25);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedLiveStatusManagerComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e26) {
                TryCatchGuardChecker.doCheck(e26);
            }
            try {
                arrayList3.add(new C1581220rFY(ViewPagerScrollAngleComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e27) {
                TryCatchGuardChecker.doCheck(e27);
            }
            try {
                arrayList3.add(new C1581220rFY(LocationFypGpsFetchComponent.class, new C1565200qpi() { // from class: X.0qpS
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C292400Bd8.LIZ > 0;
                    }
                }));
            } catch (NoClassDefFoundError e28) {
                TryCatchGuardChecker.doCheck(e28);
            }
            try {
                arrayList3.add(new C1581220rFY(MFComplianceAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e29) {
                TryCatchGuardChecker.doCheck(e29);
            }
            try {
                arrayList3.add(new C1581220rFY(MainPageTabA11yAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e30) {
                TryCatchGuardChecker.doCheck(e30);
            }
            try {
                arrayList3.add(new C1581220rFY(ExploreAssem.class, new C1565210qpj() { // from class: X.0qnf
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return C1583440rJ8.LIZ() || C1583440rJ8.LIZIZ();
                    }
                }));
            } catch (NoClassDefFoundError e31) {
                TryCatchGuardChecker.doCheck(e31);
            }
            try {
                arrayList3.add(new C1581220rFY(LandscapeAutoRotationSwipeGuideUIComponent.class, new C1565200qpi() { // from class: X.0qpQ
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        boolean z = C713290RyR.LIZ;
                        if (!C713290RyR.LIZ) {
                            return false;
                        }
                        boolean z2 = C292420BdA.LIZ;
                        return C292420BdA.LIZ;
                    }
                }));
            } catch (NoClassDefFoundError e32) {
                TryCatchGuardChecker.doCheck(e32);
            }
            try {
                arrayList3.add(new C1581220rFY(PromptComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e33) {
                TryCatchGuardChecker.doCheck(e33);
            }
            try {
                arrayList3.add(new C1581220rFY(NoticeAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e34) {
                TryCatchGuardChecker.doCheck(e34);
            }
            try {
                arrayList3.add(new C1581220rFY(ScreenTimePanelComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e35) {
                TryCatchGuardChecker.doCheck(e35);
            }
            try {
                arrayList3.add(new C1581220rFY(PipFeedMainActivityAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e36) {
                TryCatchGuardChecker.doCheck(e36);
            }
            try {
                arrayList3.add(new C1581220rFY(PlayButtonComponent.class, new C1565200qpi() { // from class: X.0T9g
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C0BOS.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e37) {
                TryCatchGuardChecker.doCheck(e37);
            }
            try {
                arrayList3.add(new C1581220rFY(MFBizIconsAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e38) {
                TryCatchGuardChecker.doCheck(e38);
            }
            try {
                arrayList3.add(new C1581220rFY(LiveLostFocusComponent.class, new C1565200qpi() { // from class: X.0T9e
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return ((Boolean) C0BKS.LIZ.getValue()).booleanValue() || C0J8Q.LIZJ();
                    }
                }));
            } catch (NoClassDefFoundError e39) {
                TryCatchGuardChecker.doCheck(e39);
            }
            try {
                arrayList3.add(new C1581220rFY(EcUgMainAssem.class, new C1565210qpj() { // from class: X.0C37
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
                        return !(iEcUgColdBootDowngradeService == null || iEcUgColdBootDowngradeService.LIZIZ()) || C1514430pVp.LIZLLL().booleanValue();
                    }
                }));
            } catch (NoClassDefFoundError e40) {
                TryCatchGuardChecker.doCheck(e40);
            }
            try {
                arrayList3.add(new C1581220rFY(LegoAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e41) {
                TryCatchGuardChecker.doCheck(e41);
            }
            try {
                arrayList3.add(new C1581220rFY(ColdCacheRevertInsertComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e42) {
                TryCatchGuardChecker.doCheck(e42);
            }
            try {
                arrayList3.add(new C1581220rFY(EcomSearchMallBubbleComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e43) {
                TryCatchGuardChecker.doCheck(e43);
            }
            try {
                arrayList3.add(new C1581220rFY(LegacyPlayerActivityAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e44) {
                TryCatchGuardChecker.doCheck(e44);
            }
            try {
                arrayList3.add(new C1581220rFY(LoginFollowComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e45) {
                TryCatchGuardChecker.doCheck(e45);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedRefreshRecoverComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e46) {
                TryCatchGuardChecker.doCheck(e46);
            }
            try {
                arrayList3.add(new C1581220rFY(IMDeepLinkHandlerAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e47) {
                TryCatchGuardChecker.doCheck(e47);
            }
            try {
                arrayList3.add(new C1581220rFY(CastingPanelComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e48) {
                TryCatchGuardChecker.doCheck(e48);
            }
            try {
                arrayList3.add(new C1581220rFY(ScreenShotPanelComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e49) {
                TryCatchGuardChecker.doCheck(e49);
            }
            try {
                arrayList3.add(new C1581220rFY(MidAdComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e50) {
                TryCatchGuardChecker.doCheck(e50);
            }
            try {
                arrayList3.add(new C1581220rFY(BulletinBoardInitAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e51) {
                TryCatchGuardChecker.doCheck(e51);
            }
            try {
                arrayList3.add(new C1581220rFY(MainPageSeekAssem.class, new C1565210qpj() { // from class: X.0qnd
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return !C1157604fu.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e52) {
                TryCatchGuardChecker.doCheck(e52);
            }
            try {
                arrayList3.add(new C1581220rFY(MainPageImmersiveTopBottomAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e53) {
                TryCatchGuardChecker.doCheck(e53);
            }
            try {
                arrayList3.add(new C1581220rFY(CaptionMainActivityAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e54) {
                TryCatchGuardChecker.doCheck(e54);
            }
            try {
                arrayList3.add(new C1581220rFY(MainPageLogAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e55) {
                TryCatchGuardChecker.doCheck(e55);
            }
            try {
                arrayList3.add(new C1581220rFY(LoadMorePanelComponent.class, new C1565200qpi() { // from class: X.0qph
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        boolean z = LoadMorePanelComponentTempHelper.LLILZLL;
                        return LoadMorePanelComponentTempHelper.LLILZLL;
                    }
                }));
            } catch (NoClassDefFoundError e56) {
                TryCatchGuardChecker.doCheck(e56);
            }
            try {
                arrayList3.add(new C1581220rFY(LandscapeInnerSyncComponent.class, new C1565200qpi() { // from class: X.0qpT
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        boolean z = C2552809zS.LIZ;
                        return !C2552809zS.LIZ;
                    }
                }));
            } catch (NoClassDefFoundError e57) {
                TryCatchGuardChecker.doCheck(e57);
            }
            try {
                arrayList3.add(new C1581220rFY(PopSuiteTabSwitchAssem.class, new PopSuiteTabSwitchAssemStrategy()));
            } catch (NoClassDefFoundError e58) {
                TryCatchGuardChecker.doCheck(e58);
            }
            try {
                arrayList3.add(new C1581220rFY(LivePreCreatePlayerComponent.class, new C1565200qpi() { // from class: X.0qpK
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C0C0B.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e59) {
                TryCatchGuardChecker.doCheck(e59);
            }
            try {
                arrayList3.add(new C1581220rFY(MainPageBusinessAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e60) {
                TryCatchGuardChecker.doCheck(e60);
            }
            try {
                arrayList3.add(new C1581220rFY(TopTabAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e61) {
                TryCatchGuardChecker.doCheck(e61);
            }
            try {
                arrayList3.add(new C1581220rFY(AwemeChangedComponent.class, new C1565200qpi() { // from class: X.0qpe
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return FollowRealTimeReadExp.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e62) {
                TryCatchGuardChecker.doCheck(e62);
            }
            try {
                arrayList3.add(new C1581220rFY(FollowingFeedAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e63) {
                TryCatchGuardChecker.doCheck(e63);
            }
            try {
                arrayList3.add(new C1581220rFY(MainActivityHelperAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e64) {
                TryCatchGuardChecker.doCheck(e64);
            }
            try {
                arrayList3.add(new C1581220rFY(NonPersonalizedAssem.class, new C1565210qpj() { // from class: X.0qpX
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return ComplianceServiceProvider.LJI().LJIIJ(true);
                    }
                }));
            } catch (NoClassDefFoundError e65) {
                TryCatchGuardChecker.doCheck(e65);
            }
            try {
                arrayList3.add(new C1581220rFY(InnerPushFeedListUIComponent.class, new C1565200qpi() { // from class: X.0qpc
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return InnerPushColdStartExp.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e66) {
                TryCatchGuardChecker.doCheck(e66);
            }
            try {
                arrayList3.add(new C1581220rFY(PostModeTaskPreloadComponent.class, new C1565210qpj() { // from class: X.0qpo
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return true;
                    }
                }));
            } catch (NoClassDefFoundError e67) {
                TryCatchGuardChecker.doCheck(e67);
            }
            try {
                arrayList3.add(new C1581220rFY(HomepageViewPagerAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e68) {
                TryCatchGuardChecker.doCheck(e68);
            }
            try {
                arrayList3.add(new C1581220rFY(PerformanceActivityAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e69) {
                TryCatchGuardChecker.doCheck(e69);
            }
            try {
                arrayList3.add(new C1581220rFY(MainActivityLogAssem.class, new C1565210qpj() { // from class: X.0qpm
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return false;
                    }
                }));
            } catch (NoClassDefFoundError e70) {
                TryCatchGuardChecker.doCheck(e70);
            }
            try {
                arrayList3.add(new C1581220rFY(ComplianceBusinessActivityAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e71) {
                TryCatchGuardChecker.doCheck(e71);
            }
            try {
                arrayList3.add(new C1581220rFY(EcAfterSearchFeedBubbleComponent.class, new C1565200qpi() { // from class: X.0qpf
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C687460Qxs.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e72) {
                TryCatchGuardChecker.doCheck(e72);
            }
            try {
                arrayList3.add(new C1581220rFY(MainLegacyEventBusAssem.class, new C1565210qpj() { // from class: X.0C35
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return 2 == ((Number) C278780AwG.LIZ.getValue()).intValue();
                    }
                }));
            } catch (NoClassDefFoundError e73) {
                TryCatchGuardChecker.doCheck(e73);
            }
            try {
                arrayList3.add(new C1581220rFY(CommercePanelComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e74) {
                TryCatchGuardChecker.doCheck(e74);
            }
            try {
                arrayList3.add(new C1581220rFY(FollowWidgetAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e75) {
                TryCatchGuardChecker.doCheck(e75);
            }
            try {
                arrayList3.add(new C1581220rFY(InboxEnterMobEventByPushAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e76) {
                TryCatchGuardChecker.doCheck(e76);
            }
            try {
                arrayList3.add(new C1581220rFY(ResumePlayPanelComponent.class, new C1565200qpi() { // from class: X.0T9h
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return ((Number) C300880Bqo.LIZ.getValue()).intValue() > 0;
                    }
                }));
            } catch (NoClassDefFoundError e77) {
                TryCatchGuardChecker.doCheck(e77);
            }
            try {
                arrayList3.add(new C1581220rFY(MainPageNewUserAssem.class, new C1565210qpj() { // from class: X.0qpr
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        C1602860roS.LIZ.getClass();
                        return C1602860roS.LJ();
                    }
                }));
            } catch (NoClassDefFoundError e78) {
                TryCatchGuardChecker.doCheck(e78);
            }
            try {
                arrayList3.add(new C1581220rFY(ShareCoinIncentiveComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e79) {
                TryCatchGuardChecker.doCheck(e79);
            }
            try {
                arrayList3.add(new C1581220rFY(CommentHomeViewPagerAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e80) {
                TryCatchGuardChecker.doCheck(e80);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedCleanComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e81) {
                TryCatchGuardChecker.doCheck(e81);
            }
            try {
                arrayList3.add(new C1581220rFY(LauncherAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e82) {
                TryCatchGuardChecker.doCheck(e82);
            }
            try {
                arrayList3.add(new C1581220rFY(LiveMainActivityColdStartAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e83) {
                TryCatchGuardChecker.doCheck(e83);
            }
            try {
                arrayList3.add(new C1581220rFY(MallMainActivityAssem.class, new C1565210qpj() { // from class: X.0qnc
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        IEcUgColdBootDowngradeService iEcUgColdBootDowngradeService = (IEcUgColdBootDowngradeService) PluggableExtentionKt.pluggableSpi$default(IEcUgColdBootDowngradeService.class, false, false, false, 14, null);
                        return (iEcUgColdBootDowngradeService == null || iEcUgColdBootDowngradeService.LIZLLL()) ? false : true;
                    }
                }));
            } catch (NoClassDefFoundError e84) {
                TryCatchGuardChecker.doCheck(e84);
            }
            try {
                arrayList3.add(new C1581220rFY(ViewPagerPagingDurationComponent.class, new C1565200qpi() { // from class: X.0qpE
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return ((FeedPagingDurationConfig) C1564730qox.LIZIZ.getValue()).enable;
                    }
                }));
            } catch (NoClassDefFoundError e85) {
                TryCatchGuardChecker.doCheck(e85);
            }
            try {
                arrayList3.add(new C1581220rFY(MainActivityRelaunchMonitorAssem.class, new C1565210qpj() { // from class: X.0qpn
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return false;
                    }
                }));
            } catch (NoClassDefFoundError e86) {
                TryCatchGuardChecker.doCheck(e86);
            }
            try {
                arrayList3.add(new C1581220rFY(MFFeedAssem.class, new C1565210qpj() { // from class: X.0qnh
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return !C285090BFj.LIZJ();
                    }
                }));
            } catch (NoClassDefFoundError e87) {
                TryCatchGuardChecker.doCheck(e87);
            }
            try {
                arrayList3.add(new C1581220rFY(BackRefreshStrategyAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e88) {
                TryCatchGuardChecker.doCheck(e88);
            }
            try {
                arrayList3.add(new C1581220rFY(FlexibleSheetComponent.class, new C1565200qpi() { // from class: X.0T9f
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C0T1L.LIZ().musicPageEnable || C0T1L.LIZ().effectPageEnable;
                    }
                }));
            } catch (NoClassDefFoundError e89) {
                TryCatchGuardChecker.doCheck(e89);
            }
            try {
                arrayList3.add(new C1581220rFY(PoiFypAnchorEnableComponent.class, new C1565200qpi() { // from class: X.0qpO
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C607500NsC.LIZ() || C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_enable_using_anchor", false) == 2;
                    }
                }));
            } catch (NoClassDefFoundError e90) {
                TryCatchGuardChecker.doCheck(e90);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedRecommendInfoComponent.class, new C1565200qpi() { // from class: X.0TJf
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        IFeedRecommendInfoDebugService iFeedRecommendInfoDebugService = (IFeedRecommendInfoDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedRecommendInfoDebugService.class, false, false, false, 14, null);
                        if (iFeedRecommendInfoDebugService != null) {
                            iFeedRecommendInfoDebugService.isOpen();
                        }
                        return false;
                    }
                }));
            } catch (NoClassDefFoundError e91) {
                TryCatchGuardChecker.doCheck(e91);
            }
            try {
                arrayList3.add(new C1581220rFY(MFUGAssem.class, new C1565210qpj() { // from class: X.0C36
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return !((Boolean) C285090BFj.LJJZZIII.getValue()).booleanValue();
                    }
                }));
            } catch (NoClassDefFoundError e92) {
                TryCatchGuardChecker.doCheck(e92);
            }
            try {
                arrayList3.add(new C1581220rFY(LoginAndConsentAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e93) {
                TryCatchGuardChecker.doCheck(e93);
            }
            try {
                arrayList3.add(new C1581220rFY(MainActivityBusinessAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e94) {
                TryCatchGuardChecker.doCheck(e94);
            }
            try {
                arrayList3.add(new C1581220rFY(PausePanelComponent.class, new C1565200qpi() { // from class: X.0qpJ
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C0BIE.LIZ;
                    }
                }));
            } catch (NoClassDefFoundError e95) {
                TryCatchGuardChecker.doCheck(e95);
            }
            try {
                arrayList3.add(new C1581220rFY(ViewPagerPanelComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e96) {
                TryCatchGuardChecker.doCheck(e96);
            }
            try {
                arrayList3.add(new C1581220rFY(DataLayerPanelComponent.class, new C1565200qpi() { // from class: X.0qpG
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C299770Bp1.LIZ() > 0;
                    }
                }));
            } catch (NoClassDefFoundError e97) {
                TryCatchGuardChecker.doCheck(e97);
            }
            try {
                arrayList3.add(new C1581220rFY(CommonFeedActivityAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e98) {
                TryCatchGuardChecker.doCheck(e98);
            }
            try {
                arrayList3.add(new C1581220rFY(EcomSignalCollectComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e99) {
                TryCatchGuardChecker.doCheck(e99);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedPopupPanelComponent.class, new C1565200qpi() { // from class: X.0qpL
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return ((FeedDynamicBugfixConfig) C20589115hR.LIZIZ.getValue()).enablePlayerPanel;
                    }
                }));
            } catch (NoClassDefFoundError e100) {
                TryCatchGuardChecker.doCheck(e100);
            }
            try {
                arrayList3.add(new C1581220rFY(RefreshPanelComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e101) {
                TryCatchGuardChecker.doCheck(e101);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedLynxCardLoaderComponent.class, new C1565200qpi() { // from class: X.0qpg
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C1867050ygZ.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e102) {
                TryCatchGuardChecker.doCheck(e102);
            }
            try {
                arrayList3.add(new C1581220rFY(MFMobEventAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e103) {
                TryCatchGuardChecker.doCheck(e103);
            }
            try {
                arrayList3.add(new C1581220rFY(RecommendInstantFeedComponent.class, new C1565200qpi() { // from class: X.0qpP
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return ((Boolean) C276850At9.LIZ.getValue()).booleanValue();
                    }
                }));
            } catch (NoClassDefFoundError e104) {
                TryCatchGuardChecker.doCheck(e104);
            }
            try {
                arrayList3.add(new C1581220rFY(MainFragmentBusinessAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e105) {
                TryCatchGuardChecker.doCheck(e105);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedRecommendScreenAdaptionComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e106) {
                TryCatchGuardChecker.doCheck(e106);
            }
            try {
                arrayList3.add(new C1581220rFY(TabletDefaultAutoScrollComponent.class, new C1565200qpi() { // from class: X.0qpM
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C19252910Tv.LIZIZ.LIZLLL().LJIILL().LLIIIJ();
                    }
                }));
            } catch (NoClassDefFoundError e107) {
                TryCatchGuardChecker.doCheck(e107);
            }
            try {
                arrayList3.add(new C1581220rFY(BottomTabAssemBase.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e108) {
                TryCatchGuardChecker.doCheck(e108);
            }
            try {
                arrayList3.add(new C1581220rFY(DialogAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e109) {
                TryCatchGuardChecker.doCheck(e109);
            }
            try {
                arrayList3.add(new C1581220rFY(PlayerEventPanelComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e110) {
                TryCatchGuardChecker.doCheck(e110);
            }
            try {
                arrayList3.add(new C1581220rFY(DiggPanelComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e111) {
                TryCatchGuardChecker.doCheck(e111);
            }
            try {
                arrayList3.add(new C1581220rFY(MFToolBarAssem.class, new C1565210qpj() { // from class: X.0qng
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return !C285090BFj.LIZJ();
                    }
                }));
            } catch (NoClassDefFoundError e112) {
                TryCatchGuardChecker.doCheck(e112);
            }
            try {
                arrayList3.add(new C1581220rFY(IncentiveForYouFeedLynxCardComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e113) {
                TryCatchGuardChecker.doCheck(e113);
            }
            try {
                arrayList3.add(new C1581220rFY(SystemComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e114) {
                TryCatchGuardChecker.doCheck(e114);
            }
            try {
                arrayList3.add(new C1581220rFY(SocialActivityAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e115) {
                TryCatchGuardChecker.doCheck(e115);
            }
            try {
                arrayList3.add(new C1581220rFY(NewUserOptAssem.class, new C1565210qpj() { // from class: X.0qnb
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return !ColdBootDegradeAssem.LIZJ() || C1514430pVp.LIZLLL().booleanValue();
                    }
                }));
            } catch (NoClassDefFoundError e116) {
                TryCatchGuardChecker.doCheck(e116);
            }
            try {
                arrayList3.add(new C1581220rFY(LiveMainFragmentAssem.class, new C1565210qpj() { // from class: X.0qps
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return true;
                    }
                }));
            } catch (NoClassDefFoundError e117) {
                TryCatchGuardChecker.doCheck(e117);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedLiveScrollConfigComponent.class, new C1565200qpi() { // from class: X.0Tc9
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C0OHO.LIZ().enable;
                    }
                }));
            } catch (NoClassDefFoundError e118) {
                TryCatchGuardChecker.doCheck(e118);
            }
            try {
                arrayList3.add(new C1581220rFY(ReachBottomCacheComponent.class, new C1565200qpi() { // from class: X.0qpU
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C0NHD.LIZIZ();
                    }
                }));
            } catch (NoClassDefFoundError e119) {
                TryCatchGuardChecker.doCheck(e119);
            }
            try {
                arrayList3.add(new C1581220rFY(RecommendFeedComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e120) {
                TryCatchGuardChecker.doCheck(e120);
            }
            try {
                arrayList3.add(new C1581220rFY(PerformanceOptAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e121) {
                TryCatchGuardChecker.doCheck(e121);
            }
            try {
                arrayList3.add(new C1581220rFY(AccountMainActivityAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e122) {
                TryCatchGuardChecker.doCheck(e122);
            }
            try {
                arrayList3.add(new C1581220rFY(HomeViewPagerAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e123) {
                TryCatchGuardChecker.doCheck(e123);
            }
            try {
                arrayList3.add(new C1581220rFY(FeedLiveCardDeleteGapComponent.class, new C1565200qpi() { // from class: X.0qpI
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C1564330qoJ.LIZIZ().enable;
                    }
                }));
            } catch (NoClassDefFoundError e124) {
                TryCatchGuardChecker.doCheck(e124);
            }
            try {
                arrayList3.add(new C1581220rFY(LiveMainActivityAssem.class, new C1565210qpj() { // from class: X.0qpq
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return false;
                    }
                }));
            } catch (NoClassDefFoundError e125) {
                TryCatchGuardChecker.doCheck(e125);
            }
            try {
                arrayList3.add(new C1581220rFY(QuickMentionLogicComponent.class, new C1565200qpi() { // from class: X.0qpZ
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C2279851ELn.LIZIZ();
                    }
                }));
            } catch (NoClassDefFoundError e126) {
                TryCatchGuardChecker.doCheck(e126);
            }
            try {
                arrayList3.add(new C1581220rFY(SubsServiceMainActivityAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e127) {
                TryCatchGuardChecker.doCheck(e127);
            }
            try {
                arrayList3.add(new C1581220rFY(SearchLaunchAssem.class, new C1565210qpj() { // from class: X.0qpa
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return !C1157804fw.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e128) {
                TryCatchGuardChecker.doCheck(e128);
            }
            try {
                arrayList3.add(new C1581220rFY(GamePartnershipComponent.class, new C1565200qpi() { // from class: X.0qpH
                    @Override // X.C1565200qpi
                    public final boolean experiment() {
                        return C0BT9.LIZ();
                    }
                }));
            } catch (NoClassDefFoundError e129) {
                TryCatchGuardChecker.doCheck(e129);
            }
            try {
                arrayList3.add(new C1581220rFY(FriendsMainPageFragmentAssem.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e130) {
                TryCatchGuardChecker.doCheck(e130);
            }
            try {
                arrayList3.add(new C1581220rFY(MutantCardComponent.class, new C1565200qpi()));
            } catch (NoClassDefFoundError e131) {
                TryCatchGuardChecker.doCheck(e131);
            }
            arrayList.add(new C2238901Ck4(C724920Sc6.class, AbstractC738140SxQ.class, arrayList3));
            ArrayList arrayList4 = new ArrayList();
            try {
                arrayList4.add(new C1581220rFY(MainPageFragmentApplyCreateAssemPreload.class, new C1565210qpj() { // from class: X.0C34
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return ((Boolean) C282460B5g.LIZ.getValue()).booleanValue();
                    }
                }));
            } catch (NoClassDefFoundError e132) {
                TryCatchGuardChecker.doCheck(e132);
            }
            try {
                arrayList4.add(new C1581220rFY(MainActivityApplyAssemPreload.class, new C1565210qpj() { // from class: X.0C34
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return ((Boolean) C282460B5g.LIZ.getValue()).booleanValue();
                    }
                }));
            } catch (NoClassDefFoundError e133) {
                TryCatchGuardChecker.doCheck(e133);
            }
            try {
                arrayList4.add(new C1581220rFY(ShopDotAssemPreloader.class, new C1565210qpj()));
            } catch (NoClassDefFoundError e134) {
                TryCatchGuardChecker.doCheck(e134);
            }
            try {
                arrayList4.add(new C1581220rFY(MainPageFragmentApplyViewCreatedAssemPreload.class, new C1565210qpj() { // from class: X.0C34
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return ((Boolean) C282460B5g.LIZ.getValue()).booleanValue();
                    }
                }));
            } catch (NoClassDefFoundError e135) {
                TryCatchGuardChecker.doCheck(e135);
            }
            try {
                arrayList4.add(new C1581220rFY(MainActivityApplyUIAssemPreload.class, new C1565210qpj() { // from class: X.0C34
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return ((Boolean) C282460B5g.LIZ.getValue()).booleanValue();
                    }
                }));
            } catch (NoClassDefFoundError e136) {
                TryCatchGuardChecker.doCheck(e136);
            }
            try {
                arrayList4.add(new C1581220rFY(MainFragmentApplyAssemPreload.class, new C1565210qpj() { // from class: X.0C34
                    @Override // X.C1565210qpj
                    public final boolean experiment() {
                        return ((Boolean) C282460B5g.LIZ.getValue()).booleanValue();
                    }
                }));
            } catch (NoClassDefFoundError e137) {
                TryCatchGuardChecker.doCheck(e137);
            }
            c2238901Ck4 = new C2238901Ck4(C725540Sd6.class, InterfaceC725550Sd7.class, arrayList4);
        } else {
            if (iHashCode != 1053095168) {
                return null;
            }
            arrayList = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            try {
                arrayList5.add(new C1581220rFY(FlexibleSparkPreloadTask.class, new C1565320qpu() { // from class: X.0qpt
                }));
            } catch (NoClassDefFoundError e138) {
                TryCatchGuardChecker.doCheck(e138);
            }
            c2238901Ck4 = new C2238901Ck4(C718620SGu.class, AbstractC718630SGv.class, arrayList5);
        }
        arrayList.add(c2238901Ck4);
        return arrayList;
    }

    public static List<C1576580r84<?>> LIZ(String str) {
        if (str.hashCode() != 683138905) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new MainActivityLaunchScene());
            return arrayList;
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            return arrayList;
        }
    }
}
