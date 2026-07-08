package X;

import Y.ATListenerS336S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0JDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488430JDl extends AbstractC21673619ry<C488440JDm> {
    public List<InterfaceC489200JGk> LL = new ArrayList();
    public C21688219uK LLILLJJLI;
    public List<Long> LLILLL;

    public final List<Long> LLLFZ() {
        List<InterfaceC489200JGk> list = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<InterfaceC489200JGk> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ(true)));
        }
        return arrayList;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C488440JDm c488440JDm = (C488440JDm) viewHolder;
        InterfaceC489200JGk interfaceC489200JGk = (InterfaceC489200JGk) ListProtector.get(this.LL, i);
        c488440JDm.LL.setText(interfaceC489200JGk.LJIILIIL());
        c488440JDm.LLILLJJLI.setText(C488450JDn.LIZ(interfaceC489200JGk));
        c488440JDm.LLILLL.setOnTouchListener(new ATListenerS336S0200000_7(this, c488440JDm, 0));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C488440JDm c488440JDm = new C488440JDm(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dfr, viewGroup, false));
        try {
            View view = c488440JDm.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c488440JDm.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c488440JDm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C488440JDm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c488440JDm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c488440JDm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C488440JDm.class.getName();
        return c488440JDm;
    }
}
