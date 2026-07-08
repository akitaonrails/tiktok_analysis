package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ztS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913480ztS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, Map map) {
        C100C.LIZ.LIZJ().LIZ(str, C2097608Jq.LJIIL(map, C2097908Jt.LIZJ(new Pair("sdk_version", "0.2.1"))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(String str, Map map, Map map2, int i) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            map2 = null;
        }
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        C100C.LIZ.LIZJ().LIZJ(str, null, C2097608Jq.LJIIL(map, C2097908Jt.LIZJ(new Pair("sdk_version", "0.2.1"))), map2);
    }
}
