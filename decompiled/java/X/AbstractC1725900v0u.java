package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchApi;
import com.ss.android.ugc.aweme.pipo.hybrid.prefetch.PipoPrefetchParamInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1725900v0u {
    public volatile Map<String, C1726040v18> LIZ;
    public final Set<String> LIZIZ = new LinkedHashSet();

    public final void LIZJ(Map<String, PipoPrefetchApi> map) {
        if (this.LIZ == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object key = entry.getKey();
                PipoPrefetchApi pipoPrefetchApi = (PipoPrefetchApi) entry.getValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LIZ(pipoPrefetchApi.body, linkedHashSet);
                LIZ(pipoPrefetchApi.fields, linkedHashSet);
                LIZ(pipoPrefetchApi.headers, linkedHashSet);
                LIZ(pipoPrefetchApi.query, linkedHashSet);
                linkedHashMap.put(key, new C1726040v18(pipoPrefetchApi, C13LP.LLIIII(linkedHashSet)));
            }
            this.LIZ = linkedHashMap;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((C1726040v18) entry2.getValue()).LIZIZ.isEmpty()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                LIZIZ((String) entry3.getKey(), (C1726040v18) entry3.getValue());
            }
            return;
        }
        throw new RuntimeException("You have already submit Tasks in this Dispatcher");
    }

    public static void LIZ(Map map, Set set) {
        String str;
        Object c098200Yq;
        if (map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                PipoPrefetchParamInfo pipoPrefetchParamInfo = (PipoPrefetchParamInfo) ((Map.Entry) it2.next()).getValue();
                String str2 = null;
                Object obj = null;
                str2 = null;
                if (Intrinsics.LJFF(pipoPrefetchParamInfo.type, "resp") && (str = pipoPrefetchParamInfo.value) != null) {
                    try {
                        c098200Yq = new JSONObject(str).optString("api_name");
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    str2 = (String) obj;
                }
                if (C1948507kB.LIZ(str2)) {
                    set.add(str2);
                }
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0068 -> B:25:0x0069). Please report as a decompilation issue!!! */
    public final void LIZIZ(String str, C1726040v18 c1726040v18) {
        String strLJJIFFI;
        c1726040v18.LIZJ = true;
        PipoPrefetchApi pipoPrefetchApi = c1726040v18.LIZ;
        C1725920v0w c1725920v0w = new C1725920v0w(this, str);
        C1725980v12 c1725980v12 = (C1725980v12) this;
        Uri uri = c1725980v12.LIZJ;
        try {
            strLJJIFFI = pipoPrefetchApi.url;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (strLJJIFFI != null && strLJJIFFI.length() != 0) {
            if (a0.LJJIIZI(strLJJIFFI, "${domain}", false)) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                Integer num = pipoPrefetchApi.useDefaultDomain;
                String str2 = "";
                if (num != null && num.intValue() == 1) {
                    String host = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getHost();
                    if (host != null) {
                        str2 = host;
                    }
                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, "${domain}", str2, false);
                } else {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), "domain");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                        str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                    }
                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, "${domain}", str2, false);
                }
            }
        } else {
            strLJJIFFI = null;
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(c1725980v12.LIZLLL, C0PEM.LIZJ, null, new C1725910v0v(c1725980v12.LJ, c1725980v12.LJFF, c1725980v12.LIZJ, str, strLJJIFFI, pipoPrefetchApi, c1725980v12.LJI, c1725920v0w, null), 2);
        C1725880v0s c1725880v0s = c1725980v12.LJ;
        String str3 = c1725980v12.LJFF;
        if (strLJJIFFI == null) {
            strLJJIFFI = "";
        }
        C1556200qbC c1556200qbC = new C1556200qbC(str, strLJJIFFI);
        synchronized (c1725880v0s) {
            C1725970v11 c1725970v11 = (C1725970v11) ((LinkedHashMap) c1725880v0s.LIZ).get(str3);
            if (c1725970v11 != null) {
                c1725970v11.LIZLLL.put(c1556200qbC, new C1725960v10(EnumC1725940v0y.PENDING, null, null, anonymousClass0956LIZLLL, 14));
            }
        }
    }
}
