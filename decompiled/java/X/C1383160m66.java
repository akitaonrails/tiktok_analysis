package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0m66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383160m66 extends AbstractC1383170m67 {
    public static WeakReference<InterfaceC1383150m65> LLILLL;

    public static void LIZJ(InterfaceC1383180m68 interfaceC1383180m68, CompletionBlock completionBlock) {
        boolean z;
        InterfaceC1383150m65 interfaceC1383150m65;
        InterfaceC1383150m65 interfaceC1383150m652;
        if (interfaceC1383180m68 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1378790lz3 c1378790lz3 = new C1378790lz3(interfaceC1383180m68.getTitle(), interfaceC1383180m68.getDesc(), interfaceC1383180m68.getImageUrl(), interfaceC1383180m68.getQuery());
            WeakReference<InterfaceC1383150m65> weakReference = LLILLL;
            if (weakReference != null && (interfaceC1383150m652 = weakReference.get()) != null) {
                interfaceC1383150m652.LIZ(true, c1378790lz3);
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1383190m69.class, null), "success");
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handle, success, data:");
            sbLIZ.append(c1378790lz3);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        WeakReference<InterfaceC1383150m65> weakReference2 = LLILLL;
        if (weakReference2 != null && (interfaceC1383150m65 = weakReference2.get()) != null) {
            interfaceC1383150m65.LIZ(false, null);
        }
        completionBlock.onFailure(0, "params is empty", (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1383190m69.class, null));
        int i2 = C2187451AjH.LIZ;
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((InterfaceC1383180m68) xBaseParamModel, completionBlock);
    }
}
