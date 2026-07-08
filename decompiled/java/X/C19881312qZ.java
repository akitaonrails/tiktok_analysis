package X;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: X.12qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19881312qZ extends AbstractC19881512qb {
    public static int LIZIZ(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] LIZJ(Collection<? extends Number> collection) {
        if (collection instanceof C19881412qa) {
            C19881412qa c19881412qa = (C19881412qa) collection;
            return Arrays.copyOfRange(c19881412qa.LL, c19881412qa.LLILLJJLI, c19881412qa.LLILLL);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int LIZ(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(C08KM.LIZ("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
    }
}
