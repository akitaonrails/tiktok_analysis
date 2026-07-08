package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21679919sz extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C21680019t0 LL;

    public C21679919sz() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public final List<? extends AbstractC21673619ry<? extends RecyclerView.ViewHolder>> LLLI() {
        ?? arrayList;
        C21680019t0 c21680019t0 = this.LL;
        if (((ArrayList) c21680019t0.LJ).isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(((ArrayList) c21680019t0.LJ).size());
            Iterator it2 = ((ArrayList) c21680019t0.LJ).iterator();
            while (it2.hasNext()) {
                arrayList.add(((C21680219t2) it2.next()).LIZJ);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        Iterator it2 = ((ArrayList) this.LL.LJ).iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((C21680219t2) it2.next()).LJ;
        }
        return i;
    }

    public final void LLLFZ(AbstractC21673619ry abstractC21673619ry) {
        C21680019t0 c21680019t0 = this.LL;
        c21680019t0.LIZ(((ArrayList) c21680019t0.LJ).size(), abstractC21673619ry);
    }

    public final void LLLII(C18QP c18qp) {
        super.setStateRestorationPolicy(c18qp);
    }

    public final void LLLIIIIL(AbstractC21673619ry abstractC21673619ry) {
        C21680019t0 c21680019t0 = this.LL;
        int iLJFF = c21680019t0.LJFF(abstractC21673619ry);
        if (iLJFF != -1) {
            C21680219t2 c21680219t2 = (C21680219t2) ListProtector.get(c21680019t0.LJ, iLJFF);
            int iLIZJ = c21680019t0.LIZJ(c21680219t2);
            ListProtector.remove(c21680019t0.LJ, iLJFF);
            c21680019t0.LIZ.notifyItemRangeRemoved(iLIZJ, c21680219t2.LJ);
            Iterator it2 = ((ArrayList) c21680019t0.LIZJ).iterator();
            while (it2.hasNext()) {
                RecyclerView recyclerView = (RecyclerView) ((Reference) it2.next()).get();
                if (recyclerView != null) {
                    abstractC21673619ry.onDetachedFromRecyclerView(recyclerView);
                }
            }
            c21680219t2.LIZJ.unregisterAdapterDataObserver(c21680219t2.LJFF);
            c21680219t2.LIZ.dispose();
            c21680019t0.LIZIZ();
        }
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        C21680019t0 c21680019t0 = this.LL;
        C21680319t3 c21680319t3LIZLLL = c21680019t0.LIZLLL(i);
        C21680219t2 c21680219t2 = c21680319t3LIZLLL.LIZ;
        long jLIZ = c21680219t2.LIZIZ.LIZ(c21680219t2.LIZJ.getItemId(c21680319t3LIZLLL.LIZIZ));
        c21680319t3LIZLLL.LIZJ = false;
        c21680319t3LIZLLL.LIZ = null;
        c21680319t3LIZLLL.LIZIZ = -1;
        c21680019t0.LJFF = c21680319t3LIZLLL;
        return jLIZ;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C21680019t0 c21680019t0 = this.LL;
        C21680319t3 c21680319t3LIZLLL = c21680019t0.LIZLLL(i);
        C21680219t2 c21680219t2 = c21680319t3LIZLLL.LIZ;
        int iLIZ = c21680219t2.LIZ.LIZ(c21680219t2.LIZJ.getItemViewType(c21680319t3LIZLLL.LIZIZ));
        c21680319t3LIZLLL.LIZJ = false;
        c21680319t3LIZLLL.LIZ = null;
        c21680319t3LIZLLL.LIZIZ = -1;
        c21680019t0.LJFF = c21680319t3LIZLLL;
        return iLIZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C21680019t0 c21680019t0 = this.LL;
        Iterator it2 = ((ArrayList) c21680019t0.LIZJ).iterator();
        while (it2.hasNext()) {
            if (((Reference) it2.next()).get() == recyclerView) {
                return;
            }
        }
        ((ArrayList) c21680019t0.LIZJ).add(new WeakReference(recyclerView));
        Iterator it3 = ((ArrayList) c21680019t0.LJ).iterator();
        while (it3.hasNext()) {
            ((C21680219t2) it3.next()).LIZJ.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C21680019t0 c21680019t0 = this.LL;
        int size = ((ArrayList) c21680019t0.LIZJ).size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Reference reference = (Reference) ListProtector.get(c21680019t0.LIZJ, size);
            if (reference.get() == null) {
                ListProtector.remove(c21680019t0.LIZJ, size);
            } else if (reference.get() == recyclerView) {
                ListProtector.remove(c21680019t0.LIZJ, size);
                break;
            }
        }
        Iterator it2 = ((ArrayList) c21680019t0.LJ).iterator();
        while (it2.hasNext()) {
            ((C21680219t2) it2.next()).LIZJ.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C21680019t0 c21680019t0 = this.LL;
        C21680219t2 c21680219t2 = c21680019t0.LIZLLL.get(viewHolder);
        if (c21680219t2 != null) {
            boolean zOnFailedToRecycleView = c21680219t2.LIZJ.onFailedToRecycleView(viewHolder);
            c21680019t0.LIZLLL.remove(viewHolder);
            return zOnFailedToRecycleView;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot find wrapper for ");
        sbLIZ.append(viewHolder);
        sbLIZ.append(", seems like it is not bound by this adapter: ");
        sbLIZ.append(c21680019t0);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.LL.LJ(viewHolder).LIZJ.onViewAttachedToWindow(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.LL.LJ(viewHolder).LIZJ.onViewDetachedFromWindow(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C21680019t0 c21680019t0 = this.LL;
        C21680219t2 c21680219t2 = c21680019t0.LIZLLL.get(viewHolder);
        if (c21680219t2 != null) {
            c21680219t2.LIZJ.onViewRecycled(viewHolder);
            c21680019t0.LIZLLL.remove(viewHolder);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot find wrapper for ");
        sbLIZ.append(viewHolder);
        sbLIZ.append(", seems like it is not bound by this adapter: ");
        sbLIZ.append(c21680019t0);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC21673619ry
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // X.AbstractC21673619ry
    public final void setStateRestorationPolicy(C18QP c18qp) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public C21679919sz(C0JEI c0jei, List<? extends AbstractC21673619ry<? extends RecyclerView.ViewHolder>> list) {
        boolean z;
        this.LL = new C21680019t0(this, c0jei);
        Iterator<? extends AbstractC21673619ry<? extends RecyclerView.ViewHolder>> it2 = list.iterator();
        while (it2.hasNext()) {
            LLLFZ(it2.next());
        }
        if (this.LL.LJI != C0JEK.NO_STABLE_IDS) {
            z = true;
        } else {
            z = false;
        }
        super.setHasStableIds(z);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C21680019t0 c21680019t0 = this.LL;
        C21680319t3 c21680319t3LIZLLL = c21680019t0.LIZLLL(i);
        c21680019t0.LIZLLL.put(viewHolder, c21680319t3LIZLLL.LIZ);
        C21680219t2 c21680219t2 = c21680319t3LIZLLL.LIZ;
        c21680219t2.LIZJ.bindViewHolder(viewHolder, c21680319t3LIZLLL.LIZIZ);
        c21680319t3LIZLLL.LIZJ = false;
        c21680319t3LIZLLL.LIZ = null;
        c21680319t3LIZLLL.LIZIZ = -1;
        c21680019t0.LJFF = c21680319t3LIZLLL;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C21680219t2 c21680219t2LIZIZ = this.LL.LIZIZ.LIZIZ(i);
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder = c21680219t2LIZIZ.LIZJ.onCreateViewHolder(viewGroup, c21680219t2LIZIZ.LIZ.LIZIZ(i));
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
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
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

    public C21679919sz(C0JEI c0jei, AbstractC21673619ry<? extends RecyclerView.ViewHolder>... abstractC21673619ryArr) {
        this(c0jei, (List<? extends AbstractC21673619ry<? extends RecyclerView.ViewHolder>>) Arrays.asList(abstractC21673619ryArr));
    }

    @Override // X.AbstractC21673619ry
    public final int findRelativeAdapterPositionIn(AbstractC21673619ry<? extends RecyclerView.ViewHolder> abstractC21673619ry, RecyclerView.ViewHolder viewHolder, int i) {
        C21680019t0 c21680019t0 = this.LL;
        C21680219t2 c21680219t2 = c21680019t0.LIZLLL.get(viewHolder);
        if (c21680219t2 == null) {
            return -1;
        }
        int iLIZJ = i - c21680019t0.LIZJ(c21680219t2);
        int itemCount = c21680219t2.LIZJ.getItemCount();
        if (iLIZJ >= 0 && iLIZJ < itemCount) {
            return c21680219t2.LIZJ.findRelativeAdapterPositionIn(abstractC21673619ry, viewHolder, iLIZJ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Detected inconsistent adapter updates. The local position of the view holder maps to ");
        sbLIZ.append(iLIZJ);
        sbLIZ.append(" which is out of bounds for the adapter with size ");
        sbLIZ.append(itemCount);
        sbLIZ.append(".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbLIZ.append(viewHolder);
        sbLIZ.append("adapter:");
        sbLIZ.append(abstractC21673619ry);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
