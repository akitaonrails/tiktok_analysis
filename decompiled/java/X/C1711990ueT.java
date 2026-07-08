package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.Region;
import com.zhiliaoapp.musically.R;
import irm.AkS63S0200000_26;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ueT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711990ueT extends AbstractC21673619ry<C1712000ueU> {
    public final Function1<Region, Unit> LL;
    public final List<C1712010ueV> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1711990ueT(Function1<? super Region, Unit> function1) {
        this.LL = function1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1711980ueS c1711980ueS;
        C1712010ueV c1712010ueV = (C1712010ueV) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        View view = viewHolder.itemView;
        if ((view instanceof C1711980ueS) && (c1711980ueS = (C1711980ueS) view) != null && c1712010ueV != null) {
            String str = c1712010ueV.LIZ;
            if (str != null && str.length() != 0) {
                C12ES.LJIILL(0, c1711980ueS.LL);
                c1711980ueS.LL.setText(c1712010ueV.LIZ);
                C12ES.LJIILL(0, c1711980ueS.LLILLJJLI);
            } else {
                C1709950ubB.LIZ(c1711980ueS.LL);
                C1709950ubB.LIZ(c1711980ueS.LLILLJJLI);
            }
            c1711980ueS.LLILLL.setText(c1712010ueV.LIZIZ.name);
            if (c1712010ueV.LIZJ) {
                C1709950ubB.LIZ(c1711980ueS.LLILZ);
            } else {
                C12ES.LJIILL(0, c1711980ueS.LLILZ);
            }
            C786410Ut5.I7(new AkS63S0200000_26(this, c1712010ueV, 6), c1711980ueS);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final C1711980ueS c1711980ueS = new C1711980ueS(viewGroup.getContext());
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c1711980ueS) { // from class: X.0ueU
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1712000ueU.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1712000ueU.class.getName();
        return viewHolder;
    }
}
