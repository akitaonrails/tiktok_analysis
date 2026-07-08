package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0hLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200710hLp {
    public static final C1200710hLp LIZ = new C1200710hLp();
    public static final Keva LIZIZ = Keva.getRepo("PoiClaimStateContextKeva");

    public static String LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (C1200810hLz.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("poi_claim_cache_data_v2_");
            sbLIZ.append(curUserId);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("poi_claim_cache_data_");
        sbLIZ2.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
