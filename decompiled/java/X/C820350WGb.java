package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0WGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820350WGb {
    public static final void LIZ(String[] strArr, C20144713rx c20144713rx) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("country", 0), new Pair("state", 0));
        mapLJIIJ.putAll(C0DQV.LJ(strArr, "options"));
        C837720Wte.LIZ("Facebook", "setDataProcessingOptions", c20144713rx, new C820340WGa(mapLJIIJ, c20144713rx, strArr));
    }
}
