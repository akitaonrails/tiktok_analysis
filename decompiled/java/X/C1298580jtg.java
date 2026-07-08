package X;

/* JADX INFO: renamed from: X.0jtg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298580jtg {
    public static float LIZJ(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else {
            if (f3 < 3.0f) {
                return f2;
            }
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f + f4;
    }

    public static int LIZ(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[PHI: r2
      0x0058: PHI (r2v1 float) = (r2v0 float), (r2v6 float) binds: [B:9:0x0019, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(float r5, float r6, float r7) {
        /*
            r2 = 0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r0 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 % r0
            if (r1 >= 0) goto L9
            float r5 = r5 + r0
        L9:
            r0 = 1114636288(0x42700000, float:60.0)
            float r5 = r5 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float r7 = r7 / r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L5b
            r6 = 0
        L17:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L58
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L51
            r2 = 1065353216(0x3f800000, float:1.0)
        L21:
            float r0 = r2 + r6
            float r6 = r6 * r2
            float r6 = r0 - r6
        L26:
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            float r2 = r2 - r6
            float r0 = r5 + r1
            float r0 = LIZJ(r2, r6, r0)
            float r4 = LIZJ(r2, r6, r5)
            float r5 = r5 - r1
            float r3 = LIZJ(r2, r6, r5)
            r2 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r2
            int r0 = LIZ(r0)
            int r1 = r0 << 16
            float r4 = r4 * r2
            int r0 = LIZ(r4)
            int r0 = r0 << 8
            r1 = r1 | r0
            float r3 = r3 * r2
            int r0 = LIZ(r3)
            r0 = r0 | r1
            return r0
        L51:
            r2 = r7
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L21
        L58:
            float r6 = r6 + r1
            float r6 = r6 * r2
            goto L26
        L5b:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1298580jtg.LIZIZ(float, float, float):int");
    }
}
