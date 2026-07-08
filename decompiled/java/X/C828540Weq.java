package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ISandboxService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Weq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828540Weq extends AbstractC828550Wer {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        Context context2;
        InterfaceC828560Wes interfaceC828560Wes = (InterfaceC828560Wes) xBaseParamModel;
        String openMethod = interfaceC828560Wes.getOpenMethod();
        int i = 0;
        if (Intrinsics.LJFF(openMethod, "default")) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null && (context2 = interfaceC634840OvC.getContext()) != null && ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context2, interfaceC828560Wes.getUrl())) {
                InterfaceC828530Wep interfaceC828530Wep = (InterfaceC828530Wep) C1909107dp.LIZJ(InterfaceC828530Wep.class, null);
                interfaceC828530Wep.setCode(1);
                interfaceC828530Wep.setFinalOpenMethod("unknown");
                completionBlock.onSuccess(interfaceC828530Wep, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        if (!Intrinsics.LJFF(openMethod, "cct_externalbrowser")) {
            return;
        }
        String url = interfaceC828560Wes.getUrl();
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            context = interfaceC634840OvC2.getContext();
        } else {
            context = null;
        }
        final Uri uri = UriProtector.parse(url);
        if (context != null) {
            String jsbSecureDataflowId = interfaceC828560Wes.getJsbSecureDataflowId();
            if (jsbSecureDataflowId != null) {
                i = CastIntegerProtector.parseInt(jsbSecureDataflowId);
            }
            new C828330WeV(new ThirdPartyBizCert(i)).LIZIZ(context, url, new InterfaceC828360WeY() { // from class: X.0Weo
                @Override // X.InterfaceC828360WeY
                public final void LIZ(Context context3, String str) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        Uri uri2 = uri;
                        intent.addFlags(268435456);
                        intent.addCategory("android.intent.category.BROWSABLE");
                        ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
                        if (iSandboxServiceLIZ != null) {
                            iSandboxServiceLIZ.appendDataFlowId(intent, 1207967489);
                        }
                        intent.setData(uri2);
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context3, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, context3);
                        C2204961BRm.LJJJJJL(context3, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPrDaZEi6afBZsim8i1akFr5gcG44ZxwNbK8fp++GaXZK0Ue0zVUJDBTU6UFZVN", null));
                        this.LIZ.getClass();
                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC828530Wep.class, null);
                        InterfaceC828530Wep interfaceC828530Wep2 = (InterfaceC828530Wep) xBaseModelLIZJ;
                        interfaceC828530Wep2.setCode(1);
                        interfaceC828530Wep2.setFinalOpenMethod("externalBrowser");
                        interfaceC828530Wep2.setData(null);
                        completionBlock.onSuccess((InterfaceC828530Wep) xBaseModelLIZJ, "");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
                    }
                }
            }, null);
        }
        InterfaceC828530Wep interfaceC828530Wep2 = (InterfaceC828530Wep) C1909107dp.LIZJ(InterfaceC828530Wep.class, null);
        interfaceC828530Wep2.setCode(1);
        interfaceC828530Wep2.setFinalOpenMethod("cct");
        interfaceC828530Wep2.setData(null);
        completionBlock.onSuccess(interfaceC828530Wep2, "");
    }
}
