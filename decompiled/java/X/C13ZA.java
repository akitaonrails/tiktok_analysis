package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZA {
    public static final void LJFF() {
        throw new ConcurrentModificationException();
    }

    public static final int LIZ(int i, int[] iArr) {
        return iArr[(i * 5) + 3];
    }

    public static final int LIZJ(int i, int[] iArr) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    public static final int LIZIZ(ArrayList arrayList, int i, int i2) {
        int iLJ = LJ(arrayList, i, i2);
        if (iLJ < 0) {
            return -(iLJ + 1);
        }
        return iLJ;
    }

    public static final void LIZLLL(int i, int i2, int[] iArr) {
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int LJ(ArrayList<C13Z7> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((C13Z7) ListProtector.get(arrayList, i4)).LIZ;
            if (i5 < 0) {
                i5 += i2;
            }
            int iLJI = Intrinsics.LJI(i5, i);
            if (iLJI < 0) {
                i3 = i4 + 1;
            } else if (iLJI > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }
}
