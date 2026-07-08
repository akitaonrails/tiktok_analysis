package X;

import android.graphics.Rect;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0pWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514940pWe extends AbstractC1514900pWa {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1514950pWf interfaceC1514950pWf;
        InterfaceC1514930pWd interfaceC1514930pWd = (InterfaceC1514930pWd) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (interfaceC1514950pWf = (InterfaceC1514950pWf) c1537480q70LIZIZ.LJFF(InterfaceC1514950pWf.class)) != null) {
            interfaceC1514950pWf.LIZ(new Rect((int) interfaceC1514930pWd.getX().floatValue(), (int) interfaceC1514930pWd.getY().floatValue(), ((int) interfaceC1514930pWd.getX().floatValue()) + ((int) interfaceC1514930pWd.getW().floatValue()), ((int) interfaceC1514930pWd.getY().floatValue()) + ((int) interfaceC1514930pWd.getH().floatValue())));
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1514910pWb.class, containerID2), "");
    }
}
