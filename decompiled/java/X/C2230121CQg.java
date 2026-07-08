package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1CQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230121CQg extends C1CO5 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C20425514w9 c20425514w9;
        C20426114wF c20426114wFLJIIJJI;
        InterfaceC2230111CQf interfaceC2230111CQf;
        C1CQY c1cqy;
        C1CO4 c1co4 = (C1CO4) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c20425514w9 = (C20425514w9) c1537480q70LIZIZ.LJFF(C20425514w9.class)) != null && (c20426114wFLJIIJJI = c20425514w9.LJIIJJI(c1co4.getJson())) != null) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1CO6.class, null);
            C1CO6 c1co6 = (C1CO6) xBaseModelLIZJ;
            C1CQL c1cql = (C1CQL) C1909107dp.LIZJ(C1CQL.class, null);
            c1cql.setStartAtFlowId(Long.valueOf(c20426114wFLJIIJJI.LIZ));
            c1cql.setMinAppVersion(Long.valueOf(c20426114wFLJIIJJI.LIZIZ));
            ArrayList arrayList = new ArrayList();
            for (C20426414wI c20426414wI : c20426114wFLJIIJJI.LIZJ) {
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC2230141CQi.class, null);
                InterfaceC2230141CQi interfaceC2230141CQi = (InterfaceC2230141CQi) xBaseModelLIZJ2;
                interfaceC2230141CQi.setId(Long.valueOf(c20426414wI.LIZ));
                interfaceC2230141CQi.setStartAt(Long.valueOf(c20426414wI.LIZIZ));
                interfaceC2230141CQi.setEndAt(Long.valueOf(c20426414wI.LIZJ));
                arrayList.add(xBaseModelLIZJ2);
            }
            c1cql.setFlows(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (C20425114w5 c20425114w5 : c20426114wFLJIIJJI.LIZLLL) {
                XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC2230131CQh.class, null);
                InterfaceC2230131CQh interfaceC2230131CQh = (InterfaceC2230131CQh) xBaseModelLIZJ3;
                interfaceC2230131CQh.setId(Long.valueOf(c20425114w5.LIZ));
                interfaceC2230131CQh.setStateType(c20425114w5.LIZIZ);
                C20424814w2 c20424814w2 = c20425114w5.LIZJ;
                if (c20424814w2 != null) {
                    interfaceC2230111CQf = (InterfaceC2230111CQf) C1909107dp.LIZJ(InterfaceC2230111CQf.class, null);
                    interfaceC2230111CQf.setNext(Long.valueOf(c20424814w2.LIZ));
                    interfaceC2230111CQf.setEnd(Boolean.valueOf(c20424814w2.LIZIZ));
                    interfaceC2230111CQf.setName(c20424814w2.LIZJ);
                    interfaceC2230111CQf.setComment(c20424814w2.LIZLLL);
                    interfaceC2230111CQf.setPrev(c20424814w2.LJ);
                    interfaceC2230111CQf.setVersion(Long.valueOf(c20424814w2.LJFF));
                    interfaceC2230111CQf.setMinAppVersion(Long.valueOf(c20424814w2.LJI));
                    interfaceC2230111CQf.setParameter(c20424814w2.LJII);
                } else {
                    interfaceC2230111CQf = null;
                }
                interfaceC2230131CQh.setTaskStateData(interfaceC2230111CQf);
                C20424714w1 c20424714w1 = c20425114w5.LIZLLL;
                if (c20424714w1 != null) {
                    c1cqy = (C1CQY) C1909107dp.LIZJ(C1CQY.class, null);
                    c1cqy.setNext(Long.valueOf(c20424714w1.LIZ));
                    c1cqy.setEnd(Boolean.valueOf(c20424714w1.LIZIZ));
                    c1cqy.setComment(c20424714w1.LIZJ);
                    c1cqy.setTips(c20424714w1.LIZLLL);
                    c1cqy.setPrev(c20424714w1.LJI);
                    c1cqy.setBranches(c20424714w1.LJII);
                } else {
                    c1cqy = null;
                }
                interfaceC2230131CQh.setParallelStateData(c1cqy);
                arrayList2.add(xBaseModelLIZJ3);
            }
            c1cql.setStates(arrayList2);
            c1co6.setRootFlow(c1cql);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
