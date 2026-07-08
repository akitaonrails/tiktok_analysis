package X;

import Y.ARunnableS112S0100000_12;
import android.os.Message;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.live.ShowInteractGuideEvent;
import com.bytedance.android.livesdk.broadcast.trymode.guide.ShowEnhanceGuideEvent;
import com.bytedance.android.livesdk.broadcast.trymode.guide.ShowFaceGuideEvent;
import com.bytedance.android.livesdk.broadcast.trymode.guide.ShowTopGuideChannel;
import com.bytedance.android.livesdk.broadcast.trymode.guide.StickerHintShowingChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.msg.utils.WeakHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UIC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UIC implements C0UIG {
    public final LifecycleCoroutineScope LIZ;
    public final DataChannel LIZIZ;
    public AbstractC1273900jFs LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 758));

    public final WeakHandler LIZ() {
        return (WeakHandler) this.LIZLLL.getValue();
    }

    public static void LIZLLL(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_detection_show");
        c474500IjALIZ.LJJII(str, "detection_type");
        c474500IjALIZ.LJJII(C769380UGa.LIZLLL, "brightness_value");
        c474500IjALIZ.LJJII(C769380UGa.LJIIIIZZ, "volume_value");
        c474500IjALIZ.LJJIJL();
    }

    public final void LIZIZ(long j) {
        TryModeGuidanceSetting tryModeGuidanceSetting = TryModeGuidanceSetting.INSTANCE;
        if (tryModeGuidanceSetting.isV1()) {
            if (C0UID.LIZ()) {
                TryModeGuidanceConfigSetting tryModeGuidanceConfigSetting = TryModeGuidanceConfigSetting.INSTANCE;
                long jBrightnessDetectInterval = j - (tryModeGuidanceConfigSetting.brightnessDetectInterval() * ((long) tryModeGuidanceConfigSetting.brightnessDetectNumber()));
                WeakHandler weakHandlerLIZ = LIZ();
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001;
                weakHandlerLIZ.sendMessageDelayed(messageObtain, jBrightnessDetectInterval);
                WeakHandler weakHandlerLIZ2 = LIZ();
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 2001;
                weakHandlerLIZ2.sendMessageDelayed(messageObtain2, j);
                return;
            }
            return;
        }
        if (tryModeGuidanceSetting.isV2()) {
            LJ(j);
        } else {
            if (!tryModeGuidanceSetting.isV3()) {
                return;
            }
            LJFF(j);
        }
    }

    public final void LIZJ(long j) {
        if (C0UID.LJI()) {
            TryModeGuidanceConfigSetting tryModeGuidanceConfigSetting = TryModeGuidanceConfigSetting.INSTANCE;
            long jVolumeDetectNumber = j - (((long) tryModeGuidanceConfigSetting.volumeDetectNumber()) * tryModeGuidanceConfigSetting.volumeDetectInterval());
            WeakHandler weakHandlerLIZ = LIZ();
            Message messageObtain = Message.obtain();
            messageObtain.what = 1002;
            weakHandlerLIZ.sendMessageDelayed(messageObtain, jVolumeDetectNumber);
            WeakHandler weakHandlerLIZ2 = LIZ();
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 2002;
            weakHandlerLIZ2.sendMessageDelayed(messageObtain2, j);
        }
    }

    public final void LJ(long j) {
        if (C0UID.LIZJ()) {
            LIZ().removeMessages(LivePreCreateNextRoomPlayer.ENABLE);
            WeakHandler weakHandlerLIZ = LIZ();
            Message messageObtain = Message.obtain();
            messageObtain.what = LivePreCreateNextRoomPlayer.ENABLE;
            weakHandlerLIZ.sendMessageDelayed(messageObtain, j);
        }
    }

    public final void LJFF(long j) {
        if (C0UID.LJ()) {
            LIZ().removeMessages(4000);
            WeakHandler weakHandlerLIZ = LIZ();
            Message messageObtain = Message.obtain();
            messageObtain.what = 4000;
            weakHandlerLIZ.sendMessageDelayed(messageObtain, j);
        }
    }

    @Override // X.C0UIG
    public final void handleMsg(Message message) {
        AnonymousClass0956 anonymousClass0956;
        AnonymousClass0956 anonymousClass09562;
        Boolean bool;
        String string;
        if (message == null) {
            return;
        }
        int i = message.what;
        if (i != 3000) {
            if (i == 4000) {
                if (!C0UID.LJ()) {
                    return;
                }
                C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC772600USk.Hf;
                c20337914i1.LIZIZ().put("interact_guidance", Boolean.FALSE);
                c20337914i1.LIZJ();
                this.LIZIZ.FQ2(ShowInteractGuideEvent.class);
                return;
            }
            switch (i) {
                case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                    C769380UGa.LIZ = true;
                    break;
                case 1001:
                    AbstractC1273900jFs abstractC1273900jFs = this.LIZJ;
                    LifecycleCoroutineScope lifecycleCoroutineScope = this.LIZ;
                    long jBrightnessDetectInterval = TryModeGuidanceConfigSetting.INSTANCE.brightnessDetectInterval();
                    if (abstractC1273900jFs != null) {
                        AnonymousClass0956 anonymousClass09563 = C769380UGa.LJ;
                        if (anonymousClass09563 != null && anonymousClass09563.isActive() && (anonymousClass0956 = C769380UGa.LJ) != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        C769380UGa.LJ = C23250099c.LIZLLL(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C754950TjR(jBrightnessDetectInterval, abstractC1273900jFs, null), 2);
                    }
                    break;
                case 1002:
                    AbstractC1273900jFs abstractC1273900jFs2 = this.LIZJ;
                    LifecycleCoroutineScope lifecycleCoroutineScope2 = this.LIZ;
                    if (abstractC1273900jFs2 != null) {
                        if (!C769380UGa.LJI) {
                            C769380UGa.LJI = true;
                            if (C769380UGa.LJIIJ == null) {
                                C769380UGa.LJIIJ = C769590UGv.LIZ;
                            }
                            abstractC1273900jFs2.LJJJ(C769380UGa.LJIIJ);
                        }
                        AnonymousClass0956 anonymousClass09564 = C769380UGa.LJIIIZ;
                        if (anonymousClass09564 != null && anonymousClass09564.isActive() && (anonymousClass09562 = C769380UGa.LJIIIZ) != null) {
                            anonymousClass09562.LIZIZ(null);
                        }
                        C769380UGa.LJIIIZ = C23250099c.LIZLLL(lifecycleCoroutineScope2, C0PEM.LIZJ, null, new C754960TjS(null), 2);
                    }
                    break;
                default:
                    switch (i) {
                        case 2000:
                            C769380UGa.LIZ = false;
                            if (C769380UGa.LIZIZ && C0UID.LIZLLL() && ((bool = (Boolean) this.LIZIZ.gg0(StickerHintShowingChannel.class)) == null || !bool.booleanValue())) {
                                TryModeGuidanceSetting tryModeGuidanceSetting = TryModeGuidanceSetting.INSTANCE;
                                if (tryModeGuidanceSetting.isV1()) {
                                    C20337914i1<Map<String, Boolean>> c20337914i12 = InterfaceC772600USk.Ff;
                                    c20337914i12.LIZIZ().put("face_guidance", Boolean.FALSE);
                                    c20337914i12.LIZJ();
                                } else if (tryModeGuidanceSetting.isV2()) {
                                    C20337914i1<Map<String, Boolean>> c20337914i13 = InterfaceC772600USk.Gf;
                                    c20337914i13.LIZIZ().put("face_guidance", Boolean.FALSE);
                                    c20337914i13.LIZJ();
                                } else if (tryModeGuidanceSetting.isV3()) {
                                    C20337914i1<Map<String, Boolean>> c20337914i14 = InterfaceC772600USk.Hf;
                                    c20337914i14.LIZIZ().put("face_guidance", Boolean.FALSE);
                                    c20337914i14.LIZJ();
                                }
                                this.LIZIZ.LC0(ShowFaceGuideEvent.class, Boolean.TRUE);
                                TryModeGuidanceConfigSetting tryModeGuidanceConfigSetting = TryModeGuidanceConfigSetting.INSTANCE;
                                LIZIZ(tryModeGuidanceConfigSetting.guidanceShowDuration() + tryModeGuidanceConfigSetting.guidanceInterval());
                            } else {
                                LIZIZ(TryModeGuidanceConfigSetting.INSTANCE.guidanceInterval());
                            }
                            break;
                        case 2001:
                            ArrayList arrayList = (ArrayList) C769380UGa.LIZJ;
                            if (!arrayList.isEmpty()) {
                                long jLJZL = C13LP.LJZL(arrayList) / ((long) arrayList.size());
                                C769380UGa.LIZLLL = String.valueOf(jLJZL);
                                if (jLJZL > TryModeGuidanceConfigSetting.INSTANCE.brightnessDetectThreshold() && C0UID.LIZ()) {
                                    C20337914i1<Map<String, Boolean>> c20337914i15 = InterfaceC772600USk.Ff;
                                    c20337914i15.LIZIZ().put("brightness_guidance", Boolean.FALSE);
                                    c20337914i15.LIZJ();
                                    LIZLLL("brightness");
                                    DataChannel dataChannel = this.LIZIZ;
                                    C0UIE c0uie = new C0UIE(C497740JfY.LJIJI(2131855346));
                                    c0uie.LIZIZ = C497740JfY.LJIJI(2131855353);
                                    c0uie.LIZLLL = "tiktok_live_broadcast_normal_1";
                                    c0uie.LJ = "try_mode_brightness_guide_icon.png";
                                    dataChannel.zW(ShowTopGuideChannel.class, c0uie);
                                    WeakHandler weakHandlerLIZ = LIZ();
                                    ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 293);
                                    TryModeGuidanceConfigSetting tryModeGuidanceConfigSetting2 = TryModeGuidanceConfigSetting.INSTANCE;
                                    weakHandlerLIZ.postDelayed(aRunnableS112S0100000_12, tryModeGuidanceConfigSetting2.guidanceShowDuration());
                                    LIZJ(tryModeGuidanceConfigSetting2.guidanceShowDuration() + tryModeGuidanceConfigSetting2.guidanceInterval());
                                }
                            }
                            LIZJ(TryModeGuidanceConfigSetting.INSTANCE.guidanceInterval());
                            break;
                        case 2002:
                            C769380UGa.LJIIJ = null;
                            ArrayList arrayList2 = (ArrayList) C769380UGa.LJII;
                            if (!arrayList2.isEmpty()) {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    if (((Number) it2.next()).intValue() >= TryModeGuidanceConfigSetting.INSTANCE.volumeThreshold()) {
                                        break;
                                    }
                                }
                                Integer num = (Integer) C13LP.LJJLL(C769380UGa.LJII);
                                if (num == null || (string = num.toString()) == null) {
                                    string = "-1";
                                }
                                C769380UGa.LJIIIIZZ = string;
                                if (C0UID.LJI()) {
                                    C20337914i1<Map<String, Boolean>> c20337914i16 = InterfaceC772600USk.Ff;
                                    c20337914i16.LIZIZ().put("volume_guidance", Boolean.FALSE);
                                    c20337914i16.LIZJ();
                                    LIZLLL("voice");
                                    DataChannel dataChannel2 = this.LIZIZ;
                                    C0UIE c0uie2 = new C0UIE(C497740JfY.LJIJI(2131855352));
                                    c0uie2.LIZIZ = C497740JfY.LJIJI(2131855353);
                                    c0uie2.LIZLLL = "tiktok_live_broadcast_normal_1";
                                    c0uie2.LJ = "try_mode_volume_guide_icon.png";
                                    dataChannel2.zW(ShowTopGuideChannel.class, c0uie2);
                                    LIZ().postDelayed(new ARunnableS112S0100000_12(this, 293), TryModeGuidanceConfigSetting.INSTANCE.guidanceShowDuration());
                                }
                            }
                            break;
                    }
                    break;
            }
            return;
        }
        if (!C0UID.LIZJ()) {
            return;
        }
        C20337914i1<Map<String, Boolean>> c20337914i17 = InterfaceC772600USk.Gf;
        c20337914i17.LIZIZ().put("enhance_guidance", Boolean.FALSE);
        c20337914i17.LIZJ();
        this.LIZIZ.FQ2(ShowEnhanceGuideEvent.class);
    }

    public C0UIC(LifecycleCoroutineScope lifecycleCoroutineScope, DataChannel dataChannel) {
        this.LIZ = lifecycleCoroutineScope;
        this.LIZIZ = dataChannel;
    }
}
