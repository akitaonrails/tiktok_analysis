package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19tD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21681319tD {
    public final ArrayList<View> LIZ = new ArrayList<>();
    public int LIZIZ = Integer.MIN_VALUE;
    public int LIZJ = Integer.MIN_VALUE;
    public int LIZLLL = 0;
    public final int LJ;
    public final /* synthetic */ StaggeredGridLayoutManager LJFF;

    public final int LJ() {
        return this.LJFF.LLIZLLLIL ? LJI(false, this.LIZ.size() - 1, -1, false, true) : LJI(false, 0, this.LIZ.size(), false, true);
    }

    public final int LJFF() {
        return this.LJFF.LLIZLLLIL ? LJI(false, 0, this.LIZ.size(), false, true) : LJI(false, this.LIZ.size() - 1, -1, false, true);
    }

    public final void LIZIZ() {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItemLJFF;
        ArrayList<View> arrayList = this.LIZ;
        View view = (View) ListProtector.get(arrayList, arrayList.size() - 1);
        C21681819tI c21681819tILJIIJ = LJIIJ(view);
        this.LIZJ = this.LJFF.LLILLL.LIZIZ(view);
        if (c21681819tILJIIJ.LLILLJJLI && (fullSpanItemLJFF = this.LJFF.LLJILJILJ.LJFF(c21681819tILJIIJ.getViewLayoutPosition())) != null && fullSpanItemLJFF.LLILLJJLI == 1) {
            int i = this.LIZJ;
            int i2 = this.LJ;
            int[] iArr = fullSpanItemLJFF.LLILLL;
            this.LIZJ = i + (iArr == null ? 0 : iArr[i2]);
        }
    }

    public final void LIZJ() {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem fullSpanItemLJFF;
        View view = (View) ListProtector.get(this.LIZ, 0);
        C21681819tI c21681819tILJIIJ = LJIIJ(view);
        this.LIZIZ = this.LJFF.LLILLL.LJ(view);
        if (c21681819tILJIIJ.LLILLJJLI && (fullSpanItemLJFF = this.LJFF.LLJILJILJ.LJFF(c21681819tILJIIJ.getViewLayoutPosition())) != null && fullSpanItemLJFF.LLILLJJLI == -1) {
            int i = this.LIZIZ;
            int i2 = this.LJ;
            int[] iArr = fullSpanItemLJFF.LLILLL;
            this.LIZIZ = i - (iArr != null ? iArr[i2] : 0);
        }
    }

    public final void LIZLLL() {
        this.LIZ.clear();
        this.LIZIZ = Integer.MIN_VALUE;
        this.LIZJ = Integer.MIN_VALUE;
        this.LIZLLL = 0;
    }

    public final void LJIIL() {
        int size = this.LIZ.size();
        View view = (View) ListProtector.remove(this.LIZ, size - 1);
        C21681819tI c21681819tILJIIJ = LJIIJ(view);
        c21681819tILJIIJ.LL = null;
        if (c21681819tILJIIJ.isItemRemoved() || c21681819tILJIIJ.isItemChanged()) {
            this.LIZLLL -= this.LJFF.LLILLL.LIZJ(view);
        }
        if (size == 1) {
            this.LIZIZ = Integer.MIN_VALUE;
        }
        this.LIZJ = Integer.MIN_VALUE;
    }

    public final void LJIILIIL() {
        View view = (View) ListProtector.remove(this.LIZ, 0);
        C21681819tI c21681819tILJIIJ = LJIIJ(view);
        c21681819tILJIIJ.LL = null;
        if (this.LIZ.size() == 0) {
            this.LIZJ = Integer.MIN_VALUE;
        }
        if (c21681819tILJIIJ.isItemRemoved() || c21681819tILJIIJ.isItemChanged()) {
            this.LIZLLL -= this.LJFF.LLILLL.LIZJ(view);
        }
        this.LIZIZ = Integer.MIN_VALUE;
    }

    public static C21681819tI LJIIJ(View view) {
        return (C21681819tI) view.getLayoutParams();
    }

    public final void LIZ(View view) {
        C21681819tI c21681819tI = (C21681819tI) view.getLayoutParams();
        c21681819tI.LL = this;
        this.LIZ.add(view);
        this.LIZJ = Integer.MIN_VALUE;
        if (this.LIZ.size() == 1) {
            this.LIZIZ = Integer.MIN_VALUE;
        }
        if (c21681819tI.isItemRemoved() || c21681819tI.isItemChanged()) {
            this.LIZLLL += this.LJFF.LLILLL.LIZJ(view);
        }
    }

    public final int LJIIIIZZ(int i) {
        int i2 = this.LIZJ;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.LIZ.size() == 0) {
            return i;
        }
        LIZIZ();
        return this.LIZJ;
    }

    public final int LJIIJJI(int i) {
        int i2 = this.LIZIZ;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.LIZ.size() == 0) {
            return i;
        }
        LIZJ();
        return this.LIZIZ;
    }

    public final void LJIILJJIL(View view) {
        C21681819tI c21681819tI = (C21681819tI) view.getLayoutParams();
        c21681819tI.LL = this;
        ListProtector.add(this.LIZ, 0, view);
        this.LIZIZ = Integer.MIN_VALUE;
        if (this.LIZ.size() == 1) {
            this.LIZJ = Integer.MIN_VALUE;
        }
        if (c21681819tI.isItemRemoved() || c21681819tI.isItemChanged()) {
            this.LIZLLL += this.LJFF.LLILLL.LIZJ(view);
        }
    }

    public C21681319tD(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.LJFF = staggeredGridLayoutManager;
        this.LJ = i;
    }

    public final View LJIIIZ(int i, int i2) {
        View view = null;
        if (i2 == -1) {
            int size = this.LIZ.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) ListProtector.get(this.LIZ, i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.LJFF;
                if (staggeredGridLayoutManager.LLIZLLLIL && staggeredGridLayoutManager.getPosition(view2) <= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.LJFF;
                if ((!staggeredGridLayoutManager2.LLIZLLLIL && staggeredGridLayoutManager2.getPosition(view2) >= i) || !view2.hasFocusable()) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = this.LIZ.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) ListProtector.get(this.LIZ, size2);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = this.LJFF;
                if (staggeredGridLayoutManager3.LLIZLLLIL && staggeredGridLayoutManager3.getPosition(view3) >= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = this.LJFF;
                if (!staggeredGridLayoutManager4.LLIZLLLIL && staggeredGridLayoutManager4.getPosition(view3) <= i) {
                    return view;
                }
                if (!view3.hasFocusable()) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public final int LJII(int i, int i2, boolean z) {
        return LJI(z, i, i2, true, false);
    }

    public final int LJI(boolean z, int i, int i2, boolean z2, boolean z3) {
        int i3;
        boolean z4;
        int iLJIIJ = this.LJFF.LLILLL.LJIIJ();
        int iLJI = this.LJFF.LLILLL.LJI();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) ListProtector.get(this.LIZ, i);
            int iLJ = this.LJFF.LLILLL.LJ(view);
            int iLIZIZ = this.LJFF.LLILLL.LIZIZ(view);
            boolean z5 = false;
            if (!z3 ? iLJ < iLJI : iLJ <= iLJI) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z3 ? iLIZIZ > iLJIIJ : iLIZIZ >= iLJIIJ) {
                z5 = true;
            }
            if (z4 && z5) {
                if (z) {
                    if (z2) {
                        if (iLJ >= iLJIIJ && iLIZIZ <= iLJI) {
                            return this.LJFF.getPosition(view);
                        }
                    }
                } else if (z2) {
                    return this.LJFF.getPosition(view);
                }
                if (iLJ < iLJIIJ || iLIZIZ > iLJI) {
                    return this.LJFF.getPosition(view);
                }
            }
            i += i3;
        }
        return -1;
    }
}
