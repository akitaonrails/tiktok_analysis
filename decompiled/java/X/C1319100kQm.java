package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0kQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319100kQm extends C0DXR {
    public boolean LL = true;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;

    public final void LJ(boolean z, int i, Rect rect) {
        if (z) {
            return;
        }
        int i2 = this.LLILZIL;
        int i3 = this.LLILLL;
        int i4 = (i2 * (i3 - 1)) / i3;
        if (i == 0) {
            if (this.LL) {
                rect.right = i4;
                return;
            } else {
                rect.bottom = i4;
                return;
            }
        }
        if (i == i3 - 1) {
            if (this.LL) {
                rect.left = i4;
                return;
            } else {
                rect.top = i4;
                return;
            }
        }
        if (this.LL) {
            int i5 = i4 / 2;
            rect.left = i5;
            rect.right = i5;
        } else {
            int i6 = i4 / 2;
            rect.top = i6;
            rect.bottom = i6;
        }
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        boolean z;
        int i;
        int i2;
        View view2;
        int i3;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if ((adapter instanceof C1319030kQf) && (childViewHolder instanceof C1318570kPv)) {
            C1319030kQf c1319030kQf = (C1319030kQf) adapter;
            int adapterPosition = childViewHolder.getAdapterPosition();
            boolean z2 = false;
            if (adapterPosition == 0 || (adapterPosition < this.LLILLL && c1319030kQf.LLLIIIIL(adapterPosition) == -1)) {
                z = true;
            } else {
                z = false;
            }
            if (this.LL) {
                if (z) {
                    i3 = 0;
                } else {
                    i3 = this.LLILZ;
                }
                rect.top = i3;
            } else if (this.LLILLJJLI) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = this.LLILZ;
                }
                rect.right = i2;
            } else {
                if (z) {
                    i = 0;
                } else {
                    i = this.LLILZ;
                }
                rect.left = i;
            }
            if (this.LLILLL > 1 && (view2 = childViewHolder.itemView) != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof C21681919tJ) {
                    C21681919tJ c21681919tJ = (C21681919tJ) layoutParams;
                    if (c21681919tJ.LLILLJJLI == this.LLILLL) {
                        z2 = true;
                    }
                    LJ(z2, c21681919tJ.LL, rect);
                    return;
                }
                if (!(layoutParams instanceof C21681819tI)) {
                    return;
                }
                C21681819tI c21681819tI = (C21681819tI) layoutParams;
                LJ(c21681819tI.LLILLJJLI, c21681819tI.LIZ(), rect);
            }
        }
    }
}
