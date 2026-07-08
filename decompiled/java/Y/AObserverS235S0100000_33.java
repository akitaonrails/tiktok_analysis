package Y;

import X.ActivityC2186501Ahk;
import X.C013C;
import X.C0IJT;
import X.C0KS8;
import X.C0KSH;
import X.C0KSX;
import X.C0KSY;
import X.C0KVU;
import X.C0TKY;
import X.C0TKZ;
import X.C1095140ebY;
import X.C1097260eey;
import X.C1119920fFW;
import X.C1143680frq;
import X.C1143850fs7;
import X.C1161920gLG;
import X.C1262904wt;
import X.C12ES;
import X.C1309500kBI;
import X.C1324610kZf;
import X.C1336500ksq;
import X.C13BV;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C16G6;
import X.C1724380uyS;
import X.C1819620xS4;
import X.C1889080zG6;
import X.C1891700zKK;
import X.C19677511yn;
import X.C1AAA;
import X.C1AAV;
import X.C1AAZ;
import X.C1ABT;
import X.C1ACA;
import X.C1ACS;
import X.C1ACT;
import X.C1ACU;
import X.C1AD2;
import X.C1AFX;
import X.C1AFY;
import X.C1AFZ;
import X.C1CC2;
import X.C20154213tU;
import X.C20441214yg;
import X.C20684815ws;
import X.C20736316Cj;
import X.C21668519r9;
import X.C2174311A7p;
import X.C2175121AAs;
import X.C2175491ACd;
import X.C2175861ADo;
import X.C2186591Aht;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C285890BIl;
import X.C293570Bf1;
import X.C339190DRl;
import X.C416770GVv;
import X.C419910GdJ;
import X.C446030HeL;
import X.C473250Ih9;
import X.C473410IhP;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C517700KSa;
import X.C518180KTw;
import X.C582620MtA;
import X.C586250Mz1;
import X.C786410Ut5;
import X.EnumC1095410ebz;
import X.EnumC1154870g9t;
import X.EnumC1488260opc;
import X.EnumC1913550ztZ;
import X.EnumC21668319r7;
import X.EnumC2175031AAj;
import X.EnumC2175041AAk;
import X.EnumC744960TKc;
import X.EnumC765980U2y;
import X.InterfaceC1601520rmI;
import X.InterfaceC2186471Ahh;
import X.InterfaceC464060IHs;
import X.InterfaceC480520Iss;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinDialogTitleOverlapFixSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LivePlayerCreateLogicOptExp;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.FansClubJoinDialogV4;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.JoinDialogProxyViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2.superfan.SuperFanPrivilegeContentAssem;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.IEcExtendAlbumAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNewV2;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewControlPlayLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewTopMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.PreviewGameRewardsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessingWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.moment.PreviewGameMomentWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.PreviewEnterRoomGuideWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.hotcomment.PreviewHotCommentWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.paidevent.PaidEventMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.openlive.GoLiveGuideCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.performance.LivePreviewPerformanceWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LiveHighlightsVideoPlayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.serviceplus.PreviewServicePlusBottomInfoWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.setting.LivePreviewLinkPerfSendSetting;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusAbility;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveStatusManagerComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import tikcast.api.fans.GetNonFansUserDataResponse;
import ttpobfuscated.e3;
import webcast.data.SuperFanPrivilege;
import webcast.data.SuperFanPrivilegeInfo;
import webcast.data.TPText;
import wh6.AbS517S0200000_33;

/* JADX INFO: loaded from: classes34.dex */
public class AObserverS235S0100000_33 implements Observer {
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
        }
    }

    public AObserverS235S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r5 == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r5 == 3) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r5 == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = com.zhiliaoapp.musically.R.drawable.bss;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$0(Y.AObserverS235S0100000_33 r7, java.lang.Object r8) {
        /*
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r0 = r7.l0
            androidx.biometric.FingerprintDialogFragment r0 = (androidx.biometric.FingerprintDialogFragment) r0
            android.os.Handler r1 = r0.LL
            Y.ARunnableS133S0100000_33 r0 = r0.LLILLJJLI
            r1.removeCallbacks(r0)
            java.lang.Object r6 = r7.l0
            androidx.biometric.FingerprintDialogFragment r6 = (androidx.biometric.FingerprintDialogFragment) r6
            int r5 = r8.intValue()
            android.widget.ImageView r0 = r6.LLILZLL
            r4 = 1
            r3 = 2
            if (r0 == 0) goto L3d
            androidx.biometric.BiometricViewModel r0 = r6.LLILLL
            int r2 = r0.LLJJJJ
            android.content.Context r1 = r6.getContext()
            if (r1 == 0) goto L3d
            if (r2 != 0) goto L6e
            if (r5 != r4) goto L3d
        L29:
            r0 = 2130971538(0x7f040b92, float:1.7551817E38)
        L2c:
            android.graphics.drawable.Drawable r1 = X.C800330VaR.LIZIZ(r1, r0)
            if (r1 == 0) goto L3d
            android.widget.ImageView r0 = r6.LLILZLL
            r0.setImageDrawable(r1)
            if (r2 != 0) goto L61
        L39:
            androidx.biometric.BiometricViewModel r0 = r6.LLILLL
            r0.LLJJJJ = r5
        L3d:
            java.lang.Object r2 = r7.l0
            androidx.biometric.FingerprintDialogFragment r2 = (androidx.biometric.FingerprintDialogFragment) r2
            int r0 = r8.intValue()
            android.widget.TextView r1 = r2.LLIZ
            if (r1 == 0) goto L50
            if (r0 != r3) goto L5e
            int r0 = r2.LLILZ
        L4d:
            r1.setTextColor(r0)
        L50:
            java.lang.Object r0 = r7.l0
            androidx.biometric.FingerprintDialogFragment r0 = (androidx.biometric.FingerprintDialogFragment) r0
            android.os.Handler r3 = r0.LL
            Y.ARunnableS133S0100000_33 r2 = r0.LLILLJJLI
            r0 = 2000(0x7d0, double:9.88E-321)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
            return
        L5e:
            int r0 = r2.LLILZIL
            goto L4d
        L61:
            if (r2 != r4) goto L69
            if (r5 != r3) goto L39
        L65:
            X.C21541419Sa.LIZ(r1)
            goto L39
        L69:
            if (r2 != r3) goto L39
            if (r5 != r4) goto L39
            goto L65
        L6e:
            if (r2 != r4) goto L76
            if (r5 != r3) goto L7d
            r0 = 2130971537(0x7f040b91, float:1.7551815E38)
            goto L2c
        L76:
            if (r2 != r3) goto L7b
            if (r5 != r4) goto L3d
            goto L29
        L7b:
            if (r2 != r4) goto L3d
        L7d:
            r0 = 3
            if (r5 != r0) goto L3d
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS235S0100000_33.onChanged$0(Y.AObserverS235S0100000_33, java.lang.Object):void");
    }

    public static final void onChanged$1(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) aObserverS235S0100000_33.l0;
        fingerprintDialogFragment.LL.removeCallbacks(fingerprintDialogFragment.LLILLJJLI);
        TextView textView = ((FingerprintDialogFragment) aObserverS235S0100000_33.l0).LLIZ;
        if (textView != null) {
            textView.setText(charSequence);
        }
        FingerprintDialogFragment fingerprintDialogFragment2 = (FingerprintDialogFragment) aObserverS235S0100000_33.l0;
        C786410Ut5.LJLIIL(2000L, fingerprintDialogFragment2.LL, fingerprintDialogFragment2.LLILLJJLI);
    }

    public static final void onChanged$10(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((LabelContainerWidget) aObserverS235S0100000_33.l0).k2();
        }
    }

    public static final void onChanged$11(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (obj == EnumC765980U2y.FINISH_PLAY) {
            ((LabelContainerWidget) aObserverS235S0100000_33.l0).k2();
        }
    }

    public static final void onChanged$12(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        LiveRoomStruct liveRoomStruct;
        LabelContainerWidget labelContainerWidget;
        C1ACA c1acaZ1;
        C1ACA c1acaZ12 = ((LabelContainerWidget) aObserverS235S0100000_33.l0).z1();
        if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null && (c1acaZ1 = (labelContainerWidget = (LabelContainerWidget) aObserverS235S0100000_33.l0).z1()) != null && C1ABT.LJIIJ(c1acaZ1) && liveRoomStruct.liveEventInfo.subscribed && Intrinsics.LJFF(obj, Boolean.FALSE)) {
            labelContainerWidget.k2();
        }
    }

    public static final void onChanged$13(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LivePreviewTopMaskLayerWidget) aObserverS235S0100000_33.l0).M1();
    }

    public static final void onChanged$14(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LivePreviewTopMaskLayerWidget) aObserverS235S0100000_33.l0).M1();
    }

    public static final void onChanged$15(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        if (C1ABT.LJIIIIZZ(((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0).z1())) {
            PreviewGameRewardsWidget previewGameRewardsWidget = (PreviewGameRewardsWidget) aObserverS235S0100000_33.l0;
            if (!previewGameRewardsWidget.LLJJIJIL) {
                previewGameRewardsWidget.P1("show");
            }
            FeedLiveViewHolderVM feedLiveViewHolderVMM1 = ((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0).M1();
            if (feedLiveViewHolderVMM1 == null || (mutableLiveData = feedLiveViewHolderVMM1.LLLIIL) == null || (value = mutableLiveData.getValue()) == null || value.intValue() != 1) {
                PreviewGameRewardsWidget previewGameRewardsWidget2 = (PreviewGameRewardsWidget) aObserverS235S0100000_33.l0;
                previewGameRewardsWidget2.LLJJJ = false;
                previewGameRewardsWidget2.P1("click");
            }
        }
    }

    public static final void onChanged$16(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        PreviewGameRewardsWidget previewGameRewardsWidget = (PreviewGameRewardsWidget) aObserverS235S0100000_33.l0;
        previewGameRewardsWidget.LLJJJ = false;
        previewGameRewardsWidget.O1();
    }

    public static final void onChanged$17(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        PreviewGameGuessingWidget previewGameGuessingWidget = (PreviewGameGuessingWidget) aObserverS235S0100000_33.l0;
        if (!previewGameGuessingWidget.LLJJIJIIJIL && previewGameGuessingWidget.isShowing()) {
            ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).P1("show");
        }
        if (((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).isShowing()) {
            ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).P1("click");
        }
    }

    public static final void onChanged$18(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).O1();
    }

    public static final void onChanged$19(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        PreviewGameMomentWidget previewGameMomentWidget = (PreviewGameMomentWidget) aObserverS235S0100000_33.l0;
        if (!previewGameMomentWidget.LLJJIJIL && previewGameMomentWidget.isShowing()) {
            ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).P1("show");
        }
        if (((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).isShowing()) {
            ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).P1("click");
        }
        PreviewGameMomentWidget previewGameMomentWidget2 = (PreviewGameMomentWidget) aObserverS235S0100000_33.l0;
        if (!previewGameMomentWidget2.LLJJJIL) {
            CountDownTimer countDownTimer = previewGameMomentWidget2.LLJJJ;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            if (((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).isShowing()) {
                ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).O1("show", true);
            } else {
                ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).O1("show", false);
            }
        }
        if (((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).isShowing()) {
            ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).O1("click", true);
        } else {
            ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).O1("click", false);
        }
    }

    public static final void onChanged$2(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        IEcExtendAlbumAbility iEcExtendAlbumAbility;
        List<? extends MediaModel> list = (List) obj;
        if ((!list.isEmpty()) && (iEcExtendAlbumAbility = (IEcExtendAlbumAbility) C1558520qew.LIZ(C1558360qeg.LJI((EcTakePhotoActivity) aObserverS235S0100000_33.l0, null), IEcExtendAlbumAbility.class, null)) != null) {
            EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) aObserverS235S0100000_33.l0;
            if (iEcExtendAlbumAbility.isShown()) {
                iEcExtendAlbumAbility.JB1(list, null);
            } else {
                EcTakePhotoActivity.L(ecTakePhotoActivity, list);
            }
        }
    }

    public static final void onChanged$20(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).N1();
    }

    public static final void onChanged$21(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        LivePreviewGuideEnterVM livePreviewGuideEnterVMN1;
        if (!((Boolean) obj).booleanValue()) {
            if (((PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0).isShowing() && (livePreviewGuideEnterVMN1 = ((PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0).N1()) != null) {
                livePreviewGuideEnterVMN1.CQ2("draw");
            }
            ((PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0).hide();
            LivePreviewGuideEnterVM livePreviewGuideEnterVMN12 = ((PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0).N1();
            if (livePreviewGuideEnterVMN12 != null) {
                livePreviewGuideEnterVMN12.LLILZIL.setValue(Boolean.FALSE);
            }
        }
    }

    public static final void onChanged$22(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        int i = ((C1AAV) obj).LIZIZ;
        if ((i != 1 && i != 2) || !((PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0).isShowing()) {
            return;
        }
        ((PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0).hide();
        LivePreviewGuideEnterVM livePreviewGuideEnterVMN1 = ((PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0).N1();
        if (livePreviewGuideEnterVMN1 == null) {
            return;
        }
        PreviewEnterRoomGuideWidget previewEnterRoomGuideWidget = (PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0;
        livePreviewGuideEnterVMN1.LLILZIL.setValue(Boolean.FALSE);
        LivePreviewGuideEnterVM livePreviewGuideEnterVMN12 = previewEnterRoomGuideWidget.N1();
        if (livePreviewGuideEnterVMN12 == null) {
            return;
        }
        livePreviewGuideEnterVMN12.CQ2("draw");
    }

    public static final void onChanged$23(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        LivePreviewGuideEnterVM livePreviewGuideEnterVMN1;
        if (((PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0).isShowing() && (livePreviewGuideEnterVMN1 = ((PreviewEnterRoomGuideWidget) aObserverS235S0100000_33.l0).N1()) != null) {
            livePreviewGuideEnterVMN1.GQ2();
        }
    }

    public static final void onChanged$24(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).LLJJI = true;
        C20441214yg.LIZIZ("PreviewHotCommentWidget", "can first frame");
        if (((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).N1()) {
            C20441214yg.LIZIZ("PreviewHotCommentWidget", "show");
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).M1(true);
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).show();
            PreviewHotCommentWidget previewHotCommentWidget = (PreviewHotCommentWidget) aObserverS235S0100000_33.l0;
            if (previewHotCommentWidget.LLJILJILJ && !previewHotCommentWidget.LLJJ) {
                previewHotCommentWidget.T1();
            }
        }
    }

    public static final void onChanged$25(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((PaidEventMaskLayerWidget) aObserverS235S0100000_33.l0).isShowing()) {
            C1AAZ c1aaz = C1AAZ.LIZ;
            C1ACA c1acaZ1 = ((PaidEventMaskLayerWidget) aObserverS235S0100000_33.l0).z1();
            c1aaz.getClass();
            Map mapLIZ = C1AAZ.LIZ(c1acaZ1);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJII(mapLIZ);
            C20684815ws.LJIILLIIL("livesdk_paid_event_stop_page_show", c2344009Gk.LIZ);
        }
    }

    public static final void onChanged$26(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C1ACA c1acaZ1;
        C2175861ADo c2175861ADo;
        String str;
        InterfaceC480520Iss interfaceC480520IssLLJJ;
        C1ACA c1acaZ12;
        CopyOnWriteArrayList<Long> copyOnWriteArrayList;
        C1ACA c1acaZ13 = ((LivePreviewPerformanceWidget) aObserverS235S0100000_33.l0).z1();
        if (c1acaZ13 != null && c1acaZ13.LJII) {
            ((LivePreviewPerformanceWidget) aObserverS235S0100000_33.l0).Q1();
            ((LivePreviewPerformanceWidget) aObserverS235S0100000_33.l0).M1();
            LivePreviewPerformanceWidget livePreviewPerformanceWidget = (LivePreviewPerformanceWidget) aObserverS235S0100000_33.l0;
            livePreviewPerformanceWidget.getClass();
            if (((LivePreviewLinkPerfSendSetting.PreviewLinkPerfSendConfig) LivePreviewLinkPerfSendSetting.LIZIZ.getValue()).isEnable && (c1acaZ1 = livePreviewPerformanceWidget.z1()) != null && (c2175861ADo = c1acaZ1.LJIIIZ) != null && (str = c2175861ADo.LIZ) != null && str.length() != 0 && 0 == 0 && (interfaceC480520IssLLJJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLJJ(str, LivePlayerCreateLogicOptExp.isForbidCreate())) != null) {
                long jLJJIIJ = interfaceC480520IssLLJJ.LJJIIJ();
                if (jLJJIIJ > 0 && (c1acaZ12 = livePreviewPerformanceWidget.z1()) != null && (copyOnWriteArrayList = c1acaZ12.LJJIJL) != null) {
                    copyOnWriteArrayList.add(Long.valueOf(jLJJIIJ));
                    return;
                }
                return;
            }
            return;
        }
        ((LivePreviewPerformanceWidget) aObserverS235S0100000_33.l0).LLJI = true;
    }

    public static final void onChanged$27(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        String aid;
        Boolean boolValueOf;
        EnumC2175041AAk enumC2175041AAk;
        Aweme aweme;
        Pair pair = (Pair) obj;
        int i = C1891700zKK.LIZ[((EnumC1913550ztZ) pair.getFirst()).ordinal()];
        if (i != 1 && i != 2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive MEDIA_ERROR/COMPLETE_PLAY  , message:");
        sbLIZ.append(((EnumC1913550ztZ) pair.getFirst()).name());
        sbLIZ.append(", params:");
        sbLIZ.append(pair.getSecond());
        sbLIZ.append("  , roomId:");
        C1ACA c1acaZ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1();
        String strName = null;
        if (c1acaZ1 != null && (aweme = c1acaZ1.LIZIZ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append("  , select:");
        C1ACA c1acaZ12 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1();
        if (c1acaZ12 != null) {
            boolValueOf = Boolean.valueOf(c1acaZ12.LJII);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append("  , scene:");
        LivePreviewPlayerVM livePreviewPlayerVMQ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).Q1();
        if (livePreviewPlayerVMQ1 != null && (enumC2175041AAk = livePreviewPlayerVMQ1.LLJJIJI) != null) {
            strName = enumC2175041AAk.name();
        }
        sbLIZ.append(strName);
        C20441214yg.LIZIZ("LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).P1();
        if (feedLiveViewHolderVMP1 == null) {
            return;
        }
        feedLiveViewHolderVMP1.zQ2(false, false, false, EnumC744960TKc.ON_PLAYER_CALLBACK);
    }

    public static final void onChanged$28(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        LivePreviewPlayerVM livePreviewPlayerVMQ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).Q1();
        if (livePreviewPlayerVMQ1 != null && !livePreviewPlayerVMQ1.LLJJIII) {
            LivePreviewPlayerWidget livePreviewPlayerWidget = (LivePreviewPlayerWidget) aObserverS235S0100000_33.l0;
            livePreviewPlayerWidget.getClass();
            livePreviewPlayerWidget.V1(EnumC2175041AAk.PRE_PULL_AFTER_HIGHLIGHT);
        }
    }

    public static final void onChanged$29(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C2175121AAs c2175121AAs;
        C2175861ADo c2175861ADo;
        LivePreviewPlayerVM livePreviewPlayerVMQ1;
        MutableLiveData<Unit> mutableLiveData;
        EnumC765980U2y enumC765980U2y = (EnumC765980U2y) obj;
        if (enumC765980U2y != null) {
            int i = C0TKY.LIZ[enumC765980U2y.ordinal()];
            if (i != 1 && i != 2) {
                return;
            }
            C1ACA c1acaZ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1();
            if (c1acaZ1 != null && (c2175861ADo = c1acaZ1.LJIIIZ) != null && !c2175861ADo.LIZIZ && (livePreviewPlayerVMQ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).Q1()) != null && (mutableLiveData = livePreviewPlayerVMQ1.LLJILJILJ) != null) {
                mutableLiveData.setValue(Unit.LIZ);
            }
            LivePreviewPlayerWidget livePreviewPlayerWidget = (LivePreviewPlayerWidget) aObserverS235S0100000_33.l0;
            livePreviewPlayerWidget.show();
            livePreviewPlayerWidget.V1(EnumC2175041AAk.HIGHLIGHT_TO_LIVE);
            LivePreviewPlayerVM livePreviewPlayerVMQ12 = livePreviewPlayerWidget.Q1();
            if (livePreviewPlayerVMQ12 != null) {
                livePreviewPlayerVMQ12.LJIILJJIL(false);
            }
            C1ACA c1acaZ12 = livePreviewPlayerWidget.z1();
            if (c1acaZ12 == null || (c2175121AAs = c1acaZ12.LJIIJJI) == null) {
                return;
            }
            c2175121AAs.LJII = System.currentTimeMillis();
        }
    }

    public static final void onChanged$3(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        Collection<C1309500kBI> collectionValues;
        List<C1309500kBI> listLLIIII;
        C1336500ksq c1336500ksq;
        List<? extends MediaModel> list = (List) obj;
        if (list != null && (!list.isEmpty())) {
            C19677511yn c19677511yn = ((AlbumPreviewFragment) aObserverS235S0100000_33.l0).LLJJI;
            if (c19677511yn != null) {
                c19677511yn.LLILLL = list;
                c19677511yn.notifyDataSetChanged();
            }
            EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = ((AlbumPreviewFragment) aObserverS235S0100000_33.l0).LLJI;
            if (ecPhotoSearchAlbumVM != null && (collectionValues = ecPhotoSearchAlbumVM.LL.values()) != null && (listLLIIII = C13LP.LLIIII(collectionValues)) != null && (c1336500ksq = ((AlbumPreviewFragment) aObserverS235S0100000_33.l0).LLJJIII) != null) {
                c1336500ksq.LL = listLLIIII;
                c1336500ksq.notifyDataSetChanged();
            }
        }
    }

    public static final void onChanged$30(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        String str;
        Boolean boolValueOf;
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1;
        Long lValueOf;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1acaZ12 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1();
        Boolean boolValueOf2 = null;
        if (c1acaZ12 != null) {
            str = c1acaZ12.LJ;
        } else {
            str = null;
        }
        if (C293570Bf1.LIZIZ() == 2 && TextUtils.equals(str, "homepage_hot") && (c1acaZ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1()) != null && c1acaZ1.LJII) {
            InterfaceC1601520rmI interfaceC1601520rmIS3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).S3();
            C1ACA c1acaZ13 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1();
            if (c1acaZ13 != null && (liveRoomStruct2 = c1acaZ13.LIZJ) != null) {
                lValueOf = Long.valueOf(liveRoomStruct2.id);
            } else {
                lValueOf = null;
            }
            interfaceC1601520rmIS3.remove(String.valueOf(lValueOf));
        }
        C500260Jjc.LLFFF(((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).contentView);
        C1ACA c1acaZ14 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1();
        if (c1acaZ14 != null) {
            boolValueOf = Boolean.valueOf(c1acaZ14.LJII);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C500260Jjc.LLFFF(((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).contentView);
        } else {
            C1ACA c1acaZ15 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1();
            if (c1acaZ15 != null && (liveRoomStruct = c1acaZ15.LIZJ) != null) {
                boolValueOf2 = Boolean.valueOf(liveRoomStruct.disableScreenRecord);
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                C500260Jjc.LJIILIIL(((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).contentView);
            }
        }
        ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).j2(false);
    }

    public static final void onChanged$31(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C473250Ih9 c473250Ih9 = (C473250Ih9) obj;
        ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).M1(c473250Ih9.LIZ, c473250Ih9.LIZIZ);
    }

    public static final void onChanged$32(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        MutableLiveData<C473250Ih9> mutableLiveData;
        C473250Ih9 value;
        LivePreviewPlayerVM livePreviewPlayerVMQ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).Q1();
        if (livePreviewPlayerVMQ1 != null && (mutableLiveData = livePreviewPlayerVMQ1.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).M1(value.LIZ, value.LIZIZ);
        }
    }

    public static final void onChanged$33(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        View viewBQ2;
        float fLIZJ;
        C2175491ACd c2175491ACdLJJJJLI;
        View view;
        C2174311A7p c2174311A7p = (C2174311A7p) obj;
        if (c2174311A7p != null) {
            LivePreviewPlayerWidget livePreviewPlayerWidget = (LivePreviewPlayerWidget) aObserverS235S0100000_33.l0;
            livePreviewPlayerWidget.getClass();
            int i = c2174311A7p.LIZ;
            int i2 = c2174311A7p.LIZIZ;
            if (i > i2) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                if (((Boolean) C285890BIl.LIZ.getValue()).booleanValue()) {
                    fLIZJ = C12ES.LIZJ(130.0f, livePreviewPlayerWidget.context);
                } else {
                    fLIZJ = C12ES.LIZJ(96.0f, livePreviewPlayerWidget.context);
                }
                layoutParams.topMargin = (int) fLIZJ;
                layoutParams.gravity = 49;
                LivePreviewPlayerVM livePreviewPlayerVMQ1 = livePreviewPlayerWidget.Q1();
                if (livePreviewPlayerVMQ1 != null) {
                    float f = c2174311A7p.LIZJ;
                    C2175491ACd c2175491ACdLJJJJLI2 = livePreviewPlayerVMQ1.LLJLLIL.LJJJJLI();
                    if (c2175491ACdLJJJJLI2 != null) {
                        c2175491ACdLJJJJLI2.LJFF(f);
                    }
                }
                LivePreviewPlayerVM livePreviewPlayerVMQ12 = livePreviewPlayerWidget.Q1();
                if (livePreviewPlayerVMQ12 != null) {
                    livePreviewPlayerVMQ12.HQ2(4);
                }
                LivePreviewPlayerVM livePreviewPlayerVMQ13 = livePreviewPlayerWidget.Q1();
                if (livePreviewPlayerVMQ13 != null) {
                    int i3 = c2174311A7p.LIZ;
                    int i4 = c2174311A7p.LIZIZ;
                    C2175491ACd c2175491ACdLJJJJLI3 = livePreviewPlayerVMQ13.LLJLLIL.LJJJJLI();
                    if (c2175491ACdLJJJJLI3 != null && (view = c2175491ACdLJJJJLI3.LIZ) != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                    C2175491ACd c2175491ACdLJJJJLI4 = livePreviewPlayerVMQ13.LLJLLIL.LJJJJLI();
                    if (c2175491ACdLJJJJLI4 != null) {
                        KeyEvent.Callback callback = c2175491ACdLJJJJLI4.LIZ;
                        if ((callback instanceof InterfaceC464060IHs) && callback != null) {
                            ((InterfaceC464060IHs) callback).setVideoSize(i3, i4);
                        }
                    }
                }
                LivePreviewPlayerVM livePreviewPlayerVMQ14 = livePreviewPlayerWidget.Q1();
                if (livePreviewPlayerVMQ14 != null && (c2175491ACdLJJJJLI = livePreviewPlayerVMQ14.LLJLLIL.LJJJJLI()) != null) {
                    c2175491ACdLJJJJLI.LIZJ(layoutParams);
                    return;
                }
                return;
            }
            livePreviewPlayerWidget.d2(i2, i);
            LivePreviewPlayerVM livePreviewPlayerVMQ15 = livePreviewPlayerWidget.Q1();
            if (livePreviewPlayerVMQ15 == null || (viewBQ2 = livePreviewPlayerVMQ15.BQ2()) == null) {
                return;
            }
            C500260Jjc.LJLJLJ(viewBQ2, true);
        }
    }

    public static final void onChanged$34(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).show();
            return;
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).Q1();
        if (livePreviewPlayerVMQ1 != null) {
            livePreviewPlayerVMQ1.yQ2("liveAlive:false", true);
        }
        ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).hide();
    }

    public static final void onChanged$35(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        LivePreviewPlayerWidget livePreviewPlayerWidget = (LivePreviewPlayerWidget) aObserverS235S0100000_33.l0;
        EnumC2175041AAk enumC2175041AAk = EnumC2175041AAk.OTHERS;
        int i = LivePreviewPlayerWidget.LLLF;
        livePreviewPlayerWidget.V1(enumC2175041AAk);
    }

    public static final void onChanged$36(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        LivePreviewPlayerVM livePreviewPlayerVMQ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).Q1();
        if (livePreviewPlayerVMQ1 != null) {
            livePreviewPlayerVMQ1.LLJLLIL.LJJJJJL();
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ12 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).Q1();
        if (livePreviewPlayerVMQ12 != null) {
            livePreviewPlayerVMQ12.LLJLLIL.s6();
        }
    }

    public static final void onChanged$37(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        LivePreviewPlayerWidget livePreviewPlayerWidget = (LivePreviewPlayerWidget) aObserverS235S0100000_33.l0;
        EnumC2175041AAk enumC2175041AAk = EnumC2175041AAk.OTHERS;
        int i = LivePreviewPlayerWidget.LLLF;
        livePreviewPlayerWidget.V1(enumC2175041AAk);
    }

    public static final void onChanged$38(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        EnumC765980U2y enumC765980U2y = (EnumC765980U2y) obj;
        if (enumC765980U2y != null) {
            int i = C0TKZ.LIZ[enumC765980U2y.ordinal()];
            if (i != 1 && i != 2) {
                return;
            }
            LiveHighlightsVideoPlayerWidget liveHighlightsVideoPlayerWidget = (LiveHighlightsVideoPlayerWidget) aObserverS235S0100000_33.l0;
            View view = liveHighlightsVideoPlayerWidget.contentView;
            if (view != null) {
                C339190DRl.LIZIZ(view);
            }
            C339190DRl.LIZIZ(liveHighlightsVideoPlayerWidget.N1());
            LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO1 = liveHighlightsVideoPlayerWidget.O1();
            if (livePreviewHighlightsPlayerVMO1 != null) {
                livePreviewHighlightsPlayerVMO1.zQ2(EnumC2175031AAj.CHANGE_TO_LIVE_STREAM);
            }
            View view2 = liveHighlightsVideoPlayerWidget.contentView;
            if (view2 == null) {
                return;
            }
            HandlerHook.viewPost(view2, new ARunnableS128S0100000_28(liveHighlightsVideoPlayerWidget, 10));
        }
    }

    public static final void onChanged$39(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C339190DRl.LIZIZ(((LiveHighlightsVideoPlayerWidget) aObserverS235S0100000_33.l0).N1());
    }

    public static final void onChanged$4(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        int i = FeedLiveStatusManagerComponent.LLJLIL;
        FeedLiveStatusAbility feedLiveStatusAbility = (FeedLiveStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(((FeedLiveViewHolderNewV2) aObserverS235S0100000_33.l0).LLILLJJLI, null), FeedLiveStatusAbility.class, null);
        if (feedLiveStatusAbility != null) {
            feedLiveStatusAbility.Cn1();
        }
    }

    public static final void onChanged$40(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C1ACA c1acaZ1 = ((LiveHighlightsVideoPlayerWidget) aObserverS235S0100000_33.l0).z1();
        if (c1acaZ1 != null && c1acaZ1.LJIILIIL) {
            C786410Ut5.LJLIIL(500L, C473410IhP.LIZ(), (Runnable) ((LiveHighlightsVideoPlayerWidget) aObserverS235S0100000_33.l0).LLJJI.getValue());
        }
    }

    public static final void onChanged$41(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        String aid;
        Aweme aweme;
        C582620MtA c582620MtA = (C582620MtA) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("videoActionObserver  scene: ");
        sbLIZ.append(c582620MtA.LIZJ);
        sbLIZ.append(" state: ");
        sbLIZ.append(c582620MtA.LIZLLL);
        C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1() != null) {
            C1ACA c1acaZ1 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1();
            if (c1acaZ1 != null && c1acaZ1.LJII) {
                return;
            }
            C1ACA c1acaZ12 = ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).z1();
            if (c1acaZ12 != null && (aweme = c1acaZ12.LIZ) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(aid, c582620MtA.LIZ)) {
                return;
            }
            if (c582620MtA.LIZLLL) {
                ((LivePreviewPlayerWidget) aObserverS235S0100000_33.l0).S1(false);
                return;
            }
            LivePreviewPlayerWidget livePreviewPlayerWidget = (LivePreviewPlayerWidget) aObserverS235S0100000_33.l0;
            String str = c582620MtA.LIZJ;
            FeedLiveViewHolderVM feedLiveViewHolderVMP1 = livePreviewPlayerWidget.P1();
            if (feedLiveViewHolderVMP1 == null) {
                return;
            }
            long j = C586250Mz1.LIZIZ().keepTime;
            if (C586250Mz1.LIZIZ().resumeUnconditionally) {
                if (feedLiveViewHolderVMP1.LLLFF == C1ACS.PLAYING) {
                    return;
                }
                C1AD2 c1ad2 = feedLiveViewHolderVMP1.LLLI;
                c1ad2.LIZ = EnumC1488260opc.RESUME;
                c1ad2.LIZIZ = str;
                livePreviewPlayerWidget.U1(j, "resumeUnconditionally");
                return;
            }
            C1AD2 c1ad22 = feedLiveViewHolderVMP1.LLLI;
            if (c1ad22.LIZ != EnumC1488260opc.PAUSE || feedLiveViewHolderVMP1.LLLFF != C1ACS.INTERRUPT_STOP) {
                return;
            }
            c1ad22.LIZ = EnumC1488260opc.RESUME;
            c1ad22.LIZIZ = str;
            livePreviewPlayerWidget.U1(j, "resume");
        }
    }

    public static final void onChanged$42(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        PreviewServicePlusBottomInfoWidget previewServicePlusBottomInfoWidget = (PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0;
        previewServicePlusBottomInfoWidget.LLJILJIL = true;
        if (previewServicePlusBottomInfoWidget.LLJILJILJ && !previewServicePlusBottomInfoWidget.LLJIJIL) {
            previewServicePlusBottomInfoWidget.P1();
        }
    }

    public static final void onChanged$43(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LivePreviewControlPlayLayerWidget) aObserverS235S0100000_33.l0).N1();
    }

    public static final void onChanged$44(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LivePreviewControlPlayLayerWidget) aObserverS235S0100000_33.l0).N1();
    }

    public static final void onChanged$45(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LivePreviewInteractionLayerWidget) aObserverS235S0100000_33.l0).N1();
    }

    public static final void onChanged$46(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LivePreviewInteractionLayerWidget) aObserverS235S0100000_33.l0).N1();
    }

    public static final void onChanged$47(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LivePreviewInteractionLayerWidget) aObserverS235S0100000_33.l0).b2();
    }

    public static final void onChanged$48(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LivePreviewInteractionLayerWidget) aObserverS235S0100000_33.l0).b2();
    }

    public static final void onChanged$49(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).O1(2);
        } else {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).N1(2);
        }
    }

    public static final void onChanged$5(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        int i = FeedLiveStatusManagerComponent.LLJLIL;
        FeedLiveStatusAbility feedLiveStatusAbility = (FeedLiveStatusAbility) C1558520qew.LIZ(C1558360qeg.LJFF(((FeedLiveViewHolderNewV2) aObserverS235S0100000_33.l0).LLILLJJLI, null), FeedLiveStatusAbility.class, null);
        if (feedLiveStatusAbility != null) {
            feedLiveStatusAbility.Cn1();
        }
    }

    public static final void onChanged$50(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).O1(4);
        } else {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).N1(4);
        }
    }

    public static final void onChanged$51(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).O1(8);
        } else {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).N1(8);
        }
    }

    public static final void onChanged$52(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).O1(16);
        } else {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).N1(16);
        }
    }

    public static final void onChanged$53(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).O1(32);
        } else {
            ((PreviewServicePlusBottomInfoWidget) aObserverS235S0100000_33.l0).N1(32);
        }
    }

    public static final void onChanged$54(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        Boolean bool = (Boolean) obj;
        ((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0).LLJJ = bool.booleanValue();
        if (Intrinsics.LJFF(bool, Boolean.valueOf(((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0).LLJJIJI))) {
            if (bool.booleanValue()) {
                ((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0).onHide();
            } else {
                PreviewGameRewardsWidget.N1((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0);
            }
        }
    }

    public static final void onChanged$55(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        PreviewGameRewardsWidget previewGameRewardsWidget = (PreviewGameRewardsWidget) aObserverS235S0100000_33.l0;
        boolean z2 = true;
        if (num.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        previewGameRewardsWidget.LLJJI = z;
        if (num.intValue() <= 0) {
            z2 = false;
        }
        if (z2 == ((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0).LLJJIJI) {
            if (num.intValue() > 0) {
                ((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0).onHide();
            } else {
                PreviewGameRewardsWidget.N1((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0);
            }
        }
    }

    public static final void onChanged$56(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        PreviewGameRewardsWidget previewGameRewardsWidget = (PreviewGameRewardsWidget) aObserverS235S0100000_33.l0;
        boolean z2 = true;
        if (num != null && num.intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        previewGameRewardsWidget.LLJJIII = z;
        if (num == null || num.intValue() != 3) {
            z2 = false;
        }
        if (z2 == ((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0).LLJJIJI) {
            if (num != null && num.intValue() == 3) {
                ((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0).onHide();
            } else {
                PreviewGameRewardsWidget.N1((PreviewGameRewardsWidget) aObserverS235S0100000_33.l0);
            }
        }
    }

    public static final void onChanged$57(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ViewGroup.LayoutParams layoutParams;
        CharSequence charSequenceLIZIZ;
        boolean z;
        String str;
        C1095140ebY c1095140ebY;
        C0KS8 c0ks8;
        C0KS8 c0ks82;
        int i;
        boolean zLJJIIZI;
        String str2;
        int i2;
        C0KSY<GetNonFansUserDataResponse.Data> c0ksy;
        GetNonFansUserDataResponse.Data data;
        TPText tPText;
        int i3;
        boolean zIsEnableGift;
        C1262904wt c1262904wt;
        boolean z2;
        RoomAuthStatus roomAuthStatus;
        boolean zBooleanValue;
        JoinDialogViewModel joinDialogViewModel;
        Boolean boolValueOf;
        int i4;
        ViewGroup.LayoutParams layoutParams2;
        int i5;
        FrameLayout.LayoutParams layoutParams3;
        C16F5 c16f5;
        C16F5 c16f52;
        int i6;
        FrameLayout.LayoutParams layoutParams4;
        C1AAA c1aaa = (C1AAA) obj;
        EnumC21668319r7 enumC21668319r7 = c1aaa.LIZ;
        FansClubJoinDialogV4 fansClubJoinDialogV4 = (FansClubJoinDialogV4) aObserverS235S0100000_33.l0;
        if (enumC21668319r7 != fansClubJoinDialogV4.LLLFF || c1aaa.LJFF) {
            fansClubJoinDialogV4.LLLFF = enumC21668319r7;
            int i7 = C21668519r9.LIZ[enumC21668319r7.ordinal()];
            int i8 = 0;
            if (i7 != 1 && i7 != 2) {
                if (i7 != 3) {
                    fansClubJoinDialogV4.wS(false);
                    View view = fansClubJoinDialogV4.LLLJ;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                    C0KSH.LJIIJ(fansClubJoinDialogV4.LLL, fansClubJoinDialogV4.LLJZ, false, false);
                    return;
                }
                fansClubJoinDialogV4.wS(true);
                View view2 = fansClubJoinDialogV4.LLLJ;
                if (view2 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            fansClubJoinDialogV4.wS(false);
            View view3 = fansClubJoinDialogV4.LLLJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            LinearLayout linearLayout = fansClubJoinDialogV4.LLLIIL;
            if (linearLayout != null) {
                C500260Jjc.LJLJJL((int) C497740JfY.LIZIZ(8.0f), linearLayout);
            }
            ConstraintLayout constraintLayout = fansClubJoinDialogV4.LLLIILIL;
            Gift fansClubGift = null;
            if (constraintLayout != null) {
                layoutParams = constraintLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams) != null) {
                if (c1aaa.LIZIZ.size() > 4) {
                    layoutParams4.gravity = 8388611;
                }
                ConstraintLayout constraintLayout2 = fansClubJoinDialogV4.LLLIILIL;
                if (constraintLayout2 != null) {
                    C786410Ut5.m6(constraintLayout2, layoutParams4);
                }
            }
            C16F5 c16f53 = fansClubJoinDialogV4.LLLIL;
            if (c16f53 != null) {
                C786410Ut5.LLJJJJ(c16f53, 8);
            }
            int i9 = 0;
            for (C1889080zG6 c1889080zG6 : fansClubJoinDialogV4.LLLFZ) {
                int i10 = i9 + 1;
                if (i9 >= 0) {
                    C1889080zG6 c1889080zG62 = c1889080zG6;
                    if (i9 < c1aaa.LIZIZ.size()) {
                        LinearLayout linearLayout2 = c1889080zG62.LIZ;
                        if (linearLayout2 != null) {
                            C786410Ut5.LJZL(0, linearLayout2);
                        }
                        C1AFZ c1afz = (C1AFZ) ListProtector.get(c1aaa.LIZIZ, i9);
                        if (c1889080zG62.LIZLLL != null && (c16f5 = fansClubJoinDialogV4.LLLIL) != null && c16f5.getVisibility() == 8 && (c16f52 = fansClubJoinDialogV4.LLLIL) != null) {
                            if (c1afz.LJ) {
                                i6 = 0;
                            } else {
                                i6 = 8;
                            }
                            C786410Ut5.LLJJJJ(c16f52, i6);
                        }
                        if (c1afz.LJFF) {
                            i4 = R.dimen.arc;
                        } else {
                            i4 = R.dimen.arb;
                        }
                        int iLJIIIZ = C497740JfY.LJIIIZ(i4);
                        ImageView imageView = c1889080zG62.LIZIZ;
                        if (imageView != null) {
                            layoutParams2 = imageView.getLayoutParams();
                        } else {
                            layoutParams2 = null;
                        }
                        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams2) != null) {
                            layoutParams3.width = iLJIIIZ;
                            layoutParams3.height = iLJIIIZ;
                            C786410Ut5.c6(c1889080zG62.LIZIZ, layoutParams3);
                        }
                        if (c1afz.LIZ == EnumC1154870g9t.GECKO) {
                            C1AFY c1afy = c1afz.LIZIZ;
                            if (c1afy != null) {
                                C1143680frq.LIZLLL(c1889080zG62.LIZIZ, c1afy.LIZ, c1afy.LIZIZ);
                            }
                            View view4 = c1889080zG62.LIZLLL;
                            if (view4 != null) {
                                C786410Ut5.LJLLLLLL(8, view4);
                            }
                        } else {
                            ImageModel imageModel = c1afz.LIZJ;
                            if (imageModel != null) {
                                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                                c1324610kZfLJIIIZ.LJIILIIL = Boolean.valueOf(c1afz.LJI);
                                c1324610kZfLJIIIZ.LJJI(c1889080zG62.LIZIZ);
                            }
                            View view5 = c1889080zG62.LIZLLL;
                            if (view5 != null) {
                                if (c1afz.LJFF) {
                                    i5 = 0;
                                } else {
                                    i5 = 8;
                                }
                                C786410Ut5.LJLLLLLL(i5, view5);
                            }
                        }
                        C16F5 c16f54 = c1889080zG62.LIZJ;
                        if (c16f54 != null) {
                            c16f54.setText(c1afz.LIZLLL);
                        }
                    } else {
                        LinearLayout linearLayout3 = c1889080zG62.LIZ;
                        if (linearLayout3 != null) {
                            C786410Ut5.LJZL(8, linearLayout3);
                        }
                    }
                    i9 = i10;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C1AFY c1afy2 = c1aaa.LIZJ;
            if (c1afy2 != null) {
                ImageView imageView2 = fansClubJoinDialogV4.LLLIIIL;
                if (imageView2 != null) {
                    ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                    if (layoutParams5 != null) {
                        layoutParams5.width = (int) C497740JfY.LIZIZ(c1afy2.LIZJ);
                        layoutParams5.height = (int) C497740JfY.LIZIZ(c1afy2.LIZLLL);
                    } else {
                        layoutParams5 = null;
                    }
                    C786410Ut5.c6(imageView2, layoutParams5);
                }
                C1143680frq.LIZLLL(fansClubJoinDialogV4.LLLIIIL, c1afy2.LIZ, c1afy2.LIZIZ);
            }
            C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ(UserService.getInstance().user().getCurrentUser().getAvatarThumb());
            c1324610kZfLJIIIZ2.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ2.LJIIIZ = R.drawable.eze;
            c1324610kZfLJIIIZ2.LJJI(fansClubJoinDialogV4.LLLII);
            EnumC21668319r7 enumC21668319r72 = fansClubJoinDialogV4.LLLFF;
            EnumC21668319r7 enumC21668319r73 = EnumC21668319r7.FANS_CLUB;
            if (enumC21668319r72 == enumC21668319r73) {
                IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
                if (iGiftService != null) {
                    fansClubGift = iGiftService.getFansClubGift();
                }
                String strLJJIII = u.LJJIII(C497740JfY.LJIJI(2131853146), "%@", e3.d, false);
                if (fansClubGift != null) {
                    i3 = fansClubGift.diamondCount;
                } else {
                    i3 = 1;
                }
                String strLJJIII2 = u.LJJIII(strLJJIII, "%d", String.valueOf(i3), false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJJIII2);
                Context context = fansClubJoinDialogV4.getContext();
                if (context != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_color_tiktok_coin;
                    Drawable drawableMutate = c419910GdJ.LIZ(context).mutate();
                    drawableMutate.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
                    C16G6.LIZIZ(drawableMutate, C497740JfY.LJJ() ? 1 : 0);
                    C416770GVv c416770GVv = new C416770GVv(drawableMutate);
                    int iLJJJ = a0.LJJJ(strLJJIII2, e3.d, 0, false, 6);
                    if (iLJJJ > 0) {
                        C786410Ut5.q2(spannableStringBuilder, c416770GVv, iLJJJ, iLJJJ + 1, 34);
                    }
                    C16FS c16fs = fansClubJoinDialogV4.LLLI;
                    if (c16fs != null) {
                        c16fs.setText(spannableStringBuilder);
                    }
                }
                DataChannel dataChannelLJ = fansClubJoinDialogV4.LLL;
                if (dataChannelLJ == null) {
                    dataChannelLJ = C475510Ikn.LJ(fansClubJoinDialogV4);
                }
                String strLJIJI = "";
                if (dataChannelLJ == null) {
                    c1262904wt = new C1262904wt(true, "");
                } else {
                    boolean zIsFansCLubGiftLimited = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).isFansCLubGiftLimited(dataChannelLJ);
                    Room room = (Room) dataChannelLJ.gg0(RoomChannel.class);
                    if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null) {
                        zIsEnableGift = roomAuthStatus.isEnableGift();
                    } else {
                        zIsEnableGift = true;
                    }
                    boolean z3 = !zIsEnableGift;
                    if (zIsFansCLubGiftLimited) {
                        strLJIJI = C497740JfY.LJIJI(2131852369);
                    } else if (z3) {
                        strLJIJI = C497740JfY.LJIJI(2131841954);
                    }
                    if (!zIsFansCLubGiftLimited && !z3) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    c1262904wt = new C1262904wt(z2, strLJIJI);
                }
                if (c1262904wt.LIZ) {
                    String str3 = c1aaa.LJ;
                    if (str3 != null) {
                        C16FS c16fs2 = fansClubJoinDialogV4.LLLI;
                        if (c16fs2 != null) {
                            C786410Ut5.j5(c16fs2, 0.4f);
                        }
                        C16FS c16fs3 = fansClubJoinDialogV4.LLLI;
                        if (c16fs3 != null) {
                            c16fs3.setBackgroundTintList(ColorStateList.valueOf(ColorProtector.parseColor(str3)));
                        }
                    }
                    C16FS c16fs4 = fansClubJoinDialogV4.LLLI;
                    if (c16fs4 != null) {
                        C786410Ut5.h8(c16fs4, new ACListenerS135S0200000_33(c1262904wt, fansClubJoinDialogV4, 14));
                    }
                } else {
                    String str4 = c1aaa.LJ;
                    if (str4 != null) {
                        C16FS c16fs5 = fansClubJoinDialogV4.LLLI;
                        if (c16fs5 != null) {
                            C786410Ut5.j5(c16fs5, 1.0f);
                        }
                        C16FS c16fs6 = fansClubJoinDialogV4.LLLI;
                        if (c16fs6 != null) {
                            c16fs6.setBackgroundTintList(ColorStateList.valueOf(ColorProtector.parseColor(str4)));
                        }
                    }
                    C16FS c16fs7 = fansClubJoinDialogV4.LLLI;
                    if (c16fs7 != null) {
                        c16fs7.setTextColor(C20736316Cj.LIZIZ(R.attr.eyw, fansClubJoinDialogV4.getContext()));
                    }
                    C16FS c16fs8 = fansClubJoinDialogV4.LLLI;
                    if (c16fs8 != null) {
                        C786410Ut5.h8(c16fs8, new ACListenerS167S0100000_33(fansClubJoinDialogV4, 87));
                    }
                }
                DataChannel dataChannel = fansClubJoinDialogV4.LLL;
                String str5 = fansClubJoinDialogV4.LLJZ;
                Boolean boolValueOf2 = Boolean.valueOf(!c1262904wt.LIZ);
                Integer numValueOf = Integer.valueOf(fansClubJoinDialogV4.LLJLLL.LL);
                JoinDialogProxyViewModel joinDialogProxyViewModel = fansClubJoinDialogV4.LLJZIJLIL;
                if (joinDialogProxyViewModel != null && (joinDialogViewModel = joinDialogProxyViewModel.LL) != null && (boolValueOf = Boolean.valueOf(joinDialogViewModel.LLJI)) != null) {
                    zBooleanValue = boolValueOf.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                C518180KTw.LJIILLIIL(dataChannel, "show", str5, boolValueOf2, "", numValueOf, zBooleanValue, "");
                C518180KTw.LJJIIJZLJL(fansClubJoinDialogV4.LLL, fansClubJoinDialogV4.LLJZ, "fan", fansClubJoinDialogV4.LLJLLL.LL, !c1262904wt.LIZ, false, fansClubJoinDialogV4.yS());
            } else if (enumC21668319r72 == EnumC21668319r7.SUPER_FAN) {
                C16FS c16fs9 = fansClubJoinDialogV4.LLLI;
                if (c16fs9 != null) {
                    c16fs9.setPadding((int) C497740JfY.LIZIZ(12.0f), 0, (int) C497740JfY.LIZIZ(12.0f), 0);
                }
                C1AFX c1afx = c1aaa.LIZLLL;
                if (c1afx != null && (c0ks82 = c1afx.LIZIZ) != null) {
                    charSequenceLIZIZ = C517700KSa.LIZIZ(fansClubJoinDialogV4.getContext(), c0ks82);
                } else {
                    charSequenceLIZIZ = null;
                }
                C013C c013c = new C013C();
                c013c.element = true;
                C1AFX c1afx2 = c1aaa.LIZLLL;
                if (c1afx2 != null && (c0ks8 = c1afx2.LIZIZ) != null && c0ks8.LIZIZ != null && C0KSX.LIZIZ(c1afx2.LIZ)) {
                    String str6 = c1aaa.LJ;
                    if (str6 != null) {
                        C16FS c16fs10 = fansClubJoinDialogV4.LLLI;
                        if (c16fs10 != null) {
                            C786410Ut5.j5(c16fs10, 1.0f);
                        }
                        C16FS c16fs11 = fansClubJoinDialogV4.LLLI;
                        if (c16fs11 != null) {
                            c16fs11.setBackgroundTintList(ColorStateList.valueOf(ColorProtector.parseColor(str6)));
                        }
                    }
                } else {
                    String str7 = c1aaa.LJ;
                    if (str7 != null) {
                        C16FS c16fs12 = fansClubJoinDialogV4.LLLI;
                        if (c16fs12 != null) {
                            C786410Ut5.j5(c16fs12, 0.4f);
                        }
                        C16FS c16fs13 = fansClubJoinDialogV4.LLLI;
                        if (c16fs13 != null) {
                            c16fs13.setBackgroundTintList(ColorStateList.valueOf(ColorProtector.parseColor(str7)));
                        }
                    }
                    c013c.element = false;
                }
                C16FS c16fs14 = fansClubJoinDialogV4.LLLI;
                if (c16fs14 != null) {
                    c16fs14.setText(charSequenceLIZIZ);
                }
                C16FS c16fs15 = fansClubJoinDialogV4.LLLI;
                if (c16fs15 != null) {
                    C786410Ut5.I7(new AbS517S0200000_33(fansClubJoinDialogV4, c013c, 4), c16fs15);
                }
                boolean z4 = c013c.element;
                JoinDialogProxyViewModel joinDialogProxyViewModel2 = fansClubJoinDialogV4.LLJZIJLIL;
                if (joinDialogProxyViewModel2 != null) {
                    z = joinDialogProxyViewModel2.LLILZ;
                } else {
                    z = false;
                }
                EnumC1095410ebz enumC1095410ebz = fansClubJoinDialogV4.LLLF;
                if (enumC1095410ebz == EnumC1095410ebz.BOTH) {
                    C518180KTw.LJJIIJZLJL(fansClubJoinDialogV4.LLL, fansClubJoinDialogV4.LLJZ, "superfan", -1, z4, z, fansClubJoinDialogV4.yS());
                } else if (enumC1095410ebz == EnumC1095410ebz.ONLY_SUPER_FAN) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_superfan_purchase_page_show");
                    c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(fansClubJoinDialogV4));
                    c474500IjALIZ.LJJII(fansClubJoinDialogV4.LLJZ, "source_page");
                    DataChannel dataChannel2 = fansClubJoinDialogV4.LLL;
                    if (dataChannel2 != null && (c1095140ebY = (C1095140ebY) dataChannel2.gg0(FansClubChannel.class)) != null) {
                        c474500IjALIZ.LJJII(Long.valueOf(c1095140ebY.LIZ), "fans_club_level");
                        c474500IjALIZ.LJJII(C518180KTw.LJJII(c1095140ebY.LJ, c1095140ebY.LIZ, false), "fans_club_status");
                    }
                    if (z) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c474500IjALIZ.LJJII(str, "if_discount");
                    c474500IjALIZ.LIZ();
                }
                C0KSH.LJIIJ(fansClubJoinDialogV4.LLL, fansClubJoinDialogV4.LLJZ, true, z4);
            }
            try {
                C1AFX c1afx3 = c1aaa.LIZLLL;
                if (c1afx3 != null && (c0ksy = c1afx3.LIZ) != null && (data = c0ksy.LIZ) != null && (tPText = data.noticeBoard) != null) {
                    C16F5 c16f55 = fansClubJoinDialogV4.LLLILZ;
                    if (c16f55 != null) {
                        c16f55.setText(C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText));
                    }
                } else {
                    String strLIZ = C0KVU.LIZ(C500260Jjc.LJIIIIZZ(fansClubJoinDialogV4.LLL));
                    String strLJIJJ = C497740JfY.LJIJJ(2131852386, strLIZ);
                    int iLJJJ2 = a0.LJJJ(strLJIJJ, strLIZ, 0, false, 6);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strLJIJJ);
                    int length = C0KVU.LIZ(C500260Jjc.LJIIIIZZ(fansClubJoinDialogV4.LLL)).length() + iLJJJ2;
                    if (strLJIJJ != null) {
                        zLJJIIZI = a0.LJJIIZI(strLJIJJ, "'s", false);
                    } else {
                        zLJJIIZI = false;
                    }
                    if (zLJJIIZI && C1097260eey.LIZ() && (i2 = length + 2) <= strLJIJJ.length()) {
                        spannableStringBuilder2.insert(i2, (CharSequence) " ");
                        length = i2;
                    } else if (FansClubJoinDialogTitleOverlapFixSetting.INSTANCE.getValue() && length < spannableStringBuilder2.length()) {
                        spannableStringBuilder2.insert(length, (CharSequence) " ");
                    }
                    if (iLJJJ2 >= 0 && length <= strLJIJJ.length()) {
                        C1119920fFW.LJ(fansClubJoinDialogV4.getContext(), spannableStringBuilder2, iLJJJ2, length, 33, 1, OppoPermissionPopupMaskDelayExp.DEFAULT);
                        if (c1aaa.LIZ == enumC21668319r73) {
                            str2 = "#FF5E3A";
                        } else {
                            str2 = "#B47827";
                        }
                        C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(Color.parseColor(str2)), iLJJJ2, length, 33);
                        C786410Ut5.q2(spannableStringBuilder2, new StyleSpan(2), iLJJJ2, length, 33);
                    }
                    C16F5 c16f56 = fansClubJoinDialogV4.LLLILZ;
                    if (c16f56 != null) {
                        c16f56.setText(spannableStringBuilder2);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("fans club join dialog title exception", e);
            }
            C16F5 c16f57 = fansClubJoinDialogV4.LLLIIII;
            if (c16f57 != null) {
                if (c1aaa.LIZ == EnumC21668319r7.FANS_CLUB) {
                    i = 0;
                } else {
                    i = 4;
                }
                C786410Ut5.LLJJJJ(c16f57, i);
            }
            C16F5 c16f58 = fansClubJoinDialogV4.LLLIIIIL;
            if (c16f58 == null) {
                return;
            }
            if (c1aaa.LIZ != EnumC21668319r7.SUPER_FAN) {
                i8 = 4;
            }
            C786410Ut5.LLJJJJ(c16f58, i8);
        }
    }

    public static final void onChanged$58(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        Boolean bool = (Boolean) obj;
        ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).LLJJ = bool.booleanValue();
        if (Intrinsics.LJFF(bool, Boolean.valueOf(((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).isShowing()))) {
            if (bool.booleanValue()) {
                ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).onHide();
            } else {
                ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).N1(true);
            }
        }
    }

    public static final void onChanged$59(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        PreviewGameGuessingWidget previewGameGuessingWidget = (PreviewGameGuessingWidget) aObserverS235S0100000_33.l0;
        boolean z2 = false;
        if (num.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        previewGameGuessingWidget.LLJJI = z;
        if (num.intValue() > 0) {
            z2 = true;
        }
        if (z2 == ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).isShowing()) {
            if (num.intValue() > 0) {
                ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).onHide();
            } else {
                ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).N1(true);
            }
        }
    }

    public static final void onChanged$6(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            LiveWatchPreviewWidget liveWatchPreviewWidget = (LiveWatchPreviewWidget) aObserverS235S0100000_33.l0;
            int iIntValue = num.intValue();
            C1ACU c1acu = (C1ACU) liveWatchPreviewWidget.LLILLL.getValue();
            if (!c1acu.LJIIJ && c1acu.LJIIIIZZ != iIntValue) {
                try {
                    c1acu.LJIIJ = true;
                    while (c1acu.LJIIIIZZ != iIntValue) {
                        List<Integer> listLIZ = c1acu.LIZ(iIntValue);
                        if (!listLIZ.isEmpty()) {
                            Iterator<Integer> it2 = listLIZ.iterator();
                            while (it2.hasNext()) {
                                int iIntValue2 = it2.next().intValue();
                                c1acu.LIZIZ(iIntValue2);
                                c1acu.LJIIIIZZ = iIntValue2;
                                if (iIntValue2 == C1ACT.BIND.getState()) {
                                    c1acu.LJIIIZ = true;
                                } else if (iIntValue2 == C1ACT.UNBIND.getState()) {
                                    c1acu.LJIIIZ = false;
                                }
                            }
                            iIntValue = c1acu.LJII.invoke().intValue();
                            if (iIntValue == c1acu.LJIIIIZZ) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    c1acu.LJIIJ = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1acu.LJIIJ = false;
                    throw th;
                }
            }
        }
    }

    public static final void onChanged$60(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        PreviewGameGuessingWidget previewGameGuessingWidget = (PreviewGameGuessingWidget) aObserverS235S0100000_33.l0;
        boolean z2 = false;
        if (num != null && num.intValue() == 3) {
            z = true;
        } else {
            z = false;
        }
        previewGameGuessingWidget.LLJJIII = z;
        if (num != null && num.intValue() == 3) {
            z2 = true;
        }
        if (z2 == ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).isShowing()) {
            if (num != null && num.intValue() == 3) {
                ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).onHide();
            } else {
                ((PreviewGameGuessingWidget) aObserverS235S0100000_33.l0).N1(true);
            }
        }
    }

    public static final void onChanged$61(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        Boolean bool = (Boolean) obj;
        ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).LLJJIII = bool.booleanValue();
        if (Intrinsics.LJFF(bool, Boolean.valueOf(((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).isShowing()))) {
            if (bool.booleanValue()) {
                ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).k(true);
                ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).LLLLLZIL("higher_priority_showing", "", "", "", "ecommerce");
            } else {
                ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).x(null);
            }
        }
    }

    public static final void onChanged$62(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        PreviewGameMomentWidget previewGameMomentWidget = (PreviewGameMomentWidget) aObserverS235S0100000_33.l0;
        boolean z2 = false;
        if (num.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        previewGameMomentWidget.LLJJIJI = z;
        if (num.intValue() > 0) {
            z2 = true;
        }
        if (z2 == ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).isShowing()) {
            if (num.intValue() > 0) {
                ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).k(true);
                ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).LLLLLZIL("higher_priority_showing", "", "", "", "ecommerce");
            } else {
                ((PreviewGameMomentWidget) aObserverS235S0100000_33.l0).x(null);
            }
        }
    }

    public static final void onChanged$63(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C2186591Aht c2186591Aht = (C2186591Aht) obj;
        ((ActivityC2186501Ahk) aObserverS235S0100000_33.l0).LJIIL();
        int i = c2186591Aht.LIZ;
        if (i == 1) {
            ((ActivityC2186501Ahk) aObserverS235S0100000_33.l0).LLLZ(i, c2186591Aht.LIZIZ, c2186591Aht.LIZJ, c2186591Aht.LIZLLL, "local");
            return;
        }
        if (i == 0 && c2186591Aht.LIZIZ == 107) {
            ActivityC2186501Ahk activityC2186501Ahk = (ActivityC2186501Ahk) aObserverS235S0100000_33.l0;
            activityC2186501Ahk.getClass();
            activityC2186501Ahk.LLZZLLIL(C1724380uyS.LIZ("pipo_payin_dropin_cashier_networkerror_statement"));
            ((ActivityC2186501Ahk) aObserverS235S0100000_33.l0).LLZLI();
            return;
        }
        ((ActivityC2186501Ahk) aObserverS235S0100000_33.l0).LLZZLLIL(C1724380uyS.LIZ("pipo_payin_instruction_OCR_toast_no_cardNO"));
        ((ActivityC2186501Ahk) aObserverS235S0100000_33.l0).LLZLI();
    }

    public static final void onChanged$64(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C20154213tU c20154213tU = (C20154213tU) obj;
        InterfaceC2186471Ahh interfaceC2186471Ahh = (InterfaceC2186471Ahh) aObserverS235S0100000_33.l0;
        if (interfaceC2186471Ahh != null) {
            interfaceC2186471Ahh.setErrorMsg(c20154213tU.LIZIZ);
        }
    }

    public static final void onChanged$65(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C20154213tU c20154213tU = (C20154213tU) obj;
        InterfaceC2186471Ahh interfaceC2186471Ahh = (InterfaceC2186471Ahh) aObserverS235S0100000_33.l0;
        if (interfaceC2186471Ahh != null) {
            interfaceC2186471Ahh.setErrorMsg(c20154213tU.LIZIZ);
        }
    }

    public static final void onChanged$66(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C20154213tU c20154213tU = (C20154213tU) obj;
        InterfaceC2186471Ahh interfaceC2186471Ahh = (InterfaceC2186471Ahh) aObserverS235S0100000_33.l0;
        if (interfaceC2186471Ahh != null) {
            interfaceC2186471Ahh.setErrorMsg(c20154213tU.LIZIZ);
        }
    }

    public static final void onChanged$67(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        List<SuperFanPrivilegeInfo> list;
        int i;
        C0KSY<GetNonFansUserDataResponse.Data> c0ksy;
        GetNonFansUserDataResponse.Data data;
        SuperFanPrivilege superFanPrivilege;
        C1AAA c1aaa = (C1AAA) obj;
        if (c1aaa.LIZ == EnumC21668319r7.SUPER_FAN) {
            SuperFanPrivilegeContentAssem superFanPrivilegeContentAssem = (SuperFanPrivilegeContentAssem) aObserverS235S0100000_33.l0;
            C1AFX c1afx = c1aaa.LIZLLL;
            if (c1afx == null || (c0ksy = c1afx.LIZ) == null || (data = c0ksy.LIZ) == null || (superFanPrivilege = data.superFanPrivilegeInfo) == null || (list = superFanPrivilege.privilegeDetails) == null) {
                list = C13BV.INSTANCE;
            }
            superFanPrivilegeContentAssem.LLJJJIL = list;
            C446030HeL c446030HeL = superFanPrivilegeContentAssem.LLJJIII;
            if (c446030HeL != null) {
                ((ArrayList) c446030HeL.LL).clear();
                ((ArrayList) c446030HeL.LL).addAll(list);
                c446030HeL.notifyDataSetChanged();
            }
            RecyclerView recyclerView = superFanPrivilegeContentAssem.LLJJI;
            if (recyclerView != null) {
                if (list.isEmpty()) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LLIZLLLIL(recyclerView, i);
            }
            superFanPrivilegeContentAssem.hp();
            RecyclerView recyclerView2 = superFanPrivilegeContentAssem.LLJJI;
            if (recyclerView2 != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(recyclerView2, new ARunnableS97S0200000_28(recyclerView2, superFanPrivilegeContentAssem, 35));
            }
            superFanPrivilegeContentAssem.ip(list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$68(Y.AObserverS235S0100000_33 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS235S0100000_33.onChanged$68(Y.AObserverS235S0100000_33, java.lang.Object):void");
    }

    public static final void onChanged$69(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        List listLLIIII;
        Collection<C1309500kBI> collectionValues;
        List<? extends MediaModel> list = (List) obj;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        C19677511yn c19677511yn = ((AlbumPreviewFragment) aObserverS235S0100000_33.l0).LLJJI;
        if (c19677511yn != null) {
            c19677511yn.LLILLL = list;
            c19677511yn.notifyDataSetChanged();
        }
        AlbumPreviewFragment albumPreviewFragment = (AlbumPreviewFragment) aObserverS235S0100000_33.l0;
        EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = albumPreviewFragment.LLJI;
        Context context = null;
        if (ecPhotoSearchAlbumVM == null || (collectionValues = ecPhotoSearchAlbumVM.LL.values()) == null || (listLLIIII = C13LP.LLIIII(collectionValues)) == null) {
            listLLIIII = C13BV.INSTANCE;
        }
        View view = albumPreviewFragment.LLILZIL;
        if (view != null) {
            context = view.getContext();
        }
        albumPreviewFragment.NR(context, listLLIIII);
    }

    public static final void onChanged$7(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        C500260Jjc.LJLJLJ(((InteractionContainerWidget) aObserverS235S0100000_33.l0).M1(), !((Boolean) obj).booleanValue());
    }

    public static final void onChanged$70(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).S1(2);
        } else {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).R1(2);
        }
    }

    public static final void onChanged$71(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).S1(4);
        } else {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).R1(4);
        }
    }

    public static final void onChanged$72(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).S1(8);
        } else {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).R1(8);
        }
    }

    public static final void onChanged$73(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).S1(16);
        } else {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).R1(16);
        }
    }

    public static final void onChanged$74(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).S1(18);
        } else {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).R1(18);
        }
    }

    public static final void onChanged$75(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Integer) obj).intValue() > 0) {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).S1(32);
        } else {
            ((PreviewHotCommentWidget) aObserverS235S0100000_33.l0).R1(32);
        }
    }

    public static final void onChanged$76(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).B1();
    }

    public static final void onChanged$77(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).J1();
    }

    public static final void onChanged$78(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).E1();
    }

    public static final void onChanged$79(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        int state;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        Integer num = (Integer) obj;
        ViewHolderStatusVM viewHolderStatusVMY1 = ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).y1();
        if (viewHolderStatusVMY1 != null && (mutableLiveData = viewHolderStatusVMY1.LLJJI) != null && (value = mutableLiveData.getValue()) != null) {
            state = value.intValue();
        } else {
            state = C1ACT.PAUSE.getState();
        }
        if (state >= C1ACT.PAUSE.getState()) {
            LiveWatchPreviewWidget liveWatchPreviewWidget = (LiveWatchPreviewWidget) aObserverS235S0100000_33.l0;
            liveWatchPreviewWidget.getClass();
            if (liveWatchPreviewWidget instanceof GoLiveGuideCardWidget) {
                ViewHolderStatusVM viewHolderStatusVMY12 = ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).y1();
                if (viewHolderStatusVMY12 != null && viewHolderStatusVMY12.LLJILLL) {
                    ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).LJLIIIL(num.intValue());
                    return;
                }
                return;
            }
            ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).LJLIIIL(num.intValue());
        }
    }

    public static final void onChanged$8(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((LabelContainerWidget) aObserverS235S0100000_33.l0).k2();
        }
    }

    public static final void onChanged$80(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        int state;
        String aid;
        ViewHolderStatusVM viewHolderStatusVMY1;
        Aweme aweme;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        ViewHolderStatusVM viewHolderStatusVMY12 = ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).y1();
        if (viewHolderStatusVMY12 != null && (mutableLiveData = viewHolderStatusVMY12.LLJJI) != null && (value = mutableLiveData.getValue()) != null) {
            state = value.intValue();
        } else {
            state = C1ACT.UNSELECTED.getState();
        }
        if (state >= C1ACT.UNSELECTED.getState()) {
            LiveWatchPreviewWidget liveWatchPreviewWidget = (LiveWatchPreviewWidget) aObserverS235S0100000_33.l0;
            liveWatchPreviewWidget.getClass();
            if (liveWatchPreviewWidget instanceof GoLiveGuideCardWidget) {
                C1ACA c1acaZ1 = ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).z1();
                if (c1acaZ1 != null && (aweme = c1acaZ1.LIZIZ) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(obj, aid) && (viewHolderStatusVMY1 = ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).y1()) != null && !viewHolderStatusVMY1.LLJJ) {
                    ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).L1();
                    return;
                }
                return;
            }
            ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).L1();
        }
    }

    public static final void onChanged$81(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        int state;
        String aid;
        Aweme aweme;
        MutableLiveData<Integer> mutableLiveData;
        Integer value;
        ViewHolderStatusVM viewHolderStatusVMY1 = ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).y1();
        if (viewHolderStatusVMY1 != null && (mutableLiveData = viewHolderStatusVMY1.LLJJI) != null && (value = mutableLiveData.getValue()) != null) {
            state = value.intValue();
        } else {
            state = C1ACT.UNBIND.getState();
        }
        if (state >= C1ACT.UNBIND.getState()) {
            LiveWatchPreviewWidget liveWatchPreviewWidget = (LiveWatchPreviewWidget) aObserverS235S0100000_33.l0;
            liveWatchPreviewWidget.getClass();
            if (liveWatchPreviewWidget instanceof PreviewHotCommentWidget) {
                C1ACA c1acaZ1 = ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).z1();
                if (c1acaZ1 != null && (aweme = c1acaZ1.LIZIZ) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(obj, aid)) {
                    ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).H1();
                    return;
                }
                return;
            }
            ((LiveWatchPreviewWidget) aObserverS235S0100000_33.l0).H1();
        }
    }

    public static final void onChanged$9(AObserverS235S0100000_33 aObserverS235S0100000_33, Object obj) {
        ((LabelContainerWidget) aObserverS235S0100000_33.l0).k2();
    }
}
