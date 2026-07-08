package X;

import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import com.bytedance.android.live.liveinteract.platform.common.settings.HostTagSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0a8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923450a8d {
    public static final /* synthetic */ int LIZ = 0;

    public static HostDisplayResponse.DisplayInfo LIZ() {
        return (HostDisplayResponse.DisplayInfo) DataChannelGlobal.LLILZ.gg0(C930900aKe.class);
    }

    public static HostDisplayResponse.DisplayInfo LIZIZ(DataChannel dataChannel) {
        if (HostTagSettings.INSTANCE.useGlobalData()) {
            return (HostDisplayResponse.DisplayInfo) DataChannelGlobal.LLILZ.gg0(C930900aKe.class);
        }
        if (dataChannel != null) {
            return (HostDisplayResponse.DisplayInfo) dataChannel.gg0(C956890b0Z.class);
        }
        return null;
    }

    public static void LIZJ(DataChannel dataChannel) {
        if (HostTagSettings.INSTANCE.useGlobalData()) {
            DataChannelGlobal.LLILZ.IQ2(C930900aKe.class);
        } else {
            if (dataChannel == null) {
                return;
            }
            dataChannel.SX0(C956890b0Z.class, null);
        }
    }

    public static void LIZLLL(DataChannel dataChannel, HostDisplayResponse.DisplayInfo displayInfo) {
        if (HostTagSettings.INSTANCE.useGlobalData()) {
            DataChannelGlobal.LLILZ.JQ2(C930900aKe.class, displayInfo);
        } else {
            if (dataChannel == null) {
                return;
            }
            dataChannel.SX0(C956890b0Z.class, displayInfo);
        }
    }
}
