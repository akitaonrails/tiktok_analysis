package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.nearby.settings.NearbyClientSettings;
import com.ss.android.ugc.nearby.settings.NearbyTabConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hT1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205170hT1 {
    public static final C1205170hT1 LIZ = new C1205170hT1();
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static String LIZLLL;

    public static boolean LIZ() {
        boolean z = LIZIZ && LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nearby_tab_region_list canShowNearbyTabArrow = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    public static boolean LIZJ() {
        if (C288440BSg.LIZ || !LIZIZ()) {
            return false;
        }
        return NearbyTabConfig.LIZ().nearbyRoamingEnable;
    }

    public static boolean LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nearby_tab_region_list isMetTopTabShowCondition = ");
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.NEARBY;
        c1585070rLl.getClass();
        sbLIZ.append(C1585070rLl.LJIIIZ(enumC1584360rKc, null));
        C2188811AlT.LIZIZ(sbLIZ);
        return C1585070rLl.LJIIIZ(enumC1584360rKc, null);
    }

    public static C1205180hT2 LIZLLL(C19EG c19eg) {
        HomeTabAbility homeTabAbility;
        List<TopTabProtocol> listB9;
        TopTabProtocol next;
        C1583120rIc c1583120rIcLJI;
        Object ability;
        InterfaceC1583070rIX interfaceC1583070rIX = null;
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
        if (homeTabAbility == null || (listB9 = homeTabAbility.b9()) == null) {
            return null;
        }
        Iterator<TopTabProtocol> it2 = listB9.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getTag(), "Nearby")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TopTabProtocol topTabProtocol = next;
        if (topTabProtocol == null || (c1583120rIcLJI = topTabProtocol.LJI()) == null) {
            return null;
        }
        InterfaceC1583070rIX interfaceC1583070rIX2 = c1583120rIcLJI.LIZ;
        if (interfaceC1583070rIX2 != null) {
            interfaceC1583070rIX = interfaceC1583070rIX2;
        }
        return (C1205180hT2) interfaceC1583070rIX;
    }

    public static String LJ(String str) {
        int iIntValue;
        if (C288440BSg.LIZ) {
            LIZJ = false;
            return C20642515q3.LJI(2131846246);
        }
        if (str == null) {
            LIZJ = false;
            return C20642515q3.LJI(2131837937);
        }
        int length = str.length();
        Integer num = NearbyClientSettings.LIZIZ().tabMaxLength;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 13;
        }
        if (length <= iIntValue && str.length() > 0) {
            LIZJ = true;
            return str;
        }
        LIZJ = false;
        return C20642515q3.LJI(2131837937);
    }
}
