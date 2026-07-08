package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0cXX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015770cXX extends AbstractC1015790cXZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C1013990cUf c1013990cUf;
        Boolean boolValueOf;
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
        if (c1537480q70LIZIZ != null) {
            c1013990cUf = (C1013990cUf) c1537480q70LIZIZ.LJFF(C1013990cUf.class);
        } else {
            c1013990cUf = null;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1015780cXY.class);
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID2, c19719912DlLIZ);
        InterfaceC1015780cXY interfaceC1015780cXY = (InterfaceC1015780cXY) xBaseModelLIZJ;
        if (c1013990cUf != null) {
            boolValueOf = Boolean.valueOf(c1013990cUf.LIZ);
        } else {
            boolValueOf = Boolean.FALSE;
        }
        interfaceC1015780cXY.setViewStatus(boolValueOf);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
