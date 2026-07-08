package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC438050HFr extends AbstractC21673619ry {
    public boolean mShowFooter = true;

    public abstract int getBasicItemCount();

    public int getBasicItemViewType(int i) {
        return 0;
    }

    public abstract void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    public abstract void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i);

    public abstract RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup);

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(this, viewGroup, i);
    }

    public void onShowFooterChanged(boolean z) {
    }

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        return this.mShowFooter ? getBasicItemCount() + 1 : getBasicItemCount();
    }

    public boolean isShowFooter() {
        return this.mShowFooter;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.mShowFooter && i == getBasicItemCount()) {
            return Integer.MIN_VALUE;
        }
        return getBasicItemViewType(i);
    }

    public void setShowFooter(boolean z) {
        if (z != this.mShowFooter) {
            this.mShowFooter = z;
            onShowFooterChanged(z);
        }
    }

    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        if (Integer.MIN_VALUE == i) {
            return onCreateFooterViewHolder(viewGroup);
        }
        return onCreateBasicViewHolder(viewGroup, i);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(viewHolder);
        } else {
            onBindBasicViewHolder(viewHolder, i);
        }
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder(AbstractC438050HFr abstractC438050HFr, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___ = abstractC438050HFr.com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___(viewGroup, i);
        if (viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___ != null) {
            try {
                View view = viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    return viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter__onCreateViewHolder$___twin___;
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_lancet_HookRecyclerView_onCreateViewHolder(AbstractC438050HFr abstractC438050HFr, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder = com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder(abstractC438050HFr, viewGroup, i);
        viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        return viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_onCreateViewHolder;
    }

    public static RecyclerView.ViewHolder com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_onCreateViewHolder(AbstractC438050HFr abstractC438050HFr, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_lancet_HookRecyclerView_onCreateViewHolder = com_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_lancet_HookRecyclerView_onCreateViewHolder(abstractC438050HFr, viewGroup, i);
        try {
            if (viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_lancet_HookRecyclerView_onCreateViewHolder.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_lancet_HookRecyclerView_onCreateViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_lancet_HookRecyclerView_onCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_lancet_HookRecyclerView_onCreateViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_lancet_HookRecyclerView_onCreateViewHolder.getClass().getName();
        return viewHolderCom_ss_android_ugc_aweme_common_adapter_RecyclerViewWithFooterAdapter_com_ss_android_lancet_HookRecyclerView_onCreateViewHolder;
    }
}
