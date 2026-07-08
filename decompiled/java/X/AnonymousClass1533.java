package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1533, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1533 extends AbstractC204571152z {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C20425514w9 c20425514w9;
        AnonymousClass1534 anonymousClass1534;
        AnonymousClass1531 anonymousClass1531 = (AnonymousClass1531) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        AnonymousClass1535 anonymousClass1535 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c20425514w9 = (C20425514w9) c1537480q70LIZIZ.LJFF(C20425514w9.class)) != null) {
            String comment = anonymousClass1531.getComment();
            if (comment == null) {
                comment = "";
            }
            C20425114w5 c20425114w5LJIIIIZZ = C20425514w9.LJIIIIZZ(c20425514w9, comment);
            if (c20425114w5LJIIIIZZ != null) {
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(AnonymousClass1530.class, null);
                AnonymousClass1530 anonymousClass1530 = (AnonymousClass1530) xBaseModelLIZJ;
                AnonymousClass1536 anonymousClass1536 = (AnonymousClass1536) C1909107dp.LIZJ(AnonymousClass1536.class, null);
                anonymousClass1536.setId(Long.valueOf(c20425114w5LJIIIIZZ.LIZ));
                anonymousClass1536.setStateType(c20425114w5LJIIIIZZ.LIZIZ);
                C20424814w2 c20424814w2 = c20425114w5LJIIIIZZ.LIZJ;
                if (c20424814w2 != null) {
                    anonymousClass1534 = (AnonymousClass1534) C1909107dp.LIZJ(AnonymousClass1534.class, null);
                    anonymousClass1534.setNext(Long.valueOf(c20424814w2.LIZ));
                    anonymousClass1534.setEnd(Boolean.valueOf(c20424814w2.LIZIZ));
                    anonymousClass1534.setName(c20424814w2.LIZJ);
                    anonymousClass1534.setComment(c20424814w2.LIZLLL);
                    anonymousClass1534.setPrev(c20424814w2.LJ);
                    anonymousClass1534.setVersion(Long.valueOf(c20424814w2.LJFF));
                    anonymousClass1534.setMinAppVersion(Long.valueOf(c20424814w2.LJI));
                    anonymousClass1534.setParameter(c20424814w2.LJII);
                } else {
                    anonymousClass1534 = null;
                }
                anonymousClass1536.setTaskStateData(anonymousClass1534);
                C20424714w1 c20424714w1 = c20425114w5LJIIIIZZ.LIZLLL;
                if (c20424714w1 != null) {
                    anonymousClass1535 = (AnonymousClass1535) C1909107dp.LIZJ(AnonymousClass1535.class, null);
                    anonymousClass1535.setNext(Long.valueOf(c20424714w1.LIZ));
                    anonymousClass1535.setEnd(Boolean.valueOf(c20424714w1.LIZIZ));
                    anonymousClass1535.setComment(c20424714w1.LIZJ);
                    anonymousClass1535.setTips(c20424714w1.LIZLLL);
                    anonymousClass1535.setPrev(c20424714w1.LJI);
                    anonymousClass1535.setBranches(c20424714w1.LJII);
                }
                anonymousClass1536.setParallelStateData(anonymousClass1535);
                anonymousClass1530.setState(anonymousClass1536);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -1, null, null, 6);
    }
}
