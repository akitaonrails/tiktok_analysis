package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Qyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687910Qyb {
    public static final C687910Qyb LIZ = new C687910Qyb();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(29));

    public static void LIZJ(long j) {
        C687930Qyd.LIZ.getClass();
        Map mapLIZIZ = C687930Qyd.LIZIZ("tt_poi_search_popup");
        if (mapLIZIZ == null) {
            mapLIZIZ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZIZ);
        linkedHashMap.put("turnOnPopup", C2097908Jt.LIZJ(new Pair("closeCount", Long.valueOf(j))));
        C687930Qyd.LIZLLL(System.currentTimeMillis(), null, "tt_poi_search_popup", linkedHashMap);
    }

    public static void LIZIZ(C687910Qyb c687910Qyb, EnumC687950Qyf enumC687950Qyf) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        c687910Qyb.getClass();
        try {
            Keva keva = (Keva) LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("popup_last_show_ts_");
            sbLIZ.append(enumC687950Qyf.name().toLowerCase(Locale.ROOT));
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static long LIZ(C687910Qyb c687910Qyb, Map map, String str) {
        Number number;
        Object obj = map.get(str);
        if ((obj instanceof Number) && (number = (Number) obj) != null) {
            return number.longValue();
        }
        return 0L;
    }
}
