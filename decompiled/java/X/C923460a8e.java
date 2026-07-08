package X;

import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0a8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923460a8e {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel) {
        HostDisplayResponse.DisplayInfo displayInfoLIZIZ;
        String string;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (dataChannel == null) {
            displayInfoLIZIZ = C923450a8d.LIZ();
        } else {
            displayInfoLIZIZ = C923450a8d.LIZIZ(dataChannel);
        }
        if (displayInfoLIZIZ == null || (string = Long.valueOf(displayInfoLIZIZ.hostType).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("multi_host_tag", string);
        C0KX4.LIZ("livesdk_multi_host_tag_click", map, null, true);
    }

    public static void LIZIZ(DataChannel dataChannel, String str, String str2) {
        HostDisplayResponse.DisplayInfo displayInfoLIZIZ;
        String string;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("layout_setting", str);
        map.put("window_setting", str2);
        if (dataChannel == null) {
            displayInfoLIZIZ = C923450a8d.LIZ();
        } else {
            displayInfoLIZIZ = C923450a8d.LIZIZ(dataChannel);
        }
        if (displayInfoLIZIZ == null || (string = Long.valueOf(displayInfoLIZIZ.hostType).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("multi_host_tag", string);
        C0KX4.LIZ("livesdk_multi_core_host_tag_show", map, null, true);
    }
}
