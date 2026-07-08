package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.186p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212309186p {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r0 = 6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.AnonymousClass1871 r2) {
        /*
            if (r2 == 0) goto L4b
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L4b
            int r1 = r0.intValue()
            X.186q r0 = r2.LJ
            if (r0 == 0) goto L1e
            X.186b r0 = r0.getProductPriceController()
            if (r0 == 0) goto L1e
            X.187m r0 = r0.LJII
            if (r0 == 0) goto L1e
            r0.setPriceSize(r1)
        L1e:
            X.186q r0 = r2.LJFF
            if (r0 == 0) goto L2f
            X.186b r0 = r0.getProductPriceController()
            if (r0 == 0) goto L2f
            X.187m r0 = r0.LJII
            if (r0 == 0) goto L2f
            r0.setPriceSize(r1)
        L2f:
            X.186q r0 = r2.LJ
            if (r0 == 0) goto L3d
            X.186b r0 = r0.getProductPriceController()
            if (r0 == 0) goto L3d
            r0.LJFF = r1
            r0.LJI = r1
        L3d:
            X.186q r0 = r2.LJFF
            if (r0 == 0) goto L4b
            X.186b r0 = r0.getProductPriceController()
            if (r0 == 0) goto L4b
            r0.LJFF = r1
            r0.LJI = r1
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212309186p.LIZ(X.1871):void");
    }

    public static boolean LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 10 || num.intValue() == 16) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZIZ(InterfaceC21143117ob interfaceC21143117ob, Integer num, C197039127h c197039127h, C197039127h c197039127h2, C197039127h c197039127h3) {
        if (interfaceC21143117ob.LLJLLIL(num)) {
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 8);
            }
            if (c197039127h2 != null) {
                C786410Ut5.LLLLLLJ(c197039127h2, 0);
            }
            if (c197039127h3 != null) {
                C786410Ut5.LLLLLLJ(c197039127h3, 0);
            }
            if (c197039127h2 != null) {
                c197039127h2.setEnabled(true);
                return;
            }
            return;
        }
        if (c197039127h != null) {
            C786410Ut5.LLLLLLJ(c197039127h, 0);
        }
        if (c197039127h2 != null) {
            C786410Ut5.LLLLLLJ(c197039127h2, 8);
        }
        if (c197039127h3 == null) {
            return;
        }
        C786410Ut5.LLLLLLJ(c197039127h3, 8);
    }

    public static void LIZLLL(C197039127h c197039127h, C197039127h c197039127h2, Map map, Integer num, SinglePriceItem singlePriceItem) {
        String string;
        String strLIZLLL;
        String strLJJIFFI = null;
        if (map != null) {
            if (num != null) {
                string = num.toString();
            } else {
                string = null;
            }
            String str = (String) map.get(string);
            if (str != null) {
                if (singlePriceItem != null) {
                    strLIZLLL = C743702vL.LIZLLL(singlePriceItem);
                } else {
                    strLIZLLL = "";
                }
                strLJJIFFI = u.LJJIFFI(str, "{s_price}", strLIZLLL, false);
            }
        }
        if (c197039127h != null) {
            c197039127h.setText(strLJJIFFI);
        }
        if (c197039127h2 != null) {
            c197039127h2.setText(strLJJIFFI);
        }
    }
}
