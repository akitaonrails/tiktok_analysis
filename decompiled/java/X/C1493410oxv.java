package X;

import android.webkit.CookieManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493410oxv implements C0X2U, InterfaceC2088208Ga, InterfaceC1493510oy5, InterfaceC1493550oy9, InterfaceC1493540oy8 {
    public static volatile C1493410oxv LLIZ;
    public String LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    public static C1493410oxv LJIIIZ() {
        if (LLIZ == null) {
            synchronized (C1493410oxv.class) {
                try {
                    if (LLIZ == null) {
                        LLIZ = new C1493410oxv();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLIZ;
    }

    @Override // X.InterfaceC2088208Ga
    public final boolean LIZIZ() {
        return this.LLILLL > 0;
    }

    @Override // X.InterfaceC1493550oy9
    public final boolean LIZJ() {
        return !C1493400oxu.LLJZ && this.LLILZIL > 0;
    }

    @Override // X.InterfaceC1493510oy5
    public final boolean LJFF() {
        if (C1493400oxu.LLJZ) {
            C1493780oyW.LIZIZ = 0;
            return false;
        }
        if (C1493400oxu.LLL) {
            C1493780oyW.LIZIZ = 8;
            return false;
        }
        if (this.LLILZLL > 5) {
            C1493780oyW.LIZIZ = 3;
            return false;
        }
        TTNetInit.getTTNetDepend().LIZIZ();
        return true;
    }

    @Override // X.InterfaceC2088208Ga
    public final boolean LJI() {
        return this.LLILLJJLI > 0;
    }

    @Override // X.InterfaceC2088208Ga
    public final boolean LJII() {
        return this.LLILZ > 0;
    }

    public C1493410oxv() {
        LIZ();
    }

    public final void LIZ() {
        try {
            TTNetInit.getTTNetDepend();
            this.LL = TTNetInit.getTTNetDepend().LIZJ(TTNetInit.getTTNetDepend().getContext(), "share_cookie_host_list");
            TTNetInit.getTTNetDepend().LJI(this.LL);
            this.LLILLJJLI = TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), 0, "add_ss_queries_open");
            int iLJFF = TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), 0, "add_ss_queries_header_open");
            this.LLILLL = iLJFF;
            if (this.LLILLJJLI > 0 || iLJFF > 0) {
                SsInterceptor.LL = true;
            }
            this.LLILZ = TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), 1, "add_ss_queries_plaintext_open");
            this.LLILZIL = TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), 0, "http_dns_enabled");
            this.LLILZLL = TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), 0, "chromium_boot_failures");
            int iLJFF2 = TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), Integer.MIN_VALUE, "query_filter_enabled");
            String strLIZJ = TTNetInit.getTTNetDepend().LIZJ(TTNetInit.getTTNetDepend().getContext(), "query_filter_actions");
            C08HA.LIZLLL().LJIIIIZZ(TTNetInit.getTTNetDepend().LIZJ(TTNetInit.getTTNetDepend().getContext(), "L0_params"));
            if (iLJFF2 != Integer.MIN_VALUE) {
                C08HA.LIZLLL().LIZIZ = iLJFF2 > 0;
                C08HA.LIZLLL().LJ(strLIZJ);
            }
            C1494230ozF.LJIJJLI = TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), 1, "private_protocol_enabled") >= 1;
            C1494230ozF.LJIJI.set(TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), -1, "disable_rotating_host_path_retry") >= 1);
            C1494230ozF.LJIL = TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), 0, "no_reflection_enabled") >= 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1493540oy8
    public final boolean isCronetBootFailureExpected() {
        return TTNetInit.getTTNetDepend().LJFF(TTNetInit.getTTNetDepend().getContext(), 0, "chromium_boot_failures") <= 5;
    }

    @Override // X.C0X2U
    public final List<String> LJ(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.LL.split(",")) {
            if (!C2093608Ic.LJ(str2)) {
                arrayList.add(str2);
            }
        }
        TTNetInit.getTTNetDepend().LJIILIIL();
        if (!C2093608Ic.LJ("") && !LJIIIIZZ("", arrayList)) {
            arrayList.add("");
        }
        if (LJIIIIZZ(str, arrayList)) {
            return arrayList;
        }
        return null;
    }

    public static boolean LJIIIIZZ(String str, List list) {
        if (!C2093608Ic.LJ(str) && !C0IKQ.LIZ(list)) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (str.endsWith((String) it2.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // X.C0X2U
    public final List<String> LIZLLL(CookieManager cookieManager, C842310X2n c842310X2n, URI uri) throws Throwable {
        String host;
        if (uri != null && (cookieManager != null || c842310X2n != null)) {
            try {
                host = uri.getHost();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                host = null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : this.LL.split(",")) {
                if (!C2093608Ic.LJ(str)) {
                    arrayList.add(str);
                }
            }
            if (!C2093608Ic.LJ(host) && LJIIIIZZ(host, arrayList)) {
                TTNetInit.getTTNetDepend().LJIILIIL();
                if (C2093608Ic.LJ("")) {
                    return null;
                }
                ?? arrayList2 = new ArrayList();
                if (cookieManager != null) {
                    TTNetInit.getTTNetDepend().LJIILIIL();
                    String strLLIZ = C2204961BRm.LLIZ(cookieManager, "", new C0WZX("dzBzEgAjS8/YVFkiQFyQctEAqJDTy4w5erL+H8tnLce22U7ZTaadTl5VMuirW6Gyvg==", null));
                    if (!C2093608Ic.LJ(strLLIZ)) {
                        arrayList2.add(strLLIZ);
                    }
                }
                if (C0IKQ.LIZ(arrayList2) && c842310X2n != null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append(uri.getScheme());
                        sb.append("://");
                        TTNetInit.getTTNetDepend().LJIILIIL();
                        sb.append("");
                        Map<String, List<String>> map = c842310X2n.get(URI.create(sb.toString()), new LinkedHashMap());
                        if (map != null && !map.isEmpty()) {
                            List<String> list = map.get("Cookie");
                            if (list != null) {
                                try {
                                    list.add("x-tt-cookie-backup-source=1");
                                    return list;
                                } catch (Throwable th) {
                                    th = th;
                                    arrayList2 = list;
                                    TryCatchGuardChecker.doCheck(th);
                                    return arrayList2;
                                }
                            }
                            return list;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return arrayList2;
            }
        }
        return null;
    }
}
