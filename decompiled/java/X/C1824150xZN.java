package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xZN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824150xZN extends AbstractC21673619ry<C1824160xZO> {
    public final List<C1783010wV1> LL;
    public final Function1<C1783010wV1, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C1824150xZN(List list, C1824120xZK c1824120xZK) {
        this.LL = list;
        this.LLILLJJLI = c1824120xZK;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C1824160xZO) viewHolder, i, new ArrayList());
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1824160xZO c1824160xZO = new C1824160xZO((AbstractC1824180xZQ) C1842040y2E.LIZ(C786410Ut5.ne(viewGroup.getContext()), R.layout.gtg, viewGroup, false, null));
        try {
            View view = c1824160xZO.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1824160xZO.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1824160xZO.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1824160xZO.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1824160xZO.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1824160xZO.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1824160xZO.class.getName();
        return c1824160xZO;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLFZ, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(C1824160xZO c1824160xZO, int i, List<Object> list) {
        if (list.contains("PAYLOAD_SELECT")) {
            c1824160xZO.itemView.setSelected(((C1783010wV1) ListProtector.get(this.LL, i)).LJ);
            c1824160xZO.I5((C1783010wV1) ListProtector.get(this.LL, i));
            return;
        }
        final C1783010wV1 c1783010wV1 = (C1783010wV1) ListProtector.get(this.LL, i);
        c1783010wV1.LJFF = i;
        c1824160xZO.itemView.setSelected(c1783010wV1.LJ);
        C0TGC.LIZIZ(c1824160xZO.LL.LLJJJIL, c1783010wV1.LIZ);
        c1824160xZO.LL.LLJJJJJIL.setText(c1783010wV1.LIZIZ);
        c1824160xZO.I5(c1783010wV1);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xZP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LL.LLILLJJLI.invoke(c1783010wV1);
            }
        }, c1824160xZO.itemView);
    }
}
