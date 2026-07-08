package X;

import android.text.TextUtils;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.00yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C255500yn {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(163));

    public static Map LIZ(String str, String str2, boolean z) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("url", str);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("self_msg", str3);
        linkedHashMap.put("device_perf_score", LIZ.getValue());
        linkedHashMap.put("business_id", str2);
        return linkedHashMap;
    }

    public static void LIZJ(DataChannel dataChannel, String str, String str2, boolean z, boolean z2) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_barrage_render_effect");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJIIZI(LIZ(str, str2, z));
        c474500IjALIZ.LJJII(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (z2) {
            str3 = "play_animation_exceed_duration";
        } else {
            str3 = "play_animation_end";
        }
        c474500IjALIZ.LJJII(str3, "category");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(int i, DataChannel dataChannel, String str, String str2, String str3, boolean z) {
        HashMap map = new HashMap();
        map.put("category", "render_downgrade");
        if (!TextUtils.isEmpty(str3)) {
            map.put("error_msg", str3);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_barrage_render_effect");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJIIZI(LIZ(str, str2, z));
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LIZ();
    }
}
