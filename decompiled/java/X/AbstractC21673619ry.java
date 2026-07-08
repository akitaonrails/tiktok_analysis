package X;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.19ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21673619ry<VH extends RecyclerView.ViewHolder> {
    public final C471560IeQ mObservable = new C471560IeQ();
    public boolean mHasStableIds = false;
    public C18QP mStateRestorationPolicy = C18QP.ALLOW;

    public int findRelativeAdapterPositionIn(AbstractC21673619ry<? extends RecyclerView.ViewHolder> abstractC21673619ry, RecyclerView.ViewHolder viewHolder, int i) {
        if (abstractC21673619ry == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(VH vh, int i);

    public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(VH vh) {
        return false;
    }

    public void onViewAttachedToWindow(VH vh) {
    }

    public void onViewDetachedFromWindow(VH vh) {
    }

    public void onViewRecycled(VH vh) {
    }

    public boolean canRestoreState() {
        int i = C18QQ.LIZ[this.mStateRestorationPolicy.ordinal()];
        if (i != 1) {
            return i != 2 || getItemCount() > 0;
        }
        return false;
    }

    public final boolean hasObservers() {
        return this.mObservable.LIZ();
    }

    public final void notifyDataSetChanged() {
        this.mObservable.LIZIZ();
    }

    public final C18QP getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.LIZLLL(i, 1, null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.LJ(i, 1);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.LJFF(i, 1);
    }

    public void registerAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        this.mObservable.registerObserver(abstractC471570IeR);
    }

    public void setHasStableIds(boolean z) {
        if (!hasObservers()) {
            this.mHasStableIds = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void setStateRestorationPolicy(C18QP c18qp) {
        this.mStateRestorationPolicy = c18qp;
        this.mObservable.LJI();
    }

    public void unregisterAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        this.mObservable.unregisterObserver(abstractC471570IeR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindViewHolder(VH vh, int i) {
        boolean z;
        if (vh.mBindingAdapter == null) {
            z = true;
            vh.mPosition = i;
            if (this.mHasStableIds) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            int i2 = C08C0.LIZ;
            Trace.beginSection("RV OnBindView");
        } else {
            z = false;
        }
        vh.mBindingAdapter = this;
        if (RecyclerView.sDebugAssertionsEnabled) {
            if (vh.itemView.getParent() == null && vh.itemView.isAttachedToWindow() != vh.isTmpDetached()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Temp-detached state out of sync with reality. holder.isTmpDetached(): ");
                sbLIZ.append(vh.isTmpDetached());
                sbLIZ.append(", attached to window: ");
                sbLIZ.append(vh.itemView.isAttachedToWindow());
                sbLIZ.append(", holder: ");
                sbLIZ.append(vh);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (vh.itemView.getParent() == null && vh.itemView.isAttachedToWindow()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Attempting to bind attached holder with no parent (AKA temp detached): ");
                sbLIZ2.append(vh);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
        if (z) {
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                ((RecyclerView.LayoutParams) layoutParams).mInsetsDirty = true;
            }
            int i3 = C08C0.LIZ;
            Trace.endSection();
        }
    }

    public final VH createViewHolder(ViewGroup viewGroup, int i) {
        try {
            int i2 = C08C0.LIZ;
            Trace.beginSection("RV CreateView");
            VH vh = (VH) onCreateViewHolder(viewGroup, i);
            if (vh.itemView.getParent() == null) {
                vh.mItemViewType = i;
                Trace.endSection();
                return vh;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i3 = C08C0.LIZ;
            Trace.endSection();
            throw th;
        }
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.LIZLLL(i, 1, obj);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.LIZJ(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.LIZLLL(i, i2, null);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.LJ(i, i2);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.LJFF(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.LIZLLL(i, i2, obj);
    }

    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        onBindViewHolder(vh, i);
    }
}
