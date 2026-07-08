package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.ss.android.ugc.nearby.settings.NearbyTabConfig;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hSY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204880hSY {
    public static final String LIZIZ() {
        String str;
        C1203730hQh.LIZ.getClass();
        RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
        if (roamingLocationInfoLIZ == null || (str = roamingLocationInfoLIZ.manualRegion) == null) {
            return null;
        }
        return str;
    }

    public static final String LIZJ() {
        C1203730hQh.LIZ.getClass();
        RoamingLocationInfo roamingLocationInfoLIZ = C1203730hQh.LIZ();
        if (roamingLocationInfoLIZ != null && !roamingLocationInfoLIZ.isManual()) {
            return "same";
        }
        RoamingLocationInfo roamingLocationInfoLIZ2 = C1203730hQh.LIZ();
        String regionCode = null;
        String str = roamingLocationInfoLIZ2 != null ? roamingLocationInfoLIZ2.manualRegion : null;
        C1205170hT1.LIZ.getClass();
        if (C1205170hT1.LIZIZ()) {
            LocationRegion locationRegion = C1204850hSV.LIZ() ? NearbyTabConfig.LIZ().contentRegion : NearbyTabConfig.LIZ().currentRegion;
            if (locationRegion != null) {
                regionCode = locationRegion.getRegionCode();
            }
        }
        return !Intrinsics.LJFF(str, regionCode) ? "different" : "same";
    }

    public static final String LIZ() {
        return ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJII(0, C1BWL.LIZ()) ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static final String LIZLLL(C19EG c19eg) {
        HomeTabAbility homeTabAbility;
        List listL32;
        Object ability;
        if (c19eg == null && (c19eg = C629410OmR.LIZ()) == null) {
            return null;
        }
        int i = 0;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19eg, null), MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(HomeTabAbility.class);
            } else {
                ability = null;
            }
            if (!(ability instanceof HomeTabAbility)) {
                ability = null;
            }
            homeTabAbility = (HomeTabAbility) ability;
        } else {
            homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), HomeTabAbility.class, null);
        }
        if (homeTabAbility == null || (listL32 = homeTabAbility.l32()) == null) {
            listL32 = C13BV.INSTANCE;
        }
        Iterator it2 = listL32.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((InterfaceC1583870rJp) it2.next()).tag(), "Nearby")) {
                if (i < 0) {
                    return null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("top_");
                sbLIZ.append(listL32.size() - i);
                sbLIZ.append("tab");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            i++;
        }
        return null;
    }
}
