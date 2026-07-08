package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0udh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711510udh extends AbstractC1711740ue4 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C19EG c19egLIZIZ;
        Activity activityLIZIZ;
        String eventParams = ((InterfaceC1711700ue0) xBaseParamModel).getEventParams();
        C1708610uZ1.LIZIZ("autofill").LIZ("rd_pipo_auto_fill_jsb_call_start", C2097608Jq.LJ());
        C1711440uda c1711440uda = C1711440uda.LIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ);
        } else {
            c19egLIZIZ = null;
        }
        InterfaceC1711360udS interfaceC1711360udS = new InterfaceC1711360udS() { // from class: X.0udn
            @Override // X.InterfaceC1711360udS
            public final void LIZ(AutofillApi.AutoFillInfo autoFillInfo) {
                String str;
                String str2;
                String str3;
                if (autoFillInfo != null && (str = autoFillInfo.cardNumber) != null && !a0.LJJJIL(str)) {
                    CompletionBlock<InterfaceC1711680udy> completionBlock2 = completionBlock;
                    String str4 = null;
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1711680udy.class, null);
                    InterfaceC1711680udy interfaceC1711680udy = (InterfaceC1711680udy) xBaseModelLIZJ;
                    if (autoFillInfo != null) {
                        str4 = autoFillInfo.cardNumber;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    interfaceC1711680udy.setCardNumber(str4);
                    if (autoFillInfo == null || (str2 = autoFillInfo.expireDate) == null) {
                        str2 = "";
                    }
                    interfaceC1711680udy.setExpirationDate(str2);
                    if (autoFillInfo == null || (str3 = autoFillInfo.holderName) == null) {
                        str3 = "";
                    }
                    interfaceC1711680udy.setHolderName(str3);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    C1707370uX1.LIZ(1, "", "");
                    return;
                }
                LIZIZ(0, "get_card_detail", "get_card_detail");
            }

            @Override // X.InterfaceC1711360udS
            public final void LIZIZ(int i, String str, String str2) {
                String str3;
                CompletionBlock<InterfaceC1711680udy> completionBlock2 = completionBlock;
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                C2382909Vj.LIZ(completionBlock2, 0, str3, null, 4);
                C1707370uX1.LIZ(i, str, str2);
            }
        };
        c1711440uda.getClass();
        if (c19egLIZIZ != null) {
            if (C1711000ucs.LIZ().enabled == 1) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1711490udf("ttls", interfaceC1711360udS, c19egLIZIZ, eventParams, null), 2);
            } else {
                interfaceC1711360udS.LIZIZ(3, "", "");
            }
        }
    }
}
