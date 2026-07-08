package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* JADX INFO: renamed from: X.0Qyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688040Qyo {
    public static final C688040Qyo LIZ = new C688040Qyo();
    public static final TokenCert LIZIZ;
    public static final TokenCert LIZJ;
    public static final TokenCert LIZLLL;
    public static final TokenCert LJ;
    public static final TokenCert LJFF;

    static {
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert tokenCertWith = companion.with("bpea-search_poi_decrypt_location");
        tokenCertWith.auth("mckd");
        LIZIZ = tokenCertWith;
        companion.with("bpea-search_result_poi_location_decrypt").auth("mckd");
        TokenCert tokenCertWith2 = companion.with("bpea-search_poi_fetch_location");
        tokenCertWith2.auth("nany");
        LIZJ = tokenCertWith2;
        companion.with("bpea-search_poi_last_location").auth("inti");
        TokenCert tokenCertWith3 = companion.with("bpea-search_poi_request_location_cacheFirst");
        tokenCertWith3.auth("sgix");
        LIZLLL = tokenCertWith3;
        TokenCert tokenCertWith4 = companion.with("bpea-search_poi_request_location_cacheOnly_android_locate_android");
        tokenCertWith4.auth("sgix");
        LJ = tokenCertWith4;
        TokenCert tokenCertWith5 = companion.with("bpea-search_poi_location_encrypt");
        tokenCertWith5.auth("hyqv");
        LJFF = tokenCertWith5;
    }

    public static TokenCert LIZ(boolean z) {
        if (((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILJJIL() && z) {
            return TokenCert.Companion.with("bpea-search_poi_precise_permission");
        }
        return TokenCert.Companion.with("bpea-search_poi_coarse_permission");
    }
}
