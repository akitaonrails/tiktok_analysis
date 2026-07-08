package X;

import Y.ACListenerS116S0200000_12;
import Y.ARunnableS112S0100000_12;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.dataChannel.GameLiveWarnTipsShowingChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.privilege.LivePrivilegeAnnouncementContainerSetting;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.dataChannel.ForceCloseLinkEvent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS199S0000000_12;
import qo2.w;

/* JADX INFO: renamed from: X.0Uni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783080Uni implements InterfaceC780810Uk3 {
    public final BaseFragment LIZ;
    public final DataChannel LIZIZ;
    public final AbstractC781140Uka LIZJ;
    public final View LIZLLL;
    public final Function1<Boolean, Unit> LJ = null;
    public final Function1<RemindMessage, Unit> LJFF;
    public final Function0<Boolean> LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public long LJIIIZ;
    public final C13E8<RemindMessage> LJIIJ;

    public final Room LIZ() {
        return (Room) this.LIZIZ.gg0(RoomChannel.class);
    }

    @Override // X.InterfaceC780810Uk3
    public final void onDestroy() {
        C783110Unl c783110Unl = (C783110Unl) this.LJII.getValue();
        Room roomLIZ = LIZ();
        long id = roomLIZ != null ? roomLIZ.getId() : 0L;
        c783110Unl.getClass();
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(id);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(c783110Unl);
        }
        C482260Ivg.LJ(c783110Unl);
        c783110Unl.LL = null;
        EnumC1087550ePJ.INSTANCE.pollMessage = null;
        ((Handler) this.LJIIIIZZ.getValue()).removeCallbacksAndMessages(null);
        this.LJIIJ.clear();
    }

    public final void LIZIZ(RemindMessage remindMessage) {
        Spannable spannableString;
        boolean z;
        Long lValueOf;
        Long lValueOf2;
        LiveMode streamType;
        Spannable spannable = C1133830fbx.LIZ;
        CharSequence charSequenceLIZJ = "";
        if (remindMessage.supportDisplayText()) {
            spannableString = C1133830fbx.LJIILIIL(remindMessage.baseMessage.displayText, "");
        } else {
            spannableString = spannable;
        }
        if (spannableString == spannable && !TextUtils.isEmpty(remindMessage.content)) {
            spannableString = new SpannableString(remindMessage.content);
        }
        CharSequence charSequenceLJIILIIL = C1133830fbx.LJIILIIL(remindMessage.title, "");
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(remindMessage.violationReason, "");
        Spannable spannableLJIILIIL2 = C1133830fbx.LJIILIIL(remindMessage.illegalText, "");
        Spannable spannableLJIILIIL3 = C1133830fbx.LJIILIIL(remindMessage.bottomTip, "");
        if (!TextUtils.isEmpty(charSequenceLJIILIIL)) {
            if (!TextUtils.isEmpty(spannableLJIILIIL) && !TextUtils.isEmpty(spannableLJIILIIL2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\n                            ");
                sbLIZ.append((Object) spannableLJIILIIL);
                sbLIZ.append("\n                            ");
                sbLIZ.append((Object) spannableLJIILIIL2);
                sbLIZ.append("\n                            ");
                charSequenceLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            } else if (!TextUtils.isEmpty(spannableLJIILIIL)) {
                charSequenceLIZJ = spannableLJIILIIL;
            } else if (!TextUtils.isEmpty(spannableLJIILIIL2)) {
                charSequenceLIZJ = spannableLJIILIIL2;
            }
        } else {
            charSequenceLIZJ = spannableString;
        }
        if (TextUtils.isEmpty(charSequenceLIZJ)) {
            return;
        }
        if (TextUtils.isEmpty(charSequenceLJIILIIL)) {
            charSequenceLJIILIIL = C497740JfY.LJIJI(2131842876);
        }
        if (!TextUtils.isEmpty(spannableLJIILIIL3) && !TextUtils.isEmpty(remindMessage.tipUrl)) {
            z = true;
        } else {
            z = false;
        }
        C19GO c19go = new C19GO(this.LIZ.getActivity());
        c19go.LJJIIJ = false;
        c19go.LIZLLL = charSequenceLJIILIIL;
        c19go.LJIIIIZZ = charSequenceLIZJ;
        c19go.LJ(2131842139, new DialogInterface.OnClickListener() { // from class: X.0Unk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, false);
        if (z) {
            ACListenerS116S0200000_12 aCListenerS116S0200000_12 = new ACListenerS116S0200000_12(this, remindMessage, 73);
            c19go.LJ = spannableLJIILIIL3;
            c19go.LJIJI = aCListenerS116S0200000_12;
            c19go.LJIIJ = R.drawable.erc;
        }
        C786410Ut5.M4(c19go.LIZ());
        this.LJIIIZ = System.currentTimeMillis();
        String strLIZ = null;
        if (charSequenceLJIILIIL != null && charSequenceLIZJ != null && this.LIZIZ.gg0(LiveModeChannel.class) == LiveMode.SCREEN_RECORD) {
            DataChannel dataChannel = this.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((Object) charSequenceLJIILIIL);
            sbLIZ2.append(':');
            sbLIZ2.append((Object) charSequenceLIZJ);
            dataChannel.zW(GameLiveWarnTipsShowingChannel.class, new C777010Udv(C2188811AlT.LIZIZ(sbLIZ2), "warning&no_rec", null));
        }
        C500260Jjc.LJIIZILJ(this.LIZIZ);
        C1091120eV4.LIZJ(remindMessage);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_room_alert_show");
        Room roomLIZ = LIZ();
        if (roomLIZ != null) {
            lValueOf = Long.valueOf(roomLIZ.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        Room roomLIZ2 = LIZ();
        if (roomLIZ2 != null) {
            lValueOf2 = Long.valueOf(roomLIZ2.getId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(lValueOf2, "room_id");
        Room roomLIZ3 = LIZ();
        if (roomLIZ3 != null && (streamType = roomLIZ3.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(remindMessage.scene, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJIJJLI(this.LIZIZ);
        c474500IjALIZ.LIZ();
    }

    public C783080Uni(BaseFragment baseFragment, DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka, View view, Function1 function1, Function0 function0) {
        long id;
        this.LIZ = baseFragment;
        this.LIZIZ = dataChannel;
        this.LIZJ = abstractC781140Uka;
        this.LIZLLL = view;
        this.LJFF = function1;
        this.LJI = function0;
        C01GW c01gwLIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(367));
        this.LJII = c01gwLIZ;
        this.LJIIIIZZ = C292401Bi.LIZ(AFwS195S0000000_9.get$arr$(460));
        this.LJIIJ = new C13E8<>();
        C783110Unl c783110Unl = (C783110Unl) c01gwLIZ.getValue();
        Room roomLIZ = LIZ();
        if (roomLIZ != null) {
            id = roomLIZ.getId();
        } else {
            id = 0;
        }
        c783110Unl.LL = new InterfaceC783120Unm() { // from class: X.0Unj
            @Override // X.InterfaceC783120Unm
            public final void LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                C001A messageType;
                View view2;
                View view3;
                Function1<RemindMessage, Unit> function12;
                String str;
                C783080Uni c783080Uni = this.LIZ;
                if (c783080Uni.LIZ.isViewValid() && abstractC1136060ffY != null && (messageType = abstractC1136060ffY.getMessageType()) != null) {
                    int i = C001G.LIZ[messageType.ordinal()];
                    long id2 = 0;
                    int i2 = 0;
                    switch (i) {
                        case 1:
                            Room roomLIZ2 = c783080Uni.LIZ();
                            if (roomLIZ2 != null) {
                                id2 = roomLIZ2.getId();
                            }
                            if (abstractC1136060ffY.isCurrentRoom(id2)) {
                                c783080Uni.LIZIZ.zW(MemberMessageChannel.class, abstractC1136060ffY);
                            }
                            break;
                        case 2:
                            RemindMessage remindMessage = (RemindMessage) abstractC1136060ffY;
                            int i3 = remindMessage.noticeType;
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        if ((i3 == 6 || i3 == 7) && (function12 = c783080Uni.LJFF) != null) {
                                            function12.invoke(remindMessage);
                                        }
                                    } else if (c783080Uni.LJIIIZ == 0) {
                                        c783080Uni.LIZIZ(remindMessage);
                                    } else if (System.currentTimeMillis() - c783080Uni.LJIIIZ >= 60000) {
                                        c783080Uni.LIZIZ(remindMessage);
                                    } else {
                                        c783080Uni.LJIIJ.addFirst(remindMessage);
                                        long jCurrentTimeMillis = ((long) C538540LAe.LLJJJIL) - (System.currentTimeMillis() - c783080Uni.LJIIIZ);
                                        if (jCurrentTimeMillis >= 0) {
                                            C786410Ut5.LJLIIL(jCurrentTimeMillis, (Handler) c783080Uni.LJIIIIZZ.getValue(), new ARunnableS112S0100000_12(c783080Uni, 332));
                                        }
                                    }
                                } else {
                                    if (!c783080Uni.LJI.invoke().booleanValue() && (view3 = c783080Uni.LIZLLL) != null) {
                                        C786410Ut5.LJLLLLLL(8, view3);
                                    }
                                    Function1<Boolean, Unit> function13 = c783080Uni.LJ;
                                    if (function13 != null) {
                                        function13.invoke(Boolean.FALSE);
                                    }
                                    Room roomLIZ3 = c783080Uni.LIZ();
                                    if (roomLIZ3 != null) {
                                        roomLIZ3.setMosaicStatus(0);
                                    }
                                    AbstractC781140Uka abstractC781140Uka2 = c783080Uni.LIZJ;
                                    if (abstractC781140Uka2 != null) {
                                        abstractC781140Uka2.LIZIZ(remindMessage);
                                    }
                                }
                            } else {
                                if (!((Boolean) c783080Uni.LIZIZ.gg0(UserIsAnchorChannel.class)).booleanValue() && (view2 = c783080Uni.LIZLLL) != null) {
                                    C786410Ut5.LJLLLLLL(0, view2);
                                }
                                Function1<Boolean, Unit> function14 = c783080Uni.LJ;
                                if (function14 != null) {
                                    function14.invoke(Boolean.TRUE);
                                }
                                Room roomLIZ4 = c783080Uni.LIZ();
                                if (roomLIZ4 != null) {
                                    roomLIZ4.setMosaicStatus(1);
                                }
                                AbstractC781140Uka abstractC781140Uka3 = c783080Uni.LIZJ;
                                if (abstractC781140Uka3 != null) {
                                    abstractC781140Uka3.LIZIZ(remindMessage);
                                }
                                c783080Uni.LIZIZ.LC0(ForceCloseLinkEvent.class, Boolean.TRUE);
                            }
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            Room roomLIZ5 = c783080Uni.LIZ();
                            if (roomLIZ5 == null || !roomLIZ5.isOfficial()) {
                                if (abstractC1136060ffY != null && (abstractC1136060ffY instanceof RoomNotifyMessage)) {
                                    DataChannel dataChannel2 = c783080Uni.LIZIZ;
                                    RoomNotifyMessage roomNotifyMessage = (RoomNotifyMessage) abstractC1136060ffY;
                                    if (dataChannel2 != null) {
                                        try {
                                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_advanced_message_receive_im");
                                            c474500IjALIZ.LJIIIIZZ();
                                            C1087460ePA.LIZ(c474500IjALIZ, roomNotifyMessage, dataChannel2);
                                            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                                                c474500IjALIZ.LJIJJLI(dataChannel2);
                                                c474500IjALIZ.LIZ();
                                            } else {
                                                c474500IjALIZ.LJJIJLIJ();
                                                c474500IjALIZ.LJIIIIZZ();
                                                w wVar = w.LIZ;
                                                wVar.getClass();
                                                c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
                                                c474500IjALIZ.LJJII(wVar.LIZJ(), "live_type");
                                                c474500IjALIZ.LIZ();
                                            }
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                    }
                                }
                                EnumC1087550ePJ.INSTANCE.add(abstractC1136060ffY);
                            }
                            break;
                        case 7:
                            EnumC1087550ePJ.INSTANCE.add(abstractC1136060ffY);
                            break;
                        case 8:
                            EnumC1087550ePJ.INSTANCE.add(abstractC1136060ffY);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            EnumC1087550ePJ.INSTANCE.add(abstractC1136060ffY);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            EnumC1087550ePJ.INSTANCE.add(abstractC1136060ffY);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            EnumC1087550ePJ.INSTANCE.pollMessage = (PollMessage) abstractC1136060ffY;
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            if (!LivePrivilegeAnnouncementContainerSetting.INSTANCE.getValue()) {
                                Room roomLIZ6 = c783080Uni.LIZ();
                                if ((roomLIZ6 == null || !roomLIZ6.isOfficial()) && (abstractC1136060ffY instanceof PrivilegeAdvanceMessage)) {
                                    EnumC1087550ePJ enumC1087550ePJ = EnumC1087550ePJ.INSTANCE;
                                    DisplayControl displayControl = ((PrivilegeAdvanceMessage) abstractC1136060ffY).control;
                                    if (displayControl != null) {
                                        i2 = displayControl.priority;
                                    }
                                    enumC1087550ePJ.add(abstractC1136060ffY, i2);
                                }
                            }
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            Room roomLIZ7 = c783080Uni.LIZ();
                            if ((roomLIZ7 == null || !roomLIZ7.isOfficial()) && (abstractC1136060ffY instanceof PrivilegeDynamicEffectMessage)) {
                                PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage = (PrivilegeDynamicEffectMessage) abstractC1136060ffY;
                                int i4 = privilegeDynamicEffectMessage.effectType;
                                if (i4 == 1 || i4 == 2) {
                                    EnumC1087550ePJ enumC1087550ePJ2 = EnumC1087550ePJ.INSTANCE;
                                    DisplayControl displayControl2 = privilegeDynamicEffectMessage.control;
                                    if (displayControl2 != null) {
                                        i2 = displayControl2.priority;
                                    }
                                    enumC1087550ePJ2.add(abstractC1136060ffY, i2);
                                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_dynamic_effect_message_received");
                                    c474500IjALIZ2.LJJII(Long.valueOf(privilegeDynamicEffectMessage.getMessageId()), "message_id");
                                    if (C500260Jjc.LJIIZILJ(c783080Uni.LIZIZ)) {
                                        str = "anchor";
                                    } else {
                                        str = "user";
                                    }
                                    c474500IjALIZ2.LJJII(str, "user_type");
                                    c474500IjALIZ2.LJJII(privilegeDynamicEffectMessage.scene, Scene.SCENE_SERVICE);
                                    c474500IjALIZ2.LIZ();
                                }
                            }
                            break;
                    }
                }
            }
        };
        IMessageManager iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(id);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.LIVE_UNAUTHORIZED_MEMBER_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.ROOM_NOTIFY.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.REMIND.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.COMMON_TOAST.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.GUIDE_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.GIFT_GUIDE_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.HOST_BOARD_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.S_M_B_BOARD_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.COMMON_GUIDE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.CEREMONY_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.LIVE_POLL_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.QUESTION.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.OPERATE_TOAST_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.PRIVILEGE_ADVANCE_MESSAGE.getIntType(), c783110Unl);
            iMessageManager.addMessageListener(C001A.PRIVILEGE_DYNAMIC_EFFECT_MESSAGE.getIntType(), c783110Unl);
        }
        C482260Ivg.LIZ(C001A.LIVE_POLL_MESSAGE.getIntType(), c783110Unl);
    }
}
