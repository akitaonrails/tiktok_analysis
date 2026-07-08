package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203730hQh {
    public static final C1203730hQh LIZ = new C1203730hQh();
    public static final MutableLiveData<RoamingLocationInfo> LIZIZ = new MutableLiveData<>();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(17));
    public static C1203960hR4 LIZLLL;

    public static RoamingLocationInfo LIZ() {
        RoamingLocationInfo value = LIZIZ.getValue();
        return value == null ? (RoamingLocationInfo) LIZJ.getValue() : value;
    }

    public static void LIZJ(LocationRegion locationRegion) {
        String cityCode;
        if (locationRegion == null) {
            return;
        }
        RoamingLocationInfo roamingLocationInfoLIZ = LIZ();
        if (roamingLocationInfoLIZ != null) {
            cityCode = roamingLocationInfoLIZ.getCityCode();
        } else {
            cityCode = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateManualRegionIfChanged newManualRegion=");
        sbLIZ.append(locationRegion);
        sbLIZ.append(", shownRegion=");
        sbLIZ.append(roamingLocationInfoLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(cityCode, String.valueOf(locationRegion.getId())) && !Intrinsics.LJFF(locationRegion.getName(), roamingLocationInfoLIZ.manualRegionName)) {
            LIZIZ(new RoamingLocationInfo(locationRegion.getRegionCode(), locationRegion.getName(), true), null);
        }
    }

    public static void LIZIZ(RoamingLocationInfo roamingLocationInfo, C1203960hR4 c1203960hR4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRegion info=");
        sbLIZ.append(roamingLocationInfo);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZLLL = c1203960hR4;
        C0RYF.LIZIZ(LIZIZ, roamingLocationInfo);
        if (roamingLocationInfo.isManual()) {
            C1203740hQi.LIZ.getClass();
            try {
                C1203740hQi.LIZIZ.storeString(C1203740hQi.LIZ("last_roaming_region_v2"), JsonParseUtils.LJ(roamingLocationInfo));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C1203740hQi.LIZ.getClass();
        C1203740hQi.LIZIZ.erase(C1203740hQi.LIZ("last_roaming_region_v2"));
    }
}
