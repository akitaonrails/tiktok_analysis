package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1162950gMv {
    public static final Set<String> LJFF = C13LQ.LJLIIL(new String[]{"url", "biz", "show_debug_label", "use_mock_data", "enable_cdn_cache", "enable_memory_cache", "enable_template_cache", "base_on_width_dp", "view_scale", "font_scale", "enable_leaf_flatten", "enable_level_flatten"});
    public static final Map<String, Object> LJI;
    public C1168340gVc LIZLLL;
    public final Map<String, Object> LIZ = C2097608Jq.LJIIZILJ(LJI);
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Object> LIZJ = new ConcurrentHashMap<>();
    public final EnumC1162970gMx LJ = EnumC1162970gMx.CLIENT_OVERRIDES_FIRST;

    static {
        Boolean bool = Boolean.FALSE;
        C1168270gVV.LIZ.getClass();
        LJI = C2097608Jq.LJIIIIZZ(new Pair("url", ""), new Pair("biz", ""), new Pair("show_debug_label", bool), new Pair("use_mock_data", bool), new Pair("enable_cdn_cache", bool), new Pair("enable_memory_cache", bool), new Pair("enable_template_cache", Boolean.TRUE), new Pair("enable_leaf_flatten", Boolean.valueOf(C1168270gVV.LJ())), new Pair("enable_level_flatten", Boolean.valueOf(C1168270gVV.LJFF())));
    }

    public final String LIZIZ() {
        return (String) LIZ("biz");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r4.equals("enable_cdn_cache") != false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T LIZ(java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1162950gMv.LIZ(java.lang.String):java.lang.Object");
    }

    public static void LIZJ(Map map, ConcurrentHashMap concurrentHashMap) {
        for (Map.Entry entry : map.entrySet()) {
            concurrentHashMap.put(entry.getKey(), entry.getValue());
        }
    }
}
