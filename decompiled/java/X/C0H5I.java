package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import irm.AkS5S1100000_6;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0H5I, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H5I extends AbstractC21673619ry<C0H5J> {
    public List<String> LL;
    public final Function1<String, Unit> LLILLJJLI;
    public final Function1<String, Unit> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0H5J c0h5j = (C0H5J) viewHolder;
        String str = (String) ListProtector.get(this.LL, i);
        c0h5j.LL.setText(str);
        C786410Ut5.I7(new AkS5S1100000_6(this, str, 1), c0h5j.itemView);
        C786410Ut5.I7(new AkS5S1100000_6(this, str, 2), c0h5j.LLILLJJLI);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0H5J c0h5j = new C0H5J(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c6t, viewGroup, false));
        try {
            View view = c0h5j.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h5j.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h5j.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H5J.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h5j.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h5j.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H5J.class.getName();
        return c0h5j;
    }

    public C0H5I(List list, AwS585S0100000_6 awS585S0100000_6, AwS585S0100000_6 awS585S0100000_62) {
        this.LL = list;
        this.LLILLJJLI = awS585S0100000_6;
        this.LLILLL = awS585S0100000_62;
    }
}
