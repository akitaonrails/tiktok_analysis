package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808500xA8 extends AbstractC21673619ry<C1808510xA9> {
    public final InterfaceC497601wk LL;
    public final AiSummaryViewModel LLILLJJLI;
    public final Function2<C1812850xH9, ViewGroup, Unit> LLILLL;
    public final List<C1812850xH9> LLILZ = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        final C1808510xA9 c1808510xA9 = (C1808510xA9) viewHolder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindViewHolder, position: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("AiSummary", C2188811AlT.LIZIZ(sbLIZ));
        final C1812850xH9 c1812850xH9 = (C1812850xH9) ListProtector.get(this.LLILZ, i);
        c1808510xA9.LL.LIZ(this.LL, this.LLILLJJLI, c1812850xH9, true, i, false);
        C786410Ut5.U8(c1808510xA9.LLILLJJLI, new View.OnClickListener() { // from class: X.0xG8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LL.LLILLL.invoke(c1812850xH9, c1808510xA9.LL.LJ.getDslBoardContainer());
                this.LL.LLILLJJLI.vQ2(new C1812240xGA(new C1812750xGz(c1812850xH9, "click", "display", "design_2", "big", i)));
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C20441214yg.LIZIZ("AiSummary", "onCreateViewHolder");
        C1808510xA9 c1808510xA9 = new C1808510xA9(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fy1, viewGroup, false));
        try {
            View view = c1808510xA9.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1808510xA9.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1808510xA9.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1808510xA9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1808510xA9.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1808510xA9.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1808510xA9.class.getName();
        return c1808510xA9;
    }

    public C1808500xA8(LifecycleCoroutineScope lifecycleCoroutineScope, AiSummaryViewModel aiSummaryViewModel, C1812540xGe c1812540xGe) {
        this.LL = lifecycleCoroutineScope;
        this.LLILLJJLI = aiSummaryViewModel;
        this.LLILLL = c1812540xGe;
    }
}
