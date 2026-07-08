package X;

import Y.ARunnableS89S0200000_20;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UIComponent;

/* JADX INFO: renamed from: X.0kQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ViewOnAttachStateChangeListenerC1319040kQg extends AbstractC1585810rMx implements View.OnAttachStateChangeListener {
    public final UIList LL;
    public final C1318100kPA LLILLJJLI;
    public int LLILZ;
    public boolean LLIZLLLIL = true;
    public int LLILLL = -1;
    public int LLILZIL = -1;
    public final C1319190kQv LLILZLL = new C1319190kQv();
    public final C1319190kQv LLIZ = new C1319190kQv();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public final void LJJJJ() {
        int iLLLIIIIL;
        RecyclerView recyclerView;
        if (this.LLILZLL.LIZIZ != -1 && (recyclerView = (RecyclerView) this.LL.mView) != null && recyclerView.getChildCount() > 1) {
            View childAt = recyclerView.getChildAt(0);
            View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            if (childAt != null && childAt2 != null) {
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
                RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(childAt2);
                if (childViewHolder != null && childViewHolder2 != null) {
                    int adapterPosition = childViewHolder.getAdapterPosition();
                    int adapterPosition2 = childViewHolder2.getAdapterPosition();
                    if (adapterPosition >= 0 && adapterPosition2 >= 0) {
                        C1319030kQf c1319030kQf = this.LL.LLILLL;
                        int i = this.LLILZLL.LIZIZ + 1;
                        if (c1319030kQf.LLJI != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= c1319030kQf.LLJI.size()) {
                                    break;
                                }
                                int i3 = c1319030kQf.LLJI.getInt(i2);
                                if (i3 < i) {
                                    i2++;
                                } else if (i3 >= adapterPosition && i3 <= adapterPosition2 && (this.LLIZLLLIL || this.LL.LLILLL.LLJI.contains(Integer.valueOf(i3)))) {
                                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((RecyclerView) this.LL.mView).findViewHolderForAdapterPosition(i3);
                                    int iMin = viewHolderFindViewHolderForAdapterPosition != null ? Math.min(0, viewHolderFindViewHolderForAdapterPosition.itemView.getTop() - this.LLILZLL.LIZ.mView.getBottom()) : 0;
                                    C786410Ut5.zd((AndroidView) this.LLILZLL.LIZ.mView, iMin);
                                    if (this.LLILZLL.LIZ.mView.getBottom() + iMin < 0) {
                                        LJJIJIIJIL(this.LLILZLL);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i4 = this.LLIZ.LIZIZ;
        if (i4 == -1 || (iLLLIIIIL = this.LL.LLILLL.LLLIIIIL(i4 - 1)) == -1) {
            return;
        }
        if (this.LLIZLLLIL || this.LL.LLILLL.LLJIJIL.contains(Integer.valueOf(iLLLIIIIL))) {
            RecyclerView recyclerView2 = (RecyclerView) this.LL.mView;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(iLLLIIIIL);
            int iMax = viewHolderFindViewHolderForAdapterPosition2 != null ? Math.max(0, viewHolderFindViewHolderForAdapterPosition2.itemView.getBottom() - this.LLIZ.LIZ.mView.getTop()) : 0;
            C786410Ut5.zd((AndroidView) this.LLIZ.LIZ.mView, iMax);
            if (this.LLIZ.LIZ.mView.getTop() + iMax > recyclerView2.getHeight()) {
                LJJIJIIJIL(this.LLIZ);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kPA] */
    public ViewOnAttachStateChangeListenerC1319040kQg(UIList uIList) {
        this.LL = uIList;
        this.LLILLJJLI = new FrameLayout(uIList.mContext) { // from class: X.0kPA
            @Override // android.view.ViewGroup
            public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
                if (view instanceof C1312300kFo) {
                    view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    super.measureChildWithMargins(view, i, i2, i3, i4);
                }
            }

            @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                try {
                    super.onLayout(z, i, i2, i3, i4);
                } catch (NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LL.LJJJJ();
            }
        };
        ((RecyclerView) uIList.mView).addOnScrollListener(this);
        uIList.mView.addOnAttachStateChangeListener(this);
    }

    public static void LJJJJJ(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
        }
    }

    public final void LJJIJIIJIL(C1319190kQv c1319190kQv) {
        UIComponent uIComponent;
        T t;
        int i = UIList.LLLL;
        if (c1319190kQv != null && (uIComponent = c1319190kQv.LIZ) != null && (t = uIComponent.mView) != 0) {
            C786410Ut5.zd((AndroidView) t, 0.0f);
        }
        C1318570kPv c1318570kPv = (C1318570kPv) ((RecyclerView) this.LL.mView).findViewHolderForAdapterPosition(c1319190kQv.LIZIZ);
        LJJJJJ(c1319190kQv.LIZ.mView);
        if (c1318570kPv != null) {
            c1318570kPv.L5(c1319190kQv.LIZ);
            c1319190kQv.LIZIZ = -1;
            c1319190kQv.LIZ = null;
            return;
        }
        UIList uIList = this.LL;
        if (uIList.LLILLL.LLILZ) {
            uIList.LJJIJIIJIL(c1319190kQv.LIZ);
            return;
        }
        UIComponent uIComponent2 = c1319190kQv.LIZ;
        InterfaceC1311870kF7 interfaceC1311870kF7 = uIList.LL;
        int sign = uIList.getSign();
        int sign2 = uIComponent2.getSign();
        LynxTemplateRender lynxTemplateRender = ((C1311860kF6) interfaceC1311870kF7).LIZ;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJL(sign, sign2);
    }

    public final void LJJIL(C1319190kQv c1319190kQv) {
        C1319030kQf c1319030kQf;
        int i = c1319190kQv.LIZIZ;
        if (i != -1 && (c1319030kQf = this.LL.LLILLL) != null && i < c1319030kQf.getItemCount()) {
            UIList uIList = this.LL;
            C1319030kQf c1319030kQf2 = uIList.LLILLL;
            if (c1319030kQf2.LLILZ) {
                if (uIList.LJJJJI()) {
                    UIList uIList2 = this.LL;
                    uIList2.LJJIJIIJI(c1319190kQv.LIZIZ, uIList2.LLILLL.LLLI());
                    return;
                } else {
                    UIList uIList3 = this.LL;
                    uIList3.LJJIJ(c1319190kQv.LIZIZ, uIList3.LLILLL.LLLI(), this.LL.LLILLL.LLJJJJJIL);
                    return;
                }
            }
            uIList.LJJIJIL(c1319190kQv.LIZ, c1319190kQv.LIZIZ, c1319030kQf2.LLLI());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (indexOfChild(view) >= 0) {
            return;
        }
        C1318100kPA c1318100kPA = this.LLILLJJLI;
        c1318100kPA.getClass();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            LynxLog.e("ListStickyManager", "addRecyclerView failed, parent is null.");
            return;
        }
        int iIndexOfChild = viewGroup.indexOfChild(view);
        C786410Ut5.LJJLIL(iIndexOfChild, viewGroup);
        c1318100kPA.addView(view, new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(c1318100kPA, iIndexOfChild);
    }

    public final void LJJJJZ(RecyclerView recyclerView, int i) {
        C1319190kQv c1319190kQv;
        int i2;
        C1318570kPv c1318570kPv;
        int iLLLIL;
        int iLLLIILIL;
        int i3;
        int i4;
        C1318570kPv c1318570kPv2;
        if (i > 0) {
            C1319190kQv c1319190kQv2 = this.LLIZ;
            int i5 = c1319190kQv2.LIZIZ;
            if (i5 != -1 && (c1318570kPv2 = (C1318570kPv) ((RecyclerView) this.LL.mView).findViewHolderForAdapterPosition(i5)) != null) {
                LJJJJJL(c1319190kQv2, c1318570kPv2, false, false);
            }
        } else if (i < 0 && (i2 = (c1319190kQv = this.LLILZLL).LIZIZ) != -1 && (c1318570kPv = (C1318570kPv) ((RecyclerView) this.LL.mView).findViewHolderForAdapterPosition(i2)) != null) {
            LJJJJJL(c1319190kQv, c1318570kPv, true, false);
        }
        int adapterPosition = -1;
        int adapterPosition2 = -1;
        for (int i6 = 0; i6 < recyclerView.getChildCount(); i6++) {
            View childAt = recyclerView.getChildAt(i6);
            if (childAt.getTop() <= this.LLILZ && childAt.getBottom() > this.LLILZ) {
                adapterPosition = recyclerView.getChildViewHolder(childAt).getAdapterPosition();
            }
            if (childAt.getTop() < recyclerView.getHeight() - this.LLILZ && childAt.getBottom() >= recyclerView.getHeight() - this.LLILZ) {
                adapterPosition2 = recyclerView.getChildViewHolder(childAt).getAdapterPosition();
            }
        }
        C1319030kQf c1319030kQf = this.LL.LLILLL;
        if (c1319030kQf != null) {
            if (this.LLIZLLLIL) {
                iLLLIL = c1319030kQf.LLLIIIIL(adapterPosition);
            } else {
                iLLLIL = c1319030kQf.LLLIL(adapterPosition);
            }
            if (this.LLIZLLLIL) {
                iLLLIILIL = c1319030kQf.LLLII(adapterPosition2);
            } else {
                iLLLIILIL = c1319030kQf.LLLIILIL(adapterPosition2);
            }
            if (c1319030kQf.LLJI.contains(Integer.valueOf(iLLLIL))) {
                if (this.LLILLL != iLLLIL) {
                    this.LLILLL = iLLLIL;
                    int i7 = UIList.LLLL;
                }
            } else {
                this.LLILLL = -1;
            }
            if (c1319030kQf.LLJIJIL.contains(Integer.valueOf(iLLLIILIL))) {
                if (this.LLILZIL != iLLLIILIL) {
                    this.LLILZIL = iLLLIILIL;
                    int i8 = UIList.LLLL;
                }
            } else {
                this.LLILZIL = -1;
            }
            int i9 = this.LLILZLL.LIZIZ;
            if (i9 != -1 && (i4 = this.LLILLL) != -1 && i9 != i4) {
                LJJIJIIJIL(this.LLILZLL);
            }
            int i10 = this.LLIZ.LIZIZ;
            if (i10 != -1 && (i3 = this.LLILZIL) != -1 && i10 != i3) {
                LJJIJIIJIL(this.LLIZ);
            }
        }
        LJJJ(this.LLILZLL, this.LLILLL, true);
        LJJJ(this.LLIZ, this.LLILZIL, false);
        LJJJJ();
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (i2 == 0) {
            HandlerHook.viewPost(recyclerView, new ARunnableS89S0200000_20(this, recyclerView, 40));
        } else {
            LJJJJZ(recyclerView, i2);
        }
    }

    public final void LJJIZ(C1319190kQv c1319190kQv, boolean z, boolean z2) {
        int i = c1319190kQv.LIZIZ;
        if (i == -1) {
            return;
        }
        C1318570kPv c1318570kPv = (C1318570kPv) ((RecyclerView) this.LL.mView).findViewHolderForAdapterPosition(i);
        if (c1318570kPv == null) {
            LJJJJJ(c1319190kQv.LIZ.mView);
            c1319190kQv.LIZIZ = -1;
            c1319190kQv.LIZ = null;
            return;
        }
        LJJJJJL(c1319190kQv, c1318570kPv, z, z2);
    }

    public final void LJJJ(C1319190kQv c1319190kQv, int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        if (i != -1 && i != c1319190kQv.LIZIZ) {
            RecyclerView recyclerView = (RecyclerView) this.LL.mView;
            C1318570kPv c1318570kPv = (C1318570kPv) recyclerView.findViewHolderForAdapterPosition(i);
            int i4 = 0;
            if (c1318570kPv == null) {
                c1318570kPv = (C1318570kPv) recyclerView.getAdapter().createViewHolder(recyclerView, recyclerView.getAdapter().getItemViewType(i));
                C1319030kQf c1319030kQf = this.LL.LLILLL;
                if (c1319030kQf.LLILZ) {
                    c1319030kQf.LLLFZ(c1318570kPv, i);
                } else {
                    c1319030kQf.bindViewHolder(c1318570kPv, i);
                }
            } else if (z) {
                if (c1318570kPv.LL.getTop() >= this.LLILZ) {
                    return;
                }
            } else {
                if (!z && c1318570kPv.LL.getBottom() > getHeight() - this.LLILZ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (0 == 0 && !z2) {
                    return;
                }
            }
            UIComponent uIComponent = c1318570kPv.LL.LLILLJJLI;
            if (uIComponent != null) {
                c1318570kPv.I5();
                if (z) {
                    i2 = 48;
                } else {
                    i2 = 80;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, i2);
                if (z) {
                    i3 = this.LLILZ;
                } else {
                    i3 = 0;
                }
                layoutParams.topMargin = i3;
                if (!z) {
                    i4 = this.LLILZ;
                }
                layoutParams.bottomMargin = i4;
                LJJJJJ(uIComponent.mView);
                addView(uIComponent.mView, layoutParams);
                c1319190kQv.LIZ = uIComponent;
                c1319190kQv.LIZIZ = i;
                int i5 = UIList.LLLL;
            }
        }
    }

    public final void LJJJJJL(C1319190kQv c1319190kQv, C1318570kPv c1318570kPv, boolean z, boolean z2) {
        T t;
        if (c1319190kQv.LIZIZ == -1) {
            return;
        }
        int top = c1318570kPv.LL.getTop();
        T t2 = c1319190kQv.LIZ.mView;
        if (t2 == 0) {
            return;
        }
        if (!z ? top >= t2.getTop() : top <= t2.getTop()) {
            if (!z2) {
                return;
            }
        }
        int i = UIList.LLLL;
        UIComponent uIComponent = c1319190kQv.LIZ;
        if (uIComponent != null && (t = uIComponent.mView) != 0) {
            C786410Ut5.zd((AndroidView) t, 0.0f);
        }
        LJJJJJ(c1319190kQv.LIZ.mView);
        UIComponent uIComponent2 = c1318570kPv.LL.LLILLJJLI;
        if (uIComponent2 != null) {
            UIList uIList = this.LL;
            if (uIList.LLILLL.LLILZ) {
                uIList.LJJIJIIJIL(uIComponent2);
            }
            c1318570kPv.I5();
        }
        c1318570kPv.L5(c1319190kQv.LIZ);
        c1319190kQv.LIZIZ = -1;
        c1319190kQv.LIZ = null;
    }
}
