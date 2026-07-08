package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.152k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204556152k extends AbstractC204552152g {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C20425514w9 c20425514w9;
        String containerID2;
        String containerID3;
        InterfaceC204557152l interfaceC204557152l;
        InterfaceC204555152j interfaceC204555152j = (InterfaceC204555152j) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        InterfaceC204558152m interfaceC204558152m = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c20425514w9 = (C20425514w9) c1537480q70LIZIZ.LJFF(C20425514w9.class)) != null) {
            C20425114w5 c20425114w5LJIIIZ = c20425514w9.LJIIIZ(interfaceC204555152j.getVersion().longValue(), interfaceC204555152j.getMinAppVersion().longValue(), interfaceC204555152j.getStateName(), interfaceC204555152j.getComment(), interfaceC204555152j.getParameter(), "");
            if (c20425114w5LJIIIZ != null) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC204553152h.class, containerID2);
                InterfaceC204553152h interfaceC204553152h = (InterfaceC204553152h) xBaseModelLIZJ;
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID3 = interfaceC634840OvC3.getContainerID();
                } else {
                    containerID3 = null;
                }
                InterfaceC204559152n interfaceC204559152n = (InterfaceC204559152n) C1909107dp.LIZJ(InterfaceC204559152n.class, containerID3);
                interfaceC204559152n.setId(Long.valueOf(c20425114w5LJIIIZ.LIZ));
                interfaceC204559152n.setStateType(c20425114w5LJIIIZ.LIZIZ);
                C20424814w2 c20424814w2 = c20425114w5LJIIIZ.LIZJ;
                if (c20424814w2 != null) {
                    interfaceC204557152l = (InterfaceC204557152l) C1909107dp.LIZJ(InterfaceC204557152l.class, null);
                    interfaceC204557152l.setNext(Long.valueOf(c20424814w2.LIZ));
                    interfaceC204557152l.setEnd(Boolean.valueOf(c20424814w2.LIZIZ));
                    interfaceC204557152l.setName(c20424814w2.LIZJ);
                    interfaceC204557152l.setComment(c20424814w2.LIZLLL);
                    interfaceC204557152l.setPrev(c20424814w2.LJ);
                    interfaceC204557152l.setVersion(Long.valueOf(c20424814w2.LJFF));
                    interfaceC204557152l.setMinAppVersion(Long.valueOf(c20424814w2.LJI));
                    interfaceC204557152l.setParameter(c20424814w2.LJII);
                } else {
                    interfaceC204557152l = null;
                }
                interfaceC204559152n.setTaskStateData(interfaceC204557152l);
                C20424714w1 c20424714w1 = c20425114w5LJIIIZ.LIZLLL;
                if (c20424714w1 != null) {
                    interfaceC204558152m = (InterfaceC204558152m) C1909107dp.LIZJ(InterfaceC204558152m.class, null);
                    interfaceC204558152m.setNext(Long.valueOf(c20424714w1.LIZ));
                    interfaceC204558152m.setEnd(Boolean.valueOf(c20424714w1.LIZIZ));
                    interfaceC204558152m.setComment(c20424714w1.LIZJ);
                    interfaceC204558152m.setTips(c20424714w1.LIZLLL);
                    interfaceC204558152m.setPrev(c20424714w1.LJI);
                    interfaceC204558152m.setBranches(c20424714w1.LJII);
                }
                interfaceC204559152n.setParallelStateData(interfaceC204558152m);
                interfaceC204553152h.setState(interfaceC204559152n);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
