package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.18AG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18AG {
    public static final C18AH LIZ(String str, C18AF c18af, Object obj, Object obj2) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("param_name", str), new Pair("error_type", c18af.getValue()));
        if (obj != null) {
            mapLJIIJ.put("expect_value", obj);
        }
        if (obj2 != null) {
            mapLJIIJ.put("actual_value", obj2);
        }
        return new C18AH(str, c18af, mapLJIIJ);
    }
}
