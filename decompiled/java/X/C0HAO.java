package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.PinCardRefactorSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0HAO, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HAO extends AnonymousClass1828<C18L9> {
    public C0HAO(C18L9 c18l9) {
        super(c18l9);
    }

    public final void LJIIL(C0HAQ c0haq) {
        String str;
        boolean z = false;
        if (!PinCardRefactorSettings.LIZ().sellingPointEnable) {
            LJIIIZ(false);
            return;
        }
        this.LJI = true;
        ((LinkedHashMap) this.LJFF).clear();
        this.LIZLLL.clear();
        C786410Ut5.LJJJJI((ViewGroup) this.LIZ);
        int i = c0haq.LIZIZ;
        if (i > 0) {
            ((C18L9) this.LIZ).setMaxTagCount(i);
        }
        for (SellingItem sellingItem : c0haq.LIZ) {
            if (!AnonymousClass1828.LJII.contains(Integer.valueOf(sellingItem.sellingItemType)) && (str = sellingItem.showText) != null) {
                this.LIZLLL.add(sellingItem);
                int i2 = sellingItem.sellingItemType;
                if (i2 != 3) {
                    if (i2 != 7) {
                        LJIIJ(C0HAH.LIZ(this.LIZJ, str, this.LJ, sellingItem.icon));
                    } else {
                        LJIIJ(C0HAH.LIZIZ(this.LIZJ, str, this.LJ));
                    }
                } else {
                    String strLIZIZ = sellingItem.optShowText;
                    if (strLIZIZ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(' ');
                        sbLIZ.append(this.LIZJ.getResources().getString(2131832822));
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    LJIIJ(C0HAH.LIZ(this.LIZJ, strLIZIZ, this.LJ, sellingItem.icon));
                }
            }
        }
        if (((ViewGroup) this.LIZ).getChildCount() > 0) {
            z = true;
        }
        LJIIIZ(z);
    }

    public final void LJIILIIL(C0HAI c0hai) {
        this.LJ = c0hai;
        if (c0hai.LJIIJ()) {
            C18L9 c18l9 = (C18L9) this.LIZ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            c18l9.LLIZ = iLIZIZ;
            c18l9.LLILZLL = iLIZIZ2;
            C18L9 c18l92 = (C18L9) this.LIZ;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1j);
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(1));
            c18l92.LIZ(c384050F3z.LIZ(this.LIZJ), 1);
            return;
        }
        if (c0hai.LJIIIIZZ()) {
            C18L9 c18l93 = (C18L9) this.LIZ;
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
            c18l93.LLIZ = iLIZIZ3;
            c18l93.LLILZLL = iLIZIZ4;
            C18L9 c18l94 = (C18L9) this.LIZ;
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.e6);
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c18l94.LIZ(c384050F3z2.LIZ(this.LIZJ), 0);
            return;
        }
        C18L9 c18l95 = (C18L9) this.LIZ;
        c18l95.LLIZ = 0;
        c18l95.LLILZLL = 0;
        c18l95.LIZ(null, 0);
        ((C18L9) this.LIZ).setChildHorizontalMargin(c0hai.LJII());
    }
}
