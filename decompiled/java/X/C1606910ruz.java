package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ruz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606910ruz {
    public static int[] LIZ() {
        int[] iArr = new int[3];
        int i = 0;
        while (true) {
            int i2 = R.attr.ti;
            while (true) {
                iArr[i] = i2;
                i++;
                if (i >= 3) {
                    return iArr;
                }
                if (i != 0) {
                    i2 = i != 1 ? i != 2 ? 0 : R.attr.tk : R.attr.tj;
                }
            }
        }
    }

    public static float[] LIZIZ() {
        float[] fArr = new float[3];
        int i = 0;
        while (true) {
            float f = 0.0f;
            while (true) {
                fArr[i] = f;
                i++;
                if (i >= 3) {
                    return fArr;
                }
                if (i == 0) {
                    break;
                }
                if (i != 1) {
                    f = i == 2 ? 1.0f : 0.5f;
                }
            }
        }
    }
}
