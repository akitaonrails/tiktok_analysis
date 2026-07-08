package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS612S0100000_33;
import wh6.AbS497S0200000_4;

/* JADX INFO: renamed from: X.0DT1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DT1 extends AbstractC21673619ry<C0DT2> {
    public final List<String> LL;
    public final Function1<String, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0DT1(List list, AwS612S0100000_33 awS612S0100000_33) {
        this.LL = list;
        this.LLILLJJLI = awS612S0100000_33;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0DT2 c0dt2 = (C0DT2) viewHolder;
        c0dt2.LL.setText((CharSequence) ListProtector.get(this.LL, i));
        C786410Ut5.I7(new AbS497S0200000_4(this, c0dt2, 2), c0dt2.itemView);
        if (i != 0) {
            C500260Jjc.LJLJJL((int) C497740JfY.LIZIZ(8.0f), c0dt2.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0DT2 c0dt2 = new C0DT2(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hx2, viewGroup, false));
        try {
            View view = c0dt2.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0dt2.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0dt2.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0DT2.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0dt2.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0dt2.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0DT2.class.getName();
        return c0dt2;
    }
}
