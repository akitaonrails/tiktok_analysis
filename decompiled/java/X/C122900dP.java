package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00dP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C122900dP {
    public static final boolean LIZ(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                if (a0.LJLIIIL((String) obj).toString().length() != 0) {
                    return false;
                }
            } else {
                if (obj instanceof List) {
                    return ((List) obj).isEmpty();
                }
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof Integer) {
                    return Intrinsics.LJFF(obj, 0);
                }
                if (obj instanceof Double) {
                    return Intrinsics.LIZIZ((Double) obj, 0.0d);
                }
                if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
