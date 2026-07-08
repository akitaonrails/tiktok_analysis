package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07jD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1942507jD {
    public static Map<String, Integer> LIZ = new ConcurrentHashMap();

    public static boolean LIZ(String str, String str2) {
        if (!a0.LJJIJ(str2, '*')) {
            return Intrinsics.LJFF(str, str2);
        }
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (str2.charAt(i2) == '*') {
                i++;
            }
        }
        if (i == 2) {
            if (!a0.LJJLIIIJJIZ(str2, '*') || !a0.LJJIJIIJIL(str2, '*')) {
                return false;
            }
            return a0.LJJIIZI(str, str2.substring(1, str2.length() - 1), false);
        }
        if (i == 1) {
            if (a0.LJJLIIIJJIZ(str2, '*')) {
                return u.LJIIZILJ(str, str2.substring(1), false);
            }
        } else if (i != 1) {
            return false;
        }
        if (!a0.LJJIJIIJIL(str2, '*')) {
            return false;
        }
        return u.LJJIIJZLJL(str, str2.substring(0, str2.length() - 1), false);
    }
}
