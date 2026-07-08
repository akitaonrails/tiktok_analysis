package X;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;

/* JADX INFO: renamed from: X.0kHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1313600kHu {
    SOLID,
    DASHED,
    DOTTED,
    DOUBLE,
    GROOVE,
    RIDGE,
    INSET,
    OUTSET,
    HIDDEN,
    NONE;

    public boolean isSolidDashedOrDotted() {
        int i = C1313810kIF.LIZ[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public static EnumC1313600kHu parse(int i) {
        if (i >= 0 && i <= NONE.ordinal()) {
            return values()[i];
        }
        return null;
    }

    public static EnumC1313600kHu valueOf(String str) {
        return (EnumC1313600kHu) C08FF.LIZ(EnumC1313600kHu.class, str);
    }

    public PathEffect getPathEffect(float f) {
        int i = C1313810kIF.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
        }
        float f2 = f * 3.0f;
        return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
    }

    public PathEffect getPathEffectAutoAdjust(float f, float f2) {
        int i;
        if (this != DASHED && this != DOTTED) {
            return null;
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (this == DOTTED) {
            i = 2;
        } else {
            i = 6;
        }
        int i2 = (((int) (((f2 / ((f * i) * 0.5f)) - 0.5f) * 0.5f)) * 2) + 1;
        if (i2 <= 1) {
            return null;
        }
        float f3 = f2 / i2;
        return new DashPathEffect(new float[]{f3, f3}, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r2
      0x002f: PHI (r2v5 float) = (r2v3 float), (r2v7 float) binds: [B:15:0x002d, B:18:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[PHI: r2
      0x0036: PHI (r2v4 float) = (r2v3 float), (r2v7 float) binds: [B:15:0x002d, B:18:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[PHI: r1
      0x003d: PHI (r1v5 float) = (r1v2 float), (r1v8 float) binds: [B:21:0x003b, B:25:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045 A[PHI: r1
      0x0045: PHI (r1v3 float) = (r1v2 float), (r1v8 float) binds: [B:21:0x003b, B:25:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.graphics.Canvas r10, android.graphics.Paint r11, int r12, float r13, float r14, int r15, int r16, float r17, float r18, float r19, float r20) {
        /*
            r0 = 0
            r9 = r11
            r9.setPathEffect(r0)
            r9.setStrokeWidth(r13)
            r3 = -1
        L9:
            r4 = 1
            if (r3 > r4) goto L48
            r1 = 0
            if (r12 == 0) goto L39
            if (r12 == r4) goto L2b
            r0 = 2
            if (r12 == r0) goto L40
            r0 = 3
            if (r12 == r0) goto L31
            r0 = 0
            r2 = 0
        L19:
            r9.setColor(r0)
            float r5 = r17 + r1
            float r6 = r18 + r2
            float r7 = r19 + r1
            float r8 = r20 + r2
            r4 = r10
            r4.drawLine(r5, r6, r7, r8, r9)
            int r3 = r3 + 2
            goto L9
        L2b:
            float r2 = (float) r3
            float r2 = r2 * r14
            if (r3 != r4) goto L36
        L2f:
            r0 = r15
            goto L19
        L31:
            float r2 = -r14
            float r0 = (float) r3
            float r2 = r2 * r0
            if (r3 != r4) goto L2f
        L36:
            r0 = r16
            goto L19
        L39:
            float r1 = (float) r3
            float r1 = r1 * r14
            if (r3 != r4) goto L45
        L3d:
            r0 = r15
        L3e:
            r2 = 0
            goto L19
        L40:
            float r1 = -r14
            float r0 = (float) r3
            float r1 = r1 * r0
            if (r3 != r4) goto L3d
        L45:
            r0 = r16
            goto L3e
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC1313600kHu.LIZJ(android.graphics.Canvas, android.graphics.Paint, int, float, float, int, int, float, float, float, float):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void strokeBorderLine(android.graphics.Canvas r29, android.graphics.Paint r30, int r31, float r32, int r33, float r34, float r35, float r36, float r37, float r38, float r39) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC1313600kHu.strokeBorderLine(android.graphics.Canvas, android.graphics.Paint, int, float, int, float, float, float, float, float, float):void");
    }
}
