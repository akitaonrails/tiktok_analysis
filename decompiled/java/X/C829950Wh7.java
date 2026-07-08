package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebRouterService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Wh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829950Wh7 {
    public static final C829950Wh7 LIZ = new C829950Wh7();

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040 A[PHI: r1
      0x0040: PHI (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:23:0x003d, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(com.bytedance.hybrid.spark.SparkContext r5) {
        /*
            r2 = -1
            r4 = 1
            if (r5 == 0) goto L3c
            X.0puk r0 = com.bytedance.hybrid.spark.SparkContext.Companion
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r5.LJJJI(r2)
            if (r0 == 0) goto L3c
            boolean r0 = r0.getNeedSecLink()
            if (r0 != r4) goto L3c
            r1 = 1
        L13:
            X.0puk r0 = com.bytedance.hybrid.spark.SparkContext.Companion
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r5.LJJJI(r2)
            if (r0 == 0) goto L40
            java.lang.String r3 = r0.getSecLinkScene()
        L1f:
            java.lang.String r2 = "need_sec_link"
            if (r1 == 0) goto L2b
            if (r3 == 0) goto L2b
            int r0 = r3.length()
            if (r0 != 0) goto L31
        L2b:
            if (r5 == 0) goto L42
            boolean r0 = r5.disableSeclinkExplicit
            if (r0 != r4) goto L42
        L31:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.put(r2, r0)
            return r1
        L3c:
            r1 = 0
            if (r5 == 0) goto L40
            goto L13
        L40:
            r3 = 0
            goto L1f
        L42:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            if (r3 != 0) goto L4b
            java.lang.String r3 = ""
        L4b:
            java.lang.String r0 = "sec_link_scene"
            r1.put(r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.put(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C829950Wh7.LIZ(com.bytedance.hybrid.spark.SparkContext):java.util.Map");
    }

    public static boolean LIZJ(String str) {
        Object c098200Yq;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        if (str != null && str.length() != 0 && a0.LJJIIZI(str, "lynxview", false)) {
            try {
                try {
                    c098200Yq = UriProtector.parse(str);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Uri uri = Uri.EMPTY;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = uri;
                }
                Uri uri2 = (Uri) c098200Yq;
                String host = uri2.getHost();
                if (host == null || (lowerCase3 = host.toLowerCase(Locale.ROOT)) == null || !a0.LJJIIZI(lowerCase3, "webview", false)) {
                    String scheme = uri2.getScheme();
                    if (scheme == null || (lowerCase2 = scheme.toLowerCase(Locale.ROOT)) == null || !lowerCase2.equals("http")) {
                        String scheme2 = uri2.getScheme();
                        if (scheme2 == null || (lowerCase = scheme2.toLowerCase(Locale.ROOT)) == null || !lowerCase.equals("https")) {
                            C189200o6.m2constructorimpl(Unit.LIZ);
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(SparkContext sparkContext, C821850WLv c821850WLv) {
        InterfaceC821860WLw interfaceC821860WLw;
        Object obj;
        Map map;
        Object obj2;
        Map<String, Object> map2;
        Map map3;
        boolean z;
        Map<String, Object> map4;
        if (sparkContext == null) {
            return;
        }
        C821780WLo c821780WLo = c821850WLv.LJ;
        String str = null;
        obj = null;
        Object obj3 = null;
        if (c821780WLo != null) {
            interfaceC821860WLw = c821780WLo.LIZ;
        } else {
            interfaceC821860WLw = null;
        }
        if (interfaceC821860WLw == EnumC821690WLf.WEB_ROUTER_SCHEME_MODIFY) {
            if (c821780WLo != null && (map4 = c821780WLo.LIZIZ) != null) {
                obj3 = map4.get("add_params");
            }
            if ((obj3 instanceof Map) && (map3 = (Map) obj3) != null) {
                boolean z2 = false;
                for (Map.Entry entry : map3.entrySet()) {
                    if (Intrinsics.LJFF(entry.getKey(), "target_handler")) {
                        C1541950qED.LIZJ.getClass();
                        AbstractC1538690q8x abstractC1538690q8x = C1541950qED.LJFF.get(entry.getValue());
                        if (abstractC1538690q8x != null) {
                            InterfaceC1541510qDV interfaceC1541510qDV = (InterfaceC1541510qDV) sparkContext.LJFF(InterfaceC1541510qDV.class);
                            if (interfaceC1541510qDV != null && interfaceC1541510qDV.LIZJ()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                abstractC1538690q8x.LJFF(sparkContext, "");
                            } else {
                                abstractC1538690q8x.LJ(sparkContext, "");
                            }
                        }
                    } else {
                        sparkContext.LJJJZ((String) entry.getKey(), (String) entry.getValue());
                    }
                    z2 = true;
                }
                if (z2) {
                    C1529880puk c1529880puk = SparkContext.Companion;
                    sparkContext.LJJJI(-1);
                    return;
                }
                return;
            }
            return;
        }
        if (interfaceC821860WLw == EnumC821690WLf.WEB_ROUTER_SECLINK_OPEN_DEFAULT_GLOBALLY) {
            if (c821780WLo != null && (map2 = c821780WLo.LIZIZ) != null) {
                obj = map2.get("add_params");
            } else {
                obj = null;
            }
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                obj2 = map.get("need_sec_link");
            } else {
                obj2 = null;
            }
            boolean zLJFF = Intrinsics.LJFF(obj2, "1");
            if (map != null) {
                str = (String) map.get("sec_link_scene");
            }
            if (zLJFF && str != null && str.length() != 0) {
                sparkContext.LJJJZ("sec_link_scene", str);
                sparkContext.LJJL("need_sec_link", true);
                sparkContext.LJJJLZIJ(0, "skip_sec_link_first_jump");
                sparkContext.LJJJI(-1);
            }
        }
    }

    public static void LIZLLL(int i, String str, EnumC822170WNb enumC822170WNb, Context context, EnumC1542040qEM enumC1542040qEM) {
        int iOrdinal;
        SparkSecurityWebRouterService sparkSecurityWebRouterService = (SparkSecurityWebRouterService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelHybridLoad);
        Map<String, Object> map = c828420Wee.LJFF;
        if (str == null) {
            str = "";
        }
        map.put("URL", str);
        c828420Wee.LJFF.put("dataflowId", Integer.valueOf(i));
        c828420Wee.LJFF.put("web_runtime", Integer.valueOf(enumC822170WNb.ordinal()));
        Map<String, Object> map2 = c828420Wee.LJFF;
        if (enumC1542040qEM != null) {
            iOrdinal = enumC1542040qEM.ordinal();
        } else {
            iOrdinal = -1;
        }
        map2.put("web_ui_type", Integer.valueOf(iOrdinal));
        c828420Wee.LJFF.put("context", new WeakReference(context));
        sparkSecurityWebRouterService.handleDidWebRouterWithEvent(c828420Wee);
    }

    public static C821850WLv LJ(int i, String str, EnumC822170WNb enumC822170WNb, Context context, Map map, EnumC1542040qEM enumC1542040qEM, String str2) {
        int iOrdinal;
        SparkSecurityWebRouterService sparkSecurityWebRouterService = (SparkSecurityWebRouterService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelHybridLoad);
        Map<String, Object> map2 = c828420Wee.LJFF;
        if (str == null) {
            str = "";
        }
        map2.put("URL", str);
        c828420Wee.LJFF.put("dataflowId", Integer.valueOf(i));
        c828420Wee.LJFF.put("web_runtime", Integer.valueOf(enumC822170WNb.ordinal()));
        Map<String, Object> map3 = c828420Wee.LJFF;
        if (enumC1542040qEM != null) {
            iOrdinal = enumC1542040qEM.ordinal();
        } else {
            iOrdinal = -1;
        }
        map3.put("web_ui_type", Integer.valueOf(iOrdinal));
        Map<String, Object> map4 = c828420Wee.LJFF;
        if (str2 == null) {
            str2 = "unknown";
        }
        map4.put("runtime_name", str2);
        c828420Wee.LJFF.put("context", new WeakReference(context));
        c828420Wee.LJFF.put("web_params", map);
        return sparkSecurityWebRouterService.handleWillWebRouterWithEvent(c828420Wee);
    }
}
