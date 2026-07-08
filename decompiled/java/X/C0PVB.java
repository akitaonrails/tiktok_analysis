package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PVB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0PVB extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final AbstractC21673619ry<RecyclerView.ViewHolder> LL;
    public final ArrayList<C0PFP> LLILLJJLI = new ArrayList<>();
    public final ArrayList<C0PFP> LLILLL = new ArrayList<>();
    public final C1119470fEn<C0PFP> LLILZ = new C1119470fEn<>((Object) null);
    public final C1119470fEn<C0PFP> LLILZIL = new C1119470fEn<>((Object) null);
    public final C0PD9 LLILZLL = new C0PD9();
    public final C0PVD LLIZ = new AbstractC471570IeR() { // from class: X.0PVD
        @Override // X.AbstractC471570IeR
        public final void LIZ() {
            this.LIZ.notifyDataSetChanged();
        }

        @Override // X.AbstractC471570IeR
        public final void LIZIZ(int i, int i2) {
            C0PVB c0pvb = this.LIZ;
            c0pvb.notifyItemRangeChanged(c0pvb.LLLII() + i, i2);
        }

        @Override // X.AbstractC471570IeR
        public final void LIZLLL(int i, int i2) {
            C0PVB c0pvb = this.LIZ;
            c0pvb.notifyItemRangeInserted(c0pvb.LLLII() + i, i2);
        }

        @Override // X.AbstractC471570IeR
        public final void LJ(int i, int i2) {
            C0PVB c0pvb = this.LIZ;
            c0pvb.notifyItemMoved(c0pvb.LLLII() + i, this.LIZ.LLLII() + i2);
        }

        @Override // X.AbstractC471570IeR
        public final void LJFF(int i, int i2) {
            C0PVB c0pvb = this.LIZ;
            c0pvb.notifyItemRangeRemoved(c0pvb.LLLII() + i, i2);
        }

        @Override // X.AbstractC471570IeR
        public final void LIZJ(int i, int i2, Object obj) {
            C0PVB c0pvb = this.LIZ;
            c0pvb.notifyItemRangeChanged(c0pvb.LLLII() + i, i2, obj);
        }
    };

    public final List<View> LLLI() {
        ArrayList<C0PFP> arrayList = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<C0PFP> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().itemView);
        }
        return arrayList2;
    }

    public final int LLLII() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return LLLII() + this.LLILLL.size() + this.LL.getItemCount();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0PVD] */
    public C0PVB(AbstractC683590Qrd abstractC683590Qrd) {
        this.LL = abstractC683590Qrd;
        setHasStableIds(abstractC683590Qrd.mHasStableIds);
    }

    public final boolean LLLIIIIL(int i) {
        this.LLILZLL.getClass();
        if (100000 <= i && i < 110001) {
            return true;
        }
        return false;
    }

    public final boolean LLLIILIL(int i) {
        if (i < 0 || i >= this.LLILLJJLI.size()) {
            return false;
        }
        C0PFP c0pfp = (C0PFP) ListProtector.remove(this.LLILLJJLI, i);
        this.LLILZ.LJI(c0pfp.LL);
        c0pfp.setIsRecyclable(false);
        this.LLILZLL.LIZIZ.addLast(Integer.valueOf(c0pfp.LL));
        notifyItemRemoved(i);
        return true;
    }

    public final void LLLIL(View view) {
        if (view == null) {
            return;
        }
        Iterator<C0PFP> it2 = this.LLILLJJLI.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().itemView, view)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        LLLIILIL(i);
    }

    @Override // X.AbstractC21673619ry
    public int getItemViewType(int i) {
        if (i < LLLII()) {
            return ((C0PFP) ListProtector.get(this.LLILLJJLI, i)).LL;
        }
        if (i >= LLLII() + this.LL.getItemCount()) {
            return ((C0PFP) ListProtector.get(this.LLILLL, (i - LLLII()) - this.LL.getItemCount())).LL;
        }
        int itemViewType = this.LL.getItemViewType(i - LLLII());
        if (!LLLIIIIL(itemViewType)) {
            return itemViewType;
        }
        throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.LL.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final AbstractC214823195h abstractC214823195h = gridLayoutManager.LLIZ;
            gridLayoutManager.LJIJI(new AbstractC214823195h() { // from class: X.0PVC
                @Override // X.AbstractC214823195h
                public final int LJFF(int i) {
                    if (this.LJ.LLLIIIIL(this.LJ.getItemViewType(i))) {
                        GridLayoutManager gridLayoutManager2 = gridLayoutManager;
                        if (gridLayoutManager2 == null) {
                            return 1;
                        }
                        return gridLayoutManager2.LLILLJJLI;
                    }
                    AbstractC214823195h abstractC214823195h2 = abstractC214823195h;
                    if (abstractC214823195h2 == null) {
                        return 1;
                    }
                    return abstractC214823195h2.LJFF(i - this.LJ.LLLII());
                }
            });
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
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
        if (LLLIIIIL(viewHolder.getItemViewType())) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof C21681819tI) {
                ((C21681819tI) layoutParams).LLILLJJLI = true;
                return;
            }
            return;
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
        AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry = this.LL;
        if (abstractC21673619ry != null) {
            try {
                abstractC21673619ry.unregisterAdapterDataObserver(this.LLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LL.registerAdapterDataObserver(this.LLIZ);
    }

    @Override // X.AbstractC21673619ry
    public final void unregisterAdapterDataObserver(AbstractC471570IeR abstractC471570IeR) {
        super.unregisterAdapterDataObserver(abstractC471570IeR);
        this.LL.unregisterAdapterDataObserver(this.LLIZ);
    }

    public final void LLLFZ(int i, View view) {
        int iIntValue;
        if (i < 0 || i > this.LLILLJJLI.size() || view == null) {
            return;
        }
        C0PD9 c0pd9 = this.LLILZLL;
        if (c0pd9.LIZIZ.size() > 0) {
            iIntValue = c0pd9.LIZIZ.removeFirst().intValue();
        } else {
            iIntValue = c0pd9.LIZ;
            if (iIntValue <= 110000) {
                c0pd9.LIZ = iIntValue + 1;
            } else {
                throw new IllegalStateException("Your viewType is too much,it's impossible in common");
            }
        }
        C0PFP c0pfp = new C0PFP(iIntValue, view);
        this.LLILLJJLI.add(c0pfp);
        this.LLILZ.LJFF(iIntValue, c0pfp);
        notifyItemInserted(i);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < LLLII() || i >= LLLII() + this.LL.getItemCount()) {
            return;
        }
        this.LL.onBindViewHolder(viewHolder, i - LLLII());
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0PFP c0pfpLIZLLL = this.LLILZ.LIZLLL(i);
        if (c0pfpLIZLLL == null) {
            c0pfpLIZLLL = this.LLILZIL.LIZLLL(i);
        }
        if (c0pfpLIZLLL != null) {
            c0pfpLIZLLL.setIsRecyclable(false);
        }
        if (c0pfpLIZLLL == null) {
            c0pfpLIZLLL = this.LL.onCreateViewHolder(viewGroup, i);
        }
        if (c0pfpLIZLLL != null) {
            try {
                View view = c0pfpLIZLLL.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c0pfpLIZLLL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0pfpLIZLLL.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0pfpLIZLLL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0pfpLIZLLL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0pfpLIZLLL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0pfpLIZLLL.getClass().getName();
        return c0pfpLIZLLL;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (i < LLLII() || i >= LLLII() + this.LL.getItemCount()) {
            return;
        }
        this.LL.onBindViewHolder(viewHolder, i - LLLII(), list);
    }
}
