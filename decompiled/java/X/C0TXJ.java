package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0TXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TXJ extends C0TXH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C0TXP c0txp;
        C0TXI c0txi = (C0TXI) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c0txp = (C0TXP) c1537480q70LIZIZ.LJFF(C0TXP.class)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ReportPopupClickMethod:reportPopupClick isPositive=");
            sbLIZ.append(c0txi.isPositive());
            sbLIZ.append(", clickAction=");
            sbLIZ.append(c0txi.getClickAction());
            C20589415hU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c0txp.LIZLLL(c0txi.getClickAction(), c0txi.isPositive());
        }
    }
}
