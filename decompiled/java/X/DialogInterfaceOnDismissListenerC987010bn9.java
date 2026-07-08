package X;

import android.content.DialogInterface;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.interceptor.FansRequiredInterceptor;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.MultiGuestAsGuestModeratorsWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.anchor.MultiGuestV3AnchorReservationWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateFragment;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestResetIconRedDotNumInReservationEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.ResetRedDotNumEvent;
import com.bytedance.android.live.liveinteract.voicechat.main.anchor.VoiceChatAnchorWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiLinkManageDialogOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class DialogInterfaceOnDismissListenerC987010bn9 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onDismiss$10(this, dialogInterface);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onDismiss$11(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onDismiss$12(this, dialogInterface);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onDismiss$13(this, dialogInterface);
                break;
            case 14:
                onDismiss$14(this, dialogInterface);
                break;
            case 15:
                onDismiss$15(this, dialogInterface);
                break;
            case 16:
                onDismiss$16(this, dialogInterface);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onDismiss$17(this, dialogInterface);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onDismiss$18(this, dialogInterface);
                break;
            case 19:
                onDismiss$19(this, dialogInterface);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onDismiss$20(this, dialogInterface);
                break;
            case 21:
                onDismiss$21(this, dialogInterface);
                break;
            case 22:
                onDismiss$22(this, dialogInterface);
                break;
            case 23:
                onDismiss$23(this, dialogInterface);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onDismiss$24(this, dialogInterface);
                break;
            case 25:
                onDismiss$25(this, dialogInterface);
                break;
            case 26:
                onDismiss$26(this, dialogInterface);
                break;
            case 27:
                onDismiss$27(this, dialogInterface);
                break;
            case 28:
                onDismiss$28(this, dialogInterface);
                break;
            case 29:
                onDismiss$29(this, dialogInterface);
                break;
            case 30:
                onDismiss$30(this, dialogInterface);
                break;
            case 31:
                onDismiss$31(this, dialogInterface);
                break;
            case 32:
                onDismiss$32(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC987010bn9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC987010bn9.l0).invoke();
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((C969930bLb) dialogInterfaceOnDismissListenerC987010bn9.l0).LLJ.invoke(Boolean.TRUE);
    }

    public static final void onDismiss$10(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((VoiceChatAnchorWidget) dialogInterfaceOnDismissListenerC987010bn9.l0).LLILZ = null;
    }

    public static final void onDismiss$11(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((VoiceChatWatchWidget) dialogInterfaceOnDismissListenerC987010bn9.l0).LLJJIJIL = null;
    }

    public static final void onDismiss$12(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        if (!LiveSdkMultiLinkManageDialogOptSetting.isEnabled()) {
            ((MultiGuestV3AnchorWidget) dialogInterfaceOnDismissListenerC987010bn9.l0).LLILLL = null;
        }
        MultiGuestV3AnchorWidget multiGuestV3AnchorWidget = (MultiGuestV3AnchorWidget) dialogInterfaceOnDismissListenerC987010bn9.l0;
        C921520a5W c921520a5W = multiGuestV3AnchorWidget.LLILLJJLI;
        if (c921520a5W != null) {
            c921520a5W.LLJI = null;
        }
        DataChannel dataChannel = multiGuestV3AnchorWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(ResetRedDotNumEvent.class);
        }
    }

    public static final void onDismiss$13(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC987010bn9.l0).invoke();
    }

    public static final void onDismiss$14(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        MultiGuestV3AnchorReservationWidget multiGuestV3AnchorReservationWidget = (MultiGuestV3AnchorReservationWidget) dialogInterfaceOnDismissListenerC987010bn9.l0;
        multiGuestV3AnchorReservationWidget.LLILLL = null;
        DataChannel dataChannel = multiGuestV3AnchorReservationWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(MultiGuestResetIconRedDotNumInReservationEvent.class);
        }
    }

    public static final void onDismiss$15(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ArrayList arrayList;
        String strLJJLIIIJ;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        List<C954460awe> list;
        C20441214yg.LIZIZ("PrepareCoordinator", "teamMate dialog dismiss callback");
        C974960bTi c974960bTi = (C974960bTi) dialogInterfaceOnDismissListenerC987010bn9.l0;
        c974960bTi.getClass();
        InterfaceC980390bcT.Ka.LJFF(Long.valueOf(C915980Zwa.LJII().getChannelId()));
        C977590bXx c977590bXx = c974960bTi.LIZLLL;
        String strLJJLIIIJ2 = null;
        if (c977590bXx != null && (mutableLiveData = c977590bXx.LJFF) != null && (value = mutableLiveData.getValue()) != null && (list = value.get(Boolean.TRUE)) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C954460awe> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().LJ));
            }
        } else {
            arrayList = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("save last selected member ---");
        if (arrayList != null) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        sbLIZ.append(strLJJLIIIJ2);
        C20441214yg.LJ("PrepareCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        C20337914i1<String> c20337914i1 = InterfaceC980390bcT.Ja;
        if (arrayList == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62)) == null) {
            strLJJLIIIJ = "";
        }
        c20337914i1.LJFF(strLJJLIIIJ);
        ((C974960bTi) dialogInterfaceOnDismissListenerC987010bn9.l0).LJ.invoke();
    }

    public static final void onDismiss$16(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((C923760a98) dialogInterfaceOnDismissListenerC987010bn9.l0).LLJJJ = null;
    }

    public static final void onDismiss$17(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((ViewOnClickListenerC935080aRO) dialogInterfaceOnDismissListenerC987010bn9.l0).LLJLLIL = null;
    }

    public static final void onDismiss$18(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        MultiLiveSettingDialog multiLiveSettingDialog = (MultiLiveSettingDialog) dialogInterfaceOnDismissListenerC987010bn9.l0;
        multiLiveSettingDialog.LLLLLJLJLL = null;
        multiLiveSettingDialog.LLLLLL = null;
    }

    public static final void onDismiss$19(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((C977560bXu) dialogInterfaceOnDismissListenerC987010bn9.l0).LJIIL.invoke();
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((MultiGuestV3AnchorWidget) dialogInterfaceOnDismissListenerC987010bn9.l0).LLJJIJIIJIL = null;
    }

    public static final void onDismiss$20(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((C977560bXu) dialogInterfaceOnDismissListenerC987010bn9.l0).LJIIL.invoke();
    }

    public static final void onDismiss$21(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((C977560bXu) dialogInterfaceOnDismissListenerC987010bn9.l0).LJIIL.invoke();
    }

    public static final void onDismiss$22(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        long jLongValue;
        C964190bCL c964190bCL = (C964190bCL) dialogInterfaceOnDismissListenerC987010bn9.l0;
        List<User> list = c964190bCL.LJI;
        DataChannel dataChannel = c964190bCL.LIZIZ;
        if (dataChannel != null) {
            C1121570fIB c1121570fIB = new C1121570fIB(list);
            Long l = c964190bCL.LJII;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c1121570fIB.LJIIIZ = jLongValue;
            dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
        }
    }

    public static final void onDismiss$23(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        VoiceChatAnchorWidget voiceChatAnchorWidget = (VoiceChatAnchorWidget) dialogInterfaceOnDismissListenerC987010bn9.l0;
        voiceChatAnchorWidget.LLILLL = null;
        DataChannel dataChannel = voiceChatAnchorWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(ResetRedDotNumEvent.class);
        }
    }

    public static final void onDismiss$24(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        VoiceChatAnchorWidget voiceChatAnchorWidget = (VoiceChatAnchorWidget) dialogInterfaceOnDismissListenerC987010bn9.l0;
        MultiGuestDataHolder multiGuestDataHolder = voiceChatAnchorWidget.dataHolder;
        if (multiGuestDataHolder == null) {
            multiGuestDataHolder = null;
        }
        multiGuestDataHolder.LJJJJJ = -1;
        voiceChatAnchorWidget.LLILLL = null;
        DataChannel dataChannel = voiceChatAnchorWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(ResetRedDotNumEvent.class);
        }
    }

    public static final void onDismiss$25(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC987010bn9.l0).invoke();
    }

    public static final void onDismiss$26(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((MultiGuestAsGuestModeratorsWidget) dialogInterfaceOnDismissListenerC987010bn9.l0).LLILLL = null;
    }

    public static final void onDismiss$27(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((Function1) dialogInterfaceOnDismissListenerC987010bn9.l0).invoke(0);
    }

    public static final void onDismiss$28(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((C976140bVc) dialogInterfaceOnDismissListenerC987010bn9.l0).LJ.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onDismiss$29(X.DialogInterfaceOnDismissListenerC987010bn9 r2, android.content.DialogInterface r3) {
        /*
            java.lang.Object r0 = r2.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2 r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2) r0
            android.content.DialogInterface$OnDismissListener r0 = r0.a
            if (r0 == 0) goto Lb
            r0.onDismiss(r3)
        Lb:
            java.lang.Object r0 = r2.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2 r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2) r0
            android.content.DialogInterface$OnDismissListener r0 = r0.b
            if (r0 == 0) goto L16
            r0.onDismiss(r3)
        L16:
            java.lang.Object r3 = r2.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2 r3 = (com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2) r3
            boolean r1 = r3.r
            r0 = 0
            if (r1 != 0) goto L31
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r3.LLJI
            if (r2 == 0) goto L61
            java.lang.Class<com.bytedance.android.livesdk.model.DelaySendCheckMicCameraConditionTriggerChannel> r1 = com.bytedance.android.livesdk.model.DelaySendCheckMicCameraConditionTriggerChannel.class
            java.lang.Object r1 = r2.gg0(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L2b:
            boolean r1 = X.C500260Jjc.LJJJI(r1)
            if (r1 == 0) goto L3a
        L31:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r3.LLJI
            if (r2 == 0) goto L3a
            java.lang.Class<com.bytedance.android.livesdk.model.MultiGuestManageGuestOperationEvent> r1 = com.bytedance.android.livesdk.model.MultiGuestManageGuestOperationEvent.class
            r2.FQ2(r1)
        L3a:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LLJI
            if (r1 == 0) goto L46
            java.lang.Class<com.bytedance.android.livesdk.model.DelaySendCheckMicCameraConditionTriggerChannel> r0 = com.bytedance.android.livesdk.model.DelaySendCheckMicCameraConditionTriggerChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L46:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L55
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r3.LLJI
            if (r1 == 0) goto L55
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition.CheckMicCameraConditionTriggerEvent> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition.CheckMicCameraConditionTriggerEvent.class
            r1.FQ2(r0)
        L55:
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r3.LLJI
            if (r2 == 0) goto L60
            java.lang.Class<com.bytedance.android.livesdk.model.DelaySendCheckMicCameraConditionTriggerChannel> r1 = com.bytedance.android.livesdk.model.DelaySendCheckMicCameraConditionTriggerChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.zW(r1, r0)
        L60:
            return
        L61:
            r1 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnDismissListenerC987010bn9.onDismiss$29(X.0bn9, android.content.DialogInterface):void");
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((MultiGuestV3GuestPresenter) dialogInterfaceOnDismissListenerC987010bn9.l0).setGuestBeInvitedDialog$liveinteract_impl_release(null);
    }

    public static final void onDismiss$30(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC987010bn9.l0).invoke();
    }

    public static final void onDismiss$31(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((Function0) dialogInterfaceOnDismissListenerC987010bn9.l0).invoke();
    }

    public static final void onDismiss$32(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((C954080aw2) dialogInterfaceOnDismissListenerC987010bn9.l0).LIZIZ = null;
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        DataChannel dataChannel = ((MultiGuestV3GuestWidget) dialogInterfaceOnDismissListenerC987010bn9.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((MultiGuestV3GuestWidget) dialogInterfaceOnDismissListenerC987010bn9.l0).LLILZLL = null;
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        InterfaceC777420Uea interfaceC777420Uea = ((FansRequiredInterceptor) dialogInterfaceOnDismissListenerC987010bn9.l0).LIZ;
        if (interfaceC777420Uea != null) {
            interfaceC777420Uea.dV0(true);
        }
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        ((MultiGuestV3GuestWidget) dialogInterfaceOnDismissListenerC987010bn9.l0).i2();
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC987010bn9 dialogInterfaceOnDismissListenerC987010bn9, DialogInterface dialogInterface) {
        EnumC124700dh enumC124700dh;
        InterfaceC971790bOb interfaceC971790bObLIZIZ;
        C969910bLZ c969910bLZ;
        C969920bLa c969920bLa = ((TemplateFragment) dialogInterfaceOnDismissListenerC987010bn9.l0).LL;
        if (c969920bLa != null && (c969910bLZ = c969920bLa.LJ) != null) {
            enumC124700dh = c969910bLZ.LIZIZ;
        } else {
            enumC124700dh = null;
        }
        if (enumC124700dh == EnumC124700dh.REOPEN_TEXTHEADER_PAGE && (interfaceC971790bObLIZIZ = C01OF.LIZIZ()) != null) {
            interfaceC971790bObLIZIZ.LJIIIIZZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onDismiss$9(X.DialogInterfaceOnDismissListenerC987010bn9 r27, android.content.DialogInterface r28) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnDismissListenerC987010bn9.onDismiss$9(X.0bn9, android.content.DialogInterface):void");
    }
}
