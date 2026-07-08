package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0sml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1640250sml extends AbstractC1640350smv {
    public final AbstractC21673619ry<RecyclerView.ViewHolder> LL;
    public final boolean LLILLJJLI = true;
    public boolean LLILLL;

    public abstract void LLLII(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder LLLIIIIL(ViewGroup viewGroup);

    public final int LLLI() {
        return (!(this.LLILLJJLI && this.LL.getItemCount() == 0) && this.LLILLL) ? 1 : 0;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.getItemCount() + LLLI();
    }

    public AbstractC1640250sml(AbstractC21673619ry abstractC21673619ry) {
        this.LL = abstractC21673619ry;
        abstractC21673619ry.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0smm
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZ.notifyDataSetChanged();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                AbstractC1640250sml abstractC1640250sml = this.LIZ;
                abstractC1640250sml.notifyItemRangeChanged(i + abstractC1640250sml.LLLI(), i2);
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                AbstractC1640250sml abstractC1640250sml = this.LIZ;
                abstractC1640250sml.notifyItemRangeInserted(i + abstractC1640250sml.LLLI(), i2);
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                AbstractC1640250sml abstractC1640250sml = this.LIZ;
                abstractC1640250sml.notifyItemMoved(i + abstractC1640250sml.LLLI(), i2 + this.LIZ.LLLI());
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                AbstractC1640250sml abstractC1640250sml = this.LIZ;
                abstractC1640250sml.notifyItemRangeRemoved(i + abstractC1640250sml.LLLI(), i2);
            }

            @Override // X.AbstractC471570IeR
            public final void LIZJ(int i, int i2, Object obj) {
                AbstractC1640250sml abstractC1640250sml = this.LIZ;
                abstractC1640250sml.notifyItemRangeChanged(i + abstractC1640250sml.LLLI(), i2, obj);
            }
        });
        this.LLILLL = true;
    }

    public final void LLLIILIL(boolean z) {
        if (this.LLILLL == z) {
            return;
        }
        if (this.LLILLJJLI && this.LL.getItemCount() == 0) {
            return;
        }
        this.LLILLL = z;
        if (z) {
            notifyItemInserted(0);
        } else {
            notifyItemRemoved(0);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LLILLL && i == 0) {
            return -2147483646;
        }
        return this.LL.getItemViewType(i - LLLI());
    }

    @Override // X.AbstractC1640350smv
    public final int LLLFZ(int i, GridLayoutManager gridLayoutManager) {
        if (getItemViewType(i) == -2147483646) {
            return gridLayoutManager.LLILLJJLI;
        }
        AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry = this.LL;
        if (abstractC21673619ry instanceof AbstractC1640350smv) {
            return ((AbstractC1640350smv) abstractC21673619ry).LLLFZ(i - LLLI(), gridLayoutManager);
        }
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == -2147483646) {
            LLLII(viewHolder);
        } else {
            this.LL.onBindViewHolder(viewHolder, i - LLLI());
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder;
        if (-2147483646 == i) {
            viewHolderOnCreateViewHolder = LLLIIIIL(viewGroup);
        } else {
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
        if (getItemViewType(i) == -2147483646) {
            onBindViewHolder(viewHolder, i);
        } else {
            this.LL.onBindViewHolder(viewHolder, i - LLLI(), list);
        }
    }
}
