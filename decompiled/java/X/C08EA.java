package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.08EA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EA {
    public static String LIZ(String str) {
        if (str.length() == 0) {
            return "";
        }
        int iMax = Math.max(a0.LJJJJ(str, '/', 0, 6), a0.LJJJJ(str, '\\', 0, 6));
        if (iMax != -1) {
            return str.substring(iMax + 1);
        }
        return str;
    }
}
