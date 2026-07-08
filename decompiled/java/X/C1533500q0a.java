package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0q0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533500q0a {
    public static final String LIZ(HashMap map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append(String.valueOf(entry.getValue()));
            sb.append(", ");
        }
        return sb.toString();
    }

    public static final HashMap<String, Object> LIZIZ(C1533510q0b c1533510q0b) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("gecko_access_key", String.valueOf(c1533510q0b.LIZ).toLowerCase());
        map.put("gecko_channel", String.valueOf(c1533510q0b.LIZIZ).toLowerCase());
        map.put("gecko_bundle", String.valueOf(c1533510q0b.LIZJ).toLowerCase());
        map.put("gecko_sync_update", Boolean.valueOf(c1533510q0b.LIZLLL));
        map.put("wait_low_storage_update", String.valueOf(c1533510q0b.LJ).toLowerCase());
        map.put("check_gecko_file_available", String.valueOf(c1533510q0b.LJFF).toLowerCase());
        map.put("disable_gecko_update", String.valueOf(c1533510q0b.LJI).toLowerCase());
        map.put("support_directory", String.valueOf(c1533510q0b.LJII).toLowerCase());
        map.put("gecko_config_from", String.valueOf(c1533510q0b.LJIIIIZZ).toLowerCase());
        return map;
    }

    public static final HashMap<String, Object> LIZJ(C1533490q0Z c1533490q0Z) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("res_src", c1533490q0Z.LJJJJIZL);
        map.put("forest", String.valueOf(c1533490q0Z.LJJJJJ).toLowerCase());
        map.put("is_async", String.valueOf(c1533490q0Z.LJJJJJL).toLowerCase());
        map.put("gecko_model", String.valueOf(c1533490q0Z.LJJJJLI).toLowerCase());
        map.put("use_interaction", String.valueOf(c1533490q0Z.LJJJJLL).toLowerCase());
        map.put("net_depender", String.valueOf(c1533490q0Z.LJJJJZ).toLowerCase());
        map.put("fallback_domains", String.valueOf(c1533490q0Z.LJJJJZI).toLowerCase());
        map.put("support_shuffle", String.valueOf(c1533490q0Z.LJJJLIIL).toLowerCase());
        map.put("fetcher_list", c1533490q0Z.LJJJLL);
        return map;
    }
}
