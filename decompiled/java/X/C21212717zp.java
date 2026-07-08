package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.17zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21212717zp {
    public static C1743900vTw LIZIZ;
    public static final C21212717zp LIZ = new C21212717zp();
    public static Map<String, String> LIZJ = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:112:0x0222 A[PHI: r16
      0x0222: PHI (r16v3 java.lang.String) = (r16v0 java.lang.String), (r16v5 java.lang.String) binds: [B:69:0x00df, B:67:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.base.TrackParams LIZ() {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21212717zp.LIZ():com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.base.TrackParams");
    }

    public static void LIZJ() {
        C1743900vTw c1743900vTw;
        for (Map.Entry<String, String> entry : LIZJ.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            C1743900vTw c1743900vTw2 = LIZIZ;
            if (c1743900vTw2 != null) {
                c1743900vTw2.LJIIIIZZ(key, value, false);
            }
        }
        String str = LIZJ.get("entrance_form");
        if (str == null || !C123100dR.LIZ(str) || (c1743900vTw = LIZIZ) == null) {
            return;
        }
        c1743900vTw.LJIIIIZZ("anchor_show_type", str, false);
    }

    public static void LIZIZ(String str, String str2, Map map) {
        String str3;
        Object obj = map.get(str2);
        if ((obj instanceof String) && (str3 = (String) obj) != null) {
            C1743900vTw c1743900vTw = LIZIZ;
            if (c1743900vTw != null) {
                c1743900vTw.LJIIIIZZ(str, str3, true);
            }
            C1766860w4y.LIZ.getClass();
            C1766860w4y.LJIILL(null, str2, str3, true);
        }
    }
}
