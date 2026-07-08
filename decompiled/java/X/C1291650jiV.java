package X;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0jiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291650jiV {
    public static final Set<String> LIZ = new HashSet();
    public static int LIZIZ = 0;

    public static void LIZ() {
        int i = LIZIZ;
        if (i > 0) {
            LIZIZ = i - 1;
        }
    }

    public static void LIZIZ(String str) {
        Set<String> set = LIZ;
        if (((HashSet) set).contains(str)) {
            return;
        }
        ((HashSet) set).add(str);
    }
}
