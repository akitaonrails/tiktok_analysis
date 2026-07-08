package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ubN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710070ubN {
    public final C1709570uaZ LIZ;
    public final PaymentOption LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final C1709620uae LJFF;

    public final Map<String, String> LIZ(boolean z) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ.LIZ());
        C1709620uae c1709620uae = this.LJFF;
        PaymentOption paymentOption = this.LIZIZ;
        C1709570uaZ c1709570uaZ = this.LIZ;
        c1709620uae.getClass();
        linkedHashMap.putAll(C1709620uae.LIZ(c1709570uaZ, paymentOption));
        linkedHashMap.put("source_page_name", this.LIZJ);
        linkedHashMap.put("entry_scene", this.LIZLLL);
        linkedHashMap.put("needed_element_type", "cvv");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_prefilled", str);
        return linkedHashMap;
    }

    public C1710070ubN(C1709570uaZ c1709570uaZ, PaymentOption paymentOption, String str, String str2) {
        this.LIZ = c1709570uaZ;
        this.LIZIZ = paymentOption;
        this.LIZJ = str;
        this.LIZLLL = str2;
        String str3 = c1709570uaZ.LJJIFFI;
        this.LJ = str3;
        this.LJFF = new C1709620uae(str3);
    }
}
