package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ccP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018790ccP extends AbstractC1018800ccQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C1051660dTQ c1051660dTQ;
        int iHashCode;
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ;
        Object objLIZ;
        InterfaceC1018810ccR interfaceC1018810ccR = (InterfaceC1018810ccR) xBaseParamModel;
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
            c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class);
        } else {
            c1051660dTQ = null;
        }
        Number scoreResult = interfaceC1018810ccR.getScoreResult();
        if (scoreResult != null) {
            if (c1051660dTQ != null && (interfaceC1051470dT7LIZ = c1051660dTQ.LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.class)) != null && (objLIZ = interfaceC1051470dT7LIZ.LIZ()) != null) {
                iHashCode = objLIZ.hashCode();
            } else {
                iHashCode = 0;
            }
            scoreResult.intValue();
            C1440005kM.LIZ(new C999640c7W(iHashCode));
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1018820ccS.class, containerID2), "");
    }
}
