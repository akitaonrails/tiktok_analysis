package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.net.Uri;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065490dpj extends AbstractC1065500dpk {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        Context baseContext;
        Activity activityLIZ;
        final String strValueOf = String.valueOf(((InterfaceC1065530dpn) xBaseParamModel).getPlatform());
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            baseContext = interfaceC634840OvC.getContext();
        } else {
            baseContext = null;
        }
        if (baseContext == null) {
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        while (baseContext instanceof MutableContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        if (!C142C.LIZ(baseContext, new InterfaceC342470Dbh() { // from class: X.0dpl
            @Override // X.InterfaceC342470Dbh
            public final boolean onActivityResult(int i, int i2, Intent intent) {
                String stringExtra;
                String stringExtra2;
                String stringExtra3;
                String stringExtra4;
                if (intent == null) {
                    return false;
                }
                String containerID = null;
                if (i2 == -1 && i == 10000) {
                    try {
                        stringExtra = intent.getStringExtra("access_token");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    try {
                        stringExtra2 = intent.getStringExtra("access_token_secret");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (stringExtra2 == null) {
                        stringExtra2 = "";
                    }
                    try {
                        stringExtra3 = intent.getStringExtra("code");
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                    if (stringExtra3 == null) {
                        stringExtra3 = "";
                    }
                    try {
                        stringExtra4 = intent.getStringExtra("platform_id");
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                    if (stringExtra4 == null) {
                        stringExtra4 = "";
                    }
                    if (Intrinsics.LJFF(stringExtra, "") && Intrinsics.LJFF(stringExtra2, "") && Intrinsics.LJFF(stringExtra3, "")) {
                        C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
                        return true;
                    }
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID = interfaceC634840OvC2.getContainerID();
                    }
                    InterfaceC1065520dpm interfaceC1065520dpm = (InterfaceC1065520dpm) C1909107dp.LIZJ(InterfaceC1065520dpm.class, containerID);
                    if (Intrinsics.LJFF("line", strValueOf)) {
                        interfaceC1065520dpm.setAccessToken(Uri.encode(stringExtra));
                        interfaceC1065520dpm.setAccessTokenSecret(Uri.encode(stringExtra2));
                        interfaceC1065520dpm.setCode(Uri.encode(stringExtra3));
                    } else {
                        interfaceC1065520dpm.setAccessToken(stringExtra);
                        interfaceC1065520dpm.setAccessTokenSecret(stringExtra2);
                        interfaceC1065520dpm.setCode(stringExtra3);
                    }
                    interfaceC1065520dpm.setPlatform(strValueOf);
                    interfaceC1065520dpm.setPlatformAppId(stringExtra4);
                    completionBlock.onSuccess(interfaceC1065520dpm, "");
                    return true;
                }
                C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
                return true;
            }
        })) {
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
            return;
        }
        if (baseContext == null || (activityLIZ = C1388190mED.LIZ(baseContext)) == null) {
            return;
        }
        Intent authorizeActivityStartIntent = C0XQ7.LIZ().getAuthorizeActivityStartIntent(activityLIZ);
        authorizeActivityStartIntent.putExtra("platform", strValueOf);
        authorizeActivityStartIntent.putExtra("is_login", false);
        authorizeActivityStartIntent.putExtra("is_only_fetch_token", true);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, authorizeActivityStartIntent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(authorizeActivityStartIntent, activityLIZ);
        C2204961BRm.LJIIZILJ(10000, activityLIZ, authorizeActivityStartIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHEzzAfthIz0NZE9sCPGX9p06ZtWVxzyxPfAdd/fUzZRqqAMt/Kog==", null));
    }
}
