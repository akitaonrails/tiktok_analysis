package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.052e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12878052e {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, Map map) {
        Object obj;
        if ((!Intrinsics.LJFF(str, "lynx_end_layer") && !Intrinsics.LJFF(str, "native_end_layer")) || map == null || (obj = map.get("enable_avoid_other")) == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() == 0) {
                return false;
            }
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        if (!u.LJIJI((String) obj, "true", true) && !Intrinsics.LJFF(obj, "1")) {
            return false;
        }
        return true;
    }
}
