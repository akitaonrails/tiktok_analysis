package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C314560CUs {
    public static final C314560CUs LIZ = new C314560CUs();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4308));
    public static final Map<String, Long> LIZJ = new LinkedHashMap();

    public static long LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_show_time_");
        C0XQ7.LJ();
        sbLIZ.append(C0XQ7.LIZ.LJIIJ().getCurUser().getUid());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Long> map = LIZJ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (!(linkedHashMap.get(strLIZIZ) != null)) {
            long j = ((Keva) LIZIZ.getValue()).getLong(strLIZIZ, 0L);
            map.put(strLIZIZ, Long.valueOf(j));
            return j;
        }
        Long l = (Long) linkedHashMap.get(strLIZIZ);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
