package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10xS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19414410xS extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final AbstractC21673619ry LLILLL;
    public final C1119470fEn<View> LL = new C1119470fEn<>();
    public final C1119470fEn<View> LLILLJJLI = new C1119470fEn<>();
    public final C19414910xX LLILZ = new AbstractC471570IeR() { // from class: X.10xX
        @Override // X.AbstractC471570IeR
        public final void LIZ() {
            this.LIZ.notifyDataSetChanged();
        }

        @Override // X.AbstractC471570IeR
        public final void LIZIZ(int i, int i2) {
            C19414410xS c19414410xS = this.LIZ;
            c19414410xS.notifyItemRangeChanged(c19414410xS.LLLFZ() + i, i2);
        }

        @Override // X.AbstractC471570IeR
        public final void LIZLLL(int i, int i2) {
            C19414410xS c19414410xS = this.LIZ;
            c19414410xS.notifyItemRangeInserted(c19414410xS.LLLFZ() + i, i2);
        }

        @Override // X.AbstractC471570IeR
        public final void LJ(int i, int i2) {
            C19414410xS c19414410xS = this.LIZ;
            c19414410xS.notifyItemMoved(c19414410xS.LLLFZ() + i, this.LIZ.LLLFZ() + i2);
        }

        @Override // X.AbstractC471570IeR
        public final void LJFF(int i, int i2) {
            C19414410xS c19414410xS = this.LIZ;
            c19414410xS.notifyItemRangeRemoved(c19414410xS.LLLFZ() + i, i2);
        }

        @Override // X.AbstractC471570IeR
        public final void LIZJ(int i, int i2, Object obj) {
            C19414410xS c19414410xS = this.LIZ;
            c19414410xS.notifyItemRangeChanged(c19414410xS.LLLFZ() + i, i2, obj);
        }
    };

    public final int LLLFZ() {
        return this.LL.LJII();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return LLLFZ() + this.LLILLL.getItemCount() + this.LLILLJJLI.LJII();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.10xX] */
    public C19414410xS(C530420KrA c530420KrA) {
        this.LLILLL = c530420KrA;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < LLLFZ()) {
            return this.LL.LJ(i);
        }
        if (LLLFZ() + this.LLILLL.getItemCount() < i) {
            return this.LLILLJJLI.LJ((i - LLLFZ()) - this.LLILLL.getItemCount());
        }
        return this.LLILLL.getItemViewType(i - LLLFZ());
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.LLILLL.onAttachedToRecyclerView(recyclerView);
        final C19414610xU c19414610xU = new C19414610xU(this);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final AbstractC214823195h abstractC214823195h = gridLayoutManager.LLIZ;
            gridLayoutManager.LJIJI(new AbstractC214823195h() { // from class: X.10xT
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    InterfaceC19414810xW interfaceC19414810xW = c19414610xU;
                    GridLayoutManager gridLayoutManager2 = gridLayoutManager;
                    AbstractC214823195h abstractC214823195h2 = abstractC214823195h;
                    C19414610xU c19414610xU2 = (C19414610xU) interfaceC19414810xW;
                    int itemViewType = c19414610xU2.LIZ.getItemViewType(i);
                    if (c19414610xU2.LIZ.LL.LIZLLL(itemViewType) != null) {
                        return gridLayoutManager2.LLILLJJLI;
                    }
                    if (c19414610xU2.LIZ.LLILLJJLI.LIZLLL(itemViewType) != null) {
                        return gridLayoutManager2.LLILLJJLI;
                    }
                    if (abstractC214823195h2 != null) {
                        return abstractC214823195h2.LJFF(i - c19414610xU2.LIZ.LLLFZ());
                    }
                    return 1;
                }
            });
            gridLayoutManager.LJIJ(gridLayoutManager.LLILLJJLI);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams;
        this.LLILLL.onViewAttachedToWindow(viewHolder);
        int layoutPosition = viewHolder.getLayoutPosition();
        if ((layoutPosition < LLLFZ() || LLLFZ() + this.LLILLL.getItemCount() < layoutPosition) && (layoutParams = viewHolder.itemView.getLayoutParams()) != null && (layoutParams instanceof C21681819tI)) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void registerAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        super.registerAdapterDataObserver(abstractC471570IeR);
        this.LLILLL.registerAdapterDataObserver(this.LLILZ);
    }

    @Override // X.AbstractC21673619ry
    public final void unregisterAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        super.unregisterAdapterDataObserver(abstractC471570IeR);
        this.LLILLL.unregisterAdapterDataObserver(this.LLILZ);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i >= LLLFZ() && LLLFZ() + this.LLILLL.getItemCount() >= i) {
            this.LLILLL.onBindViewHolder(viewHolder, i - LLLFZ());
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder;
        if (this.LL.LIZLLL(i) != null) {
            viewGroup.getContext();
            final View viewLIZLLL = this.LL.LIZLLL(i);
            viewHolderOnCreateViewHolder = new RecyclerView.ViewHolder(viewLIZLLL) { // from class: X.10xV
                public final View LL;

                {
                    super(viewLIZLLL);
                    this.LL = viewLIZLLL;
                    new SparseArray();
                }
            };
            viewHolderOnCreateViewHolder.setIsRecyclable(false);
        } else if (this.LLILLJJLI.LIZLLL(i) != null) {
            viewGroup.getContext();
            final View viewLIZLLL2 = this.LLILLJJLI.LIZLLL(i);
            viewHolderOnCreateViewHolder = new RecyclerView.ViewHolder(viewLIZLLL2) { // from class: X.10xV
                public final View LL;

                {
                    super(viewLIZLLL2);
                    this.LL = viewLIZLLL2;
                    new SparseArray();
                }
            };
            viewHolderOnCreateViewHolder.setIsRecyclable(false);
        } else {
            viewHolderOnCreateViewHolder = this.LLILLL.onCreateViewHolder(viewGroup, i);
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
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
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
}
