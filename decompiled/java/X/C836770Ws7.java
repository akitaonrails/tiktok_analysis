package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ws7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836770Ws7 extends AbstractC836780Ws8 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC836790Ws9 interfaceC836790Ws9 = (InterfaceC836790Ws9) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        final InterfaceC836810WsB interfaceC836810WsB = (InterfaceC836810WsB) C1909107dp.LIZJ(InterfaceC836810WsB.class, containerID);
        if (context == null) {
            interfaceC836810WsB.setResCode(0);
            completionBlock.onSuccess(interfaceC836810WsB, "Unable to check, null context");
            return;
        }
        String sessionId = interfaceC836790Ws9.getSessionId();
        String cardLast4 = interfaceC836790Ws9.getCardLast4();
        String cardName = interfaceC836790Ws9.getCardName();
        String cardId = interfaceC836790Ws9.getCardId();
        String tokenServiceProvider = interfaceC836790Ws9.getTokenServiceProvider();
        String cardNetwork = interfaceC836790Ws9.getCardNetwork();
        String host = interfaceC836790Ws9.getHost();
        String wuid = interfaceC836790Ws9.getWuid();
        String oneTimeToken = interfaceC836790Ws9.getOneTimeToken();
        String merchantId = interfaceC836790Ws9.getMerchantId();
        if (sessionId != null && cardLast4 != null && cardName != null && cardId != null && tokenServiceProvider != null && cardNetwork != null && host != null && wuid != null && oneTimeToken != null && merchantId != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//pipo/googlepay");
            smartRouteBuildRoute.withParam("KEY_SESSION_ID", sessionId);
            smartRouteBuildRoute.withParam("KEY_CARD_LAST_4", cardLast4);
            smartRouteBuildRoute.withParam("KEY_CARD_NAME", cardName);
            smartRouteBuildRoute.withParam("KEY_CARD_ID", cardId);
            smartRouteBuildRoute.withParam("KEY_TOKEN_SERVICE_PROVIDER", tokenServiceProvider);
            smartRouteBuildRoute.withParam("KEY_CARD_NETWORK", cardNetwork);
            smartRouteBuildRoute.withParam("KEY_HOST", host);
            smartRouteBuildRoute.withParam("KEY_WUID", wuid);
            smartRouteBuildRoute.withParam("KEY_ONE_TIME_TOKEN", oneTimeToken);
            smartRouteBuildRoute.withParam("KEY_MERCHANT_ID", merchantId);
            smartRouteBuildRoute.open(128, new OnActivityResultCallback() { // from class: X.0WsA
                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i, int i2, Intent intent) {
                    String str = "";
                    if (i2 != -1) {
                        if (i2 != 0) {
                            interfaceC836810WsB.setResCode(0);
                            String stringExtra = null;
                            if (intent != null) {
                                try {
                                    stringExtra = intent.getStringExtra("KEY_TOKENIZE_MSG");
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            CompletionBlock<InterfaceC836810WsB> completionBlock2 = completionBlock;
                            InterfaceC836810WsB interfaceC836810WsB2 = interfaceC836810WsB;
                            if (stringExtra != null) {
                                str = stringExtra;
                            }
                            completionBlock2.onSuccess(interfaceC836810WsB2, str);
                            return;
                        }
                        interfaceC836810WsB.setResCode(-1);
                        completionBlock.onSuccess(interfaceC836810WsB, "");
                        return;
                    }
                    interfaceC836810WsB.setResCode(1);
                    completionBlock.onSuccess(interfaceC836810WsB, "");
                }
            });
            return;
        }
        interfaceC836810WsB.setResCode(0);
        completionBlock.onSuccess(interfaceC836810WsB, "Missing required parameters");
    }
}
