package Y;

import X.AbstractC19484711Kz;
import X.AbstractC471420IeC;
import X.AbstractC471430IeD;
import X.AbstractC476820Imu;
import X.AbstractC484810Izn;
import X.AbstractC495740JcK;
import X.AbstractC495790JcP;
import X.C01GW;
import X.C09JN;
import X.C0IJT;
import X.C0IKU;
import X.C0IXW;
import X.C0J01;
import X.C0J02;
import X.C0J0X;
import X.C0J1R;
import X.C0J75;
import X.C0J76;
import X.C0J77;
import X.C0J7B;
import X.C0J7C;
import X.C0K0R;
import X.C0K51;
import X.C0K61;
import X.C0K7G;
import X.C0K9P;
import X.C0KBJ;
import X.C0KC5;
import X.C0KC9;
import X.C0KCC;
import X.C0KCI;
import X.C0KCJ;
import X.C0KCK;
import X.C0KCP;
import X.C0KDG;
import X.C0KDH;
import X.C0KDI;
import X.C0KDL;
import X.C0KDQ;
import X.C0KDT;
import X.C0KDZ;
import X.C0KLX;
import X.C0KQD;
import X.C0SUT;
import X.C0UX6;
import X.C1022820ciu;
import X.C1124290fMZ;
import X.C1143680frq;
import X.C1161920gLG;
import X.C11JL;
import X.C11S5;
import X.C1210880hcE;
import X.C1324720kZq;
import X.C1440005kM;
import X.C1494690ozz;
import X.C14KS;
import X.C14LC;
import X.C16FS;
import X.C176600m4;
import X.C19475311Hj;
import X.C1954807lC;
import X.C197039127h;
import X.C19719612Di;
import X.C1A6I;
import X.C1AC7;
import X.C1ACA;
import X.C20441214yg;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C309690CBz;
import X.C339550DSv;
import X.C418440Gaw;
import X.C426750GoL;
import X.C466640IRq;
import X.C470660Icy;
import X.C470770Id9;
import X.C470950IdR;
import X.C471410IeB;
import X.C474500IjA;
import X.C477520Io2;
import X.C478750Iq1;
import X.C478820Iq8;
import X.C479440Ir8;
import X.C479450Ir9;
import X.C479670IrV;
import X.C482000IvG;
import X.C482930Iwl;
import X.C483100Ix2;
import X.C483240IxG;
import X.C483250IxH;
import X.C484860Izs;
import X.C484870Izt;
import X.C484920Izy;
import X.C484930Izz;
import X.C495920Jcc;
import X.C496120Jcw;
import X.C496270JdB;
import X.C496470JdV;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501520Jle;
import X.C510460K0e;
import X.C510480K0g;
import X.C511520K4g;
import X.C511970K5z;
import X.C513450KBr;
import X.C513830KDd;
import X.C513840KDe;
import X.C513870KDh;
import X.C513910KDl;
import X.C516990KPh;
import X.C582610Mt9;
import X.C763970Txz;
import X.C766270U4b;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1083260eIO;
import X.EnumC1101430elh;
import X.EnumC470670Icz;
import X.EnumC470780IdA;
import X.EnumC475180IkG;
import X.EnumC477960Iok;
import X.EnumC484840Izq;
import X.EnumC510710K1d;
import X.InterfaceC2217461Bqa;
import X.InterfaceC471600IeU;
import X.InterfaceC475140IkC;
import X.InterfaceC475150IkD;
import X.InterfaceC483180IxA;
import X.InterfaceC781210Ukh;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLayoutChangeListenerC521670Kd3;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import avg.f;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell;
import com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuidePinCardWidget;
import com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.bytedance.android.livesdk.feed.drawerfeed.base.BaseDrawerFeedLiveFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.game.category.GameDrawerBottomFeedFragment;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveNewGiftDialog;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHangoutLiveCardTraceSuccessOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileCardRefreshSettings;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewFullScreenSurveyUIFix;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightColdStartOptSetting;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import com.bytedance.android.livesdk.profile.cell.NormalOperationCell;
import com.bytedance.android.livesdk.profile.ui.LiveProfileSheet;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyOption;
import com.bytedance.android.livesdk.survey.model.SurveyQuestion;
import com.bytedance.android.livesdk.survey.model.SurveySecondQuestion;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.android.pgcsdk.subscribe.model.PGCRefundInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCTipsInfo;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.checkalive.LiveCheckAliveWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.enterroom.LivePreviewEnterRoomBoostWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.ReportPreviewMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.SubscribeMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hangout.container.LiveHangoutFragmentV2;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.root.tab.nearby.LiveNearbyPageFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.api.model.PgcSubscribeUserInfoResponse;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackageMultiMonthFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackagePageDialog;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubUpdowngradePackageFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import com.ss.android.ugc.aweme.toptabv2.ui.LiveHangoutFragment;
import com.ss.android.ugc.aweme.video.SubOnlyVideoContentFragment;
import com.ss.android.ugc.feed.platform.panel.live.LiveBusinessComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import mf.a;
import qo2.w;
import webcast.api.feed.LiveTab;
import webcast.api.pgc_sub.PGCTemplateInfo;
import webcast.api.pgc_sub.PGCTemplateListData;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public class AObserverS211S0100000_7 implements Observer {
    public final int $t;
    public Object l0;

    public static final void onChanged$10(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((RoomStatusController) aObserverS211S0100000_7.l0).refreshAllRoomStatus((Map) obj);
    }

    public static final void onChanged$8(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((RoomStatusController) aObserverS211S0100000_7.l0).refreshRoomStats((Map) obj);
    }

    public static final void onChanged$9(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((RoomStatusController) aObserverS211S0100000_7.l0).refreshRoomRecommendStats((Map) obj);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
            case 38:
                onChanged$38(this, obj);
                break;
            case 39:
                onChanged$39(this, obj);
                break;
            case 40:
                onChanged$40(this, obj);
                break;
            case 41:
                onChanged$41(this, obj);
                break;
            case 42:
                onChanged$42(this, obj);
                break;
            case 43:
                onChanged$43(this, obj);
                break;
            case 44:
                onChanged$44(this, obj);
                break;
            case 45:
                onChanged$45(this, obj);
                break;
            case 46:
                onChanged$46(this, obj);
                break;
            case 47:
                onChanged$47(this, obj);
                break;
            case 48:
                onChanged$48(this, obj);
                break;
            case 49:
                onChanged$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onChanged$50(this, obj);
                break;
            case 51:
                onChanged$51(this, obj);
                break;
            case 52:
                onChanged$52(this, obj);
                break;
            case 53:
                onChanged$53(this, obj);
                break;
            case 54:
                onChanged$54(this, obj);
                break;
            case 55:
                onChanged$55(this, obj);
                break;
            case 56:
                onChanged$56(this, obj);
                break;
            case 57:
                onChanged$57(this, obj);
                break;
            case 58:
                onChanged$58(this, obj);
                break;
            case 59:
                onChanged$59(this, obj);
                break;
            case 60:
                onChanged$60(this, obj);
                break;
            case 61:
                onChanged$61(this, obj);
                break;
            case BaseNotice.CREATOR /* 62 */:
                onChanged$62(this, obj);
                break;
            case 63:
                onChanged$63(this, obj);
                break;
            case 64:
                onChanged$64(this, obj);
                break;
            case 65:
                onChanged$65(this, obj);
                break;
            case 66:
                onChanged$66(this, obj);
                break;
            case 67:
                onChanged$67(this, obj);
                break;
            case 68:
                onChanged$68(this, obj);
                break;
            case 69:
                onChanged$69(this, obj);
                break;
            case 70:
                onChanged$70(this, obj);
                break;
            case 71:
                onChanged$71(this, obj);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                onChanged$72(this, obj);
                break;
            case 73:
                onChanged$73(this, obj);
                break;
            case 74:
                onChanged$74(this, obj);
                break;
            case 75:
                onChanged$75(this, obj);
                break;
            case 76:
                onChanged$76(this, obj);
                break;
            case 77:
                onChanged$77(this, obj);
                break;
            case 78:
                onChanged$78(this, obj);
                break;
            case 79:
                onChanged$79(this, obj);
                break;
            case 80:
                onChanged$80(this, obj);
                break;
            case 81:
                onChanged$81(this, obj);
                break;
            case 82:
                onChanged$82(this, obj);
                break;
        }
    }

    public AObserverS211S0100000_7(AbstractC471430IeD abstractC471430IeD, int i) {
        this.$t = i;
        switch (i) {
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                this.l0 = abstractC471430IeD;
                break;
            default:
                this.l0 = abstractC471430IeD;
                break;
        }
    }

    public static final void onChanged$0(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        boolean z;
        CoHostOperationCell coHostOperationCell = (CoHostOperationCell) aObserverS211S0100000_7.l0;
        C16FS c16fs = coHostOperationCell.LLJJJJLIIL;
        if (c16fs != null && c16fs.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        coHostOperationCell.LJJII(z);
    }

    public static final void onChanged$1(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((FollowGuidePinCardWidget) aObserverS211S0100000_7.l0).W1();
    }

    public static final void onChanged$11(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C496270JdB<C496120Jcw> c496270JdB;
        User user;
        User user2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup.LayoutParams layoutParams;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String string;
        Throwable cause;
        SubscribeInfo subscribeInfo;
        String str7;
        int subscriberCount;
        C496270JdB<C496120Jcw> c496270JdB2 = (C496270JdB) obj;
        LiveProfileSheet liveProfileSheet = (LiveProfileSheet) aObserverS211S0100000_7.l0;
        liveProfileSheet.getClass();
        int i = c496270JdB2.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C500260Jjc.LJIILIIL(liveProfileSheet.LLLJIL);
                            C500260Jjc.LJIILIIL(liveProfileSheet.LLLFF);
                            C500260Jjc.LJIILIIL(liveProfileSheet.LLLIZZ);
                            C766270U4b.LIZLLL(2131857002);
                            liveProfileSheet.dismiss();
                        }
                    } else {
                        C500260Jjc.LLFFF(liveProfileSheet.LLLJIL);
                        C500260Jjc.LJIILIIL(liveProfileSheet.LLLFF);
                        C500260Jjc.LJIILIIL(liveProfileSheet.LLLIZZ);
                        C496470JdV c496470JdV = liveProfileSheet.LLL;
                        if (c496470JdV != null) {
                            Throwable th = c496270JdB2.LIZJ;
                            C496120Jcw c496120Jcw = c496270JdB2.LIZIZ;
                            if (c496120Jcw != null) {
                                str = c496120Jcw.LIZLLL;
                            } else {
                                str = null;
                            }
                            boolean z = liveProfileSheet.LLLLIILLL;
                            C495920Jcc c495920Jcc = c496470JdV.LIZ;
                            DataChannel dataChannel = c495920Jcc.LJIIJJI;
                            long j = c495920Jcc.LJII;
                            Room room = c495920Jcc.LJFF;
                            boolean z2 = c495920Jcc.LIZJ.LJI;
                            UserProfileEvent userProfileEvent = c495920Jcc.LJIIIIZZ;
                            w.LIZ.getClass();
                            String strLJIILJJIL = w.LJIILJJIL();
                            String strLIZ = c496470JdV.LIZ();
                            if (z2) {
                                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).upLoadLiveEcoEvent(room.getId(), 1);
                            }
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_profile_card_load_fail");
                            c474500IjALIZ.LJIJJLI(dataChannel);
                            c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, dataChannel, "user_live_duration"));
                            c474500IjALIZ.LJIILJJIL("live_detail");
                            c474500IjALIZ.LJIIJJI("live_interact");
                            c474500IjALIZ.LJJII(strLIZ, "click_type");
                            c474500IjALIZ.LJJII(userProfileEvent.clickModule, "click_module");
                            c474500IjALIZ.LJJII(userProfileEvent.clickMethod, "click_method");
                            c474500IjALIZ.LJJII(Long.valueOf(userProfileEvent.msgId), "message_id");
                            c474500IjALIZ.LJJII(Long.valueOf(userProfileEvent.releaseId), "message_release_id");
                            c474500IjALIZ.LJJII(strLIZ, "request_page");
                            c474500IjALIZ.LJJII(String.valueOf(j), "to_user_id");
                            c474500IjALIZ.LJJII(C466640IRq.LIZJ().LIZLLL(), "enter_live_method");
                            if (!TextUtils.isEmpty(strLJIILJJIL) && Intrinsics.LJFF(strLJIILJJIL, "click_push_live_cd_user")) {
                                str2 = "1";
                            } else {
                                str2 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c474500IjALIZ.LJJII(str2, "is_subscribe");
                            if (c496470JdV.LIZ.LJ) {
                                str3 = "portrait";
                            } else {
                                str3 = "landscape";
                            }
                            c474500IjALIZ.LJJII(str3, "room_orientation");
                            if (TextUtils.isEmpty(userProfileEvent.mClickUserPosition)) {
                                str4 = "profile_card";
                            } else {
                                str4 = userProfileEvent.mClickUserPosition;
                            }
                            c474500IjALIZ.LJJII(str4, "click_user_position");
                            if (z) {
                                str5 = "retry";
                            } else {
                                str5 = "direct";
                            }
                            c474500IjALIZ.LJJII(str5, "load_type");
                            c474500IjALIZ.LJJII(Integer.valueOf(c496470JdV.LIZ.LIZJ.LIZLLL ? 1 : 0), "is_self");
                            String string2 = null;
                            int iLIZIZ = C496470JdV.LIZIZ(null);
                            if (iLIZIZ > -1) {
                                c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ), "user_level");
                            }
                            User owner = room.getOwner();
                            if (owner != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
                                if (subscribeInfo.isAnchorQualified()) {
                                    str7 = "open";
                                } else {
                                    str7 = "close";
                                }
                                c474500IjALIZ.LJJII(str7, "subscription_status");
                                if (subscribeInfo.isAnchorQualified()) {
                                    subscriberCount = subscribeInfo.getSubscriberCount();
                                } else {
                                    subscriberCount = 0;
                                }
                                c474500IjALIZ.LJJII(Integer.valueOf(subscriberCount), "subscriber");
                                c474500IjALIZ.LJJIIZI(userProfileEvent.extraParams);
                            }
                            Map<String, String> map = userProfileEvent.trackExtra;
                            if (map != null) {
                                c474500IjALIZ.LJJIIZI(map);
                            }
                            if (dataChannel.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.SHOW) {
                                c474500IjALIZ.LJIILJJIL("live_extended_comment_filed");
                            }
                            String str8 = userProfileEvent.mEventPage;
                            if (str8 != null) {
                                c474500IjALIZ.LJIILJJIL(str8);
                            }
                            Map<String, String> map2 = userProfileEvent.mRankInfo;
                            if (map2 != null) {
                                c474500IjALIZ.LJJIIZI(map2);
                            }
                            boolean z3 = th instanceof C477520Io2;
                            if (z3) {
                                str6 = " errorCode: " + ((C501520Jle) th).getErrorCode();
                            } else if (!(th instanceof C1494690ozz)) {
                                str6 = "";
                            } else {
                                str6 = " errorCode: " + ((C1494690ozz) th).getCronetInternalErrorCode();
                            }
                            StringBuilder sb = new StringBuilder("cause: ");
                            if (th != null && (cause = th.getCause()) != null) {
                                string = cause.toString();
                            } else {
                                string = null;
                            }
                            sb.append(string);
                            sb.append(" error: ");
                            if (th != null) {
                                string2 = th.toString();
                            }
                            sb.append(string2);
                            sb.append(str6);
                            c474500IjALIZ.LJJII(sb.toString(), "extra");
                            if (str == null) {
                                if (!z3) {
                                    str = "";
                                    c474500IjALIZ.LJJII(str, "log_id");
                                    c474500IjALIZ.LIZ();
                                } else {
                                    c474500IjALIZ.LJJII(((C477520Io2) th).getxTtLogId(), "log_id");
                                    c474500IjALIZ.LIZ();
                                }
                            } else {
                                c474500IjALIZ.LJJII(str, "log_id");
                                c474500IjALIZ.LIZ();
                            }
                        }
                    }
                } else {
                    C495920Jcc c495920Jcc2 = liveProfileSheet.LLJLLL;
                    if (c495920Jcc2 != null && c495920Jcc2.LJ && C500260Jjc.LJJJJIZL(liveProfileSheet.LLLJIL) && (viewGroup = liveProfileSheet.LLLJIL) != null && (viewGroup2 = liveProfileSheet.LLLIZZ) != null && (layoutParams = viewGroup2.getLayoutParams()) != null) {
                        layoutParams.height = viewGroup.getLayoutParams().height;
                    }
                    C500260Jjc.LLFFF(liveProfileSheet.LLLIZZ);
                    C500260Jjc.LLFFF(liveProfileSheet.LLLJ);
                    C500260Jjc.LJIILIIL(liveProfileSheet.LLLFF);
                    C500260Jjc.LJIILIIL(liveProfileSheet.LLLJIL);
                    ViewGroup viewGroup3 = liveProfileSheet.LLLF;
                    if (viewGroup3 != null) {
                        HandlerHook.viewPost(viewGroup3, new ARunnableS107S0100000_7(liveProfileSheet, 245));
                    }
                }
            } else {
                DataChannel dataChannel2 = null;
                if (LiveProfileCardRefreshSettings.INSTANCE.enable() && (c496270JdB = liveProfileSheet.LLLLJ) != null && c496270JdB.LIZ == 0) {
                    C496120Jcw c496120Jcw2 = c496270JdB.LIZIZ;
                    C496120Jcw c496120Jcw3 = c496270JdB2.LIZIZ;
                    if (c496120Jcw2 != null && c496120Jcw3 != null && (user = c496120Jcw2.LIZ) != null && (user2 = c496120Jcw3.LIZ) != null) {
                        for (AbstractC495740JcK abstractC495740JcK : (ArrayList) liveProfileSheet.LLLLIIIILLL) {
                            Map<AbstractC495790JcP<?>, Object> map3 = c496120Jcw2.LIZJ;
                            Map<AbstractC495790JcP<?>, Object> map4 = c496120Jcw3.LIZJ;
                            for (AbstractC495790JcP abstractC495790JcP : (ArrayList) abstractC495740JcK.LIZLLL) {
                                Object obj2 = map3.get(abstractC495790JcP);
                                Object obj3 = map4.get(abstractC495790JcP);
                                abstractC495790JcP.getClass();
                                if (obj2 == null) {
                                    obj2 = null;
                                }
                                if (obj3 == null) {
                                    obj3 = null;
                                }
                                abstractC495790JcP.LJIIL(user, user2, obj2, obj3);
                            }
                        }
                    }
                }
                C500260Jjc.LLFFF(liveProfileSheet.LLLFF);
                C500260Jjc.LJIILIIL(liveProfileSheet.LLLIZZ);
                C500260Jjc.LJIILIIL(liveProfileSheet.LLLJIL);
                C496120Jcw c496120Jcw4 = c496270JdB2.LIZIZ;
                if (c496120Jcw4 != null) {
                    liveProfileSheet.uS(c496120Jcw4);
                    if (liveProfileSheet.LLL != null) {
                        C495920Jcc c495920Jcc3 = liveProfileSheet.LLJLLL;
                        if (c495920Jcc3 != null) {
                            dataChannel2 = c495920Jcc3.LJIIJJI;
                        }
                        C496470JdV.LJ(dataChannel2, c496120Jcw4, c495920Jcc3);
                    }
                }
                ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).C11();
            }
        } else {
            DataChannel dataChannel3 = null;
            C20441214yg.LIZIZ("LiveProfileSheet", "preload successful");
            C500260Jjc.LLFFF(liveProfileSheet.LLLFF);
            C500260Jjc.LJIILIIL(liveProfileSheet.LLLIZZ);
            C500260Jjc.LJIILIIL(liveProfileSheet.LLLJIL);
            C496120Jcw c496120Jcw5 = c496270JdB2.LIZIZ;
            if (c496120Jcw5 != null) {
                liveProfileSheet.uS(c496120Jcw5);
                if (liveProfileSheet.LLL != null) {
                    C495920Jcc c495920Jcc4 = liveProfileSheet.LLJLLL;
                    if (c495920Jcc4 != null) {
                        dataChannel3 = c495920Jcc4.LJIIJJI;
                    }
                    C496470JdV.LJ(dataChannel3, c496120Jcw5, c495920Jcc4);
                }
            }
            ViewGroup viewGroup4 = liveProfileSheet.LLLF;
            if (viewGroup4 != null) {
                HandlerHook.viewPost(viewGroup4, new ARunnableS107S0100000_7(liveProfileSheet, 246));
            }
        }
        ((LiveProfileSheet) aObserverS211S0100000_7.l0).LLLLJ = c496270JdB2;
    }

    public static final void onChanged$12(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        String str;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        String string;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme2;
        String str2;
        String uid;
        Long lValueOf;
        String requestId;
        Integer numValueOf;
        String uid2;
        Long lValueOf2;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        com.ss.android.ugc.aweme.profile.model.User user;
        LiveRoomStruct liveRoomStruct4;
        com.ss.android.ugc.aweme.profile.model.User user2;
        Aweme aweme3;
        LiveRoomStruct liveRoomStruct5;
        LiveRoomStruct liveRoomStruct6;
        com.ss.android.ugc.aweme.profile.model.User user3;
        Aweme aweme4;
        AwemeRawAd awemeRawAd2;
        String string2;
        LiveRoomStruct liveRoomStruct7;
        Aweme aweme5;
        String str3;
        String uid3;
        Long lValueOf3;
        String requestId2;
        Integer numValueOf2;
        String uid4;
        Long lValueOf4;
        LiveRoomStruct liveRoomStruct8;
        LiveRoomStruct liveRoomStruct9;
        com.ss.android.ugc.aweme.profile.model.User user4;
        LiveRoomStruct liveRoomStruct10;
        com.ss.android.ugc.aweme.profile.model.User user5;
        Aweme aweme6;
        LiveRoomStruct liveRoomStruct11;
        LiveRoomStruct liveRoomStruct12;
        com.ss.android.ugc.aweme.profile.model.User user6;
        IViewPagerAbility iViewPagerAbility;
        PagerAdapter pagerAdapterLJJLIIIJL;
        Aweme awemeLJIIIIZZ;
        Aweme awemeRh;
        Aweme awemeK12;
        Aweme aweme7;
        Integer numValueOf3;
        Aweme aweme8;
        C0J75 c0j75 = (C0J75) obj;
        LiveCheckAliveWidget liveCheckAliveWidget = (LiveCheckAliveWidget) aObserverS211S0100000_7.l0;
        Aweme aweme9 = c0j75.LIZ;
        boolean z = c0j75.LIZIZ;
        String str4 = c0j75.LIZJ;
        int i = c0j75.LIZLLL;
        liveCheckAliveWidget.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteCurrentCard, isNR:");
        sbLIZ.append(z);
        sbLIZ.append(", reason:");
        sbLIZ.append(str4);
        C20441214yg.LJIIIZ("LiveCheckAliveWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (liveCheckAliveWidget.M1() && (iViewPagerAbility = (IViewPagerAbility) liveCheckAliveWidget.LLJI.getValue()) != null && (pagerAdapterLJJLIIIJL = iViewPagerAbility.LJJLIIIJL()) != null) {
            int count = pagerAdapterLJJLIIIJL.getCount();
            IViewPagerAbility iViewPagerAbility2 = (IViewPagerAbility) liveCheckAliveWidget.LLJI.getValue();
            if (iViewPagerAbility2 != null) {
                int iLJIL = iViewPagerAbility2.LJIL();
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) liveCheckAliveWidget.LLJI.getValue();
                if (iViewPagerComponentAbility != null) {
                    awemeLJIIIIZZ = iViewPagerComponentAbility.LJIIIIZZ();
                } else {
                    awemeLJIIIIZZ = null;
                }
                IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) liveCheckAliveWidget.LLJI.getValue();
                if (iViewPagerComponentAbility2 != null) {
                    awemeRh = iViewPagerComponentAbility2.Rh(awemeLJIIIIZZ);
                } else {
                    awemeRh = null;
                }
                IViewPagerComponentAbility iViewPagerComponentAbility3 = (IViewPagerComponentAbility) liveCheckAliveWidget.LLJI.getValue();
                if (iViewPagerComponentAbility3 != null) {
                    awemeK12 = iViewPagerComponentAbility3.k12(awemeLJIIIIZZ);
                } else {
                    awemeK12 = null;
                }
                C1ACA c1acaZ1 = liveCheckAliveWidget.z1();
                if (c1acaZ1 != null) {
                    aweme7 = c1acaZ1.LIZIZ;
                } else {
                    aweme7 = null;
                }
                if (Intrinsics.LJFF(aweme7, awemeLJIIIIZZ)) {
                    numValueOf3 = Integer.valueOf(iLJIL);
                } else if (Intrinsics.LJFF(aweme7, awemeRh)) {
                    numValueOf3 = Integer.valueOf(iLJIL + 1);
                } else if (Intrinsics.LJFF(aweme7, awemeK12)) {
                    numValueOf3 = Integer.valueOf(iLJIL - 1);
                } else {
                    C1ACA c1acaZ12 = liveCheckAliveWidget.z1();
                    if (c1acaZ12 != null) {
                        numValueOf3 = Integer.valueOf(c1acaZ12.LJIIIIZZ);
                    } else {
                        numValueOf3 = null;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("recordDeleteCard Exception, livePos=");
                        sbLIZ2.append(numValueOf3);
                        C20441214yg.LJIIIZ("LiveCheckAliveWidget", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                if (numValueOf3 != null && numValueOf3.intValue() >= 0) {
                    C1ACA c1acaZ13 = liveCheckAliveWidget.z1();
                    if (c1acaZ13 != null) {
                        aweme8 = c1acaZ13.LIZIZ;
                    } else {
                        aweme8 = null;
                    }
                    C0J7C.LIZLLL((count - numValueOf3.intValue()) - 1, aweme8);
                } else {
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("recordDeleteCard Exception, livePos=");
                    sbLIZ22.append(numValueOf3);
                    C20441214yg.LJIIIZ("LiveCheckAliveWidget", C2188811AlT.LIZIZ(sbLIZ22));
                }
            }
        }
        C1ACA c1acaZ14 = liveCheckAliveWidget.z1();
        if (c1acaZ14 != null) {
            str = c1acaZ14.LJ;
        } else {
            str = null;
        }
        C1440005kM.LIZ(new C1210880hcE(str, "FUNCTION_FROM_DEFAULT", "live_offline", aweme9));
        if (i > 0) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(i));
        }
        if (z) {
            if (((Boolean) liveCheckAliveWidget.LLJILJIL.getValue()).booleanValue()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1ACA c1acaZ15 = liveCheckAliveWidget.z1();
                if (c1acaZ15 != null) {
                    str3 = c1acaZ15.LIZLLL;
                } else {
                    str3 = null;
                }
                c2344009Gk.LJIIIIZZ("enter_from_merge", str3);
                c2344009Gk.LJIIIIZZ("action_type", "click");
                C1ACA c1acaZ16 = liveCheckAliveWidget.z1();
                if (c1acaZ16 != null && (liveRoomStruct12 = c1acaZ16.LIZJ) != null && (user6 = liveRoomStruct12.owner) != null) {
                    uid3 = user6.getUid();
                } else {
                    uid3 = null;
                }
                c2344009Gk.LJIIIIZZ("anchor_id", uid3);
                C1ACA c1acaZ17 = liveCheckAliveWidget.z1();
                if (c1acaZ17 != null && (liveRoomStruct11 = c1acaZ17.LIZJ) != null) {
                    lValueOf3 = Long.valueOf(liveRoomStruct11.id);
                } else {
                    lValueOf3 = null;
                }
                c2344009Gk.LJ(lValueOf3, "room_id");
                C1ACA c1acaZ18 = liveCheckAliveWidget.z1();
                if (c1acaZ18 != null && (aweme6 = c1acaZ18.LIZIZ) != null) {
                    requestId2 = aweme6.getRequestId();
                } else {
                    requestId2 = null;
                }
                c2344009Gk.LJIIIIZZ("request_id", requestId2);
                c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                C1ACA c1acaZ19 = liveCheckAliveWidget.z1();
                if (c1acaZ19 != null && (liveRoomStruct10 = c1acaZ19.LIZJ) != null && (user5 = liveRoomStruct10.owner) != null) {
                    numValueOf2 = Integer.valueOf(user5.getFollowStatus());
                } else {
                    numValueOf2 = null;
                }
                c2344009Gk.LJ(numValueOf2, "follow_status");
                C1ACA c1acaZ110 = liveCheckAliveWidget.z1();
                if (c1acaZ110 != null && (liveRoomStruct9 = c1acaZ110.LIZJ) != null && (user4 = liveRoomStruct9.owner) != null) {
                    uid4 = user4.getUid();
                } else {
                    uid4 = null;
                }
                c2344009Gk.LJIIIIZZ("del_anchor_id", uid4);
                C1ACA c1acaZ111 = liveCheckAliveWidget.z1();
                if (c1acaZ111 != null && (liveRoomStruct8 = c1acaZ111.LIZJ) != null) {
                    lValueOf4 = Long.valueOf(liveRoomStruct8.id);
                } else {
                    lValueOf4 = null;
                }
                c2344009Gk.LJ(lValueOf4, "del_room_id");
                c2344009Gk.LJIIIIZZ("del_type", "live_cell");
                c2344009Gk.LJIIIIZZ("del_reason", str4);
                C20684815ws.LJIILLIIL("livesdk_live_delete", c2344009Gk.LIZ);
            }
            C1ACA c1acaZ112 = liveCheckAliveWidget.z1();
            if (c1acaZ112 != null && (aweme4 = c1acaZ112.LIZIZ) != null && aweme4.isAd()) {
                C1ACA c1acaZ113 = liveCheckAliveWidget.z1();
                if (c1acaZ113 != null && (aweme5 = c1acaZ113.LIZIZ) != null) {
                    awemeRawAd2 = aweme5.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "live_delete", awemeRawAd2);
                c1022820ciuLIZLLL.LIZIZ(str4, "delete_reason");
                C1ACA c1acaZ114 = liveCheckAliveWidget.z1();
                if (c1acaZ114 != null && (liveRoomStruct7 = c1acaZ114.LIZJ) != null) {
                    string2 = Long.valueOf(liveRoomStruct7.id).toString();
                } else {
                    string2 = null;
                }
                c1022820ciuLIZLLL.LIZIZ(string2, "room_id");
                c1022820ciuLIZLLL.LJII();
                return;
            }
            return;
        }
        if (((Boolean) liveCheckAliveWidget.LLJIJIL.getValue()).booleanValue()) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            C1ACA c1acaZ115 = liveCheckAliveWidget.z1();
            if (c1acaZ115 != null) {
                str2 = c1acaZ115.LIZLLL;
            } else {
                str2 = null;
            }
            c2344009Gk2.LJIIIIZZ("enter_from_merge", str2);
            c2344009Gk2.LJIIIIZZ("action_type", "click");
            C1ACA c1acaZ116 = liveCheckAliveWidget.z1();
            if (c1acaZ116 != null && (liveRoomStruct6 = c1acaZ116.LIZJ) != null && (user3 = liveRoomStruct6.owner) != null) {
                uid = user3.getUid();
            } else {
                uid = null;
            }
            c2344009Gk2.LJIIIIZZ("anchor_id", uid);
            C1ACA c1acaZ117 = liveCheckAliveWidget.z1();
            if (c1acaZ117 != null && (liveRoomStruct5 = c1acaZ117.LIZJ) != null) {
                lValueOf = Long.valueOf(liveRoomStruct5.id);
            } else {
                lValueOf = null;
            }
            c2344009Gk2.LJ(lValueOf, "room_id");
            C1ACA c1acaZ118 = liveCheckAliveWidget.z1();
            if (c1acaZ118 != null && (aweme3 = c1acaZ118.LIZIZ) != null) {
                requestId = aweme3.getRequestId();
            } else {
                requestId = null;
            }
            c2344009Gk2.LJIIIIZZ("request_id", requestId);
            c2344009Gk2.LJIIIIZZ("enter_method", "live_cell");
            C1ACA c1acaZ119 = liveCheckAliveWidget.z1();
            if (c1acaZ119 != null && (liveRoomStruct4 = c1acaZ119.LIZJ) != null && (user2 = liveRoomStruct4.owner) != null) {
                numValueOf = Integer.valueOf(user2.getFollowStatus());
            } else {
                numValueOf = null;
            }
            c2344009Gk2.LJ(numValueOf, "follow_status");
            C1ACA c1acaZ120 = liveCheckAliveWidget.z1();
            if (c1acaZ120 != null && (liveRoomStruct3 = c1acaZ120.LIZJ) != null && (user = liveRoomStruct3.owner) != null) {
                uid2 = user.getUid();
            } else {
                uid2 = null;
            }
            c2344009Gk2.LJIIIIZZ("delete_anchor_id", uid2);
            C1ACA c1acaZ121 = liveCheckAliveWidget.z1();
            if (c1acaZ121 != null && (liveRoomStruct2 = c1acaZ121.LIZJ) != null) {
                lValueOf2 = Long.valueOf(liveRoomStruct2.id);
            } else {
                lValueOf2 = null;
            }
            c2344009Gk2.LJ(lValueOf2, "delete_room_id");
            c2344009Gk2.LJIIIIZZ("delete_type", "inspection");
            C20684815ws.LJIILLIIL("livesdk_finish_card_delete", c2344009Gk2.LIZ);
        }
        C1ACA c1acaZ122 = liveCheckAliveWidget.z1();
        if (c1acaZ122 == null || (aweme = c1acaZ122.LIZIZ) == null || !aweme.isAd()) {
            return;
        }
        C1ACA c1acaZ123 = liveCheckAliveWidget.z1();
        if (c1acaZ123 != null && (aweme2 = c1acaZ123.LIZIZ) != null) {
            awemeRawAd = aweme2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "live_delete", awemeRawAd);
        c1022820ciuLIZLLL2.LIZIZ("finish", "delete_reason");
        C1ACA c1acaZ124 = liveCheckAliveWidget.z1();
        if (c1acaZ124 != null && (liveRoomStruct = c1acaZ124.LIZJ) != null) {
            string = Long.valueOf(liveRoomStruct.id).toString();
        } else {
            string = null;
        }
        c1022820ciuLIZLLL2.LIZIZ(string, "room_id");
        c1022820ciuLIZLLL2.LJII();
    }

    public static final void onChanged$13(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C0J77 c0j77 = (C0J77) obj;
        LiveCheckAliveWidget liveCheckAliveWidget = (LiveCheckAliveWidget) aObserverS211S0100000_7.l0;
        C0J76 c0j76 = c0j77.LIZ;
        boolean z = c0j77.LIZIZ;
        C1ACA c1acaZ1 = liveCheckAliveWidget.z1();
        if (c1acaZ1 != null && c1acaZ1.LJII && c0j76 != null) {
            C1440005kM.LIZ(new C0J7B(z, c1acaZ1.LIZIZ, c1acaZ1.LJ, c0j76.LIZ, c0j76.LIZIZ, c0j76.LIZJ, c0j76.LIZLLL, liveCheckAliveWidget.M1()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$14(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        Boolean boolValueOf;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        Aweme aweme;
        String requestId;
        C1ACA c1acaZ1 = ((LivePreviewEnterRoomBoostWidget) aObserverS211S0100000_7.l0).z1();
        if (c1acaZ1 != null && c1acaZ1.LJII) {
            C1ACA c1acaZ12 = ((LivePreviewEnterRoomBoostWidget) aObserverS211S0100000_7.l0).z1();
            if (c1acaZ12 != null) {
                boolValueOf = Boolean.valueOf(c1acaZ12.LJJJJJ);
            } else {
                boolValueOf = null;
            }
            if (!C176600m4.LIZIZ(boolValueOf)) {
                LivePreviewEnterRoomBoostWidget livePreviewEnterRoomBoostWidget = (LivePreviewEnterRoomBoostWidget) aObserverS211S0100000_7.l0;
                if (!livePreviewEnterRoomBoostWidget.LLJJ) {
                    HashMap map = new HashMap();
                    C1ACA c1acaZ13 = livePreviewEnterRoomBoostWidget.z1();
                    if (c1acaZ13 != null && (liveRoomStruct = c1acaZ13.LIZJ) != null) {
                        long j = liveRoomStruct.id;
                        C1ACA c1acaZ14 = livePreviewEnterRoomBoostWidget.z1();
                        if (c1acaZ14 != null && (liveRoomStruct2 = c1acaZ14.LIZJ) != null) {
                            long anchorId = liveRoomStruct2.getAnchorId();
                            C1ACA c1acaZ15 = livePreviewEnterRoomBoostWidget.z1();
                            if (c1acaZ15 != null && (aweme = c1acaZ15.LIZIZ) != null && (requestId = aweme.getRequestId()) != null) {
                                map.put("roomId", String.valueOf(j));
                                map.put("requestId", requestId);
                                C0IKU c0ikuP71 = ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).P71("live_enter_room_boost_scene", EnumC1101430elh.ENTER_ROOM_API_BOOST, map, C482000IvG.class);
                                if (c0ikuP71 != null) {
                                    C482000IvG c482000IvG = (C482000IvG) c0ikuP71.LIZ;
                                    long j2 = c482000IvG.LIZIZ - 1000;
                                    if (0 >= j2) {
                                        j2 = 0;
                                    }
                                    if (c482000IvG.LIZ == 1) {
                                        C11JL c11jl = livePreviewEnterRoomBoostWidget.LLJILJIL;
                                        if (c11jl != null) {
                                            c11jl.dispose();
                                        }
                                        C1ACA c1acaZ16 = livePreviewEnterRoomBoostWidget.z1();
                                        if (c1acaZ16 != null) {
                                            c1acaZ16.LJJJJJL = true;
                                        }
                                        C11JL c11jl2 = livePreviewEnterRoomBoostWidget.LLJILJILJ;
                                        if (c11jl2 != null) {
                                            c11jl2.dispose();
                                        }
                                        C19475311Hj c19475311HjLJIJJLI = AbstractC19484711Kz.LJIJJLI(1);
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        livePreviewEnterRoomBoostWidget.LLJILJILJ = (C11JL) c19475311HjLJIJJLI.LJIIIIZZ(j2, timeUnit).LJJIJIIJI(C11S5.LIZ()).LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0IvE
                                            @Override // X.InterfaceC781210Ukh
                                            public final void run() {
                                            }
                                        }).LJJIIZ(new AfS176S0100000_7(livePreviewEnterRoomBoostWidget, anchorId, 247), new C09JN() { // from class: X.00QF
                                            @Override // X.C09JN
                                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                                C1C7U.LIZ("LivePreviewEnterRoomBoostWidget@23db.triggerEnterRoomBoost$3");
                                                C1C7U.LIZIZ("LivePreviewEnterRoomBoostWidget@23db.triggerEnterRoomBoost$3");
                                            }
                                        });
                                        livePreviewEnterRoomBoostWidget.LLJILJIL = (C11JL) AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(c482000IvG.LIZIZ, timeUnit).LJJIJIIJI(C11S5.LIZ()).LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0IvF
                                            @Override // X.InterfaceC781210Ukh
                                            public final void run() {
                                            }
                                        }).LJJIIZ(new AfS176S0100000_7(livePreviewEnterRoomBoostWidget, 248), new C09JN() { // from class: X.00QG
                                            @Override // X.C09JN
                                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                                C1C7U.LIZ("LivePreviewEnterRoomBoostWidget@23db.triggerEnterRoomBoost$6");
                                                C1C7U.LIZIZ("LivePreviewEnterRoomBoostWidget@23db.triggerEnterRoomBoost$6");
                                            }
                                        });
                                    }
                                }
                            }
                        }
                    }
                    LivePreviewEnterRoomBoostWidget livePreviewEnterRoomBoostWidget2 = (LivePreviewEnterRoomBoostWidget) aObserverS211S0100000_7.l0;
                    livePreviewEnterRoomBoostWidget2.LLJJ = true;
                    livePreviewEnterRoomBoostWidget2.LLJILLL = true;
                }
            }
        }
    }

    public static final void onChanged$15(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((ReportPreviewMaskLayerWidget) aObserverS211S0100000_7.l0).LLJILJIL = true;
    }

    public static final void onChanged$16(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C0K9P.LIZ(((SubscribeMaskLayerWidget) aObserverS211S0100000_7.l0).z1(), true, ((SubscribeMaskLayerWidget) aObserverS211S0100000_7.l0).dataChannel);
        ((SubscribeMaskLayerWidget) aObserverS211S0100000_7.l0).M1();
    }

    public static final void onChanged$17(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0).O1("conflict_close", "4");
    }

    public static final void onChanged$18(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        LiveSurveyWidgetV2 liveSurveyWidgetV2 = (LiveSurveyWidgetV2) aObserverS211S0100000_7.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (liveSurveyWidgetV2.LLJJIJI == null) {
            liveSurveyWidgetV2.LLJJIJI = new C484860Izs();
        }
        C484860Izs c484860Izs = liveSurveyWidgetV2.LLJJIJI;
        if (c484860Izs != null) {
            PreviewSurveyViewModel previewSurveyViewModelS1 = liveSurveyWidgetV2.S1();
            C0J0X c0j0x = (C0J0X) liveSurveyWidgetV2.LLJJ.getValue();
            FrameLayout frameLayout = liveSurveyWidgetV2.LLJILJIL;
            View view = liveSurveyWidgetV2.LLJILJILJ;
            c484860Izs.LJIL = previewSurveyViewModelS1;
            c0j0x.setScrollIntercept(c484860Izs);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0j0x);
            c0j0x.setAlpha(0.0f);
            c484860Izs.LJIILL = c0j0x;
            c484860Izs.LJIILLIIL = frameLayout;
            c484860Izs.LJIIZILJ = view;
            c484860Izs.LJIJI = false;
            c484860Izs.LJIJJLI = zBooleanValue;
            c484860Izs.LJII(true);
            C1324720kZq c1324720kZq = new C1324720kZq(liveSurveyWidgetV2.context);
            C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_watch_resource_normal_1", "ttlive_full_screen_survey_bg.png");
            ViewGroup viewGroup = (ViewGroup) liveSurveyWidgetV2.LLJJ.getValue();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
            viewGroup.removeAllViewsInLayout();
            ((ViewGroup) liveSurveyWidgetV2.LLJJ.getValue()).addView(c1324720kZq);
            C786410Ut5.V(liveSurveyWidgetV2.Q1(), 0);
            View viewFindViewById = liveSurveyWidgetV2.Q1().findViewById(R.id.video_cover);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new ACListenerS142S0100000_7(c484860Izs, 253), viewFindViewById);
            }
            liveSurveyWidgetV2.Q1().setBackgroundTouchListener(liveSurveyWidgetV2.LLJJIJI);
            C484860Izs c484860Izs2 = liveSurveyWidgetV2.LLJJIJI;
            if (c484860Izs2 != null) {
                C0SUT c0sutQ1 = liveSurveyWidgetV2.Q1();
                c484860Izs2.LJIJ = c0sutQ1;
                if (c484860Izs2.LJIJJLI) {
                    if (c0sutQ1 != null) {
                        C786410Ut5.T4(c0sutQ1, 1.0f);
                    }
                    View view2 = c484860Izs2.LJIJ;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                } else {
                    if (c0sutQ1 != null) {
                        C786410Ut5.T4(c0sutQ1, 0.0f);
                    }
                    View view3 = c484860Izs2.LJIJ;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(4, view3);
                    }
                }
            }
            HandlerHook.viewPost(liveSurveyWidgetV2.Q1(), new ARunnableS107S0100000_7(liveSurveyWidgetV2, 207));
            liveSurveyWidgetV2.LLJIJIL.setVideoScalingListener(c484860Izs);
            LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) liveSurveyWidgetV2.LLJJLIIIJLLLLLLLZ.getValue();
            if (livePreviewGuideEnterVM != null) {
                livePreviewGuideEnterVM.LLJJI = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v96, types: [X.0Iwt] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0Izn, X.0Izy, android.view.View] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void onChanged$19(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        FeedLiveViewHolderVM feedLiveViewHolderVMP1;
        FeedLiveViewHolderVM feedLiveViewHolderVMP12;
        LivePreviewGuideEnterVM livePreviewGuideEnterVM;
        C1ACA c1acaZ1;
        AbstractC484810Izn c484930Izz;
        C483250IxH c483250IxH;
        SurveyData surveyData;
        SurveyShowMode surveyShowMode;
        Integer numValueOf;
        SurveyData surveyData2;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        Integer value;
        MutableLiveData<Integer> mutableLiveData3;
        Integer value2;
        MutableLiveData<Boolean> mutableLiveData4;
        SurveyData surveyData3;
        NextLiveData<Boolean> nextLiveData;
        FeedLiveViewHolderVM feedLiveViewHolderVMP13;
        FeedLiveViewHolderVM feedLiveViewHolderVMP14;
        LivePreviewGuideEnterVM livePreviewGuideEnterVM2;
        C1ACA c1acaZ12;
        MutableLiveData<Boolean> mutableLiveData5;
        MutableLiveData<Integer> mutableLiveData6;
        Integer value3;
        MutableLiveData<Integer> mutableLiveData7;
        Integer value4;
        MutableLiveData<Boolean> mutableLiveData8;
        SurveyData surveyData4;
        NextLiveData<Boolean> nextLiveData2;
        C483240IxG c483240IxG = (C483240IxG) obj;
        int i = C484870Izt.LIZ[c483240IxG.LIZ.ordinal()];
        if (i != 1) {
            final String str = 0;
            str = null;
            String str2 = null;
            str = 0;
            final int i2 = 0;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        final LiveSurveyWidgetV2 liveSurveyWidgetV2 = (LiveSurveyWidgetV2) aObserverS211S0100000_7.l0;
                        EnumC484840Izq enumC484840Izq = liveSurveyWidgetV2.LLJJJJLIIL;
                        EnumC484840Izq enumC484840Izq2 = EnumC484840Izq.FEEDBACK;
                        if (enumC484840Izq != enumC484840Izq2) {
                            Map<String, String> map = c483240IxG.LIZJ;
                            liveSurveyWidgetV2.V1(EnumC484840Izq.ROUTE, true);
                            LightSurveyFeedbackSheet lightSurveyFeedbackSheetGS1 = ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).gS1(liveSurveyWidgetV2.S1(), new InterfaceC483180IxA() { // from class: X.0Iwt
                                @Override // X.InterfaceC483180IxA
                                public final void LIZ(Map<String, String> map2) {
                                    long j;
                                    Long lValueOf;
                                    SurveyShowMode surveyShowMode2;
                                    C483250IxH c483250IxH2;
                                    LiveSurveyWidgetV2 liveSurveyWidgetV22 = liveSurveyWidgetV2;
                                    liveSurveyWidgetV22.LLJJJJLIIL = EnumC484840Izq.NULL;
                                    PreviewSurveyViewModel previewSurveyViewModelS1 = liveSurveyWidgetV22.S1();
                                    if (previewSurveyViewModelS1 != null && (c483250IxH2 = previewSurveyViewModelS1.LLJLIL) != null) {
                                        c483250IxH2.LIZLLL = false;
                                    }
                                    PreviewSurveyViewModel previewSurveyViewModelS12 = liveSurveyWidgetV2.S1();
                                    if (previewSurveyViewModelS12 != null && previewSurveyViewModelS12.LLJJIJIL > 0) {
                                        previewSurveyViewModelS12.LLJJJ = SystemClock.elapsedRealtime() - previewSurveyViewModelS12.LLJJIJIL;
                                        C2344009Gk c2344009Gk = new C2344009Gk();
                                        previewSurveyViewModelS12.GQ2(c2344009Gk);
                                        c2344009Gk.LJII(map2);
                                        c2344009Gk.LJIIIIZZ("survey_page", "secondary");
                                        SurveyData surveyData5 = previewSurveyViewModelS12.LL;
                                        if (surveyData5 != null && (surveyShowMode2 = surveyData5.showMode) != null) {
                                            j = surveyShowMode2.showDurationMs;
                                        } else {
                                            j = 0;
                                        }
                                        c2344009Gk.LIZLLL(j, "setting_time");
                                        c2344009Gk.LIZLLL(previewSurveyViewModelS12.LLJJJ, "secondary_stay_time");
                                        c2344009Gk.LIZLLL(previewSurveyViewModelS12.LLJJIJIIJIL + previewSurveyViewModelS12.LLJJJ, "stay_time");
                                        SurveyOption surveyOption = previewSurveyViewModelS12.LLILLL;
                                        Integer numValueOf2 = null;
                                        if (surveyOption != null) {
                                            lValueOf = Long.valueOf(surveyOption.optionId);
                                        } else {
                                            lValueOf = null;
                                        }
                                        c2344009Gk.LJ(lValueOf, "option_id");
                                        c2344009Gk.LJIIIIZZ("secondary_option_id", C13LP.LJJLIIIJ(previewSurveyViewModelS12.LLILZIL, ",", null, null, 0, null, AFwS237S0000000_7.get$arr$(299), 30));
                                        Set<SurveySecondQuestion> set = previewSurveyViewModelS12.LLILZIL;
                                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
                                        Iterator<SurveySecondQuestion> it2 = set.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(Long.valueOf(it2.next().optionId));
                                        }
                                        c2344009Gk.LJIIIIZZ("result", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                                        SurveyOption surveyOption2 = previewSurveyViewModelS12.LLILLL;
                                        if (surveyOption2 != null) {
                                            numValueOf2 = Integer.valueOf(surveyOption2.LIZ);
                                        }
                                        c2344009Gk.LJ(numValueOf2, "position_id_submit_option");
                                        C20684815ws.LJIILLIIL("exit_secondary_survey", c2344009Gk.LIZ);
                                        previewSurveyViewModelS12.OQ2();
                                        previewSurveyViewModelS12.LLJJIJIL = 0L;
                                    }
                                }

                                @Override // X.InterfaceC483180IxA
                                public final void LIZIZ(Map<String, String> map2) {
                                    PreviewSurveyViewModel previewSurveyViewModelS1 = liveSurveyWidgetV2.S1();
                                    if (previewSurveyViewModelS1 != null) {
                                        previewSurveyViewModelS1.LLJJIJIL = SystemClock.elapsedRealtime();
                                        C2344009Gk c2344009Gk = new C2344009Gk();
                                        previewSurveyViewModelS1.GQ2(c2344009Gk);
                                        c2344009Gk.LJII(map2);
                                        c2344009Gk.LJIIIIZZ("survey_page", "secondary");
                                        C20684815ws.LJIILLIIL("secondary_survey_notify", c2344009Gk.LIZ);
                                    }
                                }
                            });
                            if (lightSurveyFeedbackSheetGS1 != null) {
                                lightSurveyFeedbackSheetGS1.OR(liveSurveyWidgetV2.context, liveSurveyWidgetV2.widgetCallback.getFragment().getParentFragmentManager(), null);
                            }
                            liveSurveyWidgetV2.LLJJJJJIL = lightSurveyFeedbackSheetGS1;
                            liveSurveyWidgetV2.LLJJJJLIIL = enumC484840Izq2;
                            PreviewSurveyViewModel previewSurveyViewModelS1 = liveSurveyWidgetV2.S1();
                            if (previewSurveyViewModelS1 != null) {
                                previewSurveyViewModelS1.NQ2(map);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                LiveSurveyWidgetV2 liveSurveyWidgetV22 = (LiveSurveyWidgetV2) aObserverS211S0100000_7.l0;
                EnumC484840Izq enumC484840Izq3 = liveSurveyWidgetV22.LLJJJJLIIL;
                EnumC484840Izq enumC484840Izq4 = EnumC484840Izq.ROUTE;
                if (enumC484840Izq3 == enumC484840Izq4) {
                    return;
                }
                Map<String, String> map2 = c483240IxG.LIZJ;
                liveSurveyWidgetV22.M1();
                LivePreviewBottomCardVM livePreviewBottomCardVMM1 = liveSurveyWidgetV22.M1();
                if (livePreviewBottomCardVMM1 == null || (nextLiveData2 = livePreviewBottomCardVMM1.LLILLJJLI) == null || !Intrinsics.LJFF(nextLiveData2.getValue(), Boolean.TRUE)) {
                    liveSurveyWidgetV22.M1();
                    FeedLiveViewHolderVM feedLiveViewHolderVMP15 = liveSurveyWidgetV22.P1();
                    if ((feedLiveViewHolderVMP15 == null || (mutableLiveData8 = feedLiveViewHolderVMP15.LLJZ) == null || !Intrinsics.LJFF(mutableLiveData8.getValue(), Boolean.TRUE)) && (((feedLiveViewHolderVMP13 = liveSurveyWidgetV22.P1()) == null || (mutableLiveData7 = feedLiveViewHolderVMP13.LLJLLIL) == null || (value4 = mutableLiveData7.getValue()) == null || value4.intValue() <= 0) && (((feedLiveViewHolderVMP14 = liveSurveyWidgetV22.P1()) == null || (mutableLiveData6 = feedLiveViewHolderVMP14.LLJLLL) == null || (value3 = mutableLiveData6.getValue()) == null || value3.intValue() <= 0) && (((livePreviewGuideEnterVM2 = (LivePreviewGuideEnterVM) liveSurveyWidgetV22.LLJJLIIIJLLLLLLLZ.getValue()) == null || (mutableLiveData5 = livePreviewGuideEnterVM2.LLILZIL) == null || !Intrinsics.LJFF(mutableLiveData5.getValue(), Boolean.TRUE)) && ((c1acaZ12 = liveSurveyWidgetV22.z1()) == null || !c1acaZ12.LJJJLZIJ))))) {
                        final Context context = liveSurveyWidgetV22.context;
                        ?? r5 = new AbstractC484810Izn(context, str, i2) { // from class: X.0Izy
                            public final C01GW LLILLL;

                            @Override // X.AbstractC484810Izn
                            public final void h0(int i3) {
                            }

                            private final TuxTextView getPromptText() {
                                return (TuxTextView) this.LLILLL.getValue();
                            }

                            @Override // X.AbstractC484810Izn
                            public final ViewGroup.LayoutParams i0() {
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                                marginLayoutParams.setMarginStart(C439101nJ.LIZ(12));
                                marginLayoutParams.setMarginEnd(C439101nJ.LIZ(12));
                                marginLayoutParams.bottomMargin = C439101nJ.LIZ(8);
                                return marginLayoutParams;
                            }

                            @Override // X.AbstractC484810Izn
                            public final void l0() {
                                SurveyData surveyData5;
                                C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLFII.getValue());
                                TuxTextView promptText = getPromptText();
                                PreviewSurveyViewModel surveyViewModel = getSurveyViewModel();
                                promptText.setText((surveyViewModel == null || (surveyData5 = surveyViewModel.LL) == null) ? null : surveyData5.toastText);
                                View.OnClickListener aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 252);
                                if (C1848410yCV.LIZ) {
                                    aCListenerS142S0100000_7 = new f(aCListenerS142S0100000_7);
                                }
                                a aVar = new a(aCListenerS142S0100000_7);
                                if (C2213981Bky.LIZIZ.isOffline()) {
                                    C2211941Bhg.LIZ.injectViewListener(this);
                                }
                                setOnClickListener(aVar);
                            }

                            @Override // X.AbstractC484810Izn
                            public final void e0() {
                                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, getUiHandler(), new ARunnableS107S0100000_7(this, 206));
                            }

                            {
                                super(context, str, i2);
                                ViewGroup.inflate(C1385040m98.LIZ(context, true), R.layout.dgg, this);
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1d, C1385040m98.LIZ(context, true));
                                if (numLIZJ != null) {
                                    gradientDrawable.setColor(numLIZJ.intValue());
                                }
                                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
                                setBackground(gradientDrawable);
                                this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 714));
                            }
                        };
                        liveSurveyWidgetV22.LLJJJJ = r5;
                        FrameLayout frameLayoutR1 = liveSurveyWidgetV22.R1();
                        PreviewSurveyViewModel previewSurveyViewModelS12 = liveSurveyWidgetV22.S1();
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(frameLayoutR1, null);
                        frameLayoutR1.removeAllViewsInLayout();
                        frameLayoutR1.addView((View) r5, r5.i0());
                        r5.LLILLJJLI = previewSurveyViewModelS12;
                        r5.l0();
                        r5.e0();
                        C484920Izy c484920Izy = liveSurveyWidgetV22.LLJJJJ;
                        if (c484920Izy != null) {
                            HandlerHook.viewPost(c484920Izy, new ARunnableS107S0100000_7(liveSurveyWidgetV22, 208));
                        }
                        C786410Ut5.LJZ(4, liveSurveyWidgetV22.R1());
                        PreviewSurveyViewModel previewSurveyViewModelS13 = liveSurveyWidgetV22.S1();
                        if (previewSurveyViewModelS13 != null) {
                            previewSurveyViewModelS13.MQ2(map2);
                        }
                        liveSurveyWidgetV22.LLJJJJLIIL = enumC484840Izq4;
                        return;
                    }
                }
                C1AC7 c1ac7 = C1AC7.LIZ;
                C1ACA c1acaZ13 = liveSurveyWidgetV22.z1();
                PreviewSurveyViewModel previewSurveyViewModelS14 = liveSurveyWidgetV22.S1();
                if (previewSurveyViewModelS14 != null && (surveyData4 = previewSurveyViewModelS14.LL) != null) {
                    str2 = surveyData4.surveyId;
                }
                c1ac7.getClass();
                C1AC7.LJIILLIIL(c1acaZ13, 12, str2, null, null);
                return;
            }
            LiveSurveyWidgetV2 liveSurveyWidgetV23 = (LiveSurveyWidgetV2) aObserverS211S0100000_7.l0;
            EnumC484840Izq enumC484840Izq5 = liveSurveyWidgetV23.LLJJJJLIIL;
            EnumC484840Izq enumC484840Izq6 = EnumC484840Izq.QUESTION;
            if (enumC484840Izq5 == enumC484840Izq6) {
                return;
            }
            Map<String, String> map3 = c483240IxG.LIZIZ;
            liveSurveyWidgetV23.M1();
            LivePreviewBottomCardVM livePreviewBottomCardVMM12 = liveSurveyWidgetV23.M1();
            if (livePreviewBottomCardVMM12 == null || (nextLiveData = livePreviewBottomCardVMM12.LLILLJJLI) == null || !Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) {
                liveSurveyWidgetV23.M1();
                FeedLiveViewHolderVM feedLiveViewHolderVMP16 = liveSurveyWidgetV23.P1();
                if ((feedLiveViewHolderVMP16 == null || (mutableLiveData4 = feedLiveViewHolderVMP16.LLJZ) == null || !Intrinsics.LJFF(mutableLiveData4.getValue(), Boolean.TRUE)) && (((feedLiveViewHolderVMP1 = liveSurveyWidgetV23.P1()) == null || (mutableLiveData3 = feedLiveViewHolderVMP1.LLJLLIL) == null || (value2 = mutableLiveData3.getValue()) == null || value2.intValue() <= 0) && (((feedLiveViewHolderVMP12 = liveSurveyWidgetV23.P1()) == null || (mutableLiveData2 = feedLiveViewHolderVMP12.LLJLLL) == null || (value = mutableLiveData2.getValue()) == null || value.intValue() <= 0) && (((livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) liveSurveyWidgetV23.LLJJLIIIJLLLLLLLZ.getValue()) == null || (mutableLiveData = livePreviewGuideEnterVM.LLILZIL) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) && ((c1acaZ1 = liveSurveyWidgetV23.z1()) == null || !c1acaZ1.LJJJLZIJ))))) {
                    PreviewSurveyViewModel previewSurveyViewModelS15 = liveSurveyWidgetV23.S1();
                    if (previewSurveyViewModelS15 != null && (surveyData2 = previewSurveyViewModelS15.LL) != null && surveyData2.isReverse) {
                        PreviewSurveyViewModel previewSurveyViewModelS16 = liveSurveyWidgetV23.S1();
                        if (previewSurveyViewModelS16 == null) {
                            return;
                        }
                        previewSurveyViewModelS16.yQ2(map3, false);
                        return;
                    }
                    PreviewSurveyViewModel previewSurveyViewModelS17 = liveSurveyWidgetV23.S1();
                    if (previewSurveyViewModelS17 == null || (surveyData = previewSurveyViewModelS17.LL) == null || (surveyShowMode = surveyData.showMode) == null || (numValueOf = Integer.valueOf(surveyShowMode.style)) == null || numValueOf.intValue() == 2) {
                        c484930Izz = new C484930Izz(liveSurveyWidgetV23.context);
                    } else if (numValueOf.intValue() == 4) {
                        c484930Izz = new C0J02(liveSurveyWidgetV23.context, null, 0);
                    } else if (numValueOf.intValue() == 6) {
                        c484930Izz = new C0J01(liveSurveyWidgetV23.context, null, 0);
                    } else {
                        c484930Izz = new C484930Izz(liveSurveyWidgetV23.context);
                    }
                    liveSurveyWidgetV23.LLJJJ = c484930Izz;
                    FrameLayout frameLayoutT1 = liveSurveyWidgetV23.T1();
                    PreviewSurveyViewModel previewSurveyViewModelS18 = liveSurveyWidgetV23.S1();
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(frameLayoutT1, null);
                    frameLayoutT1.removeAllViewsInLayout();
                    frameLayoutT1.addView(c484930Izz, c484930Izz.i0());
                    c484930Izz.LLILLJJLI = previewSurveyViewModelS18;
                    c484930Izz.l0();
                    c484930Izz.e0();
                    AbstractC484810Izn abstractC484810Izn = liveSurveyWidgetV23.LLJJJ;
                    if (abstractC484810Izn != null) {
                        HandlerHook.viewPost(abstractC484810Izn, new ARunnableS103S0100000_3(liveSurveyWidgetV23, 93));
                    }
                    C786410Ut5.LJZ(4, liveSurveyWidgetV23.T1());
                    LivePreviewBottomCardVM livePreviewBottomCardVMM13 = liveSurveyWidgetV23.M1();
                    if (livePreviewBottomCardVMM13 != null) {
                        livePreviewBottomCardVMM13.LLILZ = true;
                    }
                    PreviewSurveyViewModel previewSurveyViewModelS19 = liveSurveyWidgetV23.S1();
                    if (previewSurveyViewModelS19 != null && (c483250IxH = previewSurveyViewModelS19.LLJLIL) != null) {
                        c483250IxH.LIZLLL = true;
                    }
                    C1ACA c1acaZ14 = liveSurveyWidgetV23.z1();
                    if (c1acaZ14 != null) {
                        c1acaZ14.LJL = true;
                    }
                    PreviewSurveyViewModel previewSurveyViewModelS110 = liveSurveyWidgetV23.S1();
                    if (previewSurveyViewModelS110 != null) {
                        previewSurveyViewModelS110.yQ2(map3, true);
                    }
                    liveSurveyWidgetV23.LLJJJJLIIL = enumC484840Izq6;
                    return;
                }
            }
            C1AC7 c1ac72 = C1AC7.LIZ;
            C1ACA c1acaZ15 = liveSurveyWidgetV23.z1();
            PreviewSurveyViewModel previewSurveyViewModelS111 = liveSurveyWidgetV23.S1();
            if (previewSurveyViewModelS111 != null && (surveyData3 = previewSurveyViewModelS111.LL) != null) {
                str = surveyData3.surveyId;
            }
            c1ac72.getClass();
            C1AC7.LJIILLIIL(c1acaZ15, 11, str, null, null);
            return;
        }
        LiveSurveyWidgetV2.U1((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0, c483240IxG.LIZJ);
    }

    public static final void onChanged$2(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((Function0) aObserverS211S0100000_7.l0).invoke();
    }

    public static final void onChanged$20(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        Boolean bool = (Boolean) obj;
        C484860Izs c484860Izs = ((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0).LLJJIJI;
        if (c484860Izs != null) {
            c484860Izs.LJII(bool.booleanValue());
        }
    }

    public static final void onChanged$21(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        PreviewSurveyViewModel previewSurveyViewModelS1 = ((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0).S1();
        if (previewSurveyViewModelS1 != null) {
            previewSurveyViewModelS1.LLJLIL.LIZJ = true;
        }
        ((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0).O1("user_enter_room", "3");
    }

    public static final void onChanged$22(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        FrameLayout frameLayout;
        C484860Izs c484860Izs = ((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0).LLJJIJI;
        if (c484860Izs != null && (frameLayout = c484860Izs.LJIILLIIL) != null) {
            HandlerHook.viewPost(frameLayout, new ARunnableS10S0210000_7(frameLayout, c484860Izs, false, 1));
        }
    }

    public static final void onChanged$23(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0).O1("conflict_close", "4");
        }
    }

    public static final void onChanged$24(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0).O1("conflict_close", "4");
        }
    }

    public static final void onChanged$25(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0).O1("conflict_go_live_close", "4");
    }

    public static final void onChanged$26(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((LiveSurveyWidgetV2) aObserverS211S0100000_7.l0).O1("conflict_close", "4");
        }
    }

    public static final void onChanged$27(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        Pair pair = (Pair) obj;
        C20441214yg.LJIIIZ("LiveNearbyPageFragment", "nearbyDataObserver  1");
        if (!((LiveNearbyPageFragment) aObserverS211S0100000_7.l0).LLJJI) {
            if (pair != null) {
                int iIntValue = ((Number) pair.getFirst()).intValue();
                InterfaceC475140IkC.LIZ.getClass();
                if (iIntValue != 3) {
                    return;
                }
            }
            InterfaceC475150IkD interfaceC475150IkD = ((LiveNearbyPageFragment) aObserverS211S0100000_7.l0).LL;
            if (interfaceC475150IkD != null) {
                interfaceC475150IkD.rf();
            }
            if (((LiveNearbyPageFragment) aObserverS211S0100000_7.l0).LLILLL) {
                C20441214yg.LJIIIZ("LiveNearbyPageFragment", "nearbyDataObserver  2");
                ((LiveNearbyPageFragment) aObserverS211S0100000_7.l0).NR();
            }
        }
    }

    public static final void onChanged$28(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((Observer) aObserverS211S0100000_7.l0).onChanged(Boolean.valueOf(((List) obj).isEmpty()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x072d  */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r0v184, types: [com.bytedance.android.live.base.model.user.User] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.bytedance.android.live.base.model.user.User] */
    /* JADX WARN: Type inference failed for: r0v386 */
    /* JADX WARN: Type inference failed for: r0v387 */
    /* JADX WARN: Type inference failed for: r0v388 */
    /* JADX WARN: Type inference failed for: r0v389 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [webcast.api.pgc_sub.PGCOfferInfo] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$29(Y.AObserverS211S0100000_7 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 2426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS211S0100000_7.onChanged$29(Y.AObserverS211S0100000_7, java.lang.Object):void");
    }

    public static final void onChanged$3(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        int i;
        C470660Icy c470660Icy;
        int iLIZIZ;
        int i2;
        if (obj == EnumC470670Icz.SUCCESS) {
            BaseDrawerFeedLiveFragment baseDrawerFeedLiveFragment = (BaseDrawerFeedLiveFragment) aObserverS211S0100000_7.l0;
            TabFeedViewModel tabFeedViewModel = baseDrawerFeedLiveFragment.LLJILJIL;
            if (tabFeedViewModel != null && (i = tabFeedViewModel.LLJJJIL) > 0 && (c470660Icy = baseDrawerFeedLiveFragment.LLIZ) != null && c470660Icy.getItemCount() > i) {
                TabFeedViewModel tabFeedViewModel2 = ((BaseDrawerFeedLiveFragment) aObserverS211S0100000_7.l0).LLJILJIL;
                if (tabFeedViewModel2 != null) {
                    iLIZIZ = tabFeedViewModel2.LLJJJJ;
                } else {
                    iLIZIZ = 0;
                }
                if (iLIZIZ > ((int) C497740JfY.LIZIZ(3.0f))) {
                    iLIZIZ -= (int) C497740JfY.LIZIZ(3.0f);
                }
                BaseDrawerFeedLiveFragment baseDrawerFeedLiveFragment2 = (BaseDrawerFeedLiveFragment) aObserverS211S0100000_7.l0;
                GridLayoutManager gridLayoutManager = baseDrawerFeedLiveFragment2.LLIZLLLIL;
                if (gridLayoutManager != null) {
                    TabFeedViewModel tabFeedViewModel3 = baseDrawerFeedLiveFragment2.LLJILJIL;
                    if (tabFeedViewModel3 != null) {
                        i2 = tabFeedViewModel3.LLJJJIL;
                    } else {
                        i2 = 0;
                    }
                    gridLayoutManager.scrollToPositionWithOffset(i2, iLIZIZ);
                }
            }
            TabFeedViewModel tabFeedViewModel4 = ((BaseDrawerFeedLiveFragment) aObserverS211S0100000_7.l0).LLJILJIL;
            if (tabFeedViewModel4 != null) {
                tabFeedViewModel4.LLJJJJ = 0;
                tabFeedViewModel4.LLJJJIL = 0;
            }
        }
    }

    public static final void onChanged$30(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C20441214yg.LIZIZ("legolas_render", "interactionVM isFirstRendered");
            LiveHangoutFragment liveHangoutFragment = (LiveHangoutFragment) aObserverS211S0100000_7.l0;
            liveHangoutFragment.LLIZ = true;
            liveHangoutFragment.NR();
            ((LiveHangoutFragment) aObserverS211S0100000_7.l0).getClass();
        }
    }

    public static final void onChanged$31(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            C20441214yg.LIZIZ("legolas_render", "playFeedListVM isFirstRendered");
            ((LiveHangoutFragment) aObserverS211S0100000_7.l0).LLIZLLLIL = bool.booleanValue();
            ((LiveHangoutFragment) aObserverS211S0100000_7.l0).NR();
            ((LiveHangoutFragment) aObserverS211S0100000_7.l0).getClass();
        }
    }

    public static final void onChanged$32(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        Integer num = (Integer) obj;
        int i = 8;
        if (num != null && num.intValue() == 1) {
            Keva keva = C516990KPh.LIZ;
            boolean z = keva.getBoolean("SUB_ONLY_POSTS_NOTIFICATION_BANNER_VISIBLE", true);
            ConstraintLayout constraintLayout = ((SubOnlyVideoContentFragment) aObserverS211S0100000_7.l0).LLJJI;
            if (constraintLayout != null) {
                if (z) {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, constraintLayout);
            }
            SubOnlyVideoContentFragment subOnlyVideoContentFragment = (SubOnlyVideoContentFragment) aObserverS211S0100000_7.l0;
            subOnlyVideoContentFragment.getClass();
            if (z) {
                keva.storeBoolean("SUB_ONLY_POSTS_NOTIFICATION_BANNER_VISIBLE", false);
                TuxTextView tuxTextView = subOnlyVideoContentFragment.LLJJIJI;
                if (tuxTextView != null) {
                    C786410Ut5.h9(tuxTextView, new ACListenerS142S0100000_7(subOnlyVideoContentFragment, 165));
                }
                TuxIconView tuxIconView = subOnlyVideoContentFragment.LLJJIII;
                if (tuxIconView != null) {
                    C786410Ut5.a9(tuxIconView, new ACListenerS142S0100000_7(subOnlyVideoContentFragment, 166));
                    return;
                }
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = ((SubOnlyVideoContentFragment) aObserverS211S0100000_7.l0).LLJJI;
        if (constraintLayout2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, constraintLayout2);
    }

    public static final void onChanged$33(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        MutableLiveData<C582610Mt9> mutableLiveData;
        VideoStateViewModel videoStateViewModel = ((LiveBusinessComponent) aObserverS211S0100000_7.l0).LL;
        if (videoStateViewModel != null && (mutableLiveData = videoStateViewModel.LLILZIL) != null) {
            mutableLiveData.removeObserver(aObserverS211S0100000_7);
        }
        LiveBusinessComponent liveBusinessComponent = (LiveBusinessComponent) aObserverS211S0100000_7.l0;
        liveBusinessComponent.getClass();
        long millis = TimeUnit.SECONDS.toMillis(LiveSkylightColdStartOptSetting.getGlobalFetchDelayTime());
        if (millis <= 0) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJI();
        } else {
            C786410Ut5.LJLIIL(millis, (Handler) liveBusinessComponent.LLILLJJLI.getValue(), new ARunnableS107S0100000_7(liveBusinessComponent, 248));
        }
    }

    public static final void onChanged$34(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((MultiGuestOperationCell) aObserverS211S0100000_7.l0).LJJI(true);
    }

    public static final void onChanged$35(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        BaseListResponse baseListResponse;
        FeedExtra feedExtra;
        FeedBannerContainer feedBannerContainer;
        List<FeedBanner> list;
        List<T> list2;
        Pair pair = (Pair) obj;
        if (pair != null) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            InterfaceC475140IkC.LIZ.getClass();
            if (iIntValue == 3) {
                BaseListResponse baseListResponse2 = (BaseListResponse) pair.getSecond();
                if ((baseListResponse2 != null && (list2 = baseListResponse2.data) != 0 && (!list2.isEmpty())) || ((baseListResponse = (BaseListResponse) pair.getSecond()) != null && (feedExtra = (FeedExtra) baseListResponse.extra) != null && (feedBannerContainer = feedExtra.bannerContainer) != null && (list = feedBannerContainer.bannerList) != null && C500260Jjc.LJJIJIIJI(list))) {
                    AbstractC476820Imu abstractC476820Imu = (AbstractC476820Imu) aObserverS211S0100000_7.l0;
                    C20441214yg.LJIIIZ("SkylightContainer", "registerNearbyListener on data change");
                    abstractC476820Imu.LJII(true);
                }
            }
        }
    }

    public static final void onChanged$36(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C482930Iwl) aObserverS211S0100000_7.l0).LJ();
            ((C482930Iwl) aObserverS211S0100000_7.l0).LIZJ();
        }
    }

    public static final void onChanged$37(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        List<SurveyQuestion> list;
        SurveyData surveyData = (SurveyData) obj;
        if (surveyData != null && (list = surveyData.questionList) != null) {
            boolean z = false;
            if (list.size() > 0) {
                C482930Iwl c482930Iwl = (C482930Iwl) aObserverS211S0100000_7.l0;
                C483100Ix2 c483100Ix2 = new C483100Ix2(c482930Iwl.getContext());
                c483100Ix2.setSurveyViewModel(c482930Iwl.LLILZLL);
                c483100Ix2.t(surveyData);
                C786410Ut5.LJJJLL(c482930Iwl.getSurveyContentContainer());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 1;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c483100Ix2);
                c483100Ix2.setLayoutParams(layoutParams);
                c482930Iwl.getSurveyContentContainer().addView(c483100Ix2, layoutParams);
                c482930Iwl.setSurveyEnable(true);
                if (LivePreviewFullScreenSurveyUIFix.fix()) {
                    c482930Iwl.LLJJIII = C14KS.LIZLLL();
                    c482930Iwl.LLJJI = C14KS.LJFF();
                    if (C497740JfY.LJJI((int) c482930Iwl.LLJJIII) <= 640.0f) {
                        z = true;
                    }
                    c482930Iwl.LLJLLIL = z;
                }
                c482930Iwl.LIZIZ(c483100Ix2);
                c483100Ix2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC521670Kd3(c483100Ix2, c482930Iwl, 1));
            }
        }
    }

    public static final void onChanged$38(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((AbstractC471420IeC) aObserverS211S0100000_7.l0).LLLI((C1A6I) obj);
    }

    public static final void onChanged$39(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        AbstractC471420IeC abstractC471420IeC = (AbstractC471420IeC) aObserverS211S0100000_7.l0;
        C470770Id9 c470770Id9 = (C470770Id9) obj;
        abstractC471420IeC.getClass();
        if (c470770Id9 != null) {
            abstractC471420IeC.LLLLIIIILLL(c470770Id9.LIZ);
        }
    }

    public static final void onChanged$4(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        InterfaceC471600IeU interfaceC471600IeUKj2;
        InterfaceC471600IeU interfaceC471600IeUKj22;
        C470770Id9 c470770Id9 = (C470770Id9) obj;
        if (!((GameDrawerBottomFeedFragment) aObserverS211S0100000_7.l0).LLJJJ) {
            int i = 1;
            if (!c470770Id9.LIZ()) {
                EnumC470780IdA enumC470780IdA = c470770Id9.LIZ;
                if (enumC470780IdA == EnumC470780IdA.SUCCESS) {
                    ((GameDrawerBottomFeedFragment) aObserverS211S0100000_7.l0).LLJJJ = true;
                    i = 3;
                } else if (enumC470780IdA == EnumC470780IdA.FAILED) {
                    ACListenerS142S0100000_7 aCListenerS142S0100000_7 = new ACListenerS142S0100000_7((GameDrawerBottomFeedFragment) aObserverS211S0100000_7.l0, 58);
                    IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
                    if (iGameService != null && (interfaceC471600IeUKj22 = iGameService.Kj2()) != null) {
                        interfaceC471600IeUKj22.X7(aCListenerS142S0100000_7, EnumC477960Iok.BOTTOM);
                    }
                    i = 2;
                } else {
                    i = 0;
                }
            }
            IGameService iGameService2 = (IGameService) C1161920gLG.LIZJ(IGameService.class);
            if (iGameService2 != null && (interfaceC471600IeUKj2 = iGameService2.Kj2()) != null) {
                interfaceC471600IeUKj2.F1(i, EnumC477960Iok.BOTTOM);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$40(Y.AObserverS211S0100000_7 r2, java.lang.Object r3) {
        /*
            java.lang.Object r2 = r2.l0
            X.0IeC r2 = (X.AbstractC471420IeC) r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L20
            r2.getClass()
            boolean r0 = r3.booleanValue()
            if (r0 != 0) goto L20
            r1 = 1
        L12:
            boolean r0 = r2.LLJILJIL
            if (r0 == r1) goto L22
            boolean r0 = r2.LLJILJILJ
            if (r0 != 0) goto L22
            r2.LLJILJIL = r1
            r2.notifyDataSetChanged()
            return
        L20:
            r1 = 0
            goto L12
        L22:
            r2.LLJILJIL = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS211S0100000_7.onChanged$40(Y.AObserverS211S0100000_7, java.lang.Object):void");
    }

    public static final void onChanged$41(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        boolean zBooleanValue;
        AbstractC471420IeC abstractC471420IeC = (AbstractC471420IeC) aObserverS211S0100000_7.l0;
        Boolean bool = (Boolean) obj;
        abstractC471420IeC.getClass();
        if (bool != null && abstractC471420IeC.LLJILJILJ != (zBooleanValue = bool.booleanValue())) {
            abstractC471420IeC.LLJILJILJ = zBooleanValue;
            abstractC471420IeC.notifyDataSetChanged();
        }
    }

    public static final void onChanged$42(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        AbstractC471420IeC abstractC471420IeC = (AbstractC471420IeC) aObserverS211S0100000_7.l0;
        Integer num = (Integer) obj;
        abstractC471420IeC.getClass();
        if (num != null && num.intValue() >= 0 && num.intValue() < abstractC471420IeC.getItemCount()) {
            abstractC471420IeC.notifyItemChanged(num.intValue());
        }
    }

    public static final void onChanged$43(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C470770Id9 c470770Id9 = (C470770Id9) obj;
        if (c470770Id9 != null) {
            AbstractC471420IeC abstractC471420IeC = (AbstractC471420IeC) aObserverS211S0100000_7.l0;
            abstractC471420IeC.LLJI = c470770Id9.LIZ;
            abstractC471420IeC.LLLLIIIILLL(abstractC471420IeC.LLJ);
        }
    }

    public static final void onChanged$44(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C471410IeB c471410IeB = (C471410IeB) aObserverS211S0100000_7.l0;
        Integer num = (Integer) obj;
        if (num != null) {
            RecyclerView recyclerView = c471410IeB.LIZIZ;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(num.intValue());
                return;
            }
            return;
        }
        c471410IeB.getClass();
    }

    public static final void onChanged$45(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C471410IeB c471410IeB = (C471410IeB) aObserverS211S0100000_7.l0;
        c471410IeB.getClass();
        if (obj == EnumC470670Icz.START) {
            c471410IeB.LIZ.LLJJJJ.set(true);
        }
        if (obj == EnumC470670Icz.SUCCESS) {
            c471410IeB.LIZ.getClass();
            c471410IeB.LIZIZ.scrollToPosition(0);
        }
    }

    public static final void onChanged$46(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((NormalOperationCell) aObserverS211S0100000_7.l0).LJIJJLI(false);
    }

    public static final void onChanged$47(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        FeedRepository feedRepository = (FeedRepository) aObserverS211S0100000_7.l0;
        C470770Id9 c470770Id9 = (C470770Id9) obj;
        feedRepository.getClass();
        if (c470770Id9 != null && c470770Id9.LIZ == EnumC470780IdA.SUCCESS) {
            feedRepository.LLJI.onNext(C0J1R.LIZJ);
        }
    }

    public static final void onChanged$48(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((PagingViewModel) aObserverS211S0100000_7.l0).LL.postValue(obj);
    }

    public static final void onChanged$49(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((PagingViewModel) aObserverS211S0100000_7.l0).LLILLJJLI.postValue(obj);
    }

    public static final void onChanged$5(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((LiveNewGiftDialog) aObserverS211S0100000_7.l0).NR((PrivilegeCenterConfig) obj, true);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void onChanged$50(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((PagingViewModel) aObserverS211S0100000_7.l0).LLILZLL.postValue((C1A6I<T>) obj);
    }

    public static final void onChanged$51(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((PagingViewModel) aObserverS211S0100000_7.l0).LLILLL.postValue(obj);
    }

    public static final void onChanged$52(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((PagingViewModel) aObserverS211S0100000_7.l0).LLILZ.postValue(obj);
    }

    public static final void onChanged$53(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((PagingViewModel) aObserverS211S0100000_7.l0).LLILZIL.setValue(obj);
    }

    public static final void onChanged$54(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((C1124290fMZ) aObserverS211S0100000_7.l0).LJJJJLI((PrivilegeCenterConfig) obj, true);
    }

    public static final void onChanged$55(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((Boolean) obj).booleanValue();
        ((C1124290fMZ) aObserverS211S0100000_7.l0).LJJJJJ();
        C0UX6 c0ux6 = C0UX6.LIVE_GENERAL_SETTINGS_MATURETHEMES;
    }

    public static final void onChanged$56(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((MutableLiveData) aObserverS211S0100000_7.l0).postValue(obj);
    }

    public static final void onChanged$57(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C470770Id9 c470770Id9 = (C470770Id9) obj;
        if (c470770Id9 != null) {
            if (c470770Id9.LIZ()) {
                C786410Ut5.LJLLLLLL(0, ((C470950IdR) aObserverS211S0100000_7.l0).LLILLJJLI);
            } else {
                C786410Ut5.LJLLLLLL(8, ((C470950IdR) aObserverS211S0100000_7.l0).LLILLJJLI);
            }
        }
    }

    public static final void onChanged$58(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = (DrawerFeedLiveFragmentV2) aObserverS211S0100000_7.l0;
        drawerFeedLiveFragmentV2.getClass();
        if (obj == EnumC470670Icz.SUCCESS) {
            drawerFeedLiveFragmentV2.LLJJIII = SystemClock.elapsedRealtime() / 1000;
            TabFeedViewModel tabFeedViewModel = drawerFeedLiveFragmentV2.LLIZ;
            if (tabFeedViewModel != null && tabFeedViewModel.LLJJJIL > 0) {
                int itemCount = drawerFeedLiveFragmentV2.LLILZ.getItemCount();
                TabFeedViewModel tabFeedViewModel2 = drawerFeedLiveFragmentV2.LLIZ;
                if (itemCount > tabFeedViewModel2.LLJJJIL) {
                    int iLIZIZ = tabFeedViewModel2.LLJJJJ;
                    if (iLIZIZ > ((int) C497740JfY.LIZIZ(3.0f))) {
                        iLIZIZ -= (int) C497740JfY.LIZIZ(3.0f);
                    }
                    drawerFeedLiveFragmentV2.LLILZIL.scrollToPositionWithOffset(drawerFeedLiveFragmentV2.LLIZ.LLJJJIL, iLIZIZ);
                }
            }
            TabFeedViewModel tabFeedViewModel3 = drawerFeedLiveFragmentV2.LLIZ;
            tabFeedViewModel3.LLJJJJ = 0;
            tabFeedViewModel3.LLJJJIL = 0;
        }
    }

    public static final void onChanged$59(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        boolean zLJIIJ = C513840KDe.LJIIJ((C0KDZ) obj);
        Dialog dialog = ((SubPackagePageDialog) aObserverS211S0100000_7.l0).getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(!zLJIIJ);
        }
    }

    public static final void onChanged$6(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((Boolean) obj).booleanValue();
        C0UX6 c0ux6 = C0UX6.LIVE_GENERAL_SETTINGS_MATURETHEMES;
    }

    public static final void onChanged$60(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C786410Ut5.LJJZZIII((Handler) ((SubPackageMultiMonthFragment) aObserverS211S0100000_7.l0).LLILZ.getValue(), new ARunnableS76S0200000_7((SubPackageMultiMonthFragment) aObserverS211S0100000_7.l0, (C0KDT) obj, 55));
    }

    public static final void onChanged$61(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        boolean zLIZ;
        String strLIZ;
        List<? extends C0KQD> list;
        RefundInfo refundInfo;
        PGCTipsInfo pGCTipsInfo;
        PGCTemplateListData pGCTemplateListData;
        C0KCK c0kck;
        PGCTemplateListData pGCTemplateListData2;
        C0KCK c0kck2;
        PGCTemplateListData pGCTemplateListData3;
        PGCRefundInfo pGCRefundInfo;
        C0KCK c0kck3;
        String str;
        Long lLJIIL;
        C0KCK c0kck4;
        C0KCK c0kck5;
        List<PGCSubscriptionProductDetailWithTemplateInfo> list2;
        OfferInfo offerInfoLJII;
        C0KCI c0kci = (C0KCI) obj;
        boolean z = false;
        PGCSubsTransitionPeriodInfo pGCSubsTransitionPeriodInfo = null;
        if (c0kci != null && (list2 = c0kci.LIZ) != null) {
            SubPackageMultiMonthFragment subPackageMultiMonthFragment = (SubPackageMultiMonthFragment) aObserverS211S0100000_7.l0;
            zLIZ = C513840KDe.LIZ(list2);
            C513830KDd c513830KDd = subPackageMultiMonthFragment.LLJJIJI;
            if (c513830KDd != null) {
                boolean z2 = subPackageMultiMonthFragment.LLJJIJIL;
                c513830KDd.LLILZIL = list2;
                c513830KDd.LLILLL = z2;
                c513830KDd.notifyDataSetChanged();
            }
            subPackageMultiMonthFragment.LLJJJJ = System.currentTimeMillis();
            if (zLIZ && (offerInfoLJII = C513840KDe.LJII(list2)) != null) {
                strLIZ = C513870KDh.LIZ(offerInfoLJII, null);
            } else {
                strLIZ = null;
            }
        } else {
            zLIZ = false;
            strLIZ = null;
        }
        SubPackageMultiMonthFragment subPackageMultiMonthFragment2 = (SubPackageMultiMonthFragment) aObserverS211S0100000_7.l0;
        if (c0kci != null && (((c0kck4 = c0kci.LIZJ) != null && c0kck4.LIZJ == 3) || ((c0kck5 = c0kci.LIZJ) != null && c0kck5.LIZJ == 1))) {
            z = true;
        }
        subPackageMultiMonthFragment2.LLIZLLLIL = z;
        if (z && C0K7G.LJIIIZ()) {
            Map<String, String> map = ((SubPackageMultiMonthFragment) aObserverS211S0100000_7.l0).LLILZLL;
            if (map != null && (str = map.get("room_id")) != null && (lLJIIL = C0K51.LJIIL(str)) != null) {
                lLJIIL.longValue();
            }
            SubPackageMultiMonthFragment subPackageMultiMonthFragment3 = (SubPackageMultiMonthFragment) aObserverS211S0100000_7.l0;
            PackagePageViewModel packagePageViewModel = subPackageMultiMonthFragment3.LLILLL;
            if (packagePageViewModel != null) {
                String str2 = subPackageMultiMonthFragment3.LLILZIL.LIZ;
                packagePageViewModel.getClass();
                packagePageViewModel.LLIZLLLIL.setValue(str2);
            }
        }
        SubPackageMultiMonthFragment subPackageMultiMonthFragment4 = (SubPackageMultiMonthFragment) aObserverS211S0100000_7.l0;
        if (c0kci != null && (c0kck3 = c0kci.LIZJ) != null) {
            list = c0kck3.LJFF;
        } else {
            list = null;
        }
        subPackageMultiMonthFragment4.LLJL = list;
        PackagePageViewModel packagePageViewModel2 = subPackageMultiMonthFragment4.LLILLL;
        if (packagePageViewModel2 != null) {
            Boolean boolValueOf = Boolean.valueOf(subPackageMultiMonthFragment4.LLIZLLLIL);
            Boolean boolValueOf2 = Boolean.valueOf(zLIZ);
            if (c0kci != null && (c0kck2 = c0kci.LIZJ) != null && (pGCTemplateListData3 = c0kck2.LIZ) != null && (pGCRefundInfo = pGCTemplateListData3.refundInfo) != null) {
                refundInfo = new RefundInfo();
                refundInfo.showExtensionRefundInstructions = pGCRefundInfo.showExtensionRefundInstructions;
                refundInfo.eligibleForExtensionRefund = pGCRefundInfo.eligibleForExtensionRefund;
            } else {
                refundInfo = null;
            }
            if (c0kci != null && (c0kck = c0kci.LIZJ) != null && (pGCTemplateListData2 = c0kck.LIZ) != null) {
                pGCTipsInfo = pGCTemplateListData2.pgcTipsInfo;
            } else {
                pGCTipsInfo = null;
                if (c0kci != null) {
                }
                PackagePageViewModel.wQ2(packagePageViewModel2, null, boolValueOf, null, strLIZ, boolValueOf2, refundInfo, null, null, null, pGCTipsInfo, pGCSubsTransitionPeriodInfo, 928);
            }
            C0KCK c0kck6 = c0kci.LIZJ;
            if (c0kck6 != null && (pGCTemplateListData = c0kck6.LIZ) != null) {
                pGCSubsTransitionPeriodInfo = pGCTemplateListData.transitionPeriodInfo;
            }
            PackagePageViewModel.wQ2(packagePageViewModel2, null, boolValueOf, null, strLIZ, boolValueOf2, refundInfo, null, null, null, pGCTipsInfo, pGCSubsTransitionPeriodInfo, 928);
        }
    }

    public static final void onChanged$62(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C786410Ut5.LJJZZIII((Handler) ((SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0).LLILZ.getValue(), new ARunnableS76S0200000_7((C0KDG) obj, (SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0, 56));
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$63(Y.AObserverS211S0100000_7 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS211S0100000_7.onChanged$63(Y.AObserverS211S0100000_7, java.lang.Object):void");
    }

    public static final void onChanged$64(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        boolean z;
        List<? extends C0KQD> list;
        boolean zLIZ;
        String strLIZ;
        MutableLiveData<C0KDG> mutableLiveData;
        PGCTemplateListData pGCTemplateListData;
        PGCRefundInfo pGCRefundInfo;
        C0KCK c0kck;
        PGCTemplateListData pGCTemplateListData2;
        PGCRefundInfo pGCRefundInfo2;
        C0KCK c0kck2;
        PGCTemplateListData pGCTemplateListData3;
        PGCRefundInfo pGCRefundInfo3;
        PGCTemplateListData pGCTemplateListData4;
        PGCRefundInfo pGCRefundInfo4;
        OfferInfo offerInfoLJII;
        Integer num;
        boolean z2;
        PGCSubscriptionProductDetailWithTemplateInfo next;
        int i;
        int i2;
        String strLJ;
        String str;
        String str2;
        Integer num2;
        String strLJIIIIZZ;
        C0KCJ c0kcj = (C0KCJ) obj;
        C0KCK c0kck3 = c0kcj.LIZJ;
        if (c0kck3 != null && (num2 = c0kck3.LJI) != null) {
            SubUpdowngradePackageFragment subUpdowngradePackageFragment = (SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0;
            int iIntValue = num2.intValue();
            if (iIntValue != 0) {
                ViewGroup viewGroup = subUpdowngradePackageFragment.LLJILLL;
                if (viewGroup != null) {
                    C0K0R.LIZ(viewGroup);
                }
                TextView textView = subUpdowngradePackageFragment.LLJJIJI;
                if (textView != null) {
                    C0K0R.LIZJ(textView);
                    if (iIntValue != 1) {
                        if (iIntValue != 2) {
                            strLJIIIIZZ = "";
                        } else {
                            strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131839325, 48);
                        }
                    } else {
                        strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131839326, 24);
                    }
                    textView.setText(strLJIIIIZZ);
                }
            }
        }
        C0KCK c0kck4 = c0kcj.LIZJ;
        if (c0kck4 != null && (c0kck4.LIZJ == 3 || c0kck4.LIZJ == 1)) {
            z = true;
        } else {
            z = false;
        }
        SubUpdowngradePackageFragment subUpdowngradePackageFragment2 = (SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0;
        RefundInfo refundInfo = null;
        if (c0kck4 != null) {
            list = c0kck4.LJFF;
        } else {
            list = null;
        }
        subUpdowngradePackageFragment2.LLJLILLLLZIIL = list;
        List<PGCSubscriptionProductDetailWithTemplateInfo> list2 = c0kcj.LIZ;
        if (list2 != null) {
            Iterator<PGCSubscriptionProductDetailWithTemplateInfo> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    TemplateInfo templateInfo = next.getTemplateInfo();
                    if (templateInfo != null) {
                        str2 = templateInfo.packageId;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, subUpdowngradePackageFragment2.LLILZIL.LJJI)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = next;
            if (pGCSubscriptionProductDetailWithTemplateInfo != null) {
                C0KDH c0kdhMR = subUpdowngradePackageFragment2.MR(subUpdowngradePackageFragment2.LLILZIL.LJJI);
                if (c0kdhMR != null) {
                    i = c0kdhMR.LIZIZ;
                    i2 = c0kdhMR.LIZJ;
                } else {
                    i = 0;
                    i2 = 0;
                }
                TextView textView2 = subUpdowngradePackageFragment2.LLJJ;
                if (textView2 != null) {
                    if (c0kdhMR != null) {
                        str = c0kdhMR.LIZ;
                    } else {
                        str = null;
                    }
                    textView2.setText(str);
                }
                TextView textView3 = subUpdowngradePackageFragment2.LLJJI;
                if (textView3 != null) {
                    textView3.setText(C0KDL.LIZ(C513840KDe.LJIILJJIL(pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()), C513840KDe.LJFF(pGCSubscriptionProductDetailWithTemplateInfo, false)));
                }
                TextView textView4 = subUpdowngradePackageFragment2.LLJJIII;
                if (textView4 != null) {
                    if (i2 > 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C511520K4g.LJ(2131755461, i2, Integer.valueOf(i2)));
                        sbLIZ.append(" · ");
                        sbLIZ.append(C511520K4g.LJ(2131755460, i, Integer.valueOf(i)));
                        strLJ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strLJ = C511520K4g.LJ(2131755460, i, Integer.valueOf(i));
                    }
                    textView4.setText(strLJ);
                }
            }
        }
        List<PGCSubscriptionProductDetailWithTemplateInfo> list3 = c0kcj.LIZ;
        if (list3 != null) {
            SubUpdowngradePackageFragment subUpdowngradePackageFragment3 = (SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0;
            C19719612Di.LJJIIJ(list3, new AwS586S0100000_7(subUpdowngradePackageFragment3, 463), false);
            zLIZ = C513840KDe.LIZ(list3);
            C0KDI c0kdi = subUpdowngradePackageFragment3.LLJJLIIIJLLLLLLLZ;
            if (c0kdi != null) {
                C0KCK c0kck5 = c0kcj.LIZJ;
                if (c0kck5 != null) {
                    num = c0kck5.LJI;
                } else {
                    num = null;
                }
                C01GW c01gw = C0K51.LIZ;
                if (num != null && num.intValue() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c0kdi.LLILZIL = c0kcj;
                c0kdi.LLILLL = z2;
                c0kdi.notifyDataSetChanged();
            }
            if (zLIZ && (offerInfoLJII = C513840KDe.LJII(list3)) != null) {
                strLIZ = C513870KDh.LIZ(offerInfoLJII, null);
            } else {
                strLIZ = null;
            }
        } else {
            zLIZ = false;
            strLIZ = null;
        }
        SubUpdowngradePackageFragment subUpdowngradePackageFragment4 = (SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0;
        TextView textView5 = subUpdowngradePackageFragment4.LLJJIJIIJIL;
        if (textView5 != null && (c0kck2 = c0kcj.LIZJ) != null && (pGCTemplateListData3 = c0kck2.LIZ) != null && (pGCRefundInfo3 = pGCTemplateListData3.refundInfo) != null && pGCRefundInfo3.eligibleForExtensionRefund && (pGCTemplateListData4 = c0kck2.LIZ) != null && (pGCRefundInfo4 = pGCTemplateListData4.refundInfo) != null && pGCRefundInfo4.showExtensionRefundInstructions) {
            C0K0R.LIZJ(textView5);
            textView5.setText(C511520K4g.LJII(2131839330));
        }
        ViewGroup viewGroup2 = subUpdowngradePackageFragment4.LLJJIJIL;
        if (viewGroup2 != null && (c0kck = c0kcj.LIZJ) != null && (pGCTemplateListData2 = c0kck.LIZ) != null && (pGCRefundInfo2 = pGCTemplateListData2.refundInfo) != null && pGCRefundInfo2.showExtensionRefundInstructions) {
            C0K0R.LIZJ(viewGroup2);
        }
        UpDowngradePackageViewModel upDowngradePackageViewModel = ((SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0).LLILLL;
        if (upDowngradePackageViewModel != null) {
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(zLIZ);
            C0KCK c0kck6 = c0kcj.LIZJ;
            if (c0kck6 != null && (pGCTemplateListData = c0kck6.LIZ) != null && (pGCRefundInfo = pGCTemplateListData.refundInfo) != null) {
                refundInfo = new RefundInfo();
                refundInfo.showExtensionRefundInstructions = pGCRefundInfo.showExtensionRefundInstructions;
                refundInfo.eligibleForExtensionRefund = pGCRefundInfo.eligibleForExtensionRefund;
            }
            upDowngradePackageViewModel.vQ2(boolValueOf, null, strLIZ, boolValueOf2, refundInfo, null);
        }
        SubUpdowngradePackageFragment subUpdowngradePackageFragment5 = (SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0;
        UpDowngradePackageViewModel upDowngradePackageViewModel2 = subUpdowngradePackageFragment5.LLILLL;
        if (upDowngradePackageViewModel2 != null && (mutableLiveData = upDowngradePackageViewModel2.LLJIJIL) != null) {
            mutableLiveData.observe(subUpdowngradePackageFragment5.getViewLifecycleOwner(), new AObserverS211S0100000_7((SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0, 62));
        }
    }

    public static final void onChanged$65(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        SubInfo subInfo = ((PgcSubscribeUserInfoResponse) obj).subscribing.subInfo;
        PackagePageViewModel packagePageViewModel = ((SubPackageMultiMonthFragment) aObserverS211S0100000_7.l0).LLILLL;
        if (packagePageViewModel != null) {
            PackagePageViewModel.wQ2(packagePageViewModel, subInfo, null, null, null, null, null, null, null, null, null, null, 4064);
        }
    }

    public static final void onChanged$66(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        int i;
        TemplateInfo templateInfo;
        TemplateInfo templateInfo2;
        String str;
        TemplateInfo templateInfo3;
        Integer numValueOf;
        TemplateInfo templateInfo4;
        TemplateInfo templateInfo5;
        TagInfo tagInfo;
        List<String> list;
        OfferInfo offerInfo;
        String strLJIIIIZZ;
        TemplateInfo templateInfo6;
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = (PGCSubscriptionProductDetailWithTemplateInfo) obj;
        String strLJIIIIZZ2 = C513840KDe.LJIIIIZZ(pGCSubscriptionProductDetailWithTemplateInfo);
        if (pGCSubscriptionProductDetailWithTemplateInfo != null && (templateInfo6 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null) {
            i = templateInfo6.renewalPeriod;
        } else {
            i = 0;
        }
        PGCTemplateInfo pGCTemplateInfoLIZ = null;
        if (pGCSubscriptionProductDetailWithTemplateInfo != null) {
            templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
        } else {
            templateInfo = null;
        }
        boolean zLJIILJJIL = C513840KDe.LJIILJJIL(templateInfo);
        TextView textView = ((SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0).LLJJJ;
        String strLIZ = "";
        if (textView != null) {
            if (i == 1) {
                strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131839321, strLJIIIIZZ2);
            } else if (i <= 1) {
                strLJIIIIZZ = "";
            } else {
                strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131839322, Integer.valueOf(i), strLJIIIIZZ2);
            }
            textView.setText(strLJIIIIZZ);
        }
        UpDowngradePackageViewModel upDowngradePackageViewModel = ((SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0).LLILLL;
        if (upDowngradePackageViewModel != null) {
            Boolean boolValueOf = Boolean.valueOf(zLJIILJJIL);
            if (pGCSubscriptionProductDetailWithTemplateInfo != null && (templateInfo5 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && (tagInfo = templateInfo5.tagInfo) != null && (list = tagInfo.promotionTermDesc) != null) {
                if (list.size() > 0) {
                    TemplateInfo templateInfo7 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo7 != null && (offerInfo = templateInfo7.offerInfo) != null) {
                        strLIZ = C513870KDh.LIZ(offerInfo, pGCSubscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail());
                    } else {
                        strLIZ = (String) ListProtector.get(list, 0);
                    }
                }
            } else {
                strLIZ = null;
            }
            if (pGCSubscriptionProductDetailWithTemplateInfo != null && (templateInfo4 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null) {
                numValueOf = Integer.valueOf(templateInfo4.renewalPeriod);
            } else {
                numValueOf = null;
            }
            upDowngradePackageViewModel.vQ2(null, boolValueOf, strLIZ, null, null, numValueOf);
        }
        C0KDQ c0kdq = C0KDQ.LIZ;
        Map<String, String> map = ((SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0).LLILZLL;
        if (pGCSubscriptionProductDetailWithTemplateInfo != null) {
            templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
        } else {
            templateInfo2 = null;
        }
        SubUpdowngradePackageFragment subUpdowngradePackageFragment = (SubUpdowngradePackageFragment) aObserverS211S0100000_7.l0;
        if (pGCSubscriptionProductDetailWithTemplateInfo != null && (templateInfo3 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null) {
            str = templateInfo3.packageId;
        } else {
            str = null;
        }
        C0KDH c0kdhMR = subUpdowngradePackageFragment.MR(str);
        c0kdq.getClass();
        C511970K5z c511970K5z = new C511970K5z("livesdk_sub_package_switch_click");
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZJ(map);
        if (templateInfo2 != null) {
            pGCTemplateInfoLIZ = C0KLX.LIZ(templateInfo2);
        }
        C513910KDl.LJ(c511970K5z, pGCTemplateInfoLIZ);
        C513910KDl.LJFF(c511970K5z, c0kdhMR);
        c511970K5z.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$67(Y.AObserverS211S0100000_7 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS211S0100000_7.onChanged$67(Y.AObserverS211S0100000_7, java.lang.Object):void");
    }

    public static final void onChanged$68(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        Integer numValueOf;
        C0KCJ value;
        String str;
        LiveData<C0KCI> liveData;
        C0KCI value2;
        C0KCK c0kck;
        PGCTemplateInfo pGCTemplateInfo;
        String state;
        C0KCJ c0kcj = (C0KCJ) obj;
        if (((SubPackagePageDialog) aObserverS211S0100000_7.l0).isViewValid() && c0kcj.LJFF && c0kcj.LJ) {
            SubPackagePageDialog subPackagePageDialog = (SubPackagePageDialog) aObserverS211S0100000_7.l0;
            Map<String, String> map = subPackagePageDialog.LLJJI;
            if (map != null) {
                map.put("show_entrance", subPackagePageDialog.LLIZLLLIL.LJII);
                map.put("package_quantity", String.valueOf(c0kcj.LIZ.size()));
                map.put("anchor_id", subPackagePageDialog.LLIZLLLIL.LIZIZ);
                String str2 = subPackagePageDialog.LLIZLLLIL.LJIIJ;
                if (str2 == null) {
                    str2 = "";
                }
                map.put("group_id", str2);
                if (subPackagePageDialog.LLIZLLLIL.LJIILIIL.length() == 0) {
                    state = C0KBJ.NOT_SUBSCRIBE.getState();
                } else {
                    state = subPackagePageDialog.LLIZLLLIL.LJIILIIL;
                }
                map.put("subscribe_state", state);
            }
            C0KC9 c0kc9 = C0KC9.LIZ;
            C0KCP c0kcp = c0kcj.LIZIZ;
            if (c0kcp != null) {
                numValueOf = Integer.valueOf(c0kcp.LIZIZ);
            } else {
                numValueOf = null;
            }
            int size = c0kcj.LIZ.size();
            C0KC5 c0kc5 = ((SubPackagePageDialog) aObserverS211S0100000_7.l0).LLILZLL;
            C0KCK c0kck2 = c0kcj.LIZJ;
            c0kc9.getClass();
            C0KC9.LJFF(numValueOf, size, c0kc5, c0kck2);
            if (C513450KBr.LIZIZ(((SubPackagePageDialog) aObserverS211S0100000_7.l0).LLILZLL.LIZJ)) {
                SubPackagePageDialog subPackagePageDialog2 = (SubPackagePageDialog) aObserverS211S0100000_7.l0;
                PackagePageViewModel packagePageViewModel = subPackagePageDialog2.LLILLJJLI;
                if (packagePageViewModel != null && (liveData = packagePageViewModel.LLILZIL) != null && (value2 = liveData.getValue()) != null && (c0kck = value2.LIZJ) != null && (pGCTemplateInfo = c0kck.LIZLLL) != null) {
                    str = pGCTemplateInfo.iapId;
                } else {
                    str = null;
                }
                subPackagePageDialog2.LL = str;
                SubPackagePageDialog subPackagePageDialog3 = (SubPackagePageDialog) aObserverS211S0100000_7.l0;
                subPackagePageDialog3.OR(C0KC9.LIZJ(subPackagePageDialog3.LLIZLLLIL, null), false);
                return;
            }
            if (C513450KBr.LIZJ(((SubPackagePageDialog) aObserverS211S0100000_7.l0).LLILZLL.LIZJ)) {
                SubPackagePageDialog subPackagePageDialog4 = (SubPackagePageDialog) aObserverS211S0100000_7.l0;
                subPackagePageDialog4.UR(subPackagePageDialog4.LLILZLL.LIZJ);
                ((SubPackagePageDialog) aObserverS211S0100000_7.l0).MR();
                return;
            }
            if (c0kcj.LIZ.size() > 0) {
                SubPackagePageDialog subPackagePageDialog5 = (SubPackagePageDialog) aObserverS211S0100000_7.l0;
                subPackagePageDialog5.getClass();
                C0KCC c0kcc = subPackagePageDialog5.LLIZLLLIL;
                UpDowngradePackageViewModel upDowngradePackageViewModel = subPackagePageDialog5.LLILLL;
                boolean z = subPackagePageDialog5.LLJ;
                Map<String, String> map2 = subPackagePageDialog5.LLJJI;
                AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(subPackagePageDialog5, 740);
                SubUpdowngradePackageFragment subUpdowngradePackageFragment = new SubUpdowngradePackageFragment();
                subUpdowngradePackageFragment.LLILZIL = c0kcc;
                subUpdowngradePackageFragment.LLILLL = upDowngradePackageViewModel;
                subUpdowngradePackageFragment.LLILLJJLI = awS551S0100000_7;
                subUpdowngradePackageFragment.LLIZ = z;
                subUpdowngradePackageFragment.LLILZLL = map2;
                subPackagePageDialog5.SR(subUpdowngradePackageFragment);
                subPackagePageDialog5.PR();
                return;
            }
            ((SubPackagePageDialog) aObserverS211S0100000_7.l0).RR(c0kcj.LIZIZ);
            UpDowngradePackageViewModel upDowngradePackageViewModel2 = ((SubPackagePageDialog) aObserverS211S0100000_7.l0).LLILLL;
            if (upDowngradePackageViewModel2 == null || (value = upDowngradePackageViewModel2.LLILZLL.getValue()) == null) {
                return;
            }
            value.LJFF = false;
            value.LJ = false;
        }
    }

    public static final void onChanged$69(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        Integer numValueOf;
        C0KCI c0kci = (C0KCI) obj;
        if (((SubPackagePageDialog) aObserverS211S0100000_7.l0).isViewValid()) {
            C0KC9 c0kc9 = C0KC9.LIZ;
            C0KCP c0kcp = c0kci.LIZIZ;
            if (c0kcp != null) {
                numValueOf = Integer.valueOf(c0kcp.LIZIZ);
            } else {
                numValueOf = null;
            }
            int size = c0kci.LIZ.size();
            C0KC5 c0kc5 = ((SubPackagePageDialog) aObserverS211S0100000_7.l0).LLILZLL;
            C0KCK c0kck = c0kci.LIZJ;
            c0kc9.getClass();
            C0KC9.LJFF(numValueOf, size, c0kc5, c0kck);
            if (C513450KBr.LIZIZ(((SubPackagePageDialog) aObserverS211S0100000_7.l0).LLILZLL.LIZJ)) {
                SubPackagePageDialog subPackagePageDialog = (SubPackagePageDialog) aObserverS211S0100000_7.l0;
                subPackagePageDialog.WR(subPackagePageDialog.LLILZLL.LIZJ);
            } else {
                if (!C513450KBr.LIZJ(((SubPackagePageDialog) aObserverS211S0100000_7.l0).LLILZLL.LIZJ)) {
                    return;
                }
                SubPackagePageDialog subPackagePageDialog2 = (SubPackagePageDialog) aObserverS211S0100000_7.l0;
                subPackagePageDialog2.UR(subPackagePageDialog2.LLILZLL.LIZJ);
                ((SubPackagePageDialog) aObserverS211S0100000_7.l0).MR();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$7(Y.AObserverS211S0100000_7 r3, java.lang.Object r4) {
        /*
            java.lang.Object r0 = r3.l0
            com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveNewGiftDialog r0 = (com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveNewGiftDialog) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r4 = r0.dataChannel
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r0.LLILLL
            android.view.View r0 = r0.LLJJ
            if (r0 == 0) goto L1b
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            r2 = 1
            if (r0 != r2) goto L1b
        L13:
            java.lang.String r1 = "show"
            java.lang.String r0 = "gift_panel"
            X.C498240JgM.LJFF(r1, r0, r4, r3, r2)
            return
        L1b:
            r2 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS211S0100000_7.onChanged$7(Y.AObserverS211S0100000_7, java.lang.Object):void");
    }

    public static final void onChanged$70(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        boolean zLJIIJ = C513840KDe.LJIIJ((C0KDZ) obj);
        Dialog dialog = ((SubPackagePageDialog) aObserverS211S0100000_7.l0).getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(!zLJIIJ);
        }
    }

    public static final void onChanged$71(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C479450Ir9 c479450Ir9;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            ((LiveHangoutFragmentV2) aObserverS211S0100000_7.l0).LLJILJIL = bool.booleanValue();
            if (MultiHangoutLiveCardTraceSuccessOptSetting.isEnable()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
                if (c479440Ir8 != null && (c479450Ir9 = c479440Ir8.LIZIZ) != null) {
                    c479450Ir9.LIZJ(jCurrentTimeMillis);
                }
            }
            if (((LiveHangoutFragmentV2) aObserverS211S0100000_7.l0).LLILLJJLI) {
                ((LiveHangoutFragmentV2) aObserverS211S0100000_7.l0).getClass();
                C479670IrV.LIZJ("V2 observe isFirstRendered");
            }
            ((LiveHangoutFragmentV2) aObserverS211S0100000_7.l0).Ah(EnumC475180IkG.HANGOUT_LOADED_END);
        }
    }

    public static final void onChanged$72(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C479440Ir8 c479440Ir8;
        C479450Ir9 c479450Ir9;
        if (((Boolean) obj).booleanValue()) {
            ((LiveHangoutFragmentV2) aObserverS211S0100000_7.l0).LLJILJIL = true;
            if (MultiHangoutLiveCardTraceSuccessOptSetting.isEnable()) {
                AssemVMLazy assemVMLazy = ((LiveHangoutFragmentV2) aObserverS211S0100000_7.l0).LLIZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveHangoutFragmentV2.LLJJIJIL;
                if ((!((C478820Iq8) assemVMLazy.getValue().getState()).LL.isEmpty()) && (c479440Ir8 = C478750Iq1.LIZ) != null && (c479450Ir9 = c479440Ir8.LIZIZ) != null) {
                    c479450Ir9.LIZJ(System.currentTimeMillis());
                }
            }
            if (((LiveHangoutFragmentV2) aObserverS211S0100000_7.l0).LLILLJJLI) {
                ((LiveHangoutFragmentV2) aObserverS211S0100000_7.l0).getClass();
                C479670IrV.LIZJ("V2 observe roomFeedVM isFirstRendered");
            }
            ((LiveHangoutFragmentV2) aObserverS211S0100000_7.l0).Ah(EnumC475180IkG.HANGOUT_LOADED_END);
        }
    }

    public static final void onChanged$73(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((PrivilegeDetailViewModel) aObserverS211S0100000_7.l0).CQ2();
    }

    public static final void onChanged$74(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((PrivilegeDetailViewModel) aObserverS211S0100000_7.l0).CQ2();
    }

    public static final void onChanged$75(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((SubscriptionPrivilegeDetailFragment) aObserverS211S0100000_7.l0).LLJILLL = true;
    }

    public static final void onChanged$76(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        List<C510480K0g> value;
        List list = (List) obj;
        if (list != null) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) aObserverS211S0100000_7.l0;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((C510480K0g) it2.next()).LJ = subscriptionPrivilegeDetailFragment;
            }
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = (SubscriptionPrivilegeDetailFragment) aObserverS211S0100000_7.l0;
            Parcelable parcelable = (Parcelable) ((LinkedHashMap) subscriptionPrivilegeDetailFragment2.LLLLJI).get(subscriptionPrivilegeDetailFragment2.LLLFFI);
            ((C339550DSv) ((SubscriptionPrivilegeDetailFragment) aObserverS211S0100000_7.l0).LLLLLLLLLL.getValue()).LLLI(list, AFwS229S0000000_2.get$arr$(839));
            PrivilegeDetailViewModel privilegeDetailViewModelZS = ((SubscriptionPrivilegeDetailFragment) aObserverS211S0100000_7.l0).zS();
            int iIntValue = -1;
            RecyclerView recyclerView = null;
            if (privilegeDetailViewModelZS != null && (value = privilegeDetailViewModelZS.LLJJIJI.getValue()) != null) {
                Iterator<C510480K0g> it3 = value.iterator();
                int i = 0;
                while (true) {
                    if (it3.hasNext()) {
                        if (it3.next() instanceof C510460K0e) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
            }
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = (SubscriptionPrivilegeDetailFragment) aObserverS211S0100000_7.l0;
            if (subscriptionPrivilegeDetailFragment3.LLLLL && iIntValue >= 0) {
                subscriptionPrivilegeDetailFragment3.LLLLL = false;
                RecyclerView recyclerView2 = subscriptionPrivilegeDetailFragment3.LLLLLLL;
                if (recyclerView2 != null) {
                    recyclerView = recyclerView2;
                }
                HandlerHook.viewPost(recyclerView, new ARunnableS18S0101000_7(iIntValue, subscriptionPrivilegeDetailFragment3, 6));
                return;
            }
            if (parcelable != null) {
                RecyclerView recyclerView3 = subscriptionPrivilegeDetailFragment3.LLLLLLL;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                    layoutManager.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0251 A[PHI: r4
      0x0251: PHI (r4v1 android.view.View) = (r4v0 android.view.View), (r4v3 android.view.View) binds: [B:115:0x023b, B:120:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a3 A[PHI: r1
      0x02a3: PHI (r1v4 android.view.View) = (r1v3 android.view.View), (r1v7 android.view.View) binds: [B:136:0x028d, B:141:0x02a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5 A[PHI: r0
      0x01c5: PHI (r0v47 android.view.View) = (r0v46 android.view.View), (r0v67 android.view.View) binds: [B:80:0x01b2, B:85:0x01c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v27, types: [T, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$77(Y.AObserverS211S0100000_7 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS211S0100000_7.onChanged$77(Y.AObserverS211S0100000_7, java.lang.Object):void");
    }

    public static final void onChanged$78(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        C197039127h c197039127h;
        String str = (String) obj;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = (SubscriptionPrivilegeDetailFragment) aObserverS211S0100000_7.l0;
        if (str == null) {
            str = "";
        }
        subscriptionPrivilegeDetailFragment.LLLFFI = str;
        if (subscriptionPrivilegeDetailFragment.LLILZ == EnumC510710K1d.POPUP) {
            c197039127h = subscriptionPrivilegeDetailFragment.LLJJJJLIIL;
        } else {
            c197039127h = subscriptionPrivilegeDetailFragment.LLJJLIIIJLLLLLLLZ;
        }
        if (c197039127h != null) {
            c197039127h.setText(subscriptionPrivilegeDetailFragment.ZR());
        }
        subscriptionPrivilegeDetailFragment.nS();
    }

    public static final void onChanged$79(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((SubscriptionPrivilegeDetailFragment) aObserverS211S0100000_7.l0).LLJZIJLIL = true;
    }

    public static final void onChanged$80(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ((SubscriptionPrivilegeDetailFragment) aObserverS211S0100000_7.l0).LLL = true;
    }

    public static final void onChanged$81(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        Integer num = (Integer) obj;
        if (num != null) {
            ShopMallMixFragment shopMallMixFragment = (ShopMallMixFragment) aObserverS211S0100000_7.l0;
            int iIntValue = num.intValue();
            if (iIntValue <= 0) {
                boolean z = C14LC.LJIIIZ;
                C309690CBz.LIZ.getClass();
                iIntValue = C14LC.LIZIZ();
            }
            View viewFindViewById = shopMallMixFragment.LLJ;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view = shopMallMixFragment.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.nua);
                } else {
                    viewFindViewById = null;
                }
                shopMallMixFragment.LLJ = (FrameLayout) viewFindViewById;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            } else {
                i = 0;
            }
            if (i != iIntValue) {
                View view2 = shopMallMixFragment.LLJ;
                if (view2 == null) {
                    View view3 = shopMallMixFragment.getView();
                    if (view3 != null) {
                        viewFindViewById2 = view3.findViewById(R.id.nua);
                    }
                    shopMallMixFragment.LLJ = (FrameLayout) viewFindViewById2;
                    view2 = viewFindViewById2;
                }
                C426750GoL.LJIIIZ(view2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(iIntValue), false, 16);
            }
        }
    }

    public static final void onChanged$82(AObserverS211S0100000_7 aObserverS211S0100000_7, Object obj) {
        LiveTab liveTab = (LiveTab) obj;
        if (!Intrinsics.LJFF(liveTab.name, ((C763970Txz) aObserverS211S0100000_7.l0).LIZJ)) {
            ((C763970Txz) aObserverS211S0100000_7.l0).LIZLLL(liveTab.name);
        }
    }

    public AObserverS211S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public AObserverS211S0100000_7(C482930Iwl c482930Iwl, int i, int i2) {
        this.$t = i2;
        this.l0 = c482930Iwl;
    }
}
