package Y;

import X.AbstractC928510aGn;
import X.C01GW;
import X.C07ND;
import X.C07NE;
import X.C0IR2;
import X.C0IYA;
import X.C0J1N;
import X.C0N67;
import X.C0U3O;
import X.C0UDD;
import X.C1103220eoa;
import X.C1113800f5e;
import X.C1119700fFA;
import X.C1121670fIL;
import X.C1126540fQC;
import X.C1143920fsE;
import X.C1143950fsH;
import X.C1161920gLG;
import X.C11S5;
import X.C1324720kZq;
import X.C13E8;
import X.C1701940uOG;
import X.C1AF0;
import X.C1AZW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C307001Gy;
import X.C464920ILa;
import X.C465520INi;
import X.C465610INr;
import X.C473410IhP;
import X.C480460Ism;
import X.C489080JFy;
import X.C497740JfY;
import X.C497750JfZ;
import X.C755560TkQ;
import X.C757730Tnv;
import X.C782680Un4;
import X.C784440Upu;
import X.C786410Ut5;
import X.C914630ZuP;
import X.C915980Zwa;
import X.C917810ZzX;
import X.C917860Zzc;
import X.C918080Zzy;
import X.C920570a3z;
import X.C921170a4x;
import X.C921920a6A;
import X.C922430a6z;
import X.C924810aAp;
import X.C925150aBN;
import X.C925600aC6;
import X.C925610aC7;
import X.C925630aC9;
import X.C927240aEk;
import X.C927390aEz;
import X.C927600aFK;
import X.C927820aFg;
import X.C927880aFm;
import X.C930480aJy;
import X.C930510aK1;
import X.C931800aM6;
import X.C931970aMN;
import X.C932270aMr;
import X.C934320aQA;
import X.C934350aQD;
import X.C943590af7;
import X.C943850afX;
import X.C943870afZ;
import X.C944270agD;
import X.C944450agV;
import X.C944610agl;
import X.C944630agn;
import X.C944860ahA;
import X.C945010ahP;
import X.C945060ahU;
import X.C948450amx;
import X.C949040anu;
import X.C950110apd;
import X.C950220apo;
import X.C950360aq2;
import X.C952490atT;
import X.C952540atY;
import X.C955010axX;
import X.C955400ayA;
import X.C955540ayO;
import X.C956040azC;
import X.C956380azk;
import X.C956670b0D;
import X.C956740b0K;
import X.C956900b0a;
import X.C959600b4w;
import X.C959910b5R;
import X.C960830b6v;
import X.C960840b6w;
import X.C960850b6x;
import X.C960860b6y;
import X.C961300b7g;
import X.C961760b8Q;
import X.C963860bBo;
import X.EnumC1120860fH2;
import X.EnumC919210a1n;
import X.EnumC921570a5b;
import X.EnumC925190aBR;
import X.EnumC943760afO;
import X.EnumC944090afv;
import X.EnumC944980ahM;
import X.EnumC950120ape;
import X.EnumC952500atU;
import X.EnumC958900b3o;
import X.InterfaceC1103130eoR;
import X.InterfaceC1631620sYq;
import X.InterfaceC302401Fe;
import X.InterfaceC921620a5g;
import X.InterfaceC926810aE3;
import X.InterfaceC934710aQn;
import X.InterfaceC943880afa;
import X.InterfaceC944250agB;
import X.InterfaceC949260aoG;
import X.InterfaceC950290apv;
import X.InterfaceC954810axD;
import Y.ALAdapterS10S0200000_15;
import Y.ALAdapterS1S0400000_15;
import Y.AUListenerS150S0300000_15;
import Y.AfS184S0100000_15;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestIconGroupChangeChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestIsLinkedAsAnchorForMicRoomChangeChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestReservationDiffPkEvent;
import com.bytedance.android.live.liveinteract.api.event.LinkStateForH5Event;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.gamelink.fragment.GameLinkMediaManageFragment;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorHasMultiGuestPermission;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutExtra;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkUnloadGuestAnchorWidgetOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostDisableModeSwitchWhenMgInProgress;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionLayoutNewEventSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostBgColorAudienceTopSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RevenueAvoidCohostCloseWhenMGDisable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.subscription.LiveCoHostForSubscribersOnlyLiveSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AObjectS358S0100000_15 implements Function1 {
    public final int $t;
    public Object l0;

    public static final Object invoke$73(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        return MultiGuestPreviewFragment.OR((MultiGuestPreviewFragment) aObjectS358S0100000_15.l0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            case 68:
                return invoke$68(this, obj);
            case 69:
                return invoke$69(this, obj);
            case 70:
                return invoke$70(this, obj);
            case 71:
                return invoke$71(this, obj);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj);
            case 73:
                return invoke$73(this, obj);
            case 74:
                return invoke$74(this, obj);
            case 75:
                return invoke$75(this, obj);
            case 76:
                return invoke$76(this, obj);
            case 77:
                return invoke$77(this, obj);
            case 78:
                return invoke$78(this, obj);
            case 79:
                return invoke$79(this, obj);
            case 80:
                return invoke$80(this, obj);
            case 81:
                return invoke$81(this, obj);
            case 82:
                return invoke$82(this, obj);
            case 83:
                return invoke$83(this, obj);
            case 84:
                return invoke$84(this, obj);
            case 85:
                return invoke$85(this, obj);
            case 86:
                return invoke$86(this, obj);
            default:
                return null;
        }
    }

    public AObjectS358S0100000_15(GuestMediaManageFragment guestMediaManageFragment, int i) {
        this.$t = i;
        switch (i) {
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                this.l0 = guestMediaManageFragment;
                break;
            case 71:
            default:
                this.l0 = guestMediaManageFragment;
                break;
        }
    }

    public static final Object invoke$0(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        String str = (String) obj;
        linkControlWidget.a2(str);
        linkControlWidget.J1(str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((LinkControlWidget) aObjectS358S0100000_15.l0).LLJI.LJJLIIIJL();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        C473410IhP.LIZIZ(new ARunnableS115S0100000_15(linkControlWidget, 10));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        if (((LinkControlWidget) aObjectS358S0100000_15.l0).LLJILJILJ) {
            return Unit.LIZ;
        }
        String connectionType = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType();
        C465520INi.LIZ.setConnectionType(connectionType);
        C0IR2.LIZJ(connectionType);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C934350aQD c934350aQD = ((LinkControlWidget) aObjectS358S0100000_15.l0).LLJJIII;
        long jLongValue = ((Long) obj).longValue();
        if (!((ArrayList) c934350aQD.LJ).contains(Long.valueOf(jLongValue))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeMultiGuestIconRedNumForReserve: ");
            sbLIZ.append(jLongValue);
            C20441214yg.LIZIZ("ToolbarInteractDelegate", C2188811AlT.LIZIZ(sbLIZ));
            ((ArrayList) c934350aQD.LJ).add(Long.valueOf(jLongValue));
            c934350aQD.LIZIZ().LJIL(c934350aQD.LJFF + ((ArrayList) c934350aQD.LJ).size());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C1143920fsE c1143920fsE;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        Pair pair = (Pair) obj;
        linkControlWidget.getClass();
        linkControlWidget.EM1(new C943870afZ((String) pair.getFirst()), (WeakReference) pair.getSecond(), Boolean.TRUE);
        DataChannel dataChannel = linkControlWidget.dataChannel;
        if (dataChannel != null && dataChannel.gg0(C956740b0K.class) != null && ((C945060ahU) linkControlWidget.dataChannel.gg0(C956740b0K.class)).LIZ != 0 && (c1143920fsE = linkControlWidget.LLJJIII.LIZJ.LLJJL) != null) {
            c1143920fsE.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C934350aQD c934350aQD = ((LinkControlWidget) aObjectS358S0100000_15.l0).LLJJIII;
        c934350aQD.LJFF = 0;
        ((ArrayList) c934350aQD.LJ).clear();
        c934350aQD.LIZIZ().LJIL(0);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        String str;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C757730Tnv c757730Tnv = (C757730Tnv) obj;
        linkControlWidget.getClass();
        if (TextUtils.isEmpty(c757730Tnv.LIZ)) {
            str = "";
        } else {
            str = c757730Tnv.LIZ;
        }
        if (!"interaction_panel".equals(str) && !"more_panel".equals(str)) {
            linkControlWidget.P1(str, c757730Tnv.LIZIZ, false, true);
        } else {
            HashMap map = new HashMap();
            map.put("link_page_entrance", str);
            map.put("request_page", "guest_icon");
            C927240aEk c927240aEk = new C927240aEk("anchorLiveHome", "interactionOrMorePanel");
            c927240aEk.LIZJ.putAll(map);
            c927240aEk.LIZ();
            linkControlWidget.P1(str, c757730Tnv.LIZIZ, true, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C934350aQD c934350aQD = ((LinkControlWidget) aObjectS358S0100000_15.l0).LLJJIII;
        long jLongValue = ((Long) obj).longValue();
        if (((ArrayList) c934350aQD.LJ).contains(Long.valueOf(jLongValue))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeMultiGuestIconRedNumForCancelReserve: ");
            sbLIZ.append(jLongValue);
            C20441214yg.LIZIZ("ToolbarInteractDelegate", C2188811AlT.LIZIZ(sbLIZ));
            ((ArrayList) c934350aQD.LJ).remove(Long.valueOf(jLongValue));
            c934350aQD.LIZIZ().LJIL(c934350aQD.LJFF + ((ArrayList) c934350aQD.LJ).size());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        InterfaceC943880afa interfaceC943880afa;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C927820aFg c927820aFg = (C927820aFg) obj;
        linkControlWidget.getClass();
        C915980Zwa.LJI().LIZ().LJJLIIIJJI(c927820aFg.LIZ);
        if (linkControlWidget.LLJILJILJ && c927820aFg.LIZIZ.equals("close_link")) {
            if (c927820aFg.LIZ) {
                linkControlWidget.LLIZLLLIL = linkControlWidget.LLJILLL.LIZJ(4, false, null);
            } else {
                Object obj2 = linkControlWidget.LLIZLLLIL;
                if (obj2 != null && (interfaceC943880afa = linkControlWidget.LLJILLL) != null) {
                    interfaceC943880afa.LIZ((LiveWidget) obj2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        EnumC944090afv enumC944090afv;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C956380azk c956380azk = (C956380azk) obj;
        linkControlWidget.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPkEvent, event = ");
        sbLIZ.append(c956380azk);
        C20441214yg.LJIIIZ("LinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (c956380azk.LIZ == 4) {
            if (linkControlWidget.GC2(4)) {
                enumC944090afv = EnumC944090afv.ANCHOR_LINKMIC_USER_ADDING;
            } else {
                enumC944090afv = EnumC944090afv.ANCHOR_LINKMIC_ONLINE;
            }
            C952540atY c952540atY = new C952540atY(enumC944090afv, 103);
            if (InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled) {
                C952490atT.LIZ.LIZ(EnumC952500atU.ANCHOR_CONN_SUCCESS, c952540atY, new HashMap());
            }
            CertProviderManagerKt.findCert("bpea-502", 1476788233);
            linkControlWidget.X1(c952540atY);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(Y.AObjectS358S0100000_15 r4, java.lang.Object r5) {
        /*
            java.lang.Object r0 = r4.l0
            com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget r0 = (com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget) r0
            X.0aQR r5 = (X.InterfaceC934490aQR) r5
            X.0aQD r2 = r0.LLJJIII
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r0.dataChannel
            r2.getClass()
            java.lang.String r1 = "ToolbarInteractDelegate"
            java.lang.String r0 = "showMultiGuestReservationBubble"
            X.C20441214yg.LIZIZ(r1, r0)
            X.0aQA r4 = r2.LIZIZ()
            r4.getClass()
            X.0afP r2 = new X.0afP
            com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto Lb2
            boolean r0 = r4.LJIIJJI()
            if (r0 == 0) goto L9d
            java.lang.Class<com.bytedance.android.live.toolbar.IToolbarService> r0 = com.bytedance.android.live.toolbar.IToolbarService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.toolbar.IToolbarService r0 = (com.bytedance.android.live.toolbar.IToolbarService) r0
            X.0eRS r1 = r0.Mn1(r3)
            if (r1 == 0) goto Lbb
            X.0enp r0 = X.EnumC1102750enp.MORE
            android.view.View r0 = r1.LJIIZILJ(r3, r0)
        L3f:
            r2.<init>(r0)
            Y.ACListenerS118S0200000_15 r1 = new Y.ACListenerS118S0200000_15
            r0 = 72
            r1.<init>(r4, r5, r0)
            r2.LJJIIZ = r1
            Y.ACListenerS118S0200000_15 r1 = new Y.ACListenerS118S0200000_15
            r0 = 73
            r1.<init>(r4, r5, r0)
            r2.LJJIIZI = r1
            X.0bnS r1 = new X.0bnS
            r0 = 12
            r1.<init>(r5, r0)
            r2.LJIILLIIL = r1
            X.0aQQ r0 = new X.0aQQ
            r0.<init>()
            r2.LJIILL = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.LJIIIIZZ = r0
            r1 = 1
            r2.LJIIIZ = r1
            java.util.List r0 = r5.LIZLLL()
            r2.LJJIIJZLJL = r0
            r0 = 2
            r2.LJJIJIIJI = r0
            java.lang.String r0 = r5.LIZJ()
            r2.LJIJJ = r0
            r0 = 1133510656(0x43900000, float:288.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            r2.LJIIJ = r0
            r2.LJIIJJI = r1
            X.0afd r1 = new X.0afd
            r1.<init>(r2, r2)
            X.0f5e r0 = X.C1113800f5e.LIZ
            long r2 = X.C1119700fFA.LIZIZ(r1)
            X.13qd r1 = r4.LLJJLIIIJLLLLLLLZ
            X.1Bqa<java.lang.Object>[] r0 = X.C934320aQA.LLLILZJ
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.LL = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9d:
            java.lang.Class<com.bytedance.android.live.toolbar.IToolbarService> r0 = com.bytedance.android.live.toolbar.IToolbarService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.toolbar.IToolbarService r0 = (com.bytedance.android.live.toolbar.IToolbarService) r0
            X.0eRS r1 = r0.Mn1(r3)
            if (r1 == 0) goto Lbb
            X.0enp r0 = X.EnumC1102750enp.INTERACTION_FEATURES
            android.view.View r0 = r1.LJIIZILJ(r3, r0)
            goto L3f
        Lb2:
            X.0eoR r0 = r4.LLJ
            if (r0 == 0) goto Lbb
            android.view.View r0 = r0.LJ()
            goto L3f
        Lbb:
            r0 = 0
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS358S0100000_15.invoke$19(Y.AObjectS358S0100000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        Runnable runnable = (Runnable) obj;
        if (linkControlWidget.F1() && C917860Zzc.LIZLLL(true)) {
            runnable.run();
            return Unit.LIZ;
        }
        InterfaceC1103130eoR interfaceC1103130eoR = linkControlWidget.LLJJIII.LIZIZ().LLJ;
        ARunnableS115S0100000_15 aRunnableS115S0100000_15 = new ARunnableS115S0100000_15(linkControlWidget, 9);
        EnumC943760afO enumC943760afO = EnumC943760afO.MULTIGUEST;
        if (interfaceC1103130eoR != null && enumC943760afO.getVisibility()) {
            enumC943760afO.setVisibility(false);
            ObjectAnimator duration = ObjectAnimator.ofFloat(interfaceC1103130eoR.LJ(), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(200L);
            duration.addListener(new AAListenerS267S0200000_15(interfaceC1103130eoR, aRunnableS115S0100000_15, 2));
            C943850afX.LIZ = true;
            C786410Ut5.Pd(duration);
        }
        runnable.run();
        return Unit.LIZ;
    }

    public static final Object invoke$20(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        if (linkControlWidget.F1()) {
            if (!C917810ZzX.LJIIIIZZ() || !C917810ZzX.LJIIJ()) {
                linkControlWidget.LLJJIII.LIZLLL(8);
                C20441214yg.LJIIIZ("multi_icon", "set gone 763");
            }
            linkControlWidget.dataChannel.FQ2(MultiGuestReservationDiffPkEvent.class);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(Y.AObjectS358S0100000_15 r4, java.lang.Object r5) {
        /*
            java.lang.Object r0 = r4.l0
            com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget r0 = (com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget) r0
            X.0aQT r5 = (X.InterfaceC934510aQT) r5
            X.0aQD r2 = r0.LLJJIII
            com.bytedance.ies.sdk.datachannel.DataChannel r3 = r0.dataChannel
            r2.getClass()
            java.lang.String r1 = "ToolbarInteractDelegate"
            java.lang.String r0 = "showMixModeApplyBubble"
            X.C20441214yg.LIZIZ(r1, r0)
            X.0aQA r4 = r2.LIZIZ()
            r4.getClass()
            boolean r0 = X.C917810ZzX.LJIIIIZZ()
            if (r0 == 0) goto L8f
            X.0afP r2 = new X.0afP
            boolean r0 = r4.LJIIJJI()
            if (r0 == 0) goto L92
            java.lang.Class<com.bytedance.android.live.toolbar.IToolbarService> r0 = com.bytedance.android.live.toolbar.IToolbarService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.toolbar.IToolbarService r0 = (com.bytedance.android.live.toolbar.IToolbarService) r0
            X.0eRS r1 = r0.Mn1(r3)
            if (r1 == 0) goto La7
            X.0enp r0 = X.EnumC1102750enp.MORE
            android.view.View r0 = r1.LJIIZILJ(r3, r0)
        L3d:
            r2.<init>(r0)
            Y.ACListenerS118S0200000_15 r1 = new Y.ACListenerS118S0200000_15
            r0 = 70
            r1.<init>(r4, r5, r0)
            r2.LJJIIZI = r1
            X.0bnS r1 = new X.0bnS
            r0 = 11
            r1.<init>(r5, r0)
            r2.LJIILLIIL = r1
            X.0aQS r0 = new X.0aQS
            r0.<init>()
            r2.LJIILL = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.LJIIIIZZ = r0
            r1 = 1
            r2.LJIIIZ = r1
            java.util.List r0 = r5.LIZLLL()
            r2.LJJIIJZLJL = r0
            r0 = 4
            r2.LJJIJIIJI = r0
            java.lang.String r0 = r5.LJ()
            r2.LJIJJ = r0
            r0 = 1133510656(0x43900000, float:288.0)
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            r2.LJIIJ = r0
            r2.LJIIJJI = r1
            X.0afd r1 = new X.0afd
            r1.<init>(r2, r2)
            X.0f5e r0 = X.C1113800f5e.LIZ
            long r2 = X.C1119700fFA.LIZIZ(r1)
            X.13qd r1 = r4.LLJL
            X.1Bqa<java.lang.Object>[] r0 = X.C934320aQA.LLLILZJ
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.LL = r0
        L8f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L92:
            java.lang.Class<com.bytedance.android.live.toolbar.IToolbarService> r0 = com.bytedance.android.live.toolbar.IToolbarService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.toolbar.IToolbarService r0 = (com.bytedance.android.live.toolbar.IToolbarService) r0
            X.0eRS r1 = r0.Mn1(r3)
            if (r1 == 0) goto La7
            X.0enp r0 = X.EnumC1102750enp.INTERACTION_FEATURES
            android.view.View r0 = r1.LJIIZILJ(r3, r0)
            goto L3d
        La7:
            r0 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS358S0100000_15.invoke$21(Y.AObjectS358S0100000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$22(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((LinkControlWidget) aObjectS358S0100000_15.l0).YJ(2L);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$23(Y.AObjectS358S0100000_15 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS358S0100000_15.invoke$23(Y.AObjectS358S0100000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$24(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C934350aQD c934350aQD = ((LinkControlWidget) aObjectS358S0100000_15.l0).LLJJIII;
        c934350aQD.getClass();
        C20441214yg.LIZIZ("ToolbarInteractDelegate", "hideMultiGuestReservationBubble");
        C934320aQA c934320aQALIZIZ = c934350aQD.LIZIZ();
        c934320aQALIZIZ.getClass();
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1119700fFA.LIZ(4, c934320aQALIZIZ.LJIIJ());
        return Unit.LIZ;
    }

    public static final Object invoke$25(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944610agl c944610agl = ((C944630agn) aObjectS358S0100000_15.l0).LIZ;
        if (c944610agl != null) {
            Object obj2 = c944610agl.LIZ.LJFF;
            if (obj2 instanceof InterfaceC950290apv) {
                ((InterfaceC950290apv) obj2).LIZIZ(1);
                return null;
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$26(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C934350aQD c934350aQD = ((LinkControlWidget) aObjectS358S0100000_15.l0).LLJJIII;
        c934350aQD.getClass();
        C20441214yg.LIZIZ("ToolbarInteractDelegate", "hideMixModApplyBubble");
        C934320aQA c934320aQALIZIZ = c934350aQD.LIZIZ();
        c934320aQALIZIZ.getClass();
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1119700fFA.LIZ(4, ((Number) c934320aQALIZIZ.LLJL.getValue(c934320aQALIZIZ, C934320aQA.LLLILZJ[1])).longValue());
        return Unit.LIZ;
    }

    public static final Object invoke$27(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((LinkControlWidget) aObjectS358S0100000_15.l0).getClass();
        LinkControlWidget.E1();
        return Unit.LIZ;
    }

    public static final Object invoke$28(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C784440Upu.LIZ().LIZIZ(((C944630agn) aObjectS358S0100000_15.l0).LIZ);
        return null;
    }

    public static final Object invoke$29(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (!C927600aFK.LJIILL()) {
            C944270agD c944270agD = linkControlWidget.LLJI;
            if (c944270agD != null) {
                c944270agD.LJJLIIIIJ(EnumC925190aBR.ACTIVITY_PAGE_OPEN);
            }
        } else {
            C925150aBN.LJJJI(C925150aBN.LJFF(), EnumC925190aBR.ACTIVITY_PAGE_OPEN);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        C952540atY c952540atY = new C952540atY(EnumC944090afv.ANCHOR_LINKMIC_ONLINE, 100);
        if (InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled) {
            C952490atT.LIZ.LIZ(EnumC952500atU.ANCHOR_CONN_SUCCESS, c952540atY, new HashMap());
        }
        linkControlWidget.Y1(4, false, "resume cohost", c952540atY);
        C944270agD c944270agD = linkControlWidget.LLJI;
        c944270agD.getClass();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).triggerResumeNotice(C915980Zwa.LJI().LJIIJ().getChannelId()).LIZJ(c944270agD.autoDisposeWithTransformer())).LIZ(new AfS137S0000000_15(5), new AfS184S0100000_15(c944270agD, 211));
        return Unit.LIZ;
    }

    public static final Object invoke$30(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        C07NE.LJIILJJIL.getClass();
        if (C07ND.LIZJ.contains(obj) && linkControlWidget.LLJILJILJ && C915980Zwa.LJII().LLI().atLeast(EnumC950120ape.Prepared)) {
            C915980Zwa.LJII().LLLJL(new C920570a3z(10081, 0L, "leave_with_perception_message", "", new ArrayList(), null), null);
        }
        return null;
    }

    public static final Object invoke$31(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        C925150aBN.LJI(linkControlWidget.dataChannel, ((Integer) obj).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$32(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        if (linkControlWidget.isViewValid() && linkControlWidget.LLJILJILJ && linkControlWidget.D1("open_cohost_list_from_new_jsb")) {
            C943870afZ c943870afZ = new C943870afZ("activity_banner");
            C915980Zwa.LJI().LIZ().LJIIJ(c943870afZ);
            linkControlWidget.T1(c943870afZ, null, "open_cohost_list_from_new_jsb", "onOpenCoHostList", null, null, null);
            linkControlWidget.LLJJIII.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C1AZW.LJIIIIZZ(linkControlWidget.M1(1155), "perception, _receive MultiGuestOpenMultiGuestEvent");
        linkControlWidget.LLJI.LJJLIIIIJ(EnumC925190aBR.AUTO_START_AS_PUNISH_TIME_OUT);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C925630aC9 c925630aC9 = (C925630aC9) obj;
        linkControlWidget.getClass();
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        if (linkControlWidget.LLJILJILJ && linkControlWidget.LLJIJIL != null && (objLJIIIZ instanceof MultiGuestDataHolder)) {
            C925600aC6.LJJIJIIJIL(c925630aC9, (MultiGuestDataHolder) objLJIIIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        String str = (String) obj;
        if (linkControlWidget.isViewValid() && linkControlWidget.LLJILJILJ && linkControlWidget.D1(str)) {
            if (str.equals("from_pairing_notice")) {
                C915980Zwa.LJI().LIZ().LJIIJ(new C943870afZ("pk_pairing_popup"));
            } else if (str.equals("open_cohost_list_from_select_tags")) {
                C915980Zwa.LJI().LIZ().LJIIJ(new C943870afZ("tag_selection"));
            } else {
                C915980Zwa.LJI().LIZ().LJIIJ(new C943870afZ("others"));
            }
            if (C489080JFy.LIZ(linkControlWidget.LLJJI, 4)) {
                C955400ayA.LLIFFJFJJ("connection_invite", null, null, null, null, 30);
                linkControlWidget.R1(null, null);
            } else if (linkControlWidget.LLJJIII.LIZJ.LLLIIII) {
                C465610INr.LIZ(1);
                linkControlWidget.LLJJIII.getClass();
                C955400ayA.LLIFFJFJJ("connection_invite", null, null, null, null, 30);
                linkControlWidget.R1(null, null);
                C925600aC6.LJIIZILJ(linkControlWidget.dataChannel);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((LinkControlWidget) aObjectS358S0100000_15.l0).getClass();
        LinkControlWidget.E1();
        return Unit.LIZ;
    }

    public static final Object invoke$37(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C955540ayO c955540ayO;
        C950360aq2 c950360aq2;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C944630agn c944630agn = (C944630agn) obj;
        linkControlWidget.getClass();
        DataChannel dataChannel = linkControlWidget.dataChannel;
        PerceptionMessage perceptionMessage = c944630agn.LIZIZ;
        C944610agl c944610agl = c944630agn.LIZ;
        if (c944610agl != null && (c950360aq2 = c944610agl.LIZ) != null) {
            c955540ayO = c950360aq2.LIZLLL;
        } else {
            c955540ayO = null;
        }
        C925610aC7.LJFF(dataChannel, perceptionMessage, true, Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJIZL), new AObjectS358S0100000_15(c944630agn, 25), new AObjectS358S0100000_15(c944630agn, 28), linkControlWidget.context);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((LinkControlWidget) aObjectS358S0100000_15.l0).S1();
        return Unit.LIZ;
    }

    public static final Object invoke$39(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.W0((String) obj, linkControlWidget.LLJILJILJ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944860ahA c944860ahA = ((LinkControlWidget) aObjectS358S0100000_15.l0).LLJJIII.LIZJ;
        c944860ahA.getClass();
        if (!LiveCoHostForSubscribersOnlyLiveSetting.INSTANCE.isEnabled()) {
            c944860ahA.LJIJJLI(8);
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_INTERACTIVE_MIC);
            return null;
        }
        if (!c944860ahA.LLLIIII) {
            return null;
        }
        c944860ahA.LJIJJLI(0);
        return null;
    }

    public static final Object invoke$40(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        obj.getClass();
        LinkControlWidget.E1();
        if (linkControlWidget.LLIZ != null) {
            C915980Zwa.LJI().LIZ().LLII();
            linkControlWidget.LLIZ.getClass();
            return null;
        }
        if (linkControlWidget.dataChannel == null || InterfaceC934710aQn.Mb.LIZIZ().enableShowMultiGuestLayout == 3) {
            return null;
        }
        linkControlWidget.dataChannel.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(1, "observeRandomLinkMicEvent"));
        return null;
    }

    public static final Object invoke$41(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ() && CohostDisableModeSwitchWhenMgInProgress.INSTANCE.isEnabled()) {
            C20441214yg.LJIIIZ("LinkControlWidget", "MultiGuestAnchorInProgressEvent, skip due to Phase 2");
            return Unit.LIZ;
        }
        if (C917810ZzX.LJIIJ()) {
            return Unit.LIZ;
        }
        if (RevenueAvoidCohostCloseWhenMGDisable.INSTANCE.isEnabled() && C943590af7.LIZ == 2) {
            return Unit.LIZ;
        }
        boolean zBooleanValue = ((Boolean) linkControlWidget.dataChannel.gg0(C755560TkQ.class)).booleanValue();
        String strM1 = linkControlWidget.M1(502);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestAnchorInProgressEvent, event = ");
        sbLIZ.append(obj);
        sbLIZ.append(" multiMode = ");
        sbLIZ.append(zBooleanValue);
        C1AZW.LJIIIIZZ(strM1, C2188811AlT.LIZIZ(sbLIZ));
        C915980Zwa.LJII().LLJL(null);
        LinkControlWidget.E1();
        return Unit.LIZ;
    }

    public static final Object invoke$42(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        if (C915980Zwa.LJIIIZ().c0() != null) {
            boolean z = C915980Zwa.LJIIIZ().c0().LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("observe QuickCoHostStateChangeToNone needResetScreen = ");
            sbLIZ.append(z);
            sbLIZ.append("mLinkCrossRoomWidget = ");
            sbLIZ.append(linkControlWidget.LLIZ);
            C20441214yg.LIZIZ("LinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
            if (obj == EnumC958900b3o.NONE && z && linkControlWidget.LLIZ == null && linkControlWidget.dataChannel != null && InterfaceC934710aQn.Mb.LIZIZ().enableShowMultiGuestLayout != 3) {
                linkControlWidget.dataChannel.zW(LinkCrossRoomStateChangeEvent.class, new C956380azk(1, "QuickCoHostStateChangeToNone"));
                return null;
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$43(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        if (!((Boolean) obj).booleanValue()) {
            linkControlWidget.LLJJIII.LIZJ.mx(linkControlWidget.dataChannel);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.W0("", linkControlWidget.LLJILJILJ);
        return Unit.LIZ;
    }

    public static final Object invoke$45(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C955010axX c955010axXI30;
        C956040azC c956040azCLJI;
        CohostLayoutExtra cohostLayoutExtra;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C959910b5R c959910b5R = (C959910b5R) obj;
        linkControlWidget.getClass();
        if (c959910b5R.LIZIZ == 0 && c959910b5R.LIZ == C950220apo.LJFF()) {
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ() && (c955010axXI30 = C915980Zwa.LJII().i30()) != null && (c956040azCLJI = c955010axXI30.LJI()) != null && (cohostLayoutExtra = c956040azCLJI.LIZJ) != null && cohostLayoutExtra.scene == 2) {
                c955010axXI30.LJIJ(true);
            }
            C959600b4w c959600b4wC0 = ((InterfaceC954810axD) C1161920gLG.LIZJ(IQuickCoHostService.class)).c0();
            if (c959600b4wC0 != null && !c959600b4wC0.LJIIIZ) {
                return null;
            }
            linkControlWidget.S1();
            return null;
        }
        return null;
    }

    public static final Object invoke$46(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C1143920fsE c1143920fsE;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        linkControlWidget.EM1(new C943870afZ((String) obj), null, Boolean.TRUE);
        DataChannel dataChannel = linkControlWidget.dataChannel;
        if (dataChannel != null && dataChannel.gg0(C956740b0K.class) != null && ((C945060ahU) linkControlWidget.dataChannel.gg0(C956740b0K.class)).LIZ != 0 && (c1143920fsE = linkControlWidget.LLJJIII.LIZJ.LLJJL) != null) {
            c1143920fsE.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        Runnable runnable = (Runnable) obj;
        ((LinkControlWidget) aObjectS358S0100000_15.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestAnchorTerminateCoHostEvent, callback = ");
        sbLIZ.append(runnable);
        C20441214yg.LJIIIZ("LinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
        C915980Zwa.LJII().LLJL(runnable);
        LinkControlWidget.E1();
        return Unit.LIZ;
    }

    public static final Object invoke$48(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        linkControlWidget.getClass();
        if (((C930510aK1) obj).LIZ) {
            linkControlWidget.LLJJIII.LIZIZ().mx(linkControlWidget.dataChannel);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$49(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        Runnable runnable = (Runnable) obj;
        if (linkControlWidget.dataChannel != null) {
            if (CohostDisableModeSwitchWhenMgInProgress.INSTANCE.isEnabled()) {
                C20441214yg.LJIIIZ("LinkControlWidget", "MultiGuestAnchorInProgressEvent, skip due to Phase 2");
                return Unit.LIZ;
            }
            boolean zEquals = Boolean.TRUE.equals(linkControlWidget.dataChannel.gg0(C755560TkQ.class));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiGuestAnchorInProgressEventWithCallback, event = ");
            sbLIZ.append(runnable);
            sbLIZ.append(" multiMode = ");
            sbLIZ.append(zEquals);
            C20441214yg.LJIIIZ("LinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
            C915980Zwa.LJII().LLJL(runnable);
            LinkControlWidget.E1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((LinkControlWidget) aObjectS358S0100000_15.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$50(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        ((C927880aFm) obj).LIZ(linkControlWidget.LLJILJILJ, linkControlWidget.LLJJIJIIJIL, linkControlWidget.LLJJI, linkControlWidget.LLJJIII, linkControlWidget.dataChannel);
        return null;
    }

    public static final Object invoke$51(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C960830b6v c960830b6v = (C960830b6v) obj;
        if (linkControlWidget.LLJILJILJ) {
            C13E8<C960840b6w> c13e8 = C960850b6x.LIZ;
            C960850b6x.LIZIZ(new C960840b6w(C0N67.MULTI_COHOST_FEEDBACK_DIALOG, Boolean.FALSE, new AObjectS290S0200000_15(linkControlWidget, c960830b6v, 0)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$52(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C918080Zzy c918080Zzy = (C918080Zzy) obj;
        String strM1 = linkControlWidget.M1(509);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoHostInProgressChanged, event = ");
        sbLIZ.append(c918080Zzy);
        C1AZW.LJIIIIZZ(strM1, C2188811AlT.LIZIZ(sbLIZ));
        if (c918080Zzy != null && !c918080Zzy.LIZ && c918080Zzy.LIZJ.intValue() != 2) {
            if (linkControlWidget.LLJI != null) {
                if (c918080Zzy.LIZJ.intValue() == 6) {
                    C20441214yg.LIZIZ("LinkControlWidget", "multiGuest restart when mixMode coHost end");
                    Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                    if (objLJIIIZ instanceof InterfaceC302401Fe) {
                        C20441214yg.LIZIZ("LinkControlWidget", "user manager scene set to UserManagerScene.SCENE_MULTI_GUEST");
                        ((InterfaceC921620a5g) objLJIIIZ).LJIILJJIL(0);
                    }
                }
                Object objGg0 = linkControlWidget.dataChannel.gg0(C956900b0a.class);
                if (objGg0 != null && objGg0 != EnumC921570a5b.USER_CLICK) {
                    linkControlWidget.LLJI.LJJLIIIIJ(EnumC925190aBR.RESTART_AFTER_CO_HOST);
                }
            }
        } else if (c918080Zzy != null) {
            if (c918080Zzy.LIZ && c918080Zzy.LIZJ.intValue() == 1 && linkControlWidget.LLJI != null) {
                C20441214yg.LIZIZ("multi_init", "anchor initAndTurnOnMultiGuest  in LinkControlWidget, mixMode start");
                linkControlWidget.LLJI.LJJLIIIIJ(EnumC925190aBR.RESTART_WHEN_CO_HOST_ENTER_MIX_MODE);
            } else if (!c918080Zzy.LIZ && ((c918080Zzy.LIZJ.intValue() == 3 || c918080Zzy.LIZJ.intValue() == 2) && linkControlWidget.LLJI != null)) {
                C931800aM6.LIZ.getClass();
                if (C931800aM6.LIZIZ()) {
                    return Unit.LIZ;
                }
                C20441214yg.LIZIZ("multi_init", "anchor initAndTurnOnMultiGuest  in LinkControlWidget, mixMode end, cohost end");
                if (c918080Zzy.LIZJ.intValue() == 2) {
                    InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                    if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && C921170a4x.LIZJ(abstractC928510aGnLIZ) > 0 && !C915980Zwa.LJI().LIZ().LJJIJLIJ() && C924810aAp.LJ().LJIIIIZZ) {
                        C921920a6A.LJII = true;
                        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                        C307001Gy.LIZ().getClass();
                        C921920a6A.LJIIIIZZ("cohost_over", 0L, -1L, C927600aFK.LJII(), "liveEnd&turnOff", "", null);
                    }
                    linkControlWidget.b2(2, 0L, "onCoHostGuestEnd");
                }
                linkControlWidget.LLJI.LJJLIIIIJ(EnumC925190aBR.RESTART_WHEN_MIX_MODE_CO_HOST_END);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        EnumC944980ahM enumC944980ahM = (EnumC944980ahM) obj;
        String strM1 = linkControlWidget.M1(1018);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("co-host state: ");
        sbLIZ.append(enumC944980ahM.name());
        C1AZW.LJIIIIZZ(strM1, C2188811AlT.LIZIZ(sbLIZ));
        if (linkControlWidget.LLJLLL != null && enumC944980ahM.getState() == linkControlWidget.LLJLLL.getState()) {
            return Unit.LIZ;
        }
        linkControlWidget.LLJLLL = enumC944980ahM;
        switch (C945010ahP.LIZIZ[enumC944980ahM.ordinal()]) {
            case 1:
            case 2:
                linkControlWidget.dataChannel.LC0(LinkStateForH5Event.class, new C782680Un4("normal"));
                C914630ZuP.LIZ = "normal";
                if (linkControlWidget.F1() && enumC944980ahM == EnumC944980ahM.CONNECTION_FINISH_SUCCEED && linkControlWidget.LLJILJILJ) {
                    linkControlWidget.LLJJIII.LIZLLL(0);
                    C20441214yg.LJIIIZ("multi_icon", "set visible 1148");
                }
                linkControlWidget.C1();
                break;
            case 3:
            case 4:
                linkControlWidget.dataChannel.LC0(LinkStateForH5Event.class, new C782680Un4("co_host_inviting"));
                C914630ZuP.LIZ = "co_host_inviting";
                break;
            case 5:
            case 6:
                linkControlWidget.dataChannel.LC0(LinkStateForH5Event.class, new C782680Un4("co_host"));
                C914630ZuP.LIZ = "co_host";
                if (linkControlWidget.F1() && linkControlWidget.LLJILJILJ) {
                    linkControlWidget.LLJJIII.LIZLLL(8);
                    C20441214yg.LJIIIZ("multi_icon", "set gone 1162");
                    linkControlWidget.dataChannel.FQ2(MultiGuestReservationDiffPkEvent.class);
                }
                linkControlWidget.JL1();
                break;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$54(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        String strM1 = linkControlWidget.M1(518);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestCreateChannelAdaptMicRoom, event = ");
        sbLIZ.append(obj);
        C1AZW.LJIIIIZZ(strM1, C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = linkControlWidget.dataChannel;
        if (dataChannel != null && Boolean.TRUE.equals(dataChannel.gg0(MultiGuestIsLinkedAsAnchorForMicRoomChangeChannel.class))) {
            C930480aJy.LJJIJIIJI(2131843328, "pm_multiLineUpOptimization_livePage_hostLoadingToast", "");
        }
        linkControlWidget.LLJI.LJJLIIIIJ(EnumC925190aBR.ADAPT_MIC_ROOM);
        return Unit.LIZ;
    }

    public static final Object invoke$55(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        if (linkControlWidget.F1()) {
            C925150aBN.LJII(linkControlWidget.dataChannel);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$56(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        boolean z;
        InterfaceC949260aoG interfaceC949260aoG = (InterfaceC949260aoG) aObjectS358S0100000_15.l0;
        Pair pair = (Pair) obj;
        if (((C949040anu) pair.getFirst()).LIZ() != null && ((C949040anu) pair.getFirst()).LIZ() != interfaceC949260aoG) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$57(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        boolean z;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS358S0100000_15.l0;
        C949040anu c949040anu = (C949040anu) obj;
        if (c949040anu.LIZ() != null && c949040anu.LIZ() != interfaceC1631620sYq) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$58(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        boolean z;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS358S0100000_15.l0;
        C949040anu c949040anu = (C949040anu) obj;
        if (c949040anu.LIZ() != null && c949040anu.LIZ() != interfaceC1631620sYq) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$59(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        boolean z;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS358S0100000_15.l0;
        C949040anu c949040anu = (C949040anu) obj;
        if (c949040anu.LIZ() != null && c949040anu.LIZ() != interfaceC1631620sYq) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        boolean z;
        boolean z2;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        String str = (String) obj;
        linkControlWidget.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observe AudienceInteractionDialogLinkHostClickEvent source=");
        sbLIZ.append(str);
        sbLIZ.append(" hasGuestWidget=");
        if (linkControlWidget.LLILZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" hasReservationWidget=");
        if (linkControlWidget.LLILZIL != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        C20441214yg.LJIIIZ("LinkControlWidget", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC926810aE3 interfaceC926810aE3 = linkControlWidget.LLILZ;
        if (interfaceC926810aE3 != null) {
            linkControlWidget.LLJJJ = true;
            interfaceC926810aE3.LLIIIL();
            linkControlWidget.W0(str, linkControlWidget.LLJILJILJ);
            linkControlWidget.LLJJJ = false;
            linkControlWidget.LLILZ.LLIIIL();
        } else {
            InterfaceC926810aE3 interfaceC926810aE32 = linkControlWidget.LLILZIL;
            if (interfaceC926810aE32 != null) {
                linkControlWidget.LLJJJ = true;
                interfaceC926810aE32.LLIIIL();
                linkControlWidget.W0(str, linkControlWidget.LLJILJILJ);
                linkControlWidget.LLJJJ = false;
                linkControlWidget.LLILZIL.LLIIIL();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        boolean z;
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) aObjectS358S0100000_15.l0;
        C949040anu c949040anu = (C949040anu) obj;
        if (c949040anu.LIZ() != null && c949040anu.LIZ() != interfaceC1631620sYq) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$61(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C1324720kZq c1324720kZq;
        C1324720kZq c1324720kZq2;
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS358S0100000_15.l0;
        C963860bBo c963860bBo = (C963860bBo) obj;
        portraitAudienceInteractionFragment.getClass();
        if (c963860bBo != null) {
            int i = c963860bBo.LIZIZ;
            int i2 = c963860bBo.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AbsInteractionFragment_onVideoInteractStreamHeight top = ");
            sbLIZ.append(i);
            sbLIZ.append(" bottom = ");
            sbLIZ.append(i2);
            C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
            if ((!portraitAudienceInteractionFragment.OU() || LiveCohostBgColorAudienceTopSetting.INSTANCE.isEnable()) && (c1324720kZq = portraitAudienceInteractionFragment.LLZLL) != null) {
                ((ViewGroup.MarginLayoutParams) c1324720kZq.getLayoutParams()).height = i;
            }
            if (!portraitAudienceInteractionFragment.OU() && (c1324720kZq2 = portraitAudienceInteractionFragment.LLZLLIL) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1324720kZq2.getLayoutParams();
                marginLayoutParams.topMargin = i2;
                int iLJIIZILJ = C497740JfY.LJIIZILJ();
                if (C497750JfZ.LIZIZ() && C497750JfZ.LIZ() == 0) {
                    iLJIIZILJ = 0;
                }
                marginLayoutParams.width = iLJIIZILJ;
                C786410Ut5.u6(portraitAudienceInteractionFragment.LLZLLIL, marginLayoutParams);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$62(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C0U3O c0u3o = (C0U3O) obj;
        c0u3o.LIZJ(new AwS594S0100000_15((MultiGuestCreateAvatarFragment) aObjectS358S0100000_15.l0, 644));
        c0u3o.LJFF(new AwS594S0100000_15((MultiGuestCreateAvatarFragment) aObjectS358S0100000_15.l0, 645));
        c0u3o.LIZIZ(new AwS629S0100000_15((MultiGuestCreateAvatarFragment) aObjectS358S0100000_15.l0, 63));
        return Unit.LIZ;
    }

    public static final Object invoke$63(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aObjectS358S0100000_15.l0;
        guestMediaManageFragment.getClass();
        guestMediaManageFragment.LLLLLLJ = ((Boolean) obj).booleanValue();
        return null;
    }

    public static final Object invoke$64(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aObjectS358S0100000_15.l0;
        guestMediaManageFragment.getClass();
        if (C932270aMr.LIZJ((Integer) obj)) {
            LiveDialogFragment liveDialogFragment = guestMediaManageFragment.LLLILZ;
            if (liveDialogFragment != null && liveDialogFragment.isShowing()) {
                guestMediaManageFragment.LLLILZ.dismiss();
            }
        } else {
            C786410Ut5.T4(guestMediaManageFragment.LLJI, 1.0f);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$65(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aObjectS358S0100000_15.l0;
        C922430a6z c922430a6z = (C922430a6z) obj;
        if (guestMediaManageFragment.LLJJJJLIIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set micView enable=");
            sbLIZ.append(c922430a6z.LIZ);
            C20441214yg.LJIIIZ("GuestMediaManageFragment", C2188811AlT.LIZIZ(sbLIZ));
            guestMediaManageFragment.LLJJJJLIIL.setAudioEnabled(c922430a6z.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$66(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        Integer num = (Integer) obj;
        C1103220eoa c1103220eoa = ((GuestMediaManageFragment) aObjectS358S0100000_15.l0).LLJJJJLIIL;
        if (c1103220eoa != null) {
            c1103220eoa.setVolumeLevel(num.intValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$67(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((GuestMediaManageFragment) aObjectS358S0100000_15.l0).bS("LinkReceiveEnlargeMessageEvent");
        return Unit.LIZ;
    }

    public static final Object invoke$68(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((GuestMediaManageFragment) aObjectS358S0100000_15.l0).bS("ZoomedPositionsUpdateEvent");
        return Unit.LIZ;
    }

    public static final Object invoke$69(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((GuestMediaManageFragment) aObjectS358S0100000_15.l0).LLLLJI = (C0UDD) obj;
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0aQe] */
    public static final Object invoke$7(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        final C1126540fQC c1126540fQC;
        final C1324720kZq c1324720kZq;
        final C1324720kZq c1324720kZq2;
        final User user = (User) obj;
        C934350aQD c934350aQD = ((LinkControlWidget) aObjectS358S0100000_15.l0).LLJJIII;
        c934350aQD.getClass();
        if (!LiveHostAutoAdaptiveParams.disableMultiGuestAnimation()) {
            final C934320aQA c934320aQALIZIZ = c934350aQD.LIZIZ();
            if (!c934320aQALIZIZ.LIZLLL() && (c1126540fQC = c934320aQALIZIZ.LLJILJILJ) != null && (c1324720kZq = c934320aQALIZIZ.LLJILLL) != null && (c1324720kZq2 = c934320aQALIZIZ.LLJJ) != null) {
                final ?? r2 = new C1143950fsH() { // from class: X.0aQe
                    @Override // X.C1143950fsH
                    public final void LJ(Animatable animatable) {
                        boolean z;
                        c934320aQALIZIZ.LLJJIJIL = Long.valueOf(System.currentTimeMillis());
                        C934320aQA c934320aQA = c934320aQALIZIZ;
                        User user2 = user;
                        c934320aQA.LLJJJ = user2;
                        DataChannel dataChannel = c934320aQA.LLJJIJIIJIL;
                        if (dataChannel != null) {
                            dataChannel.SX0(C956880b0Y.class, user2.getIdStr());
                        }
                        DataChannel dataChannel2 = c934320aQALIZIZ.LLJJIJIIJIL;
                        if (dataChannel2 != null) {
                            dataChannel2.SX0(C956710b0H.class, Boolean.TRUE);
                        }
                        c934320aQALIZIZ.LLJJJIL = (C11JF) C11NZ.LJLJJLL(60L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS184S0100000_15(c934320aQALIZIZ, 254));
                        String idStr = user.getIdStr();
                        if (((int) user.getFollowInfo().getFollowStatus()) == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C917600ZzC.LIZ(idStr, false, z);
                    }

                    @Override // X.C1143950fsH
                    public final void LJFF(Animatable animatable) {
                        C12ES.LJIILL(4, c1324720kZq2);
                        C12ES.LJIILL(4, c1126540fQC);
                        c934320aQALIZIZ.LIZJ(true);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        C1324720kZq c1324720kZq3 = c1324720kZq;
                        C1324720kZq c1324720kZq4 = c1324720kZq2;
                        C934320aQA c934320aQA = c934320aQALIZIZ;
                        valueAnimatorOfFloat.setRepeatCount(0);
                        valueAnimatorOfFloat.setDuration(200L);
                        valueAnimatorOfFloat.addUpdateListener(new AUListenerS150S0300000_15(c1324720kZq3, c1324720kZq4, c934320aQA, 4));
                        valueAnimatorOfFloat.addListener(new ALAdapterS10S0200000_15(c1324720kZq3, c1324720kZq4, 8));
                        valueAnimatorOfFloat.start();
                        DataChannel dataChannel = c934320aQALIZIZ.LLJJIJIIJIL;
                        if (dataChannel != null) {
                            dataChannel.SX0(C956710b0H.class, Boolean.FALSE);
                        }
                    }
                };
                C0IYA c0iya = new C0IYA() { // from class: X.0aQf
                    @Override // X.C0IYA
                    public final void LJ(boolean z) {
                        if (z) {
                            C786410Ut5.Yb(c1324720kZq, 0.0f);
                            C786410Ut5.xc(c1324720kZq, 0.0f);
                            C12ES.LJIILL(0, c1324720kZq);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            C1324720kZq c1324720kZq3 = c1324720kZq;
                            C1324720kZq c1324720kZq4 = c1324720kZq2;
                            C934320aQA c934320aQA = c934320aQALIZIZ;
                            C1126540fQC c1126540fQC2 = c1126540fQC;
                            C934620aQe c934620aQe = r2;
                            valueAnimatorOfFloat.setRepeatCount(0);
                            valueAnimatorOfFloat.setDuration(200L);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS150S0300000_15(c1324720kZq3, c1324720kZq4, c934320aQA, 5));
                            valueAnimatorOfFloat.addListener(new ALAdapterS1S0400000_15(c1126540fQC2, c1324720kZq4, c934320aQA, c934620aQe, 1));
                            valueAnimatorOfFloat.start();
                        }
                    }
                };
                ImageModel avatarThumb = user.getAvatarThumb();
                C1121670fIL.LJ(avatarThumb).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS65S0400000_15(c934320aQALIZIZ, c0iya, avatarThumb, c1324720kZq, 4), new AfS151S0200000_15(c0iya, avatarThumb, 78));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$70(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        GuestMediaManageFragment guestMediaManageFragment = (GuestMediaManageFragment) aObjectS358S0100000_15.l0;
        C931970aMN c931970aMN = (C931970aMN) obj;
        if (guestMediaManageFragment.LLJJJJLIIL != null) {
            C930480aJy c930480aJy = C930480aJy.LIZ;
            String str = c931970aMN.LIZIZ;
            c930480aJy.getClass();
            if (C930480aJy.LJJII(str)) {
                if (c931970aMN.LIZ) {
                    C922430a6z c922430a6z = (C922430a6z) guestMediaManageFragment.LLLJL.gg0(MultiLiveGuestMuteAudioEvent.class);
                    if (c922430a6z != null) {
                        guestMediaManageFragment.LLJJJJLIIL.setAudioEnabled(c922430a6z.LIZ);
                    }
                } else {
                    guestMediaManageFragment.LLJJJJLIIL.setAudioEnabled(false);
                }
            }
            guestMediaManageFragment.LLJJJJLIIL.setAudioClickable(c931970aMN.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$71(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        MultiGuestPreviewFragment multiGuestPreviewFragment = (MultiGuestPreviewFragment) aObjectS358S0100000_15.l0;
        multiGuestPreviewFragment.mT(false);
        multiGuestPreviewFragment.gT("business_unknown");
        return Unit.LIZ;
    }

    public static final Object invoke$72(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((GuestMediaManageFragment) aObjectS358S0100000_15.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$74(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        ((GuestMediaManageFragment) aObjectS358S0100000_15.l0).LLJJIJIIJIL.setEnabled(((Boolean) obj).booleanValue());
        return null;
    }

    public static final Object invoke$75(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944270agD c944270agD = (C944270agD) aObjectS358S0100000_15.l0;
        c944270agD.getClass();
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS115S0100000_15(c944270agD, 196));
        return Unit.LIZ;
    }

    public static final Object invoke$76(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944270agD c944270agD = (C944270agD) aObjectS358S0100000_15.l0;
        c944270agD.getClass();
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS115S0100000_15(c944270agD, 197));
        return Unit.LIZ;
    }

    public static final Object invoke$77(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944270agD c944270agD = (C944270agD) aObjectS358S0100000_15.l0;
        c944270agD.getClass();
        C20441214yg.LJIIIZ("LinkControlPresenter", "on MultiGuestV3AnchorDestroyChannel");
        if (LiveSdkUnloadGuestAnchorWidgetOptSetting.isEnable() && C917810ZzX.LJIIIIZZ()) {
            return Unit.LIZ;
        }
        T t = c944270agD.mView;
        if (t != 0) {
            ((InterfaceC944250agB) t).AC(C944270agD.LLJL.longValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$78(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944270agD c944270agD = (C944270agD) aObjectS358S0100000_15.l0;
        c944270agD.getClass();
        C20441214yg.LJIIIZ("LinkControlPresenter", "on CoHostPermissionCheckEvent");
        if (c944270agD.dataChannel.gg0(C956670b0D.class) == EnumC919210a1n.NONE) {
            c944270agD.LJJJJZI(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$79(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944450agV c944450agV = (C944450agV) obj;
        DataChannel dataChannel = ((C944270agD) aObjectS358S0100000_15.l0).dataChannel;
        int i = C960860b6y.LIZ;
        if (dataChannel != null) {
            try {
                Room room = (Room) dataChannel.gg0(RoomChannel.class);
                if (room != null && c944450agV != null) {
                    if (C960860b6y.LIZ(room) < C960860b6y.LIZ && (!c944450agV.LIZ.displayUserInfos.isEmpty())) {
                        C13E8<C960840b6w> c13e8 = C960850b6x.LIZ;
                        C960850b6x.LIZIZ(new C960840b6w(C0N67.COHOST_FOLLOW_PROMPT, Boolean.TRUE, new AwS259S0300000_15(room, dataChannel, c944450agV, 19)));
                    } else {
                        C20441214yg.LJIIIZ("FollowPrompt", "invalid trigger");
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "FollowPromptHelper.fetchAndShowFollowPrompt");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        LinkControlWidget linkControlWidget = (LinkControlWidget) aObjectS358S0100000_15.l0;
        C464920ILa c464920ILa = (C464920ILa) obj;
        linkControlWidget.getClass();
        if (C917810ZzX.LJIIIIZZ()) {
            return Unit.LIZ;
        }
        C473410IhP.LIZIZ(new ARunnableS84S0200000_15(linkControlWidget, c464920ILa, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$80(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944270agD c944270agD = (C944270agD) aObjectS358S0100000_15.l0;
        C956380azk c956380azk = (C956380azk) obj;
        c944270agD.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkCrossRoomStateChangeEvent, LinkCrossRoomEvent = ");
        sbLIZ.append(c956380azk);
        C20441214yg.LJIIIZ("LinkControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (c956380azk.LIZ == 9) {
            ((InterfaceC944250agB) c944270agD.mView).YJ(3L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$81(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944270agD c944270agD = (C944270agD) aObjectS358S0100000_15.l0;
        EnumC950120ape enumC950120ape = (EnumC950120ape) obj;
        c944270agD.getClass();
        if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && c944270agD.LLJI) {
            DataChannel dataChannel = c944270agD.dataChannel;
            boolean z = C925150aBN.LIZ;
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(AnchorHasMultiGuestPermission.class), Boolean.TRUE)) {
                int i = C950110apd.LIZ[enumC950120ape.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        C925150aBN.LJIILLIIL(dataChannel);
                        if (dataChannel != null) {
                            dataChannel.zW(MultiGuestIconGroupChangeChannel.class, Boolean.TRUE);
                        }
                    }
                } else {
                    C925150aBN.LJII(dataChannel);
                    if (dataChannel != null) {
                        dataChannel.zW(MultiGuestIconGroupChangeChannel.class, Boolean.FALSE);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$82(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944270agD c944270agD = (C944270agD) aObjectS358S0100000_15.l0;
        Pair pair = (Pair) obj;
        c944270agD.getClass();
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            C20441214yg.LIZIZ("LinkControlPresenter", "MixModeStateChangeChannel return, LinkMicCoHostWhenMultiGuestSettingHelper isUnionSessionEnable");
            return Unit.LIZ;
        }
        if (((Integer) pair.getFirst()).intValue() == 1 || ((Integer) pair.getFirst()).intValue() == 2) {
            c944270agD.LJJLIIIJJI(((Integer) pair.getFirst()).intValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$83(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944270agD c944270agD = (C944270agD) aObjectS358S0100000_15.l0;
        c944270agD.getClass();
        C961300b7g c961300b7g = C961300b7g.LIZ;
        DataChannel dataChannel = c944270agD.dataChannel;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) c944270agD.mView;
        c961300b7g.getClass();
        C961300b7g.LJIIJ(c961300b7g, dataChannel, lifecycleOwner, (C961760b8Q) obj, null, false, null, 48);
        return Unit.LIZ;
    }

    public static final Object invoke$84(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C944270agD c944270agD = (C944270agD) aObjectS358S0100000_15.l0;
        if (c944270agD.LLJI && c944270agD.LLJIJIL == LiveMode.VIDEO) {
            C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS115S0100000_15(c944270agD, 198));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$85(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        GameLinkMediaManageFragment gameLinkMediaManageFragment = (GameLinkMediaManageFragment) aObjectS358S0100000_15.l0;
        C922430a6z c922430a6z = (C922430a6z) obj;
        if (gameLinkMediaManageFragment.LLJIJIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set micView enable=");
            sbLIZ.append(c922430a6z.LIZ);
            C20441214yg.LJIIIZ("GameLinkMediaManageFragment", C2188811AlT.LIZIZ(sbLIZ));
            gameLinkMediaManageFragment.LLJIJIL.setAudioEnabled(c922430a6z.LIZ);
            C1126540fQC c1126540fQC = gameLinkMediaManageFragment.LLILLJJLI;
            if (c1126540fQC != null) {
                if (c922430a6z.LIZ) {
                    c1126540fQC.LJII();
                } else {
                    c1126540fQC.LIZLLL();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$86(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        Integer num = (Integer) obj;
        C1103220eoa c1103220eoa = ((GameLinkMediaManageFragment) aObjectS358S0100000_15.l0).LLJIJIL;
        if (c1103220eoa != null) {
            c1103220eoa.setVolumeLevel(num.intValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS358S0100000_15 aObjectS358S0100000_15, Object obj) {
        C927390aEz c927390aEz = (C927390aEz) obj;
        ((LinkControlWidget) aObjectS358S0100000_15.l0).LLJJIII.LIZ(c927390aEz.LIZIZ, c927390aEz.LIZ);
        return Unit.LIZ;
    }

    public AObjectS358S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
