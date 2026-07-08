package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396550mRh extends Drawable {
    public static Path LJIIJJI;
    public static final Path LJIIL = C21518819Ji.LIZLLL("M2.22007 2.85027C3.81991 1.23931 6.33895 1.24829 8 3.02816C9.66105 1.24829 12.1801 1.23931 13.7799 2.85027C15.4067 4.48834 15.4067 7.1421 13.7799 8.78017L8.45177 14.1454C8.33229 14.2657 8.16966 14.3334 8 14.3334C7.83034 14.3334 7.66771 14.2657 7.54823 14.1454L2.22007 8.78017C0.593309 7.1421 0.593309 4.48834 2.22007 2.85027Z");
    public int LIZ;
    public final Paint LIZIZ;
    public final Matrix LIZJ;
    public Path LIZLLL;
    public int LJ;
    public int LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final AnimatorSet LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    public final boolean LIZ() {
        return ((ValueAnimator) this.LJI.getValue()).isRunning() || ((ValueAnimator) this.LJII.getValue()).isRunning() || this.LJIIIIZZ.isRunning();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invalidateSelf() {
        /*
            r3 = this;
            int r1 = r3.LIZ
            r0 = 1
            if (r1 == r0) goto L28
            r0 = 2
            if (r1 == r0) goto L24
            r0 = 10
            if (r1 == r0) goto L28
            r0 = 11
            if (r1 == r0) goto L28
            int r2 = r3.LJ
        L12:
            android.graphics.Paint r0 = r3.LIZIZ
            r0.setColor(r2)
            android.graphics.Paint r1 = r3.LIZIZ
            int r0 = r3.LJFF
            r1.setAlpha(r0)
            r3.LJ = r2
            super.invalidateSelf()
            return
        L24:
            r2 = -1056964609(0xffffffffc0ffffff, float:-7.9999995)
            goto L12
        L28:
            r2 = -119723(0xfffffffffffe2c55, float:NaN)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396550mRh.invalidateSelf():void");
    }

    public C1396550mRh() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.LIZIZ = paint;
        this.LIZJ = new Matrix();
        this.LIZLLL = new Path(LJIIL);
        this.LJ = -1;
        this.LJFF = 255;
        this.LJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1310));
        this.LJII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1311));
        this.LJIIIIZZ = new AnimatorSet();
        this.LJIIIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1313));
        this.LJIIJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1312));
    }

    public final void LIZIZ(int i) {
        this.LIZ = i;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396550mRh.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJFF = i;
        this.LIZIZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZIZ.setColorFilter(colorFilter);
    }
}
