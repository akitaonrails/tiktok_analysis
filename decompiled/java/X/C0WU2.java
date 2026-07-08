package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.tokopedia.loginkit.view.LoginLauncherActivity;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0WU2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WU2 extends C0WU9 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws NoSuchAlgorithmException {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        final String strEncodeToString;
        boolean z;
        String name;
        C0WU3 c0wu3 = (C0WU3) xBaseParamModel;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IActivityStackDependencyService.class.getName();
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        Activity topActivity = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getTopActivity();
        if (topActivity == null) {
            C2382909Vj.LIZ(completionBlock, -1, "topActivity is null", null, 4);
            return;
        }
        try {
            byte[] bArr = new byte[64];
            new SecureRandom().nextBytes(bArr);
            strEncodeToString = Base64.encodeToString(bArr, 11);
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            strEncodeToString = "";
        }
        C0WU0 value = C0WU0.LIZIZ.getValue();
        String clientID = c0wu3.getClientID();
        String redirectUrl = c0wu3.getRedirectUrl();
        List<String> scopes = c0wu3.getScopes();
        String lang = c0wu3.getLang();
        C0WU1 c0wu1 = new C0WU1() { // from class: X.0WUC
            @Override // X.C0WU1
            public final void LIZIZ(String str) {
                String containerID;
                CompletionBlock<C0WUB> completionBlock2 = completionBlock;
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0WUB.class, containerID);
                String str2 = strEncodeToString;
                C0WUB c0wub = (C0WUB) xBaseModelLIZJ;
                c0wub.setAuthCode(str);
                c0wub.setVerifyCode(str2);
                c0wub.setErrCode("");
                c0wub.setErrMsg("");
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }

            @Override // X.C0WU1
            public final void LIZ(String str, String str2) {
                String containerID;
                CompletionBlock<C0WUB> completionBlock2 = completionBlock;
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0WUB.class, containerID);
                String str3 = strEncodeToString;
                C0WUB c0wub = (C0WUB) xBaseModelLIZJ;
                c0wub.setAuthCode("");
                c0wub.setVerifyCode(str3);
                c0wub.setErrCode(str2);
                c0wub.setErrMsg(str);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }
        };
        value.getClass();
        Intent intent = new Intent(topActivity, (Class<?>) LoginLauncherActivity.class);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("redirect_uri", redirectUrl, bundle);
        C786410Ut5.LJJJI("client_id", clientID, bundle);
        C786410Ut5.LJJJI("scopes", C13LP.LJJLIIIJ(scopes, ",", null, null, 0, null, null, 62), bundle);
        byte[] bytes = strEncodeToString.getBytes(Charsets.UTF_8);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bytes, 0, bytes.length);
        C786410Ut5.LJJJI("code_challenge", Base64.encodeToString(messageDigest.digest(), 11), bundle);
        C786410Ut5.LJJJI("lang", lang, bundle);
        bundle.putBoolean("keep_cache", false);
        intent.putExtras(bundle);
        C810670Vr7.LIZJ(topActivity, 0, "ENV_PREF").edit().putInt("LOCAL_ENV", 2).apply();
        value.LIZ = c0wu1;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(topActivity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, topActivity);
        C2204961BRm.LJJJJJL(topActivity, intent, new C0WZX("dzBzEhY1VMXMUFMoRFyIaQ9kkGgQ3RYJWx59GNICLMI=", null));
    }
}
