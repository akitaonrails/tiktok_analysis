package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi.activity.TiktokPoiActivityFrequencySettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hBG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194160hBG {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(234));
    public static final List<String> LIZIZ = new ArrayList();

    public static Keva LJFF() {
        return (Keva) LIZ.getValue();
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_activity_click_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_activity_show_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_activity_click_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_activity_show_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List LJ(String str, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PoiActivityApi.PoiBannerInfo poiBannerInfo = (PoiActivityApi.PoiBannerInfo) it2.next();
                String str7 = null;
                if (poiBannerInfo != null) {
                    str2 = poiBannerInfo.activityId;
                } else {
                    str2 = null;
                }
                String str8 = "";
                if (str2 == null) {
                    str2 = "";
                }
                int i = LJFF().getInt(LIZLLL(str2), 0);
                if (poiBannerInfo == null || (str3 = poiBannerInfo.activityId) == null) {
                    str3 = "";
                }
                int i2 = LJFF().getInt(LIZIZ(str3, str), 0);
                if (poiBannerInfo == null || (str4 = poiBannerInfo.activityId) == null) {
                    str4 = "";
                }
                int i3 = LJFF().getInt(LIZ(str4, str), 0);
                if (poiBannerInfo == null || (str5 = poiBannerInfo.activityId) == null) {
                    str5 = "";
                }
                int i4 = LJFF().getInt(LIZJ(str5), 0);
                if (poiBannerInfo != null && (str6 = poiBannerInfo.activityId) != null) {
                    str8 = str6;
                }
                Keva kevaLJFF = LJFF();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("poi_activity_click_close_");
                sbLIZ.append(str8);
                sbLIZ.append('_');
                sbLIZ.append(str);
                boolean z = kevaLJFF.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("filter each activity, data: showBannerButNoClickTimesByUser: ");
                sbLIZ2.append(i);
                sbLIZ2.append(", showBannerButNoClickTimesByScene ");
                sbLIZ2.append(i2);
                sbLIZ2.append(" clickBannerTimesByScene: ");
                sbLIZ2.append(i3);
                sbLIZ2.append(" clickBannerTimesByUser: ");
                sbLIZ2.append(i4);
                sbLIZ2.append("  closeBanner: ");
                sbLIZ2.append(z);
                sbLIZ2.append("  id: ");
                if (poiBannerInfo != null) {
                    str7 = poiBannerInfo.activityId;
                }
                sbLIZ2.append(str7);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (!z && i2 < TiktokPoiActivityFrequencySettings.LIZ().freqByPositionMaxSeeTimes && i < TiktokPoiActivityFrequencySettings.LIZ().freqByUserMaxSeeTimes && i4 < TiktokPoiActivityFrequencySettings.LIZ().freqByUserMaxClickTimes && i3 < TiktokPoiActivityFrequencySettings.LIZ().freqByPositionMaxClickTimes) {
                    arrayList.add(poiBannerInfo);
                }
            }
        }
        return arrayList;
    }

    public static void LJI(String str, String str2) {
        LJFF().storeInt(LIZ(str, str2), LJFF().getInt(LIZ(str, str2), 0) + 1);
        LJFF().storeInt(LIZJ(str), LJFF().getInt(LIZJ(str), 0) + 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mark click, scene: ");
        sbLIZ.append(str2);
        sbLIZ.append(", id: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJII(String str, String str2) {
        ArrayList arrayList = (ArrayList) LIZIZ;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        LJFF().storeInt(LIZIZ(str, str2), LJFF().getInt(LIZIZ(str, str2), 0) + 1);
        LJFF().storeInt(LIZLLL(str), LJFF().getInt(LIZLLL(str), 0) + 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mark show but no click, scene: ");
        sbLIZ.append(str2);
        sbLIZ.append(", id: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
