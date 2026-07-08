package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS167S1100000_18;

/* JADX INFO: renamed from: X.0uw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722880uw2 {
    public static List<Pair<String, String>> LIZ;
    public static long LIZIZ = System.currentTimeMillis();
    public static final C1722890uw3 LIZJ = new C1722890uw3();

    public static void LIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", str);
        linkedHashMap.put("time_duration", String.valueOf(System.currentTimeMillis() - LIZIZ));
        linkedHashMap.put("pi_load_success", String.valueOf(LIZJ.LIZJ.get()));
        C07M6.LIZ(new AwS167S1100000_18("rd_pipo_hp_load", (String) linkedHashMap, (Map<String, String>) 18));
    }
}
