package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0uaf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709630uaf {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final PaymentOption LIZLLL;

    public final void LIZJ(String str, String str2) {
        C1708610uZ1.LIZIZ(this.LIZ).LJ(this.LIZIZ, str, Boolean.TRUE, LIZ(this, str2, null, null, true, 6));
    }

    public final void LIZLLL(String str, String str2, String str3) {
        C1708610uZ1.LIZIZ(this.LIZ).LIZJ(this.LIZIZ, str, LIZ(this, str3, null, str2, false, 10));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1709630uaf(String str, String str2, PaymentOption paymentOption, int i) {
        String str3;
        if ((i & 2) != 0) {
            str3 = "ccdc_card_info";
        } else {
            str3 = null;
        }
        this((i & 8) != 0 ? null : paymentOption, str, str3, (i & 4) != 0 ? null : str2);
    }

    public C1709630uaf(PaymentOption paymentOption, String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = paymentOption;
    }

    public static void LIZIZ(C1709630uaf c1709630uaf, String str, String str2, String str3, int i) {
        String str4 = str3;
        String str5 = str2;
        if ((i & 2) != 0) {
            str5 = null;
        }
        if ((i & 4) != 0) {
            str4 = null;
        }
        c1709630uaf.getClass();
        C1708610uZ1.LIZIZ(c1709630uaf.LIZ).LJIIL(c1709630uaf.LIZIZ, str, Boolean.TRUE, LIZ(c1709630uaf, str4, str5, null, true, 4));
    }

    public static Map LIZ(C1709630uaf c1709630uaf, String str, String str2, String str3, boolean z, int i) {
        PaymentOption paymentOption;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c1709630uaf.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("option_type", "payment_type"));
        if (str != null) {
            mapLJIIJ.put("option_name", str);
        }
        String str4 = c1709630uaf.LIZJ;
        if (str4 != null) {
            mapLJIIJ.put("enter_from", str4);
        }
        if (str2 != null) {
            mapLJIIJ.put("button_type", str2);
        }
        if (str3 != null) {
            mapLJIIJ.put("action_type", str3);
        }
        if (z && (paymentOption = c1709630uaf.LIZLLL) != null) {
            mapLJIIJ.put("payment_option", "CCDC");
            mapLJIIJ.put("pay_bind_status", String.valueOf(paymentOption.LIZ().getValue()));
        }
        return mapLJIIJ;
    }
}
