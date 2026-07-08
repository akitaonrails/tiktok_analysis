package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.component.bio.biometric.BiometricBEApi;

/* JADX INFO: renamed from: X.0ukP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715670ukP extends AbstractC1715690ukR {
    public static void LIZJ(InterfaceC1715680ukQ interfaceC1715680ukQ) {
        C1717610unX c1717610unX = BiometricBEApi.LIZ;
        String host = interfaceC1715680ukQ.getHost();
        String sessionId = interfaceC1715680ukQ.getSessionId();
        c1717610unX.getClass();
        BiometricBEApi biometricBEApiLIZ = C1717610unX.LIZ(host, sessionId);
        if (biometricBEApiLIZ == null) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW("PipoUnregisterBiometryMethod", "host empty");
        } else {
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1715660ukO(biometricBEApiLIZ, interfaceC1715680ukQ, null), 3);
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1715680ukQ interfaceC1715680ukQ = (InterfaceC1715680ukQ) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1715700ukS interfaceC1715700ukS = (InterfaceC1715700ukS) C1909107dp.LIZJ(InterfaceC1715700ukS.class, containerID);
        if (!C1716020uky.LIZ()) {
            interfaceC1715700ukS.setResultCode("Android_9_Required");
            completionBlock.onSuccess(interfaceC1715700ukS, "");
            return;
        }
        C20121713oF c20121713oFLIZIZ = C1715790ukb.LIZIZ(interfaceC1715680ukQ.getWalletUid());
        if (c20121713oFLIZIZ.LIZ() == null) {
            interfaceC1715700ukS.setResultCode("Client_Key_Not_Found_Error");
            completionBlock.onSuccess(interfaceC1715700ukS, "");
            LIZJ(interfaceC1715680ukQ);
        } else {
            c20121713oFLIZIZ.LIZIZ();
            interfaceC1715700ukS.setResultCode("Success");
            completionBlock.onSuccess(interfaceC1715700ukS, "");
            LIZJ(interfaceC1715680ukQ);
        }
    }
}
