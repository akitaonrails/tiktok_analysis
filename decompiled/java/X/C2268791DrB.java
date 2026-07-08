package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.1DrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268791DrB extends InterpolatorC2268801DrC {
    /* JADX WARN: Type inference failed for: r13v0, types: [X.1DrE, X.1DrF] */
    public C2268791DrB(float f, float f2, float f3, float f4) {
        C2268811DrD c2268811DrD;
        final ArrayList arrayList = new ArrayList();
        float f5 = 0.0f;
        arrayList.add(new C2268811DrD(0.0f, 0.0f));
        arrayList.add(new C2268811DrD(f, f2));
        arrayList.add(new C2268811DrD(f3, f4));
        float f6 = 1.0f;
        arrayList.add(new C2268811DrD(1.0f, 1.0f));
        AbstractC2268771Dr9 abstractC2268771Dr9 = new AbstractC2268771Dr9(arrayList) { // from class: X.1DrA
        };
        ?? r13 = new AbstractC2268831DrF() { // from class: X.1DrE
        };
        this.LIZ = r13;
        int i = 100;
        float[] fArr = new float[100];
        int i2 = 400;
        C2268811DrD[] c2268811DrDArr = new C2268811DrD[400];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            float f7 = i3 / 399;
            int length = abstractC2268771Dr9.LIZ.length;
            if (length < 2) {
                c2268811DrD = new C2268811DrD(f5, f5);
            } else {
                int i4 = 0;
                do {
                    C2268811DrD[] c2268811DrDArr2 = abstractC2268771Dr9.LIZIZ;
                    if (c2268811DrDArr2[i4] == null) {
                        c2268811DrDArr2[i4] = new C2268811DrD();
                    }
                    C2268811DrD c2268811DrD2 = c2268811DrDArr2[i4];
                    C2268811DrD c2268811DrD3 = abstractC2268771Dr9.LIZ[i4];
                    c2268811DrD2.getClass();
                    c2268811DrD2.LIZ = c2268811DrD3.LIZ;
                    c2268811DrD2.LIZIZ = c2268811DrD3.LIZIZ;
                    i4++;
                } while (i4 < length);
                C2268811DrD[] c2268811DrDArr3 = abstractC2268771Dr9.LIZIZ;
                int length2 = c2268811DrDArr3.length;
                for (int i5 = 1; i5 <= length2; i5++) {
                    int i6 = 0;
                    while (i6 < length2 - i5) {
                        C2268811DrD c2268811DrD4 = c2268811DrDArr3[i6];
                        float f8 = f6 - f7;
                        float f9 = c2268811DrD4.LIZ * f8;
                        i6++;
                        C2268811DrD c2268811DrD5 = c2268811DrDArr3[i6];
                        c2268811DrD4.LIZ = f9 + (c2268811DrD5.LIZ * f7);
                        c2268811DrD4.LIZIZ = (f8 * c2268811DrD4.LIZIZ) + (c2268811DrD5.LIZIZ * f7);
                        f6 = 1.0f;
                    }
                }
                c2268811DrD = c2268811DrDArr3[0];
            }
            c2268811DrDArr[i3] = new C2268811DrD(c2268811DrD.LIZ, c2268811DrD.LIZIZ);
            i3++;
            f5 = 0.0f;
            f6 = 1.0f;
            i = 100;
            i2 = 400;
        }
        int i7 = 0;
        int i8 = 0;
        do {
            float f10 = i7 / 99;
            int i9 = i8;
            int i10 = 399;
            while (i8 <= i10 && c2268811DrDArr[i8].LIZ <= f10) {
                i9 = (i8 + i10) >>> 1;
                float f11 = c2268811DrDArr[i9].LIZ;
                if (f11 < f10) {
                    i8 = i9 + 1;
                } else if (f11 <= f10) {
                    break;
                } else {
                    i10 = i9 - 1;
                }
            }
            i8 = i9;
            int iMin = Math.min(i9 + 1, 399);
            C2268811DrD c2268811DrD6 = c2268811DrDArr[i8];
            float f12 = c2268811DrD6.LIZ;
            C2268811DrD c2268811DrD7 = c2268811DrDArr[iMin];
            float f13 = c2268811DrD7.LIZ;
            float f14 = c2268811DrD6.LIZIZ;
            float f15 = c2268811DrD7.LIZIZ;
            if (i8 != iMin && f12 != f13) {
                fArr[i7] = f14 + (((f10 - f12) / (f13 - f12)) * (f15 - f14));
            } else {
                fArr[i7] = f14;
            }
            i7++;
        } while (i7 < i);
        r13.LIZ = fArr;
    }
}
