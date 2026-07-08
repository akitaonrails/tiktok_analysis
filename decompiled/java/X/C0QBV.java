package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0QBV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QBV extends C0QBW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        int iHashCode;
        C1051660dTQ c1051660dTQ;
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ;
        Object objLIZ;
        C0QBX c0qbx = (C0QBX) xBaseParamModel;
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
        if (c1537480q70LIZIZ != null && (c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class)) != null && (interfaceC1051470dT7LIZ = c1051660dTQ.LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.class)) != null && (objLIZ = interfaceC1051470dT7LIZ.LIZ()) != null) {
            iHashCode = objLIZ.hashCode();
        } else {
            iHashCode = 0;
        }
        C1440005kM.LIZ(new C0QBU(c0qbx.getStage().intValue(), iHashCode));
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0QBY.class, containerID2), "");
    }
}
