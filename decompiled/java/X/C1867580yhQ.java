package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yhQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867580yhQ {
    public static final Map<String, Function0<C103R>> LIZ = new LinkedHashMap();

    public static void LIZ(String str, Function0 function0) {
        if (str.length() == 0) {
            return;
        }
        LIZ.put(str, function0);
    }
}
