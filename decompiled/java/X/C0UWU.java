package X;

import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.SuggestedDefinitionByAutoSpeedDetection;
import com.bytedance.android.livesdk.dataChannel.SuggestedDefinitionByManuallySpeedDetection;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0UWU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWU {
    public static final void LIZ(EnumC783720Uok enumC783720Uok, PushStreamInfo.Quality quality) {
        String str = quality.sdkKey;
        if (enumC783720Uok != null) {
            int i = C0UWV.LIZ[enumC783720Uok.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    DataChannelGlobal.LLILZ.HQ2(SuggestedDefinitionByManuallySpeedDetection.class, str);
                    HashMap map = new HashMap();
                    map.put("name", quality.name);
                    map.put("sdk_key", quality.sdkKey);
                    InterfaceC772390URp.p.LJFF(map);
                }
            } else {
                DataChannelGlobal.LLILZ.HQ2(SuggestedDefinitionByAutoSpeedDetection.class, str);
            }
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.JQ2(C931140aL2.class, str);
        Map<String, Object> map2 = C1338270kvh.LIZ;
        dataChannelGlobal.HQ2(BroadcastShareScreenDefinition.class, quality);
    }
}
