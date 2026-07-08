package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qON, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548250qON extends AbstractC1548260qOO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1548390qOb interfaceC1548390qOb;
        C1540620qC4 c1540620qC4;
        C1537480q70 hybridContext;
        C1548290qOR c1548290qOR;
        List<C1548300qOS> list;
        InterfaceC1548270qOP interfaceC1548270qOP = (InterfaceC1548270qOP) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
            containerID = "";
        }
        String eventName = interfaceC1548270qOP.getEventName();
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            interfaceC1548390qOb = (InterfaceC1548390qOb) interfaceC634840OvC2.LIZIZ(InterfaceC1548390qOb.class);
        } else {
            interfaceC1548390qOb = null;
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            c1540620qC4 = (C1540620qC4) interfaceC634840OvC3.LIZIZ(C1540620qC4.class);
        } else {
            c1540620qC4 = null;
        }
        C1529870puj.LIZ.getClass();
        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(containerID);
        if (c1540620qC4 != null) {
            C0OV4 c0ov4 = new C0OV4(containerID, jCurrentTimeMillis, interfaceC1548390qOb, interfaceC1541990qEHLJFF);
            C0OV2 c0ov2 = c1540620qC4.LJIILLIIL;
            if (eventName == null) {
                c0ov2.getClass();
            } else {
                CopyOnWriteArrayList<C0OV4> copyOnWriteArrayList = c0ov2.LIZ().get(eventName);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(c0ov4);
                }
            }
        }
        if (interfaceC1541990qEHLJFF != null && (hybridContext = interfaceC1541990qEHLJFF.getHybridContext()) != null && (c1548290qOR = (C1548290qOR) hybridContext.LJFF(C1548290qOR.class)) != null && (list = c1548290qOR.LIZ) != null) {
            for (C1548300qOS c1548300qOS : list) {
                if (Intrinsics.LJFF(c1548300qOS.LIZ, eventName)) {
                    C1548820qPI.LJIIIIZZ(c1548300qOS.LIZ, c1548300qOS.LIZIZ);
                }
            }
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1548280qOQ.class, null), "");
    }
}
