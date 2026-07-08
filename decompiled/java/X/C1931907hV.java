package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07hV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1931907hV {
    public static final Map<String, String> LIZ = new LinkedHashMap();

    public static boolean LIZ() {
        C844470XAv.LIZ.getClass();
        return Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
    }

    public static void LIZIZ(String str, Function0 function0) {
        if (!LIZ()) {
            return;
        }
        Object objInvoke = function0.invoke();
        Map<String, String> map = LIZ;
        if (Intrinsics.LJFF(((LinkedHashMap) map).get(str), objInvoke)) {
            return;
        }
        map.put(str, (String) objInvoke);
    }
}
