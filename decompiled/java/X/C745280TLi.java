package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.image.collage.model.CollageGroup;
import com.zhiliaoapp.musically.R;
import irm.AkS8S0201000_12;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0TLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745280TLi extends AbstractC21673619ry<C745290TLj> {
    public int LL;
    public final List<C745310TLl> LLILLJJLI;
    public InterfaceC745300TLk LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C745280TLi() {
        List list = (List) C304460Bwa.LIZJ.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = ((CollageGroup) it2.next()).imageCount;
            if (num != null) {
                arrayList.add(new C745310TLl(num.intValue()));
            }
        }
        this.LLILLJJLI = arrayList;
    }

    public final void LLLFZ(int i) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (((C745310TLl) it2.next()).LIZ == i) {
                if (i2 != -1) {
                    int i3 = this.LL;
                    if (i3 != i2) {
                        this.LL = i2;
                        notifyItemChanged(i3);
                        notifyItemChanged(this.LL);
                    }
                    InterfaceC745300TLk interfaceC745300TLk = this.LLILLL;
                    if (interfaceC745300TLk != null) {
                        interfaceC745300TLk.LIZ(i2, false);
                        return;
                    }
                    return;
                }
                return;
            }
            i2++;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C745290TLj c745290TLj = (C745290TLj) viewHolder;
        C745310TLl c745310TLl = (C745310TLl) ListProtector.get(this.LLILLJJLI, i);
        Resources resources = c745290TLj.itemView.getContext().getResources();
        int i3 = c745310TLl.LIZ;
        c745290TLj.LL.setText(resources.getQuantityString(2131755187, i3, String.valueOf(i3)));
        if (i == this.LL) {
            i2 = R.attr.a1h;
        } else {
            i2 = R.attr.a1k;
        }
        c745290TLj.LL.setTextColorRes(i2);
        C786410Ut5.I7(new AkS8S0201000_12(this, i, c745310TLl, 1), c745290TLj.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C745290TLj c745290TLj = new C745290TLj(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwg, viewGroup, false));
        try {
            View view = c745290TLj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c745290TLj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c745290TLj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C745290TLj.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c745290TLj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c745290TLj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C745290TLj.class.getName();
        return c745290TLj;
    }
}
