package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.10xI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19413410xI<VH extends RecyclerView.ViewHolder> extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LLILZIL = 0;
    public int LL = 1;
    public final AbstractC21673619ry<VH> LLILLJJLI;
    public final InterfaceC19414010xO LLILLL;
    public C19413510xJ LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.getItemCount() + 1;
    }

    public final void LLLFZ(int i) {
        if (i != 0 && i != 1 && i != 3 && i != 2) {
            "state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.".toString();
            throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
        }
        if (this.LL != i) {
            this.LL = i;
            notifyItemChanged(getItemCount() - 1);
        }
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        if (i < this.LLILLJJLI.getItemCount()) {
            return this.LLILLJJLI.getItemId(i);
        }
        return super.getItemId(i);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < this.LLILLJJLI.getItemCount()) {
            return this.LLILLJJLI.getItemViewType(i);
        }
        return 65298;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if (this.LLILZ == null && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C19413510xJ c19413510xJ = new C19413510xJ();
            this.LLILZ = c19413510xJ;
            c19413510xJ.LJ = recyclerView;
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            c19413510xJ.LJFF = gridLayoutManager;
            c19413510xJ.LJI = gridLayoutManager.LLIZ;
            gridLayoutManager.LJIJI(c19413510xJ);
        }
        this.LLILLJJLI.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.LLILLJJLI.onDetachedFromRecyclerView(recyclerView);
        if (this.LLILZ != null) {
            this.LLILZ = null;
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // X.AbstractC21673619ry
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC19413910xN) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.LLILLJJLI.onFailedToRecycleView(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC19413910xN) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.LLILLJJLI.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC19413910xN) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.LLILLJJLI.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC19413910xN) {
            super.onViewRecycled(viewHolder);
        } else {
            this.LLILLJJLI.onViewRecycled(viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void registerAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        super.registerAdapterDataObserver(abstractC471570IeR);
        this.LLILLJJLI.registerAdapterDataObserver(abstractC471570IeR);
    }

    @Override // X.AbstractC21673619ry
    public final void setHasStableIds(boolean z) {
        this.LLILLJJLI.setHasStableIds(z);
    }

    @Override // X.AbstractC21673619ry
    public final void unregisterAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        super.unregisterAdapterDataObserver(abstractC471570IeR);
        this.LLILLJJLI.unregisterAdapterDataObserver(abstractC471570IeR);
    }

    public C19413410xI(C1117360fBO c1117360fBO, InterfaceC19414010xO interfaceC19414010xO) {
        this.LLILLJJLI = c1117360fBO;
        this.LLILLL = interfaceC19414010xO;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < this.LLILLJJLI.getItemCount()) {
            this.LLILLJJLI.onBindViewHolder(viewHolder, i);
        } else {
            ((AbstractC19413910xN) viewHolder).I5(this.LL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder;
        if (i == 65298) {
            viewHolderOnCreateViewHolder = this.LLILLL.LIZ(viewGroup);
        } else {
            viewHolderOnCreateViewHolder = this.LLILLJJLI.onCreateViewHolder(viewGroup, i);
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

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<? extends Object> list) {
        if (i < this.LLILLJJLI.getItemCount()) {
            this.LLILLJJLI.onBindViewHolder(viewHolder, i, list);
        } else {
            super.onBindViewHolder(viewHolder, i, list);
        }
    }
}
