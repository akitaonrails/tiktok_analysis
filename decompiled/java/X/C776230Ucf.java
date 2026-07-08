package X;

import android.os.CountDownTimer;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.DisableMuteMicEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.model.AccessRecallMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubOnlyAllowMusicSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ucf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776230Ucf implements OnIMMessageListener {
    public static final C776230Ucf LL = new C776230Ucf();
    public static WeakReference<DataChannel> LLILLJJLI;
    public static WeakReference<IMessageManager> LLILLL;
    public static boolean LLILZ;
    public static boolean LLILZIL;
    public static CountDownTimerC776240Ucg LLILZLL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Ucg, android.os.CountDownTimer] */
    public static void LIZ() {
        LLILZ = true;
        LIZJ(true);
        LIZIZ(true);
        LLILZIL = false;
        long jLongValue = InterfaceC772190UQv.L3.LIZIZ().longValue();
        long jLIZ = C158B.LIZ();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        final long j2 = (jLongValue - (jLIZ / j)) * j;
        if (j2 > 0) {
            CountDownTimerC776240Ucg countDownTimerC776240Ucg = LLILZLL;
            if (countDownTimerC776240Ucg != null) {
                countDownTimerC776240Ucg.cancel();
            }
            ?? r0 = new CountDownTimer(j2) { // from class: X.0Ucg
                @Override // android.os.CountDownTimer
                public final void onTick(long j3) {
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    C20441214yg.LIZIZ("access_recall_message", "startCountDown：onFinish");
                    InterfaceC772190UQv.L3.LJFF(-1L);
                    synchronized (C776230Ucf.LL) {
                        C776230Ucf.LLILZ = false;
                        if (C776230Ucf.LLILZIL) {
                            return;
                        }
                        C776230Ucf.LIZJ(false);
                        C776230Ucf.LIZIZ(false);
                        C776230Ucf.LLILZIL = true;
                    }
                }
            };
            LLILZLL = r0;
            r0.start();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startCountDown：");
            sbLIZ.append(j2);
            C20441214yg.LIZIZ("access_recall_message", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "access_recall_message";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public static void LIZIZ(boolean z) {
        AudioDeviceModule audioDeviceModuleE3;
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null && (audioDeviceModuleE3 = interfaceC769940UIe.E3()) != null) {
            audioDeviceModuleE3.setInputStreamMute(z);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("muteInLiveStream: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("access_recall_message", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("muteInRtc: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("access_recall_message", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).T31();
        } else {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Wr2();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z;
        DataChannel dataChannel;
        WeakReference<DataChannel> weakReference;
        DataChannel dataChannel2;
        boolean zBooleanValue;
        DataChannel dataChannel3;
        Boolean bool;
        if (iMessage instanceof AccessRecallMessage) {
            C20441214yg.LIZIZ("access_recall_message", "receive AccessRecallMessage");
            AccessRecallMessage accessRecallMessage = (AccessRecallMessage) iMessage;
            if (Intrinsics.LJFF(accessRecallMessage.scene, "AUDIO_MUTE")) {
                if (accessRecallMessage.status == 1) {
                    z = true;
                    C0UPE c0upeLIZLLL = C771670UOv.LIZLLL();
                    if (c0upeLIZLLL != null) {
                        WeakReference<DataChannel> weakReference2 = LLILLJJLI;
                        if (weakReference2 != null && (dataChannel3 = weakReference2.get()) != null && (bool = (Boolean) dataChannel3.gg0(MuteMicChannel.class)) != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        c0upeLIZLLL.LIZIZ = zBooleanValue;
                    }
                    InterfaceC772190UQv.L3.LJFF(Long.valueOf(accessRecallMessage.endTime));
                    LIZ();
                    if (LiveSubOnlyAllowMusicSetting.getEnableAllowMusic() && (weakReference = LLILLJJLI) != null && (dataChannel2 = weakReference.get()) != null) {
                        Room room = (Room) dataChannel2.gg0(RoomChannel.class);
                        if (room != null && room.liveSubOnly == 0) {
                            return;
                        }
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                        C517110KPt.LJII(dataChannel2);
                    }
                } else {
                    z = false;
                    InterfaceC772190UQv.L3.LJFF(-1L);
                    synchronized (this) {
                        LLILZ = false;
                        if (!LLILZIL) {
                            LIZJ(false);
                            LIZIZ(false);
                            LLILZIL = true;
                        }
                    }
                }
                WeakReference<DataChannel> weakReference3 = LLILLJJLI;
                if (weakReference3 != null && (dataChannel = weakReference3.get()) != null) {
                    dataChannel.LC0(DisableMuteMicEvent.class, Boolean.valueOf(z));
                }
            }
        }
    }
}
