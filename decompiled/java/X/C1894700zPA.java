package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.ActivityTask;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.ChristmasShareInfo;
import com.bytedance.touchpoint.api.model.CoinBottomTab;
import com.bytedance.touchpoint.api.model.CommonFeedButton;
import com.bytedance.touchpoint.api.model.DramaBottomButton;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.api.model.FeedBottomButton;
import com.bytedance.touchpoint.api.model.FeedIncentiveToast;
import com.bytedance.touchpoint.api.model.FeedToast;
import com.bytedance.touchpoint.api.model.FeedTopTab;
import com.bytedance.touchpoint.api.model.InAppPush;
import com.bytedance.touchpoint.api.model.IncentiveCommon;
import com.bytedance.touchpoint.api.model.IncentivePreload;
import com.bytedance.touchpoint.api.model.IncentiveShareCard;
import com.bytedance.touchpoint.api.model.IncentiveShareTextLink;
import com.bytedance.touchpoint.api.model.IncentiveShortcut;
import com.bytedance.touchpoint.api.model.IncentiveSideBar;
import com.bytedance.touchpoint.api.model.LynxFeedBannerPicture;
import com.bytedance.touchpoint.api.model.NormalPendant;
import com.bytedance.touchpoint.api.model.OnboardingLink;
import com.bytedance.touchpoint.api.model.ProfileActivityIcon;
import com.bytedance.touchpoint.api.model.ProfileCenterArea;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.SearchCoinTaskResponse;
import com.bytedance.touchpoint.api.model.SharePanelInfo;
import com.bytedance.touchpoint.api.model.SunshinePendant;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.AdFeedTimerPendantViewModel;
import com.bytedance.touchpoint.data.parser.notify.AdLynxDialogVM;
import com.bytedance.touchpoint.data.parser.notify.AdNewStarTimerPendantViewModel;
import com.bytedance.touchpoint.data.parser.notify.AdTaskEventTimerPendantViewModel;
import com.bytedance.touchpoint.data.parser.notify.AdTimerPendantViewModel;
import com.bytedance.touchpoint.data.parser.notify.BottomTabBubbleViewModel;
import com.bytedance.touchpoint.data.parser.notify.ChristmasShareInfoViewModel;
import com.bytedance.touchpoint.data.parser.notify.CoinBottomTabViewModel;
import com.bytedance.touchpoint.data.parser.notify.DetailTaskEventPendantViewModel;
import com.bytedance.touchpoint.data.parser.notify.DraftBoxDialogViewModel;
import com.bytedance.touchpoint.data.parser.notify.FeedTimerPendantViewModel;
import com.bytedance.touchpoint.data.parser.notify.FeedToastViewModel;
import com.bytedance.touchpoint.data.parser.notify.FeedTopTabViewModel;
import com.bytedance.touchpoint.data.parser.notify.FeedTopToastViewModel;
import com.bytedance.touchpoint.data.parser.notify.InAppPushViewModel;
import com.bytedance.touchpoint.data.parser.notify.IncentivePreloadViewModel;
import com.bytedance.touchpoint.data.parser.notify.IncentiveShortcutViewModel;
import com.bytedance.touchpoint.data.parser.notify.LiteFeedTimerPendantViewModel;
import com.bytedance.touchpoint.data.parser.notify.OnboardingLinkViewModel;
import com.bytedance.touchpoint.data.parser.notify.PendantViewModel;
import com.bytedance.touchpoint.data.parser.notify.PopupViewModel;
import com.bytedance.touchpoint.data.parser.notify.PostDialogViewModel;
import com.bytedance.touchpoint.data.parser.notify.ProfileCenterAreaViewModel;
import com.bytedance.touchpoint.data.parser.notify.ProfileIconViewModel;
import com.bytedance.touchpoint.data.parser.notify.SearchCoinPeriodicViewModel;
import com.bytedance.touchpoint.data.parser.notify.SearchMultiCoinViewModel;
import com.bytedance.touchpoint.data.parser.notify.SharePanelInfoViewModel;
import com.bytedance.touchpoint.data.parser.notify.ShortDramaViewModel;
import com.bytedance.touchpoint.data.parser.notify.SunshinePendantViewModel;
import com.bytedance.touchpoint.data.parser.notify.TTInviteCodeViewModel;
import com.bytedance.touchpoint.data.parser.notify.TasksViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zPA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894700zPA {
    public static final C01GW<C1894700zPA> LJIJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1894740zPE());
    public List<TouchPoint> LIZ;
    public List<TaskEvent> LIZIZ;
    public List<TouchPoint> LJI;
    public C1894690zP9 LJII;
    public final ArrayList<InterfaceC1893620zNQ> LJIIZILJ;
    public final HashMap<Integer, TouchPoint> LIZJ = new HashMap<>();
    public final List<TouchPoint> LIZLLL = new ArrayList();
    public final List<TouchPoint> LJ = new ArrayList();
    public final List<TouchPoint> LJFF = new ArrayList();
    public final HashMap<Integer, C1893670zNV> LJIIIIZZ = new HashMap<>();
    public final HashMap<Integer, List<C1893670zNV>> LJIIIZ = new HashMap<>();
    public final Set<String> LJIIJ = new LinkedHashSet();
    public final Set<Integer> LJIIJJI = new LinkedHashSet();
    public final C01GW LJIIL = C452501pT.LIZIZ(new C1894750zPF());
    public final ArrayList<InterfaceC1894420zOi> LJIILIIL = C1697810uHb.LJ(new InterfaceC1894420zOi() { // from class: X.0zP8
        @Override // X.InterfaceC1894420zOi
        public final void LIZ(HashMap<Integer, TouchPoint> map, List<TouchPoint> list, boolean z) {
            String str;
            String str2;
            String str3;
            String str4;
            try {
                TouchPoint touchPoint = map.get(1);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = null;
                if (touchPoint != null) {
                    String str5 = touchPoint.data;
                    if (str5.length() > 0) {
                        Object objLIZ = C20484080s.LIZ(str5, NormalPendant.class);
                        NormalPendant normalPendant = (NormalPendant) objLIZ;
                        if (normalPendant != null) {
                            normalPendant.LIZ = touchPoint.touchPointId;
                            normalPendant.LIZIZ = touchPoint.touchPointName;
                            int i = touchPoint.launchPlanId;
                            if (i == null) {
                                i = -1;
                            }
                            normalPendant.LIZJ = i;
                            String str6 = touchPoint.abVersions;
                            if (str6 == null) {
                                str6 = "";
                            }
                            normalPendant.LIZLLL = str6;
                            normalPendant.LJ = touchPoint.customEventParams;
                            normalPendant.LJI = touchPoint.product;
                        }
                        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
                        c1894700zPALIZ.LJIIIIZZ.put(Integer.valueOf(touchPoint.touchPointId), (C1893670zNV) objLIZ);
                        NormalPendant normalPendant2 = (NormalPendant) objLIZ;
                        if (normalPendant2 == null || (str = normalPendant2.pendantPic) == null || str.length() == 0 || normalPendant2 == null || (str2 = normalPendant2.pendantShrinkPic) == null || str2.length() == 0 || normalPendant2 == null || (str3 = normalPendant2.normalJumpLink) == null || str3.length() == 0 || normalPendant2 == null || (str4 = normalPendant2.activityId) == null || str4.length() == 0) {
                            C1893680zNW.LJIIJ(C1893680zNW.LIZ, normalPendant2);
                        }
                        if (objLIZ != null) {
                            C1894690zP9 c1894690zP9 = new C1894690zP9((NormalPendant) objLIZ);
                            C01GW<C1894700zPA> c01gw2 = C1894700zPA.LJIJ;
                            C2178808gE.LIZ().LJII = c1894690zP9;
                            LifecycleOwner lifecycleOwner = C0J3E.LL;
                            C19719912Dl c19719912DlLIZ = C13LE.LIZ(PendantViewModel.class);
                            AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(338);
                            C452070Ho5 c452070Ho5 = new C452070Ho5();
                            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
                            if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
                                hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
                            }
                            ((PendantViewModel) new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS271S0000000_28, null, null, null).getValue()).wQ2();
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }, new AbstractC1894410zOh<ProfileActivityIcon>() { // from class: X.0zP2
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 3;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(ProfileIconViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(351), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<ProfileActivityIcon> LIZIZ() {
            return ProfileActivityIcon.class;
        }
    }, new AbstractC1894390zOf<InAppPush>() { // from class: X.0zP6
        @Override // X.AbstractC1894390zOf
        public final int LJ() {
            return 6;
        }

        @Override // X.AbstractC1894390zOf
        public final boolean LJII() {
            return true;
        }

        @Override // X.AbstractC1894390zOf
        public final BaseTouchPointDataVM LJFF() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(InAppPushViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(359), null, null, null).getValue();
        }

        @Override // X.AbstractC1894390zOf
        public final Class<InAppPush[]> LIZLLL() {
            return InAppPush[].class;
        }
    }, new AbstractC1894390zOf<Bubble>() { // from class: X.0zOg
        @Override // X.AbstractC1894390zOf
        public final int LJ() {
            return 7;
        }

        @Override // X.AbstractC1894390zOf
        public final BaseTouchPointDataVM LJFF() {
            return null;
        }

        @Override // X.AbstractC1894390zOf
        public final Class<Bubble[]> LIZLLL() {
            return Bubble[].class;
        }
    }, new AbstractC1894390zOf<ActivityTask>() { // from class: X.0zP1
        @Override // X.AbstractC1894390zOf
        public final int LJ() {
            return 11;
        }

        @Override // X.AbstractC1894390zOf
        public final List LJI(List list) {
            return list;
        }

        @Override // X.AbstractC1894390zOf
        public final BaseTouchPointDataVM LJFF() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(TasksViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(353), null, null, null).getValue();
        }

        @Override // X.AbstractC1894390zOf
        public final Class<ActivityTask[]> LIZLLL() {
            return ActivityTask[].class;
        }
    }, new InterfaceC1894420zOi() { // from class: X.0zOd
        public final List<Integer> LIZ = C1697810uHb.LJIIJJI(8, 28);

        @Override // X.InterfaceC1894420zOi
        public final void LIZ(HashMap<Integer, TouchPoint> map, List<TouchPoint> list, boolean z) {
            List<LynxFeedBannerPicture> listLIZLLL;
            try {
                List<Integer> list2 = this.LIZ;
                ArrayList<TouchPoint> arrayList = new ArrayList();
                Iterator<Integer> it2 = list2.iterator();
                while (it2.hasNext()) {
                    TouchPoint touchPoint = map.get(Integer.valueOf(it2.next().intValue()));
                    if (touchPoint != null) {
                        arrayList.add(touchPoint);
                    }
                }
                for (TouchPoint touchPoint2 : arrayList) {
                    ReferralFeedBanner referralFeedBanner = (ReferralFeedBanner) C20484080s.LIZ(touchPoint2.data, ReferralFeedBanner.class);
                    if (referralFeedBanner != null) {
                        referralFeedBanner.LIZ = touchPoint2.touchPointId;
                        referralFeedBanner.LIZIZ = touchPoint2.touchPointName;
                        int i = touchPoint2.launchPlanId;
                        if (i == null) {
                            i = -1;
                        }
                        referralFeedBanner.LIZJ = i;
                        referralFeedBanner.LJ = touchPoint2.customEventParams;
                        String str = touchPoint2.abVersions;
                        if (str == null) {
                            str = "";
                        }
                        referralFeedBanner.LIZLLL = str;
                        List<? extends Map<String, Object>> list3 = referralFeedBanner.lynxFeedBannerPicture;
                        if (list3 != null && !list3.isEmpty()) {
                            try {
                                listLIZLLL = C20484080s.LIZLLL(LynxFeedBannerPicture[].class, C20484080s.LIZIZ().LJIILL(referralFeedBanner.lynxFeedBannerPicture));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                listLIZLLL = null;
                            }
                            referralFeedBanner.LJII = listLIZLLL;
                        }
                    }
                    List<? extends Map<String, Object>> list4 = referralFeedBanner.lynxFeedBannerPicture;
                    if (list4 != null) {
                        for (Map<String, Object> map2 : list4) {
                            Map<String, String> map3 = referralFeedBanner.LJ;
                            String str2 = referralFeedBanner.notificationId;
                            String str3 = referralFeedBanner.notificationName;
                            if (map3 != null) {
                                map2.put("event_params", map3);
                            }
                            map2.put("notification_id", str2);
                            if (str3 != null) {
                                String str4 = referralFeedBanner.notificationName;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                map2.put("notification_name", str4);
                            }
                        }
                    }
                    ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                    if (iTouchPointModuleService != null) {
                        iTouchPointModuleService.LJIL(referralFeedBanner);
                    }
                    C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                    C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
                    c1894700zPALIZ.LJIIIIZZ.put(Integer.valueOf(touchPoint2.touchPointId), referralFeedBanner);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }, new AbstractC1894410zOh<DynamicDialog>() { // from class: X.0zPa
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 4;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(PopupViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(334), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<DynamicDialog> LIZIZ() {
            return DynamicDialog.class;
        }
    }, new AbstractC1894410zOh<IncentiveCommon>() { // from class: X.0zPO
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 23;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(TTInviteCodeViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(360), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<IncentiveCommon> LIZIZ() {
            return IncentiveCommon.class;
        }
    }, new AbstractC1894410zOh<CoinBottomTab>() { // from class: X.0zP7
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 29;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(CoinBottomTabViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(347), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<CoinBottomTab> LIZIZ() {
            return CoinBottomTab.class;
        }
    }, new AbstractC1894410zOh<IncentivePreload>() { // from class: X.0zPZ
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 31;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(IncentivePreloadViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(361), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<IncentivePreload> LIZIZ() {
            return IncentivePreload.class;
        }
    }, new AbstractC1894410zOh<TimerPendant>() { // from class: X.0zPN
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 32;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(AdTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(337), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<TimerPendant> LIZIZ() {
            return TimerPendant.class;
        }
    }, new AbstractC1894410zOh<SharePanelInfo>() { // from class: X.0zPI
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 33;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(SharePanelInfoViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(345), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<SharePanelInfo> LIZIZ() {
            return SharePanelInfo.class;
        }
    }, new AbstractC1894410zOh<FeedIncentiveToast>() { // from class: X.0zPU
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 35;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(FeedTopToastViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(358), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<FeedIncentiveToast> LIZIZ() {
            return FeedIncentiveToast.class;
        }
    }, new AbstractC1894410zOh<BottomTabBubble>() { // from class: X.0zPW
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 36;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(BottomTabBubbleViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(343), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<BottomTabBubble> LIZIZ() {
            return BottomTabBubble.class;
        }
    }, new AbstractC1894410zOh<IncentiveShareCard>() { // from class: X.0zP3
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 37;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            return null;
        }

        @Override // X.AbstractC1894410zOh
        public final Class<IncentiveShareCard> LIZIZ() {
            return IncentiveShareCard.class;
        }
    }, new AbstractC1894410zOh<FeedBottomButton>() { // from class: X.0zPC
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 39;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            return null;
        }

        @Override // X.AbstractC1894410zOh
        public final Class<FeedBottomButton> LIZIZ() {
            return FeedBottomButton.class;
        }
    }, new AbstractC1894410zOh<IncentiveShareTextLink>() { // from class: X.0zP4
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 40;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            return null;
        }

        @Override // X.AbstractC1894410zOh
        public final Class<IncentiveShareTextLink> LIZIZ() {
            return IncentiveShareTextLink.class;
        }
    }, new AbstractC1894410zOh<FeedToast>() { // from class: X.0zPJ
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 38;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(FeedToastViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(356), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<FeedToast> LIZIZ() {
            return FeedToast.class;
        }
    }, new AbstractC1894410zOh<OnboardingLink>() { // from class: X.0zPK
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 45;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(OnboardingLinkViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(336), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<OnboardingLink> LIZIZ() {
            return OnboardingLink.class;
        }
    }, new AbstractC1894410zOh<TimerPendant>() { // from class: X.0zPT
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 51;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(FeedTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(355), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<TimerPendant> LIZIZ() {
            return TimerPendant.class;
        }
    }, new AbstractC1894410zOh<TimerPendant>() { // from class: X.0zPQ
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 54;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(AdNewStarTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(335), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<TimerPendant> LIZIZ() {
            return TimerPendant.class;
        }
    }, new AbstractC1894410zOh<FeedTopTab>() { // from class: X.0zPY
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 55;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(FeedTopTabViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(357), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<FeedTopTab> LIZIZ() {
            return FeedTopTab.class;
        }
    }, new AbstractC1894410zOh<TimerPendant>() { // from class: X.0zPR
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 57;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(AdTaskEventTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(339), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<TimerPendant> LIZIZ() {
            return TimerPendant.class;
        }
    }, new AbstractC1894410zOh<DynamicDialog>() { // from class: X.0zPc
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 58;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(PostDialogViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(340), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<DynamicDialog> LIZIZ() {
            return DynamicDialog.class;
        }
    }, new AbstractC1894390zOf<IncentiveShortcut>() { // from class: X.0zP5
        @Override // X.AbstractC1894390zOf
        public final int LJ() {
            return 61;
        }

        @Override // X.AbstractC1894390zOf
        public final BaseTouchPointDataVM LJFF() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(IncentiveShortcutViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(362), null, null, null).getValue();
        }

        @Override // X.AbstractC1894390zOf
        public final Class<IncentiveShortcut[]> LIZLLL() {
            return IncentiveShortcut[].class;
        }
    }, new AbstractC1894410zOh<DynamicDialog>() { // from class: X.0zPd
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 67;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(DraftBoxDialogViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(352), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<DynamicDialog> LIZIZ() {
            return DynamicDialog.class;
        }
    }, new AbstractC1894410zOh<ChristmasShareInfo>() { // from class: X.0zPX
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 72;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(ChristmasShareInfoViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(346), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<ChristmasShareInfo> LIZIZ() {
            return ChristmasShareInfo.class;
        }
    }, new AbstractC1894380zOe<TimerPendant>() { // from class: X.0zPG
        @Override // X.AbstractC1894380zOe
        public final int LIZJ() {
            return 76;
        }

        @Override // X.AbstractC1894380zOe
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(AdFeedTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(331), null, null, null).getValue();
        }

        @Override // X.AbstractC1894380zOe
        public final Class<TimerPendant> LIZIZ() {
            return TimerPendant.class;
        }
    }, new AbstractC1894410zOh<SunshinePendant>() { // from class: X.0zPe
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 80;
        }

        @Override // X.AbstractC1894410zOh
        public final boolean LJ() {
            return true;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(SunshinePendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(349), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<SunshinePendant> LIZIZ() {
            return SunshinePendant.class;
        }
    }, new AbstractC1894410zOh<SearchCoinTaskResponse>() { // from class: X.0zPL
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 82;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(SearchMultiCoinViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(342), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<SearchCoinTaskResponse> LIZIZ() {
            return SearchCoinTaskResponse.class;
        }
    }, new AbstractC1894410zOh<SearchCoinTaskResponse>() { // from class: X.0zPM
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 94;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(SearchCoinPeriodicViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(344), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<SearchCoinTaskResponse> LIZIZ() {
            return SearchCoinTaskResponse.class;
        }
    }, new AbstractC1894410zOh<TimerPendant>() { // from class: X.0zPS
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 83;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(ShortDramaViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(348), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<TimerPendant> LIZIZ() {
            return TimerPendant.class;
        }
    }, new AbstractC1894410zOh<DramaBottomButton>() { // from class: X.0zPB
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 84;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            return null;
        }

        @Override // X.AbstractC1894410zOh
        public final Class<DramaBottomButton> LIZIZ() {
            return DramaBottomButton.class;
        }
    }, new AbstractC1894380zOe<TimerPendant>() { // from class: X.0zPH
        @Override // X.AbstractC1894380zOe
        public final int LIZJ() {
            return 62;
        }

        @Override // X.AbstractC1894380zOe
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(DetailTaskEventPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(350), null, null, null).getValue();
        }

        @Override // X.AbstractC1894380zOe
        public final Class<TimerPendant> LIZIZ() {
            return TimerPendant.class;
        }
    }, new AbstractC1894410zOh<DynamicDialog>() { // from class: X.0zPb
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 86;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(AdLynxDialogVM.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(333), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<DynamicDialog> LIZIZ() {
            return DynamicDialog.class;
        }
    }, new AbstractC1894410zOh<TimerPendant>() { // from class: X.0zPP
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 77;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(LiteFeedTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(332), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<TimerPendant> LIZIZ() {
            return TimerPendant.class;
        }
    }, new AbstractC1894380zOe<CommonFeedButton>() { // from class: X.0zPD
        @Override // X.AbstractC1894380zOe
        public final int LIZJ() {
            return 95;
        }

        @Override // X.AbstractC1894380zOe
        public final BaseTouchPointDataVM LIZLLL() {
            return null;
        }

        @Override // X.AbstractC1894380zOe
        public final Class<CommonFeedButton> LIZIZ() {
            return CommonFeedButton.class;
        }
    }, new AbstractC1894410zOh<ProfileCenterArea>() { // from class: X.0zPV
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 107;
        }

        @Override // X.AbstractC1894410zOh
        public final boolean LJ() {
            return true;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(ProfileCenterAreaViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(341), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<ProfileCenterArea> LIZIZ() {
            return ProfileCenterArea.class;
        }
    });
    public final ArrayList<Integer> LJIILJJIL = C1697810uHb.LJ(6, 36);
    public final ArrayList<InterfaceC1894420zOi> LJIILL = C1697810uHb.LJ(new AbstractC1894390zOf<Bubble>() { // from class: X.0zOg
        @Override // X.AbstractC1894390zOf
        public final int LJ() {
            return 7;
        }

        @Override // X.AbstractC1894390zOf
        public final BaseTouchPointDataVM LJFF() {
            return null;
        }

        @Override // X.AbstractC1894390zOf
        public final Class<Bubble[]> LIZLLL() {
            return Bubble[].class;
        }
    }, new AbstractC1894410zOh<DynamicDialog>() { // from class: X.0zPb
        @Override // X.AbstractC1894410zOh
        public final int LIZJ() {
            return 86;
        }

        @Override // X.AbstractC1894410zOh
        public final BaseTouchPointDataVM LIZLLL() {
            LifecycleOwner lifecycleOwner = C0J3E.LL;
            return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(AdLynxDialogVM.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(333), null, null, null).getValue();
        }

        @Override // X.AbstractC1894410zOh
        public final Class<DynamicDialog> LIZIZ() {
            return DynamicDialog.class;
        }
    });
    public final ArrayList<Integer> LJIILLIIL = C1697810uHb.LJ(6, 35);

    public final void LIZ() {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LJII = null;
        this.LJI = null;
        this.LIZJ.clear();
        this.LJIIIIZZ.clear();
        this.LJIIIZ.clear();
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LJFF).clear();
        ((ArrayList) this.LJ).clear();
    }

    public C1894700zPA() {
        C1697810uHb.LJ(new AbstractC1894410zOh<DynamicDialog>() { // from class: X.0zPc
            @Override // X.AbstractC1894410zOh
            public final int LIZJ() {
                return 58;
            }

            @Override // X.AbstractC1894410zOh
            public final BaseTouchPointDataVM LIZLLL() {
                LifecycleOwner lifecycleOwner = C0J3E.LL;
                return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(PostDialogViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(340), null, null, null).getValue();
            }

            @Override // X.AbstractC1894410zOh
            public final Class<DynamicDialog> LIZIZ() {
                return DynamicDialog.class;
            }
        }, new AbstractC1894410zOh<DynamicDialog>() { // from class: X.0zPd
            @Override // X.AbstractC1894410zOh
            public final int LIZJ() {
                return 67;
            }

            @Override // X.AbstractC1894410zOh
            public final BaseTouchPointDataVM LIZLLL() {
                LifecycleOwner lifecycleOwner = C0J3E.LL;
                return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(DraftBoxDialogViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(352), null, null, null).getValue();
            }

            @Override // X.AbstractC1894410zOh
            public final Class<DynamicDialog> LIZIZ() {
                return DynamicDialog.class;
            }
        }, new InterfaceC1894420zOi() { // from class: X.0zP8
            @Override // X.InterfaceC1894420zOi
            public final void LIZ(HashMap<Integer, TouchPoint> map, List<TouchPoint> list, boolean z) {
                String str;
                String str2;
                String str3;
                String str4;
                try {
                    TouchPoint touchPoint = map.get(1);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = null;
                    if (touchPoint != null) {
                        String str5 = touchPoint.data;
                        if (str5.length() > 0) {
                            Object objLIZ = C20484080s.LIZ(str5, NormalPendant.class);
                            NormalPendant normalPendant = (NormalPendant) objLIZ;
                            if (normalPendant != null) {
                                normalPendant.LIZ = touchPoint.touchPointId;
                                normalPendant.LIZIZ = touchPoint.touchPointName;
                                int i = touchPoint.launchPlanId;
                                if (i == null) {
                                    i = -1;
                                }
                                normalPendant.LIZJ = i;
                                String str6 = touchPoint.abVersions;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                normalPendant.LIZLLL = str6;
                                normalPendant.LJ = touchPoint.customEventParams;
                                normalPendant.LJI = touchPoint.product;
                            }
                            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                            C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
                            c1894700zPALIZ.LJIIIIZZ.put(Integer.valueOf(touchPoint.touchPointId), (C1893670zNV) objLIZ);
                            NormalPendant normalPendant2 = (NormalPendant) objLIZ;
                            if (normalPendant2 == null || (str = normalPendant2.pendantPic) == null || str.length() == 0 || normalPendant2 == null || (str2 = normalPendant2.pendantShrinkPic) == null || str2.length() == 0 || normalPendant2 == null || (str3 = normalPendant2.normalJumpLink) == null || str3.length() == 0 || normalPendant2 == null || (str4 = normalPendant2.activityId) == null || str4.length() == 0) {
                                C1893680zNW.LJIIJ(C1893680zNW.LIZ, normalPendant2);
                            }
                            if (objLIZ != null) {
                                C1894690zP9 c1894690zP9 = new C1894690zP9((NormalPendant) objLIZ);
                                C01GW<C1894700zPA> c01gw2 = C1894700zPA.LJIJ;
                                C2178808gE.LIZ().LJII = c1894690zP9;
                                LifecycleOwner lifecycleOwner = C0J3E.LL;
                                C19719912Dl c19719912DlLIZ = C13LE.LIZ(PendantViewModel.class);
                                AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(338);
                                C452070Ho5 c452070Ho5 = new C452070Ho5();
                                C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
                                if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
                                    hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
                                }
                                ((PendantViewModel) new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS271S0000000_28, null, null, null).getValue()).wQ2();
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }, new AbstractC1894410zOh<TimerPendant>() { // from class: X.0zPT
            @Override // X.AbstractC1894410zOh
            public final int LIZJ() {
                return 51;
            }

            @Override // X.AbstractC1894410zOh
            public final BaseTouchPointDataVM LIZLLL() {
                LifecycleOwner lifecycleOwner = C0J3E.LL;
                return (BaseTouchPointDataVM) new C736950SvV(C13LE.LIZ(FeedTimerPendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(355), null, null, null).getValue();
            }

            @Override // X.AbstractC1894410zOh
            public final Class<TimerPendant> LIZIZ() {
                return TimerPendant.class;
            }
        });
        this.LJIIZILJ = new ArrayList<>();
    }

    public final Integer LIZIZ(int i) {
        TouchPoint touchPoint = this.LIZJ.get(Integer.valueOf(i));
        if (touchPoint != null) {
            return touchPoint.launchPlanId;
        }
        return null;
    }

    public final TaskEvent LIZLLL(String str) {
        boolean z;
        List<TaskEvent> list;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (list = this.LIZIZ) != null) {
            for (TaskEvent taskEvent : list) {
                if (Intrinsics.LJFF(taskEvent.taskEventKey, str)) {
                    return taskEvent;
                }
            }
        }
        return null;
    }

    public final <T extends C1893670zNV> T LJ(int i) {
        C1893670zNV c1893670zNV = this.LJIIIIZZ.get(Integer.valueOf(i));
        if (c1893670zNV instanceof C1893670zNV) {
            return (T) c1893670zNV;
        }
        return null;
    }

    public final <T extends C1893670zNV> List<T> LJFF(int i) {
        Collection collection = this.LJIIIZ.get(Integer.valueOf(i));
        if (collection instanceof List) {
            return (List) collection;
        }
        return null;
    }

    public final C1893670zNV LJII(TouchPoint touchPoint) {
        C1893670zNV c1893670zNV;
        try {
            int i = touchPoint.touchPointId;
            if (i != 6) {
                if (i != 7) {
                    if (i != 35) {
                        if (i != 36) {
                            if (i != 38) {
                                if (i != 44) {
                                    if (i != 93) {
                                        return null;
                                    }
                                    c1893670zNV = (C1893670zNV) C20484080s.LIZ(touchPoint.data, IncentiveSideBar.class);
                                } else {
                                    List listLIZLLL = C20484080s.LIZLLL(Bubble[].class, touchPoint.data);
                                    this.LIZJ.put(Integer.valueOf(touchPoint.touchPointId), touchPoint);
                                    c1893670zNV = (C1893670zNV) listLIZLLL.get(0);
                                }
                            } else {
                                c1893670zNV = (C1893670zNV) C20484080s.LIZ(touchPoint.data, FeedToast.class);
                            }
                        } else {
                            c1893670zNV = (C1893670zNV) C20484080s.LIZ(touchPoint.data, BottomTabBubble.class);
                        }
                    } else {
                        c1893670zNV = (C1893670zNV) C20484080s.LIZ(touchPoint.data, FeedIncentiveToast.class);
                    }
                } else {
                    c1893670zNV = (C1893670zNV) C20484080s.LIZLLL(Bubble[].class, touchPoint.data).get(0);
                }
            } else {
                c1893670zNV = ((InAppPush[]) C20484080s.LIZ(touchPoint.data, InAppPush[].class))[0];
            }
            if (c1893670zNV != null) {
                c1893670zNV.LIZ = touchPoint.touchPointId;
                String str = touchPoint.touchPointName;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                c1893670zNV.LIZIZ = str;
                int i2 = touchPoint.launchPlanId;
                if (i2 == null) {
                    i2 = -1;
                }
                c1893670zNV.LIZJ = i2;
                String str3 = touchPoint.abVersions;
                if (str3 == null) {
                    str3 = "";
                }
                c1893670zNV.LIZLLL = str3;
                c1893670zNV.LJ = touchPoint.customEventParams;
                c1893670zNV.LJI = touchPoint.product;
                String str4 = touchPoint.data;
                if (str4 != null) {
                    str2 = str4;
                }
                c1893670zNV.LJFF = str2;
                return c1893670zNV;
            }
            return c1893670zNV;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJIIIIZZ(List<TouchPoint> list) {
        InterfaceC1894420zOi next;
        if (this.LJIIIZ.containsKey(7)) {
            ArrayList arrayList = new ArrayList();
            List<Bubble> listLJFF = LJFF(7);
            if (listLJFF != null) {
                for (Bubble bubble : listLJFF) {
                    Set<String> set = this.LJIIJ;
                    bubble.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(bubble.bubbleType);
                    sbLIZ.append('_');
                    String str = bubble.taskKey;
                    if (str == null) {
                        str = "";
                    }
                    sbLIZ.append(str);
                    if (!set.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                        arrayList.add(bubble);
                    }
                }
            }
            this.LJIIIZ.put(7, arrayList);
        }
        this.LJIIJ.clear();
        HashMap<Integer, TouchPoint> map = new HashMap<>();
        boolean z = false;
        for (TouchPoint touchPoint : list) {
            int i = touchPoint.touchPointId;
            if (i == 4) {
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    iTouchPointModuleService.LJIIJJI(touchPoint);
                }
            } else if (i == 78) {
                this.LIZJ.put(Integer.valueOf(i), touchPoint);
                ITouchPointModuleService iTouchPointModuleService2 = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService2 != null) {
                    iTouchPointModuleService2.LJIIL(touchPoint);
                }
            }
            map.put(Integer.valueOf(touchPoint.touchPointId), touchPoint);
            C1894320zOY.LIZ.getClass();
            C1894320zOY.LJIJI(touchPoint);
            if (touchPoint.touchPointId == 6) {
                if (!z) {
                    LJIIIZ(touchPoint);
                    z = true;
                }
            } else {
                LJIIIZ(touchPoint);
            }
        }
        for (InterfaceC1894420zOi interfaceC1894420zOi : this.LJIILL) {
            if (!(interfaceC1894420zOi instanceof C1894400zOg)) {
                interfaceC1894420zOi.LIZ(map, C13BV.INSTANCE, false);
            }
        }
        Iterator<InterfaceC1894420zOi> it2 = this.LJIILL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1894400zOg) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1894420zOi interfaceC1894420zOi2 = next;
        if (interfaceC1894420zOi2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (TouchPoint touchPoint2 : list) {
                if (touchPoint2.touchPointId == 7) {
                    arrayList2.add(touchPoint2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                for (Bubble bubble2 : C20484080s.LIZLLL(Bubble[].class, ((TouchPoint) it3.next()).data)) {
                    Set<String> set2 = this.LJIIJ;
                    bubble2.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(bubble2.bubbleType);
                    sbLIZ2.append('_');
                    String str2 = bubble2.taskKey;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sbLIZ2.append(str2);
                    set2.add(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            interfaceC1894420zOi2.LIZ(new HashMap<>(), arrayList2, true);
        }
        for (Map.Entry<Integer, TouchPoint> entry : map.entrySet()) {
            if (entry.getValue() != null && entry.getKey().intValue() != 7 && entry.getKey().intValue() != 78) {
                this.LIZJ.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void LJIIIZ(TouchPoint touchPoint) {
        ITouchPointModuleService iTouchPointModuleService;
        if (!C13LP.LJJJJ(Integer.valueOf(touchPoint.touchPointId), this.LJIILLIIL)) {
            return;
        }
        C1893670zNV c1893670zNVLJII = LJII(touchPoint);
        if (c1893670zNVLJII instanceof InAppPush) {
            ITouchPointModuleService iTouchPointModuleService2 = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
            if (iTouchPointModuleService2 != null) {
                iTouchPointModuleService2.LJJI((InAppPush) c1893670zNVLJII);
                return;
            }
            return;
        }
        if (!(c1893670zNVLJII instanceof FeedIncentiveToast) || (iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iTouchPointModuleService.LJII((FeedIncentiveToast) c1893670zNVLJII);
    }

    public final TouchPoint LIZJ(int i, Integer num) {
        Integer num2;
        Integer num3;
        Integer num4;
        TouchPoint touchPoint = null;
        if (i != 5) {
            if (i != 6) {
                if (i != 7) {
                    if (i != 76) {
                        if (i != 95) {
                            return this.LIZJ.get(Integer.valueOf(i));
                        }
                        List<TouchPoint> list = this.LIZ;
                        if (list == null) {
                            return null;
                        }
                        Iterator<TouchPoint> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            TouchPoint next = it2.next();
                            TouchPoint touchPoint2 = next;
                            if (Intrinsics.LJFF(touchPoint2.launchPlanId, num) && touchPoint2.touchPointId == 95) {
                                touchPoint = next;
                                break;
                            }
                        }
                        return touchPoint;
                    }
                    List<TouchPoint> list2 = this.LIZ;
                    if (list2 == null) {
                        return null;
                    }
                    Iterator<TouchPoint> it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        TouchPoint next2 = it3.next();
                        TouchPoint touchPoint3 = next2;
                        if (Intrinsics.LJFF(touchPoint3.launchPlanId, num) && touchPoint3.touchPointId == 76) {
                            touchPoint = next2;
                            break;
                        }
                    }
                    return touchPoint;
                }
                Iterator<TouchPoint> it4 = this.LJ.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    TouchPoint next3 = it4.next();
                    TouchPoint touchPoint4 = next3;
                    if (touchPoint4 != null) {
                        num4 = touchPoint4.launchPlanId;
                    } else {
                        num4 = null;
                    }
                    if (Intrinsics.LJFF(num4, num)) {
                        touchPoint = next3;
                        break;
                    }
                }
                return touchPoint;
            }
            Iterator<TouchPoint> it5 = this.LJFF.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                TouchPoint next4 = it5.next();
                TouchPoint touchPoint5 = next4;
                if (touchPoint5 != null) {
                    num3 = touchPoint5.launchPlanId;
                } else {
                    num3 = null;
                }
                if (Intrinsics.LJFF(num3, num)) {
                    touchPoint = next4;
                    break;
                }
            }
            return touchPoint;
        }
        Iterator<TouchPoint> it6 = this.LIZLLL.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            TouchPoint next5 = it6.next();
            TouchPoint touchPoint6 = next5;
            if (touchPoint6 != null) {
                num2 = touchPoint6.launchPlanId;
            } else {
                num2 = null;
            }
            if (Intrinsics.LJFF(num2, num)) {
                touchPoint = next5;
                break;
            }
        }
        return touchPoint;
    }

    public final <T extends C1893670zNV> T LJI(int i, int i2) {
        List<C1893670zNV> list;
        Integer num;
        List<C1893670zNV> list2 = this.LJIIIZ.get(Integer.valueOf(i));
        if ((list2 instanceof List) && (list = list2) != null) {
            Iterator<C1893670zNV> it2 = list.iterator();
            while (it2.hasNext()) {
                T t = (T) it2.next();
                if (t != null && (num = t.LIZJ) != null && num.intValue() == i2) {
                    return t;
                }
            }
        }
        return null;
    }
}
