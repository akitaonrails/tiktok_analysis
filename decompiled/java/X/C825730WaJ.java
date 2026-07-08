package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825730WaJ {
    public static boolean LIZ(EnumC825810WaR enumC825810WaR, String[] strArr) {
        Function1<? super EnumC825810WaR, ? extends List<String>> function1;
        List<String> listInvoke;
        if (strArr == null || (function1 = C825750WaL.LIZLLL) == null || (listInvoke = function1.invoke(enumC825810WaR)) == null) {
            return false;
        }
        for (String str : strArr) {
            if (listInvoke.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
