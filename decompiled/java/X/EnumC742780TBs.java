package X;

import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualAckMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualBaseMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualDeviceConnectReq;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualDeviceInviteMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualDeviceRejectMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSinkStateMessage;
import com.bytedance.android.livesdk.game.broadcast.dualdevice.message.DualSourceStateMessage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC742780TBs {
    public static final C742770TBr Companion;
    public static final EnumC742780TBs DUAL_ACK_MESSAGE;
    public static final EnumC742780TBs DUAL_DEVICE_CONNECT_REQ;
    public static final EnumC742780TBs DUAL_DEVICE_INVITE_MESSAGE;
    public static final EnumC742780TBs DUAL_DEVICE_REJECT_MESSAGE;
    public static final EnumC742780TBs DUAL_DEVICE_SINK_PONG;
    public static final EnumC742780TBs DUAL_DEVICE_SOURCE_PING;
    public static final EnumC742780TBs DUAL_SINK_STATE_MESSAGE;
    public static final EnumC742780TBs DUAL_SOURCE_STATE_MESSAGE;
    public static final /* synthetic */ EnumC742780TBs[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final Class<? extends DualBaseMessage> LLILLJJLI;

    public static InterfaceC2044707zh<EnumC742780TBs> getEntries() {
        return LLILZ;
    }

    static {
        EnumC742780TBs enumC742780TBs = new EnumC742780TBs("DUAL_SINK_STATE_MESSAGE", 0, 1, DualSinkStateMessage.class);
        DUAL_SINK_STATE_MESSAGE = enumC742780TBs;
        EnumC742780TBs enumC742780TBs2 = new EnumC742780TBs("DUAL_ACK_MESSAGE", 1, 2, DualAckMessage.class);
        DUAL_ACK_MESSAGE = enumC742780TBs2;
        EnumC742780TBs enumC742780TBs3 = new EnumC742780TBs("DUAL_SOURCE_STATE_MESSAGE", 2, 3, DualSourceStateMessage.class);
        DUAL_SOURCE_STATE_MESSAGE = enumC742780TBs3;
        EnumC742780TBs enumC742780TBs4 = new EnumC742780TBs("DUAL_DEVICE_SINK_PONG", 3, 4, C742720TBm.class);
        DUAL_DEVICE_SINK_PONG = enumC742780TBs4;
        EnumC742780TBs enumC742780TBs5 = new EnumC742780TBs("DUAL_DEVICE_SOURCE_PING", 4, 5, C742730TBn.class);
        DUAL_DEVICE_SOURCE_PING = enumC742780TBs5;
        EnumC742780TBs enumC742780TBs6 = new EnumC742780TBs("DUAL_DEVICE_CONNECT_REQ", 5, 6, DualDeviceConnectReq.class);
        DUAL_DEVICE_CONNECT_REQ = enumC742780TBs6;
        EnumC742780TBs enumC742780TBs7 = new EnumC742780TBs("DUAL_DEVICE_INVITE_MESSAGE", 6, 7, DualDeviceInviteMessage.class);
        DUAL_DEVICE_INVITE_MESSAGE = enumC742780TBs7;
        EnumC742780TBs enumC742780TBs8 = new EnumC742780TBs("DUAL_DEVICE_REJECT_MESSAGE", 7, 8, DualDeviceRejectMessage.class);
        DUAL_DEVICE_REJECT_MESSAGE = enumC742780TBs8;
        EnumC742780TBs[] enumC742780TBsArr = {enumC742780TBs, enumC742780TBs2, enumC742780TBs3, enumC742780TBs4, enumC742780TBs5, enumC742780TBs6, enumC742780TBs7, enumC742780TBs8};
        LLILLL = enumC742780TBsArr;
        LLILZ = new C2254308sP(enumC742780TBsArr);
        Companion = new C742770TBr();
    }

    public static EnumC742780TBs[] values() {
        return (EnumC742780TBs[]) LLILLL.clone();
    }

    public final Class<? extends DualBaseMessage> getMessageClass() {
        return this.LLILLJJLI;
    }

    public final int getMessageType() {
        return this.LL;
    }

    public static EnumC742780TBs valueOf(String str) {
        return (EnumC742780TBs) C08FF.LIZ(EnumC742780TBs.class, str);
    }

    public EnumC742780TBs(String str, int i, int i2, Class cls) {
        this.LL = i2;
        this.LLILLJJLI = cls;
    }
}
