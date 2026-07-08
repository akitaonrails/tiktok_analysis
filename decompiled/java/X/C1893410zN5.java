package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.data.experiment.UGIncentiveImageWebpConfig;
import com.bytedance.touchpoint.data.interceptor.UGIncentiveImageWebpInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893410zN5 {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final C1893410zN5 LIZ = new C1893410zN5();
    public static final HashMap<String, Boolean> LJ = new HashMap<>();

    public static void LIZJ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
        InterfaceC1893620zNQ interfaceC1893620zNQ = new InterfaceC1893620zNQ() { // from class: X.0zN6
            @Override // X.InterfaceC1893620zNQ
            public final void LIZ() {
                C1893410zN5.LIZ.getClass();
                C01U6.LIZ(0L, AnonymousClass0206.get$arr$(440));
                C01U6.LIZ(((long) C1868970yjf.LIZ().preCreateDelayInSeconds) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), new C1893400zN4());
            }
        };
        if (!c1894700zPALIZ.LJIIZILJ.contains(interfaceC1893620zNQ)) {
            c1894700zPALIZ.LJIIZILJ.add(interfaceC1893620zNQ);
        }
        List<String> list = ((UGIncentiveImageWebpConfig) C1910507e3.LIZIZ.getValue()).hosts;
        if (list == null || list.isEmpty()) {
            return;
        }
        C1515120pWw.LIZIZ(new UGIncentiveImageWebpInterceptor());
    }

    public static String LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "pre_create";
            }
            if (num.intValue() == 2) {
                return "pre_render";
            }
            if (num.intValue() == 4) {
                return "reuse";
            }
            return "no_opt";
        }
        return "no_opt";
    }

    public static boolean LIZ(String str, String str2) {
        Object c098200Yq;
        Object c098200Yq2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Object c098200Yq3;
        Object c098200Yq4;
        Uri uriLIZLLL;
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uriLIZLLL2 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        try {
            c098200Yq2 = UriProtector.parse(str2);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Uri uri2 = (Uri) c098200Yq2;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (uri2 != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "url");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        }
        try {
            c098200Yq3 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        Uri uri3 = (Uri) c098200Yq3;
        try {
            c098200Yq4 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = null;
        }
        Uri uri4 = (Uri) c098200Yq4;
        List<String> list = C1868970yjf.LIZ().reuseMatcherOptConfig.reuseMatcherMustCheckParams;
        if (uri3 != null) {
            uriLIZLLL = LIZLLL(uri3, list);
        } else {
            uriLIZLLL = null;
        }
        if (uri4 != null) {
            uriLIZLLL2 = LIZLLL(uri4, list);
        }
        return Intrinsics.LJFF(uriLIZLLL, uriLIZLLL2);
    }

    public static Uri LIZLLL(Uri uri, List list) {
        if (!uri.isHierarchical()) {
            return uri;
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            if (list.contains(str)) {
                Iterator<String> it2 = UriProtector.getQueryParameters(uri, str).iterator();
                while (it2.hasNext()) {
                    builderClearQuery.appendQueryParameter(str, it2.next());
                }
            }
        }
        return builderClearQuery.build();
    }
}
