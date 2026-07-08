package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dSP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051030dSP extends AbstractC1051070dST {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(175));

    public final void LIZJ(InterfaceC1051080dSU interfaceC1051080dSU) throws JSONException {
        Context context;
        String strValueOf;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (interfaceC1051080dSU.getUrl() != null) {
            strValueOf = String.valueOf(interfaceC1051080dSU.getUrl());
        } else {
            strValueOf = "";
        }
        if (context != null && Intrinsics.LJFF(interfaceC1051080dSU.getUseExternalBrowser(), Boolean.TRUE)) {
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(strValueOf));
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                C2429209fW.LIZ().appendDataFlowId(intent, 1207969294);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkR0Tfg0ejtJe+RlY7X6fNBiU0Xz1A==", null));
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "webview");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", strValueOf);
        jSONObject.put("args", jSONObject2);
        C1059900dgi.LIZIZ(context, jSONObject);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        String strValueOf;
        String containerID;
        ICommercializeFromMainOutService iCommercializeFromMainOutService;
        ICommercializeFromMainOutService iCommercializeFromMainOutService2;
        InterfaceC1051080dSU interfaceC1051080dSU = (InterfaceC1051080dSU) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        try {
            if (interfaceC1051080dSU.getUrl() == null) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(interfaceC1051080dSU.getUrl());
            }
            if (!TextUtils.isEmpty(strValueOf)) {
                String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                if (lowerCase == null) {
                    lowerCase = "";
                }
                if (!u.LJJIIJZLJL(lowerCase, "http://", false) && !u.LJJIIJZLJL(lowerCase, "https://", false)) {
                    if (context != null && (iCommercializeFromMainOutService = (ICommercializeFromMainOutService) this.LLILLJJLI.getValue()) != null && iCommercializeFromMainOutService.LIZ(context, strValueOf)) {
                        if (C294500BgW.LIZ() && (iCommercializeFromMainOutService2 = (ICommercializeFromMainOutService) this.LLILLJJLI.getValue()) != null) {
                            iCommercializeFromMainOutService2.LJ(new C1029220ctE(null, CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT), strValueOf, context);
                        }
                        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                        c1020020ceOLIZ.LIZ = "draw_ad";
                        c1020020ceOLIZ.LIZIZ = "open_url_app";
                        c1020020ceOLIZ.LJIIJ(context);
                        C2184171Adz.LJ("draw_ad", "open_url_app", CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT).LJIIIIZZ();
                        ICommercializeFromMainOutService iCommercializeFromMainOutService3 = (ICommercializeFromMainOutService) this.LLILLJJLI.getValue();
                        if (iCommercializeFromMainOutService3 != null) {
                            iCommercializeFromMainOutService3.pendingDeepLinkLog(new AwS588S0100000_9(context, 87));
                        }
                    }
                } else {
                    LIZJ(interfaceC1051080dSU);
                }
                C1440005kM.LIZ(new C997880c4g());
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID = null;
                }
                completionBlock.onSuccess((InterfaceC1051100dSW) C1909107dp.LIZJ(InterfaceC1051100dSW.class, containerID), "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
        }
    }
}
