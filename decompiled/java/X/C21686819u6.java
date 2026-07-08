package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.19u6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21686819u6 {
    public int[] LIZ;

    public final void LIZ(int i) {
        int[] iArr = this.LIZ;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.LIZ = iArr2;
            Arrays.fill(iArr2, Integer.MIN_VALUE);
        } else {
            if (i < iArr.length) {
                return;
            }
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.LIZ = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.LIZ;
            Arrays.fill(iArr4, iArr.length, iArr4.length, Integer.MIN_VALUE);
        }
    }
}
