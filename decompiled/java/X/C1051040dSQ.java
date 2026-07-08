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

/* JADX INFO: renamed from: X.0dSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1051040dSQ extends AbstractC1051060dSS {
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(394));

    public final void LIZJ(InterfaceC1051050dSR interfaceC1051050dSR) throws JSONException {
        String strValueOf;
        Context context;
        if (interfaceC1051050dSR.getUrl() != null) {
            strValueOf = String.valueOf(interfaceC1051050dSR.getUrl());
        } else {
            strValueOf = "";
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
            if (context != null && Intrinsics.LJFF(interfaceC1051050dSR.getUse_external_browser(), Boolean.TRUE)) {
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
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi9b5PLyHwDdlrQqGjrn2czMXzD4AxbD5kOwPtnoZ35u932Uiot8jmVhbeL", null));
                    return;
                }
            }
        } else {
            context = null;
        }
        JSONObject json = interfaceC1051050dSR.toJSON();
        json.put("type", "webview");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", strValueOf);
        json.put("args", jSONObject);
        C1059900dgi.LIZIZ(context, json);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        String strValueOf;
        String containerID;
        InterfaceC1051050dSR interfaceC1051050dSR = (InterfaceC1051050dSR) xBaseParamModel;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            if (interfaceC1051050dSR.getUrl() == null) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(interfaceC1051050dSR.getUrl());
            }
            if (!TextUtils.isEmpty(strValueOf)) {
                String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                if (lowerCase == null) {
                    lowerCase = "";
                }
                if (!u.LJJIIJZLJL(lowerCase, "http://", false) && !u.LJJIIJZLJL(lowerCase, "https://", false)) {
                    if (context != null && ((ICommercializeFromMainOutService) this.LLILLJJLI.getValue()).LIZ(context, strValueOf)) {
                        if (C294500BgW.LIZ()) {
                            ((ICommercializeFromMainOutService) this.LLILLJJLI.getValue()).LJ(new C1029220ctE(null, CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT), strValueOf, context);
                        }
                        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                        c1020020ceOLIZ.LIZ = "draw_ad";
                        c1020020ceOLIZ.LIZIZ = "open_url_app";
                        c1020020ceOLIZ.LJIIJ(context);
                        C2184171Adz.LJ("draw_ad", "open_url_app", CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT).LJIIIIZZ();
                        ((ICommercializeFromMainOutService) this.LLILLJJLI.getValue()).pendingDeepLinkLog(new AwS588S0100000_9(context, 499));
                    }
                } else {
                    LIZJ(interfaceC1051050dSR);
                }
                C1440005kM.LIZ(new C997880c4g());
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID = null;
                }
                InterfaceC1051090dSV interfaceC1051090dSV = (InterfaceC1051090dSV) C1909107dp.LIZJ(InterfaceC1051090dSV.class, containerID);
                interfaceC1051090dSV.setCode(1);
                completionBlock.onRawSuccess(interfaceC1051090dSV);
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
        }
    }
}
