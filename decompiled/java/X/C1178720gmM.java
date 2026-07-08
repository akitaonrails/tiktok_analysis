package X;

import com.bytedance.bpea.cert.token.TokenCert;

/* JADX INFO: renamed from: X.0gmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178720gmM {
    public static final TokenCert LIZ;
    public static final TokenCert LIZIZ;
    public static final TokenCert LIZJ;
    public static final TokenCert LIZLLL;
    public static final TokenCert LJ;
    public static final TokenCert LJFF;
    public static final TokenCert LJI;

    static {
        TokenCert.Companion companion = TokenCert.Companion;
        TokenCert tokenCertWith = companion.with("bpea-poi_map_mode_fetch_cache_location");
        tokenCertWith.auth("sgix");
        LIZ = tokenCertWith;
        TokenCert tokenCertWith2 = companion.with("bpea-poi_map_mode_encrypted_gps");
        tokenCertWith2.auth("mckd");
        LIZIZ = tokenCertWith2;
        TokenCert tokenCertWith3 = companion.with("bpea-poi_map_mode_fetch_location_in_find_places_nearby");
        tokenCertWith3.auth("bjnv");
        LIZJ = tokenCertWith3;
        LIZLLL = companion.with("bpea-poi_map_mode_fetch_fine_location_permission_in_find_places_nearby");
        LJ = companion.with("bpea-poi_map_mode_fetch_inapp_convert_permission_in_find_places_nearby");
        LJFF = companion.with("bpea-poi_map_mode_fetch_system_convert_permission_in_find_places_nearby");
        LJI = companion.with("bpea-poi-map-precise-manual_popup_android");
    }
}
