package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierFragment;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0uay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709820uay extends AbstractC21673619ry<C1709850ub1> {
    public final CashierViewModel LL;
    public final CashierFragment LLILLJJLI;
    public final List<Object> LLILLL = new ArrayList();
    public C1709880ub4 LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILLL);
        if (objLJJJLZIJ instanceof C1709330uaB) {
            if (((C1709330uaB) objLJJJLZIJ).LIZIZ.LJIJ()) {
                return 4;
            }
            return 1;
        }
        if (objLJJJLZIJ instanceof C1709870ub3) {
            return 2;
        }
        if (objLJJJLZIJ instanceof C1709300ua8) {
            return 3;
        }
        return -1;
    }

    public C1709820uay(CashierViewModel cashierViewModel, CashierFragment cashierFragment) {
        this.LL = cashierViewModel;
        this.LLILLJJLI = cashierFragment;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C06MO c06mo;
        C1710300ubk c1710300ubk;
        C1709880ub4 c1709880ub4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart((int) C1722120uuo.LIZIZ(16.0f));
            marginLayoutParams.setMarginEnd((int) C1722120uuo.LIZIZ(16.0f));
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILLL);
        if (objLJJJLZIJ instanceof C1709330uaB) {
            View view = viewHolder.itemView;
            if ((view instanceof C1709880ub4) && (c1709880ub4 = (C1709880ub4) view) != null) {
                C1709330uaB c1709330uaB = (C1709330uaB) objLJJJLZIJ;
                c1709880ub4.LJ(this.LL.LL, this.LLILLJJLI, new C1709690ual(new AwS461S0200000_26(this, c1709880ub4, 13), null, new AwS605S0100000_26(this, 674), new AwS605S0100000_26(this, 675), null, 50), new C1709920ub8(new C1709810uax(this.LL), new AwS605S0100000_26(this, 673), new C1709370uaF(this.LL), new C1709360uaE(this.LL), new C1709350uaD(this.LL)), (C1709620uae) this.LL.LLJIJIL.getValue(), c1709330uaB.LIZIZ, c1709330uaB.LIZLLL, true, EnumC994640bzS.NORMAL);
                if (getItemViewType(i) == 4) {
                    this.LLILZ = c1709880ub4;
                    return;
                }
                return;
            }
            return;
        }
        if (objLJJJLZIJ instanceof C1709870ub3) {
            View view2 = viewHolder.itemView;
            if (!(view2 instanceof C1710190ubZ) || (c1710300ubk = (C1710300ubk) view2) == null) {
                return;
            }
            objLJJJLZIJ.getClass();
            c1710300ubk.LIZ(null);
            return;
        }
        if (!(objLJJJLZIJ instanceof C1709300ua8)) {
            return;
        }
        View view3 = viewHolder.itemView;
        if (!(view3 instanceof C06MO) || (c06mo = (C06MO) view3) == null) {
            return;
        }
        C1709300ua8 c1709300ua8 = (C1709300ua8) objLJJJLZIJ;
        c06mo.LIZ(c1709300ua8.LIZ, c1709300ua8.LIZIZ);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        final View view = new View(viewGroup.getContext());
                        viewHolder = new RecyclerView.ViewHolder(view) { // from class: X.0ub1
                        };
                    } else {
                        final C1709880ub4 c1709880ub4 = new C1709880ub4(viewGroup.getContext());
                        viewHolder = new RecyclerView.ViewHolder(c1709880ub4) { // from class: X.0ub1
                        };
                    }
                } else {
                    final C06MO c06mo = new C06MO(viewGroup.getContext());
                    viewHolder = new RecyclerView.ViewHolder(c06mo) { // from class: X.0ub1
                    };
                }
            } else {
                final C1710190ubZ c1710190ubZ = new C1710190ubZ(viewGroup.getContext(), null, 6);
                viewHolder = new RecyclerView.ViewHolder(c1710190ubZ) { // from class: X.0ub1
                };
            }
        } else {
            final C1709880ub4 c1709880ub42 = new C1709880ub4(viewGroup.getContext());
            viewHolder = new RecyclerView.ViewHolder(c1709880ub42) { // from class: X.0ub1
            };
        }
        try {
            View view2 = viewHolder.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1709850ub1.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1709850ub1.class.getName();
        return viewHolder;
    }
}
