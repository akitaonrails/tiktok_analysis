package X;

import Y.ARunnableS17S1100000_12;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0TXB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TXB extends C0TXC {
    public final Map<Integer, String> LLILLL = C2097608Jq.LJIIJ(new Pair(15, "lynx_card_dislike"));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        C0TXA c0txa;
        String containerID2;
        C0TXD c0txd = (C0TXD) xBaseParamModel;
        try {
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if (c1537480q70LIZIZ != null) {
                c0txa = (C0TXA) c1537480q70LIZIZ.LJFF(C0TXA.class);
            } else {
                c0txa = null;
            }
            String diffType = c0txd.getDiffType();
            if (diffType == null) {
                diffType = (String) ((LinkedHashMap) this.LLILLL).get(Integer.valueOf(c0txd.getCardType().intValue()));
                if (diffType == null) {
                    diffType = "lynx_card_dislike";
                }
            }
            C2487409ou.LIZJ(new Runnable() { // from class: X.0IxP
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DeleteLynxCardMethod@8334.handle$1");
                    try {
                        C1440005kM.LIZ(new C483280IxK());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DeleteLynxCardMethod@8334.handle$1");
                }
            });
            C2487409ou.LIZLLL(400L, new ARunnableS17S1100000_12(c0txa, diffType, 23));
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C0TXE.class);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            } else {
                containerID2 = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZJ(containerID2, c19719912DlLIZ), "delete card success");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2382909Vj.LIZ(completionBlock, 0, "delete card failed", null, 4);
        }
    }
}
