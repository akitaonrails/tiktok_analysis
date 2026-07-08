package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364100lbM {
    public static final String LIZ(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        while (i < length) {
            char c = charArray[i];
            if (Intrinsics.LJI(c, 32) > 0 && c != 160 && c != 12288) {
                break;
            }
            i++;
        }
        while (i < length) {
            char c2 = charArray[length - 1];
            if (Intrinsics.LJI(c2, 32) > 0 && c2 != 160 && c2 != 12288) {
                break;
            }
            length--;
        }
        if (i > 0 || length < str.length()) {
            return str.substring(i, length);
        }
        return str;
    }
}
