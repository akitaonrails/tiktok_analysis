package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.Map;

/* JADX INFO: renamed from: X.0uZ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708680uZ8 {
    public final String LIZ;
    public boolean LIZIZ;

    public C1708680uZ8(String str) {
        this.LIZ = str;
    }

    public final void LIZ(C1709570uaZ c1709570uaZ, String str) {
        String str2;
        String str3;
        String str4;
        if (!this.LIZIZ) {
            InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(this.LIZ);
            Map<String, String> mapLIZ = c1709570uaZ.LIZ();
            PaymentOption paymentOptionLJJIJ = c1709570uaZ.LJJIJ();
            String str5 = "";
            if (paymentOptionLJJIJ != null) {
                PODaInfo pODaInfo = paymentOptionLJJIJ.trackInfo;
                if (pODaInfo == null || (str4 = pODaInfo.optionName) == null) {
                    str4 = "";
                }
                mapLIZ.put("default_hybrid_payment_method", str4);
                String strLJIL = paymentOptionLJJIJ.LJIL();
                if (strLJIL == null) {
                    strLJIL = "";
                }
                mapLIZ.put("default_hybrid_payment_method_id", strLJIL);
            }
            PaymentOption paymentOptionLJJIJIIJI = c1709570uaZ.LJJIJIIJI();
            if (paymentOptionLJJIJIIJI != null) {
                PODaInfo pODaInfo2 = paymentOptionLJJIJIIJI.trackInfo;
                if (pODaInfo2 == null || (str2 = pODaInfo2.optionName) == null) {
                    str2 = "";
                }
                mapLIZ.put("default_other_payment_method", str2);
                String strLJIL2 = paymentOptionLJJIJIIJI.LJIL();
                if (strLJIL2 == null) {
                    strLJIL2 = "";
                }
                mapLIZ.put("default_other_payment_method_id", strLJIL2);
                PODaInfo pODaInfo3 = paymentOptionLJJIJIIJI.trackInfo;
                if (pODaInfo3 != null && (str3 = pODaInfo3.bankCode) != null) {
                    str5 = str3;
                }
                mapLIZ.put("default_bank_code", str5);
            }
            interfaceC1709310ua9LIZIZ.LJIILIIL(str, mapLIZ);
            this.LIZIZ = true;
        }
    }
}
