package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0yxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877760yxq extends AbstractC1877740yxo {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String bannerType;
        String playId;
        InterfaceC1877750yxp interfaceC1877750yxp = (InterfaceC1877750yxp) xBaseParamModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle. bannerType=");
        InterfaceC1877770yxr data = interfaceC1877750yxp.getData();
        if (data != null) {
            bannerType = data.getBannerType();
        } else {
            bannerType = null;
        }
        sbLIZ.append(bannerType);
        sbLIZ.append(", playId=");
        InterfaceC1877770yxr data2 = interfaceC1877750yxp.getData();
        if (data2 != null) {
            playId = data2.getPlayId();
        } else {
            playId = null;
        }
        sbLIZ.append(playId);
        C20441214yg.LIZIZ("OpenCountdownForAllPanelMethod", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJLIIIJILLIZJL(new AwS572S0100000_28(interfaceC1877750yxp, 680));
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1877780yxs.class, null), "");
    }
}
