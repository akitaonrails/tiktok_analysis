package X;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.19b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21568519b1 extends C21568419b0 {
    public final boolean LJII;
    public final C21568719b3 LJIIIIZZ;
    public double LJIIIZ;
    public double LJIIJ;

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final Shader LIZJ() {
        C21568719b3 c21568719b3;
        char c;
        float f;
        if (getBounds().bottom <= 0 || this.LJIIIZ <= 0.0d || (c21568719b3 = this.LJIIIIZZ) == null) {
            return null;
        }
        float f2 = getBounds().bottom;
        double d = this.LJIIJ;
        if (d >= c21568719b3.LIZ()) {
            double d2 = f2;
            boolean z = d + d2 > c21568719b3.LIZLLL;
            double dLIZ = (d - c21568719b3.LIZ()) / (c21568719b3.LIZLLL - c21568719b3.LIZ());
            double dLIZ2 = ((d - c21568719b3.LIZ()) + d2) / (c21568719b3.LIZLLL - c21568719b3.LIZ());
            c21568719b3.LJI[0] = c21568719b3.LJFF.LIZ(dLIZ);
            c21568719b3.LJI[1] = z ? c21568719b3.LIZJ : c21568719b3.LJFF.LIZ(dLIZ2);
            float[] fArr = c21568719b3.LJII;
            fArr[0] = 0.0f;
            fArr[1] = z ? (float) ((c21568719b3.LIZLLL - d) / d2) : 1.0f;
            return new LinearGradient(0.0f, 0.0f, 0.0f, f2, c21568719b3.LJI, c21568719b3.LJII, Shader.TileMode.CLAMP);
        }
        double d3 = f2;
        double d4 = d + d3;
        if (d4 < c21568719b3.LIZ()) {
            boolean z2 = d < 0.0d;
            double dLIZ3 = d / c21568719b3.LIZ();
            double dLIZ4 = d4 / c21568719b3.LIZ();
            c21568719b3.LJI[0] = z2 ? c21568719b3.LIZ : c21568719b3.LJ.LIZ(dLIZ3);
            c21568719b3.LJI[1] = c21568719b3.LJ.LIZ(dLIZ4);
            c21568719b3.LJII[0] = z2 ? (float) (Math.abs(d) / d3) : 0.0f;
            c21568719b3.LJII[1] = 1.0f;
            return new LinearGradient(0.0f, 0.0f, 0.0f, f2, c21568719b3.LJI, c21568719b3.LJII, Shader.TileMode.REPEAT);
        }
        boolean z3 = d < 0.0d;
        boolean z4 = d4 > c21568719b3.LIZLLL;
        float fLIZ = (float) ((c21568719b3.LIZ() - d) / d3);
        c21568719b3.LJIIIIZZ[0] = z3 ? c21568719b3.LIZ : c21568719b3.LJ.LIZ(d / c21568719b3.LIZ());
        int[] iArr = c21568719b3.LJIIIIZZ;
        iArr[1] = c21568719b3.LIZIZ;
        iArr[2] = z4 ? c21568719b3.LIZJ : c21568719b3.LJFF.LIZ(((d - c21568719b3.LIZ()) + d3) / (c21568719b3.LIZLLL - c21568719b3.LIZ()));
        c21568719b3.LJIIIZ[0] = z3 ? (float) (Math.abs(d) / d3) : 0.0f;
        float[] fArr2 = c21568719b3.LJIIIZ;
        fArr2[1] = fLIZ;
        if (z4) {
            f = (float) ((c21568719b3.LIZLLL - d) / d3);
            c = 2;
        } else {
            c = 2;
            f = 1.0f;
        }
        fArr2[c] = f;
        return new LinearGradient(0.0f, 0.0f, 0.0f, f2, c21568719b3.LJIIIIZZ, c21568719b3.LJIIIZ, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return new C21568619b2(this.LIZ, this.LIZIZ, this.LIZJ, this.LJII, this.LJIIIZ, this.LJIIJ);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        C21568619b2 c21568619b2 = new C21568619b2(this.LIZ, this.LIZIZ, this.LIZJ, this.LJII, this.LJIIIZ, this.LJIIJ);
        C21568519b1 c21568519b1 = new C21568519b1(c21568619b2.LIZ, c21568619b2.LIZIZ, c21568619b2.LIZJ, c21568619b2.LIZLLL);
        c21568519b1.LIZLLL(c21568619b2.LJ, c21568619b2.LJFF);
        return c21568519b1;
    }

    @Override // X.C21568419b0
    public final Paint LIZ() {
        LIZIZ().setStyle(Paint.Style.FILL);
        Paint paintLIZIZ = LIZIZ();
        C0OT1 c0ot1 = this.LIZIZ.LIZJ;
        paintLIZIZ.setColor(c0ot1 != null ? c0ot1.LIZ : 0);
        LIZIZ().setStrokeWidth(0.0f);
        Paint paintLIZIZ2 = LIZIZ();
        paintLIZIZ2.setShader(LIZJ());
        return paintLIZIZ2;
    }

    public final boolean LIZLLL(double d, double d2) {
        if (this.LJIIIZ == d && d2 == this.LJIIJ) {
            return false;
        }
        this.LJIIIZ = d;
        C21568719b3 c21568719b3 = this.LJIIIIZZ;
        if (c21568719b3 != null) {
            c21568719b3.LIZLLL = d;
        }
        this.LJIIJ = d2;
        LIZIZ().setShader(LIZJ());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21568519b1(android.content.Context r8, X.C0OVA r9, X.C0OTJ r10, boolean r11) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            r7.LJII = r11
            X.01GW r0 = X.C21569119b7.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r8)
            if (r0 == 0) goto L6b
            int r1 = r0.intValue()
            X.01GW r0 = X.C21569119b7.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r8)
            if (r0 == 0) goto L6b
            int r6 = r0.intValue()
            X.01GW r0 = X.C21569119b7.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r8)
            if (r0 == 0) goto L6b
            int r5 = r0.intValue()
            X.19b3 r4 = new X.19b3
            X.19b4 r2 = new X.19b4
            r2.<init>(r1, r6)
            r0 = 4588807732320345784(0x3faeb851eb851eb8, double:0.06)
            int r3 = r2.LIZ(r0)
            X.19b4 r2 = new X.19b4
            r2.<init>(r6, r5)
            r0 = 4605741266919258849(0x3feae147ae147ae1, double:0.84)
            int r0 = r2.LIZ(r0)
            r4.<init>(r3, r6, r0)
        L68:
            r7.LJIIIIZZ = r4
            return
        L6b:
            r4 = 0
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21568519b1.<init>(android.content.Context, X.0OVA, X.0OTJ, boolean):void");
    }
}
