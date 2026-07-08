package X;

import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.090v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23035090v {
    public static final AtomicInteger LIZ = new AtomicInteger(0);

    public static String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("-");
        sbLIZ.append(LIZ.incrementAndGet());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("-");
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static boolean LIZ(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (iArr.length < 2) {
            return false;
        }
        int i9 = iArr[0];
        int i10 = iArr[1];
        if (i10 > 1 && i9 > 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Using default adapted resolution(");
            sbLIZ.append(i9);
            sbLIZ.append("x");
            sbLIZ.append(i10);
            sbLIZ.append(")");
            AVLog.iod("MiscUtils", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        if (i >= 1 && i2 >= 1) {
            if (i3 < 1 || i4 < 1) {
                iArr[0] = i;
                iArr[1] = i2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Using source resolution as adapted resolution(");
                sbLIZ2.append(i);
                sbLIZ2.append("x");
                sbLIZ2.append(i2);
                sbLIZ2.append(")");
                AVLog.iod("MiscUtils", C2188811AlT.LIZIZ(sbLIZ2));
                return true;
            }
        } else if (i3 < 1 || i4 < 1) {
            return false;
        }
        if (i >= 1 && i2 >= 1) {
            int iMax = Math.max(i, i2);
            int iMin = Math.min(i, i2);
            while (true) {
                i5 = iMax;
                iMax = iMin;
                if (iMin == 0) {
                    break;
                }
                iMin = i5 % iMin;
            }
            int i11 = i / i5;
            int i12 = i2 / i5;
            int i13 = i4 * i3;
            float f = ((i3 * 1.0f) / i4) / ((i * 1.0f) / i2);
            if (f >= 1.0f) {
                i6 = i3 / i11;
            } else {
                i6 = i4 / i12;
            }
            while (true) {
                if (i6 <= i5) {
                    i7 = i11 * i6;
                    i8 = i12 * i6;
                    if (i7 * i8 >= i13 && ((f >= 1.0f && i7 >= i3) || (f <= 1.0f && i8 >= i4))) {
                        break;
                    }
                    i6++;
                } else if (i6 >= i5) {
                    i7 = i;
                    i8 = i2;
                } else {
                    return false;
                }
            }
            int i14 = ((i7 + 1) / 2) * 2;
            int i15 = ((i8 + 1) / 2) * 2;
            iArr[0] = i14;
            iArr[1] = i15;
            String strJ4 = C786410Ut5.j4("adapted resolution(%dx%d) aspect(%dx%d) cap(%dx%d) ref(%dx%d)", new Object[]{Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Find best ");
            sbLIZ3.append(strJ4);
            AVLog.iod("MiscUtils", C2188811AlT.LIZIZ(sbLIZ3));
            return true;
        }
        iArr[0] = i3;
        iArr[1] = i4;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Using reference resolution as adapted resolution(");
        sbLIZ4.append(i3);
        sbLIZ4.append("x");
        sbLIZ4.append(i4);
        sbLIZ4.append(")");
        AVLog.iod("MiscUtils", C2188811AlT.LIZIZ(sbLIZ4));
        return true;
    }
}
