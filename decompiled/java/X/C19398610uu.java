package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.10uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19398610uu extends AbstractC19399310v1<C19398710uv> {
    public List<C19398810uw> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC19399310v1, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C19398710uv c19398710uv = (C19398710uv) viewHolder;
        super.onBindViewHolder(c19398710uv, i);
        C19398810uw c19398810uw = (C19398810uw) ListProtector.get(this.LLILLJJLI, i);
        c19398710uv.LL.setText(c19398810uw.LIZ.getName());
        if (c19398810uw.LIZIZ) {
            C786410Ut5.LJLLLLLL(0, c19398710uv.LLILLJJLI);
            C786410Ut5.LJLLLLLL(0, c19398710uv.LLILLL);
            TextView textView = c19398710uv.LL;
            textView.setTextColor(C475630Ikz.LIZIZ(R.attr.ej, textView.getContext()));
            return;
        }
        C786410Ut5.LJLLLLLL(8, c19398710uv.LLILLJJLI);
        C786410Ut5.LJLLLLLL(8, c19398710uv.LLILLL);
        TextView textView2 = c19398710uv.LL;
        textView2.setTextColor(C475630Ikz.LIZIZ(R.attr.ee, textView2.getContext()));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19398710uv c19398710uv = new C19398710uv(C786410Ut5.Sd(R.layout.fej, C786410Ut5.ne(viewGroup.getContext()), null));
        try {
            View view = c19398710uv.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19398710uv.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19398710uv.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19398710uv.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19398710uv.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19398710uv.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19398710uv.class.getName();
        return c19398710uv;
    }
}
