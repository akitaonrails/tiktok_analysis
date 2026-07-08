package X;

import android.net.Uri;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0q65, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536910q65 {
    public static final LruCache<String, C1536930q67> LIZ;
    public static final LruCache<String, AnonymousClass0957<C1536920q66>> LIZIZ;
    public static final LruCache<String, AnonymousClass0957<C1536920q66>> LIZJ;
    public static final List<String> LIZLLL;
    public static final C01GW LJ;

    static {
        C1535840q4M c1535840q4M = C1535630q41.LJIIIIZZ;
        LIZ = c1535840q4M != null && c1535840q4M.LIZ ? new LruCache<>(4) : new LruCache<>(8);
        C1535840q4M c1535840q4M2 = C1535630q41.LJIIIIZZ;
        LIZIZ = (c1535840q4M2 == null || !c1535840q4M2.LIZ) ? new LruCache<>(8) : new LruCache<>(4);
        C1535840q4M c1535840q4M3 = C1535630q41.LJIIIIZZ;
        LIZJ = c1535840q4M3 != null && c1535840q4M3.LIZ ? new LruCache<>(4) : new LruCache<>(8);
        LIZLLL = new CopyOnWriteArrayList();
        LJ = C452501pT.LIZIZ(new C686040Qva());
    }

    public static Map LIZLLL() {
        return (Map) LJ.getValue();
    }

    public static C1536930q67 LIZ(String str) {
        return LIZ.get(C01CL.LIZ(str));
    }

    public static C1536930q67 LIZIZ(String str) {
        LruCache<String, C1536930q67> lruCache;
        C1536940q68 c1536940q68 = (C1536940q68) LIZLLL().get(LIZJ(str));
        if (c1536940q68 != null && (lruCache = c1536940q68.LIZJ) != null) {
            return lruCache.get(C01CL.LIZ(str));
        }
        return null;
    }

    public static String LIZJ(String str) {
        Uri uriLIZJ = C01CL.LIZJ(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, "spark_perf_biz");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZJ, "spark_perf_bid");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                return "";
            }
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }
}
