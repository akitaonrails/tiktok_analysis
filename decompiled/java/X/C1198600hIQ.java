package X;

import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hIQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198600hIQ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(706));
    public static final TokenCert LIZIZ;
    public static final TokenCert LIZJ;
    public static final TokenCert LIZLLL;
    public static final TokenCert LJ;
    public static final TokenCert LJFF;

    static {
        TokenCert.Companion companion = TokenCert.Companion;
        LIZIZ = companion.with("bpea-poi_publish_find_nearby_places_turn_on");
        LIZJ = companion.with("bpea-gps_banner_in_poi_search_page_system_precise");
        LIZLLL = companion.with("bpea-gps_banner_in_poi_search_page_in_app_precise");
        LJ = companion.with("bpea-fetch_fine_location_permission_in_search_page");
        LJFF = companion.with("bpea-gps_banner_in_poi_search_page_coarse");
    }

    public static Pair LIZ() {
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert tokenCertWith = companion.with("bpea-user_claim_poi_auto_locate_android");
        tokenCertWith.auth("mttu");
        TokenCert tokenCertWith2 = companion.with("bpea-user_claim_poi_auto_locate_android_decrypt");
        tokenCertWith2.auth("mckd");
        return new Pair(tokenCertWith, tokenCertWith2);
    }

    public static Pair LIZIZ() {
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert tokenCertWith = companion.with("bpea-user_claim_poi_manual_locate_android");
        tokenCertWith.auth("mttu");
        TokenCert tokenCertWith2 = companion.with("bpea-user_claim_poi_manual_locate_android_decrypt");
        tokenCertWith2.auth("mckd");
        return new Pair(tokenCertWith, tokenCertWith2);
    }

    public static Pair LIZLLL() {
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert tokenCertWith = companion.with("bpea-poi_search_fetcher_location");
        tokenCertWith.auth("mttu");
        TokenCert tokenCertWith2 = companion.with("bpea-poi_search_fetcher_location_decrypt");
        tokenCertWith2.auth("mckd");
        return new Pair(tokenCertWith, tokenCertWith2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.bpea.cert.token.TokenCert LJ() {
        /*
            X.0hH4 r0 = X.C1197760hH4.LIZ
            r0.getClass()
            boolean r0 = X.C1197760hH4.LIZ()
            if (r0 != 0) goto L11
            boolean r0 = X.C300190Bph.LIZ()
            if (r0 == 0) goto L29
        L11:
            boolean r0 = LJII()
            if (r0 == 0) goto L20
            java.lang.String r1 = "bpea-publish-poi-search-page-auto-precise_popup_android"
        L19:
            com.bytedance.bpea.cert.token.TokenCert$Companion r0 = com.bytedance.bpea.cert.token.TokenCert.Companion
            com.bytedance.bpea.cert.token.TokenCert r0 = r0.with(r1)
            return r0
        L20:
            boolean r0 = LJII()
            if (r0 != 0) goto L29
            java.lang.String r1 = "bpea-publish-poi-search-page-auto_popup_android"
            goto L19
        L29:
            boolean r0 = LJII()
            if (r0 == 0) goto L32
            java.lang.String r1 = "bpea-poi_search_auto_for_precise"
            goto L19
        L32:
            java.lang.String r1 = "bpea-poi_search_auto"
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1198600hIQ.LJ():com.bytedance.bpea.cert.token.TokenCert");
    }

    public static boolean LJII() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static TokenCert LIZJ() {
        return LJII() ? TokenCert.Companion.with("bpea-poi_publish_turn_on_for_precise") : TokenCert.Companion.with("bpea-poi_publish_turn_on");
    }

    public static TokenCert LJFF() {
        return LJII() ? TokenCert.Companion.with("bpea-poi_search_turn_on_for_precise") : TokenCert.Companion.with("bpea-poi_search_turn_on");
    }

    public static TokenCert LJI(boolean z) {
        if (z) {
            return TokenCert.Companion.with("bpea-poi-search-precise-manual_popup_android");
        }
        return TokenCert.Companion.with("bpea-poi-search-precise-auto_popup_android");
    }
}
