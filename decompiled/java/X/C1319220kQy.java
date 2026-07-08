package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: X.0kQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319220kQy extends C0DXR {
    public int LL;
    public int LLILLJJLI;

    public C1319220kQy(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        C21681819tI c21681819tI;
        C21681919tJ c21681919tJ;
        if (this.LL == 0 && this.LLILLJJLI == 0) {
            super.LIZIZ(rect, view, recyclerView, c21673919s1);
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C21681919tJ) && (c21681919tJ = (C21681919tJ) layoutParams) != null) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                LJ(rect, gridLayoutManager.getOrientation(), c21681919tJ.LL, gridLayoutManager.LLILLJJLI, recyclerView.getChildLayoutPosition(view));
                return;
            } else {
                rect.set(0, 0, 0, 0);
                return;
            }
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).getOrientation() == 0) {
                if (this.LL <= 0) {
                    return;
                }
                if (recyclerView.getChildLayoutPosition(view) > 0) {
                    rect.set(this.LL, 0, 0, 0);
                    return;
                } else {
                    rect.set(0, 0, 0, 0);
                    return;
                }
            }
            if (this.LLILLJJLI <= 0) {
                return;
            }
            if (recyclerView.getChildLayoutPosition(view) > 0) {
                rect.set(0, this.LLILLJJLI, 0, 0);
                return;
            } else {
                rect.set(0, 0, 0, 0);
                return;
            }
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams2) != null) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            LJ(rect, staggeredGridLayoutManager.LLILZIL, c21681819tI.LIZ(), staggeredGridLayoutManager.LJJIII(), recyclerView.getChildLayoutPosition(view));
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    public final void LJ(Rect rect, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 0) {
            int i9 = this.LLILLJJLI / 2;
            if (i4 < i3) {
                i7 = 0;
            } else {
                i7 = this.LL;
            }
            if (i2 == 0) {
                i8 = 0;
            } else {
                i8 = i9;
            }
            if (i2 == i3 - 1) {
                i9 = 0;
            }
            rect.set(i7, i8, 0, i9);
            return;
        }
        int i10 = this.LL / 2;
        if (i2 == 0) {
            i5 = 0;
        } else {
            i5 = i10;
        }
        if (i4 < i3) {
            i6 = 0;
        } else {
            i6 = this.LLILLJJLI;
        }
        if (i2 == i3 - 1) {
            i10 = 0;
        }
        rect.set(i5, i6, i10, 0);
    }
}
