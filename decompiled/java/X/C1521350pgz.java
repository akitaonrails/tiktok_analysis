package X;

import java.util.List;

/* JADX INFO: renamed from: X.0pgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521350pgz {
    public static final List<C1522070pi9> LIZ;
    public static final List<C1522070pi9> LIZIZ;
    public static final List<C1522070pi9> LIZJ;
    public static final C1522080piA LIZLLL;
    public static final C1522080piA LJ;
    public static final C1522080piA LJFF;

    static {
        List<C1522070pi9> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1522070pi9("PageStartTime", "StartLoadTime", "rn_load_interval"), new C1522070pi9("StartLoadTime", "FirstDrawTime", "first_draw_interval"), new C1522070pi9("FirstDrawTime", "FirstScreenTime", "first_screen_interval"), new C1522070pi9("FirstDrawTime", "PageFinishTime", "page_finish_interval"));
        LIZ = listLJIILJJIL;
        List<C1522070pi9> listLJIILJJIL2 = C1697810uHb.LJIILJJIL(new C1522070pi9("redirectStart", "redirectEnd", "redirect_interval"), new C1522070pi9("fetchStart", "domainLookupStart", "app_cache_interval"), new C1522070pi9("domainLookupStart", "domainLookupEnd", "dns_interval"), new C1522070pi9("connectStart", "connectEnd", "tcp_interval"), new C1522070pi9("requestStart", "responseStart", "request_interval"), new C1522070pi9("responseStart", "responseEnd", "response_interval"), new C1522070pi9("domLoading", "domInteractive", "dom_load_interval"), new C1522070pi9("domContentLoadedEventStart", "domContentLoadedEventEnd", "dom_content_loaded_interval"), new C1522070pi9("domContentLoadedEventEnd", "domComplete", "dom_complete_interval"));
        LIZIZ = listLJIILJJIL2;
        List<C1522070pi9> listLJIILJJIL3 = C1697810uHb.LJIILJJIL(new C1522070pi9("redirectStart", "redirectEnd", "redirect_interval"), new C1522070pi9("fetchStart", "domainLookupStart", "app_cache_interval"), new C1522070pi9("domainLookupStart", "domainLookupEnd", "dns_interval"), new C1522070pi9("connectStart", "connectEnd", "tcp_interval"), new C1522070pi9("requestStart", "responseStart", "request_interval"), new C1522070pi9("responseStart", "responseEnd", "response_interval"));
        LIZJ = listLJIILJJIL3;
        LIZLLL = new C1522080piA(listLJIILJJIL);
        LJ = new C1522080piA(listLJIILJJIL2);
        LJFF = new C1522080piA(listLJIILJJIL3);
    }

    public static C1522080piA LIZ(EnumC1154990gA5 enumC1154990gA5) {
        int i = C1155000gA6.LIZ[enumC1154990gA5.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LJFF;
                }
                throw new C1954807lC();
            }
            return LJ;
        }
        return LIZLLL;
    }
}
