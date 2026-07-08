package X;

import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualCameraCaptureSizeMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualCameraStateMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualDevicePublicScreenConfigMsg;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualLiveStateMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.DualLiveStateRequestMessage;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.PhoneAsCameraConnectMsg;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.PhoneAsCameraMirrorInfoMsg;
import com.bytedance.android.livesdk.game.broadcast.mirror.message.PhoneAsCameraSinkFlipCameraMsg;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TE7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TE7 {
    public static final C0TE8 Companion;
    public static final C0TE7 DUAL_CAMERA_CAPTURE_SIZE;
    public static final C0TE7 DUAL_CAMERA_STATE;
    public static final C0TE7 DUAL_DEVICE_PUBLIC_SCREEN_CONFIG;
    public static final C0TE7 DUAL_LIVE_STATE;
    public static final C0TE7 DUAL_LIVE_STATE_REQUEST;
    public static final /* synthetic */ C0TE7[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0TE7 PHONE_AS_CAMERA_CONNECT;
    public static final C0TE7 PHONE_AS_CAMERA_MIRROR_INFO;
    public static final C0TE7 PHONE_AS_CAMERA_SINK_FLIP_CAMERA;
    public static final HashMap<String, Class<? extends C0TER>> map;
    public final String LL;
    public final Class<? extends C0TER> LLILLJJLI;

    public static InterfaceC2044707zh<C0TE7> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0TE8] */
    static {
        C0TE7 c0te7 = new C0TE7(DualCameraStateMessage.class, "DUAL_CAMERA_STATE", "ttlive_dual_device_camera_state", 0);
        DUAL_CAMERA_STATE = c0te7;
        C0TE7 c0te72 = new C0TE7(DualLiveStateMessage.class, "DUAL_LIVE_STATE", "ttlive_dual_device_live_state", 1);
        DUAL_LIVE_STATE = c0te72;
        C0TE7 c0te73 = new C0TE7(DualLiveStateRequestMessage.class, "DUAL_LIVE_STATE_REQUEST", "ttlive_dual_device_live_state_request", 2);
        DUAL_LIVE_STATE_REQUEST = c0te73;
        C0TE7 c0te74 = new C0TE7(DualCameraCaptureSizeMessage.class, "DUAL_CAMERA_CAPTURE_SIZE", "ttlive_dual_device_camera_capture_size", 3);
        DUAL_CAMERA_CAPTURE_SIZE = c0te74;
        C0TE7 c0te75 = new C0TE7(DualDevicePublicScreenConfigMsg.class, "DUAL_DEVICE_PUBLIC_SCREEN_CONFIG", "dual_device_public_screen_config_update", 4);
        DUAL_DEVICE_PUBLIC_SCREEN_CONFIG = c0te75;
        C0TE7 c0te76 = new C0TE7(PhoneAsCameraConnectMsg.class, "PHONE_AS_CAMERA_CONNECT", "ttlive_phone_as_camera_connected", 5);
        PHONE_AS_CAMERA_CONNECT = c0te76;
        C0TE7 c0te77 = new C0TE7(PhoneAsCameraMirrorInfoMsg.class, "PHONE_AS_CAMERA_MIRROR_INFO", "phone_as_camera_mirror_info", 6);
        PHONE_AS_CAMERA_MIRROR_INFO = c0te77;
        C0TE7 c0te78 = new C0TE7(PhoneAsCameraSinkFlipCameraMsg.class, "PHONE_AS_CAMERA_SINK_FLIP_CAMERA", "ttlive_sink_flip_camera_event", 7);
        PHONE_AS_CAMERA_SINK_FLIP_CAMERA = c0te78;
        C0TE7[] c0te7Arr = {c0te7, c0te72, c0te73, c0te74, c0te75, c0te76, c0te77, c0te78};
        LLILLL = c0te7Arr;
        LLILZ = new C2254308sP(c0te7Arr);
        Companion = new Object() { // from class: X.0TE8
        };
        map = new HashMap<>();
    }

    public static C0TE7[] values() {
        return (C0TE7[]) LLILLL.clone();
    }

    public final Class<? extends C0TER> getMessageClass() {
        return this.LLILLJJLI;
    }

    public final String getMethod() {
        return this.LL;
    }

    public static C0TE7 valueOf(String str) {
        return (C0TE7) C08FF.LIZ(C0TE7.class, str);
    }

    public C0TE7(Class cls, String str, String str2, int i) {
        this.LL = str2;
        this.LLILLJJLI = cls;
    }
}
