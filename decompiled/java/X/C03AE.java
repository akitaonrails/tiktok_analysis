package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.03AE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03AE extends AbstractC21673619ry<C03AF> {
    public List<String> LL = C13BV.INSTANCE;
    public C03AH LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        C03AF c03af = (C03AF) viewHolder;
        final String str = (String) ListProtector.get(this.LL, i);
        c03af.LL.setText(str);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.03AG
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view) {
                C03AH c03ah = this.LLILZ.LLILLJJLI;
                if (c03ah != null) {
                    c03ah.LIZ(i, str);
                }
            }
        }, c03af.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dla, viewGroup, false);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        viewTd.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        C03AF c03af = new C03AF(viewTd);
        try {
            View view = c03af.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c03af.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c03af.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C03AF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c03af.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c03af.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C03AF.class.getName();
        return c03af;
    }
}
