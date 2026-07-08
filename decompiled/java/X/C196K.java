package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.LynxDragListUIView;
import java.util.List;

/* JADX INFO: renamed from: X.196K, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C196K extends AbstractC21688119uJ {
    public boolean LIZJ;
    public boolean LIZLLL;
    public C196L LJ;
    public final /* synthetic */ LynxDragListUIView LJFF;

    @Override // X.AbstractC21688119uJ
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILL() {
    }

    public final void LJIILLIIL() {
        C196L c196l = this.LJ;
        if (c196l != null) {
            super.LJIILIIL(c196l.LIZ, c196l.LIZIZ, c196l.LIZJ, c196l.LIZLLL, c196l.LJ, c196l.LJFF, c196l.LJI);
            this.LIZLLL = false;
        }
        this.LJ = null;
    }

    public C196K(LynxDragListUIView lynxDragListUIView) {
        this.LJFF = lynxDragListUIView;
    }

    @Override // X.AbstractC21688119uJ
    public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.LIZJ(recyclerView, viewHolder);
        this.LJFF.LJJJJL(viewHolder.getAbsoluteAdapterPosition(), "idle");
    }

    @Override // X.AbstractC21688119uJ
    public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return AbstractC21688119uJ.LJIIIZ(15, 0);
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        int absoluteAdapterPosition = 0;
        if (i != 0) {
            if (i == 2) {
                this.LIZJ = true;
                LynxDragListUIView lynxDragListUIView = this.LJFF;
                if (viewHolder != null) {
                    absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                }
                lynxDragListUIView.LJJJJL(absoluteAdapterPosition, "dragging");
                return;
            }
            return;
        }
        if (!this.LIZJ) {
            return;
        }
        this.LIZJ = false;
        LynxDragListUIView lynxDragListUIView2 = this.LJFF;
        if (viewHolder != null) {
            absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        }
        lynxDragListUIView2.LJJJJL(absoluteAdapterPosition, "settling");
    }

    @Override // X.AbstractC21688119uJ
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (this.LIZLLL) {
            return false;
        }
        LynxDragListUIView lynxDragListUIView = this.LJFF;
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
        lynxDragListUIView.getClass();
        C1289960jfm c1289960jfm = new C1289960jfm(lynxDragListUIView.getSign(), "dragmove");
        c1289960jfm.LIZIZ(Integer.valueOf(bindingAdapterPosition), "position");
        c1289960jfm.LIZIZ(Integer.valueOf(bindingAdapterPosition2), "targetPosition");
        lynxDragListUIView.mContext.LLIZ.LIZIZ(c1289960jfm);
        this.LIZLLL = true;
        return true;
    }

    @Override // X.AbstractC21688119uJ
    public final RecyclerView.ViewHolder LIZIZ(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
        int left;
        int iAbs;
        int bottom;
        int iAbs2;
        int iAbs3;
        int iAbs4;
        int height = (int) (viewHolder.itemView.getHeight() * 0.5f);
        int width = (int) (viewHolder.itemView.getWidth() * 0.5f);
        int i3 = i - width;
        int width2 = i + viewHolder.itemView.getWidth() + width;
        int i4 = i2 - height;
        int height2 = i2 + viewHolder.itemView.getHeight() + height;
        int left2 = i - viewHolder.itemView.getLeft();
        int top = i2 - viewHolder.itemView.getTop();
        int size = list.size();
        RecyclerView.ViewHolder viewHolder2 = null;
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) ListProtector.get(list, i6);
            if (left2 > 0) {
                int right = viewHolder3.itemView.getRight() - width2;
                if (right < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = Math.abs(right)) > i5) {
                    viewHolder2 = viewHolder3;
                    i5 = iAbs4;
                }
            } else if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i3) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs = Math.abs(left)) > i5) {
                viewHolder2 = viewHolder3;
                i5 = iAbs;
            }
            if (top < 0) {
                int top2 = viewHolder3.itemView.getTop() - i4;
                if (top2 > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (iAbs3 = Math.abs(top2)) > i5) {
                    viewHolder2 = viewHolder3;
                    i5 = iAbs3;
                }
            } else if (top > 0 && (bottom = viewHolder3.itemView.getBottom() - height2) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (iAbs2 = Math.abs(bottom)) > i5) {
                viewHolder2 = viewHolder3;
                i5 = iAbs2;
            }
        }
        return viewHolder2;
    }

    @Override // X.AbstractC21688119uJ
    public final int LJI(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        int i4 = this.LJFF.LLLLIILLL;
        if (i4 > 0) {
            return i4 * Integer.signum(i2);
        }
        return super.LJI(recyclerView, i, i2, i3, j);
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        if (this.LIZLLL) {
            this.LJ = new C196L(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        }
    }
}
