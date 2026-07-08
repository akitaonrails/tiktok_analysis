package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378530lyd extends AbstractC1378580lyi {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        int value;
        String containerID;
        Integer num;
        InterfaceC1378570lyh interfaceC1378570lyh = (InterfaceC1378570lyh) xBaseParamModel;
        String shareDataSourceScene = interfaceC1378570lyh.getShareDataSourceScene();
        if (shareDataSourceScene.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            shareDataSourceScene = "default";
        }
        Number sourceAction = interfaceC1378570lyh.getSourceAction();
        if ((sourceAction instanceof Integer) && (num = (Integer) sourceAction) != null) {
            value = num.intValue();
        } else {
            value = EnumC1364450lbv.SOURCE_ACTION_JSB.getValue();
        }
        if (C15504065e.LIZ() && C0BV0.LIZ() && (!Intrinsics.LJFF(shareDataSourceScene, "ecom_cut_price") || ((Number) C279070Awj.LIZ.getValue()).intValue() == 1)) {
            C1365990leP c1365990leP = C1365990leP.LIZ;
            C1365990leP c1365990leP2 = C1365990leP.LIZ;
            C1365990leP.LIZJ(value, null, shareDataSourceScene, null);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
                containerID = "";
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1378620lym.class, containerID), "");
            return;
        }
        C1720006oQ.LIZLLL(new AwS87S1000000_2(shareDataSourceScene, 41), false);
        C2382909Vj.LIZ(completionBlock, 0, "multi-scene source not supported", null, 4);
    }
}
