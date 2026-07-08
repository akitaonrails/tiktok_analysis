package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1CTS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CTS extends C1CTV {
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
        C1CTX c1ctx;
        InterfaceC2230851CTb interfaceC2230851CTb;
        String containerID6;
        InterfaceC2230971CTn interfaceC2230971CTn = (InterfaceC2230971CTn) xBaseParamModel;
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
            InterfaceC2230931CTj state = interfaceC2230971CTn.getState();
            long jLongValue = state.getId().longValue();
            String stateType = state.getStateType();
            C1CTZ taskStateData = state.getTaskStateData();
            if (taskStateData != null) {
                long jLongValue2 = taskStateData.getNext().longValue();
                boolean end = taskStateData.getEnd();
                String name = taskStateData.getName();
                String comment = taskStateData.getComment();
                List<Number> prev = taskStateData.getPrev();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(prev, 10));
                Iterator<Number> it2 = prev.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().longValue()));
                }
                c20424814w2 = new C20424814w2(jLongValue2, end, name, comment, arrayList, taskStateData.getVersion().longValue(), taskStateData.getMinAppVersion().longValue(), taskStateData.getParameter(), "");
            } else {
                c20424814w2 = null;
            }
            InterfaceC2230871CTd parallelStateData = state.getParallelStateData();
            if (parallelStateData != null) {
                long jLongValue3 = parallelStateData.getNext().longValue();
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
                c20424714w1 = new C20424714w1(jLongValue3, end2, comment2, tips, null, null, arrayList2, arrayList3);
            } else {
                c20424714w1 = null;
            }
            C20426114wF c20426114wFLJII = c20425514w9.LJII(new C20425114w5(jLongValue, stateType, c20424814w2, c20424714w1));
            if (c20426114wFLJII != null) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1CTR.class, containerID2);
                C1CTR c1ctr = (C1CTR) xBaseModelLIZJ;
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID3 = interfaceC634840OvC3.getContainerID();
                } else {
                    containerID3 = null;
                }
                C1CTP c1ctp = (C1CTP) C1909107dp.LIZJ(C1CTP.class, containerID3);
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID4 = interfaceC634840OvC4.getContainerID();
                } else {
                    containerID4 = null;
                }
                C1CTN c1ctn = (C1CTN) C1909107dp.LIZJ(C1CTN.class, containerID4);
                c1ctn.setErrCode(0);
                c1ctn.setErrMsg("");
                c1ctp.setError(c1ctn);
                c1ctp.setSyeNewStateId(0);
                InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
                if (interfaceC634840OvC5 != null) {
                    containerID5 = interfaceC634840OvC5.getContainerID();
                } else {
                    containerID5 = null;
                }
                InterfaceC2230891CTf interfaceC2230891CTf = (InterfaceC2230891CTf) C1909107dp.LIZJ(InterfaceC2230891CTf.class, containerID5);
                interfaceC2230891CTf.setStartAtFlowId(Long.valueOf(c20426114wFLJII.LIZ));
                interfaceC2230891CTf.setMinAppVersion(Long.valueOf(c20426114wFLJII.LIZIZ));
                ArrayList arrayList4 = new ArrayList();
                for (C20426414wI c20426414wI : c20426114wFLJII.LIZJ) {
                    InterfaceC634840OvC interfaceC634840OvC6 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC6 != null) {
                        containerID6 = interfaceC634840OvC6.getContainerID();
                    } else {
                        containerID6 = null;
                    }
                    XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC2230961CTm.class, containerID6);
                    InterfaceC2230961CTm interfaceC2230961CTm = (InterfaceC2230961CTm) xBaseModelLIZJ2;
                    interfaceC2230961CTm.setId(Long.valueOf(c20426414wI.LIZ));
                    interfaceC2230961CTm.setStartAt(Long.valueOf(c20426414wI.LIZIZ));
                    interfaceC2230961CTm.setEndAt(Long.valueOf(c20426414wI.LIZJ));
                    arrayList4.add(xBaseModelLIZJ2);
                }
                interfaceC2230891CTf.setFlows(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (C20425114w5 c20425114w5 : c20426114wFLJII.LIZLLL) {
                    XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC2230941CTk.class, null);
                    InterfaceC2230941CTk interfaceC2230941CTk = (InterfaceC2230941CTk) xBaseModelLIZJ3;
                    interfaceC2230941CTk.setId(Long.valueOf(c20425114w5.LIZ));
                    interfaceC2230941CTk.setStateType(c20425114w5.LIZIZ);
                    C20424814w2 c20424814w22 = c20425114w5.LIZJ;
                    if (c20424814w22 != null) {
                        c1ctx = (C1CTX) C1909107dp.LIZJ(C1CTX.class, null);
                        c1ctx.setNext(Long.valueOf(c20424814w22.LIZ));
                        c1ctx.setEnd(Boolean.valueOf(c20424814w22.LIZIZ));
                        c1ctx.setName(c20424814w22.LIZJ);
                        c1ctx.setComment(c20424814w22.LIZLLL);
                        c1ctx.setPrev(c20424814w22.LJ);
                        c1ctx.setVersion(Long.valueOf(c20424814w22.LJFF));
                        c1ctx.setMinAppVersion(Long.valueOf(c20424814w22.LJI));
                        c1ctx.setParameter(c20424814w22.LJII);
                    } else {
                        c1ctx = null;
                    }
                    interfaceC2230941CTk.setTaskStateData(c1ctx);
                    C20424714w1 c20424714w12 = c20425114w5.LIZLLL;
                    if (c20424714w12 != null) {
                        interfaceC2230851CTb = (InterfaceC2230851CTb) C1909107dp.LIZJ(InterfaceC2230851CTb.class, null);
                        interfaceC2230851CTb.setNext(Long.valueOf(c20424714w12.LIZ));
                        interfaceC2230851CTb.setEnd(Boolean.valueOf(c20424714w12.LIZIZ));
                        interfaceC2230851CTb.setComment(c20424714w12.LIZJ);
                        interfaceC2230851CTb.setTips(c20424714w12.LIZLLL);
                        interfaceC2230851CTb.setPrev(c20424714w12.LJI);
                        interfaceC2230851CTb.setBranches(c20424714w12.LJII);
                    } else {
                        interfaceC2230851CTb = null;
                    }
                    interfaceC2230941CTk.setParallelStateData(interfaceC2230851CTb);
                    arrayList5.add(xBaseModelLIZJ3);
                }
                interfaceC2230891CTf.setStates(arrayList5);
                c1ctp.setSyeNewRootFlow(interfaceC2230891CTf);
                c1ctr.setEditStateResult(c1ctp);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
