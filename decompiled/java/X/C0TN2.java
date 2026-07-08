package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0TN2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TN2 extends AbstractC21673619ry<C0TN3> {
    public final Context LL;
    public List<C0TN4> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C0TN4> list = this.LLILLJJLI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C0TN2(C19EG c19eg) {
        this.LL = c19eg;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0TN4 c0tn4;
        C0TN3 c0tn3 = (C0TN3) viewHolder;
        List<C0TN4> list = this.LLILLJJLI;
        if (list != null && (c0tn4 = (C0TN4) ListProtector.get(list, i)) != null) {
            if (c0tn4.LIZJ) {
                c0tn3.LLILLJJLI.setIconRes(R.raw.icon_tick_circle_fill);
                c0tn3.LLILLJJLI.setTintColorRes(R.attr.a1v);
            } else {
                c0tn3.LLILLJJLI.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
                c0tn3.LLILLJJLI.setTintColorRes(R.attr.a1p);
            }
            c0tn3.LLILLL.setText(c0tn4.LIZLLL);
            c0tn3.LLILZ.setText(c0tn4.LJ);
            C786410Ut5.I7(new ACListenerS147S0100000_12(c0tn4, 363), c0tn3.LL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0TN3 c0tn3 = new C0TN3(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.zx, viewGroup, false));
        try {
            View view = c0tn3.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0tn3.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0tn3.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0TN3.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0tn3.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0tn3.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0TN3.class.getName();
        return c0tn3;
    }
}
