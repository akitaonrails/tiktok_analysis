package Y;

import X.AbstractC1082660eHQ;
import X.AbstractC1100450ek7;
import X.AbstractC1109720ez4;
import X.AbstractC1110800f0o;
import X.AbstractC1126590fQH;
import X.AbstractC1126600fQI;
import X.AbstractC1136060ffY;
import X.AnonymousClass0054;
import X.AnonymousClass0151;
import X.AnonymousClass0956;
import X.C011V;
import X.C01TT;
import X.C0IJT;
import X.C0IPN;
import X.C0PEM;
import X.C1082760eHa;
import X.C1086600eNm;
import X.C1091400eVW;
import X.C1094580eae;
import X.C1097050eed;
import X.C1097140eem;
import X.C1102510enR;
import X.C1103970epn;
import X.C1109240eyI;
import X.C1109600eys;
import X.C1109610eyt;
import X.C1115960f98;
import X.C1116130f9P;
import X.C1116140f9Q;
import X.C1116150f9R;
import X.C1116190f9V;
import X.C1116200f9W;
import X.C1116210f9X;
import X.C1116220f9Y;
import X.C1116230f9Z;
import X.C1116240f9a;
import X.C1116420f9s;
import X.C1121600fIE;
import X.C1123290fKx;
import X.C1123440fLC;
import X.C1124290fMZ;
import X.C1124340fMe;
import X.C1124350fMf;
import X.C1124730fNH;
import X.C1125820fP2;
import X.C1125860fP6;
import X.C1127050fR1;
import X.C1128680fTe;
import X.C1128710fTh;
import X.C1128760fTm;
import X.C1128800fTq;
import X.C1130100fVw;
import X.C1130790fX3;
import X.C1131140fXc;
import X.C1131340fXw;
import X.C1132880faQ;
import X.C1143780fs0;
import X.C1149560g1K;
import X.C1150090g2B;
import X.C1150110g2D;
import X.C1151190g3x;
import X.C1151400g4I;
import X.C1151410g4J;
import X.C1161920gLG;
import X.C1320700kTM;
import X.C1322000kVS;
import X.C1324720kZq;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C158B;
import X.C16F5;
import X.C16FS;
import X.C197039127h;
import X.C1ACA;
import X.C1AF0;
import X.C201100q1;
import X.C201600q6;
import X.C201700q7;
import X.C20441214yg;
import X.C2105908Mv;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2757014x;
import X.C434980H3w;
import X.C466200IPy;
import X.C473410IhP;
import X.C474500IjA;
import X.C495520Jby;
import X.C497740JfY;
import X.C500260Jjc;
import X.C779300Uhc;
import X.C781520UlC;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1086920eOI;
import X.EnumC1116160f9S;
import X.EnumC1116180f9U;
import X.EnumC1129500fUy;
import X.EnumC1130940fXI;
import X.EnumC325470CpN;
import X.EnumC766540U5c;
import X.InterfaceC1078490eAh;
import X.InterfaceC1085190eLV;
import X.InterfaceC1090080eTO;
import X.InterfaceC1111870f2X;
import X.InterfaceC1112060f2q;
import X.InterfaceC1113900f5o;
import X.InterfaceC1131100fXY;
import X.InterfaceC1791930wjP;
import X.InterfaceC1816020xMG;
import X.RunnableC781530UlD;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import Y.AAListenerS328S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.GameStarCommentLayoutLandDataChannel;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.live.publicscreen.impl.giftHistory.GiftHistoryWidgetHelper;
import com.bytedance.android.live.slot.ECAuctionBottomRightActingAreaSlotWidget;
import com.bytedance.android.livesdk.GiftPanelSortState;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.api.revenue.starcomment.StarCommentDataChannel;
import com.bytedance.android.livesdk.billboard.audience.LiveAudienceBillboardWidget;
import com.bytedance.android.livesdk.billboard.ui.page.BasicPageVH;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.ProgrammedPinMsgVisibility;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelectPollVoteEvent;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.LiveNewGiftDialog;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPageIndicatorWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.OffsetGridLayoutManager;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftRemoteTrayDisplayWidget;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.legal.LegalAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerViewModel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.util.PanelUIUtil;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.LiveNormalPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.GiftSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.NormalSelectPollWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceAndExtendScreenLoadOptEnable;
import com.bytedance.android.livesdk.livesetting.effect.LiveBeautyPanelAlphaOptSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveQuickReturnOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewPerfOptSetting;
import com.bytedance.android.livesdk.marketing.ui.LiveMarketingWidget;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.revenue.StarCommentHideEvent;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV3;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubStickerJoinDialog;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.feed.adapter.widget.billboard.LivePreviewBillboardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.pcsdecoration.PcsLivePreviewAudienceDecorationWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import tikcast.api.fans.GetNonFansUserDataResponse;
import webcast.data.FansClubBanner;
import webcast.data.host_board.DisplayPosition;

/* JADX INFO: loaded from: classes18.dex */
public class AObserverS221S0100000_17 implements Observer {
    public final int $t;
    public Object l0;

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
        }
    }

    public AObserverS221S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C1103970epn c1103970epn = (C1103970epn) aObserverS221S0100000_17.l0;
        int i = c1103970epn.LLILZ;
        if (iIntValue == i && !c1103970epn.LLILZIL) {
            c1103970epn.LLILZIL = true;
            AnonymousClass0151 anonymousClass0151 = c1103970epn.LLILLL;
            if (anonymousClass0151 != null) {
                anonymousClass0151.onShow();
                return;
            }
            return;
        }
        if (iIntValue == i || !c1103970epn.LLILZIL) {
            return;
        }
        c1103970epn.LLILZIL = false;
        AnonymousClass0151 anonymousClass01512 = c1103970epn.LLILLL;
        if (anonymousClass01512 == null) {
            return;
        }
        anonymousClass01512.onHide();
    }

    public static final void onChanged$1(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AnonymousClass0151 anonymousClass0151 = ((C1103970epn) aObserverS221S0100000_17.l0).LLILLL;
        if (anonymousClass0151 != null) {
            anonymousClass0151.LIZIZ(zBooleanValue);
        }
    }

    public static final void onChanged$10(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        String str;
        IHostResource iHostResource;
        Object parent;
        C1128710fTh c1128710fTh;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        MutableLiveData<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        AbstractC1126600fQI abstractC1126600fQI;
        C1127050fR1 c1127050fR1;
        long jLongValue;
        C1124350fMf c1124350fMf = (C1124350fMf) obj;
        if (!c1124350fMf.LIZIZ) {
            c1124350fMf.LIZIZ = true;
            final C1124290fMZ c1124290fMZ = (C1124290fMZ) aObserverS221S0100000_17.l0;
            C1124340fMe c1124340fMe = c1124350fMf.LIZ;
            c1124290fMZ.getClass();
            if (c1124340fMe.LJ) {
                Long l = c1124340fMe.LJFF;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                c1124290fMZ.LLJLILLLLZIIL = jLongValue;
                c1124290fMZ.LJJLI();
                c1124290fMZ.LJJLIIIJ();
            }
            final int i = c1124340fMe.LIZIZ;
            c1124290fMZ.LJJLIIIJ();
            if (c1124340fMe.LIZLLL && i > 0) {
                RecyclerView.LayoutManager layoutManager = null;
                if (c1124340fMe.LJI) {
                    C1091400eVW.LJ(c1124290fMZ.LLJJIJI, c1124290fMZ.LLJJIJIIJIL, c1124290fMZ.LLJJIJIL, null, i);
                    C1091400eVW.LIZLLL(c1124290fMZ.LLJJL);
                    C1091400eVW.LIZIZ(c1124340fMe.LIZIZ, c1124340fMe.LJII, "gift_panel", true);
                } else {
                    C1324720kZq c1324720kZq = c1124290fMZ.LLJJIII;
                    if (c1324720kZq != null) {
                        C786410Ut5.LLJJIII(c1324720kZq, 0);
                        ConstraintLayout constraintLayout = c1124290fMZ.LLLFZ;
                        if (constraintLayout != null && (parent = constraintLayout.getParent()) != null) {
                            View view = (View) parent;
                            c1124290fMZ.LLL = view.getTranslationZ();
                            view.setTranslationZ(10.0f);
                        }
                        C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(c1324720kZq.getContext());
                        String strLIZ = C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1");
                        if (TextUtils.isEmpty(strLIZ) || TextUtils.isEmpty("ttlive_recharge_anim.webp") || TextUtils.isEmpty(strLIZ) || TextUtils.isEmpty("ttlive_recharge_anim.webp") || (iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) == null || (str = (String) ListProtector.get(iHostResource.mN(strLIZ, "ttlive_recharge_anim.webp"), 0)) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            File fileLJII = C1143780fs0.LJII(C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_recharge_anim.webp");
                            if (fileLJII != null) {
                                c1322000kVSLJFF.LJ = Uri.fromFile(fileLJII);
                            }
                        } else {
                            c1322000kVSLJFF.LIZLLL(str);
                        }
                        C20441214yg.LJIIIZ("Recharge Anim Debug", "First Anim Loaded");
                        c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_CROP);
                        c1322000kVSLJFF.LJIIJ = true;
                        c1322000kVSLJFF.LIZLLL = new C1320700kTM<Object>() { // from class: X.0fMd
                            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                            public final void LJ(String str2, Object obj2, final Animatable animatable) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Final Image Set ");
                                sbLIZ.append(str2);
                                C20441214yg.LJIIIZ("Recharge Anim Debug", C2188811AlT.LIZIZ(sbLIZ));
                                if (animatable instanceof AnimatedDrawable2) {
                                    final C1124290fMZ c1124290fMZ2 = c1124290fMZ;
                                    final int i2 = i;
                                    ((AnimatedDrawable2) animatable).LJII(new C0I9J() { // from class: X.0fMc
                                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                                        public final void LIZ(AnimatedDrawable2 animatedDrawable2) {
                                            C20441214yg.LJIIIZ("Recharge Anim Debug", "Animation Started");
                                        }

                                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                                        public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
                                            C1124290fMZ c1124290fMZ3 = c1124290fMZ2;
                                            int i3 = i2;
                                            c1124290fMZ3.getClass();
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append('+');
                                            sbLIZ2.append(i3);
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                            TextView textView = c1124290fMZ3.LLJJJ;
                                            if (textView != null) {
                                                textView.setText(strLIZIZ);
                                            }
                                            TextView textView2 = c1124290fMZ3.LLJJJ;
                                            if (textView2 != null) {
                                                C786410Ut5.LLIL(textView2, 0);
                                            }
                                            ObjectAnimator duration = ObjectAnimator.ofFloat(c1124290fMZ3.LLJJJ, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(400L);
                                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(c1124290fMZ3.LLJJJ, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(350L);
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.play(duration);
                                            animatorSet.play(duration2).after(700L);
                                            ObjectAnimator duration3 = ObjectAnimator.ofFloat(c1124290fMZ3.LLJJJ, (Property<TextView, Float>) View.TRANSLATION_Y, 0.0f, -35.0f).setDuration(300L);
                                            ObjectAnimator duration4 = ObjectAnimator.ofFloat(c1124290fMZ3.LLJJJ, (Property<TextView, Float>) View.TRANSLATION_Y, -35.0f, -40.0f).setDuration(700L);
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            animatorSet2.play(duration3);
                                            animatorSet2.play(duration4).after(300L);
                                            AnimatorSet animatorSet3 = new AnimatorSet();
                                            animatorSet3.playTogether(animatorSet, animatorSet2);
                                            animatorSet3.addListener(new AAListenerS328S0100000_17(c1124290fMZ3, 23));
                                            animatorSet3.start();
                                            ((AnimatedDrawable2) animatable).LJII(null);
                                            C20441214yg.LJIIIZ("Recharge Anim Debug", "Animation Ended");
                                        }
                                    });
                                }
                            }
                        };
                        c1322000kVSLJFF.LIZJ(c1324720kZq);
                    }
                    C1091400eVW.LIZIZ(i, c1124340fMe.LJII, "gift_panel", false);
                }
                AbstractC1100450ek7 abstractC1100450ek7 = c1124290fMZ.LLIZLLLIL;
                if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null) {
                    C1130100fVw.LIZ.LJ = true;
                    RunnableC781530UlD runnableC781530UlD = c1128710fTh.LLJJIII;
                    if (runnableC781530UlD != null) {
                        layoutManager = runnableC781530UlD.getLayoutManager();
                    }
                    if (!(layoutManager instanceof OffsetGridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) > (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
                        return;
                    }
                    while (true) {
                        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = c1128710fTh.LJJLIIIIJ();
                        if (giftPanelLeafViewModelLJJLIIIIJ != null && (mutableLiveData = giftPanelLeafViewModelLJJLIIIIJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null && (abstractC1126600fQI = (AbstractC1126600fQI) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, value)) != null && abstractC1126600fQI.LIZJ && (c1127050fR1 = c1128710fTh.LLJJIJI) != null) {
                            c1127050fR1.LLLJIL(c1128710fTh.LLJJIII, iFindFirstVisibleItemPosition);
                        }
                        if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                            iFindFirstVisibleItemPosition++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public static final void onChanged$11(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Integer num = (Integer) obj;
        try {
            int size = ((LiveGiftRemoteTrayDisplayWidget) aObserverS221S0100000_17.l0).LLILLJJLI.size();
            if (num != null && num.intValue() == size) {
                ((LiveGiftRemoteTrayDisplayWidget) aObserverS221S0100000_17.l0).B1();
                ((LiveGiftRemoteTrayDisplayWidget) aObserverS221S0100000_17.l0).y1();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public static final void onChanged$12(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        if (obj instanceof C1151400g4I) {
            RechargeBannerViewModel rechargeBannerViewModelIp = ((RechargeBannerAssem) aObserverS221S0100000_17.l0).ip();
            rechargeBannerViewModelIp.LLILLJJLI = 0;
            rechargeBannerViewModelIp.manualListRefresh();
        } else {
            RechargeBannerViewModel rechargeBannerViewModelIp2 = ((RechargeBannerAssem) aObserverS221S0100000_17.l0).ip();
            rechargeBannerViewModelIp2.LLILLJJLI = 1;
            rechargeBannerViewModelIp2.manualListRefresh();
        }
    }

    public static final void onChanged$13(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        EnumC1086920eOI enumC1086920eOI;
        ICommentService iCommentService;
        long id;
        Room room;
        PollInfo pollInfo;
        UserVoteInfo userVoteInfo;
        VoteResponseData voteResponseData = (VoteResponseData) obj;
        if (((AbsSelectPollWidget) aObserverS221S0100000_17.l0).isShowing()) {
            long id2 = 0;
            if (LiveQuickReturnOptSetting.isEnabled()) {
                Room room2 = ((AbsSelectPollWidget) aObserverS221S0100000_17.l0).LLJILLL;
                if (room2 != null) {
                    id = room2.getId();
                } else {
                    id = 0;
                }
                BaseResponse<Room, EnterRoomExtra> baseResponseLIZIZ = C466200IPy.LIZIZ(id, false);
                if (baseResponseLIZIZ != null && (room = baseResponseLIZIZ.data) != null && (pollInfo = room.advancedPollInfo) != null && (userVoteInfo = pollInfo.userVoteInfo) != null) {
                    userVoteInfo.hasVoted = true;
                }
            }
            if (!voteResponseData.commentBanned) {
                SelectPollViewModel selectPollViewModel = ((AbsSelectPollWidget) aObserverS221S0100000_17.l0).LLJILJIL;
                if (selectPollViewModel != null) {
                    enumC1086920eOI = selectPollViewModel.LLILLJJLI;
                } else {
                    enumC1086920eOI = null;
                }
                if (enumC1086920eOI == EnumC1086920eOI.NORMAL && (iCommentService = (ICommentService) C1161920gLG.LIZJ(ICommentService.class)) != null) {
                    Room room3 = (Room) ((AbsSelectPollWidget) aObserverS221S0100000_17.l0).dataChannel.gg0(RoomChannel.class);
                    if (room3 != null) {
                        id2 = room3.getId();
                    }
                    AbsSelectPollWidget absSelectPollWidget = (AbsSelectPollWidget) aObserverS221S0100000_17.l0;
                    String str = absSelectPollWidget.LLILLL;
                    ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.POLL;
                    sender.getLogArgs().put("poll_id", String.valueOf(absSelectPollWidget.LLILZIL));
                    sender.getLogArgs().put("poll_selection", absSelectPollWidget.LLILLL);
                    iCommentService.vF2(id2, str, null, 3, sender);
                }
            }
            boolean zIsEmpty = voteResponseData.optionList.isEmpty();
            AbsSelectPollWidget absSelectPollWidget2 = (AbsSelectPollWidget) aObserverS221S0100000_17.l0;
            DataChannel dataChannel = absSelectPollWidget2.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(SelectPollVoteEvent.class, new C1086600eNm(absSelectPollWidget2.LLJILJILJ, absSelectPollWidget2.LLILZ, zIsEmpty, voteResponseData.optionList));
            }
            C786410Ut5.LJLIIL(300L, C473410IhP.LIZ(), new ARunnableS117S0100000_17((AbsSelectPollWidget) aObserverS221S0100000_17.l0, 103));
        }
    }

    public static final void onChanged$14(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        ((AbsSelectPollWidget) aObserverS221S0100000_17.l0).G1((Throwable) obj);
    }

    public static final void onChanged$15(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Long l = (Long) obj;
        ((AbsSelectPollWidget) aObserverS221S0100000_17.l0).LLJILJILJ = l.longValue();
        long jLongValue = l.longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (jLongValue <= 0) {
            AbsSelectPollWidget absSelectPollWidget = (AbsSelectPollWidget) aObserverS221S0100000_17.l0;
            absSelectPollWidget.LLJILJILJ = 0L;
            absSelectPollWidget.hide();
            return;
        }
        try {
            TextView textView = (TextView) ((AbsSelectPollWidget) aObserverS221S0100000_17.l0).LLIZLLLIL.getValue();
            if (textView == null) {
                return;
            }
            textView.setText(C497740JfY.LJIIL(2131755587, (int) jLongValue, String.valueOf(jLongValue)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void onChanged$16(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        GiftSelectPollWidget giftSelectPollWidget;
        Room room;
        PollMessage pollMessage = (PollMessage) obj;
        Integer num = pollMessage.pollKind;
        int iOrdinal = EnumC1086920eOI.GIFT.ordinal();
        if (num != null && num.intValue() == iOrdinal && (room = (giftSelectPollWidget = (GiftSelectPollWidget) aObserverS221S0100000_17.l0).LLJILLL) != null && room.giftPollVoteEnabled) {
            giftSelectPollWidget.H1(pollMessage);
        }
    }

    public static final void onChanged$17(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        LiveNormalPollViewModel liveNormalPollViewModel;
        long j;
        PollMessage pollMessage = (PollMessage) obj;
        Integer num = pollMessage.pollKind;
        int iOrdinal = EnumC1086920eOI.NORMAL.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            ((NormalSelectPollWidget) aObserverS221S0100000_17.l0).H1(pollMessage);
            NormalSelectPollWidget normalSelectPollWidget = (NormalSelectPollWidget) aObserverS221S0100000_17.l0;
            if ((!normalSelectPollWidget.LLIZ) && pollMessage.messageType == 2 && !normalSelectPollWidget.isShowing() && (liveNormalPollViewModel = ((NormalSelectPollWidget) aObserverS221S0100000_17.l0).LLJJ) != null && liveNormalPollViewModel.AQ2()) {
                PollStartContent pollStartContent = pollMessage.startContent;
                if (pollStartContent != null) {
                    j = pollStartContent.endTime;
                } else {
                    j = 0;
                }
                if (j >= C158B.LIZ()) {
                    NormalSelectPollWidget normalSelectPollWidget2 = (NormalSelectPollWidget) aObserverS221S0100000_17.l0;
                    if (normalSelectPollWidget2.LLILLJJLI == null) {
                        normalSelectPollWidget2.LLILLJJLI = pollMessage.startContent;
                    }
                    if (normalSelectPollWidget2.LLILZIL == 0) {
                        normalSelectPollWidget2.LLILZIL = pollMessage.pollId;
                    }
                    if (C500260Jjc.LJJJI((Boolean) normalSelectPollWidget2.dataChannel.gg0(WarningInfoVisibilityEvent.class))) {
                        NormalSelectPollWidget normalSelectPollWidget3 = (NormalSelectPollWidget) aObserverS221S0100000_17.l0;
                        if (!normalSelectPollWidget3.LLIZ) {
                            normalSelectPollWidget3.y1();
                            return;
                        }
                    }
                    ((NormalSelectPollWidget) aObserverS221S0100000_17.l0).show();
                }
            }
        }
    }

    public static final void onChanged$18(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        LiveIconView liveIconView;
        C1115960f98 c1115960f98 = (C1115960f98) obj;
        if (c1115960f98 != null && (liveIconView = ((LiveMarketingWidget) aObserverS221S0100000_17.l0).LLILLL) != null) {
            liveIconView.setImageDrawable(c1115960f98.LIZ);
            liveIconView.setIconTintList(c1115960f98.LIZIZ);
        }
    }

    public static final void onChanged$19(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        C16F5 c16f5;
        String str = (String) obj;
        if (str != null && (c16f5 = ((LiveMarketingWidget) aObserverS221S0100000_17.l0).LLILZ) != null) {
            c16f5.setText(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[PHI: r1
      0x009c: PHI (r1v12 X.0ez4<? extends X.0f2X, X.0eys<? extends X.0f2X>>) = (r1v11 X.0ez4<? extends X.0f2X, X.0eys<? extends X.0f2X>>), (r1v13 X.0ez4<? extends X.0f2X, X.0eys<? extends X.0f2X>>) binds: [B:62:0x0158, B:33:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$2(Y.AObserverS221S0100000_17 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS221S0100000_17.onChanged$2(Y.AObserverS221S0100000_17, java.lang.Object):void");
    }

    public static final void onChanged$20(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        LiveIconView liveIconView;
        C1115960f98 c1115960f98 = (C1115960f98) obj;
        if (c1115960f98 != null && (liveIconView = ((LiveMarketingWidget) aObserverS221S0100000_17.l0).LLILZIL) != null) {
            liveIconView.setImageDrawable(c1115960f98.LIZ);
            liveIconView.setIconTintList(c1115960f98.LIZIZ);
        }
    }

    public static final void onChanged$21(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        View view;
        Drawable drawable = (Drawable) obj;
        if (drawable != null && (view = ((LiveMarketingWidget) aObserverS221S0100000_17.l0).getView()) != null) {
            view.setBackground(drawable);
        }
    }

    public static final void onChanged$22(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Keva keva = C1121600fIE.LIZ;
            keva.storeBoolean(C1121600fIE.LIZ(), true);
            if (C1131340fXw.LIZLLL() && !keva.getBoolean(C1121600fIE.LIZJ(), false)) {
                keva.storeBoolean(C1121600fIE.LIZJ(), true);
            }
            BagListViewModel bagListViewModel = (BagListViewModel) aObserverS221S0100000_17.l0;
            ((Handler) bagListViewModel.LLJIJIL.getValue()).removeCallbacks(bagListViewModel.LLJILJIL);
            C786410Ut5.LJJZZIII((Handler) bagListViewModel.LLJIJIL.getValue(), bagListViewModel.LLJILJIL);
            return;
        }
        ((BagListViewModel) aObserverS221S0100000_17.l0).LLILZ.setValue(null);
        ((BagListViewModel) aObserverS221S0100000_17.l0).LLILZIL.setValue(null);
        List<AbstractC1126600fQI<? extends AnonymousClass0054>> value = ((BagListViewModel) aObserverS221S0100000_17.l0).LLILLJJLI.getValue();
        if (value != null) {
            for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI : value) {
                if (abstractC1126600fQI != null) {
                    abstractC1126600fQI.LIZJ = false;
                }
            }
        }
        BagListViewModel bagListViewModel2 = (BagListViewModel) aObserverS221S0100000_17.l0;
        ((Handler) bagListViewModel2.LLJIJIL.getValue()).removeCallbacks(bagListViewModel2.LLJILJIL);
    }

    public static final void onChanged$23(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        int i;
        String str = (String) obj;
        AbsNewFansClubJoinDialog absNewFansClubJoinDialog = (AbsNewFansClubJoinDialog) aObserverS221S0100000_17.l0;
        absNewFansClubJoinDialog.LLJJIJI = str;
        C16F5 c16f5 = absNewFansClubJoinDialog.LLJILLL;
        if (c16f5 != null) {
            if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                i = 2131852336;
            } else {
                i = 2131841658;
            }
            c16f5.setText(u.LJJIII(C497740JfY.LJIJI(i), "%s", "", false));
        }
        C16F5 c16f52 = ((AbsNewFansClubJoinDialog) aObserverS221S0100000_17.l0).LLJILJILJ;
        if (c16f52 != null) {
            c16f52.setText(str);
        }
    }

    public static final void onChanged$24(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
        FansClubBanner fansClubBanner = (FansClubBanner) obj;
        AbsNewFansClubJoinDialog absNewFansClubJoinDialog = (AbsNewFansClubJoinDialog) aObserverS221S0100000_17.l0;
        if (fansClubBanner != null) {
            absNewFansClubJoinDialog.getClass();
            if (C500260Jjc.LJJIIZ(fansClubBanner.content)) {
                FrameLayout frameLayout = absNewFansClubJoinDialog.LLJIJIL;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                }
                C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/");
                c495520Jby.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
                c495520Jby.LIZJ("roma_page_key", "roma_schema_page_campaign_banner");
                String str = fansClubBanner.content;
                if (str == null) {
                    str = "";
                }
                c495520Jby.LIZJ("banner_content", str);
                String strLIZLLL = c495520Jby.LIZLLL();
                Context context = absNewFansClubJoinDialog.getContext();
                if (context != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(context, strLIZLLL, absNewFansClubJoinDialog, true, AFwS254S0000000_17.get$arr$(178));
                } else {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = null;
                }
                FrameLayout frameLayout2 = absNewFansClubJoinDialog.LLJIJIL;
                if (frameLayout2 != null) {
                    frameLayout2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -2);
                    return;
                }
                return;
            }
        }
        FrameLayout frameLayout3 = absNewFansClubJoinDialog.LLJIJIL;
        if (frameLayout3 == null) {
            return;
        }
        C786410Ut5.LJZ(8, frameLayout3);
    }

    public static final void onChanged$25(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Long l = (Long) obj;
        if (l.longValue() >= 0) {
            LinearLayout linearLayout = ((AbsNewFansClubJoinDialog) aObserverS221S0100000_17.l0).LLJ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            String string = l.toString();
            try {
                C1094580eae c1094580eae = C1094580eae.LIZ;
                long jLongValue = l.longValue();
                c1094580eae.getClass();
                string = C1094580eae.LIZLLL(jLongValue);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C16F5 c16f5 = ((AbsNewFansClubJoinDialog) aObserverS221S0100000_17.l0).LLJI;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIIL(2131755523, (int) l.longValue(), string));
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = ((AbsNewFansClubJoinDialog) aObserverS221S0100000_17.l0).LLJ;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(8, linearLayout2);
        }
    }

    public static final void onChanged$26(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        ((FansClubJoinDialogV3) aObserverS221S0100000_17.l0).ZR((GetNonFansUserDataResponse.Data) obj);
    }

    public static final void onChanged$27(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        TextView textView = ((FansClubStickerJoinDialog) aObserverS221S0100000_17.l0).LLJJLIIIJLLLLLLLZ;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131852373, obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$28(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Object tag;
        FrameLayout frameLayout;
        LiveRoomStruct liveRoomStruct;
        C201600q6 c201600q6;
        DisplayPosition displayPosition;
        InterfaceC1085190eLV interfaceC1085190eLV;
        FrameLayout.LayoutParams layoutParams;
        C201600q6 c201600q62;
        C201600q6 c201600q63 = (C201600q6) obj;
        if (c201600q63 != null) {
            LivePreviewBillboardWidget livePreviewBillboardWidget = (LivePreviewBillboardWidget) aObserverS221S0100000_17.l0;
            View view = livePreviewBillboardWidget.LLJILJIL;
            View view2 = null;
            List<C2757014x> list = null;
            if (view != null) {
                tag = view.getTag();
            } else {
                tag = null;
            }
            if ((tag instanceof C201600q6) && (c201600q62 = (C201600q6) tag) != null) {
                List<C2757014x> list2 = c201600q62.LIZ;
                ArrayList arrayList = new ArrayList();
                for (C2757014x c2757014x : list2) {
                    C2757014x c2757014x2 = c2757014x;
                    List<C2757014x> list3 = c201600q63.LIZ;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<C2757014x> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().LIZ.boardId, c2757014x2.LIZ.boardId)) {
                                break;
                            }
                        }
                    }
                    arrayList.add(c2757014x);
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C2757014x) it3.next()).LIZ.boardId);
                }
                if (!arrayList.isEmpty()) {
                    C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((C2757014x) it4.next()).LIZ);
                    }
                    c784440UpuLIZ.LIZIZ(new C201100q1(arrayList3));
                }
            }
            if (c201600q63.LIZ.isEmpty()) {
                C786410Ut5.LJJJJI((ViewGroup) livePreviewBillboardWidget.contentView);
                livePreviewBillboardWidget.LLJILJIL = null;
                livePreviewBillboardWidget.hide();
                return;
            }
            View view3 = livePreviewBillboardWidget.LLJILJIL;
            if (view3 != 0) {
                Object tag2 = view3.getTag();
                if (tag2 instanceof C201600q6) {
                    c201600q6 = (C201600q6) tag2;
                } else {
                    c201600q6 = null;
                }
                view3.setTag(c201600q63);
                DisplayPosition displayPosition2 = c201600q63.LIZIZ;
                if (c201600q6 != null) {
                    displayPosition = c201600q6.LIZIZ;
                } else {
                    displayPosition = null;
                }
                if (!Intrinsics.LJFF(displayPosition2, displayPosition)) {
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                        layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                        if (layoutParams != null) {
                            livePreviewBillboardWidget.M1(layoutParams, c201600q63.LIZIZ);
                        }
                    } else {
                        layoutParams = null;
                    }
                    C786410Ut5.W5(view3, layoutParams);
                    C786410Ut5.ed(view3, 0.0f);
                }
                List<C2757014x> list4 = c201600q63.LIZ;
                if (c201600q6 != null) {
                    list = c201600q6.LIZ;
                }
                if (!Intrinsics.LJFF(list4, list) && (view3 instanceof InterfaceC1085190eLV) && (interfaceC1085190eLV = (InterfaceC1085190eLV) view3) != null) {
                    interfaceC1085190eLV.setupData(c201600q63);
                }
            } else {
                Context context = livePreviewBillboardWidget.context;
                C011V c011v = C011V.PREVIEW_CARD;
                HashMap map = new HashMap();
                C1ACA c1acaZ1 = livePreviewBillboardWidget.z1();
                if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null) {
                    map.put("room_id", liveRoomStruct.idStr);
                    map.put("anchor_id", String.valueOf(liveRoomStruct.getAnchorId()));
                    map.put("live_type", RoomStruct.getStreamType(liveRoomStruct).logStreamingType);
                }
                map.put("room_orientation", "portrait");
                map.put("event_page", "live_preview");
                View viewYt0 = ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).Yt0(new C201700q7(context, c201600q63, c011v, livePreviewBillboardWidget, null, map, 16));
                if (viewYt0 != null) {
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                    livePreviewBillboardWidget.M1(layoutParams3, c201600q63.LIZIZ);
                    View view4 = livePreviewBillboardWidget.contentView;
                    if ((view4 instanceof FrameLayout) && (frameLayout = (FrameLayout) view4) != null) {
                        C786410Ut5.LJJJLL(frameLayout);
                        frameLayout.addView(viewYt0, layoutParams3);
                    }
                    viewYt0.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(livePreviewBillboardWidget, 12));
                    viewYt0.setTag(c201600q63);
                    view2 = viewYt0;
                }
                livePreviewBillboardWidget.LLJILJIL = view2;
            }
            livePreviewBillboardWidget.show();
        }
    }

    public static final void onChanged$29(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        EnumC1116180f9U enumC1116180f9U;
        EnumC1116180f9U enumC1116180f9U2;
        C1116150f9R c1116150f9R = (C1116150f9R) obj;
        C1116150f9R c1116150f9R2 = ((C1116140f9Q) aObserverS221S0100000_17.l0).LJI;
        EnumC1116180f9U enumC1116180f9U3 = null;
        if (c1116150f9R2 != null) {
            enumC1116180f9U = c1116150f9R2.LIZJ;
        } else {
            enumC1116180f9U = null;
        }
        if (c1116150f9R != null) {
            enumC1116180f9U2 = c1116150f9R.LIZJ;
        } else {
            enumC1116180f9U2 = null;
        }
        boolean z = true;
        if (enumC1116180f9U == enumC1116180f9U2) {
            IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
            C1116140f9Q c1116140f9Q = (C1116140f9Q) aObserverS221S0100000_17.l0;
            iPublicScreenService.tV1(c1116140f9Q.LJII, c1116140f9Q.LIZ(c1116150f9R, true, false));
        } else {
            IPublicScreenService iPublicScreenService2 = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
            C1116140f9Q c1116140f9Q2 = (C1116140f9Q) aObserverS221S0100000_17.l0;
            long j = c1116140f9Q2.LJII;
            if (c1116140f9Q2.LJI == null || c1116150f9R == null) {
                z = false;
            }
            iPublicScreenService2.tV1(j, c1116140f9Q2.LIZ(c1116150f9R, false, z));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update indicator -> ");
            if (c1116150f9R != null) {
                enumC1116180f9U3 = c1116150f9R.LIZJ;
            }
            sbLIZ.append(C1116190f9V.LIZJ(enumC1116180f9U3));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ((C1116140f9Q) aObserverS221S0100000_17.l0).LJI = c1116150f9R;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$3(Y.AObserverS221S0100000_17 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS221S0100000_17.onChanged$3(Y.AObserverS221S0100000_17, java.lang.Object):void");
    }

    public static final void onChanged$30(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        C1116210f9X c1116210f9X = (C1116210f9X) obj;
        if (c1116210f9X == null) {
            ((C1116140f9Q) aObserverS221S0100000_17.l0).LIZJ.SX0(C779300Uhc.class, Boolean.FALSE);
            ((C1116140f9Q) aObserverS221S0100000_17.l0).LIZJ.FQ2(StarCommentHideEvent.class);
        } else {
            ((C1116140f9Q) aObserverS221S0100000_17.l0).LIZJ.SX0(C779300Uhc.class, Boolean.TRUE);
            ((C1116140f9Q) aObserverS221S0100000_17.l0).LIZJ.zW(StarCommentDataChannel.class, c1116210f9X);
        }
        C20441214yg.LIZIZ("fanyiwen", "send");
        if (c1116210f9X == null) {
            ((C1116140f9Q) aObserverS221S0100000_17.l0).LIZJ.zW(GameStarCommentLayoutLandDataChannel.class, 0);
        } else {
            ((C1116140f9Q) aObserverS221S0100000_17.l0).LIZJ.zW(GameStarCommentLayoutLandDataChannel.class, Integer.valueOf((int) C497740JfY.LIZIZ(88.0f)));
        }
        C1116140f9Q c1116140f9Q = (C1116140f9Q) aObserverS221S0100000_17.l0;
        C1116210f9X c1116210f9X2 = c1116140f9Q.LIZLLL;
        if (c1116210f9X2 == null) {
            if (c1116210f9X != null) {
                c1116140f9Q.LJFF = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).CD2(((C1116140f9Q) aObserverS221S0100000_17.l0).LJII, new C1109240eyI(c1116210f9X), false);
            }
        } else if (c1116210f9X != null) {
            if (Intrinsics.LJFF(c1116210f9X.LL, c1116210f9X2.LL)) {
                C1116140f9Q c1116140f9Q2 = (C1116140f9Q) aObserverS221S0100000_17.l0;
                C1109600eys<? extends InterfaceC1112060f2q> c1109600eys = c1116140f9Q2.LJFF;
                if (c1109600eys != null) {
                    EnumC1116160f9S enumC1116160f9S = c1116140f9Q2.LJ;
                    EnumC1116160f9S enumC1116160f9S2 = EnumC1116160f9S.DISPLAYING;
                    if (enumC1116160f9S != enumC1116160f9S2 && c1116210f9X.LLJIJIL == enumC1116160f9S2) {
                        if (enumC1116160f9S == EnumC1116160f9S.SELF_WAITING) {
                            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).GA1(c1116140f9Q2.LJII, c1109600eys, 2);
                        } else {
                            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).GA1(c1116140f9Q2.LJII, c1109600eys, 1);
                        }
                    } else if (c1116210f9X.LLJIJIL == enumC1116160f9S2) {
                        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).GA1(c1116140f9Q2.LJII, c1109600eys, 2);
                    }
                } else {
                    c1116140f9Q2.LJFF = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).CD2(((C1116140f9Q) aObserverS221S0100000_17.l0).LJII, new C1109240eyI(c1116210f9X), false);
                }
            } else {
                if (((C1116140f9Q) aObserverS221S0100000_17.l0).LJFF != null) {
                    IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                    C1116140f9Q c1116140f9Q3 = (C1116140f9Q) aObserverS221S0100000_17.l0;
                    iPublicScreenService.sy(c1116140f9Q3.LJII, c1116140f9Q3.LJFF, true);
                }
                ((C1116140f9Q) aObserverS221S0100000_17.l0).LJFF = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).CD2(((C1116140f9Q) aObserverS221S0100000_17.l0).LJII, new C1109240eyI(c1116210f9X), true);
            }
        } else {
            if (c1116140f9Q.LJFF != null) {
                IPublicScreenService iPublicScreenService2 = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                C1116140f9Q c1116140f9Q4 = (C1116140f9Q) aObserverS221S0100000_17.l0;
                iPublicScreenService2.sy(c1116140f9Q4.LJII, c1116140f9Q4.LJFF, false);
            }
            ((C1116140f9Q) aObserverS221S0100000_17.l0).LJFF = null;
        }
        C1116140f9Q c1116140f9Q5 = (C1116140f9Q) aObserverS221S0100000_17.l0;
        c1116140f9Q5.LIZLLL = c1116210f9X;
        if (c1116210f9X != null) {
            c1116140f9Q5.LJ = c1116210f9X.LLJIJIL;
        }
    }

    public static final void onChanged$31(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Boolean boolValueOf;
        C1116220f9Y c1116220f9Y = (C1116220f9Y) obj;
        if (!((C1116140f9Q) aObserverS221S0100000_17.l0).LJIILIIL && (!c1116220f9Y.LIZ.isEmpty())) {
            ((C1116140f9Q) aObserverS221S0100000_17.l0).LJIILIIL = true;
            boolean zAddDisplaySourceOption = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addDisplaySourceOption(((C1116140f9Q) aObserverS221S0100000_17.l0).LJII, new InterfaceC1113900f5o() { // from class: X.0f5p
                @Override // X.InterfaceC1113900f5o
                public final LiveWidget LIZIZ() {
                    return ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).RR0();
                }

                @Override // X.InterfaceC1113900f5o
                public final CharSequence LIZ() {
                    return C497740JfY.LJIJI(2131844098);
                }
            });
            Room room = (Room) ((C1116140f9Q) aObserverS221S0100000_17.l0).LIZJ.gg0(RoomChannel.class);
            if (room != null) {
                boolValueOf = Boolean.valueOf(C781520UlC.LJII(room));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && GameDualDeviceAndExtendScreenLoadOptEnable.INSTANCE.enableExtendScreenLoadOp()) {
                ((C1116140f9Q) aObserverS221S0100000_17.l0).LJIILIIL = zAddDisplaySourceOption;
            }
        }
    }

    public static final void onChanged$32(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        EnumC1116180f9U enumC1116180f9U;
        EnumC1116180f9U enumC1116180f9U2;
        C1116150f9R c1116150f9R = (C1116150f9R) obj;
        C1116150f9R c1116150f9R2 = ((C1116130f9P) aObserverS221S0100000_17.l0).LJI;
        EnumC1116180f9U enumC1116180f9U3 = null;
        if (c1116150f9R2 != null) {
            enumC1116180f9U = c1116150f9R2.LIZJ;
        } else {
            enumC1116180f9U = null;
        }
        if (c1116150f9R != null) {
            enumC1116180f9U2 = c1116150f9R.LIZJ;
        } else {
            enumC1116180f9U2 = null;
        }
        boolean z = true;
        if (enumC1116180f9U == enumC1116180f9U2) {
            IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
            C1116130f9P c1116130f9P = (C1116130f9P) aObserverS221S0100000_17.l0;
            iPublicScreenService.tV1(c1116130f9P.LJII, c1116130f9P.LIZ(c1116150f9R, true, false));
        } else {
            IPublicScreenService iPublicScreenService2 = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
            C1116130f9P c1116130f9P2 = (C1116130f9P) aObserverS221S0100000_17.l0;
            long j = c1116130f9P2.LJII;
            if (c1116130f9P2.LJI == null || c1116150f9R == null) {
                z = false;
            }
            iPublicScreenService2.tV1(j, c1116130f9P2.LIZ(c1116150f9R, false, z));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update indicator -> ");
            if (c1116150f9R != null) {
                enumC1116180f9U3 = c1116150f9R.LIZJ;
            }
            sbLIZ.append(C1116190f9V.LIZJ(enumC1116180f9U3));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ((C1116130f9P) aObserverS221S0100000_17.l0).LJI = c1116150f9R;
    }

    public static final void onChanged$33(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        C1116210f9X c1116210f9X = (C1116210f9X) obj;
        if (c1116210f9X == null) {
            ((C1116130f9P) aObserverS221S0100000_17.l0).LIZJ.SX0(C779300Uhc.class, Boolean.FALSE);
            ((C1116130f9P) aObserverS221S0100000_17.l0).LIZJ.FQ2(StarCommentHideEvent.class);
        } else {
            ((C1116130f9P) aObserverS221S0100000_17.l0).LIZJ.SX0(C779300Uhc.class, Boolean.TRUE);
            ((C1116130f9P) aObserverS221S0100000_17.l0).LIZJ.zW(StarCommentDataChannel.class, c1116210f9X);
        }
        if (c1116210f9X != null) {
            C1116130f9P c1116130f9P = (C1116130f9P) aObserverS221S0100000_17.l0;
            if (c1116130f9P.LJIIJJI) {
                c1116130f9P.LIZIZ(true);
            } else {
                c1116130f9P.LIZIZ(false);
            }
        } else {
            ((C1116130f9P) aObserverS221S0100000_17.l0).LIZIZ(false);
        }
        C1116130f9P c1116130f9P2 = (C1116130f9P) aObserverS221S0100000_17.l0;
        C1116210f9X c1116210f9X2 = c1116130f9P2.LIZLLL;
        if (c1116210f9X2 == null) {
            if (c1116210f9X != null) {
                c1116130f9P2.LJFF = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).CD2(((C1116130f9P) aObserverS221S0100000_17.l0).LJII, new C1109240eyI(c1116210f9X), false);
            }
        } else if (c1116210f9X != null) {
            if (Intrinsics.LJFF(c1116210f9X.LL, c1116210f9X2.LL)) {
                C1116130f9P c1116130f9P3 = (C1116130f9P) aObserverS221S0100000_17.l0;
                C1109600eys<? extends InterfaceC1112060f2q> c1109600eys = c1116130f9P3.LJFF;
                if (c1109600eys != null) {
                    EnumC1116160f9S enumC1116160f9S = c1116130f9P3.LJ;
                    EnumC1116160f9S enumC1116160f9S2 = EnumC1116160f9S.DISPLAYING;
                    if (enumC1116160f9S != enumC1116160f9S2 && c1116210f9X.LLJIJIL == enumC1116160f9S2) {
                        if (enumC1116160f9S == EnumC1116160f9S.SELF_WAITING) {
                            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).GA1(c1116130f9P3.LJII, c1109600eys, 2);
                        } else {
                            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).GA1(c1116130f9P3.LJII, c1109600eys, 1);
                        }
                    } else if (c1116210f9X.LLJIJIL == enumC1116160f9S2) {
                        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).GA1(c1116130f9P3.LJII, c1109600eys, 2);
                    }
                } else {
                    c1116130f9P3.LJFF = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).CD2(((C1116130f9P) aObserverS221S0100000_17.l0).LJII, new C1109240eyI(c1116210f9X), false);
                }
            } else {
                if (((C1116130f9P) aObserverS221S0100000_17.l0).LJFF != null) {
                    IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                    C1116130f9P c1116130f9P4 = (C1116130f9P) aObserverS221S0100000_17.l0;
                    iPublicScreenService.sy(c1116130f9P4.LJII, c1116130f9P4.LJFF, true);
                }
                ((C1116130f9P) aObserverS221S0100000_17.l0).LJFF = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).CD2(((C1116130f9P) aObserverS221S0100000_17.l0).LJII, new C1109240eyI(c1116210f9X), true);
            }
        } else {
            if (c1116130f9P2.LJFF != null) {
                IPublicScreenService iPublicScreenService2 = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
                C1116130f9P c1116130f9P5 = (C1116130f9P) aObserverS221S0100000_17.l0;
                iPublicScreenService2.sy(c1116130f9P5.LJII, c1116130f9P5.LJFF, false);
            }
            ((C1116130f9P) aObserverS221S0100000_17.l0).LJFF = null;
        }
        C1116130f9P c1116130f9P6 = (C1116130f9P) aObserverS221S0100000_17.l0;
        c1116130f9P6.LIZLLL = c1116210f9X;
        if (c1116210f9X != null) {
            c1116130f9P6.LJ = c1116210f9X.LLJIJIL;
        }
    }

    public static final void onChanged$34(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Boolean boolValueOf;
        C1116220f9Y c1116220f9Y = (C1116220f9Y) obj;
        if (!((C1116130f9P) aObserverS221S0100000_17.l0).LJIIJ && (!c1116220f9Y.LIZ.isEmpty())) {
            ((C1116130f9P) aObserverS221S0100000_17.l0).LJIIJ = true;
            boolean zAddDisplaySourceOption = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addDisplaySourceOption(((C1116130f9P) aObserverS221S0100000_17.l0).LJII, new InterfaceC1113900f5o() { // from class: X.0f5q
                @Override // X.InterfaceC1113900f5o
                public final LiveWidget LIZIZ() {
                    return ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).RR0();
                }

                @Override // X.InterfaceC1113900f5o
                public final CharSequence LIZ() {
                    return C497740JfY.LJIJI(2131844098);
                }
            });
            Room room = (Room) ((C1116130f9P) aObserverS221S0100000_17.l0).LIZJ.gg0(RoomChannel.class);
            if (room != null) {
                boolValueOf = Boolean.valueOf(C781520UlC.LJII(room));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && GameDualDeviceAndExtendScreenLoadOptEnable.INSTANCE.enableExtendScreenLoadOp()) {
                ((C1116130f9P) aObserverS221S0100000_17.l0).LJIIJ = zAddDisplaySourceOption;
            }
        }
    }

    public static final void onChanged$35(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        C197039127h c197039127hSR = ((AddMultiVideoFragment) aObserverS221S0100000_17.l0).SR();
        if (iIntValue > 0) {
            z = true;
        } else {
            z = false;
        }
        c197039127hSR.setEnabled(z);
        if (((AddMultiVideoFragment) aObserverS221S0100000_17.l0).getActivity() instanceof MixFeedManagerActivity) {
            ((AddMultiVideoFragment) aObserverS221S0100000_17.l0).SR().setText(((AddMultiVideoFragment) aObserverS221S0100000_17.l0).getResources().getQuantityString(2131755485, iIntValue, Integer.valueOf(iIntValue)));
        }
    }

    public static final void onChanged$36(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        C1123440fLC.LJIIJ((C1123440fLC) aObserverS221S0100000_17.l0);
    }

    public static final void onChanged$37(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        AnonymousClass0956 anonymousClass0956 = ((LegalAssem) aObserverS221S0100000_17.l0).LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (obj instanceof C1151400g4I) {
            ((LegalAssem) aObserverS221S0100000_17.l0).Oo().vQ2(true);
            return;
        }
        if (!(obj instanceof C1151410g4J)) {
            return;
        }
        LegalAssem legalAssem = (LegalAssem) aObserverS221S0100000_17.l0;
        legalAssem.Oo().vQ2(false);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (LegalAssem.LLJJJJJIL > 0 && jElapsedRealtime - LegalAssem.LLJJJJJIL < 3600000) {
            return;
        }
        LegalAssem.LLJJJJJIL = jElapsedRealtime;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1150110g2D(new AwS383S0200000_17(C1150090g2B.LIZJ(), legalAssem, 83), null), 3);
    }

    public static final void onChanged$38(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Integer num = (Integer) obj;
        if (num != null && num.intValue() == 1) {
            ((LegalAssem) aObserverS221S0100000_17.l0).Oo().vQ2(true);
        }
    }

    public static final void onChanged$39(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        DataChannel dataChannel;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ = ((C1128710fTh) aObserverS221S0100000_17.l0).LJJLIIIJJIZ();
        if (giftLeafRootViewModelLJJLIIIJJIZ != null && (dataChannel = giftLeafRootViewModelLJJLIIIJJIZ.LL) != null) {
            dataChannel.zW(GiftPanelSortState.class, obj);
        }
    }

    public static final void onChanged$4(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Boolean boolValueOf;
        C1109600eys<? extends InterfaceC1112060f2q> c1109600eys;
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt;
        C1109600eys<? extends InterfaceC1112060f2q> c1109600eys2;
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt2;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        InterfaceC1090080eTO interfaceC1090080eTO;
        C1109600eys<? extends InterfaceC1111870f2X> c1109600eys3 = (C1109600eys) obj;
        if (((MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0).isViewValid()) {
            Boolean boolValueOf4 = null;
            AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez4 = null;
            boolValueOf4 = null;
            if (!c1109600eys3.LJFF) {
                MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget = (MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0;
                mainScreenCommentPinnedWidget.show();
                C500260Jjc.LLFFF(mainScreenCommentPinnedWidget.S1());
                if (C500260Jjc.LJJJJIZL((View) mainScreenCommentPinnedWidget.LLJJJIL.getValue())) {
                    PinMessageViewModel pinMessageViewModel = mainScreenCommentPinnedWidget.LLILZIL;
                    if (pinMessageViewModel != null) {
                        c1109600eys2 = pinMessageViewModel.LLILZIL;
                        c1109610eyt2 = pinMessageViewModel.LLILZ;
                    } else {
                        c1109600eys2 = null;
                        c1109610eyt2 = null;
                    }
                    if (c1109600eys2 != null) {
                        boolValueOf2 = Boolean.valueOf(c1109600eys2.LJFF);
                    } else {
                        boolValueOf2 = null;
                    }
                    if (C500260Jjc.LJJIFFI(boolValueOf2)) {
                        if (c1109600eys2 != null) {
                            if (((InterfaceC1112060f2q) c1109600eys2.LIZ()).LLIL()) {
                                InterfaceC1090080eTO interfaceC1090080eTO2 = mainScreenCommentPinnedWidget.LLJJJJ;
                                if (interfaceC1090080eTO2 != null) {
                                    interfaceC1090080eTO2.T51(EnumC325470CpN.STAR_SELF_COMMENT);
                                }
                            } else {
                                InterfaceC1090080eTO interfaceC1090080eTO3 = mainScreenCommentPinnedWidget.LLJJJJ;
                                if (interfaceC1090080eTO3 != null) {
                                    interfaceC1090080eTO3.T51(EnumC325470CpN.STAR_OTHER_COMMENT);
                                }
                            }
                        }
                    } else {
                        if (c1109610eyt2 != null) {
                            boolValueOf3 = Boolean.valueOf(c1109610eyt2.LJFF);
                        } else {
                            boolValueOf3 = null;
                        }
                        if (C500260Jjc.LJJIFFI(boolValueOf3) && (interfaceC1090080eTO = mainScreenCommentPinnedWidget.LLJJJJ) != null) {
                            interfaceC1090080eTO.T51(EnumC325470CpN.PIN_COMMENT);
                        }
                    }
                }
                C500260Jjc.LJIILIIL((View) mainScreenCommentPinnedWidget.LLJJJIL.getValue());
                DataChannel dataChannel = ((MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0).dataChannel;
                Boolean bool = Boolean.TRUE;
                dataChannel.zW(ProgrammedPinMsgVisibility.class, bool);
                MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget2 = (MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0;
                if (mainScreenCommentPinnedWidget2.LLJJJJJIL == null) {
                    AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez4Y1 = mainScreenCommentPinnedWidget2.y1(c1109600eys3, mainScreenCommentPinnedWidget2.S1());
                    if (abstractC1109720ez4Y1 != null) {
                        abstractC1109720ez4Y1.N5().setAnimStartCallback(new AwS561S0100000_17(mainScreenCommentPinnedWidget2, 293));
                        abstractC1109720ez4Y1.N5().setAnimEndCallback(new AwS418S0200000_17((AbstractC1109720ez4) abstractC1109720ez4Y1, (AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>>) mainScreenCommentPinnedWidget2, (MainScreenCommentPinnedWidget) 46));
                        abstractC1109720ez4 = abstractC1109720ez4Y1;
                    }
                    mainScreenCommentPinnedWidget2.LLJJJJJIL = abstractC1109720ez4;
                }
                MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget3 = (MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0;
                AbstractC1109720ez4<? extends InterfaceC1111870f2X, C1109600eys<? extends InterfaceC1111870f2X>> abstractC1109720ez42 = mainScreenCommentPinnedWidget3.LLJJJJJIL;
                if (abstractC1109720ez42 != null) {
                    abstractC1109720ez42.LL = mainScreenCommentPinnedWidget3.LL;
                    abstractC1109720ez42.L5(c1109600eys3, C13BV.INSTANCE);
                }
                MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget4 = (MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0;
                if (C500260Jjc.LJJIFFI((Boolean) mainScreenCommentPinnedWidget4.dataChannel.gg0(CommentPinWidgetVisibility.class))) {
                    mainScreenCommentPinnedWidget4.dataChannel.zW(CommentPinWidgetVisibility.class, bool);
                }
                ((MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0).S1().setHeightAnimationEnabled(true);
                C1097140eem c1097140eemS1 = ((MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0).S1();
                if (!c1097140eemS1.LLJIJIL) {
                    c1097140eemS1.LLJIJIL = true;
                    C786410Ut5.Pd(c1097140eemS1.LLIZ);
                    c1097140eemS1.requestLayout();
                    return;
                }
                return;
            }
            C1097140eem c1097140eemS12 = ((MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0).S1();
            if (c1097140eemS12.LLJIJIL) {
                c1097140eemS12.LLJIJIL = false;
                c1097140eemS12.LLIZ.reverse();
                c1097140eemS12.LIZIZ(0);
            }
            MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget5 = (MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0;
            C500260Jjc.LJIILIIL(mainScreenCommentPinnedWidget5.S1());
            C500260Jjc.LLFFF((View) mainScreenCommentPinnedWidget5.LLJJJIL.getValue());
            DataChannel dataChannel2 = ((MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0).dataChannel;
            Boolean bool2 = Boolean.FALSE;
            dataChannel2.zW(ProgrammedPinMsgVisibility.class, bool2);
            PinMessageViewModel pinMessageViewModel2 = ((MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0).LLILZIL;
            if (pinMessageViewModel2 != null && (c1109610eyt = pinMessageViewModel2.LLILZ) != null) {
                boolValueOf = Boolean.valueOf(c1109610eyt.LJFF);
            } else {
                boolValueOf = null;
            }
            boolean zLJJIFFI = C500260Jjc.LJJIFFI(boolValueOf);
            PinMessageViewModel pinMessageViewModel3 = ((MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0).LLILZIL;
            if (pinMessageViewModel3 != null && (c1109600eys = pinMessageViewModel3.LLILZIL) != null) {
                boolValueOf4 = Boolean.valueOf(c1109600eys.LJFF);
            }
            boolean zLJJIFFI2 = C500260Jjc.LJJIFFI(boolValueOf4);
            if (zLJJIFFI || zLJJIFFI2) {
                return;
            }
            MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget6 = (MainScreenCommentPinnedWidget) aObserverS221S0100000_17.l0;
            if (!C500260Jjc.LJJJI((Boolean) mainScreenCommentPinnedWidget6.dataChannel.gg0(CommentPinWidgetVisibility.class))) {
                return;
            }
            mainScreenCommentPinnedWidget6.dataChannel.zW(CommentPinWidgetVisibility.class, bool2);
        }
    }

    public static final void onChanged$40(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        ((C1124290fMZ) aObserverS221S0100000_17.l0).LJJLIIIIJ(true);
    }

    public static final void onChanged$41(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Map<String, String> logExtra;
        String str;
        String billingCountryCode;
        InterfaceC1816020xMG interfaceC1816020xMG = (InterfaceC1816020xMG) obj;
        if (interfaceC1816020xMG != null) {
            if (interfaceC1816020xMG instanceof C1151400g4I) {
                ((PackageListAssem) aObserverS221S0100000_17.l0).kp();
                ((PackageListAssem) aObserverS221S0100000_17.l0).lp(true);
                PackageListAssem packageListAssem = (PackageListAssem) aObserverS221S0100000_17.l0;
                if (packageListAssem.LLJJIJI) {
                    packageListAssem.ip();
                } else if (!packageListAssem.hp(true)) {
                    ((PackageListAssem) aObserverS221S0100000_17.l0).ep(true);
                }
                RechargePanelInputParams inputParams = ((PackageListAssem) aObserverS221S0100000_17.l0).Oo().getInputParams();
                C1151400g4I c1151400g4I = (C1151400g4I) interfaceC1816020xMG;
                TouchPointAbility touchPointAbilityZo = ((PackageListAssem) aObserverS221S0100000_17.l0).Zo();
                if (touchPointAbilityZo != null) {
                    logExtra = touchPointAbilityZo.getLogExtra();
                } else {
                    logExtra = null;
                }
                HashMap<String, Object> mapUB2 = ((PackageListAssem) aObserverS221S0100000_17.l0).No().UB2(null);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_preview");
                c474500IjALIZ.LJJII(Integer.valueOf(c1151400g4I.LLILZ), "recharge_package");
                if (c1151400g4I.LLJ) {
                    str = "click";
                } else {
                    str = "call";
                }
                c474500IjALIZ.LJJII(str, "preview_type");
                InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
                if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
                    billingCountryCode = "";
                }
                c474500IjALIZ.LJJII(billingCountryCode, "app_store_front");
                C1151190g3x.LJ(c474500IjALIZ, inputParams, logExtra);
                C1151190g3x.LIZLLL(c474500IjALIZ, mapUB2);
                c474500IjALIZ.LIZ();
                return;
            }
            if (!(interfaceC1816020xMG instanceof C1151410g4J)) {
                return;
            }
            ((PackageListAssem) aObserverS221S0100000_17.l0).lp(false);
            int i = PanelUIUtil.LIZ;
            SpannableStringBuilder spannableStringBuilderLIZIZ = PanelUIUtil.LIZIZ(((PackageListAssem) aObserverS221S0100000_17.l0).getContext());
            if (!C1149560g1K.LIZLLL(((PackageListAssem) aObserverS221S0100000_17.l0).Oo().getInputParams()) && spannableStringBuilderLIZIZ != null) {
                ((PackageListAssem) aObserverS221S0100000_17.l0).bp(spannableStringBuilderLIZIZ);
            } else {
                if (((PackageListAssem) aObserverS221S0100000_17.l0).hp(false)) {
                    return;
                }
                ((PackageListAssem) aObserverS221S0100000_17.l0).ep(false);
            }
        }
    }

    public static final void onChanged$42(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Integer num = (Integer) obj;
        if (num != null && num.intValue() == 0) {
            C16FS c16fs = ((RechargeBtnAssem) aObserverS221S0100000_17.l0).LLJ;
            if (c16fs != null) {
                c16fs.setEnabled(true);
                return;
            }
            return;
        }
        C16FS c16fs2 = ((RechargeBtnAssem) aObserverS221S0100000_17.l0).LLJ;
        if (c16fs2 != null) {
            c16fs2.setEnabled(false);
        }
        C16FS c16fs3 = ((RechargeBtnAssem) aObserverS221S0100000_17.l0).LLJ;
        if (c16fs3 == null) {
            return;
        }
        c16fs3.setText(C497740JfY.LJIJI(2131840592));
    }

    public static final void onChanged$43(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>> list = (List) obj;
        ((C1128800fTq) aObserverS221S0100000_17.l0).LJII(new LinkedList(list));
        ((C1128800fTq) aObserverS221S0100000_17.l0).LJIIIIZZ(list);
    }

    public static final void onChanged$44(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        MutableLiveData<List<AbstractC1126600fQI<? extends AnonymousClass0054>>> mutableLiveData;
        List<AbstractC1126600fQI<? extends AnonymousClass0054>> value;
        MutableLiveData<Boolean> mutableLiveData2;
        BagListViewModel bagListViewModelLIZJ = ((C1128800fTq) aObserverS221S0100000_17.l0).LIZJ();
        if (bagListViewModelLIZJ != null && (mutableLiveData = bagListViewModelLIZJ.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            C1128800fTq c1128800fTq = (C1128800fTq) aObserverS221S0100000_17.l0;
            c1128800fTq.LJIIIIZZ(value);
            BagListViewModel bagListViewModelLIZJ2 = c1128800fTq.LIZJ();
            if (bagListViewModelLIZJ2 != null && (mutableLiveData2 = bagListViewModelLIZJ2.LLJI) != null && Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.TRUE) && value.isEmpty() && obj != EnumC1129500fUy.LOADING) {
                c1128800fTq.LIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0202 A[EDGE_INSN: B:344:0x0202->B:136:0x0202 BREAK  A[LOOP:2: B:131:0x01ec->B:210:0x0362], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$45(Y.AObserverS221S0100000_17 r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 1313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS221S0100000_17.onChanged$45(Y.AObserverS221S0100000_17, java.lang.Object):void");
    }

    public static final void onChanged$46(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        int i;
        if (((C1102510enR) obj).LIZ) {
            i = 0;
        } else {
            i = 8;
        }
        if (((View) aObserverS221S0100000_17.l0).getVisibility() != i) {
            C786410Ut5.LJLLLLLL(i, (View) aObserverS221S0100000_17.l0);
        }
    }

    public static final void onChanged$47(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        ((View) aObserverS221S0100000_17.l0).setEnabled(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$48(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        C786410Ut5.T4((View) aObserverS221S0100000_17.l0, ((Float) obj).floatValue());
    }

    public static final void onChanged$49(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        ((View) aObserverS221S0100000_17.l0).setClickable(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$5(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        String str;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool)) {
            ECAuctionBottomRightActingAreaSlotWidget eCAuctionBottomRightActingAreaSlotWidget = (ECAuctionBottomRightActingAreaSlotWidget) aObserverS221S0100000_17.l0;
            if (eCAuctionBottomRightActingAreaSlotWidget.LLILZ) {
                View view = eCAuctionBottomRightActingAreaSlotWidget.getView();
                if (view != null) {
                    C500260Jjc.LLFFF(view);
                }
                eCAuctionBottomRightActingAreaSlotWidget.attachAndShow();
                eCAuctionBottomRightActingAreaSlotWidget.z1("slot_can_show_and_l2_visible", true, false);
                return;
            }
        }
        ECAuctionBottomRightActingAreaSlotWidget eCAuctionBottomRightActingAreaSlotWidget2 = (ECAuctionBottomRightActingAreaSlotWidget) aObserverS221S0100000_17.l0;
        eCAuctionBottomRightActingAreaSlotWidget2.getClass();
        if (Intrinsics.LJFF(obj, bool) && !eCAuctionBottomRightActingAreaSlotWidget2.LLILZ) {
            str = "l2_slot_hidden";
        } else if (Intrinsics.LJFF(obj, bool)) {
            str = "slot_can_show_but_not_visible";
        } else {
            str = "slot_can_not_show";
        }
        View view2 = eCAuctionBottomRightActingAreaSlotWidget2.getView();
        if (view2 != null) {
            C500260Jjc.LJIILIIL(view2);
        }
        eCAuctionBottomRightActingAreaSlotWidget2.z1(str, false, false);
    }

    public static final void onChanged$50(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        C1132880faQ c1132880faQLIZ;
        User user;
        LiveNewGiftDialog liveNewGiftDialog = (LiveNewGiftDialog) aObserverS221S0100000_17.l0;
        liveNewGiftDialog.getClass();
        InterfaceC1131100fXY interfaceC1131100fXY = ((C1128680fTe) obj).LIZ;
        C1130790fX3 c1130790fX3 = liveNewGiftDialog.LLJI;
        if (c1130790fX3 != null && (user = c1130790fX3.LIZ) != null) {
            c1132880faQLIZ = C1123290fKx.LIZ(user);
        } else {
            c1132880faQLIZ = null;
        }
        interfaceC1131100fXY.LJJJ(c1132880faQLIZ);
        interfaceC1131100fXY.setSource(liveNewGiftDialog.LLJJIII);
        C1131140fXc.LIZLLL(liveNewGiftDialog.dataChannel, interfaceC1131100fXY);
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        DataChannel dataChannel = liveNewGiftDialog.dataChannel;
        long giftId = interfaceC1131100fXY.getGiftId();
        boolean zLJI = interfaceC1131100fXY.LJI();
        String str = liveNewGiftDialog.LLJJIII;
        String strLJJIJIL = interfaceC1131100fXY.LJJIJIL();
        if (strLJJIJIL == null) {
            strLJJIJIL = "";
        }
        String clickType = interfaceC1131100fXY.getClickType();
        Integer numValueOf = Integer.valueOf(interfaceC1131100fXY.getTabId());
        String strLJLJJL = interfaceC1131100fXY.LJLJJL();
        EnumC1130940fXI enumC1130940fXILJIJJ = interfaceC1131100fXY.LJIJJ();
        C1125860fP6 c1125860fP6 = C1125820fP2.LJFF().LIZ;
        Long lValueOf = Long.valueOf(interfaceC1131100fXY.LJJJJJ());
        Long lValueOf2 = Long.valueOf(interfaceC1131100fXY.LJJJLIIL());
        String str2 = liveNewGiftDialog.LLJJJJ;
        C1124730fNH.LIZIZ();
        C1128760fTm.LJJJJJL(c1128760fTm, dataChannel, giftId, false, zLJI, str, strLJJIJIL, clickType, numValueOf, strLJLJJL, null, enumC1130940fXILJIJJ, c1125860fP6, lValueOf, lValueOf2, str2, 1024);
    }

    public static final void onChanged$52(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        ((LiveNewGiftDialog) aObserverS221S0100000_17.l0).dismissAllowingStateLoss();
    }

    public static final void onChanged$53(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        boolean z;
        C1082760eHa c1082760eHa = (C1082760eHa) obj;
        AbstractC1082660eHQ abstractC1082660eHQ = (AbstractC1082660eHQ) aObserverS221S0100000_17.l0;
        abstractC1082660eHQ.getClass();
        if (LiveGiftTrayPublicScreenTranslateSetting.INSTANCE.canGiftTrayTranslationXfer(c1082760eHa.LIZ.LIZLLL) || c1082760eHa.LIZ.LJ == EnumC766540U5c.STICKER_EFFECT_PANEL || (LiveBeautyPanelAlphaOptSetting.INSTANCE.enable() && c1082760eHa.LIZ.LJ == EnumC766540U5c.BEAUTY_PANEL)) {
            z = true;
        } else {
            z = false;
        }
        abstractC1082660eHQ.LLILLL = z;
        abstractC1082660eHQ.LIZ(c1082760eHa);
    }

    public static final void onChanged$54(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        LiveWidget liveWidget;
        Boolean boolValueOf;
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            GiftHistoryWidgetHelper giftHistoryWidgetHelper = (GiftHistoryWidgetHelper) aObserverS221S0100000_17.l0;
            LiveWidget liveWidget2 = giftHistoryWidgetHelper.LLJIJIL;
            if (liveWidget2 != null) {
                boolValueOf = Boolean.valueOf(liveWidget2.isShowing());
            } else {
                boolValueOf = null;
            }
            giftHistoryWidgetHelper.LLJILJIL = C500260Jjc.LJJJI(boolValueOf);
            LiveWidget liveWidget3 = ((GiftHistoryWidgetHelper) aObserverS221S0100000_17.l0).LLJIJIL;
            if (liveWidget3 != null) {
                liveWidget3.hide();
                return;
            }
            return;
        }
        GiftHistoryWidgetHelper giftHistoryWidgetHelper2 = (GiftHistoryWidgetHelper) aObserverS221S0100000_17.l0;
        if (!giftHistoryWidgetHelper2.LLJILJIL || (liveWidget = giftHistoryWidgetHelper2.LLJIJIL) == null) {
            return;
        }
        liveWidget.show();
    }

    public static final void onChanged$55(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        boolean z;
        EnumC1116160f9S enumC1116160f9S;
        String str;
        C1116210f9X c1116210f9X = (C1116210f9X) obj;
        if (c1116210f9X != null) {
            z = true;
        } else {
            z = false;
        }
        C1116420f9s.LIZ = z;
        C1116230f9Z c1116230f9Z = (C1116230f9Z) aObserverS221S0100000_17.l0;
        DataChannel dataChannel = c1116230f9Z.LLILLJJLI;
        if (dataChannel != null) {
            if (c1116210f9X == null) {
                C1116210f9X c1116210f9X2 = c1116230f9Z.LLJIJIL;
                if (c1116210f9X2 != null) {
                    C1116240f9a.LIZ(c1116210f9X2, dataChannel, c1116230f9Z.LLJI.containsKey((Object) c1116210f9X2.LL));
                }
            } else {
                C1116210f9X c1116210f9X3 = c1116230f9Z.LLJIJIL;
                if (c1116210f9X3 == null) {
                    if (c1116210f9X.LLJIJIL == EnumC1116160f9S.DISPLAYING) {
                        C1116200f9W.LIZLLL(c1116210f9X, dataChannel, c1116230f9Z.LLJI.containsKey((Object) c1116210f9X.LL));
                    } else {
                        str = null;
                    }
                } else {
                    str = c1116210f9X3.LL;
                }
                if (!Intrinsics.LJFF(str, c1116210f9X.LL)) {
                    C1116210f9X c1116210f9X4 = c1116230f9Z.LLJIJIL;
                    if (c1116210f9X4 != null) {
                        C1116240f9a.LIZ(c1116210f9X4, dataChannel, c1116230f9Z.LLJI.containsKey((Object) c1116210f9X4.LL));
                    }
                    if (c1116210f9X.LLJIJIL == EnumC1116160f9S.DISPLAYING) {
                        C1116200f9W.LIZLLL(c1116210f9X, dataChannel, c1116230f9Z.LLJI.containsKey((Object) c1116210f9X.LL));
                    }
                } else {
                    EnumC1116160f9S enumC1116160f9S2 = c1116230f9Z.LLJILJIL;
                    EnumC1116160f9S enumC1116160f9S3 = EnumC1116160f9S.DISPLAYING;
                    if (enumC1116160f9S2 != enumC1116160f9S3 && c1116210f9X.LLJIJIL == enumC1116160f9S3) {
                        C1116200f9W.LIZLLL(c1116210f9X, dataChannel, c1116230f9Z.LLJI.containsKey((Object) c1116210f9X.LL));
                    }
                }
            }
        }
        c1116230f9Z.LLJIJIL = c1116210f9X;
        if (c1116210f9X == null || (enumC1116160f9S = c1116210f9X.LLJIJIL) == null) {
            enumC1116160f9S = EnumC1116160f9S.UNKNOWN;
        }
        c1116230f9Z.LLJILJIL = enumC1116160f9S;
    }

    public static final void onChanged$56(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        if (obj == null) {
            return;
        }
        ((Observer) aObserverS221S0100000_17.l0).onChanged(obj);
    }

    public static final void onChanged$57(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        boolean z;
        C1097050eed c1097050eed = (C1097050eed) obj;
        if (c1097050eed != null) {
            LiveNewGiftPageIndicatorWidget liveNewGiftPageIndicatorWidget = (LiveNewGiftPageIndicatorWidget) aObserverS221S0100000_17.l0;
            int i = liveNewGiftPageIndicatorWidget.LLILZ;
            int i2 = c1097050eed.LIZ;
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            liveNewGiftPageIndicatorWidget.LLILZ = i2;
            int i3 = c1097050eed.LIZIZ;
            liveNewGiftPageIndicatorWidget.LLILZIL = i3;
            LinearLayout linearLayout = null;
            ImageView imageView = null;
            if (i2 != 0 && i2 != 1) {
                if (!z) {
                    LinearLayout linearLayout2 = liveNewGiftPageIndicatorWidget.LL;
                    if (linearLayout2 == null) {
                        linearLayout2 = null;
                    }
                    C786410Ut5.LJJJJJL(linearLayout2);
                    LinearLayout linearLayout3 = liveNewGiftPageIndicatorWidget.LL;
                    if (linearLayout3 == null) {
                        linearLayout3 = null;
                    }
                    C786410Ut5.LJZL(0, linearLayout3);
                    liveNewGiftPageIndicatorWidget.LLILZLL.clear();
                    int iLIZIZ = (int) C497740JfY.LIZIZ(6.0f);
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(8.0f);
                    Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.ex4);
                    int i4 = liveNewGiftPageIndicatorWidget.LLILZ;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ImageView imageView2 = new ImageView(liveNewGiftPageIndicatorWidget.getContext());
                        LinearLayout linearLayout4 = liveNewGiftPageIndicatorWidget.LL;
                        if (linearLayout4 == null) {
                            linearLayout4 = null;
                        }
                        linearLayout4.addView(imageView2);
                        liveNewGiftPageIndicatorWidget.LLILZLL.add(imageView2);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView2.getLayoutParams();
                        layoutParams.height = iLIZIZ;
                        layoutParams.width = iLIZIZ;
                        imageView2.setBackground(drawableLJIIJ);
                        C500260Jjc.LJLJJI(iLIZIZ2, imageView2);
                    }
                    ImageView imageView3 = (ImageView) ListProtector.get(liveNewGiftPageIndicatorWidget.LLILZLL, liveNewGiftPageIndicatorWidget.LLILZIL);
                    imageView3.setBackground(C497740JfY.LJIIJ(R.drawable.etz));
                    liveNewGiftPageIndicatorWidget.LLILLJJLI = imageView3;
                    return;
                }
                try {
                    imageView = liveNewGiftPageIndicatorWidget.LLILZLL.get(i3);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                ImageView imageView4 = liveNewGiftPageIndicatorWidget.LLILLJJLI;
                if (imageView != imageView4) {
                    if (imageView4 != null) {
                        imageView4.setBackground(C497740JfY.LJIIJ(R.drawable.ex4));
                    }
                    if (imageView != null) {
                        imageView.setBackground(C497740JfY.LJIIJ(R.drawable.etz));
                        liveNewGiftPageIndicatorWidget.LLILLJJLI = imageView;
                        return;
                    }
                    return;
                }
                return;
            }
            LinearLayout linearLayout5 = liveNewGiftPageIndicatorWidget.LL;
            if (linearLayout5 != null) {
                linearLayout = linearLayout5;
            }
            C500260Jjc.LJIILLIIL(linearLayout);
        }
    }

    public static final void onChanged$58(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        AbstractC1126600fQI<?> abstractC1126600fQI;
        AbstractC1126590fQH abstractC1126590fQH;
        int iIntValue = ((Number) obj).intValue();
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) aObserverS221S0100000_17.l0;
        if (liveNewGiftPanelWidget.LLJL != iIntValue) {
            liveNewGiftPanelWidget.LLJLIL = false;
            liveNewGiftPanelWidget.LLJL = iIntValue;
        }
        liveNewGiftPanelWidget.LLJJIII = false;
        LiveNewGiftPanelWidget liveNewGiftPanelWidget2 = (LiveNewGiftPanelWidget) aObserverS221S0100000_17.l0;
        liveNewGiftPanelWidget2.z1(iIntValue, false, liveNewGiftPanelWidget2.LLIZLLLIL);
        C434980H3w c434980H3w = ((LiveNewGiftPanelWidget) aObserverS221S0100000_17.l0).LLJ;
        if (c434980H3w != null && (abstractC1126590fQH = c434980H3w.LLILZ) != null) {
            abstractC1126590fQH.N5();
        }
        C434980H3w c434980H3w2 = ((LiveNewGiftPanelWidget) aObserverS221S0100000_17.l0).LLJ;
        if (c434980H3w2 != null) {
            AbstractC1126590fQH abstractC1126590fQH2 = c434980H3w2.LLILZ;
            if (abstractC1126590fQH2 != null) {
                abstractC1126590fQH2.W5();
            }
            AbstractC1126590fQH abstractC1126590fQH3 = c434980H3w2.LLILZ;
            if (abstractC1126590fQH3 != null && (abstractC1126600fQI = abstractC1126590fQH3.LLIZLLLIL) != null) {
                abstractC1126600fQI.LIZJ = false;
            }
            c434980H3w2.LLILLL = null;
        }
    }

    public static final void onChanged$59(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        AbstractC1126590fQH abstractC1126590fQH;
        boolean z = false;
        ((LiveNewGiftPanelWidget) aObserverS221S0100000_17.l0).LLJJIII = false;
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) aObserverS221S0100000_17.l0;
        LinkedList<GiftPage> linkedList = liveNewGiftPanelWidget.LLIZLLLIL;
        if (obj != EnumC1130940fXI.DEFAULT) {
            z = true;
        }
        liveNewGiftPanelWidget.z1(1, z, linkedList);
        C434980H3w c434980H3w = ((LiveNewGiftPanelWidget) aObserverS221S0100000_17.l0).LLJ;
        if (c434980H3w != null && (abstractC1126590fQH = c434980H3w.LLILZ) != null) {
            abstractC1126590fQH.N5();
        }
        DataChannel dataChannel = ((LiveNewGiftPanelWidget) aObserverS221S0100000_17.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GiftPanelSortState.class, obj);
        }
    }

    public static final void onChanged$6(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        C201600q6 c201600q6 = (C201600q6) obj;
        if (c201600q6 != null) {
            LiveAudienceBillboardWidget liveAudienceBillboardWidget = (LiveAudienceBillboardWidget) aObserverS221S0100000_17.l0;
            liveAudienceBillboardWidget.z1(c201600q6);
            if (c201600q6.LIZJ) {
                liveAudienceBillboardWidget.LLILLL = c201600q6;
            }
        }
    }

    public static final void onChanged$60(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        String str = (String) obj;
        if (!((PcsLivePreviewAudienceDecorationWidget) aObserverS221S0100000_17.l0).LLJI && !C2105908Mv.LIZ(str)) {
            if (LivePreviewPerfOptSetting.enablePcsDecorationLazyLoad() && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                ((PcsLivePreviewAudienceDecorationWidget) aObserverS221S0100000_17.l0).M1();
                if (!((PcsLivePreviewAudienceDecorationWidget) aObserverS221S0100000_17.l0).LLJIJIL) {
                    return;
                }
            }
            PcsLivePreviewAudienceDecorationWidget pcsLivePreviewAudienceDecorationWidget = (PcsLivePreviewAudienceDecorationWidget) aObserverS221S0100000_17.l0;
            pcsLivePreviewAudienceDecorationWidget.LLJI = true;
            pcsLivePreviewAudienceDecorationWidget.N1();
            C01TT.LIZJ(new AwS561S0100000_17((PcsLivePreviewAudienceDecorationWidget) aObserverS221S0100000_17.l0, 679));
        }
    }

    public static final void onChanged$7(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        ((BasicPageVH) aObserverS221S0100000_17.l0).LL.getState().LJIILL(BasicPageVH.L5(((BasicPageVH) aObserverS221S0100000_17.l0).LLILZ, ((Boolean) obj).booleanValue()), null);
        ((BasicPageVH) aObserverS221S0100000_17.l0).LL.LJIIJ();
    }

    public static final void onChanged$8(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        ((InterfaceC1078490eAh) aObserverS221S0100000_17.l0).invoke(obj);
    }

    public static final void onChanged$9(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
        Class<? extends LiveRecyclableWidget> clsWq0;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObserverS221S0100000_17.l0;
        if (absAudienceInteractionFragment.LLJZ == null && obj != null && (clsWq0 = ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).wq0()) != null) {
            absAudienceInteractionFragment.LLJZ = absAudienceInteractionFragment.LLJJI.load(R.id.b_v, (Class) clsWq0, false);
        }
    }

    public static final void onChanged$51(AObserverS221S0100000_17 aObserverS221S0100000_17, Object obj) {
    }
}
