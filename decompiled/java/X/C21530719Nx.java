package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19Nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21530719Nx {
    public final ArrayList<C19OA> LIZ = new ArrayList<>();
    public final C21530919Nz LIZIZ = new C21530919Nz();
    public final C19O9 LIZJ;

    public C21530719Nx(C19O9 c19o9) {
        this.LIZJ = c19o9;
    }

    public final void LIZJ(C19O9 c19o9) {
        this.LIZ.clear();
        int size = c19o9.LIZ.size();
        for (int i = 0; i < size; i++) {
            C19OA c19oa = (C19OA) ListProtector.get(c19o9.LIZ, i);
            C19O3 horizontalDimensionBehaviour = c19oa.getHorizontalDimensionBehaviour();
            C19O3 c19o3 = C19O3.MATCH_CONSTRAINT;
            if (horizontalDimensionBehaviour == c19o3 || c19oa.getVerticalDimensionBehaviour() == c19o3) {
                this.LIZ.add(c19oa);
            }
        }
        c19o9.LIZJ.LIZIZ = true;
    }

    public final boolean LIZ(C19O0 c19o0, C19OA c19oa, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.LIZIZ.LIZ = c19oa.getHorizontalDimensionBehaviour();
        this.LIZIZ.LIZIZ = c19oa.getVerticalDimensionBehaviour();
        this.LIZIZ.LIZJ = c19oa.getWidth();
        this.LIZIZ.LIZLLL = c19oa.getHeight();
        C21530919Nz c21530919Nz = this.LIZIZ;
        c21530919Nz.LJIIIIZZ = false;
        c21530919Nz.LJIIIZ = i;
        C19O3 c19o3 = c21530919Nz.LIZ;
        C19O3 c19o32 = C19O3.MATCH_CONSTRAINT;
        if (c19o3 == c19o32) {
            z = true;
        } else {
            z = false;
        }
        if (c21530919Nz.LIZIZ == c19o32) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && c19oa.mDimensionRatio > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && c19oa.mDimensionRatio > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && c19oa.mResolvedMatchConstraintDefault[0] == 4) {
            c21530919Nz.LIZ = C19O3.FIXED;
        }
        if (z4 && c19oa.mResolvedMatchConstraintDefault[1] == 4) {
            c21530919Nz.LIZIZ = C19O3.FIXED;
        }
        c19o0.LIZIZ(c19oa, c21530919Nz);
        c19oa.setWidth(this.LIZIZ.LJ);
        c19oa.setHeight(this.LIZIZ.LJFF);
        C21530919Nz c21530919Nz2 = this.LIZIZ;
        c19oa.hasBaseline = c21530919Nz2.LJII;
        c19oa.setBaselineDistance(c21530919Nz2.LJI);
        C21530919Nz c21530919Nz3 = this.LIZIZ;
        c21530919Nz3.LJIIIZ = 0;
        return c21530919Nz3.LJIIIIZZ;
    }

    public final void LIZIZ(C19O9 c19o9, int i, int i2) {
        int i3 = c19o9.mMinWidth;
        int i4 = c19o9.mMinHeight;
        c19o9.setMinWidth(0);
        c19o9.setMinHeight(0);
        c19o9.setWidth(i);
        c19o9.setHeight(i2);
        c19o9.setMinWidth(i3);
        c19o9.setMinHeight(i4);
        this.LIZJ.LIZLLL();
    }
}
