package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529860pui {
    public static final Map<String, String> LIZ = new LinkedHashMap();

    public static String LIZ(String str) {
        if (str == null) {
            return null;
        }
        for (Map.Entry entry : ((LinkedHashMap) LIZ).entrySet()) {
            C1537480q70.Companion.getClass();
            if (Intrinsics.LJFF(C1529830puf.LIZ(str), entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
