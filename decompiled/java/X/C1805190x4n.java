package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0x4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805190x4n {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(X.C1805560x5O r5) {
        /*
            com.bytedance.android.live.wallet.model.ExchangeDisplayInfo r0 = r5.LIZLLL
            r1 = 0
            if (r0 == 0) goto L31
            int r0 = r0.exchangeEntranceTitle
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        Lb:
            int r3 = r5.LIZ
            com.bytedance.android.live.wallet.model.WalletStruct r0 = r5.LIZJ
            if (r0 == 0) goto L1d
            com.bytedance.android.live.wallet.model.RevenueExchange r0 = r0.revenue
            if (r0 == 0) goto L1d
            boolean r0 = r0.isRevenue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L1d:
            boolean r2 = X.C500260Jjc.LJJJI(r1)
            com.bytedance.android.live.wallet.model.WalletStruct r0 = r5.LIZJ
            if (r0 == 0) goto L2f
            boolean r1 = r0.isPeriodicPayout
            r0 = 1
            if (r1 != r0) goto L2f
        L2a:
            java.lang.String r0 = X.C1805860x5s.LIZ(r3, r4, r2, r0)
            return r0
        L2f:
            r0 = 0
            goto L2a
        L31:
            r4 = r1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1805190x4n.LIZ(X.0x5O):java.lang.String");
    }

    public static CharSequence LIZJ(String str, String str2) {
        Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.el0);
        if (drawableLJIIJ != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(10.0f);
            drawableLJIIJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
            C416760GVu c416760GVu = new C416760GVu(drawableLJIIJ);
            SpannableString spannableString = new SpannableString(str2);
            C786410Ut5.p2(spannableString, c416760GVu, str2.length() - str.length(), (str2.length() - str.length()) + 1, 33);
            return spannableString;
        }
        return null;
    }

    public static boolean LIZLLL(C1803830x2b c1803830x2b, boolean z, IWalletService iWalletService, int i) {
        Object obj;
        C1126800fQc.LIZ.GN();
        C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.RECHARGE_BANNER_TP.getType());
        Boolean boolValueOf = null;
        if (c1123320fL0LIZIZ != null) {
            obj = c1123320fL0LIZIZ.LIZLLL;
        } else {
            obj = null;
        }
        if (obj != null) {
            return true;
        }
        if (c1803830x2b.LJIIZILJ == 0) {
            return false;
        }
        InterfaceC1806200x6Q interfaceC1806200x6QAo2 = iWalletService.walletCenter().ao2(c1803830x2b.LJ);
        if (i == 3) {
            return true;
        }
        C01GW<InterfaceC1133710fbl> c01gw = C1805240x4s.LJIIJ;
        if (C1804990x4T.LIZIZ()) {
            return true;
        }
        if (interfaceC1806200x6QAo2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC1806200x6QAo2.LIZJ(EnumC1805630x5V.LIVE_RECHARGE_PANEL_FOOTER));
        }
        if (C500260Jjc.LJJJI(boolValueOf) || z) {
            return true;
        }
        return false;
    }

    public static String LIZIZ(C1805560x5O c1805560x5O, String str, long j, int i, boolean z, String str2, Locale locale) {
        String strLIZIZ;
        double dPow = j / Math.pow(10.0d, 2.0d);
        String str3 = "";
        if (z) {
            IWalletExchange iWalletExchange = c1805560x5O.LJFF;
            List listSingletonList = Collections.singletonList(new BigDecimal(String.valueOf(dPow)));
            if (str2 != null) {
                str3 = str2;
            }
            Boolean bool = Boolean.TRUE;
            strLIZIZ = (String) ListProtector.get(((WalletExchange) iWalletExchange).LJIILJJIL(listSingletonList, i, str3, locale, bool, bool), 0);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (str != null) {
                str3 = str;
            }
            sbLIZ.append(str3);
            sbLIZ.append(((WalletExchange) c1805560x5O.LJFF).LJIIJJI(dPow, i));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C497740JfY.LJJ() && !a0.LJJIIZI(strLIZIZ, "\u200f", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((char) 8234);
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("\u202c\u200f");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }
}
