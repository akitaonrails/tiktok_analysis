package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714410uiN {
    public static final C1714410uiN LIZ = new C1714410uiN();
    public static final HashMap<String, String> LIZIZ = new HashMap<>();

    public static void LIZ(String str) {
        HashMap<String, String> map = LIZIZ;
        String str2 = map.get(str);
        if (str2 != null) {
            map.remove(str);
            SparkContext.Companion.getClass();
            InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str2);
            if (interfaceC1059280dfiLIZ != null) {
                interfaceC1059280dfiLIZ.close();
            }
        }
    }

    public static boolean LIZJ(String str) {
        Context applicationContext;
        boolean z = false;
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(str));
            intent.setFlags(268435456);
            IAppContextManagerService iAppContextManagerService = (IAppContextManagerService) PluggableExtentionKt.pluggableSpi$default(IAppContextManagerService.class, false, false, false, 14, null);
            if (iAppContextManagerService == null || (applicationContext = iAppContextManagerService.getApplicationContext()) == null) {
                return false;
            }
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(applicationContext, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, applicationContext);
            C2204961BRm.LJJJJJL(applicationContext, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CA3zMRkEGe2F3/GwL5CnAyI2cy92Ad5Rem7zFPHRM=", null));
            z = true;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }

    public static String LIZIZ(String str, boolean z, Map map, C1708990uZd c1708990uZd, String str2, String str3, Map map2) {
        String str4;
        if (u.LJJIIJZLJL(str, "aweme://", false)) {
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                for (Map.Entry entry : map.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                if (str2 != null) {
                    builderBuildUpon.appendQueryParameter("event_json", str2);
                }
                if (str3 != null) {
                    builderBuildUpon.appendQueryParameter("pipo_web_request_method", str3);
                }
                if (map2 != null) {
                    builderBuildUpon.appendQueryParameter("pipo_web_request_body_string", C786410Ut5.J3(new JSONObject(map2)));
                }
                return builderBuildUpon.build().toString();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                return str;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview/?url=");
        sbLIZ.append(Uri.encode(str));
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)).buildUpon().appendQueryParameter("target_handler", "pipo_hybrid").appendQueryParameter("disable_auto_append_crossplatform_plugin", "1").appendQueryParameter("proxy_enabled_runtime_type", "1").appendQueryParameter("disable_ttnet_proxy", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("hide_back_button", "1");
        if (c1708990uZd == null || (str4 = c1708990uZd.LIZJ) == null) {
            str4 = "";
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("bdhm_bid", str4).appendQueryParameter("show_close_all", "1");
        if (z) {
            builderAppendQueryParameter2.appendQueryParameter("show_domain_subtitle", "1");
        }
        for (Map.Entry entry2 : map.entrySet()) {
            builderAppendQueryParameter2.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (str2 != null) {
            builderAppendQueryParameter2.appendQueryParameter("event_json", str2);
        }
        if (str3 != null) {
            builderAppendQueryParameter2.appendQueryParameter("pipo_web_request_method", str3);
        }
        if (map2 != null) {
            builderAppendQueryParameter2.appendQueryParameter("pipo_web_request_body_string", C786410Ut5.J3(new JSONObject(map2)));
        }
        return builderAppendQueryParameter2.build().toString();
    }

    public static void LIZLLL(C1714410uiN c1714410uiN, Context context, String str, final InterfaceC1712360uf4 interfaceC1712360uf4, boolean z, Map map, C1708990uZd c1708990uZd, String str2, String str3, Map map2, int i) {
        String str4 = str3;
        String str5 = str2;
        C1708990uZd c1708990uZd2 = c1708990uZd;
        Map linkedHashMap = map;
        boolean z2 = z;
        Map map3 = null;
        if ((i & 4) != 0) {
            interfaceC1712360uf4 = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            linkedHashMap = new LinkedHashMap();
        }
        if ((i & 64) != 0) {
            c1708990uZd2 = null;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        if ((i & 512) == 0) {
            map3 = map2;
        }
        c1714410uiN.getClass();
        if (str.length() != 0) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            LIZ.getClass();
            sparkContext.LJJLIIJ(LIZIZ(str, z2, linkedHashMap, c1708990uZd2, str5, str4, map3));
            sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0uiM
                @Override // X.InterfaceC2217701Bqy
                public final Context LIZJ(Context context2) {
                    return context2;
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJIILLIIL(boolean z3) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJIL(Activity activity, Context context2) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIII(SparkActivity sparkActivity, boolean z3) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIJIIJI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIZ(SparkActivity sparkActivity, int i2, String[] strArr, int[] iArr) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJ(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJJ(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJLL(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJZI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                    return false;
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLJLI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLL(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void finish() {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void onActivityResult(int i2, int i3, Intent intent) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void onRestoreInstanceState(Bundle bundle) {
                }

                @Override // X.InterfaceC1163130gND
                public final void release() {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                    InterfaceC1712360uf4 interfaceC1712360uf42 = interfaceC1712360uf4;
                    if (interfaceC1712360uf42 != null) {
                        interfaceC1712360uf42.LIZIZ();
                    }
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                    String str6;
                    SparkContext sparkContext2 = sparkActivity.LL;
                    if (sparkContext2 != null && (str6 = sparkContext2.containerId) != null) {
                        InterfaceC1712360uf4 interfaceC1712360uf42 = interfaceC1712360uf4;
                        if (interfaceC1712360uf42 != null) {
                            interfaceC1712360uf42.LIZ(sparkActivity, str6);
                            return;
                        }
                        return;
                    }
                    InterfaceC1712360uf4 interfaceC1712360uf43 = interfaceC1712360uf4;
                    if (interfaceC1712360uf43 != null) {
                        interfaceC1712360uf43.LIZ(sparkActivity, "");
                    }
                }
            });
            sparkContext.LJJLIIIJILLIZJL(sparkContext.runtimeInfo);
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }
}
