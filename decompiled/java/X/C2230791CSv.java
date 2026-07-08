package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS35S0200100_31;

/* JADX INFO: renamed from: X.1CSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230791CSv extends AbstractC2230801CSw {
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
        InterfaceC2230811CSx interfaceC2230811CSx;
        InterfaceC2230761CSs interfaceC2230761CSs;
        C1CT4 c1ct4 = (C1CT4) xBaseParamModel;
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
            long jLongValue = c1ct4.getParallelStateId().longValue();
            long jLongValue2 = c1ct4.getState().getId().longValue();
            String stateType = c1ct4.getState().getStateType();
            InterfaceC2230821CSy taskStateData = c1ct4.getState().getTaskStateData();
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
            InterfaceC2230831CSz parallelStateData = c1ct4.getState().getParallelStateData();
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
            C20426214wG c20426214wG = (C20426214wG) c20425514w9.LJIILIIL(true, null, "appendSingleStateBranch", new AwS35S0200100_31(jLongValue, C20424614w0.LIZ(new C20425114w5(jLongValue2, stateType, c20424814w2, c20424714w1)), c20425514w9, 1));
            if (c20426214wG != null) {
                C20426114wF c20426114wF = new C20426114wF(c20426214wG);
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C1CT5.class, containerID2);
                C1CT5 c1ct5 = (C1CT5) xBaseModelLIZJ;
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID3 = interfaceC634840OvC3.getContainerID();
                } else {
                    containerID3 = null;
                }
                C1CT3 c1ct3 = (C1CT3) C1909107dp.LIZJ(C1CT3.class, containerID3);
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID4 = interfaceC634840OvC4.getContainerID();
                } else {
                    containerID4 = null;
                }
                InterfaceC2230771CSt interfaceC2230771CSt = (InterfaceC2230771CSt) C1909107dp.LIZJ(InterfaceC2230771CSt.class, containerID4);
                interfaceC2230771CSt.setErrCode(0);
                interfaceC2230771CSt.setErrMsg("");
                c1ct3.setError(interfaceC2230771CSt);
                c1ct3.setSyeNewBranchId(0);
                c1ct3.setSyeNewStateId(0);
                InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
                if (interfaceC634840OvC5 != null) {
                    containerID5 = interfaceC634840OvC5.getContainerID();
                } else {
                    containerID5 = null;
                }
                C1CT0 c1ct0 = (C1CT0) C1909107dp.LIZJ(C1CT0.class, containerID5);
                c1ct0.setStartAtFlowId(Long.valueOf(c20426114wF.LIZ));
                c1ct0.setMinAppVersion(Long.valueOf(c20426114wF.LIZIZ));
                ArrayList arrayList4 = new ArrayList();
                for (C20426414wI c20426414wI : c20426114wF.LIZJ) {
                    XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC2230781CSu.class, null);
                    InterfaceC2230781CSu interfaceC2230781CSu = (InterfaceC2230781CSu) xBaseModelLIZJ2;
                    interfaceC2230781CSu.setId(Long.valueOf(c20426414wI.LIZ));
                    interfaceC2230781CSu.setStartAt(Long.valueOf(c20426414wI.LIZIZ));
                    interfaceC2230781CSu.setEndAt(Long.valueOf(c20426414wI.LIZJ));
                    arrayList4.add(xBaseModelLIZJ2);
                }
                c1ct0.setFlows(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (C20425114w5 c20425114w5 : c20426114wF.LIZLLL) {
                    XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(C1CT2.class, null);
                    C1CT2 c1ct2 = (C1CT2) xBaseModelLIZJ3;
                    c1ct2.setId(Long.valueOf(c20425114w5.LIZ));
                    c1ct2.setStateType(c20425114w5.LIZIZ);
                    C20424814w2 c20424814w22 = c20425114w5.LIZJ;
                    if (c20424814w22 != null) {
                        interfaceC2230811CSx = (InterfaceC2230811CSx) C1909107dp.LIZJ(InterfaceC2230811CSx.class, null);
                        interfaceC2230811CSx.setNext(Long.valueOf(c20424814w22.LIZ));
                        interfaceC2230811CSx.setEnd(Boolean.valueOf(c20424814w22.LIZIZ));
                        interfaceC2230811CSx.setName(c20424814w22.LIZJ);
                        interfaceC2230811CSx.setComment(c20424814w22.LIZLLL);
                        interfaceC2230811CSx.setPrev(c20424814w22.LJ);
                        interfaceC2230811CSx.setVersion(Long.valueOf(c20424814w22.LJFF));
                        interfaceC2230811CSx.setMinAppVersion(Long.valueOf(c20424814w22.LJI));
                        interfaceC2230811CSx.setParameter(c20424814w22.LJII);
                    } else {
                        interfaceC2230811CSx = null;
                    }
                    c1ct2.setTaskStateData(interfaceC2230811CSx);
                    C20424714w1 c20424714w12 = c20425114w5.LIZLLL;
                    if (c20424714w12 != null) {
                        interfaceC2230761CSs = (InterfaceC2230761CSs) C1909107dp.LIZJ(InterfaceC2230761CSs.class, null);
                        interfaceC2230761CSs.setNext(Long.valueOf(c20424714w12.LIZ));
                        interfaceC2230761CSs.setEnd(Boolean.valueOf(c20424714w12.LIZIZ));
                        interfaceC2230761CSs.setComment(c20424714w12.LIZJ);
                        interfaceC2230761CSs.setTips(c20424714w12.LIZLLL);
                        interfaceC2230761CSs.setPrev(c20424714w12.LJI);
                        interfaceC2230761CSs.setBranches(c20424714w12.LJII);
                    } else {
                        interfaceC2230761CSs = null;
                    }
                    c1ct2.setParallelStateData(interfaceC2230761CSs);
                    arrayList5.add(xBaseModelLIZJ3);
                }
                c1ct0.setStates(arrayList5);
                c1ct3.setSyeNewRootFlow(c1ct0);
                c1ct5.setEditBranchResult(c1ct3);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
