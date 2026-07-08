package X;

import android.content.Context;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.CppAgeVerifyResponse;
import com.bytedance.android.livesdk.broadcast.ShouldDoubleCheckAgeVerifyStatus;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0UO8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UO8 {
    public static final C0UO8 LIZ = new C0UO8();

    public static void LIZJ(Context context, DataChannel dataChannel) {
        String str;
        CppAgeVerificationInfo cppAgeVerificationInfo;
        C0UNK c0unk = (C0UNK) DataChannelGlobal.LLILZ.gg0(C931290aLH.class);
        LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        if (liveMode == null || (str = liveMode.logStreamingType) == null) {
            str = LiveMode.VIDEO.logStreamingType;
        }
        if (c0unk != null) {
            cppAgeVerificationInfo = c0unk.LIZJ;
        } else {
            cppAgeVerificationInfo = null;
        }
        LIZIZ(cppAgeVerificationInfo, context, "try_mode", str, true, dataChannel);
    }

    public static boolean LIZ(DataChannel dataChannel, Integer num, Context context, boolean z) {
        RoomCreateInfo roomCreateInfo;
        String str;
        if ((num != null && num.intValue() == -1) || (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null) {
            return false;
        }
        LiveMode liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        if (liveMode == null || (str = liveMode.logStreamingType) == null) {
            str = LiveMode.VIDEO.logStreamingType;
        }
        CppAgeVerificationInfo cppAgeVerificationInfo = (CppAgeVerificationInfo) dataChannel.gg0(CppAgeVerifyResponse.class);
        if (cppAgeVerificationInfo == null) {
            cppAgeVerificationInfo = roomCreateInfo.cppAgeVerificationInfo;
        }
        LIZ.getClass();
        return LIZIZ(cppAgeVerificationInfo, context, "go_live", str, z, dataChannel);
    }

    public static boolean LIZIZ(CppAgeVerificationInfo cppAgeVerificationInfo, Context context, String str, String str2, boolean z, DataChannel dataChannel) {
        if (C0UOD.LIZ(cppAgeVerificationInfo, z) != null) {
            boolean zLIZJ = C0UOD.LIZJ(context, null, cppAgeVerificationInfo, str, "room_create", str2, dataChannel, z);
            if (zLIZJ) {
                dataChannel.zW(ShouldDoubleCheckAgeVerifyStatus.class, Boolean.TRUE);
            }
            return zLIZJ;
        }
        return false;
    }
}
