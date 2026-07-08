package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS100S1200000_16;

/* JADX INFO: renamed from: X.0cz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1032820cz2 {
    public static void LIZ(C1032800cz0 c1032800cz0, AbstractC1033330czr abstractC1033330czr) {
        if (c1032800cz0 != null) {
            c1032800cz0.updateState(new C1032960czG(new C1032980czI(abstractC1033330czr)));
        }
    }

    public final void LIZIZ(C1032800cz0 c1032800cz0, HashMap map) {
        String str;
        if (map == null || (str = (String) map.get("task_id")) == null) {
            str = "";
        }
        Boolean bool = Boolean.FALSE;
        C1032900czA.LJIIIIZZ(c1032800cz0, str, bool, bool);
        c1032800cz0.updateState(C1032570cyd.LIZ);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ad_num", "1"), new Pair("is_pre_req", "false"));
        Integer num = c1032800cz0.getAdConfig().LIZ;
        if (num != null) {
            mapLJIIJ.put("video_seconds", String.valueOf(num.intValue()));
        }
        if (map != null && !map.isEmpty()) {
            mapLJIIJ.putAll(map);
        }
        c1032800cz0.request(EnumC1033600d0I.GET, "/tiktok/v1/ad/incentive/", null, mapLJIIJ, new AwS100S1200000_16(this, c1032800cz0, str, 8));
    }

    public static void LIZJ(C1032800cz0 c1032800cz0, String str, String str2) {
        c1032800cz0.setRewardAdDataStatus(EnumC993300bxI.FAILED);
        C1032900czA.LJI(c1032800cz0, false, "networkerror", str, str2, false, null, null, 192);
    }
}
