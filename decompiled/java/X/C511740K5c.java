package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.PGCSubsService;
import com.ss.android.ugc.aweme.subscription.pgc.serviceimpl.PGCSubsServiceImpl;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511740K5c {
    public static final C511740K5c LIZ = new C511740K5c();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(313));

    public static Bundle LIZ(Uri uri, Map map) {
        Bundle bundle = new Bundle();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C786410Ut5.LJJJI((String) entry.getKey(), (String) entry.getValue(), bundle);
            }
        }
        return bundle;
    }

    public static Map LIZIZ(Uri uri, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "log_param");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
            linkedHashMap.putAll(C0K51.LJIILJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2));
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public static String LIZJ(Uri uri, String str) {
        Object c098200Yq;
        String str2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            try {
                c098200Yq = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "UTF-8");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static void LJII(Context context, Uri uri) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        boolean z;
        Long lLJIIL;
        Long lLJIIL2;
        Long lLJIIL3;
        Long lLJIIL4;
        boolean zLJFF = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_anchor"), "1");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
        String str = "";
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "group_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra_log_pb");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "previous_page");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null && (lLJIIL4 = C0K51.LJIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)) != null) {
            jLongValue = lLJIIL4.longValue();
        } else {
            jLongValue = 0;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 != null && (lLJIIL3 = C0K51.LJIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7)) != null) {
            jLongValue2 = lLJIIL3.longValue();
        } else {
            jLongValue2 = 0;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "privilege_scenario");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = "live_room";
        }
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("use_new_style", false);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "package_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "liveSubOnlyLiveTier");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 != null && (lLJIIL2 = C0K51.LJIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10)) != null) {
            jLongValue3 = lLJIIL2.longValue();
        } else {
            jLongValue3 = 0;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "liveSubOnlyLiveMonth");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 != null && (lLJIIL = C0K51.LJIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11)) != null) {
            jLongValue4 = lLJIIL.longValue();
        } else {
            jLongValue4 = 0;
        }
        boolean zLJFF2 = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_dim"), "1");
        if (jLongValue > 0) {
            z = true;
        } else {
            z = false;
        }
        SubscriptionSceneContext subscriptionSceneContext = new SubscriptionSceneContext(jLongValue, jLongValue2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, null, null, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null, null, z, false, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8, booleanQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9, jLongValue3, jLongValue4, null, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, zLJFF2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, uri, 33496);
        PGCSubsService pGCSubsServiceLJIIIZ = PGCSubsServiceImpl.LJIIIZ();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "demo_source");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 != null) {
            str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12;
        }
        pGCSubsServiceLJIIIZ.LIZIZ(context, zLJFF, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, str, subscriptionSceneContext);
    }

    public static boolean LIZLLL(Context context, Uri uri, Map map) {
        Object c098200Yq;
        boolean zLJIIJ;
        C00Z3.LIZ.getClass();
        if (!C00Z3.LIZ()) {
            if (!LJIIJ(context, uri, "/sub_package", map)) {
                LIZ.getClass();
                if (LJ(context, uri, map)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        try {
            LIZ.getClass();
            c098200Yq = Boolean.valueOf(LJ(context, uri, map));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zLJIIJ = bool.booleanValue();
        } else {
            zLJIIJ = LJIIJ(context, uri, "/sub_package", map);
        }
        if (zLJIIJ) {
            return true;
        }
        LIZ.getClass();
        if (LJ(context, uri, map)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(android.content.Context r45, android.net.Uri r46, java.util.Map r47) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C511740K5c.LJ(android.content.Context, android.net.Uri, java.util.Map):boolean");
    }

    public static boolean LJFF(Context context, Uri uri, Map map) {
        Object c098200Yq;
        boolean zLJIIJ;
        boolean zLJII;
        C00Z3.LIZ.getClass();
        if (!C00Z3.LIZ()) {
            if (!LJIIJ(context, uri, "/privilege_page", map)) {
                LIZ.getClass();
                if (!LJI(context, uri, map)) {
                    return false;
                }
            }
        } else {
            try {
                LIZ.getClass();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "page_type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "full_page")) {
                    Bundle bundleLIZ = LIZ(uri, map);
                    C786410Ut5.LJJJI("original_url", uri.toString(), bundleLIZ);
                    zLJII = PGCSubsServiceImpl.LJIIIZ().LJII(context, "pgc_privilege_page_fragment", bundleLIZ);
                } else {
                    LJII(context, uri);
                    zLJII = true;
                }
                c098200Yq = Boolean.valueOf(zLJII);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = Boolean.FALSE;
            }
            if (!((Boolean) c098200Yq).booleanValue()) {
                c098200Yq = null;
            }
            Boolean bool = (Boolean) c098200Yq;
            if (bool != null) {
                zLJIIJ = bool.booleanValue();
            } else {
                zLJIIJ = LJIIJ(context, uri, "/privilege_page", map);
            }
            if (!zLJIIJ) {
                LIZ.getClass();
                if (LJI(context, uri, map)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean LJI(Context context, Uri uri, Map map) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "page_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "full_page")) {
            Bundle bundleLIZ = LIZ(uri, map);
            C786410Ut5.LJJJI("original_url", uri.toString(), bundleLIZ);
            C786410Ut5.LJJJI("fragment_type", "pgc_privilege_page", bundleLIZ);
            return C1931507hR.LIZ().LIZIZ(context, bundleLIZ);
        }
        LJII(context, uri);
        return true;
    }

    public static boolean LJIIIIZZ(Context context, Uri uri, Map map) {
        Object c098200Yq;
        boolean zLJIIJ;
        C00Z3.LIZ.getClass();
        if (!C00Z3.LIZ()) {
            if (!LJIIJ(context, uri, "/sub_unique_sku_notification", map)) {
                LIZ.getClass();
                if (LJIIIZ(context, uri, map, new AwS373S0200000_7(context, (Context) map, (Map<String, String>) 79))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        try {
            LIZ.getClass();
            c098200Yq = Boolean.valueOf(LJIIIZ(context, uri, map, new AwS586S0100000_7(context, 510)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool != null) {
            zLJIIJ = bool.booleanValue();
        } else {
            zLJIIJ = LJIIJ(context, uri, "/sub_unique_sku_notification", map);
        }
        if (zLJIIJ) {
            return true;
        }
        LIZ.getClass();
        if (LJIIIZ(context, uri, map, new AwS373S0200000_7(context, (Context) map, (Map<String, String>) 79))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIZ(android.content.Context r46, android.net.Uri r47, java.util.Map r48, kotlin.jvm.functions.Function1 r49) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C511740K5c.LJIIIZ(android.content.Context, android.net.Uri, java.util.Map, kotlin.jvm.functions.Function1):boolean");
    }

    public static boolean LJIIJ(Context context, Uri uri, String str, Map map) {
        Object c098200Yq;
        Map mapLIZIZ = LIZIZ(uri, map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sslocal://webcast_subscribe");
        sbLIZ.append(str);
        C2089008Gi c2089008Gi = new C2089008Gi(C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : ((LinkedHashMap) mapLIZIZ).entrySet()) {
            c2089008Gi.LIZLLL((String) entry.getKey(), (String) entry.getValue());
        }
        try {
            c098200Yq = Boolean.valueOf(C511620K4q.LIZ.LIZ(context, UriProtector.parse(c2089008Gi.LJ()), C2097608Jq.LJ()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }
}
