package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creatortools.tiktokseries.SeriesSetting;

/* JADX INFO: renamed from: X.0CNI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNI {
    public static final C0CNI LIZ = new C0CNI();

    public static boolean LIZ() {
        SeriesSetting seriesSettingLIZ = C0C1P.LIZ();
        if (seriesSettingLIZ == null || !seriesSettingLIZ.showRedDot) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_tiktok_series");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_tiktok_series_red_dot");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }
}
