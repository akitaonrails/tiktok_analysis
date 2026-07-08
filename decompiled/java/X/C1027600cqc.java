package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027600cqc extends AbstractC1027750cqr {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        boolean zBooleanValue;
        Context baseContext;
        InterfaceC1027730cqp interfaceC1027730cqp = (InterfaceC1027730cqp) xBaseParamModel;
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        String url = interfaceC1027730cqp.getUrl();
        if (url != null && url.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String containerID = null;
        if (z) {
            C2382909Vj.LIZ(completionBlock, -1, "empty url", null, 4);
            return;
        }
        Number numberIsDeeplink = interfaceC1027730cqp.isDeeplink();
        if (numberIsDeeplink == null) {
            numberIsDeeplink = 0;
        }
        if (Intrinsics.LJFF(numberIsDeeplink, 1)) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null && (baseContext = activityLJFF.getBaseContext()) != null) {
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() != null && C1028210crb.LJIJI(baseContext, url)) {
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID = interfaceC634840OvC.getContainerID();
                    }
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1027860cr2.class, containerID), "");
                    return;
                }
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1027860cr2.class, containerID), "");
            return;
        }
        String title = interfaceC1027730cqp.getTitle();
        if (title == null) {
            title = "";
        }
        Number landingStyle = interfaceC1027730cqp.getLandingStyle();
        if (landingStyle != null) {
            iIntValue = landingStyle.intValue();
        } else {
            iIntValue = 0;
        }
        Number landingAccessStyle = interfaceC1027730cqp.getLandingAccessStyle();
        if (landingAccessStyle != null) {
            iIntValue2 = landingAccessStyle.intValue();
        } else {
            iIntValue2 = 0;
        }
        Number landingExitStyle = interfaceC1027730cqp.getLandingExitStyle();
        if (landingExitStyle != null) {
            iIntValue3 = landingExitStyle.intValue();
        } else {
            iIntValue3 = 0;
        }
        String refer = interfaceC1027730cqp.getRefer();
        if (refer == null) {
            refer = "";
        }
        Boolean shouldUseActivity = interfaceC1027730cqp.getShouldUseActivity();
        if (shouldUseActivity != null) {
            zBooleanValue = shouldUseActivity.booleanValue();
        } else {
            zBooleanValue = false;
        }
        try {
            C844470XAv.LIZ.getClass();
            try {
                if (C1027410cqJ.LIZ(C844470XAv.LIZ(), LIZJ(url, title, iIntValue, iIntValue2, iIntValue3, c1019830ce5LIZ, refer, zBooleanValue, interfaceC1027730cqp.getReportAdExtraData())).LIZ()) {
                    InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC3 != null) {
                        containerID = interfaceC634840OvC3.getContainerID();
                    }
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1027860cr2.class, containerID), "");
                    return;
                }
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        C2382909Vj.LIZ(completionBlock, -1, "can not handle url", null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x02c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1027480cqQ LIZJ(java.lang.String r12, java.lang.String r13, int r14, int r15, int r16, X.C1019830ce5 r17, java.lang.String r18, boolean r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1027600cqc.LIZJ(java.lang.String, java.lang.String, int, int, int, X.0ce5, java.lang.String, boolean, java.lang.String):X.0cqQ");
    }
}
