package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0PVK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PVK extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public AbstractC21673619ry LL;
    public C0PVL LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        AbstractC21673619ry abstractC21673619ry = this.LL;
        if (abstractC21673619ry != null) {
            return abstractC21673619ry.getItemCount();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return this.LL.getItemViewType(i);
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        AbstractC21673619ry abstractC21673619ry = this.LL;
        if (abstractC21673619ry != null) {
            abstractC21673619ry.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        AbstractC21673619ry abstractC21673619ry = this.LL;
        if (abstractC21673619ry != null) {
            abstractC21673619ry.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        AbstractC21673619ry abstractC21673619ry = this.LL;
        if (abstractC21673619ry != null) {
            return abstractC21673619ry.onFailedToRecycleView(viewHolder);
        }
        return super.onFailedToRecycleView(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        AbstractC21673619ry abstractC21673619ry = this.LL;
        if (abstractC21673619ry != null) {
            abstractC21673619ry.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        AbstractC21673619ry abstractC21673619ry = this.LL;
        if (abstractC21673619ry != null) {
            abstractC21673619ry.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        AbstractC21673619ry abstractC21673619ry = this.LL;
        if (abstractC21673619ry != null) {
            abstractC21673619ry.onViewRecycled(viewHolder);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.LL.onBindViewHolder(viewHolder, i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder = this.LL.onCreateViewHolder(viewGroup, i);
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
    public final int findRelativeAdapterPositionIn(AbstractC21673619ry<? extends RecyclerView.ViewHolder> abstractC21673619ry, RecyclerView.ViewHolder viewHolder, int i) {
        if (C301200BrK.LIZ()) {
            return super.findRelativeAdapterPositionIn(abstractC21673619ry, viewHolder, i);
        }
        AbstractC21673619ry abstractC21673619ry2 = this.LL;
        if (abstractC21673619ry2 != null) {
            return abstractC21673619ry2.findRelativeAdapterPositionIn(abstractC21673619ry, viewHolder, i);
        }
        return -1;
    }
}
