package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0goU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180040goU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeNpsIsFeedback: isFeedback=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        Keva repo = Keva.getRepo("poi_nps_frequency_repo");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("poi_nps_is_feedback");
        sbLIZ2.append(str);
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), z);
    }
}
