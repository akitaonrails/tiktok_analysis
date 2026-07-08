package X;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: X.0IP0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IP0 extends AbstractC21673619ry<C0IP1> {
    public final LayoutInflater LL;
    public final List<C466140IPs> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C0IP0(Context context, List<C466140IPs> list) {
        this.LL = C1834150xpV.LIZJ(C786410Ut5.ne(context));
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (C466130IPr.LIZ((C466140IPs) obj) != null) {
                arrayList.add(obj);
            }
        }
        this.LLILLJJLI = new ArrayList(arrayList);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0IP1 c0ip1 = (C0IP1) viewHolder;
        C466140IPs c466140IPs = (C466140IPs) ListProtector.get(this.LLILLJJLI, i);
        c0ip1.LL.setText(DateFormat.getTimeFormat(c0ip1.itemView.getContext()).format(new Date(c466140IPs.LIZLLL)));
        Integer numLIZ = C466130IPr.LIZ(c466140IPs);
        if (numLIZ != null) {
            c0ip1.LLILLJJLI.setText(c0ip1.itemView.getContext().getString(numLIZ.intValue()));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0IP1 c0ip1 = new C0IP1(C786410Ut5.Td(this.LL, R.layout.h6_, viewGroup, false));
        try {
            View view = c0ip1.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ip1.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ip1.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0IP1.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ip1.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ip1.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0IP1.class.getName();
        return c0ip1;
    }
}
