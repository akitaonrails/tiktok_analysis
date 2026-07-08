package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.1537, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1537 extends AnonymousClass1538 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C20425514w9 c20425514w9;
        C20426214wG c20426214wG;
        String containerID2;
        String containerID3;
        AnonymousClass1539 anonymousClass1539;
        C153A c153a;
        String containerID4;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c20425514w9 = (C20425514w9) c1537480q70LIZIZ.LJFF(C20425514w9.class)) != null && (c20426214wG = (C20426214wG) c20425514w9.LJIILIIL(true, null, "newRootFlow", new AwS610S0100000_31(c20425514w9, 431))) != null) {
            C20426114wF c20426114wF = new C20426114wF(c20426214wG);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            } else {
                containerID2 = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C153E.class, containerID2);
            C153E c153e = (C153E) xBaseModelLIZJ;
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                containerID3 = interfaceC634840OvC3.getContainerID();
            } else {
                containerID3 = null;
            }
            C153B c153b = (C153B) C1909107dp.LIZJ(C153B.class, containerID3);
            c153b.setStartAtFlowId(Long.valueOf(c20426114wF.LIZ));
            c153b.setMinAppVersion(Long.valueOf(c20426114wF.LIZIZ));
            ArrayList arrayList = new ArrayList();
            for (C20426414wI c20426414wI : c20426114wF.LIZJ) {
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID4 = interfaceC634840OvC4.getContainerID();
                } else {
                    containerID4 = null;
                }
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C153D.class, containerID4);
                C153D c153d = (C153D) xBaseModelLIZJ2;
                c153d.setId(Long.valueOf(c20426414wI.LIZ));
                c153d.setStartAt(Long.valueOf(c20426414wI.LIZIZ));
                c153d.setEndAt(Long.valueOf(c20426414wI.LIZJ));
                arrayList.add(xBaseModelLIZJ2);
            }
            c153b.setFlows(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (C20425114w5 c20425114w5 : c20426114wF.LIZLLL) {
                XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(C153C.class, null);
                C153C c153c = (C153C) xBaseModelLIZJ3;
                c153c.setId(Long.valueOf(c20425114w5.LIZ));
                c153c.setStateType(c20425114w5.LIZIZ);
                C20424814w2 c20424814w2 = c20425114w5.LIZJ;
                if (c20424814w2 != null) {
                    anonymousClass1539 = (AnonymousClass1539) C1909107dp.LIZJ(AnonymousClass1539.class, null);
                    anonymousClass1539.setNext(Long.valueOf(c20424814w2.LIZ));
                    anonymousClass1539.setEnd(Boolean.valueOf(c20424814w2.LIZIZ));
                    anonymousClass1539.setName(c20424814w2.LIZJ);
                    anonymousClass1539.setComment(c20424814w2.LIZLLL);
                    anonymousClass1539.setPrev(c20424814w2.LJ);
                    anonymousClass1539.setVersion(Long.valueOf(c20424814w2.LJFF));
                    anonymousClass1539.setMinAppVersion(Long.valueOf(c20424814w2.LJI));
                    anonymousClass1539.setParameter(c20424814w2.LJII);
                } else {
                    anonymousClass1539 = null;
                }
                c153c.setTaskStateData(anonymousClass1539);
                C20424714w1 c20424714w1 = c20425114w5.LIZLLL;
                if (c20424714w1 != null) {
                    c153a = (C153A) C1909107dp.LIZJ(C153A.class, null);
                    c153a.setNext(Long.valueOf(c20424714w1.LIZ));
                    c153a.setEnd(Boolean.valueOf(c20424714w1.LIZIZ));
                    c153a.setComment(c20424714w1.LIZJ);
                    c153a.setTips(c20424714w1.LIZLLL);
                    c153a.setPrev(c20424714w1.LJI);
                    c153a.setBranches(c20424714w1.LJII);
                } else {
                    c153a = null;
                }
                c153c.setParallelStateData(c153a);
                arrayList2.add(xBaseModelLIZJ3);
            }
            c153b.setStates(arrayList2);
            c153e.setRootFlow(c153b);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
