package X;

import Y.ARunnableS125S0100000_25;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0smw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1640360smw extends AbstractC1640340smu implements InterfaceC1640430sn3<EnumC1641470soj> {
    public EnumC1641470soj LLILZ;
    public C1640370smx LLILZIL;

    public abstract void LLLI(RecyclerView.ViewHolder viewHolder, EnumC1641470soj enumC1641470soj);

    public abstract RecyclerView.ViewHolder LLLII(ViewGroup viewGroup);

    @Override // X.InterfaceC1640430sn3
    public final /* bridge */ /* synthetic */ Enum getState() {
        return this.LLILZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1640360smw(final AbstractC1640090smV abstractC1640090smV) {
        final boolean z = true;
        new AbstractC1640350smv(abstractC1640090smV, z) { // from class: X.0smu
            public final AbstractC21673619ry<RecyclerView.ViewHolder> LL;
            public final boolean LLILLJJLI;
            public final boolean LLILLL;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                int itemCount = this.LL.getItemCount();
                return (!(this.LLILLJJLI && itemCount == 0) && this.LLILLL) ? itemCount + 1 : itemCount;
            }

            @Override // X.AbstractC21673619ry
            public final int getItemViewType(int i) {
                if (i == this.LL.getItemCount() && this.LLILLL) {
                    return Integer.MIN_VALUE;
                }
                return this.LL.getItemViewType(i);
            }

            @Override // X.AbstractC1640350smv, X.AbstractC21673619ry
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                boolean z2;
                super.onViewAttachedToWindow(viewHolder);
                ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                if (layoutParams != null && (layoutParams instanceof C21681819tI)) {
                    C21681819tI c21681819tI = (C21681819tI) layoutParams;
                    if (getItemViewType(viewHolder.getLayoutPosition()) == Integer.MIN_VALUE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c21681819tI.LLILLJJLI = z2;
                }
            }

            {
                this.LL = abstractC1640090smV;
                this.LLILLJJLI = z;
                abstractC1640090smV.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0JEW
                    @Override // X.AbstractC471570IeR
                    public final void LIZ() {
                        this.notifyDataSetChanged();
                    }

                    @Override // X.AbstractC471570IeR
                    public final void LIZIZ(int i, int i2) {
                        this.notifyItemRangeChanged(i, i2);
                    }

                    @Override // X.AbstractC471570IeR
                    public final void LIZLLL(int i, int i2) {
                        this.notifyItemRangeInserted(i, i2);
                    }

                    @Override // X.AbstractC471570IeR
                    public final void LJ(int i, int i2) {
                        this.notifyItemMoved(i, i2);
                    }

                    @Override // X.AbstractC471570IeR
                    public final void LJFF(int i, int i2) {
                        this.notifyItemRangeRemoved(i, i2);
                    }

                    @Override // X.AbstractC471570IeR
                    public final void LIZJ(int i, int i2, Object obj) {
                        this.notifyItemRangeChanged(i, i2, obj);
                    }
                });
                this.LLILLL = true;
            }

            @Override // X.AbstractC1640350smv
            public final int LLLFZ(int i, GridLayoutManager gridLayoutManager) {
                if (getItemViewType(i) == Integer.MIN_VALUE) {
                    return gridLayoutManager.LLILLJJLI;
                }
                AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry = this.LL;
                if (abstractC21673619ry instanceof AbstractC1640350smv) {
                    return ((AbstractC1640350smv) abstractC21673619ry).LLLFZ(i, gridLayoutManager);
                }
                return 1;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (getItemViewType(i) == Integer.MIN_VALUE) {
                    AbstractC1640360smw abstractC1640360smw = (AbstractC1640360smw) this;
                    abstractC1640360smw.LLLI(viewHolder, abstractC1640360smw.LLILZ);
                    HandlerHook.viewPost(viewHolder.itemView, new ARunnableS125S0100000_25(abstractC1640360smw, 81));
                    return;
                }
                this.LL.onBindViewHolder(viewHolder, i);
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                RecyclerView.ViewHolder viewHolderOnCreateViewHolder;
                if (Integer.MIN_VALUE == i) {
                    viewHolderOnCreateViewHolder = ((AbstractC1640360smw) this).LLLII(viewGroup);
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
                if (getItemViewType(i) == Integer.MIN_VALUE) {
                    onBindViewHolder(viewHolder, i);
                } else {
                    this.LL.onBindViewHolder(viewHolder, i, list);
                }
            }
        };
        this.LLILZ = EnumC1641470soj.NONE;
    }

    @Override // X.InterfaceC1640430sn3
    public final void setState(Enum r2) {
        this.LLILZ = (EnumC1641470soj) r2;
        notifyItemChanged(getItemCount() - 1);
    }
}
