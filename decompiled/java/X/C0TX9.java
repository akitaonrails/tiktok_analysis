package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import defpackage.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TX9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TX9 extends e {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Integer numValueOf;
        String containerID2;
        C0TXA c0txa;
        Aweme aweme;
        CardInsertInfo cardInsertInfo;
        e.b bVar = (e.b) xBaseParamModel;
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
            if (c1537480q70LIZIZ == null || (c0txa = (C0TXA) c1537480q70LIZIZ.LJFF(C0TXA.class)) == null || (aweme = c0txa.getAweme()) == null || (cardInsertInfo = aweme.getCardInsertInfo()) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(cardInsertInfo.getCardType());
            }
            if (bVar.getDisableHours().intValue() < 0) {
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    C20550115b9.LIZ.getClass();
                    C20550115b9.LJIILJJIL(iIntValue, -1);
                }
            } else if (Intrinsics.LJFF(bVar.getDisableHours(), 0)) {
                if (numValueOf != null) {
                    int iIntValue2 = numValueOf.intValue();
                    C20550115b9.LIZ.getClass();
                    C20550115b9.LJIILJJIL(iIntValue2, 0);
                }
            } else if (numValueOf != null) {
                int iIntValue3 = numValueOf.intValue();
                C20550115b9 c20550115b9 = C20550115b9.LIZ;
                int iIntValue4 = bVar.getDisableHours().intValue();
                c20550115b9.getClass();
                C20550115b9.LJIILJJIL(iIntValue3, iIntValue4);
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(e.c.class);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID2 = interfaceC634840OvC2.getContainerID();
            } else {
                containerID2 = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZJ(containerID2, c19719912DlLIZ), "success");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2382909Vj.LIZ(completionBlock, 0, "failed", null, 4);
        }
    }
}
