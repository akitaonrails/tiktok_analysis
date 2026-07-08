package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0fBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1117370fBP extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<?> LL;
    public final List<?> LLILLJJLI;
    public final C1117360fBO LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.getItemCount();
    }

    public C1117370fBP() {
        List<?> listEmptyList = Collections.emptyList();
        C1117400fBS c1117400fBS = new C1117400fBS();
        this.LL = listEmptyList;
        this.LLILLJJLI = listEmptyList;
        this.LLILLL = new C1117360fBO(listEmptyList, c1117400fBS);
    }

    public final void LLLI(List<?> list) {
        this.LL = list;
        this.LLILLL.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return this.LLILLL.getItemId(i);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return this.LLILLL.getItemViewType(i);
    }

    @Override // X.AbstractC21673619ry
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        this.LLILLL.LLLFZ(viewHolder).getClass();
        return false;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.LLILLL.LLLFZ(viewHolder).LJFF(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.LLILLL.LLLFZ(viewHolder).LJI(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.LLILLL.LLLFZ(viewHolder).LJII(viewHolder);
    }

    public final <T> void LLLFZ(Class<? extends T> cls, AbstractC485930J3v<T, ?> abstractC485930J3v) {
        this.LLILLL.LLLI(cls, abstractC485930J3v);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.LLILLL.onBindViewHolder(viewHolder, i);
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (this.LLILLL.LLILLJJLI.LIZ(i) instanceof AbstractC485930J3v) {
            C0J8P<?, ?> c0j8pLIZ = this.LLILLL.LLILLJJLI.LIZ(i);
            c0j8pLIZ.getClass();
            viewHolderOnCreateViewHolder = c0j8pLIZ.LJIIJ(layoutInflaterNe, viewGroup);
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

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (this.LLILLL.LLILLJJLI.LIZ(viewHolder.getItemViewType()) instanceof AbstractC485930J3v) {
            this.LLILLL.LLILLJJLI.LIZ(viewHolder.getItemViewType()).LIZLLL(viewHolder, ListProtector.get(this.LLILLL.LL, i), list);
        } else {
            this.LLILLL.onBindViewHolder(viewHolder, i, list);
        }
    }
}
