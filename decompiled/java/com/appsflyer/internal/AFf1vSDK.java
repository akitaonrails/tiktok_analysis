package com.appsflyer.internal;

import X.C0WZX;
import X.C1701330uNH;
import X.C2204961BRm;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFf1vSDK extends AFf1nSDK<String> {
    public final AFd1sSDK force;
    public final String unregisterClient;
    public final AFj1mSDK w;

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        AFe1jSDK<Result> aFe1jSDK = ((AFf1nSDK) this).registerClient;
        if (aFe1jSDK != 0) {
            int statusCode = aFe1jSDK.getStatusCode();
            if (statusCode == 301 || statusCode == 302) {
                String strAFInAppEventParameterName = aFe1jSDK.AFInAppEventParameterName("Location");
                AFj1mSDK aFj1mSDK = this.w;
                if (aFj1mSDK == null || strAFInAppEventParameterName == null) {
                    return;
                }
                aFj1mSDK.AFKeystoreWrapper = strAFInAppEventParameterName;
                Context context = aFj1mSDK.AFInAppEventType.get();
                if (context != null) {
                    try {
                        if (aFj1mSDK.AFKeystoreWrapper != null) {
                            INVOKEVIRTUAL_com_appsflyer_internal_AFf1vSDK_com_bytedance_router_monitor_page_PageLancet_startActivity(context, new Intent("android.intent.action.VIEW", UriProtector.parse(aFj1mSDK.AFKeystoreWrapper)).setFlags(268435456));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(String str) {
        String string;
        AFe1ySDK aFe1ySDK = ((AFf1nSDK) this).AFLogger;
        String strAFKeystoreWrapper = this.force.AFKeystoreWrapper();
        if (AFc1tSDK.values(strAFKeystoreWrapper)) {
            string = this.unregisterClient;
        } else {
            string = UriProtector.parse(this.unregisterClient).buildUpon().appendQueryParameter("advertising_id", strAFKeystoreWrapper).build().toString();
        }
        return aFe1ySDK.AFKeystoreWrapper(string);
    }

    public static void INVOKEVIRTUAL_com_appsflyer_internal_AFf1vSDK_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bNsfuleyw==", new String[]{"01c45"}));
    }

    public static void INVOKEVIRTUAL_com_appsflyer_internal_AFf1vSDK_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_appsflyer_internal_AFf1vSDK_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    public AFf1vSDK(AFd1kSDK aFd1kSDK, String str, AFj1mSDK aFj1mSDK) {
        super(AFf1zSDK.IMPRESSIONS, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.unregisterClient = str;
        this.w = aFj1mSDK;
        this.force = aFd1kSDK.AFInAppEventType();
    }
}
