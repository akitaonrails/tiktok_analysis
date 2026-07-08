package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1CU0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CU0 extends C1CU1 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C20425514w9 c20425514w9;
        String containerID2;
        C20424814w2 c20424814w2;
        C20424714w1 c20424714w1;
        C1CU7 c1cu7 = (C1CU7) xBaseParamModel;
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
            C1CU4 rootFlow = c1cu7.getRootFlow();
            long jLongValue = rootFlow.getStartAtFlowId().longValue();
            long jLongValue2 = rootFlow.getMinAppVersion().longValue();
            ArrayList arrayList = new ArrayList();
            for (C1CU6 c1cu6 : rootFlow.getFlows()) {
                arrayList.add(new C20426414wI(c1cu6.getId().longValue(), c1cu6.getStartAt().longValue(), c1cu6.getEndAt().longValue()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (C1CU5 c1cu5 : rootFlow.getStates()) {
                long jLongValue3 = c1cu5.getId().longValue();
                String stateType = c1cu5.getStateType();
                C1CU2 taskStateData = c1cu5.getTaskStateData();
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
                C1CU3 parallelStateData = c1cu5.getParallelStateData();
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
            String strLIZLLL = c20425514w9.LIZLLL(new C20426114wF(arrayList, arrayList2, jLongValue, jLongValue2));
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            } else {
                containerID2 = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1CU8.class, containerID2);
            ((C1CU8) xBaseModelLIZJ).setFlowString(strLIZLLL);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
