package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.1CTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231011CTr extends AbstractC2231021CTs {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C20425514w9 c20425514w9;
        C20424814w2 c20424814w2;
        C20424714w1 c20424714w1;
        InterfaceC2231041CTu rootFlow = ((InterfaceC2231071CTx) xBaseParamModel).getRootFlow();
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c20425514w9 = (C20425514w9) c1537480q70LIZIZ.LJFF(C20425514w9.class)) != null) {
            C20441214yg.LIZIZ("StartEditMethod", "startEdit");
            long jLongValue = rootFlow.getStartAtFlowId().longValue();
            long jLongValue2 = rootFlow.getMinAppVersion().longValue();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC2231061CTw interfaceC2231061CTw : rootFlow.getFlows()) {
                arrayList.add(new C20426414wI(interfaceC2231061CTw.getId().longValue(), interfaceC2231061CTw.getStartAt().longValue(), interfaceC2231061CTw.getEndAt().longValue()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC2231051CTv interfaceC2231051CTv : rootFlow.getStates()) {
                long jLongValue3 = interfaceC2231051CTv.getId().longValue();
                String stateType = interfaceC2231051CTv.getStateType();
                InterfaceC2231031CTt taskStateData = interfaceC2231051CTv.getTaskStateData();
                if (taskStateData != null) {
                    long jLongValue4 = taskStateData.getNext().longValue();
                    boolean end = taskStateData.getEnd();
                    String name = taskStateData.getName();
                    String comment = taskStateData.getComment();
                    List<Number> prev = taskStateData.getPrev();
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(prev, 10));
                    Iterator<Number> it2 = prev.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Long.valueOf(it2.next().longValue()));
                    }
                    c20424814w2 = new C20424814w2(jLongValue4, end, name, comment, arrayList3, taskStateData.getVersion().longValue(), taskStateData.getMinAppVersion().longValue(), taskStateData.getParameter(), "");
                } else {
                    c20424814w2 = null;
                }
                InterfaceC2231001CTq parallelStateData = interfaceC2231051CTv.getParallelStateData();
                if (parallelStateData != null) {
                    long jLongValue5 = parallelStateData.getNext().longValue();
                    boolean end2 = parallelStateData.getEnd();
                    String comment2 = parallelStateData.getComment();
                    String tips = parallelStateData.getTips();
                    List<Number> prev2 = parallelStateData.getPrev();
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(prev2, 10));
                    Iterator<Number> it3 = prev2.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(Long.valueOf(it3.next().longValue()));
                    }
                    List<Number> branches = parallelStateData.getBranches();
                    ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(branches, 10));
                    Iterator<Number> it4 = branches.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(Long.valueOf(it4.next().longValue()));
                    }
                    c20424714w1 = new C20424714w1(jLongValue5, end2, comment2, tips, null, null, arrayList4, arrayList5);
                } else {
                    c20424714w1 = null;
                }
                arrayList2.add(new C20425114w5(jLongValue3, stateType, c20424814w2, c20424714w1));
            }
            c20425514w9.LJIILIIL(true, null, "startEdit", new AwS610S0100000_31(new C20426114wF(arrayList, arrayList2, jLongValue, jLongValue2), 432));
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC2231081CTy.class, null), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
