package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H49, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H49 extends AbstractC21673619ry<C0H4B> {
    public final int LL;
    public C419840GdC LLILLJJLI;
    public int LLILLL;

    public C0H49() {
        this(3);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return -101;
    }

    public final void LLLFZ() {
        ValueAnimator valueAnimator;
        C419840GdC c419840GdC = this.LLILLJJLI;
        if (c419840GdC != null) {
            int visibility = c419840GdC.getVisibility();
            c419840GdC.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c419840GdC);
        }
        C419840GdC c419840GdC2 = this.LLILLJJLI;
        if (c419840GdC2 != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shimmerView state, startShimmer，this=");
            sbLIZ.append(c419840GdC2);
            C2188811AlT.LIZIZ(sbLIZ);
            ValueAnimator valueAnimator2 = c419840GdC2.LLIZ;
            if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && (valueAnimator = c419840GdC2.LLIZ) != null) {
                valueAnimator.start();
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startShimmer, isAttached = ");
        C419840GdC c419840GdC3 = this.LLILLJJLI;
        sbLIZ2.append(c419840GdC3 != null ? Boolean.valueOf(c419840GdC3.isAttachedToWindow()) : null);
        sbLIZ2.append(", visible = ");
        C419840GdC c419840GdC4 = this.LLILLJJLI;
        sbLIZ2.append(c419840GdC4 != null ? Integer.valueOf(c419840GdC4.getVisibility()) : null);
        C1720106oR.LJI("LoadingAdapter", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LLLI() {
        C419840GdC c419840GdC = this.LLILLJJLI;
        if (c419840GdC != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shimmerView state, stopShimmer，this=");
            sbLIZ.append(c419840GdC);
            C2188811AlT.LIZIZ(sbLIZ);
            ValueAnimator valueAnimator = c419840GdC.LLIZ;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        }
        C419840GdC c419840GdC2 = this.LLILLJJLI;
        if (c419840GdC2 != null) {
            int visibility = c419840GdC2.getVisibility();
            c419840GdC2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c419840GdC2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stopShimmer, isAttached = ");
        C419840GdC c419840GdC3 = this.LLILLJJLI;
        sbLIZ2.append(c419840GdC3 != null ? Boolean.valueOf(c419840GdC3.isAttachedToWindow()) : null);
        sbLIZ2.append(", visible = ");
        C419840GdC c419840GdC4 = this.LLILLJJLI;
        sbLIZ2.append(c419840GdC4 != null ? Integer.valueOf(c419840GdC4.getVisibility()) : null);
        C1720106oR.LJI("LoadingAdapter", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL;
    }

    public C0H49(int i) {
        this.LL = i;
        this.LLILLL = 9;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getSpanSize, origin size = ");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            sbLIZ.append(gridLayoutManager.LLILLJJLI);
            sbLIZ.append(", new size = ");
            sbLIZ.append(this.LL);
            C1720106oR.LJI("LoadingAdapter", C2188811AlT.LIZIZ(sbLIZ));
            gridLayoutManager.LJIJI(new AbstractC214823195h() { // from class: X.0H4C
                @Override // X.AbstractC214823195h
                public final int LJFF(int i2) {
                    return 1;
                }
            });
        }
        Rect rect = new Rect();
        recyclerView.getLocalVisibleRect(rect);
        int i2 = rect.bottom - rect.top;
        if (i2 <= 0) {
            recyclerView.getRootView().getLocalVisibleRect(rect);
            i2 = rect.bottom - rect.top;
        }
        double screenWidth = ((double) (ScreenUtils.getScreenWidth(recyclerView.getContext()) / this.LL)) / 0.75d;
        int iCeil = ((int) Math.ceil(((double) i2) / screenWidth)) * this.LL;
        if (iCeil < 9) {
            iCeil = 9;
        }
        this.LLILLL = iCeil;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateHolderCount, itemCount = ");
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append(", spanSize = ");
        sbLIZ2.append(this.LL);
        sbLIZ2.append(", itemHeight = ");
        sbLIZ2.append(screenWidth);
        sbLIZ2.append(", visibleRect = ");
        sbLIZ2.append(rect);
        C1720106oR.LJI("LoadingAdapter", C2188811AlT.LIZIZ(sbLIZ2));
        super.onAttachedToRecyclerView(recyclerView);
        ViewParent parent = recyclerView.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            if (this.LLILLJJLI == null) {
                C419840GdC c419840GdC = new C419840GdC(viewGroup.getContext());
                c419840GdC.setId(R.id.s27);
                this.LLILLJJLI = c419840GdC;
            }
            C419840GdC c419840GdC2 = this.LLILLJJLI;
            if (c419840GdC2 != null) {
                ViewParent parent2 = c419840GdC2.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(c419840GdC2, viewGroup2);
                }
                viewGroup.addView(c419840GdC2, -1, -1);
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onAttachedToRecyclerView, spanSize = ");
        sbLIZ3.append(this.LL);
        sbLIZ3.append(", holderItemCount = ");
        sbLIZ3.append(this.LLILLL);
        C1720106oR.LJI("LoadingAdapter", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.onDetachedFromRecyclerView(recyclerView);
        if (recyclerView != null) {
            LLLI();
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            } else {
                viewGroup = null;
            }
            C419840GdC c419840GdC = this.LLILLJJLI;
            if (c419840GdC != null) {
                if (viewGroup != null) {
                    C786410Ut5.LJJJLZIJ(c419840GdC, viewGroup);
                }
                ViewParent parent2 = c419840GdC.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(c419840GdC, viewGroup2);
                }
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromRecyclerView, spanSize = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", holderItemCount = ");
        sbLIZ.append(this.LLILLL);
        C1720106oR.LJI("LoadingAdapter", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.een, viewGroup, false);
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.0H4B
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H4B.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H4B.class.getName();
        return viewHolder;
    }
}
