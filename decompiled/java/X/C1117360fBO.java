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

/* JADX INFO: renamed from: X.0fBO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1117360fBO extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<?> LL;
    public final InterfaceC1117390fBR LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C1117360fBO() {
        this(Collections.emptyList(), new C1117400fBS());
    }

    public final C0J8P LLLFZ(RecyclerView.ViewHolder viewHolder) {
        return this.LLILLJJLI.LIZ(viewHolder.getItemViewType());
    }

    public void LLLII(List<?> list) {
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return this.LLILLJJLI.LIZ(getItemViewType(i)).LIZIZ(ListProtector.get(this.LL, i));
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LL, i);
        int iLIZLLL = this.LLILLJJLI.LIZLLL(obj.getClass());
        if (iLIZLLL != -1) {
            return iLIZLLL + this.LLILLJJLI.LJ(iLIZLLL).LIZ(obj);
        }
        final Class<?> cls = obj.getClass();
        throw new RuntimeException(cls) { // from class: X.089U
            {
                super("Do you have registered the binder for {className}.class in the adapter/pool?".replace("{className}", cls.getSimpleName()));
            }
        };
    }

    @Override // X.AbstractC21673619ry
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        LLLFZ(viewHolder).getClass();
        return false;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        LLLFZ(viewHolder).LJFF(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        LLLFZ(viewHolder).LJI(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        LLLFZ(viewHolder).LJII(viewHolder);
    }

    public C1117360fBO(List list, C1117400fBS c1117400fBS) {
        this.LL = list;
        this.LLILLJJLI = c1117400fBS;
    }

    public final <T> void LLLI(Class<? extends T> cls, C0J8P<T, ?> c0j8p) {
        this.LLILLJJLI.LIZJ(cls);
        this.LLILLJJLI.LIZIZ(cls, c0j8p, new InterfaceC1112620f3k<T>() { // from class: X.0fBT
            @Override // X.InterfaceC1112620f3k
            public final int LIZ(T t) {
                return 0;
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        throw new IllegalAccessError("You should not call this method. Call RecyclerView.Adapter#onBindViewHolder(holder, position, payloads) instead.");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        C0J8P<?, ?> c0j8pLIZ = this.LLILLJJLI.LIZ(i);
        c0j8pLIZ.LIZ = this;
        RecyclerView.ViewHolder viewHolderLJ = c0j8pLIZ.LJIIJ(layoutInflaterNe, viewGroup);
        if (viewHolderLJ != null) {
            try {
                View view = viewHolderLJ.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderLJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLJ.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLJ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLJ.getClass().getName();
        return viewHolderLJ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        this.LLILLJJLI.LIZ(viewHolder.getItemViewType()).LIZLLL(viewHolder, ListProtector.get(this.LL, i), list);
    }
}
