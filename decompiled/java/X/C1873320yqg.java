package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873320yqg extends AbstractC1873290yqd {
    public static WeakReference<InterfaceC1549100qPk> LLILLL;
    public static InterfaceC1549100qPk LLILZ;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        EnumC1874010yrn enumC1874010yrn;
        InterfaceC1549100qPk interfaceC1549100qPk;
        InterfaceC1873280yqc interfaceC1873280yqc = (InterfaceC1873280yqc) xBaseParamModel;
        InterfaceC1549100qPk interfaceC1549100qPk2 = null;
        InterfaceC1873300yqe interfaceC1873300yqe = (InterfaceC1873300yqe) C1909107dp.LIZJ(InterfaceC1873300yqe.class, null);
        interfaceC1873300yqe.setSuccess(Boolean.TRUE);
        C1873340yqi c1873340yqi = EnumC1874010yrn.Companion;
        String eventName = interfaceC1873280yqc.getEventName();
        c1873340yqi.getClass();
        EnumC1874010yrn[] enumC1874010yrnArrValues = EnumC1874010yrn.values();
        int length = enumC1874010yrnArrValues.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC1874010yrn = enumC1874010yrnArrValues[i];
                if (Intrinsics.LJFF(enumC1874010yrn.getValue(), eventName)) {
                    break;
                } else {
                    i++;
                }
            } else {
                enumC1874010yrn = null;
                break;
            }
        }
        Map<String, Object> params = interfaceC1873280yqc.getParams();
        WeakReference<InterfaceC1549100qPk> weakReference = LLILLL;
        if (weakReference != null && (interfaceC1549100qPk = weakReference.get()) != null) {
            interfaceC1549100qPk.LIZ(enumC1874010yrn, params);
        }
        InterfaceC1549100qPk interfaceC1549100qPk3 = LLILZ;
        if (interfaceC1549100qPk3 != null) {
            interfaceC1549100qPk3.LIZ(enumC1874010yrn, params);
        }
        completionBlock.onSuccess(interfaceC1873300yqe, "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle, params:");
        sbLIZ.append(params);
        sbLIZ.append(", event:");
        sbLIZ.append(enumC1874010yrn);
        sbLIZ.append(", callback:");
        WeakReference<InterfaceC1549100qPk> weakReference2 = LLILLL;
        if (weakReference2 != null) {
            interfaceC1549100qPk2 = weakReference2.get();
        }
        sbLIZ.append(interfaceC1549100qPk2);
        sbLIZ.append(", preloadCallback:");
        sbLIZ.append(LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
