package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;
import kotlin.jvm.internal.AwS399S0200000_33;

/* JADX INFO: renamed from: X.1ATd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179911ATd extends AbstractC2179931ATf {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC2179921ATe interfaceC2179921ATe = (InterfaceC2179921ATe) xBaseParamModel;
        String type = interfaceC2179921ATe.getType();
        Map<String, Object> extraEventParams = interfaceC2179921ATe.getExtraEventParams();
        if (extraEventParams == null) {
            extraEventParams = C2097608Jq.LJ();
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        C784440Upu.LIZ().LIZIZ(new C1123630fLV(type, interfaceC2179921ATe.getSchema(), extraEventParams, new AwS399S0200000_33((InterfaceC2179941ATg) C1909107dp.LIZJ(InterfaceC2179941ATg.class, containerID), (InterfaceC2179941ATg) completionBlock, (CompletionBlock<InterfaceC2179941ATg>) 29)));
    }
}
