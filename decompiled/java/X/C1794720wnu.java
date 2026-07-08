package X;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;

/* JADX INFO: renamed from: X.0wnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794720wnu {
    public static final C1788060wdA LIZ(Purchase purchase) {
        EnumC1157990gEv enumC1157990gEv;
        String str;
        int iLIZLLL = purchase.LIZLLL();
        boolean z = true;
        if (iLIZLLL != 1) {
            if (iLIZLLL != 2) {
                enumC1157990gEv = EnumC1157990gEv.UNKNOWN;
            } else {
                enumC1157990gEv = EnumC1157990gEv.PENDING;
            }
        } else {
            enumC1157990gEv = EnumC1157990gEv.PURCHASED;
        }
        boolean zOptBoolean = purchase.LIZJ.optBoolean("acknowledged", true);
        String strOptString = purchase.LIZJ.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        String str2 = "";
        if (strOptString == null) {
            strOptString = "";
        }
        String str3 = (String) C13LP.LJJJLL(purchase.LIZJ());
        if (str3 == null) {
            str3 = "";
        }
        C1795180woe c1795180woeLIZ = purchase.LIZ();
        if (c1795180woeLIZ != null && (str = c1795180woeLIZ.LIZ) != null) {
            str2 = str;
        }
        String strLJ = purchase.LJ();
        String str4 = purchase.LIZ;
        long jOptLong = purchase.LIZJ.optLong("purchaseTime");
        if (purchase.LIZIZ() == null) {
            z = false;
        }
        return new C1788060wdA(enumC1157990gEv, strOptString, str3, str2, strLJ, str4, jOptLong, zOptBoolean, z);
    }
}
