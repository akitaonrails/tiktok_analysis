package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.13x7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20176713x7 implements InterfaceC20175613ww {
    @Override // X.InterfaceC20175613ww
    public final String getStrategyName() {
        return "MvCover";
    }

    @Override // X.InterfaceC20175613ww
    public final long getTimeout() {
        return 30000L;
    }

    @Override // X.InterfaceC20175613ww
    public final boolean LIZIZ(C1457070o1J c1457070o1J) {
        if (c1457070o1J.LIZIZ != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap LIZJ(android.graphics.Bitmap r4, X.C1457070o1J r5) {
        /*
            int r1 = r5.LJFF
            r2 = 1
            if (r1 <= 0) goto L35
            int r0 = r5.LJI
            if (r0 <= 0) goto L18
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r1, r0, r2)
        Ld:
            kotlin.jvm.functions.Function1<android.graphics.Bitmap, android.graphics.Bitmap> r0 = r5.LJIILJJIL
            if (r0 == 0) goto L15
            java.lang.Object r4 = r0.invoke(r4)
        L15:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            return r4
        L18:
            int r1 = r4.getWidth()
            int r0 = r5.LJFF
            if (r1 <= r0) goto L35
            float r3 = (float) r0
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r3 = r3 / r0
            int r1 = r5.LJFF
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r1, r0, r2)
            goto Ld
        L35:
            int r0 = r5.LJI
            if (r0 <= 0) goto Ld
            int r1 = r4.getHeight()
            int r0 = r5.LJI
            if (r1 <= r0) goto Ld
            float r1 = (float) r0
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            int r0 = r5.LJI
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createScaledBitmap(r4, r1, r0, r2)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20176713x7.LIZJ(android.graphics.Bitmap, X.0o1J):android.graphics.Bitmap");
    }

    @Override // X.InterfaceC20175613ww
    public final Object LIZ(C1457070o1J c1457070o1J, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C20176613x6(this, c1457070o1J, null));
    }
}
