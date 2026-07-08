package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0tuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683740tuu {
    public static final int LIZ(List<C1685910tyP> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        int i = 0;
        for (int i2 = 1; i2 < size; i2++) {
            if (C1685910tyP.LJFF(((C1685910tyP) ListProtector.get(list, i2)).LIZ) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static final int[] LIZIZ(int i, List list) {
        int i2;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = C1685850tyJ.LJIIIZ(((C1685910tyP) ListProtector.get(list, i3)).LIZ);
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size3; i5++) {
            long j = ((C1685910tyP) ListProtector.get(list, i5)).LIZ;
            if (C1685910tyP.LJFF(j) == 0.0f) {
                if (i5 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = C1685850tyJ.LJIIIZ(C1685910tyP.LIZJ(0.0f, ((C1685910tyP) ListProtector.get(list, 1)).LIZ));
                } else if (i5 == size2) {
                    i2 = i4 + 1;
                    iArr2[i4] = C1685850tyJ.LJIIIZ(C1685910tyP.LIZJ(0.0f, ((C1685910tyP) ListProtector.get(list, i5 - 1)).LIZ));
                } else {
                    int i6 = i4 + 1;
                    iArr2[i4] = C1685850tyJ.LJIIIZ(C1685910tyP.LIZJ(0.0f, ((C1685910tyP) ListProtector.get(list, i5 - 1)).LIZ));
                    i4 = i6 + 1;
                    iArr2[i6] = C1685850tyJ.LJIIIZ(C1685910tyP.LIZJ(0.0f, ((C1685910tyP) ListProtector.get(list, i5 + 1)).LIZ));
                }
                i4 = i2;
            } else {
                iArr2[i4] = C1685850tyJ.LJIIIZ(j);
                i4++;
            }
        }
        return iArr2;
    }

    public static final void LIZLLL(List<C1685910tyP> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final float[] LIZJ(int i, List list, List list2) {
        float fFloatValue;
        float fFloatValue2;
        float size;
        if (i == 0) {
            if (list != null) {
                return C13LP.LLI(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        if (list != null) {
            fFloatValue = ((Number) ListProtector.get(list, 0)).floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        fArr[0] = fFloatValue;
        int size2 = list2.size() - 1;
        int i2 = 1;
        for (int i3 = 1; i3 < size2; i3++) {
            long j = ((C1685910tyP) ListProtector.get(list2, i3)).LIZ;
            if (list != null) {
                size = ((Number) ListProtector.get(list, i3)).floatValue();
            } else {
                size = i3 / (list2.size() - 1);
            }
            int i4 = i2 + 1;
            fArr[i2] = size;
            if (C1685910tyP.LJFF(j) == 0.0f) {
                i2 = i4 + 1;
                fArr[i4] = size;
            } else {
                i2 = i4;
            }
        }
        if (list != null) {
            fFloatValue2 = ((Number) ListProtector.get(list, list2.size() - 1)).floatValue();
        } else {
            fFloatValue2 = 1.0f;
        }
        fArr[i2] = fFloatValue2;
        return fArr;
    }
}
