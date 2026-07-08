package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015100cWS extends AbstractC602060NjQ {
    public final void LIZJ() {
        C1051660dTQ c1051660dTQ;
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ;
        if (C07CW.LIZ()) {
            C1440005kM.LIZ(new C997530c47(0));
            return;
        }
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null;
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ == null || (c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class)) == null || (interfaceC1051470dT7LIZ = c1051660dTQ.LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.class)) == null) {
            return;
        }
        Object objLIZ = interfaceC1051470dT7LIZ.LIZ();
        C1440005kM.LIZ(new C997530c47(objLIZ != null ? objLIZ.hashCode() : 0));
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Number index = ((InterfaceC602070NjR) xBaseParamModel).getIndex();
        if (Intrinsics.LJFF(index, 1)) {
            LIZJ();
        } else if (index instanceof Integer) {
            C1440005kM.LIZ(new C997160c3W(index.intValue()));
        } else {
            LIZJ();
        }
    }
}
