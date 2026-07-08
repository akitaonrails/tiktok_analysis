package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.GuestManagePanelCameraOpenEvent;
import com.bytedance.android.live.liveinteract.api.LinkMicStateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.effect.EnableAudienceEffectControlSetting;
import com.bytedance.android.livesdk.model.message.EffectControlMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS63S1000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UEJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEJ extends C0JSV<C0JSP> implements OnMessageListener {
    public final Room LL;
    public IMessageManager LLILLJJLI;
    public final DataChannel LLILLL;
    public final LifecycleOwner LLILZ;
    public C0UAH LLILZIL;

    @Override // X.C0JSV
    public final void detachView() {
        super.detachView();
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        if (this.LLILZIL != null) {
            C0UEH.LIZIZ = null;
            C0UEH.LIZJ("onLeaveRoom");
            C0UEH.LJII = 0L;
            C0UEH.LJIIIIZZ = null;
            C0UEH.LJIIIZ = false;
            C0UEH.LJIIJ = false;
            C0UEH.LJIIJJI = null;
            C0UEH.LJIIL = null;
            C768300UBw.LIZLLL();
        }
    }

    @Override // X.C0JSV
    public final void attachView(C0JSP c0jsp) {
        super.attachView(c0jsp);
        IMessageManager iMessageManager = (IMessageManager) this.LLILLL.gg0(C776250Uch.class);
        this.LLILLJJLI = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this);
            if (EnableAudienceEffectControlSetting.INSTANCE.enable()) {
                this.LLILLJJLI.addMessageListener(C001A.EFFECT_CONTROL_MESSAGE.getIntType(), this);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String resourceId;
        String name;
        PerceptionDialogInfo perceptionDialogInfo;
        Room room;
        PunishEventInfo punishEventInfo;
        if (iMessage == null) {
            return;
        }
        if (iMessage instanceof PerceptionMessage) {
            PerceptionMessage perceptionMessage = (PerceptionMessage) iMessage;
            if (perceptionMessage.getMessageType() == C001A.PERCEPTION_MESSAGE && (perceptionDialogInfo = perceptionMessage.dialog) != null && perceptionDialogInfo.scene == 6 && (room = this.LL) != null && (punishEventInfo = perceptionMessage.publicEventInfo) != null && punishEventInfo.punishId != null) {
                ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).aD2(room.getId(), perceptionMessage.publicEventInfo.punishId);
                return;
            }
            return;
        }
        if (!(iMessage instanceof EffectControlMessage) || !EnableAudienceEffectControlSetting.INSTANCE.enable()) {
            return;
        }
        if (this.LLILZIL == null) {
            C0UAH effectControlMessageHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectControlMessageHelper();
            this.LLILZIL = effectControlMessageHelper;
            DataChannel dataChannel = this.LLILLL;
            LifecycleOwner lifecycleOwner = this.LLILZ;
            effectControlMessageHelper.getClass();
            C0UEH.LIZIZ = dataChannel;
            if (dataChannel != null) {
                dataChannel.EQ2(lifecycleOwner, LinkMicStateChannel.class, AFwS245S0000000_12.get$arr$(186));
                dataChannel.EQ2(lifecycleOwner, MultiLiveGuestMuteVideoEvent.class, AFwS245S0000000_12.get$arr$(187));
                dataChannel.EQ2(lifecycleOwner, GuestManagePanelCameraOpenEvent.class, AFwS245S0000000_12.get$arr$(188));
            }
        }
        EffectControlMessage effectControlMessage = (EffectControlMessage) iMessage;
        this.LLILZIL.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleEffectControlMessage, resourceId is ");
        sbLIZ.append(effectControlMessage.resourceId);
        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ));
        Boolean bool = C0UEH.LJIIIIZZ;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.LJFF(bool, bool2)) {
            return;
        }
        if (C0UEH.LJIIJ) {
            InterfaceC769000UEo interfaceC769000UEo = C0UEH.LJIIJJI;
            if (interfaceC769000UEo == null) {
                return;
            }
            C0UEH.LJ(effectControlMessage, interfaceC769000UEo);
            return;
        }
        int i = effectControlMessage.controlType;
        boolean z = false;
        String str = "multi_guest_countdownforall";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                if (C0UEH.LJIIIZ) {
                    if (C0UEH.LJ != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("needResumeMultiGuestEffect id is ");
                        LiveEffect liveEffect = C0UEH.LJ;
                        if (liveEffect != null) {
                            resourceId = liveEffect.getResourceId();
                        } else {
                            resourceId = null;
                        }
                        sbLIZ2.append(resourceId);
                        sbLIZ2.append(", name is ");
                        LiveEffect liveEffect2 = C0UEH.LJ;
                        if (liveEffect2 != null) {
                            name = liveEffect2.getName();
                        } else {
                            name = null;
                        }
                        sbLIZ2.append(name);
                        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ2));
                        LiveEffect liveEffect3 = C0UEH.LJ;
                        if (effectControlMessage.scene != 1) {
                            str = "";
                        }
                        if (liveEffect3 != null) {
                            C0UEH.LJFF(liveEffect3, C0UA1.LIZ(), new AwS126S1100000_12(liveEffect3, str, 8));
                        }
                    } else if (C0UEH.LJFF != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("needResumeMultiGuestEffectId is ");
                        sbLIZ3.append(C0UEH.LJFF);
                        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ3));
                        String str2 = C0UEH.LJFF;
                        if (effectControlMessage.scene != 1) {
                            str = "";
                        }
                        if (str2 != null && str2.length() != 0) {
                            C0UEH.LIZLLL(str, str2, new AwS63S1000000_12(str, 2));
                        }
                    } else if (C0UEH.LIZJ && C0UEH.LIZLLL == null) {
                        C20441214yg.LJIIIZ("EffectControlMessage", "originMultiGuestEffect is null, the guest did not use effect at the beginning, cancel all effects.");
                        C0UEH.LIZIZ();
                    }
                    C0UEH.LJIIL = null;
                    C474640IjO.LIZ = bool2;
                    C0UEH.LIZJ("camera open, RESUME IM");
                    return;
                }
                C0UEH.LJI = effectControlMessage;
                return;
            }
            C0UEH.LJIIL = null;
            C474640IjO.LIZ = bool2;
            C0UEH.LIZJ("cancelEffectForGuest");
            C0UEH.LIZIZ();
            return;
        }
        if (C0UEH.LJIIIZ) {
            C0UEH.LJI = null;
            C0UEH.LJIIL = effectControlMessage.resourceId;
            if (effectControlMessage.scene == 1) {
                z = true;
            }
            C474640IjO.LIZ = Boolean.valueOf(z);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("cameraOpen, replaceEffectForGuest, resourceId is ");
            sbLIZ4.append(effectControlMessage.resourceId);
            C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ4));
            String str3 = effectControlMessage.resourceId;
            boolean z2 = effectControlMessage.replaceResumeEffect;
            if (effectControlMessage.scene != 1) {
                str = "";
            }
            if (str3 == null) {
                return;
            }
            C0UEH.LIZ(str3, z2, str, C0UA1.LIZ(), new AwS63S1000000_12(str, 1));
            return;
        }
        C0UEH.LJI = effectControlMessage;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("cameraClose, cache effectControlMessage is ");
        sbLIZ5.append(effectControlMessage.getMessageId());
        sbLIZ5.append(", type is ");
        sbLIZ5.append(effectControlMessage.controlType);
        sbLIZ5.append(", resourceId is ");
        sbLIZ5.append(effectControlMessage.resourceId);
        C20441214yg.LJIIIZ("EffectControlMessage", C2188811AlT.LIZIZ(sbLIZ5));
        if (!effectControlMessage.replaceResumeEffect) {
            return;
        }
        C0UEH.LJ = null;
        C0UEH.LJFF = effectControlMessage.resourceId;
    }

    public C0UEJ(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        this.LL = room;
        this.LLILLL = dataChannel;
        this.LLILZ = lifecycleOwner;
    }
}
