package X;

import Y.ACListenerS130S0200000_28;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Dgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345510Dgb extends AbstractC21673619ry<C345520Dgc> {
    public final Context LL;
    public final List<InterfaceC1910030znt> LLILLJJLI;
    public final Dialog LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C345520Dgc c345520Dgc = (C345520Dgc) viewHolder;
        InterfaceC1910030znt interfaceC1910030znt = (InterfaceC1910030znt) ListProtector.get(this.LLILLJJLI, i);
        c345520Dgc.LL.setText(interfaceC1910030znt.LIZJ());
        C786410Ut5.I7(new ACListenerS130S0200000_28(this, interfaceC1910030znt, 3), c345520Dgc.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.acn, viewGroup, false);
        C427690Gpr.LJ(viewTd, 0.0f);
        C345520Dgc c345520Dgc = new C345520Dgc(viewTd);
        try {
            View view = c345520Dgc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c345520Dgc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c345520Dgc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C345520Dgc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c345520Dgc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c345520Dgc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C345520Dgc.class.getName();
        return c345520Dgc;
    }

    public C345510Dgb(Context context, List<InterfaceC1910030znt> list, Dialog dialog) {
        this.LL = context;
        this.LLILLJJLI = list;
        this.LLILLL = dialog;
    }
}
