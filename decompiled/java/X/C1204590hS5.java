package X;

import com.ss.android.ugc.nearby.settings.NearbyClientSettings;
import java.util.Map;

/* JADX INFO: renamed from: X.0hS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204590hS5 extends AbstractC1204580hS4 {
    public static final C1204590hS5 LIZIZ = new C1204590hS5();

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "ttkls_nearby_gps_popup";
    }

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        NearbyClientSettings.NoInterestGpsPopupIntreval noInterestGpsPopupIntreval;
        Integer num;
        Map<String, NearbyClientSettings.NoInterestGpsPopupIntreval> map = NearbyClientSettings.LIZIZ().noInterestGpsPopupIntrevalMap;
        if (map == null || (noInterestGpsPopupIntreval = map.get("LowInterestType")) == null || (num = noInterestGpsPopupIntreval.authorizeShowFrequency) == null) {
            return 3;
        }
        return num.intValue();
    }

    @Override // X.AbstractC1204580hS4
    public final long LJII() {
        return NearbyClientSettings.LIZ();
    }

    @Override // X.AbstractC1204580hS4
    public final long LJIIIZ() {
        return NearbyClientSettings.LIZ();
    }

    public final void LJIIL(EnumC586410MzH enumC586410MzH) {
        LJI(true);
        LJIIJJI(enumC586410MzH);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttkls_nearby_gps_popup");
        sbLIZ.append("_count_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ttkls_nearby_gps_popup");
        sbLIZ2.append("_ts_");
        sbLIZ2.append(curUserId);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        int i = this.LIZ.getInt(strLIZIZ, 0);
        long j = this.LIZ.getLong(strLIZIZ2, 0L);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("set frequency,CanaelTime = ");
        sbLIZ3.append(j);
        sbLIZ3.append(",Count = ");
        sbLIZ3.append(i);
        sbLIZ3.append(",type = ");
        sbLIZ3.append(enumC586410MzH);
        C2188811AlT.LIZIZ(sbLIZ3);
    }
}
