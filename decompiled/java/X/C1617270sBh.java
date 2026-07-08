package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617270sBh extends AbstractC1617360sBq {
    public static Function0<String> LLILLL;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String strInvoke;
        Function0<String> function0 = LLILLL;
        String containerID = null;
        if (function0 != null && (strInvoke = function0.invoke()) != null && strInvoke.length() != 0) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1617320sBm.class);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
            ((InterfaceC1617320sBm) xBaseModelLIZJ).setDataJson(strInvoke);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -100, "data not ready", null, 4);
    }
}
