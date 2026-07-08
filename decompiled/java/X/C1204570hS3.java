package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.nearby.settings.NearbyClientSettings;
import java.util.Map;

/* JADX INFO: renamed from: X.0hS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204570hS3 extends AbstractC1201400hMw {
    public static final C1204570hS3 LIZIZ = new C1204570hS3();
    public static long LIZJ;

    @Override // X.AbstractC1201400hMw
    public final String LIZLLL() {
        return "ttkls_nearby_location_change_card_popup";
    }

    @Override // X.AbstractC1201400hMw
    public final boolean LIZIZ() {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttkls_nearby_location_change_card_popup");
        sbLIZ.append("_count_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ttkls_nearby_location_change_card_popup");
        sbLIZ2.append("_ts_");
        sbLIZ2.append(curUserId);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        int i = this.LIZ.getInt(strLIZIZ, 0);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ.getLong(strLIZIZ2, 0L);
        if (i >= LJ()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("cannotshow,cancel times = ");
            sbLIZ3.append(i);
            sbLIZ3.append(", >= ");
            sbLIZ3.append(LJ());
            sbLIZ3.append(' ');
            C2188811AlT.LIZIZ(sbLIZ3);
            return true;
        }
        if (jCurrentTimeMillis >= LIZJ()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("canshow,");
            sbLIZ4.append(jCurrentTimeMillis / 8.64E7d);
            sbLIZ4.append("days,");
            sbLIZ4.append(i);
            sbLIZ4.append("counts < ");
            sbLIZ4.append(LJ());
            sbLIZ4.append("counts");
            C2188811AlT.LIZIZ(sbLIZ4);
            return false;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("cannotshow,");
        sbLIZ5.append(jCurrentTimeMillis / 8.64E7d);
        sbLIZ5.append("days,");
        sbLIZ5.append(i);
        sbLIZ5.append("counts < ");
        sbLIZ5.append(LJ());
        sbLIZ5.append("count");
        C2188811AlT.LIZIZ(sbLIZ5);
        return true;
    }

    @Override // X.AbstractC1201400hMw
    public final long LIZJ() {
        NearbyClientSettings.LocationFeedbackCardInterval locationFeedbackCardInterval;
        Map<String, NearbyClientSettings.LocationFeedbackCardInterval> map = NearbyClientSettings.LIZIZ().insertCardTypeIntervalMap;
        Long l = (map == null || (locationFeedbackCardInterval = map.get("location_change_card_type")) == null) ? null : locationFeedbackCardInterval.afterClickIntervalTime;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getNoInterestAuthorizeShowFrequency time = ");
        sbLIZ.append(l);
        C2188811AlT.LIZIZ(sbLIZ);
        if (l != null) {
            return l.longValue();
        }
        return 604800000L;
    }

    @Override // X.AbstractC1201400hMw
    public final int LJ() {
        NearbyClientSettings.LocationFeedbackCardInterval locationFeedbackCardInterval;
        Map<String, NearbyClientSettings.LocationFeedbackCardInterval> map = NearbyClientSettings.LIZIZ().insertCardTypeIntervalMap;
        Integer num = (map == null || (locationFeedbackCardInterval = map.get("location_change_card_type")) == null) ? null : locationFeedbackCardInterval.authorizeShowFrequency;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getNoInterestAuthorizeShowFrequency count = ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        if (num != null) {
            return num.intValue();
        }
        return 5;
    }

    public final long LJII() {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttkls_nearby_location_change_card_popup");
        sbLIZ.append("_en_");
        sbLIZ.append(curUserId);
        long j = this.LIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getEnterNearbyTime = ");
        sbLIZ2.append(j);
        C2188811AlT.LIZIZ(sbLIZ2);
        return j;
    }

    public final void LJIIIZ() {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttkls_nearby_location_change_card_popup");
        sbLIZ.append("_en_");
        sbLIZ.append(curUserId);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LocationChangeCard setEnterNearbyTime,now EnterNearbyTime = ");
        Keva keva2 = this.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ttkls_nearby_location_change_card_popup");
        sbLIZ3.append("_en_");
        sbLIZ3.append(curUserId);
        sbLIZ2.append(keva2.getLong(C2188811AlT.LIZIZ(sbLIZ3), 0L));
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LJIIIIZZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LodationCnahgeCard set frequency,updateTimes = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        LJI(z);
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ttkls_nearby_location_change_card_popup");
        sbLIZ2.append("_count_");
        sbLIZ2.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("ttkls_nearby_location_change_card_popup");
        sbLIZ3.append("_ts_");
        sbLIZ3.append(curUserId);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        int i = this.LIZ.getInt(strLIZIZ, 0);
        long j = this.LIZ.getLong(strLIZIZ2, 0L);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("LodationCnahgeCard set frequency,now CanaelTime = ");
        sbLIZ4.append(j);
        sbLIZ4.append(",Count = ");
        sbLIZ4.append(i);
        C2188811AlT.LIZIZ(sbLIZ4);
    }
}
