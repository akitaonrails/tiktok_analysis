package X;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.11Cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19463911Cz extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final AbstractC21673619ry<RecyclerView.ViewHolder> LL;
    public final C11D5 LLILLJJLI;
    public final C11D4 LLILLL;
    public final C19461911Cf LLILZ;
    public final C11D0 LLILZIL;
    public final C11D3[] LLILZLL;
    public final C11D6 LLIZ;
    public boolean LLIZLLLIL;
    public final C19463811Cy LLJ;

    public static boolean LLLIIIIL(int i) {
        return 15990784 <= i && i < 16252929;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public final int LLLFZ() {
        return this.LLILLL.isEnable() ? 1 : 0;
    }

    public final int LLLI() {
        return this.LLILLJJLI.isEnable() ? 1 : 0;
    }

    public final int LLLII() {
        return this.LL.getItemCount();
    }

    public final void LLLIL() {
        RecyclerView recyclerView;
        final RecyclerView.LayoutManager layoutManager;
        if (this.LLIZLLLIL || (recyclerView = this.LLIZ.LLILLL) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        this.LLIZLLLIL = true;
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final AbstractC214823195h abstractC214823195h = gridLayoutManager.LLIZ;
            gridLayoutManager.LJIJI(new AbstractC214823195h() { // from class: X.11D2
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    if (C19463911Cz.LLLIIIIL(this.LJ.getItemViewType(i))) {
                        return ((GridLayoutManager) layoutManager).LLILLJJLI;
                    }
                    AbstractC214823195h abstractC214823195h2 = abstractC214823195h;
                    if (abstractC214823195h2 != null) {
                        return abstractC214823195h2.LJFF(i - this.LJ.LLLI());
                    }
                    return 1;
                }
            });
        }
        C11D1 c11d1 = this.LLILZ.LJIIJJI;
        C11D6 c11d6 = c11d1.LLILLJJLI;
        c11d6.LLILLL = recyclerView;
        recyclerView.addOnAttachStateChangeListener(c11d6);
        c11d1.LLILZIL = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 instanceof LinearLayoutManager) {
            c11d1.LLILZLL = ((LinearLayoutManager) layoutManager2).getOrientation() == 1;
        } else if (layoutManager2 instanceof StaggeredGridLayoutManager) {
            c11d1.LLILZLL = ((StaggeredGridLayoutManager) layoutManager2).LLILZIL == 1;
        }
        int i = c11d1.LL.LJIIIIZZ;
        if ((i == 243 || i == 244) && !c11d1.LLIZ.get()) {
            recyclerView.addOnItemTouchListener(c11d1);
            c11d1.LLIZ.set(true);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return LLLII() == 0 ? this.LLILZIL.LIZJ() : LLLII() + LLLI() + LLLFZ() + (this.LLILZ.isEnable() ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.11Cy] */
    public C19463911Cz(C11DC c11dc) {
        this.LL = c11dc;
        C11D5 c11d5 = new C11D5();
        this.LLILLJJLI = c11d5;
        C11D4 c11d4 = new C11D4();
        this.LLILLL = c11d4;
        C19461911Cf c19461911Cf = new C19461911Cf();
        this.LLILZ = c19461911Cf;
        C11D0 c11d0 = new C11D0(c11d5, c11d4);
        this.LLILZIL = c11d0;
        this.LLILZLL = new C11D3[]{c11d5, c11d4, c19461911Cf, c11d0};
        this.LLIZ = new C11D6(0);
        setHasStableIds(c11dc.mHasStableIds);
        final C19463711Cx c19463711Cx = (C19463711Cx) this;
        this.LLJ = new AbstractC471570IeR() { // from class: X.11Cy
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                c19463711Cx.notifyDataSetChanged();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                LIZJ(i, i2, null);
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                C19463911Cz c19463911Cz = c19463711Cx;
                c19463911Cz.notifyItemRangeInserted(i + c19463911Cz.LLLI(), i2);
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                C19463911Cz c19463911Cz = c19463711Cx;
                c19463911Cz.notifyItemMoved(c19463911Cz.LLLI() + i, c19463711Cx.LLLI() + i2);
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                C19463911Cz c19463911Cz = c19463711Cx;
                c19463911Cz.notifyItemRangeRemoved(i + c19463911Cz.LLLI(), i2);
            }

            @Override // X.AbstractC471570IeR
            public final void LIZJ(int i, int i2, Object obj) {
                C19463911Cz c19463911Cz = c19463711Cx;
                c19463911Cz.notifyItemRangeChanged(i + c19463911Cz.LLLI(), i2, obj);
            }
        };
    }

    public final void LLLIILIL(int i) {
        C19461911Cf c19461911Cf = this.LLILZ;
        if (c19461911Cf.LJIIIIZZ == i) {
            return;
        }
        boolean zIsEnable = c19461911Cf.isEnable();
        C19461911Cf c19461911Cf2 = this.LLILZ;
        c19461911Cf2.LJIIIIZZ = i;
        C11D1 c11d1 = c19461911Cf2.LJIIJJI;
        c11d1.getClass();
        if (i != 241 && i != 242) {
            RecyclerView recyclerView = c11d1.LLILLJJLI.LLILLL;
            if (recyclerView != null && !c11d1.LLIZ.get()) {
                recyclerView.addOnItemTouchListener(c11d1);
                c11d1.LLIZ.set(true);
            }
        } else {
            RecyclerView recyclerView2 = c11d1.LLILLJJLI.LLILLL;
            if (recyclerView2 != null && c11d1.LLIZ.get()) {
                recyclerView2.removeOnItemTouchListener(c11d1);
                c11d1.LLIZ.set(false);
            }
        }
        boolean zIsEnable2 = this.LLILZ.isEnable();
        this.LLILZ.LJI(241);
        if (this.LLIZ.LLILLL != null) {
            if (zIsEnable) {
                if (!zIsEnable2) {
                    notifyItemRemoved(LLLII() + LLLI() + LLLFZ());
                }
            } else {
                if (!zIsEnable2 || zIsEnable) {
                    return;
                }
                notifyItemInserted(LLLII() + LLLI() + LLLFZ());
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        if (LLLIIIIL(getItemViewType(i))) {
            return super.getItemId(i);
        }
        return this.LL.getItemId(i);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (LLLII() == 0 && this.LLILZIL.isEnable()) {
            C11D0 c11d0 = this.LLILZIL;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return c11d0.LJ.getViewType();
                    }
                } else {
                    if (c11d0.LJIIJ != 241 && (c11d0.LJIIIZ & 1) == 1 && c11d0.LIZLLL.isEnable() && (c11d0.LJIIIZ & 2) == 2) {
                        return c11d0.LJFF;
                    }
                    if (c11d0.LJIIJ != 241 && (c11d0.LJIIIZ & 1) == 1 && (!c11d0.LIZLLL.isEnable() || (c11d0.LJIIIZ & 2) != 2)) {
                        return c11d0.LJ.getViewType();
                    }
                }
            } else {
                if (c11d0.LIZLLL.isEnable() && (c11d0.LJIIIZ & 2) == 2) {
                    return c11d0.LIZLLL.getViewType();
                }
                if (c11d0.LJIIJ != 241 && (c11d0.LJIIIZ & 1) == 1) {
                    return c11d0.LJFF;
                }
                if (c11d0.LJ.isEnable() && (c11d0.LJIIIZ & 4) == 4) {
                    return c11d0.LJ.getViewType();
                }
            }
            return c11d0.LJFF;
        }
        if (i == 0 && this.LLILLJJLI.isEnable()) {
            return this.LLILLJJLI.LIZLLL;
        }
        int iLLLII = LLLII() + LLLI();
        if (i == iLLLII && this.LLILLL.isEnable()) {
            return this.LLILLL.LIZLLL;
        }
        if (i == iLLLII + LLLFZ() && this.LLILZ.isEnable()) {
            return this.LLILZ.LIZLLL;
        }
        return this.LL.getItemViewType(i - LLLI());
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        C11D6 c11d6 = this.LLIZ;
        c11d6.LLILLL = recyclerView;
        recyclerView.addOnAttachStateChangeListener(c11d6);
        LLLIL();
        this.LL.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        C11D6 c11d6 = this.LLIZ;
        c11d6.LLILLL = null;
        recyclerView.removeOnAttachStateChangeListener(c11d6);
        if (this.LLIZLLLIL) {
            C11D1 c11d1 = this.LLILZ.LJIIJJI;
            C11D6 c11d62 = c11d1.LLILLJJLI;
            c11d62.LLILLL = null;
            recyclerView.removeOnAttachStateChangeListener(c11d62);
            if (c11d1.LLIZ.get()) {
                recyclerView.removeOnItemTouchListener(c11d1);
                c11d1.LLIZ.set(false);
            }
        }
        this.LLIZLLLIL = false;
        this.LL.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // X.AbstractC21673619ry
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        if (LLLIIIIL(viewHolder.getItemViewType())) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.LL.onFailedToRecycleView(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2;
        View view;
        C21681819tI c21681819tI;
        for (C11D3 c11d3 : this.LLILZLL) {
            if (c11d3.getViewType() == viewHolder.getItemViewType()) {
                super.onViewAttachedToWindow(viewHolder);
                if (!c11d3.LIZ && (viewHolder2 = c11d3.LIZJ) != null && (view = viewHolder2.itemView) != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
                        c21681819tI.LLILLJJLI = true;
                        c11d3.LIZ = true;
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.LL.onViewAttachedToWindow(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (LLLIIIIL(viewHolder.getItemViewType())) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.LL.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (LLLIIIIL(viewHolder.getItemViewType())) {
            super.onViewRecycled(viewHolder);
        } else {
            this.LL.onViewRecycled(viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void registerAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        super.registerAdapterDataObserver(abstractC471570IeR);
        this.LL.registerAdapterDataObserver(this.LLJ);
    }

    @Override // X.AbstractC21673619ry
    public final void unregisterAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        super.unregisterAdapterDataObserver(abstractC471570IeR);
        this.LL.unregisterAdapterDataObserver(this.LLJ);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean zLIZ;
        C11D3 c11d3;
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder;
        boolean z;
        LLLIL();
        C11D3[] c11d3Arr = this.LLILZLL;
        int length = c11d3Arr.length;
        int i2 = 0;
        while (true) {
            zLIZ = true;
            if (i2 < length) {
                c11d3 = c11d3Arr[i2];
                if (c11d3.getViewType() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            } else {
                c11d3 = null;
                break;
            }
        }
        if (c11d3 == null || (viewHolderOnCreateViewHolder = c11d3.LIZ(viewGroup)) == null) {
            viewHolderOnCreateViewHolder = this.LL.onCreateViewHolder(viewGroup, i);
        }
        if (viewHolderOnCreateViewHolder != null) {
            try {
                View view = viewHolderOnCreateViewHolder.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderOnCreateViewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderOnCreateViewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                    stringBuffer.append(" holder ");
                    stringBuffer.append(viewHolderOnCreateViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderOnCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderOnCreateViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderOnCreateViewHolder.getClass().getName();
        return viewHolderOnCreateViewHolder;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (LLLII() != 0 && this.LLILZ.isEnable() && i == getItemCount() - 2) {
            C19461911Cf c19461911Cf = this.LLILZ;
            int i2 = c19461911Cf.LJIIIIZZ;
            if (i2 != 242 && i2 != 244) {
                if (i2 == 243) {
                    c19461911Cf.LJIIJJI.LLIZLLLIL = true;
                }
            } else {
                c19461911Cf.LJFF(241);
            }
        }
        if (!LLLIIIIL(viewHolder.getItemViewType())) {
            this.LL.onBindViewHolder(viewHolder, i - LLLI(), list);
        }
    }
}
