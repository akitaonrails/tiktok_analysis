package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.banner.PoiReTagBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagEntranceOptExperiment;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagUIExperiment;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0hMK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201020hMK {
    public static final boolean LIZ(Aweme aweme) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        boolean z;
        boolean z2;
        PoiReTagEntranceOptExperiment.EntranceFrequency entranceFrequency;
        Integer num;
        PoiReTagEntranceOptExperiment.EntranceFrequency entranceFrequency2;
        Integer num2;
        PoiReTagEntranceOptExperiment.EntranceFrequency entranceFrequency3;
        Integer num3;
        int i;
        if (aweme == null) {
            return false;
        }
        int i2 = PoiReTagBottomBarAssemTrigger.LLJLILLLLZIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needShow aid:");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(" poiReTagSignal:");
        sbLIZ.append(aweme.getPoiReTagSignal());
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme.getPoiReTagSignal() == 1 && !aweme.isAd() && aweme.getAwemeRawAd() == null) {
            C1367960lha.LIZ.getClass();
            if (!C1367960lha.LIZ().enable()) {
                return false;
            }
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if ((commerceVideoAuthInfo != null && commerceVideoAuthInfo.isPreventSelfSee()) || aweme.getStarAtlasOrderId() > 0 || !C304920BxK.LIZ()) {
                return false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("aid:");
            sbLIZ2.append(aweme.getAid());
            sbLIZ2.append(", hitFrequency:");
            C1957607le.LIZ.getClass();
            sbLIZ2.append(C1957607le.LIZIZ().getStringSet("key_poi_re_tag_aid", new LinkedHashSet()).contains(aweme.getAid()));
            C2188811AlT.LIZIZ(sbLIZ2);
            if (C1957607le.LIZIZ().getStringSet("key_poi_re_tag_aid", new LinkedHashSet()).contains(aweme.getAid())) {
                return false;
            }
            PoiReTagEntranceOptExperiment.LIZ.getClass();
            if (!PoiReTagEntranceOptExperiment.LIZIZ()) {
                int iLIZJ = C1957607le.LIZJ();
                PoiReTagUIExperiment.PoiReTagConfig poiReTagConfig = (PoiReTagUIExperiment.PoiReTagConfig) PoiReTagUIExperiment.LIZIZ.getValue();
                if (poiReTagConfig != null) {
                    i = poiReTagConfig.closeMaxTimes;
                } else {
                    i = 2;
                }
                if (iLIZJ >= i) {
                    return false;
                }
            } else {
                PoiReTagEntranceOptExperiment.Config configLIZ = PoiReTagEntranceOptExperiment.LIZ();
                if (configLIZ != null && (entranceFrequency3 = configLIZ.frequency) != null && (num3 = entranceFrequency3.frequencyDays) != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                PoiReTagEntranceOptExperiment.Config configLIZ2 = PoiReTagEntranceOptExperiment.LIZ();
                if (configLIZ2 != null && (entranceFrequency2 = configLIZ2.frequency) != null && (num2 = entranceFrequency2.closeTimes) != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                PoiReTagEntranceOptExperiment.Config configLIZ3 = PoiReTagEntranceOptExperiment.LIZ();
                if (configLIZ3 != null && (entranceFrequency = configLIZ3.frequency) != null && (num = entranceFrequency.notClickTimes) != null) {
                    iIntValue3 = num.intValue();
                } else {
                    iIntValue3 = 0;
                }
                if (iIntValue != 0) {
                    long j = C1957607le.LIZIZ().getLong(C1957607le.LJFF("key_poi_re_tag_entrance_next_clear_time"), 0L);
                    if (j != 0) {
                        if (System.currentTimeMillis() >= j) {
                            C1957607le.LIZIZ().storeInt(C1957607le.LJFF("key_poi_re_tag_entrance_not_click_time"), 0);
                            C1957607le.LIZIZ().storeInt(C1957607le.LJFF("key_poi_re_tag_entrance_close_time"), 0);
                            C1957607le.LIZIZ().storeLong(C1957607le.LJFF("key_poi_re_tag_entrance_next_clear_time"), 0L);
                        }
                        return false;
                    }
                    if (iIntValue2 != 0 && iIntValue2 <= C1957607le.LIZIZ().getInt(C1957607le.LJFF("key_poi_re_tag_entrance_close_time"), 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (iIntValue3 != 0 && iIntValue3 <= C1957607le.LIZIZ().getInt(C1957607le.LJFF("key_poi_re_tag_entrance_not_click_time"), 0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z || z2) {
                        long jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(iIntValue);
                        if (PoiReTagEntranceOptExperiment.LIZIZ()) {
                            C1957607le.LIZIZ().storeLong(C1957607le.LJFF("key_poi_re_tag_entrance_next_clear_time"), jCurrentTimeMillis);
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
