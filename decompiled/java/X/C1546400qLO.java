package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0qLO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546400qLO {
    public static final C1546400qLO LIZ = new C1546400qLO();
    public static final ConcurrentHashMap<String, Integer> LIZIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(276));
    public static final C1554480qYQ LIZLLL = new C1554480qYQ(CoroutineExceptionHandler.LJJLIL, 1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C1546400qLO r5, android.content.Context r6, int r7, int r8, androidx.fragment.app.Fragment r9, X.InterfaceC497601wk r10, int r11) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546400qLO.LIZ(X.0qLO, android.content.Context, int, int, androidx.fragment.app.Fragment, X.01wk, int):void");
    }

    public static void LIZIZ(C1546400qLO c1546400qLO, int i, int i2, String str, Integer num, String str2, int i3) {
        if ((i3 & 8) != 0) {
            str = null;
        }
        if ((i3 & 128) != 0) {
            num = null;
        }
        if ((i3 & 256) != 0) {
            str2 = null;
        }
        c1546400qLO.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("type", "gecko_update"), new Pair("result", Integer.valueOf(i)), new Pair("preload_scene", Integer.valueOf(i2)));
        if (str != null) {
            mapLJIIJ.put("channel", str);
        }
        if (num != null) {
            mapLJIIJ.put("error_code", Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            mapLJIIJ.put("error_msg", str2);
        }
        C1018703yb.LJ("rd_tiktokec_pdp_preload_resource", mapLJIIJ);
    }
}
