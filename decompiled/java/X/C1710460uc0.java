package X;

import android.widget.EditText;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import kotlin.jvm.internal.AwS40S1400000_26;

/* JADX INFO: renamed from: X.0uc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710460uc0 {
    public static void LIZ(Element element, C1710780ucW c1710780ucW, int i, String str, C1709570uaZ c1709570uaZ, boolean z, String str2, String str3, String str4, PaymentOption paymentOption) {
        String str5 = str2;
        EditText editText = c1710780ucW.getEditText();
        editText.setInputType(2);
        C1722120uuo.LJ(editText, i);
        String str6 = element.infoUrl;
        if (str6 != null && C123100dR.LIZ(str6)) {
            if (z) {
                C1709630uaf c1709630uaf = new C1709630uaf(str, str4, paymentOption, 2);
                c1710780ucW.setTitleIcon(new AwS40S1400000_26(editText, element, c1709570uaZ, c1709630uaf, str3, 0));
                c1709630uaf.LIZJ("info", "cvv");
                return;
            } else {
                if (str5 == null) {
                    str5 = "";
                }
                C1709630uaf c1709630uaf2 = new C1709630uaf(paymentOption, str, str5, str4);
                c1710780ucW.setEndInfoIcon(new AwS40S1400000_26(editText, element, c1709570uaZ, c1709630uaf2, str3, 1));
                c1709630uaf2.LIZJ("info", "cvv");
                return;
            }
        }
        c1710780ucW.setTitleIcon(null);
    }
}
