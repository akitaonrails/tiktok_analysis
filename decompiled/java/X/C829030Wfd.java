package X;

/* JADX INFO: renamed from: X.0Wfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829030Wfd {
    public static int LIZ(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i2 = 0;
        do {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
                i2++;
            } else {
                throw null;
            }
        } while (i2 < 6);
        return 1;
    }
}
