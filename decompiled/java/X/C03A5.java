package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03A5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03A5 extends AbstractC21673619ry<C03A9> {
    public final List<Pair<String, Object>> LL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object second;
        String str;
        C03A9 c03a9 = (C03A9) viewHolder;
        C16F5 c16f5 = c03a9.LLILLL;
        if (c16f5 != null) {
            Pair pair = (Pair) C13LP.LJJJLZIJ(i, this.LL);
            if (pair == null || (str = (String) pair.getFirst()) == null) {
                str = "";
            }
            c16f5.setText(str);
        }
        Pair pair2 = (Pair) C13LP.LJJJLZIJ(i, this.LL);
        if (pair2 != null) {
            second = pair2.getSecond();
        } else {
            second = null;
        }
        c03a9.LLILLJJLI = second;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C03A9 c03a9 = new C03A9(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gwa, viewGroup, false));
        try {
            View view = c03a9.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c03a9.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c03a9.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C03A9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c03a9.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c03a9.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C03A9.class.getName();
        return c03a9;
    }
}
