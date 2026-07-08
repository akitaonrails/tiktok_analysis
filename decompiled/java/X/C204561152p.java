package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.152p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204561152p extends AbstractC204562152q {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C20425514w9 c20425514w9;
        C20426114wF c20426114wFLJIIL;
        String containerID2;
        String containerID3;
        String containerID4;
        String containerID5;
        String containerID6;
        InterfaceC204563152r interfaceC204563152r;
        InterfaceC204560152o interfaceC204560152o;
        String containerID7;
        String containerID8;
        String containerID9;
        InterfaceC20431514x7 interfaceC20431514x7 = (InterfaceC20431514x7) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c20425514w9 = (C20425514w9) c1537480q70LIZIZ.LJFF(C20425514w9.class)) != null && (c20426114wFLJIIL = c20425514w9.LJIIL(interfaceC20431514x7.getStateId().longValue())) != null) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            } else {
                containerID2 = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC204568152w.class, containerID2);
            InterfaceC204568152w interfaceC204568152w = (InterfaceC204568152w) xBaseModelLIZJ;
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                containerID3 = interfaceC634840OvC3.getContainerID();
            } else {
                containerID3 = null;
            }
            InterfaceC204566152u interfaceC204566152u = (InterfaceC204566152u) C1909107dp.LIZJ(InterfaceC204566152u.class, containerID3);
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            if (interfaceC634840OvC4 != null) {
                containerID4 = interfaceC634840OvC4.getContainerID();
            } else {
                containerID4 = null;
            }
            InterfaceC204569152x interfaceC204569152x = (InterfaceC204569152x) C1909107dp.LIZJ(InterfaceC204569152x.class, containerID4);
            interfaceC204569152x.setErrCode(0);
            interfaceC204569152x.setErrMsg("");
            interfaceC204566152u.setError(interfaceC204569152x);
            interfaceC204566152u.setSyeNewStateId(0);
            InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
            if (interfaceC634840OvC5 != null) {
                containerID5 = interfaceC634840OvC5.getContainerID();
            } else {
                containerID5 = null;
            }
            InterfaceC204564152s interfaceC204564152s = (InterfaceC204564152s) C1909107dp.LIZJ(InterfaceC204564152s.class, containerID5);
            interfaceC204564152s.setStartAtFlowId(Long.valueOf(c20426114wFLJIIL.LIZ));
            interfaceC204564152s.setMinAppVersion(Long.valueOf(c20426114wFLJIIL.LIZIZ));
            ArrayList arrayList = new ArrayList();
            for (C20426414wI c20426414wI : c20426114wFLJIIL.LIZJ) {
                InterfaceC634840OvC interfaceC634840OvC6 = this.IBridgeSdkContext;
                if (interfaceC634840OvC6 != null) {
                    containerID9 = interfaceC634840OvC6.getContainerID();
                } else {
                    containerID9 = null;
                }
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC204567152v.class, containerID9);
                InterfaceC204567152v interfaceC204567152v = (InterfaceC204567152v) xBaseModelLIZJ2;
                interfaceC204567152v.setId(Long.valueOf(c20426414wI.LIZ));
                interfaceC204567152v.setStartAt(Long.valueOf(c20426414wI.LIZIZ));
                interfaceC204567152v.setEndAt(Long.valueOf(c20426414wI.LIZJ));
                arrayList.add(xBaseModelLIZJ2);
            }
            interfaceC204564152s.setFlows(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (C20425114w5 c20425114w5 : c20426114wFLJIIL.LIZLLL) {
                InterfaceC634840OvC interfaceC634840OvC7 = this.IBridgeSdkContext;
                if (interfaceC634840OvC7 != null) {
                    containerID6 = interfaceC634840OvC7.getContainerID();
                } else {
                    containerID6 = null;
                }
                XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC204565152t.class, containerID6);
                InterfaceC204565152t interfaceC204565152t = (InterfaceC204565152t) xBaseModelLIZJ3;
                interfaceC204565152t.setId(Long.valueOf(c20425114w5.LIZ));
                interfaceC204565152t.setStateType(c20425114w5.LIZIZ);
                C20424814w2 c20424814w2 = c20425114w5.LIZJ;
                if (c20424814w2 != null) {
                    InterfaceC634840OvC interfaceC634840OvC8 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC8 != null) {
                        containerID8 = interfaceC634840OvC8.getContainerID();
                    } else {
                        containerID8 = null;
                    }
                    interfaceC204563152r = (InterfaceC204563152r) C1909107dp.LIZJ(InterfaceC204563152r.class, containerID8);
                    interfaceC204563152r.setNext(Long.valueOf(c20424814w2.LIZ));
                    interfaceC204563152r.setEnd(Boolean.valueOf(c20424814w2.LIZIZ));
                    interfaceC204563152r.setName(c20424814w2.LIZJ);
                    interfaceC204563152r.setComment(c20424814w2.LIZLLL);
                    interfaceC204563152r.setPrev(c20424814w2.LJ);
                    interfaceC204563152r.setVersion(Long.valueOf(c20424814w2.LJFF));
                    interfaceC204563152r.setMinAppVersion(Long.valueOf(c20424814w2.LJI));
                    interfaceC204563152r.setParameter(c20424814w2.LJII);
                } else {
                    interfaceC204563152r = null;
                }
                interfaceC204565152t.setTaskStateData(interfaceC204563152r);
                C20424714w1 c20424714w1 = c20425114w5.LIZLLL;
                if (c20424714w1 != null) {
                    InterfaceC634840OvC interfaceC634840OvC9 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC9 != null) {
                        containerID7 = interfaceC634840OvC9.getContainerID();
                    } else {
                        containerID7 = null;
                    }
                    interfaceC204560152o = (InterfaceC204560152o) C1909107dp.LIZJ(InterfaceC204560152o.class, containerID7);
                    interfaceC204560152o.setNext(Long.valueOf(c20424714w1.LIZ));
                    interfaceC204560152o.setEnd(Boolean.valueOf(c20424714w1.LIZIZ));
                    interfaceC204560152o.setComment(c20424714w1.LIZJ);
                    interfaceC204560152o.setTips(c20424714w1.LIZLLL);
                    interfaceC204560152o.setPrev(c20424714w1.LJI);
                    interfaceC204560152o.setBranches(c20424714w1.LJII);
                } else {
                    interfaceC204560152o = null;
                }
                interfaceC204565152t.setParallelStateData(interfaceC204560152o);
                arrayList2.add(xBaseModelLIZJ3);
            }
            interfaceC204564152s.setStates(arrayList2);
            interfaceC204566152u.setSyeNewRootFlow(interfaceC204564152s);
            interfaceC204568152w.setEditStateResult(interfaceC204566152u);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
