package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120720fGo extends AbstractC1120740fGq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        InterfaceC1120730fGp interfaceC1120730fGp = (InterfaceC1120730fGp) xBaseParamModel;
        EnumC1120600fGc enumC1120600fGc = EnumC1120600fGc.BACKPACK;
        Number itemID = interfaceC1120730fGp.getItemID();
        if (itemID != null) {
            iIntValue = itemID.intValue();
        } else {
            iIntValue = 0;
        }
        Number itemType = interfaceC1120730fGp.getItemType();
        if (itemType != null) {
            iIntValue2 = itemType.intValue();
        } else {
            iIntValue2 = 0;
        }
        Number available = interfaceC1120730fGp.getAvailable();
        if (available != null) {
            iIntValue3 = available.intValue();
        } else {
            iIntValue3 = -1;
        }
        String giftEnterFrom = interfaceC1120730fGp.getGiftEnterFrom();
        if (giftEnterFrom == null) {
            giftEnterFrom = "";
        }
        C1120640fGg c1120640fGg = new C1120640fGg();
        c1120640fGg.LIZIZ = 0L;
        c1120640fGg.LJIILIIL = iIntValue;
        c1120640fGg.LJIIL = iIntValue2;
        c1120640fGg.LJIILJJIL = iIntValue3;
        if (giftEnterFrom.length() > 0) {
            c1120640fGg.LIZJ = giftEnterFrom;
        }
        c1120640fGg.LIZ = enumC1120600fGc;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS561S0100000_17(c1120640fGg, 295));
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1120750fGr.class, null), "");
    }
}
