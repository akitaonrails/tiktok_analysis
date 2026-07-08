package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideRequestParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09QZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QZ {
    public static final C09QZ LIZ = new C09QZ();

    public static EcSearchFeedVideoGuideRequestParams LIZ(Uri uri) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        List listLJJLIIIJILLIZJL;
        JSONArray jSONArrayOptJSONArray;
        Object objOpt;
        String str = "";
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            Uri uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            if (uri2 == null || (c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "user_id")) == null) {
                c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id");
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
        String str2 = (String) c098200Yq;
        if (str2 == null) {
            str2 = "";
        }
        try {
            JSONObject jSONObjectLIZIZ = C1976407og.LIZIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams"));
            if (jSONObjectLIZIZ != null) {
                c098200Yq2 = jSONObjectLIZIZ.optString("device_id");
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        String str3 = (String) c098200Yq2;
        if (str3 == null) {
            str3 = "";
        }
        try {
            JSONObject jSONObjectLIZIZ2 = C1976407og.LIZIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "requestParams"));
            if (jSONObjectLIZIZ2 == null || (jSONArrayOptJSONArray = jSONObjectLIZIZ2.optJSONArray("product_id")) == null || (objOpt = jSONArrayOptJSONArray.opt(0)) == null || (c098200Yq3 = objOpt.toString()) == null) {
                String path = uri.getPath();
                if (path != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(path, new String[]{"/"}, 0, 6)) != null) {
                    c098200Yq3 = (String) C13LP.LJJLIIIJL(listLJJLIIIJILLIZJL);
                } else {
                    c098200Yq3 = null;
                }
            }
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        String str4 = (String) c098200Yq3;
        if (str4 == null) {
            str4 = "";
        }
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
            }
            Uri uri3 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            if (uri3 == null || (c098200Yq4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "chain_key")) == null) {
                c098200Yq4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "chain_key");
            }
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = null;
        }
        String str5 = (String) c098200Yq4;
        if (str5 != null) {
            str = str5;
        }
        C2232408os c2232408os = C341050DYp.LIZ;
        return new EcSearchFeedVideoGuideRequestParams(3, null, null, null, null, C341050DYp.LIZ(null), ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLLLLLZIL(20), null, null, 0, null, null, null, null, str4, Integer.valueOf(((Number) C107200as.LIZ.getValue()).intValue()), Integer.valueOf(((Number) C00ZR.LIZ.getValue()).intValue()), str2, str3, str, uri.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r4) {
        /*
            r2 = 0
            com.google.gson.Gson r3 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            r0.getClass()     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            if (r0 == 0) goto L16
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            r0 = 1
            if (r1 != r0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1a
            goto L24
        L1a:
            X.09Qb r0 = new X.09Qb     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            r0.<init>()     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            goto L2e
        L24:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideConfigData> r0 = com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideConfigData.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
        L2e:
            java.lang.Object r1 = r3.LJIIIIZZ(r4, r0)     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideConfigData     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            if (r0 != 0) goto L37
            r1 = r2
        L37:
            com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideConfigData r1 = (com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideConfigData) r1     // Catch: com.google.gson.s -> L3a java.lang.Throwable -> L4a
            goto L3f
        L3a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4a
            r1 = r2
        L3f:
            if (r1 == 0) goto L42
            goto L44
        L42:
            r1 = r2
            goto L46
        L44:
            java.lang.String r1 = r1.schema     // Catch: java.lang.Throwable -> L4a
        L46:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4a
            goto L56
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L56:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L5d
            r2 = r1
        L5d:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09QZ.LIZJ(java.lang.String):java.lang.String");
    }

    public static void LIZIZ(long j, long j2, String str, Function2 function2) {
        C0CNO.LIZLLL(0L, new C09QT(j2, j, str, function2));
    }
}
