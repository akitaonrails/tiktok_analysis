package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0QlR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679750QlR extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C1A3S LL;
    public final HistoryRecordPageVM LLILLJJLI;
    public C09HH LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        ArrayList<C09HF> dailyModels;
        C09HH c09hh = this.LLILLL;
        if (c09hh == null || (dailyModels = c09hh.getDailyModels()) == null) {
            return 0;
        }
        return dailyModels.size() + 2;
    }

    public final void LLLFZ(C09HH c09hh) {
        Integer numValueOf;
        C09HH c09hh2 = this.LLILLL;
        this.LLILLL = c09hh;
        if (c09hh2 != null && !c09hh2.getDailyModels().isEmpty() && !c09hh.getDailyModels().isEmpty()) {
            int i = 0;
            int i2 = 0;
            while (i < c09hh2.getDailyModels().size() && i2 < c09hh.getDailyModels().size()) {
                C09HF c09hf = (C09HF) C13LP.LJJJLZIJ(i, c09hh2.getDailyModels());
                if (c09hf != null && (numValueOf = Integer.valueOf(c09hf.isSameAs((C09HF) C13LP.LJJJLZIJ(i2, c09hh.getDailyModels())))) != null) {
                    if (numValueOf.intValue() == 2) {
                        i2++;
                        notifyItemInserted(i2);
                    } else {
                        if (numValueOf.intValue() == 1) {
                            i2++;
                            notifyItemChanged(i2);
                        }
                        i++;
                    }
                }
                i2++;
                i++;
            }
            if (i2 < C1697810uHb.LJIIJ(c09hh.getDailyModels())) {
                notifyItemRangeInserted(i2 + 1, c09hh.getDailyModels().size() - i2);
            }
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    public C679750QlR(C1A3S c1a3s, HistoryRecordPageVM historyRecordPageVM) {
        this.LL = c1a3s;
        this.LLILLJJLI = historyRecordPageVM;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C09HH c09hh;
        ArrayList<C09HF> dailyModels;
        C09HF c09hf;
        ArrayList<C09HF> dailyModels2;
        C09HF c09hf2;
        C679730QlP c679730QlP;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    C09HH c09hh2 = this.LLILLL;
                    if (c09hh2 != null && (dailyModels2 = c09hh2.getDailyModels()) != null && (c09hf2 = (C09HF) ListProtector.get(dailyModels2, i - 1)) != null && (viewHolder instanceof C679730QlP) && (c679730QlP = (C679730QlP) viewHolder) != null) {
                        c679730QlP.I5(c09hf2);
                        return;
                    }
                    return;
                }
                if (!(viewHolder instanceof C679760QlS)) {
                    return;
                }
                C09HH c09hh3 = this.LLILLL;
                if (c09hh3 != null && !c09hh3.getHasMore()) {
                    C679760QlS c679760QlS = (C679760QlS) viewHolder;
                    C0H1U.LIZIZ(c679760QlS.LLILLJJLI);
                    C03DZ.LIZJ(c679760QlS.LLILLL);
                    return;
                } else {
                    C679760QlS c679760QlS2 = (C679760QlS) viewHolder;
                    C0H1U.LIZIZ(c679760QlS2.LLILLL);
                    C03DZ.LIZJ(c679760QlS2.LLILLJJLI);
                    c679760QlS2.LLILLJJLI.LIZJ();
                    return;
                }
            }
            if (!(viewHolder instanceof C679730QlP) || (c09hh = this.LLILLL) == null || (dailyModels = c09hh.getDailyModels()) == null || (c09hf = (C09HF) ListProtector.get(dailyModels, i - 1)) == null) {
                return;
            }
            ((C679730QlP) viewHolder).I5(c09hf);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c679730QlP;
        if (i != 0) {
            if (i == 1 || i != 2) {
                c679730QlP = new C679730QlP(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.br5, viewGroup, false), this.LLILLJJLI, this.LL);
            } else {
                c679730QlP = new C679760QlS(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.br4, viewGroup, false), this.LL);
            }
        } else {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.br6, viewGroup, false);
            c679730QlP = new RecyclerView.ViewHolder(viewTd) { // from class: X.0QlT
                public final View LL;

                {
                    super(viewTd);
                    this.LL = viewTd;
                }
            };
        }
        try {
            View view = c679730QlP.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c679730QlP.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c679730QlP.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c679730QlP.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c679730QlP.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c679730QlP.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c679730QlP.getClass().getName();
        return c679730QlP;
    }
}
