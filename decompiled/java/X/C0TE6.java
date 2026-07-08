package X;

import X.C0TE2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceFlipCameraChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceFlipCameraClickMockChannel;
import com.bytedance.android.livesdk.dataChannel.LivePhoneAsCameraRetryClickEvent;
import com.bytedance.android.livesdk.dataChannel.LivePhoneAsCameraSurfaceCreatedEvent;
import com.bytedance.android.livesdk.dataChannel.PhoneAsCameraSurfaceAvailable;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualLiveStateMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.PhoneAsCameraConnectMsg;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.PhoneAsCameraSinkFlipCameraMsg;
import com.bytedance.android.livesdk.game.multidevicesdk.dualdevice.CastLinkerWrapper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TE6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TE6 implements InterfaceC743380TEa {
    public final DataChannel LIZ;
    public final String LIZIZ;
    public final C0TE2 LIZJ;

    @Override // X.InterfaceC743380TEa
    public final C11PQ<EnumC743340TDw> LIZ() {
        C0TE2 c0te2 = this.LIZJ;
        if (c0te2 != null) {
            return c0te2.LJIIIZ;
        }
        return null;
    }

    @Override // X.InterfaceC743380TEa
    public final C11PQ<AbstractC743230TDl> LIZLLL() {
        C0TE2 c0te2 = this.LIZJ;
        if (c0te2 != null) {
            return c0te2.LJIIIIZZ;
        }
        return null;
    }

    @Override // X.InterfaceC743380TEa
    public final void LIZIZ(boolean z) {
        C0TE2 c0te2 = this.LIZJ;
        if (c0te2 != null) {
            c0te2.LJFF(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // X.InterfaceC743380TEa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.os.Bundle r13) {
        /*
            r12 = this;
            r8 = -1
            if (r13 == 0) goto L57
            java.lang.String r0 = "source_port"
            int r4 = r13.getInt(r0)
            java.lang.String r0 = "source_ip"
            java.lang.String r5 = r13.getString(r0)
            if (r5 != 0) goto L13
        L11:
            java.lang.String r5 = ""
        L13:
            if (r13 == 0) goto L1b
            java.lang.String r0 = "version"
            int r8 = r13.getInt(r0)
        L1b:
            r6 = 640(0x280, float:8.97E-43)
            if (r13 == 0) goto L25
            java.lang.String r0 = "video_width"
            int r6 = r13.getInt(r0, r6)
        L25:
            r7 = 480(0x1e0, float:6.73E-43)
            if (r13 == 0) goto L2f
            java.lang.String r0 = "video_height"
            int r7 = r13.getInt(r0, r7)
        L2f:
            if (r13 == 0) goto L53
            java.lang.String r0 = "fps"
            int r2 = r13.getInt(r0)
            java.lang.String r0 = "bit_rate_scale"
            float r1 = r13.getFloat(r0)
            java.lang.String r0 = "pc_version"
            int r11 = r13.getInt(r0)
        L43:
            X.0TE2 r3 = r12.LIZJ
            if (r3 == 0) goto L52
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Float r10 = java.lang.Float.valueOf(r1)
            r3.LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11)
        L52:
            return
        L53:
            r2 = 0
            r1 = 0
            r11 = 0
            goto L43
        L57:
            r4 = -1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TE6.LIZJ(android.os.Bundle):void");
    }

    public C0TE6(LifecycleOwner lifecycleOwner, DataChannel dataChannel, C1273340jEy c1273340jEy, String str, AwS591S0100000_12 awS591S0100000_12) {
        this.LIZ = dataChannel;
        this.LIZIZ = str;
        C0TE2 c0te2 = new C0TE2(C11RB.LIZIZ(lifecycleOwner).LIZIZ, CardStruct.IStatusCode.DEFAULT, C743540TEq.LIZ(), C0TDY.CAST_PHONE_AS_CAMERA);
        this.LIZJ = c0te2;
        c0te2.LIZJ(awS591S0100000_12);
        c0te2.LJIIIZ(new IMessageListener() { // from class: X.0TEF
            public final String onMessageSync(String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("test onMessageSync from source:");
                sbLIZ.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final void onMessage(ServiceInfo serviceInfo, String str2) throws JSONException {
                DataChannel dataChannel2;
                C0TFE.LIZ.getClass();
                C0TER c0terLJII = C0TFE.LJII(str2);
                C20441214yg.LJ("PhoneAsCameraWirelessStrategy", String.valueOf(c0terLJII));
                if (c0terLJII instanceof PhoneAsCameraConnectMsg) {
                    PhoneAsCameraConnectMsg phoneAsCameraConnectMsg = (PhoneAsCameraConnectMsg) c0terLJII;
                    if (phoneAsCameraConnectMsg.startMirror == 1) {
                        DataChannel dataChannel3 = this.LIZ.LIZ;
                        if (dataChannel3 != null) {
                            dataChannel3.FQ2(LivePhoneAsCameraSurfaceCreatedEvent.class);
                        }
                        C743540TEq.LJJIJ(C0TET.WIRELESS, "success", C0TES.LIZ(this.LIZ.LIZ), this.LIZ.LIZIZ, null);
                    }
                    C0TE2 c0te22 = this.LIZ.LIZJ;
                    if (c0te22 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("result", phoneAsCameraConnectMsg.startMirror);
                        jSONObject.put("reason", "");
                        CastLinkerWrapper castLinkerWrapper = c0te22.LJI;
                        if (castLinkerWrapper != null) {
                            castLinkerWrapper.onRevMirrorRequestMsg(C786410Ut5.J3(jSONObject));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (c0terLJII instanceof DualLiveStateMessage) {
                    DualLiveStateMessage dualLiveStateMessage = (DualLiveStateMessage) c0terLJII;
                    this.LIZ.getClass();
                    DataChannel dataChannel4 = this.LIZ.LIZ;
                    if (dataChannel4 == null) {
                        return;
                    }
                    dataChannel4.SX0(C0TZV.class, dualLiveStateMessage.roomId);
                    return;
                }
                if (!(c0terLJII instanceof PhoneAsCameraSinkFlipCameraMsg) || (dataChannel2 = this.LIZ.LIZ) == null) {
                    return;
                }
                dataChannel2.FQ2(LiveDualDeviceFlipCameraClickMockChannel.class);
            }
        });
        c0te2.LJFF = c1273340jEy;
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, LivePhoneAsCameraRetryClickEvent.class, new AwS591S0100000_12(this, 935));
            dataChannel.EQ2(lifecycleOwner, LiveDualDeviceFlipCameraChannel.class, new AwS591S0100000_12(this, 936));
            dataChannel.EQ2(lifecycleOwner, PhoneAsCameraSurfaceAvailable.class, new AwS591S0100000_12(this, 937));
        }
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.game.broadcast.phoneascamera.PhoneAsCameraWirelessStrategy$5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) throws Throwable {
                C0TE2 c0te22;
                if (event == Lifecycle.Event.ON_DESTROY && (c0te22 = this.LL.LIZJ) != null) {
                    c0te22.LJII();
                }
            }
        });
    }
}
