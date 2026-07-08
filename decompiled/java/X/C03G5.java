package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.03G5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03G5 extends AbstractC21673619ry<C424760Gl8> {
    public final /* synthetic */ C424810GlD LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        int size;
        C424810GlD c424810GlD = this.LL;
        synchronized (c424810GlD) {
            try {
                List<String> list = c424810GlD.LIZLLL;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return size;
    }

    public C03G5(C424810GlD c424810GlD) {
        this.LL = c424810GlD;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        boolean z;
        C424760Gl8 c424760Gl8 = (C424760Gl8) viewHolder;
        C424810GlD c424810GlD = this.LL;
        synchronized (c424810GlD) {
            try {
                List<String> list = c424810GlD.LIZLLL;
                if (list != null && (str = (String) C13LP.LJJJLZIJ(i, list)) != null) {
                    if (c424810GlD.LJI == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c424760Gl8.I5(str, z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (i == 0) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.yy, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.yn, viewGroup, false);
        }
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                C426750GoL.LJIIJ(marginLayoutParams, viewTd.getContext(), Integer.valueOf(marginLayoutParams.getMarginStart()), 0, Integer.valueOf(marginLayoutParams.getMarginEnd()), Integer.valueOf(marginLayoutParams.bottomMargin), 32);
            }
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.W5(viewTd, marginLayoutParams);
        C424760Gl8 c424760Gl8 = new C424760Gl8(this.LL, viewTd);
        try {
            View view = c424760Gl8.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c424760Gl8.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c424760Gl8.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C424760Gl8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c424760Gl8.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c424760Gl8.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C424760Gl8.class.getName();
        return c424760Gl8;
    }
}
