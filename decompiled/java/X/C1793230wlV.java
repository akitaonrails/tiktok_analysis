package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793230wlV extends AbstractC1793250wlX {
    public static Function0<? extends Map<String, ? extends Object>> LLILLL;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Map<String, ? extends Object> mapInvoke;
        String containerID;
        Function0<? extends Map<String, ? extends Object>> function0 = LLILLL;
        String containerID2 = null;
        if (function0 != null) {
            mapInvoke = function0.invoke();
        } else {
            mapInvoke = null;
        }
        if (mapInvoke != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1793240wlW.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID2 = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID2, c19719912DlLIZ);
            InterfaceC1793240wlW interfaceC1793240wlW = (InterfaceC1793240wlW) xBaseModelLIZJ;
            interfaceC1793240wlW.setRewardData(mapInvoke);
            interfaceC1793240wlW.setCanReceiveReward(Boolean.TRUE);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InterfaceC1793240wlW.class);
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ2 = C1549500qQO.LIZJ(containerID, c19719912DlLIZ2);
        InterfaceC1793240wlW interfaceC1793240wlW2 = (InterfaceC1793240wlW) xBaseModelLIZJ2;
        interfaceC1793240wlW2.setRewardData(null);
        interfaceC1793240wlW2.setCanReceiveReward(Boolean.FALSE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
    }
}
