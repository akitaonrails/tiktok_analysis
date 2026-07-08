package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Pb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647880Pb8 {
    public static int LIZ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            Integer num = C647890Pb9.LJIIZILJ.get(str);
            if (num == null) {
                return 1;
            }
            return num.intValue();
        }
        return 3;
    }

    public static void LIZIZ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            C647890Pb9.LJIIZILJ.remove(str);
        }
    }
}
