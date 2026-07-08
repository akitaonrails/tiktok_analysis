package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C971300bNo extends C2217421BqW implements Function1<Integer, Unit> {
    public C971300bNo(Object obj) {
        super(1, obj, DialogC971200bNe.class, "onColorItemClick", "onColorItemClick(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        C971410bNz c971410bNz;
        List<?> list;
        List<?> list2;
        int iIntValue = num.intValue();
        DialogC971200bNe dialogC971200bNe = (DialogC971200bNe) this.receiver;
        C1420790n4n c1420790n4n = dialogC971200bNe.LLJZIJLIL;
        if (c1420790n4n != null) {
            if (iIntValue < 0) {
                int i = C1420790n4n.LLILZLL;
            } else {
                C1440440naU c1440440naU = c1420790n4n.LLILLL;
                c1440440naU.LJIILL = 0.25f;
                c1440440naU.LIZ = iIntValue;
                c1420790n4n.LL.startSmoothScroll(c1440440naU);
            }
        }
        C1117360fBO c1117360fBO = dialogC971200bNe.LLL;
        if (c1117360fBO != null && (list2 = c1117360fBO.LL) != null) {
            for (Object obj : list2) {
                if (obj instanceof C971410bNz) {
                    ((C971410bNz) obj).LIZIZ = false;
                }
            }
        }
        C1117360fBO c1117360fBO2 = dialogC971200bNe.LLL;
        Object objLJJJLZIJ = null;
        if (c1117360fBO2 != null && (list = c1117360fBO2.LL) != null) {
            objLJJJLZIJ = C13LP.LJJJLZIJ(iIntValue, list);
        }
        if ((objLJJJLZIJ instanceof C971410bNz) && (c971410bNz = (C971410bNz) objLJJJLZIJ) != null) {
            c971410bNz.LIZIZ = true;
            C1117360fBO c1117360fBO3 = dialogC971200bNe.LLL;
            if (c1117360fBO3 != null) {
                c1117360fBO3.notifyDataSetChanged();
            }
            C971330bNr c971330bNr = dialogC971200bNe.LLLIIII;
            if (c971330bNr != null) {
                C971360bNu c971360bNu = c971330bNr.LIZJ;
                if (c971360bNu == null || c971360bNu.LIZIZ != c971410bNz.LIZ) {
                    C971360bNu c971360bNu2 = c971330bNr.LIZJ;
                    if (c971360bNu2 != null) {
                        c971360bNu2.LIZIZ = c971410bNz.LIZ;
                    }
                    dialogC971200bNe.LJLJLJ(EnumC971100bNU.TEXT_COLOR);
                }
            } else {
                dialogC971200bNe.LJLJLJ(EnumC971100bNU.TEXT_COLOR);
            }
        }
        return Unit.LIZ;
    }
}
