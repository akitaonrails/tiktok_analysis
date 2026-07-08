package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* JADX INFO: renamed from: X.19SQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C19SQ extends Drawable.ConstantState {
    public final C19SP LIZ;
    public Resources LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public SparseArray<Drawable.ConstantState> LJFF;
    public Drawable[] LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public Rect LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public boolean LJJII;
    public ColorFilter LJJIII;
    public boolean LJJIIJ;
    public ColorStateList LJJIIJZLJL;
    public PorterDuff.Mode LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;

    public final void LIZIZ() {
        this.LJIIL = true;
        LIZJ();
        int i = this.LJII;
        Drawable[] drawableArr = this.LJI;
        this.LJIILJJIL = -1;
        this.LJIILIIL = -1;
        this.LJIILLIIL = 0;
        this.LJIILL = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.LJIILIIL) {
                this.LJIILIIL = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.LJIILJJIL) {
                this.LJIILJJIL = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.LJIILL) {
                this.LJIILL = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.LJIILLIIL) {
                this.LJIILLIIL = minimumHeight;
            }
        }
    }

    public abstract void LJ();

    public final void LIZJ() {
        SparseArray<Drawable.ConstantState> sparseArray = this.LJFF;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.LJFF.keyAt(i);
                Drawable.ConstantState constantStateValueAt = this.LJFF.valueAt(i);
                Drawable[] drawableArr = this.LJI;
                Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.LIZIZ);
                C16G6.LIZIZ(drawableNewDrawable, this.LJJ);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.LIZ);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.LJFF = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.LJII;
        Drawable[] drawableArr = this.LJI;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = this.LJFF.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (C16GF.LIZIZ(drawable)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.LIZLLL | this.LJ;
    }

    public final int LIZ(Drawable drawable) {
        int i = this.LJII;
        if (i >= this.LJI.length) {
            int i2 = i + 10;
            C19SR c19sr = (C19SR) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = c19sr.LJI;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            c19sr.LJI = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(c19sr.LJJIJIIJI, 0, iArr, 0, i);
            c19sr.LJJIJIIJI = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.LIZ);
        this.LJI[i] = drawable;
        this.LJII++;
        this.LJ = drawable.getChangingConfigurations() | this.LJ;
        this.LJIIZILJ = false;
        this.LJIJI = false;
        this.LJIIJ = null;
        this.LJIIIZ = false;
        this.LJIIL = false;
        this.LJIJJ = false;
        return i;
    }

    public final Drawable LIZLLL(int i) {
        int iIndexOfKey;
        Drawable drawable = this.LJI[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray<Drawable.ConstantState> sparseArray = this.LJFF;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = this.LJFF.valueAt(iIndexOfKey).newDrawable(this.LIZIZ);
        C16G6.LIZIZ(drawableNewDrawable, this.LJJ);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.LIZ);
        this.LJI[i] = drawableMutate;
        this.LJFF.removeAt(iIndexOfKey);
        if (this.LJFF.size() == 0) {
            this.LJFF = null;
        }
        return drawableMutate;
    }

    public C19SQ(C19SQ c19sq, C19SP c19sp, Resources resources) {
        Resources resources2;
        int i;
        this.LJIL = true;
        this.LIZ = c19sp;
        if (resources != null) {
            resources2 = resources;
        } else if (c19sq != null) {
            resources2 = c19sq.LIZIZ;
        } else {
            resources2 = null;
        }
        this.LIZIZ = resources2;
        if (c19sq != null) {
            i = c19sq.LIZJ;
        } else {
            i = 0;
        }
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.LIZJ = i;
        if (c19sq != null) {
            this.LIZLLL = c19sq.LIZLLL;
            this.LJ = c19sq.LJ;
            this.LJIJJ = true;
            this.LJIJJLI = true;
            this.LJIIIIZZ = c19sq.LJIIIIZZ;
            this.LJIIJJI = c19sq.LJIIJJI;
            this.LJIL = c19sq.LJIL;
            this.LJJ = c19sq.LJJ;
            this.LJJI = c19sq.LJJI;
            this.LJJIFFI = c19sq.LJJIFFI;
            this.LJJII = c19sq.LJJII;
            this.LJJIII = c19sq.LJJIII;
            this.LJJIIJ = c19sq.LJJIIJ;
            this.LJJIIJZLJL = c19sq.LJJIIJZLJL;
            this.LJJIIZ = c19sq.LJJIIZ;
            this.LJJIIZI = c19sq.LJJIIZI;
            this.LJJIJ = c19sq.LJJIJ;
            if (c19sq.LIZJ == i) {
                if (c19sq.LJIIIZ) {
                    this.LJIIJ = c19sq.LJIIJ != null ? new Rect(c19sq.LJIIJ) : null;
                    this.LJIIIZ = true;
                }
                if (c19sq.LJIIL) {
                    this.LJIILIIL = c19sq.LJIILIIL;
                    this.LJIILJJIL = c19sq.LJIILJJIL;
                    this.LJIILL = c19sq.LJIILL;
                    this.LJIILLIIL = c19sq.LJIILLIIL;
                    this.LJIIL = true;
                }
            }
            if (c19sq.LJIIZILJ) {
                this.LJIJ = c19sq.LJIJ;
                this.LJIIZILJ = true;
            }
            if (c19sq.LJIJI) {
                this.LJIJI = true;
            }
            Drawable[] drawableArr = c19sq.LJI;
            this.LJI = new Drawable[drawableArr.length];
            this.LJII = c19sq.LJII;
            SparseArray<Drawable.ConstantState> sparseArray = c19sq.LJFF;
            if (sparseArray != null) {
                this.LJFF = sparseArray.clone();
            } else {
                this.LJFF = new SparseArray<>(this.LJII);
            }
            int i2 = this.LJII;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.LJFF.put(i3, constantState);
                    } else {
                        this.LJI[i3] = drawableArr[i3];
                    }
                }
            }
            return;
        }
        this.LJI = new Drawable[10];
        this.LJII = 0;
    }
}
