package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708320uYY {
    public final C1709570uaZ LIZ;
    public final JSONObject LIZIZ;
    public final PaymentOption LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List<POPayElement> LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1708320uYY(C1709570uaZ c1709570uaZ, JSONObject jSONObject, PaymentOption paymentOption, String str, String str2, List list, int i) {
        String str3;
        String str4;
        List list2 = (i & 64) != 0 ? null : list;
        if ((i & 128) != 0) {
            str3 = "ccdc_card_info";
        } else {
            str3 = null;
        }
        if ((i & 256) != 0) {
            str4 = "binding";
        } else {
            str4 = null;
        }
        this(c1709570uaZ, jSONObject, paymentOption, str, str2, null, list2, str3, str4);
    }

    public C1708320uYY(C1709570uaZ c1709570uaZ, JSONObject jSONObject, PaymentOption paymentOption, String str, String str2, String str3, List<POPayElement> list, String str4, String str5) {
        this.LIZ = c1709570uaZ;
        this.LIZIZ = jSONObject;
        this.LIZJ = paymentOption;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = list;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
    }
}
