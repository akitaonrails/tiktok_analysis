package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ceY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020120ceY extends AbstractC1020130ceZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        boolean z;
        boolean z2;
        String containerID;
        String string;
        C1051660dTQ c1051660dTQ;
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ;
        BaseBundle baseBundle;
        InterfaceC1020140cea interfaceC1020140cea = (InterfaceC1020140cea) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            String appId = interfaceC1020140cea.getAppId();
            if (appId != null && appId.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            String containerID2 = null;
            if (z) {
                C2382909Vj.LIZ(completionBlock, -1, "app_id is empty", null, 4);
                return;
            }
            Number directDownload = interfaceC1020140cea.getDirectDownload();
            if (directDownload != null && directDownload.intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if (c1537480q70LIZIZ != null && (c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class)) != null && (interfaceC1051470dT7LIZ = c1051660dTQ.LIZ(Bundle.class)) != null && (baseBundle = (BaseBundle) interfaceC1051470dT7LIZ.LIZ()) != null) {
                string = baseBundle.getString("aweme_id");
            } else {
                string = null;
            }
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null && C1028210crb.LJIIIZ(context, appId, string, interfaceC1020140cea.getComponentType(), z2)) {
                C1440005kM.LIZ(new C997880c4g());
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID2 = interfaceC634840OvC3.getContainerID();
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1020150ceb.class, containerID2), "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, -1, "handle failed", null, 4);
        }
    }
}
