package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1396540mRg extends Drawable {
    public static final C01GW<Path> LJIILIIL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS209S0000000_21.get$arr$(637));
    public int LIZ;
    public final Paint LIZIZ;
    public final Matrix LIZJ;
    public Path LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public float LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final AnimatorSet LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    public final boolean LIZ() {
        return ((ValueAnimator) this.LJIIIIZZ.getValue()).isRunning() || ((ValueAnimator) this.LJIIIZ.getValue()).isRunning() || this.LJIIJ.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        int i = this.LIZ;
        int i2 = -119723;
        if (i != 1) {
            if (i == 2) {
                i2 = -1056964609;
            } else if (i != 10 && i != 11) {
                i2 = this.LJ;
            }
        }
        this.LJ = i2;
        super.invalidateSelf();
    }

    public C1396540mRg() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LIZIZ = paint;
        this.LIZJ = new Matrix();
        this.LJ = -1;
        this.LJFF = 255;
        this.LJI = -16777216;
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1603));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1604));
        this.LJIIJ = new AnimatorSet();
        this.LJIIJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1606));
        this.LJIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1605));
    }

    public final void LIZIZ(int i) {
        this.LIZ = i;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1396540mRg.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJFF = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZIZ.setColorFilter(colorFilter);
    }
}
