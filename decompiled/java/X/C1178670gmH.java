package X;

import com.bytedance.bpea.cert.token.TokenCert;

/* JADX INFO: renamed from: X.0gmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178670gmH {
    public static final TokenCert LIZ;
    public static final TokenCert LIZIZ;
    public static final TokenCert LIZJ;

    static {
        TokenCert.Companion companion = TokenCert.Companion;
        LIZ = companion.with("bpea-poi_quiz_request_permission");
        TokenCert tokenCertWith = companion.with("bpea-poi_quiz_request_location");
        tokenCertWith.auth("svfi");
        LIZIZ = tokenCertWith;
        TokenCert tokenCertWith2 = companion.with("bpea-poi_quiz_request_location_decrypt");
        tokenCertWith2.auth("mckd");
        LIZJ = tokenCertWith2;
    }

    public static C1207520hWo LIZ(EnumC1178700gmK enumC1178700gmK) {
        int i = C1178710gmL.LIZ[enumC1178700gmK.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C1207520hWo("ttpro_poi_task_first_completion", "click_nearby_task", null, null, false, false, null, null, null, 508);
                }
                throw new C1954807lC();
            }
            return new C1207520hWo("ttpro_poi_task_question", "click_turn_on", null, null, false, false, null, null, null, 508);
        }
        return new C1207520hWo("ttpro_poi_task_entrance", "click_nearby_task", null, null, false, false, null, null, null, 508);
    }
}
