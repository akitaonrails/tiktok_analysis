package X;

/* JADX INFO: renamed from: X.03gF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C904903gF {
    public static boolean LIZ(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length + 1;
        int[] iArr = new int[length];
        int length2 = charArray.length - 1;
        int i = 1;
        while (length2 >= 0) {
            iArr[i] = charArray[length2] - '0';
            length2--;
            i++;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 1; i4 < length; i4++) {
            if (i4 % 2 == 0) {
                int i5 = iArr[i4] * 2;
                if (i5 >= 10) {
                    i5 -= 9;
                }
                i2 += i5;
            } else {
                i3 += iArr[i4];
            }
        }
        if ((i2 + i3) % 10 == 0) {
            return true;
        }
        return false;
    }
}
