package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07aT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1888307aT {
    public static String LIZ(int i, int[] iArr, int[] iArr2, String[] strArr) {
        StringBuilder sb = new StringBuilder(e3.c);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append('.');
                    String str = strArr[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            }
        }
        return sb.toString();
    }
}
