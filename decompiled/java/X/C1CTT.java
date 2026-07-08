package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1CTT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CTT extends C1CTU {
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
        String containerID6;
        C1CTW c1ctw;
        InterfaceC2230841CTa interfaceC2230841CTa;
        String containerID7;
        String containerID8;
        String containerID9;
        InterfaceC2230901CTg interfaceC2230901CTg = (InterfaceC2230901CTg) xBaseParamModel;
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
            List<Number> prevStateIds = interfaceC2230901CTg.getPrevStateIds();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(prevStateIds, 10));
            Iterator<Number> it2 = prevStateIds.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().longValue()));
            }
            long jLongValue = interfaceC2230901CTg.getNextStateId().longValue();
            InterfaceC2230911CTh state = interfaceC2230901CTg.getState();
            long jLongValue2 = state.getId().longValue();
            String stateType = state.getStateType();
            C1CTY taskStateData = state.getTaskStateData();
            if (taskStateData != null) {
                long jLongValue3 = taskStateData.getNext().longValue();
                boolean end = taskStateData.getEnd();
                String name = taskStateData.getName();
                String comment = taskStateData.getComment();
                List<Number> prev = taskStateData.getPrev();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(prev, 10));
                Iterator<Number> it3 = prev.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Long.valueOf(it3.next().longValue()));
                }
                c20424814w2 = new C20424814w2(jLongValue3, end, name, comment, arrayList2, taskStateData.getVersion().longValue(), taskStateData.getMinAppVersion().longValue(), taskStateData.getParameter(), "");
            } else {
                c20424814w2 = null;
            }
            InterfaceC2230861CTc parallelStateData = state.getParallelStateData();
            if (parallelStateData != null) {
                long jLongValue4 = parallelStateData.getNext().longValue();
                boolean end2 = parallelStateData.getEnd();
                String comment2 = parallelStateData.getComment();
                String tips = parallelStateData.getTips();
                List<Number> prev2 = parallelStateData.getPrev();
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(prev2, 10));
                Iterator<Number> it4 = prev2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Long.valueOf(it4.next().longValue()));
                }
                List<Number> branches = parallelStateData.getBranches();
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(branches, 10));
                Iterator<Number> it5 = branches.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(Long.valueOf(it5.next().longValue()));
                }
                c20424714w1 = new C20424714w1(jLongValue4, end2, comment2, tips, null, null, arrayList3, arrayList4);
            } else {
                c20424714w1 = null;
            }
            C20426114wF c20426114wFLJI = c20425514w9.LJI(arrayList, jLongValue, new C20425114w5(jLongValue2, stateType, c20424814w2, c20424714w1));
            if (c20426114wFLJI != null) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1CTQ.class, containerID2);
                C1CTQ c1ctq = (C1CTQ) xBaseModelLIZJ;
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID3 = interfaceC634840OvC3.getContainerID();
                } else {
                    containerID3 = null;
                }
                C1CTO c1cto = (C1CTO) C1909107dp.LIZJ(C1CTO.class, containerID3);
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID4 = interfaceC634840OvC4.getContainerID();
                } else {
                    containerID4 = null;
                }
                C1CTM c1ctm = (C1CTM) C1909107dp.LIZJ(C1CTM.class, containerID4);
                c1ctm.setErrCode(0);
                c1ctm.setErrMsg("");
                c1cto.setError(c1ctm);
                c1cto.setSyeNewStateId(0);
                InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
                if (interfaceC634840OvC5 != null) {
                    containerID5 = interfaceC634840OvC5.getContainerID();
                } else {
                    containerID5 = null;
                }
                InterfaceC2230881CTe interfaceC2230881CTe = (InterfaceC2230881CTe) C1909107dp.LIZJ(InterfaceC2230881CTe.class, containerID5);
                interfaceC2230881CTe.setStartAtFlowId(Long.valueOf(c20426114wFLJI.LIZ));
                interfaceC2230881CTe.setMinAppVersion(Long.valueOf(c20426114wFLJI.LIZIZ));
                ArrayList arrayList5 = new ArrayList();
                for (C20426414wI c20426414wI : c20426114wFLJI.LIZJ) {
                    InterfaceC634840OvC interfaceC634840OvC6 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC6 != null) {
                        containerID9 = interfaceC634840OvC6.getContainerID();
                    } else {
                        containerID9 = null;
                    }
                    XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC2230951CTl.class, containerID9);
                    InterfaceC2230951CTl interfaceC2230951CTl = (InterfaceC2230951CTl) xBaseModelLIZJ2;
                    interfaceC2230951CTl.setId(Long.valueOf(c20426414wI.LIZ));
                    interfaceC2230951CTl.setStartAt(Long.valueOf(c20426414wI.LIZIZ));
                    interfaceC2230951CTl.setEndAt(Long.valueOf(c20426414wI.LIZJ));
                    arrayList5.add(xBaseModelLIZJ2);
                }
                interfaceC2230881CTe.setFlows(arrayList5);
                ArrayList arrayList6 = new ArrayList();
                for (C20425114w5 c20425114w5 : c20426114wFLJI.LIZLLL) {
                    InterfaceC634840OvC interfaceC634840OvC7 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC7 != null) {
                        containerID6 = interfaceC634840OvC7.getContainerID();
                    } else {
                        containerID6 = null;
                    }
                    XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC2230921CTi.class, containerID6);
                    InterfaceC2230921CTi interfaceC2230921CTi = (InterfaceC2230921CTi) xBaseModelLIZJ3;
                    interfaceC2230921CTi.setId(Long.valueOf(c20425114w5.LIZ));
                    interfaceC2230921CTi.setStateType(c20425114w5.LIZIZ);
                    C20424814w2 c20424814w22 = c20425114w5.LIZJ;
                    if (c20424814w22 != null) {
                        InterfaceC634840OvC interfaceC634840OvC8 = this.IBridgeSdkContext;
                        if (interfaceC634840OvC8 != null) {
                            containerID8 = interfaceC634840OvC8.getContainerID();
                        } else {
                            containerID8 = null;
                        }
                        c1ctw = (C1CTW) C1909107dp.LIZJ(C1CTW.class, containerID8);
                        c1ctw.setNext(Long.valueOf(c20424814w22.LIZ));
                        c1ctw.setEnd(Boolean.valueOf(c20424814w22.LIZIZ));
                        c1ctw.setName(c20424814w22.LIZJ);
                        c1ctw.setComment(c20424814w22.LIZLLL);
                        c1ctw.setPrev(c20424814w22.LJ);
                        c1ctw.setVersion(Long.valueOf(c20424814w22.LJFF));
                        c1ctw.setMinAppVersion(Long.valueOf(c20424814w22.LJI));
                        c1ctw.setParameter(c20424814w22.LJII);
                    } else {
                        c1ctw = null;
                    }
                    interfaceC2230921CTi.setTaskStateData(c1ctw);
                    C20424714w1 c20424714w12 = c20425114w5.LIZLLL;
                    if (c20424714w12 != null) {
                        InterfaceC634840OvC interfaceC634840OvC9 = this.IBridgeSdkContext;
                        if (interfaceC634840OvC9 != null) {
                            containerID7 = interfaceC634840OvC9.getContainerID();
                        } else {
                            containerID7 = null;
                        }
                        interfaceC2230841CTa = (InterfaceC2230841CTa) C1909107dp.LIZJ(InterfaceC2230841CTa.class, containerID7);
                        interfaceC2230841CTa.setNext(Long.valueOf(c20424714w12.LIZ));
                        interfaceC2230841CTa.setEnd(Boolean.valueOf(c20424714w12.LIZIZ));
                        interfaceC2230841CTa.setComment(c20424714w12.LIZJ);
                        interfaceC2230841CTa.setTips(c20424714w12.LIZLLL);
                        interfaceC2230841CTa.setPrev(c20424714w12.LJI);
                        interfaceC2230841CTa.setBranches(c20424714w12.LJII);
                    } else {
                        interfaceC2230841CTa = null;
                    }
                    interfaceC2230921CTi.setParallelStateData(interfaceC2230841CTa);
                    arrayList6.add(xBaseModelLIZJ3);
                }
                interfaceC2230881CTe.setStates(arrayList6);
                c1cto.setSyeNewRootFlow(interfaceC2230881CTe);
                c1ctq.setEditStateResult(c1cto);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
