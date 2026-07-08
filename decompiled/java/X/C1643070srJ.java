package X;

import Y.ACListenerS50S0201000_25;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0srJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643070srJ extends AbstractC21673619ry<C1643060srI> {
    public final InterfaceC1643190srV LL;
    public final List<C1643080srK> LLILLJJLI;
    public final C1643020srE LLILLL;
    public final Function1<C1643220srY, Unit> LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1643060srI c1643060srI = (C1643060srI) viewHolder;
        C1643080srK c1643080srK = (C1643080srK) ListProtector.get(this.LLILLJJLI, i);
        c1643060srI.LLILLJJLI.setText(c1643080srK.LIZIZ);
        RecyclerView recyclerView = c1643060srI.LL;
        recyclerView.setLayoutManager(this.LL.Ci(recyclerView.getContext()));
        recyclerView.setAdapter(new C1643290srf(i, c1643080srK.LIZ, c1643080srK.LJ, c1643080srK.LIZLLL, this.LLILZ));
        C1643020srE c1643020srE = this.LLILLL;
        if (c1643020srE != null) {
            recyclerView.scrollToPosition(c1643020srE.LIZJ);
        }
        TuxTextView tuxTextView = c1643060srI.LLILLL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS50S0201000_25(i, this, c1643080srK, 0));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0WYJ.LJIILL(viewGroup.getContext());
        C1643060srI c1643060srI = new C1643060srI(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.du6, viewGroup, false));
        try {
            View view = c1643060srI.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1643060srI.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1643060srI.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1643060srI.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1643060srI.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1643060srI.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1643060srI.class.getName();
        return c1643060srI;
    }

    public C1643070srJ(InterfaceC1643190srV interfaceC1643190srV, List list, C1643020srE c1643020srE, AwS604S0100000_25 awS604S0100000_25) {
        this.LL = interfaceC1643190srV;
        this.LLILLJJLI = list;
        this.LLILLL = c1643020srE;
        this.LLILZ = awS604S0100000_25;
    }
}
