package X;

import android.os.SystemClock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0sBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617260sBg extends AbstractC1617350sBp {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID = null;
        long jLIZLLL = C518170KTv.LIZLLL(null, "getPaymentComponentParam", 6);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1617310sBl.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
        InterfaceC1617310sBl interfaceC1617310sBl = (InterfaceC1617310sBl) xBaseModelLIZJ;
        C1616920sB8.LIZ.getClass();
        interfaceC1617310sBl.setPriceRegion(C1616920sB8.LIZ());
        interfaceC1617310sBl.setEnableWebPayment(Boolean.valueOf(C1616810sAx.LIZIZ.LJIILJJIL()));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        C518170KTv.LIZJ("getPaymentComponentParam", "success", SystemClock.elapsedRealtime() - jLIZLLL, null, null, null, null, 248);
    }
}
