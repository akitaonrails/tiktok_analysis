package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spark.bullet.IBulletService;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0dUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052460dUi extends AbstractC748130TWh {
    public final void LIZLLL(Context context) {
        Object c098200Yq;
        String str;
        String strLIZ;
        Activity activityLIZLLL;
        InterfaceC634840OvC interfaceC634840OvC;
        InterfaceC1052500dUm interfaceC1052500dUm;
        try {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            str = "";
            if (interfaceC634840OvC2 == null || (strLIZ = interfaceC634840OvC2.getContainerID()) == null) {
                strLIZ = "";
            }
            if (strLIZ.length() != 0 || ((interfaceC634840OvC = this.IBridgeSdkContext) != null && (interfaceC1052500dUm = (InterfaceC1052500dUm) interfaceC634840OvC.LIZIZ(InterfaceC1052500dUm.class)) != null && (strLIZ = interfaceC1052500dUm.LIZ()) != null)) {
                str = strLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (((IBulletService) ServiceManager.get().getService(IBulletService.class)).LJFF(context, str)) {
            return;
        }
        SparkContext.Companion.getClass();
        InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
        if (interfaceC1059280dfiLIZ != null) {
            interfaceC1059280dfiLIZ.close();
            String str2 = C08RQ.LIZJ(str).get("__spark_session_id");
            if (str2 != null) {
                C1051980dTw.LIZIZ(str2);
                return;
            }
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null && (activityLIZLLL = interfaceC634840OvC3.LIZLLL()) != null) {
            activityLIZLLL.finish();
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && !activityLIZ.isFinishing()) {
            activityLIZ.finish();
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LIZJ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GAxDAg0EhgGtxyBzY+9jHwgjkT6NStHnGxFV365UrYmOP9Iw+OFHzFdemZpF8O98rwyGfviTb6", null));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r19, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r20, X.EnumC1063300dmC r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1052460dUi.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }

    public static final Pair<Boolean, String> LJ(Context context, String str, int i, EnumC1063300dmC enumC1063300dmC) {
        Class<? extends Activity> clsLJLJJI;
        try {
            Uri uri = UriProtector.parse(str);
            IDeepLinkService iDeepLinkService = (IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class);
            if (iDeepLinkService != null && (clsLJLJJI = iDeepLinkService.LJLJJI("XOpenForThirdMethodIDL#handle")) != null) {
                Intent intent = new Intent(context, clsLJLJJI);
                intent.setData(uri);
                intent.putExtra("is_from_self", true);
                C2429209fW.LIZ().appendDataFlowId(intent, String.valueOf(i));
                LIZJ(context, intent);
                return new Pair<>(Boolean.TRUE, "");
            }
            return new Pair<>(Boolean.FALSE, "get deeplink class failed!");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            Boolean bool = Boolean.FALSE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invaild schema: ");
            sbLIZ.append(str);
            return new Pair<>(bool, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
