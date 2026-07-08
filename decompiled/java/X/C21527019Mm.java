package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19Mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21527019Mm {
    public C19O9 LIZ = new C19O9();
    public C19O9 LIZIZ = new C19O9();
    public C19MB LIZJ = null;
    public C19MB LIZLLL = null;
    public int LJ;
    public int LJFF;
    public final /* synthetic */ C21526919Ml LJI;

    public final void LIZ() {
        C19OA c19oaLIZJ;
        C19OA c19oaLIZJ2;
        int childCount = this.LJI.getChildCount();
        this.LJI.LLJI.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.LJI.getChildAt(i);
            this.LJI.LLJI.put(childAt, new C21528019Mw(childAt));
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = this.LJI.getChildAt(i2);
            C21528019Mw c21528019Mw = this.LJI.LLJI.get(childAt2);
            if (c21528019Mw != null) {
                if (this.LIZJ != null && (c19oaLIZJ2 = LIZJ(this.LIZ, childAt2)) != null) {
                    C19MB c19mb = this.LIZJ;
                    C21526519Mh c21526519Mh = c21528019Mw.LIZLLL;
                    c21526519Mh.LLILLL = 0.0f;
                    c21526519Mh.LLILZ = 0.0f;
                    c21528019Mw.LIZJ(c21526519Mh);
                    C21526519Mh c21526519Mh2 = c21528019Mw.LIZLLL;
                    float x = c19oaLIZJ2.getX();
                    float y = c19oaLIZJ2.getY();
                    float width = c19oaLIZJ2.getWidth();
                    float height = c19oaLIZJ2.getHeight();
                    c21526519Mh2.LLILZIL = x;
                    c21526519Mh2.LLILZLL = y;
                    c21526519Mh2.LLIZ = width;
                    c21526519Mh2.LLIZLLLIL = height;
                    C19MA c19maLJIJI = c19mb.LJIJI(c21528019Mw.LIZIZ);
                    c21528019Mw.LIZLLL.LIZJ(c19maLJIJI);
                    c21528019Mw.LJIIIZ = c19maLJIJI.LIZJ.LJFF;
                    c21528019Mw.LJFF.LJI(c19oaLIZJ2, c19mb, c21528019Mw.LIZIZ);
                }
                if (this.LIZLLL != null && (c19oaLIZJ = LIZJ(this.LIZIZ, childAt2)) != null) {
                    C19MB c19mb2 = this.LIZLLL;
                    C21526519Mh c21526519Mh3 = c21528019Mw.LJ;
                    c21526519Mh3.LLILLL = 1.0f;
                    c21526519Mh3.LLILZ = 1.0f;
                    c21528019Mw.LIZJ(c21526519Mh3);
                    C21526519Mh c21526519Mh4 = c21528019Mw.LJ;
                    float x2 = c19oaLIZJ.getX();
                    float y2 = c19oaLIZJ.getY();
                    float width2 = c19oaLIZJ.getWidth();
                    float height2 = c19oaLIZJ.getHeight();
                    c21526519Mh4.LLILZIL = x2;
                    c21526519Mh4.LLILZLL = y2;
                    c21526519Mh4.LLIZ = width2;
                    c21526519Mh4.LLIZLLLIL = height2;
                    c21528019Mw.LJ.LIZJ(c19mb2.LJIJI(c21528019Mw.LIZIZ));
                    c21528019Mw.LJI.LJI(c19oaLIZJ, c19mb2, c21528019Mw.LIZIZ);
                }
            }
        }
    }

    public final void LJ() {
        int i;
        C21526919Ml c21526919Ml = this.LJI;
        int i2 = c21526919Ml.LLIZ;
        int i3 = c21526919Ml.LLIZLLLIL;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        C21526919Ml c21526919Ml2 = this.LJI;
        c21526919Ml2.LLLIILIL = mode;
        c21526919Ml2.LLLIL = mode2;
        int optimizationLevel = c21526919Ml2.getOptimizationLevel();
        C21526919Ml c21526919Ml3 = this.LJI;
        if (c21526919Ml3.LLILZIL == c21526919Ml3.getStartState()) {
            this.LJI.resolveSystem(this.LIZIZ, optimizationLevel, i2, i3);
            if (this.LIZJ != null) {
                this.LJI.resolveSystem(this.LIZ, optimizationLevel, i2, i3);
            }
        } else {
            if (this.LIZJ != null) {
                this.LJI.resolveSystem(this.LIZ, optimizationLevel, i2, i3);
            }
            this.LJI.resolveSystem(this.LIZIZ, optimizationLevel, i2, i3);
        }
        boolean z = true;
        int i4 = 0;
        if (!(this.LJI.getParent() instanceof C21526919Ml) || mode != 1073741824 || mode2 != 1073741824) {
            C21526919Ml c21526919Ml4 = this.LJI;
            c21526919Ml4.LLLIILIL = mode;
            c21526919Ml4.LLLIL = mode2;
            if (c21526919Ml4.LLILZIL == c21526919Ml4.getStartState()) {
                this.LJI.resolveSystem(this.LIZIZ, optimizationLevel, i2, i3);
                if (this.LIZJ != null) {
                    this.LJI.resolveSystem(this.LIZ, optimizationLevel, i2, i3);
                }
            } else {
                if (this.LIZJ != null) {
                    this.LJI.resolveSystem(this.LIZ, optimizationLevel, i2, i3);
                }
                this.LJI.resolveSystem(this.LIZIZ, optimizationLevel, i2, i3);
            }
            this.LJI.LLLIIII = this.LIZ.getWidth();
            this.LJI.LLLIIIIL = this.LIZ.getHeight();
            this.LJI.LLLIIIL = this.LIZIZ.getWidth();
            this.LJI.LLLIIL = this.LIZIZ.getHeight();
            C21526919Ml c21526919Ml5 = this.LJI;
            c21526919Ml5.LLLII = (c21526919Ml5.LLLIIII == c21526919Ml5.LLLIIIL && c21526919Ml5.LLLIIIIL == c21526919Ml5.LLLIIL) ? false : true;
        }
        C21526919Ml c21526919Ml6 = this.LJI;
        int i5 = c21526919Ml6.LLLIIII;
        int i6 = c21526919Ml6.LLLIIIIL;
        int i7 = c21526919Ml6.LLLIILIL;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) (i5 + (c21526919Ml6.LLLILZ * (c21526919Ml6.LLLIIIL - i5)));
        }
        int i8 = c21526919Ml6.LLLIL;
        if (i8 == Integer.MIN_VALUE || i8 == 0) {
            i6 = (int) (i6 + (c21526919Ml6.LLLILZ * (c21526919Ml6.LLLIIL - i6)));
        }
        C19O9 c19o9 = this.LIZ;
        c21526919Ml6.resolveMeasuredDimension(i2, i3, i5, i6, c19o9.LJIILIIL || this.LIZIZ.LJIILIIL, c19o9.LJIILJJIL || this.LIZIZ.LJIILJJIL);
        C21526919Ml c21526919Ml7 = this.LJI;
        int childCount = c21526919Ml7.getChildCount();
        c21526919Ml7.LLLJIL.LIZ();
        c21526919Ml7.LLJJIJI = true;
        int width = c21526919Ml7.getWidth();
        int height = c21526919Ml7.getHeight();
        C19MP c19mp = c21526919Ml7.LL.LIZJ;
        if (c19mp != null && (i = c19mp.LJIILL) != -1) {
            for (int i9 = 0; i9 < childCount; i9++) {
                C21528019Mw c21528019Mw = c21526919Ml7.LLJI.get(c21526919Ml7.getChildAt(i9));
                if (c21528019Mw != null) {
                    c21528019Mw.LJJIFFI = i;
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            C21528019Mw c21528019Mw2 = c21526919Ml7.LLJI.get(c21526919Ml7.getChildAt(i10));
            if (c21528019Mw2 != null) {
                c21526919Ml7.LL.LJ(c21528019Mw2);
                c21528019Mw2.LIZLLL(width, height, c21526919Ml7.getNanoTime());
            }
        }
        C19MP c19mp2 = c21526919Ml7.LL.LIZJ;
        if (c19mp2 != null) {
            float f = c19mp2.LJIIIIZZ;
            if (f != 0.0f) {
                boolean z2 = ((double) f) < 0.0d;
                float fAbs = Math.abs(f);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        z = false;
                        break;
                    }
                    C21528019Mw c21528019Mw3 = c21526919Ml7.LLJI.get(c21526919Ml7.getChildAt(i11));
                    if (!Float.isNaN(c21528019Mw3.LJIIIZ)) {
                        break;
                    }
                    C21526519Mh c21526519Mh = c21528019Mw3.LJ;
                    float f2 = c21526519Mh.LLILZIL;
                    float f3 = c21526519Mh.LLILZLL;
                    float f4 = z2 ? f3 - f2 : f3 + f2;
                    fMin2 = Math.min(fMin2, f4);
                    fMax2 = Math.max(fMax2, f4);
                    i11++;
                }
                if (!z) {
                    while (i4 < childCount) {
                        C21528019Mw c21528019Mw4 = c21526919Ml7.LLJI.get(c21526919Ml7.getChildAt(i4));
                        C21526519Mh c21526519Mh2 = c21528019Mw4.LJ;
                        float f5 = c21526519Mh2.LLILZIL;
                        float f6 = c21526519Mh2.LLILZLL;
                        float f7 = z2 ? f6 - f5 : f6 + f5;
                        c21528019Mw4.LJIIJJI = 1.0f / (1.0f - fAbs);
                        c21528019Mw4.LJIIJ = fAbs - (((f7 - fMin2) * fAbs) / (fMax2 - fMin2));
                        i4++;
                    }
                    return;
                }
                for (int i12 = 0; i12 < childCount; i12++) {
                    C21528019Mw c21528019Mw5 = c21526919Ml7.LLJI.get(c21526919Ml7.getChildAt(i12));
                    if (!Float.isNaN(c21528019Mw5.LJIIIZ)) {
                        fMin = Math.min(fMin, c21528019Mw5.LJIIIZ);
                        fMax = Math.max(fMax, c21528019Mw5.LJIIIZ);
                    }
                }
                while (i4 < childCount) {
                    C21528019Mw c21528019Mw6 = c21526919Ml7.LLJI.get(c21526919Ml7.getChildAt(i4));
                    if (!Float.isNaN(c21528019Mw6.LJIIIZ)) {
                        c21528019Mw6.LJIIJJI = 1.0f / (1.0f - fAbs);
                        if (z2) {
                            c21528019Mw6.LJIIJ = fAbs - (((fMax - c21528019Mw6.LJIIIZ) / (fMax - fMin)) * fAbs);
                        } else {
                            c21528019Mw6.LJIIJ = fAbs - (((c21528019Mw6.LJIIIZ - fMin) * fAbs) / (fMax - fMin));
                        }
                    }
                    i4++;
                }
            }
        }
    }

    public C21527019Mm(C21526919Ml c21526919Ml) {
        this.LJI = c21526919Ml;
    }

    public static void LIZIZ(C19O9 c19o9, C19O9 c19o92) {
        C19OA c19oa;
        ArrayList<C19OA> arrayList = c19o9.LIZ;
        HashMap<C19OA, C19OA> map = new HashMap<>();
        map.put(c19o9, c19o92);
        c19o92.LIZ.clear();
        c19o92.copy(c19o9, map);
        for (C19OA c19oa2 : arrayList) {
            if (c19oa2 instanceof C19OH) {
                c19oa = new C19OH();
            } else if (c19oa2 instanceof C19OI) {
                c19oa = new C19OI();
            } else if (c19oa2 instanceof C21530519Nv) {
                c19oa = new C21530519Nv();
            } else if (c19oa2 instanceof C19MY) {
                c19oa = new C21530019Nq();
            } else {
                c19oa = new C19OA();
            }
            c19o92.LIZJ(c19oa);
            map.put(c19oa2, c19oa);
        }
        for (C19OA c19oa3 : arrayList) {
            map.get(c19oa3).copy(c19oa3, map);
        }
    }

    public static C19OA LIZJ(C19O9 c19o9, View view) {
        if (c19o9.mCompanionWidget == view) {
            return c19o9;
        }
        ArrayList<C19OA> arrayList = c19o9.LIZ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C19OA c19oa = (C19OA) ListProtector.get(arrayList, i);
            if (c19oa.mCompanionWidget == view) {
                return c19oa;
            }
        }
        return null;
    }

    public final void LIZLLL(C19MB c19mb, C19MB c19mb2) {
        this.LIZJ = c19mb;
        this.LIZLLL = c19mb2;
        this.LIZ = new C19O9();
        C19O9 c19o9 = new C19O9();
        this.LIZIZ = c19o9;
        C19O9 c19o92 = this.LIZ;
        C19O9 c19o93 = this.LJI.mLayoutWidget;
        C19O0 c19o0 = c19o93.LIZLLL;
        c19o92.LIZLLL = c19o0;
        c19o92.LIZJ.LJFF = c19o0;
        C19O0 c19o02 = c19o93.LIZLLL;
        c19o9.LIZLLL = c19o02;
        c19o9.LIZJ.LJFF = c19o02;
        c19o92.LIZ.clear();
        this.LIZIZ.LIZ.clear();
        LIZIZ(this.LJI.mLayoutWidget, this.LIZ);
        LIZIZ(this.LJI.mLayoutWidget, this.LIZIZ);
        if (this.LJI.LLJILLL > 0.5d) {
            if (c19mb != null) {
                LJFF(this.LIZ, c19mb);
            }
            LJFF(this.LIZIZ, c19mb2);
        } else {
            LJFF(this.LIZIZ, c19mb2);
            if (c19mb != null) {
                LJFF(this.LIZ, c19mb);
            }
        }
        this.LIZ.LJ = this.LJI.isRtl();
        C19O9 c19o94 = this.LIZ;
        c19o94.LIZIZ.LIZJ(c19o94);
        this.LIZIZ.LJ = this.LJI.isRtl();
        C19O9 c19o95 = this.LIZIZ;
        c19o95.LIZIZ.LIZJ(c19o95);
        ViewGroup.LayoutParams layoutParams = this.LJI.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                C19O9 c19o96 = this.LIZ;
                C19O3 c19o3 = C19O3.WRAP_CONTENT;
                c19o96.setHorizontalDimensionBehaviour(c19o3);
                this.LIZIZ.setHorizontalDimensionBehaviour(c19o3);
            }
            if (layoutParams.height == -2) {
                C19O9 c19o97 = this.LIZ;
                C19O3 c19o32 = C19O3.WRAP_CONTENT;
                c19o97.setVerticalDimensionBehaviour(c19o32);
                this.LIZIZ.setVerticalDimensionBehaviour(c19o32);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(C19O9 c19o9, C19MB c19mb) {
        SparseArray<C19OA> sparseArray = new SparseArray<>();
        C19M3 c19m3 = new C19M3(-2);
        sparseArray.clear();
        sparseArray.put(0, c19o9);
        sparseArray.put(this.LJI.getId(), c19o9);
        for (C19OA c19oa : c19o9.LIZ) {
            sparseArray.put(((View) c19oa.mCompanionWidget).getId(), c19oa);
        }
        for (C19OA c19oa2 : c19o9.LIZ) {
            View view = (View) c19oa2.mCompanionWidget;
            int id = view.getId();
            if (c19mb.LIZJ.containsKey(Integer.valueOf(id))) {
                c19mb.LIZJ.get(Integer.valueOf(id)).LIZ(c19m3);
            }
            c19oa2.setWidth(c19mb.LJIJI(view.getId()).LIZLLL.LIZJ);
            c19oa2.setHeight(c19mb.LJIJI(view.getId()).LIZLLL.LIZLLL);
            if (view instanceof C19MX) {
                C19MX c19mx = (C19MX) view;
                int id2 = c19mx.getId();
                if (c19mb.LIZJ.containsKey(Integer.valueOf(id2))) {
                    C19MA c19ma = c19mb.LIZJ.get(Integer.valueOf(id2));
                    if (c19oa2 instanceof C21530019Nq) {
                        c19mx.loadParameters(c19ma, (C21530019Nq) c19oa2, c19m3, sparseArray);
                    }
                }
                if (view instanceof C19MW) {
                    ((C19MX) view).validateParams();
                }
            }
            c19m3.resolveLayoutDirection(this.LJI.getLayoutDirection());
            this.LJI.applyConstraintsFromLayoutParams(false, view, c19oa2, c19m3, sparseArray);
            if (c19mb.LJIJI(view.getId()).LIZIZ.LIZJ == 1) {
                c19oa2.mVisibility = view.getVisibility();
            } else {
                c19oa2.mVisibility = c19mb.LJIJI(view.getId()).LIZIZ.LIZIZ;
            }
        }
        for (C19OA c19oa3 : c19o9.LIZ) {
            if (c19oa3 instanceof C21530419Nu) {
                C19MX c19mx2 = (C19MX) c19oa3.mCompanionWidget;
                C19MY c19my = (C19MY) c19oa3;
                c19mx2.updatePreLayout(c19o9, c19my, sparseArray);
                C21530019Nq c21530019Nq = (C21530019Nq) c19my;
                for (int i = 0; i < c21530019Nq.LIZIZ; i++) {
                    C19OA c19oa4 = c21530019Nq.LIZ[i];
                    if (c19oa4 != null) {
                        c19oa4.mInVirtuaLayout = true;
                    }
                }
            }
        }
    }
}
