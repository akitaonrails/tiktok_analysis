package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1CTA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CTA extends C1CTB {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C20425514w9 c20425514w9;
        C20424814w2 c20424814w2;
        C20424714w1 c20424714w1;
        String containerID2;
        String containerID3;
        String containerID4;
        String containerID5;
        C1CTC c1ctc;
        C1CTE c1cte;
        C1CTI c1cti = (C1CTI) xBaseParamModel;
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
            long jLongValue = c1cti.getFlowId().longValue();
            C1CTG state = c1cti.getState();
            long jLongValue2 = state.getId().longValue();
            String stateType = state.getStateType();
            C1CTD taskStateData = state.getTaskStateData();
            if (taskStateData != null) {
                long jLongValue3 = taskStateData.getNext().longValue();
                boolean end = taskStateData.getEnd();
                String name = taskStateData.getName();
                String comment = taskStateData.getComment();
                List<Number> prev = taskStateData.getPrev();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(prev, 10));
                Iterator<Number> it2 = prev.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().longValue()));
                }
                c20424814w2 = new C20424814w2(jLongValue3, end, name, comment, arrayList, taskStateData.getVersion().longValue(), taskStateData.getMinAppVersion().longValue(), taskStateData.getParameter(), "");
            } else {
                c20424814w2 = null;
            }
            C1CTF parallelStateData = state.getParallelStateData();
            if (parallelStateData != null) {
                long jLongValue4 = parallelStateData.getNext().longValue();
                boolean end2 = parallelStateData.getEnd();
                String comment2 = parallelStateData.getComment();
                String tips = parallelStateData.getTips();
                List<Number> prev2 = parallelStateData.getPrev();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(prev2, 10));
                Iterator<Number> it3 = prev2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Long.valueOf(it3.next().longValue()));
                }
                List<Number> branches = parallelStateData.getBranches();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(branches, 10));
                Iterator<Number> it4 = branches.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Long.valueOf(it4.next().longValue()));
                }
                c20424714w1 = new C20424714w1(jLongValue4, end2, comment2, tips, null, null, arrayList2, arrayList3);
            } else {
                c20424714w1 = null;
            }
            C20426114wF c20426114wFLIZ = c20425514w9.LIZ(jLongValue, new C20425114w5(jLongValue2, stateType, c20424814w2, c20424714w1));
            if (c20426114wFLIZ != null) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1CTK.class, containerID2);
                C1CTK c1ctk = (C1CTK) xBaseModelLIZJ;
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID3 = interfaceC634840OvC3.getContainerID();
                } else {
                    containerID3 = null;
                }
                C1CT8 c1ct8 = (C1CT8) C1909107dp.LIZJ(C1CT8.class, containerID3);
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID4 = interfaceC634840OvC4.getContainerID();
                } else {
                    containerID4 = null;
                }
                C1CT7 c1ct7 = (C1CT7) C1909107dp.LIZJ(C1CT7.class, containerID4);
                c1ct7.setErrCode(0);
                c1ct7.setErrMsg("");
                c1ct8.setError(c1ct7);
                c1ct8.setSyeNewStateId(0);
                InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
                if (interfaceC634840OvC5 != null) {
                    containerID5 = interfaceC634840OvC5.getContainerID();
                } else {
                    containerID5 = null;
                }
                C1CT9 c1ct9 = (C1CT9) C1909107dp.LIZJ(C1CT9.class, containerID5);
                c1ct9.setStartAtFlowId(Long.valueOf(c20426114wFLIZ.LIZ));
                c1ct9.setMinAppVersion(Long.valueOf(c20426114wFLIZ.LIZIZ));
                ArrayList arrayList4 = new ArrayList();
                for (C20426414wI c20426414wI : c20426114wFLIZ.LIZJ) {
                    XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C1CTJ.class, null);
                    C1CTJ c1ctj = (C1CTJ) xBaseModelLIZJ2;
                    c1ctj.setId(Long.valueOf(c20426414wI.LIZ));
                    c1ctj.setStartAt(Long.valueOf(c20426414wI.LIZIZ));
                    c1ctj.setEndAt(Long.valueOf(c20426414wI.LIZJ));
                    arrayList4.add(xBaseModelLIZJ2);
                }
                c1ct9.setFlows(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (C20425114w5 c20425114w5 : c20426114wFLIZ.LIZLLL) {
                    XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(C1CTH.class, null);
                    C1CTH c1cth = (C1CTH) xBaseModelLIZJ3;
                    c1cth.setId(Long.valueOf(c20425114w5.LIZ));
                    c1cth.setStateType(c20425114w5.LIZIZ);
                    C20424814w2 c20424814w22 = c20425114w5.LIZJ;
                    if (c20424814w22 != null) {
                        c1ctc = (C1CTC) C1909107dp.LIZJ(C1CTC.class, null);
                        c1ctc.setNext(Long.valueOf(c20424814w22.LIZ));
                        c1ctc.setEnd(Boolean.valueOf(c20424814w22.LIZIZ));
                        c1ctc.setName(c20424814w22.LIZJ);
                        c1ctc.setComment(c20424814w22.LIZLLL);
                        c1ctc.setPrev(c20424814w22.LJ);
                        c1ctc.setVersion(Long.valueOf(c20424814w22.LJFF));
                        c1ctc.setMinAppVersion(Long.valueOf(c20424814w22.LJI));
                        c1ctc.setParameter(c20424814w22.LJII);
                    } else {
                        c1ctc = null;
                    }
                    c1cth.setTaskStateData(c1ctc);
                    C20424714w1 c20424714w12 = c20425114w5.LIZLLL;
                    if (c20424714w12 != null) {
                        c1cte = (C1CTE) C1909107dp.LIZJ(C1CTE.class, null);
                        c1cte.setNext(Long.valueOf(c20424714w12.LIZ));
                        c1cte.setEnd(Boolean.valueOf(c20424714w12.LIZIZ));
                        c1cte.setComment(c20424714w12.LIZJ);
                        c1cte.setTips(c20424714w12.LIZLLL);
                        c1cte.setPrev(c20424714w12.LJI);
                        c1cte.setBranches(c20424714w12.LJII);
                    } else {
                        c1cte = null;
                    }
                    c1cth.setParallelStateData(c1cte);
                    arrayList5.add(xBaseModelLIZJ3);
                }
                c1ct9.setStates(arrayList5);
                c1ct8.setSyeNewRootFlow(c1ct9);
                c1ctk.setEditStateResult(c1ct8);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
