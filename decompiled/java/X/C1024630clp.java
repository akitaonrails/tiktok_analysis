package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0clp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024630clp extends AbstractC1024640clq {
    public static final Map<String, Boolean> LLILLL = new LinkedHashMap();

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        String containerID;
        String string = ((InterfaceC1024650clr) xBaseParamModel).getStatus().toString();
        if (!Intrinsics.LJFF(string, "true") && !Intrinsics.LJFF(string, "1")) {
            z = false;
        } else {
            z = true;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
            if (containerID != null) {
                LLILLL.put(containerID, Boolean.valueOf(z));
            }
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1024660cls.class, containerID), "");
    }
}
