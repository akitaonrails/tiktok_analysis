package X;

import android.graphics.Matrix;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19LF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19LF extends AbstractC21519319Jn {
    public final Matrix LIZ;
    public final ArrayList<AbstractC21519319Jn> LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public final Matrix LJIIIZ;
    public final int LJIIJ;
    public String LJIIJJI;

    @Override // X.AbstractC21519319Jn
    public final boolean LIZ() {
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            if (((AbstractC21519319Jn) ListProtector.get(this.LIZIZ, i)).LIZ()) {
                return true;
            }
        }
        return false;
    }

    public final void LIZJ() {
        this.LJIIIZ.reset();
        this.LJIIIZ.postTranslate(-this.LIZLLL, -this.LJ);
        this.LJIIIZ.postScale(this.LJFF, this.LJI);
        this.LJIIIZ.postRotate(this.LIZJ, 0.0f, 0.0f);
        this.LJIIIZ.postTranslate(this.LJII + this.LIZLLL, this.LJIIIIZZ + this.LJ);
    }

    public C19LF() {
        this.LIZ = new Matrix();
        this.LIZIZ = new ArrayList<>();
        this.LIZJ = 0.0f;
        this.LIZLLL = 0.0f;
        this.LJ = 0.0f;
        this.LJFF = 1.0f;
        this.LJI = 1.0f;
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = new Matrix();
        this.LJIIJJI = null;
    }

    public String getGroupName() {
        return this.LJIIJJI;
    }

    public Matrix getLocalMatrix() {
        return this.LJIIIZ;
    }

    public float getPivotX() {
        return this.LIZLLL;
    }

    public float getPivotY() {
        return this.LJ;
    }

    public float getRotation() {
        return this.LIZJ;
    }

    public float getScaleX() {
        return this.LJFF;
    }

    public float getScaleY() {
        return this.LJI;
    }

    public float getTranslateX() {
        return this.LJII;
    }

    public float getTranslateY() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC21519319Jn
    public final boolean LIZIZ(int[] iArr) {
        boolean zLIZIZ = false;
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            zLIZIZ |= ((AbstractC21519319Jn) ListProtector.get(this.LIZIZ, i)).LIZIZ(iArr);
        }
        return zLIZIZ;
    }

    public void setPivotX(float f) {
        if (f != this.LIZLLL) {
            this.LIZLLL = f;
            LIZJ();
        }
    }

    public void setPivotY(float f) {
        if (f != this.LJ) {
            this.LJ = f;
            LIZJ();
        }
    }

    public void setRotation(float f) {
        if (f != this.LIZJ) {
            this.LIZJ = f;
            LIZJ();
        }
    }

    public void setScaleX(float f) {
        if (f != this.LJFF) {
            this.LJFF = f;
            LIZJ();
        }
    }

    public void setScaleY(float f) {
        if (f != this.LJI) {
            this.LJI = f;
            LIZJ();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.LJII) {
            this.LJII = f;
            LIZJ();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.LJIIIIZZ) {
            this.LJIIIIZZ = f;
            LIZJ();
        }
    }

    public C19LF(C19LF c19lf, C830490Whz<String, Object> c830490Whz) {
        AbstractC21519119Jl c21519219Jm;
        this.LIZ = new Matrix();
        this.LIZIZ = new ArrayList<>();
        this.LIZJ = 0.0f;
        this.LIZLLL = 0.0f;
        this.LJ = 0.0f;
        this.LJFF = 1.0f;
        this.LJI = 1.0f;
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        Matrix matrix = new Matrix();
        this.LJIIIZ = matrix;
        this.LJIIJJI = null;
        this.LIZJ = c19lf.LIZJ;
        this.LIZLLL = c19lf.LIZLLL;
        this.LJ = c19lf.LJ;
        this.LJFF = c19lf.LJFF;
        this.LJI = c19lf.LJI;
        this.LJII = c19lf.LJII;
        this.LJIIIIZZ = c19lf.LJIIIIZZ;
        String str = c19lf.LJIIJJI;
        this.LJIIJJI = str;
        this.LJIIJ = c19lf.LJIIJ;
        if (str != null) {
            c830490Whz.put(str, this);
        }
        matrix.set(c19lf.LJIIIZ);
        ArrayList<AbstractC21519319Jn> arrayList = c19lf.LIZIZ;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = ListProtector.get(arrayList, i);
            if (obj instanceof C19LF) {
                this.LIZIZ.add(new C19LF((C19LF) obj, c830490Whz));
            } else {
                if (obj instanceof C21530219Ns) {
                    c21519219Jm = new C21530219Ns((C21530219Ns) obj);
                } else if (obj instanceof C21519219Jm) {
                    c21519219Jm = new C21519219Jm((C21519219Jm) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.LIZIZ.add(c21519219Jm);
                String str2 = c21519219Jm.LIZIZ;
                if (str2 != null) {
                    c830490Whz.put(str2, c21519219Jm);
                }
            }
        }
    }
}
