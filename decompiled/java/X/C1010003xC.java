package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.ProductInterlinkItemVO;
import com.zhiliaoapp.musically.R;
import g1c.AjS4S0201000_1;
import java.util.List;

/* JADX INFO: renamed from: X.03xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1010003xC extends AbstractC21673619ry<C1010103xD> {
    public final List<ProductInterlinkItemVO> LL;
    public final InterfaceC1010203xE LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C1010003xC(List<ProductInterlinkItemVO> list, InterfaceC1010203xE interfaceC1010203xE) {
        this.LL = list;
        this.LLILLJJLI = interfaceC1010203xE;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1010103xD c1010103xD = (C1010103xD) viewHolder;
        ProductInterlinkItemVO productInterlinkItemVO = (ProductInterlinkItemVO) ListProtector.get(this.LL, i);
        TextView textView = (TextView) c1010103xD.itemView.findViewById(R.id.ry7);
        View viewFindViewById = c1010103xD.itemView.findViewById(R.id.ry_);
        if (viewFindViewById != null) {
            C384050F3z c384050F3z = new C384050F3z();
            C958103op.LIZ.getClass();
            c384050F3z.LIZJ = Float.valueOf(C958103op.LJII);
            c384050F3z.LIZLLL = Integer.valueOf(C958103op.LJIIJ);
            c384050F3z.LJFF = Integer.valueOf(R.attr.a01);
            viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        }
        String str = productInterlinkItemVO.valueName;
        if (str != null && textView != null) {
            textView.setText(str);
        }
        C786410Ut5.I7(new AjS4S0201000_1(c1010103xD.LL, productInterlinkItemVO, i, 4), c1010103xD.itemView);
        this.LLILLJJLI.h4(c1010103xD.itemView, productInterlinkItemVO);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1010103xD c1010103xD = new C1010103xD(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b37, viewGroup, false));
        try {
            View view = c1010103xD.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1010103xD.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1010103xD.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1010103xD.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1010103xD.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1010103xD.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1010103xD.class.getName();
        return c1010103xD;
    }
}
