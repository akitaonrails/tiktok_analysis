package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.19uJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21688119uJ {
    public static final InterpolatorC21688719uP LIZIZ;
    public int LIZ = -1;

    public static int LJIIIZ(int i, int i2) {
        return (i << 16) | (i2 << 8) | ((i2 | i) << 0);
    }

    public boolean LIZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return true;
    }

    public float LJ() {
        return 0.5f;
    }

    public abstract int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

    public boolean LJII() {
        return !(this instanceof C20374714nx);
    }

    public boolean LJIIIIZZ() {
        return !(this instanceof C01HK);
    }

    public abstract boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

    public abstract void LJIILL();

    static {
        new Interpolator() { // from class: X.19uQ
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };
        LIZIZ = new InterpolatorC21688719uP();
    }

    public static long LIZLLL(RecyclerView recyclerView, int i) {
        AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            if (i == 8) {
                return 200L;
            }
            return 250L;
        }
        if (i == 8) {
            return itemAnimator.LJIILL();
        }
        return itemAnimator.LJIILLIIL();
    }

    public void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        Object tag = view.getTag(R.id.l4d);
        if (tag instanceof Float) {
            C14K9.LJIJ(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.l4d, null);
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, 0.0f);
    }

    public void LJIIJJI(RecyclerView.ViewHolder viewHolder, boolean z) {
    }

    public void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public RecyclerView.ViewHolder LIZIZ(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
        int left;
        int iAbs;
        int bottom;
        int iAbs2;
        int iAbs3;
        int iAbs4;
        int width = i + viewHolder.itemView.getWidth();
        int height = i2 + viewHolder.itemView.getHeight();
        int left2 = i - viewHolder.itemView.getLeft();
        int top = i2 - viewHolder.itemView.getTop();
        int size = list.size();
        RecyclerView.ViewHolder viewHolder2 = null;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) ListProtector.get(list, i4);
            if (left2 > 0) {
                int right = viewHolder3.itemView.getRight() - width;
                if (right < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs4;
                }
            } else if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (iAbs = Math.abs(left)) > i3) {
                viewHolder2 = viewHolder3;
                i3 = iAbs;
            }
            if (top < 0) {
                int top2 = viewHolder3.itemView.getTop() - i2;
                if (top2 > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (iAbs3 = Math.abs(top2)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = iAbs3;
                }
            } else if (top > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (iAbs2 = Math.abs(bottom)) > i3) {
                viewHolder2 = viewHolder3;
                i3 = iAbs2;
            }
        }
        return viewHolder2;
    }

    public int LJI(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        if (this.LIZ == -1) {
            this.LIZ = recyclerView.getResources().getDimensionPixelSize(R.dimen.a2z);
        }
        int i4 = this.LIZ;
        float fAbs = Math.abs(i2);
        float f = 1.0f;
        int iSignum = (int) (((int) Math.signum(i2)) * i4 * LIZIZ.getInterpolation(Math.min(1.0f, (fAbs * 1.0f) / i)));
        if (j <= 2000) {
            f = j / 2000.0f;
        }
        int i5 = (int) (iSignum * f * f * f * f * f);
        if (i5 == 0) {
            if (i2 <= 0) {
                return -1;
            }
            return 1;
        }
        return i5;
    }

    public void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        View view = viewHolder.itemView;
        if (z && view.getTag(R.id.l4d) == null) {
            Float fValueOf = Float.valueOf(C14K9.LJIIIIZZ(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float fLJIIIIZZ = C14K9.LJIIIIZZ(childAt);
                    if (fLJIIIIZZ > f3) {
                        f3 = fLJIIIIZZ;
                    }
                }
            }
            C14K9.LJIJ(view, f3 + 1.0f);
            view.setTag(R.id.l4d, fValueOf);
        }
        C786410Ut5.Jc(view, f);
        C786410Ut5.ed(view, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIILIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof InterfaceC21688919uR) {
            ((InterfaceC21688919uR) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i3, i4);
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                recyclerView.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                recyclerView.scrollToPosition(i2);
            }
        }
        if (layoutManager.canScrollVertically()) {
            if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                recyclerView.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                recyclerView.scrollToPosition(i2);
            }
        }
    }
}
