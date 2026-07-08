package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rE6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580320rE6 {
    public static final Set<Function0<Unit>> LIZ = new LinkedHashSet();
    public static final Set<Integer> LIZIZ = new LinkedHashSet();
    public static boolean LIZJ;

    public static void LIZ(Function0 function0) {
        if (LIZJ) {
            Set<Integer> set = LIZIZ;
            if (!set.contains(Integer.valueOf(function0.hashCode()))) {
                set.add(Integer.valueOf(function0.hashCode()));
                function0.invoke();
                return;
            }
            return;
        }
        LIZ.add(function0);
    }
}
