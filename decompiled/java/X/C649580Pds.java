package X;

import android.view.View;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Pds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649580Pds extends LynxViewClient {
    public final /* synthetic */ C1537480q70 LL;
    public final /* synthetic */ C647810Pb1 LLILLJJLI;
    public final /* synthetic */ InterfaceC1541990qEH LLILLL;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ() {
        C1310660kDA c1310660kDA;
        C1537810q7X c1537810q7XLIZLLL = C1537540q76.LIZLLL(this.LL);
        C647810Pb1 c647810Pb1 = this.LLILLJJLI;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILLL;
        C1537480q70 c1537480q70 = this.LL;
        if (c647810Pb1.LL.LJJI > 0) {
            View viewE1 = interfaceC1541990qEH != null ? interfaceC1541990qEH.e1() : null;
            if (!(viewE1 instanceof LynxView) || (c1310660kDA = (C1310660kDA) viewE1) == null) {
                return;
            }
            String strLJ = C649470Pdh.LJ(c1537480q70.LJIJI());
            c1537810q7XLIZLLL.LJJI.put("createRVViewStart", Long.valueOf(c647810Pb1.LL.LJJI));
            c1537810q7XLIZLLL.LJJI.put("lynxDrawEnd", Long.valueOf(c1310660kDA.getMeaningfulPaintTiming()));
            Long l = (Long) ((LinkedHashMap) c1537810q7XLIZLLL.LJJI).get("lynxDrawEnd");
            long jLongValue = l != null ? l.longValue() : 0L;
            Long l2 = (Long) ((LinkedHashMap) c1537810q7XLIZLLL.LJJI).get("createRVViewStart");
            long jLongValue2 = jLongValue - (l2 != null ? l2.longValue() : 0L);
            Long l3 = c1537810q7XLIZLLL.LJJ;
            long jLongValue3 = l3 != null ? l3.longValue() : 0L;
            Long l4 = (Long) ((LinkedHashMap) c1537810q7XLIZLLL.LJJI).get("createRVViewStart");
            long jLongValue4 = jLongValue3 - (l4 != null ? l4.longValue() : 0L);
            long jLIZ = C649590Pdt.LIZ(c1537810q7XLIZLLL);
            long jLIZ2 = C649590Pdt.LIZ(c1537810q7XLIZLLL);
            Long l5 = c1537810q7XLIZLLL.LIZJ;
            long jLongValue5 = l5 != null ? l5.longValue() : 0L;
            Long l6 = c1537810q7XLIZLLL.LIZIZ;
            long jLongValue6 = jLongValue5 - (l6 != null ? l6.longValue() : 0L);
            Long l7 = c1537810q7XLIZLLL.LJJ;
            long jLongValue7 = l7 != null ? l7.longValue() : 0L;
            Long l8 = c1537810q7XLIZLLL.LJIL;
            C649590Pdt.LIZJ(true, jLongValue2, jLongValue4, jLIZ, jLIZ2, jLongValue6 + (jLongValue7 - (l8 != null ? l8.longValue() : 0L)), strLJ);
            c647810Pb1.LL.LJJI = 0L;
        }
    }

    public C649580Pds(InterfaceC1541990qEH interfaceC1541990qEH, C1537480q70 c1537480q70, C647810Pb1 c647810Pb1) {
        this.LL = c1537480q70;
        this.LLILLJJLI = c647810Pb1;
        this.LLILLL = interfaceC1541990qEH;
    }
}
