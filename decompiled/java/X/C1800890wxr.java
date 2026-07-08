package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800890wxr extends AbstractC1800850wxn {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1800900wxs interfaceC1800900wxs;
        String containerID2;
        InterfaceC1800900wxs interfaceC1800900wxs2;
        if (Intrinsics.LJFF(((InterfaceC1800860wxo) xBaseParamModel).getEnterFullscreen(), Boolean.TRUE)) {
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID2 = interfaceC634840OvC.getContainerID();
            } else {
                containerID2 = null;
            }
            c1529880puk.getClass();
            InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(containerID2);
            if ((interfaceC1059280dfiLIZ instanceof InterfaceC1800900wxs) && (interfaceC1800900wxs2 = (InterfaceC1800900wxs) interfaceC1059280dfiLIZ) != null) {
                interfaceC1800900wxs2.cj();
            }
        } else {
            C1529880puk c1529880puk2 = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk2.getClass();
            InterfaceC1059280dfi interfaceC1059280dfiLIZ2 = C1529880puk.LIZ(containerID);
            if ((interfaceC1059280dfiLIZ2 instanceof InterfaceC1800900wxs) && (interfaceC1800900wxs = (InterfaceC1800900wxs) interfaceC1059280dfiLIZ2) != null) {
                interfaceC1800900wxs.Lm();
            }
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1800870wxp.class, null), "");
    }
}
