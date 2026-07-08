package X;

import android.graphics.Paint;

/* JADX INFO: renamed from: X.19Ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21530219Ns extends AbstractC21519119Jl {
    public C21530119Nr LJ;
    public float LJFF;
    public C21530119Nr LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public Paint.Cap LJIIL;
    public Paint.Join LJIILIIL;
    public float LJIILJJIL;

    @Override // X.AbstractC21519319Jn
    public final boolean LIZ() {
        return this.LJI.LIZIZ() || this.LJ.LIZIZ();
    }

    public int getFillColor() {
        return this.LJI.LIZJ;
    }

    public int getStrokeColor() {
        return this.LJ.LIZJ;
    }

    public C21530219Ns() {
        this.LJII = 1.0f;
        this.LJIIIIZZ = 1.0f;
        this.LJIIJ = 1.0f;
        this.LJIIL = Paint.Cap.BUTT;
        this.LJIILIIL = Paint.Join.MITER;
        this.LJIILJJIL = 4.0f;
    }

    public float getFillAlpha() {
        return this.LJIIIIZZ;
    }

    public float getStrokeAlpha() {
        return this.LJII;
    }

    public float getStrokeWidth() {
        return this.LJFF;
    }

    public float getTrimPathEnd() {
        return this.LJIIJ;
    }

    public float getTrimPathOffset() {
        return this.LJIIJJI;
    }

    public float getTrimPathStart() {
        return this.LJIIIZ;
    }

    public C21530219Ns(C21530219Ns c21530219Ns) {
        super(c21530219Ns);
        this.LJII = 1.0f;
        this.LJIIIIZZ = 1.0f;
        this.LJIIJ = 1.0f;
        this.LJIIL = Paint.Cap.BUTT;
        this.LJIILIIL = Paint.Join.MITER;
        this.LJIILJJIL = 4.0f;
        this.LJ = c21530219Ns.LJ;
        this.LJFF = c21530219Ns.LJFF;
        this.LJII = c21530219Ns.LJII;
        this.LJI = c21530219Ns.LJI;
        this.LIZJ = c21530219Ns.LIZJ;
        this.LJIIIIZZ = c21530219Ns.LJIIIIZZ;
        this.LJIIIZ = c21530219Ns.LJIIIZ;
        this.LJIIJ = c21530219Ns.LJIIJ;
        this.LJIIJJI = c21530219Ns.LJIIJJI;
        this.LJIIL = c21530219Ns.LJIIL;
        this.LJIILIIL = c21530219Ns.LJIILIIL;
        this.LJIILJJIL = c21530219Ns.LJIILJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    @Override // X.AbstractC21519319Jn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int[] r6) {
        /*
            r5 = this;
            X.19Nr r2 = r5.LJI
            boolean r0 = r2.LIZIZ()
            r4 = 1
            if (r0 == 0) goto L36
            android.content.res.ColorStateList r1 = r2.LIZIZ
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r0)
            int r0 = r2.LIZJ
            if (r1 == r0) goto L36
            r2.LIZJ = r1
            r3 = 1
        L1a:
            X.19Nr r2 = r5.LJ
            boolean r0 = r2.LIZIZ()
            if (r0 == 0) goto L34
            android.content.res.ColorStateList r1 = r2.LIZIZ
            int r0 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r0)
            int r0 = r2.LIZJ
            if (r1 == r0) goto L34
            r2.LIZJ = r1
        L32:
            r4 = r4 | r3
            return r4
        L34:
            r4 = 0
            goto L32
        L36:
            r3 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21530219Ns.LIZIZ(int[]):boolean");
    }

    public void setFillAlpha(float f) {
        this.LJIIIIZZ = f;
    }

    public void setFillColor(int i) {
        this.LJI.LIZJ = i;
    }

    public void setStrokeAlpha(float f) {
        this.LJII = f;
    }

    public void setStrokeColor(int i) {
        this.LJ.LIZJ = i;
    }

    public void setStrokeWidth(float f) {
        this.LJFF = f;
    }

    public void setTrimPathEnd(float f) {
        this.LJIIJ = f;
    }

    public void setTrimPathOffset(float f) {
        this.LJIIJJI = f;
    }

    public void setTrimPathStart(float f) {
        this.LJIIIZ = f;
    }
}
