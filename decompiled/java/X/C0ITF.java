package X;

import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0ITF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ITF {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(7));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(8));

    public static Map LIZ(Long l, String str) {
        Object obj;
        C1090000eTG c1090000eTGO3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(l);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ILiveFeatureCenterService iLiveFeatureCenterService = (ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
        if (iLiveFeatureCenterService != null && (c1090000eTGO3 = iLiveFeatureCenterService.O3(EnumC1094630eaj.DEFAULT, "feed_service_sort", strLIZIZ)) != null) {
            obj = c1090000eTGO3.LIZJ;
        } else {
            obj = null;
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }

    public static void LIZIZ(String str, Map map, String str2, Object obj) {
        Map map2 = (Map) ((LinkedHashMap) map).get(str);
        if (map2 != null) {
            map2.put(str2, obj);
        } else {
            map.put(str, C2097608Jq.LJIIJ(new Pair(str2, obj)));
        }
    }
}
