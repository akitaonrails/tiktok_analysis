package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.19Ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21541219Ry extends Drawable.ConstantState {
    public int LIZ;
    public C19LG LIZIZ;
    public ColorStateList LIZJ;
    public PorterDuff.Mode LIZLLL;
    public boolean LJ;
    public Bitmap LJFF;
    public ColorStateList LJI;
    public PorterDuff.Mode LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public Paint LJIIJJI;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C19LH(this);
    }

    public C21541219Ry() {
        this.LIZLLL = C19LH.LLJI;
        this.LIZIZ = new C19LG();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.LIZ;
    }

    public C21541219Ry(C21541219Ry c21541219Ry) {
        this.LIZLLL = C19LH.LLJI;
        if (c21541219Ry != null) {
            this.LIZ = c21541219Ry.LIZ;
            C19LG c19lg = new C19LG(c21541219Ry.LIZIZ);
            this.LIZIZ = c19lg;
            if (c21541219Ry.LIZIZ.LJ != null) {
                c19lg.LJ = new Paint(c21541219Ry.LIZIZ.LJ);
            }
            if (c21541219Ry.LIZIZ.LIZLLL != null) {
                this.LIZIZ.LIZLLL = new Paint(c21541219Ry.LIZIZ.LIZLLL);
            }
            this.LIZJ = c21541219Ry.LIZJ;
            this.LIZLLL = c21541219Ry.LIZLLL;
            this.LJ = c21541219Ry.LJ;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C19LH(this);
    }
}
