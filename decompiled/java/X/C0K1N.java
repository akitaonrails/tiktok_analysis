package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: renamed from: X.0K1N, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K1N extends AbstractC21673619ry<C0K1R> {
    public final List<C0K1M> LL;
    public final Function2<View, C0K1M, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0K1N(List list, AwS621S0100000_7 awS621S0100000_7) {
        this.LL = list;
        this.LLILLJJLI = awS621S0100000_7;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0K1R c0k1r = (C0K1R) viewHolder;
        C0K1M c0k1m = (C0K1M) ListProtector.get(this.LL, i);
        View view = c0k1r.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) C511520K4g.LIZ(c0k1m.LIZIZ);
            layoutParams.height = (int) C511520K4g.LIZ(c0k1m.LIZJ);
            C786410Ut5.W5(view, layoutParams);
            boolean z = false;
            C786410Ut5.LJLLLLLL(0, c0k1r.LLILLJJLI);
            View view2 = c0k1r.itemView;
            if (this.LLILLJJLI != null) {
                z = true;
            }
            view2.setClickable(z);
            C786410Ut5.I7(null, c0k1r.itemView);
            if (this.LLILLJJLI != null) {
                C786410Ut5.I7(new ACListenerS111S0200000_7(this, c0k1m, 20), c0k1r.itemView);
            }
            C511420K3w.LJIIJ.getClass();
            C511420K3w c511420K3w = new C511420K3w();
            c511420K3w.LIZ = c0k1m.LIZ.cover;
            c511420K3w.LIZ(c0k1r.LL);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0K1R c0k1r = new C0K1R(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fgs, viewGroup, false));
        try {
            View view = c0k1r.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0k1r.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0k1r.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0K1R.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0k1r.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0k1r.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0K1R.class.getName();
        return c0k1r;
    }
}
