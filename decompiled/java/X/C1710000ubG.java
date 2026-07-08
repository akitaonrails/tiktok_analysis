package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierFragment;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0ubG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710000ubG extends AbstractC21673619ry<C1710020ubI> {
    public final SubCashierEnterParams LL;
    public final SubCashierFragment LLILLJJLI;
    public final SubCashierViewModel LLILLL;
    public final List<C1710030ubJ> LLILZ = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1709880ub4 c1709880ub4;
        C1710030ubJ c1710030ubJ = (C1710030ubJ) ListProtector.get(this.LLILZ, i);
        View view = viewHolder.itemView;
        if ((view instanceof C1709880ub4) && (c1709880ub4 = (C1709880ub4) view) != null) {
            c1709880ub4.LJ(this.LL.LIZIZ, this.LLILLJJLI, new C1709690ual(null, null, new AwS605S0100000_26(this, 794), new C1710010ubH(this.LLILLL), null, 51), null, (C1709620uae) this.LLILLL.LLILLL.getValue(), c1710030ubJ.LIZ, i, true, EnumC994640bzS.NORMAL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final C1709880ub4 c1709880ub4 = new C1709880ub4(viewGroup.getContext());
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c1709880ub4) { // from class: X.0ubI
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
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
                    stringBuffer.append(C1710020ubI.class.getName());
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
        C20612085q.LIZ = C1710020ubI.class.getName();
        return viewHolder;
    }

    public C1710000ubG(SubCashierEnterParams subCashierEnterParams, SubCashierFragment subCashierFragment, SubCashierViewModel subCashierViewModel) {
        this.LL = subCashierEnterParams;
        this.LLILLJJLI = subCashierFragment;
        this.LLILLL = subCashierViewModel;
    }
}
