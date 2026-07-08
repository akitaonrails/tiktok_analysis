package X;

import Y.ACListenerS52S0101000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0TUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747550TUb extends AbstractC21673619ry<C747560TUc> {
    public final Context LL;
    public final InterfaceC747570TUd LLILLJJLI;
    public ArrayList<C747580TUe> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        ArrayList<C747580TUe> arrayList = this.LLILLL;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public C747550TUb(Context context, InterfaceC747570TUd interfaceC747570TUd) {
        this.LL = context;
        this.LLILLJJLI = interfaceC747570TUd;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C747560TUc c747560TUc = (C747560TUc) viewHolder;
        if (getItemCount() != 0) {
            C747580TUe c747580TUe = (C747580TUe) ListProtector.get(this.LLILLL, i);
            c747560TUc.LL.setText(c747580TUe.LIZIZ.LIZJ());
            if (c747580TUe.LIZ) {
                C786410Ut5.LJZI(0, c747560TUc.LLILLJJLI);
                c747560TUc.LLILLJJLI.setImageResource(R.drawable.bzs);
            } else {
                C786410Ut5.LJZI(8, c747560TUc.LLILLJJLI);
            }
            C786410Ut5.I7(new ACListenerS52S0101000_12(this, i, 12), c747560TUc.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C747560TUc c747560TUc = new C747560TUc(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.cwi, viewGroup, false));
        try {
            View view = c747560TUc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c747560TUc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c747560TUc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C747560TUc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c747560TUc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c747560TUc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C747560TUc.class.getName();
        return c747560TUc;
    }
}
