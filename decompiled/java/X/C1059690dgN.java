package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.EComRouterHandler;
import com.ss.android.ugc.aweme.ecommerce.IEcomRouteOpenHandler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.spark.bullet.IBulletService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1059690dgN implements IHostRouterDepend {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(432));

    public static C19EG LIZ(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final AbstractC1059760dgU provideRouteOpenExceptionHandler(C1059860dge c1059860dge) {
        return new AbstractC1059760dgU() { // from class: X.0dgT
            @Override // X.AbstractC1059760dgU
            public final boolean LIZIZ(Context context, String str, Map map) {
                return false;
            }

            @Override // X.AbstractC1059760dgU
            public final List<EnumC1059790dgX> LIZ() {
                return Collections.singletonList(EnumC1059790dgX.ALL);
            }
        };
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final List<AbstractC1059760dgU> provideRouteOpenHandlerList(final C1059860dge c1059860dge) {
        return C1697810uHb.LJIIJJI(new AbstractC1059760dgU() { // from class: X.0dga
            @Override // X.AbstractC1059760dgU
            public final List<EnumC1059790dgX> LIZ() {
                return Collections.singletonList(EnumC1059790dgX.ALL);
            }

            @Override // X.AbstractC1059760dgU
            public final boolean LIZIZ(Context context, String str, Map map) {
                Object c098200Yq;
                Object c098200Yq2;
                String str2;
                InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
                View viewE1;
                Uri uri = UriProtector.parse(str);
                try {
                    c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_c_code");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str3 = (String) c098200Yq;
                try {
                    c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "btm_d_code");
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                String str4 = (String) c098200Yq2;
                C1529880puk c1529880puk = SparkContext.Companion;
                Object obj = map.get("container_id");
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                c1529880puk.getClass();
                C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(str2);
                if (c1537480q70LIZIZ != null && (interfaceC1541990qEHLJIJJ = c1537480q70LIZIZ.LJIJJ()) != null && (viewE1 = interfaceC1541990qEHLJIJJ.e1()) != null) {
                    if (str3 == null) {
                        if (str4 != null) {
                            str3 = "c0";
                        } else {
                            return false;
                        }
                    } else if (str4 == null) {
                        str4 = "d0";
                    }
                    C2211631BhB.LJIJ(viewE1, str3, str4, null, null);
                    return false;
                }
                return false;
            }
        }, new AbstractC1059760dgU(c1059860dge) { // from class: X.0dgQ
            public final C1059860dge LIZJ;

            @Override // X.AbstractC1059760dgU
            public final List<EnumC1059790dgX> LIZ() {
                return Collections.singletonList(EnumC1059790dgX.ALL);
            }

            {
                this.LIZJ = c1059860dge;
            }

            @Override // X.AbstractC1059760dgU
            public final boolean LIZIZ(Context context, String str, Map map) {
                IEcomRouteOpenHandler iEcomRouteOpenHandler;
                Object objLIZ = C04TD.LIZ(IEcomRouteOpenHandler.class, false);
                if (objLIZ != null) {
                    iEcomRouteOpenHandler = (IEcomRouteOpenHandler) objLIZ;
                } else {
                    if (C04TD.LLLZIL == null) {
                        synchronized (IEcomRouteOpenHandler.class) {
                            if (C04TD.LLLZIL == null) {
                                C04TD.LLLZIL = new EComRouterHandler();
                            }
                        }
                    }
                    iEcomRouteOpenHandler = C04TD.LLLZIL;
                }
                return iEcomRouteOpenHandler.LIZ(str, map, context, this.LIZJ);
            }
        }, new AbstractC1059760dgU(c1059860dge) { // from class: X.0dgL
            public final C1059860dge LIZJ;

            @Override // X.AbstractC1059760dgU
            public final List<EnumC1059790dgX> LIZ() {
                return Collections.singletonList(EnumC1059790dgX.ALL);
            }

            {
                this.LIZJ = c1059860dge;
            }

            @Override // X.AbstractC1059760dgU
            public final boolean LIZIZ(Context context, String str, Map map) throws JSONException {
                boolean zOpenAdOpenUrl = false;
                if (!Intrinsics.LJFF(map.get("useSysBrowser"), Boolean.TRUE)) {
                    return false;
                }
                if (!TextUtils.isEmpty(str)) {
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    if (!u.LJJIIJZLJL(lowerCase, "http://", false) && !u.LJJIIJZLJL(lowerCase, "https://", false)) {
                        if (context != null && (zOpenAdOpenUrl = ((IMainService) this.LIZLLL.LIZ.getValue()).openAdOpenUrl(context, str, false))) {
                            C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                            c1020020ceOLIZ.LIZ = "draw_ad";
                            c1020020ceOLIZ.LIZIZ = "open_url_app";
                            c1020020ceOLIZ.LJIIJ(context);
                            C2184171Adz.LJ("draw_ad", "open_url_app", CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT).LJIIIIZZ();
                            ((IMainService) this.LIZLLL.LIZ.getValue()).pendingDeepLinkLog(new AwS588S0100000_9(context, 578));
                        }
                    } else {
                        Context context2 = (Context) C1553710qXB.LIZIZ(this.LIZJ, Context.class);
                        if (context2 != null) {
                            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
                            intent.addFlags(268435456);
                            intent.addCategory("android.intent.category.BROWSABLE");
                            ResolveInfo resolveInfoResolveActivity = context2.getPackageManager().resolveActivity(intent, 65536);
                            if (resolveInfoResolveActivity != null) {
                                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                                intent.setClassName(activityInfo.packageName, activityInfo.name);
                                C2429209fW.LIZ().appendDataFlowId(intent, 1207969294);
                                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intent, "Context_startActivity_1");
                                C1701330uNH.LIZ(intent, context2);
                                C2204961BRm.LJJJJJL(context2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GAxDAg0EhgGtx1DSsr9Dy/ni8Y3P1ozlBrlpLrGRZILsyrOknKDKZaJVFb/bc=", null));
                                return true;
                            }
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type", "webview");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("url", str);
                        jSONObject.put("args", jSONObject2);
                        C1059900dgi.LIZIZ(context2, jSONObject);
                        return true;
                    }
                }
                return zOpenAdOpenUrl;
            }
        }, new AbstractC1059760dgU(c1059860dge) { // from class: X.0dgZ
            public final C1059860dge LIZJ;

            @Override // X.AbstractC1059760dgU
            public final List<EnumC1059790dgX> LIZ() {
                return C1697810uHb.LJIIJJI(EnumC1059790dgX.LYNX, EnumC1059790dgX.WEB);
            }

            {
                this.LIZJ = c1059860dge;
            }

            @Override // X.AbstractC1059760dgU
            public final boolean LIZIZ(Context context, String str, Map map) {
                InterfaceC1059830dgb interfaceC1059830dgb;
                InterfaceC1059840dgc interfaceC1059840dgc;
                SparkContext sparkContextLIZ;
                C1538540q8i c1538540q8i;
                C1059860dge c1059860dge2 = this.LIZJ;
                if (c1059860dge2 != null && (interfaceC1059830dgb = (InterfaceC1059830dgb) ((LinkedHashMap) c1059860dge2.LIZ).get(InterfaceC1059840dgc.class)) != null && (interfaceC1059840dgc = (InterfaceC1059840dgc) interfaceC1059830dgb.LIZ()) != null && (sparkContextLIZ = interfaceC1059840dgc.LIZ()) != null && (c1538540q8i = (C1538540q8i) sparkContextLIZ.LJFF(C1538540q8i.class)) != null) {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).W3(context, str, new AwS382S0200000_16(sparkContextLIZ, c1538540q8i, 77));
                    return true;
                }
                return ((IMainService) this.LIZLLL.LIZ.getValue()).handleLiveSchema(str, context);
            }
        }, new AbstractC1059760dgU(c1059860dge) { // from class: X.0dgO
            public final C1059860dge LIZJ;

            @Override // X.AbstractC1059760dgU
            public final List<EnumC1059790dgX> LIZ() {
                return Collections.singletonList(EnumC1059790dgX.ALL);
            }

            {
                this.LIZJ = c1059860dge;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v0, types: [T, android.os.Bundle] */
            @Override // X.AbstractC1059760dgU
            public final boolean LIZIZ(Context context, String str, Map map) {
                Map map2;
                String string;
                String string2;
                Context context2 = (Context) C1553710qXB.LIZIZ(this.LIZJ, Context.class);
                C259800zU c259800zU = new C259800zU();
                Object obj = map.get("__post_url_config");
                if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
                    ?? bundle = new Bundle();
                    Bundle bundle2 = new Bundle();
                    for (Map.Entry entry : map2.entrySet()) {
                        Object key = entry.getKey();
                        if (key != null) {
                            string = key.toString();
                        } else {
                            string = null;
                        }
                        Object value = entry.getValue();
                        if (value != null) {
                            string2 = value.toString();
                        } else {
                            string2 = null;
                        }
                        C786410Ut5.LJJJI(string, string2, bundle2);
                    }
                    C786410Ut5.LJJIIZI(bundle, bundle2, "__post_url_config");
                    c259800zU.element = bundle;
                }
                this.LIZLLL.getClass();
                C19EG c19egLIZ = C1059690dgN.LIZ(context2);
                if (c19egLIZ instanceof Activity) {
                    C1059690dgN c1059690dgN = this.LIZLLL;
                    Bundle bundle3 = (Bundle) c259800zU.element;
                    c1059690dgN.getClass();
                    return C1059690dgN.LIZIZ(c19egLIZ, str, bundle3, map);
                }
                C1059690dgN c1059690dgN2 = this.LIZLLL;
                Bundle bundle4 = (Bundle) c259800zU.element;
                c1059690dgN2.getClass();
                return C1059690dgN.LIZIZ(null, str, bundle4, map);
            }
        }, new AbstractC1059760dgU(c1059860dge) { // from class: X.0dgP
            public final C1059860dge LIZJ;

            @Override // X.AbstractC1059760dgU
            public final List<EnumC1059790dgX> LIZ() {
                return C1697810uHb.LJIIJJI(EnumC1059790dgX.LYNX, EnumC1059790dgX.WEB);
            }

            {
                this.LIZJ = c1059860dge;
            }

            @Override // X.AbstractC1059760dgU
            public final boolean LIZIZ(Context context, String str, Map map) {
                Context context2 = (Context) C1553710qXB.LIZIZ(this.LIZJ, Context.class);
                this.LIZLLL.getClass();
                C19EG c19egLIZ = C1059690dgN.LIZ(context2);
                if (!(c19egLIZ instanceof Activity)) {
                    return false;
                }
                return ((IMainService) this.LIZLLL.LIZ.getValue()).startAdsAppActivity(c19egLIZ, u.LJJIFFI(str, "aweme", "sslocal", false), null);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[PHI: r7
      0x0035: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String) binds: [B:5:0x000e, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r6, java.lang.String r7, android.os.Bundle r8, java.util.Map r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1059690dgN.LIZIZ(android.content.Context, java.lang.String, android.os.Bundle, java.util.Map):boolean");
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public final boolean closeView(C1059860dge c1059860dge, EnumC1059790dgX enumC1059790dgX, String str, boolean z) {
        Object c098200Yq;
        boolean zBooleanValue;
        InterfaceC1052500dUm interfaceC1052500dUm;
        InterfaceC1028200cra interfaceC1028200cra;
        C1047290dMN sessionInfo;
        Activity activityLIZ;
        int iHashCode;
        View viewE1;
        try {
            try {
                JSONObject config = HybridSettings.INSTANCE.getConfig("get_container_id_jsb_rollback");
                if (config != null) {
                    c098200Yq = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Boolean bool = (Boolean) c098200Yq;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if ((str == null || str.length() <= 0) && (!zBooleanValue ? c1059860dge == null || (interfaceC1052500dUm = (InterfaceC1052500dUm) c1059860dge.LIZ(InterfaceC1052500dUm.class)) == null || (str = interfaceC1052500dUm.LIZ()) == null : (interfaceC1028200cra = (InterfaceC1028200cra) C1553710qXB.LIZIZ(c1059860dge, InterfaceC1028200cra.class)) == null || (sessionInfo = interfaceC1028200cra.getSessionInfo()) == null || (str = sessionInfo.LIZ) == null)) {
                str = "";
            }
            SparkContext.Companion.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(str);
            if (c1537480q70LIZIZ != null && ((C1035880d3y) c1537480q70LIZIZ.LJFF(C1035880d3y.class)) != null) {
                InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = c1537480q70LIZIZ.LJIJJ();
                if (interfaceC1541990qEHLJIJJ != null && (viewE1 = interfaceC1541990qEHLJIJJ.e1()) != null) {
                    iHashCode = viewE1.hashCode();
                } else {
                    iHashCode = 0;
                }
                C1440005kM.LIZ(new C0DQL(iHashCode));
                return true;
            }
            Context context = (Context) C1553710qXB.LIZIZ(c1059860dge, Context.class);
            if (context != null && ((IBulletService) ServiceManager.get().getService(IBulletService.class)).LJFF(context, str)) {
                return true;
            }
            InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
            if (interfaceC1059280dfiLIZ != null) {
                interfaceC1059280dfiLIZ.close();
                String str2 = C08RQ.LIZJ(str).get("__spark_session_id");
                if (str2 != null) {
                    C1051980dTw.LIZIZ(str2);
                }
                return true;
            }
            if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
                return false;
            }
            if (!activityLIZ.isFinishing()) {
                activityLIZ.finish();
                if (z) {
                    C786410Ut5.ae(R.anim.ft, activityLIZ, R.anim.g2);
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend
    public boolean openSchema(C1059860dge c1059860dge, String str, Map<String, ? extends Object> map, EnumC1059790dgX enumC1059790dgX, Context context) {
        Context context2;
        List<AbstractC1059760dgU> listProvideRouteOpenHandlerList = provideRouteOpenHandlerList(c1059860dge);
        AbstractC1059760dgU abstractC1059760dgUProvideRouteOpenExceptionHandler = provideRouteOpenExceptionHandler(c1059860dge);
        AbstractC1059760dgU abstractC1059760dgU = null;
        AbstractC1059760dgU abstractC1059760dgU2 = null;
        for (AbstractC1059760dgU abstractC1059760dgU3 : listProvideRouteOpenHandlerList) {
            if (abstractC1059760dgU2 == null) {
                abstractC1059760dgU = abstractC1059760dgU3;
            } else {
                abstractC1059760dgU2.LIZ = abstractC1059760dgU3;
            }
            abstractC1059760dgU3.LIZIZ = abstractC1059760dgUProvideRouteOpenExceptionHandler;
            abstractC1059760dgU2 = abstractC1059760dgU3;
        }
        boolean zLIZIZ = false;
        if (abstractC1059760dgU != null) {
            do {
                if (!abstractC1059760dgU.LIZ().contains(EnumC1059790dgX.ALL) && !abstractC1059760dgU.LIZ().contains(enumC1059790dgX)) {
                    abstractC1059760dgU = abstractC1059760dgU.LIZ;
                } else {
                    if (c1059860dge == null) {
                        context2 = null;
                    } else {
                        context2 = (Context) c1059860dge.LIZ(Context.class);
                    }
                    zLIZIZ = abstractC1059760dgU.LIZIZ(context2, str, map);
                    if (zLIZIZ) {
                        break;
                    }
                    try {
                        abstractC1059760dgU = abstractC1059760dgU.LIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        abstractC1059760dgU = abstractC1059760dgU.LIZIZ;
                    }
                }
            } while (abstractC1059760dgU != null);
        }
        return zLIZIZ;
    }
}
