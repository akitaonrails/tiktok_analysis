package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ceJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019970ceJ extends AbstractC1019980ceK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        int iHashCode;
        String string;
        String string2;
        C1051660dTQ c1051660dTQ;
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ;
        Object objLIZ;
        InterfaceC1019990ceL interfaceC1019990ceL = (InterfaceC1019990ceL) xBaseParamModel;
        int iIntValue = interfaceC1019990ceL.getStatus().intValue();
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
        Object scene = interfaceC1019990ceL.getScene();
        if (scene != null) {
            string = scene.toString();
        } else {
            string = null;
        }
        Object containerKey = interfaceC1019990ceL.getContainerKey();
        if (containerKey != null) {
            string2 = containerKey.toString();
        } else {
            string2 = null;
        }
        C1440005kM.LIZ(new C997410c3v(iIntValue, iHashCode, string, string2));
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1020000ceM.class, containerID2), "post status success");
    }
}
