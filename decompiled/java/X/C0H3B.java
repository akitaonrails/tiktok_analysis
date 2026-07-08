package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0H3B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H3B extends AbstractC21673619ry<C0H3C> {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final List<C0H3D> LLILZ = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0H3C c0h3c = (C0H3C) viewHolder;
        C0H3D c0h3d = (C0H3D) ListProtector.get(this.LLILZ, i);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c0h3c.LL.getLayoutParams();
        int i2 = c0h3c.LLILLJJLI;
        layoutParams.height = i2;
        layoutParams.width = i2;
        C786410Ut5.c6(c0h3c.LL, layoutParams);
        c0h3c.LL.setSelected(c0h3d.LIZ);
        c0h3c.LL.setImageResource(c0h3d.LIZIZ);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0H3C c0h3c = new C0H3C(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3m, viewGroup, false));
        try {
            View view = c0h3c.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h3c.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h3c.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H3C.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h3c.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h3c.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H3C.class.getName();
        return c0h3c;
    }
}
