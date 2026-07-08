package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.10vI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19401010vI extends AbstractC21673619ry<C19401110vJ> implements InterfaceC19401310vL {
    public final List<C117V> LL;
    public final InterfaceC19401310vL LLILLJJLI;
    public final InterfaceC19401410vM LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.InterfaceC19401310vL
    public final void LIZ(int i, View view) {
        InterfaceC19401310vL interfaceC19401310vL = this.LLILLJJLI;
        if (interfaceC19401310vL != null) {
            interfaceC19401310vL.LIZ(i, view);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C19401110vJ c19401110vJ = (C19401110vJ) viewHolder;
        this.LLILLL.LIZIZ(i);
        C117V c117v = (C117V) ListProtector.get(this.LL, i);
        TuxTextView tuxTextView = c19401110vJ.LLILLJJLI;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("# ");
            sbLIZ.append(c117v.LIZ.challengeName);
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i2 = c117v.LJII;
        TuxTextView tuxTextView2 = c19401110vJ.LLILLJJLI;
        if (tuxTextView2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C1919207fS.LJIIJJI());
            c384050F3z.LIZIZ = Integer.valueOf(i2);
            tuxTextView2.setBackground(c384050F3z.LIZ(c19401110vJ.itemView.getContext()));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19401110vJ c19401110vJ = new C19401110vJ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.u5, viewGroup, false), this);
        try {
            View view = c19401110vJ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19401110vJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19401110vJ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19401110vJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19401110vJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19401110vJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19401110vJ.class.getName();
        return c19401110vJ;
    }

    public C19401010vI(List list, C194486117c c194486117c, C194487117d c194487117d) {
        this.LL = list;
        this.LLILLJJLI = c194486117c;
        this.LLILLL = c194487117d;
    }
}
