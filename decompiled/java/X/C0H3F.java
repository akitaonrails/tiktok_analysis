package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0H3F, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H3F extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(405));
    public List<String> LLILLJJLI;
    public int LLILLL;

    public final List<C0H3H> getData() {
        return (List) this.LL.getValue();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return getData().size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C0H3G) {
            C0H3G c0h3g = (C0H3G) viewHolder;
            C0H3H c0h3h = (C0H3H) ListProtector.get(getData(), i);
            c0h3g.LL.setText(c0h3h.LIZ);
            if (c0h3h.LIZIZ) {
                c0h3g.LL.setBackgroundResource(R.drawable.dd7);
                return;
            }
            TextView textView = c0h3g.LL;
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(textView.getContext(), R.drawable.dd6);
            if (drawableLIZIZ != null) {
                drawableLIZIZ.setTint(C1383370m6R.LJFF(R.attr.zm));
            } else {
                drawableLIZIZ = null;
            }
            textView.setBackground(drawableLIZIZ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C0H3G.LLILLJJLI;
        C0H3G c0h3g = new C0H3G(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c40, null, false));
        try {
            View view = c0h3g.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h3g.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h3g.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H3G.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h3g.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h3g.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H3G.class.getName();
        return c0h3g;
    }
}
