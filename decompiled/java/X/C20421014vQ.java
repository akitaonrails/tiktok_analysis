package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.14vQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20421014vQ extends AbstractC20421114vR {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C20359714lX c20359714lX;
        String containerID2;
        String containerID3;
        String containerID4;
        boolean z;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c20359714lX = (C20359714lX) c1537480q70LIZIZ.LJFF(C20359714lX.class)) != null) {
            LinkedHashMap<String, List<C20361214lm>> linkedHashMapLJIIIZ = c20359714lX.LJIIIZ("");
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            } else {
                containerID2 = null;
            }
            InterfaceC20421214vS interfaceC20421214vS = (InterfaceC20421214vS) C1909107dp.LIZJ(InterfaceC20421214vS.class, containerID2);
            ArrayList arrayList = new ArrayList();
            for (String str : linkedHashMapLJIIIZ.keySet()) {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID3 = interfaceC634840OvC3.getContainerID();
                } else {
                    containerID3 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC20421314vT.class, containerID3);
                InterfaceC20421314vT interfaceC20421314vT = (InterfaceC20421314vT) xBaseModelLIZJ;
                interfaceC20421314vT.setName(str);
                ArrayList arrayList2 = new ArrayList();
                List<C20361214lm> list = linkedHashMapLJIIIZ.get(str);
                if (list != null) {
                    for (C20361214lm c20361214lm : list) {
                        if (c20361214lm != null) {
                            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                            if (interfaceC634840OvC4 != null) {
                                containerID4 = interfaceC634840OvC4.getContainerID();
                            } else {
                                containerID4 = null;
                            }
                            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC20421414vU.class, containerID4);
                            InterfaceC20421414vU interfaceC20421414vU = (InterfaceC20421414vU) xBaseModelLIZJ2;
                            interfaceC20421414vU.setGameplayId(c20361214lm.LIZ);
                            C20361314ln c20361314ln = c20361214lm.LIZJ;
                            String str2 = c20361314ln.LIZIZ;
                            if (str2 == null) {
                                str2 = c20361314ln.LIZ;
                            }
                            interfaceC20421414vU.setName(str2);
                            if (c20361214lm.LIZJ.LJI == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            interfaceC20421414vU.setEnable(Boolean.valueOf(z));
                            arrayList2.add(xBaseModelLIZJ2);
                        }
                    }
                }
                interfaceC20421314vT.setGameplayList(arrayList2);
                arrayList.add(xBaseModelLIZJ);
            }
            interfaceC20421214vS.setGameplayData(arrayList);
            completionBlock.onSuccess(interfaceC20421214vS, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
