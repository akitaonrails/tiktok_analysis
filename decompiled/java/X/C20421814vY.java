package X;

import Y.ARunnableS19S0500000_31;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.14vY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20421814vY extends AbstractC20421914vZ {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        AbstractC20358714lN abstractC20358714lN;
        InterfaceC20422114vb interfaceC20422114vb = (InterfaceC20422114vb) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (abstractC20358714lN = (AbstractC20358714lN) c1537480q70LIZIZ.LJFF(C20359714lX.class)) != null) {
            PlayRule playRuleLIZIZ = abstractC20358714lN.LIZIZ(interfaceC20422114vb.getStateId().longValue(), interfaceC20422114vb.getGameplayId(), "jsb", "");
            if (playRuleLIZIZ != null) {
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = completionBlock;
                C473410IhP.LIZIZ(new ARunnableS19S0500000_31(interfaceC20422114vb, playRuleLIZIZ, this, c259800zU, playRuleLIZIZ, 2));
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
