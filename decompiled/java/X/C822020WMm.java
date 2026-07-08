package X;

import android.app.Application;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.hybrid.entry.IHybridEntryService;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;
import com.bytedance.pumbaa.hybrid.rasp.api.NavigationConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822020WMm {
    public static final C822020WMm LIZ = new C822020WMm();
    public static final String LIZIZ = "{\n  \"web_router\": {\n    \"constant\": {},\n    \"rules\": [\n      {\n        \"action\": {\n          \"name\": \"isolate\",\n          \"params\": {\n            \"block_enable\": 1,\n            \"container_type\": \"cctSystemBrowser\"\n          }\n        },\n        \"condition\": {\n          \"conditions\": [\n            {\n              \"field\": \"url_host\",\n              \"operator\": \"equals\",\n              \"value\": {\n                \"type\": \"string\",\n                \"value\": \"ads.tiktok.com\"\n              }\n            },\n            {\n              \"conditions\": [\n                {\n                  \"field\": \"url_path\",\n                  \"operator\": \"startsWith\",\n                  \"value\": {\n                    \"type\": \"string\",\n                    \"value\": \"/i18n/promote/adv-account/oauth\"\n                  }\n                },\n                {\n                  \"field\": \"url_path\",\n                  \"operator\": \"startsWith\",\n                  \"value\": {\n                    \"type\": \"string\",\n                    \"value\": \"/i18n/promote/shop-gmv-max/verify\"\n                  }\n                }\n              ],\n              \"logic\": \"or\"\n            }\n          ],\n          \"logic\": \"and\"\n        },\n        \"rule_aspect\": \"web_router\",\n        \"rule_name\": \"global_container_isolate\",\n        \"rule_priority\": 1001\n      }\n    ],\n    \"version\": 3\n  }\n}";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0WVd] */
    public static final void LIZ(Application application) {
        C844470XAv.LIZ.getClass();
        String str = C844470XAv.LJII;
        if (str == null) {
            str = null;
        }
        C790430UzZ c790430UzZ = new C790430UzZ(application, str, C1150504el.LIZ().LJJIII);
        IHybridEntryService iHybridEntryService = (IHybridEntryService) PluggableExtentionKt.pluggableSpi$default(IHybridEntryService.class, false, false, false, 14, null);
        if (iHybridEntryService != null) {
            iHybridEntryService.LIZ(new AwS557S0100000_13(c790430UzZ, 194));
        }
        IClientSecurityService iClientSecurityService = (IClientSecurityService) PluggableExtentionKt.pluggableSpi$default(IClientSecurityService.class, false, false, false, 14, null);
        if (iClientSecurityService != null) {
            iClientSecurityService.LIZLLL();
        }
        LIZ.getClass();
        IRaspService iRaspService = (IRaspService) PluggableExtentionKt.pluggableSpi$default(IRaspService.class, false, false, false, 14, null);
        if (iRaspService != 0) {
            C0WNN.LIZ.getClass();
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            NavigationConfig navigationConfig = C0WNN.LIZIZ;
            NavigationConfig navigationConfig2 = (NavigationConfig) settingsManagerLIZLLL.LJIIIIZZ("hybrid_security_monitor_settings", NavigationConfig.class, navigationConfig);
            if (navigationConfig2 != null) {
                navigationConfig = navigationConfig2;
            }
            C822070WMr.LIZ.getClass();
            iRaspService.LIZLLL(new C0WLK(C822070WMr.LIZ(), navigationConfig));
            iRaspService.LIZ();
            iRaspService.LJ();
            iRaspService.LIZJ(new C0WL6() { // from class: X.0WVd
                @Override // X.C0WL6
                public final void LIZIZ(Uri uri) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("【Rasp】web load -> url: ");
                    sbLIZ.append(uri);
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.C0WL6
                public final void LIZJ(Uri uri) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("【Rasp】block router -> url: ");
                    sbLIZ.append(uri);
                    C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.C0WL6
                public final void LIZ(C0WLA c0wla, String str2) throws JSONException {
                    LocalTestApi localTestApiLIZ = C19273110af.LIZ();
                    if (localTestApiLIZ != null) {
                        localTestApiLIZ.showBridgeBlockTips(c0wla, str2);
                    }
                    if (Intrinsics.LJFF(str2, "block")) {
                        C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                        C1520360pfO c1520360pfO = new C1520360pfO("jsb_offline_warning");
                        c1520360pfO.LIZIZ = "jsb_minimization";
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("jsb_name", c0wla.LIZIZ);
                        C295001Ci c295001CiLIZIZ = C294901Ch.LIZIZ(c0wla.LJIIIIZZ);
                        if (c295001CiLIZIZ != null) {
                            jSONObject.put("url", c295001CiLIZIZ.LIZ);
                            jSONObject.put("path", c295001CiLIZIZ.LIZIZ);
                        }
                        jSONObject.put("error_code", -1);
                        jSONObject.put("relativeViewType", c0wla.LJIILLIIL);
                        c1520360pfO.LIZLLL = jSONObject;
                        c1520360pfO.LIZIZ(0);
                        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                        c1520380pfQ.getClass();
                        C1520380pfQ.LIZ(c1520350pfNLIZ);
                    }
                }
            });
        }
    }
}
