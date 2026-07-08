package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS11S2300000_26;
import kotlin.jvm.internal.AwS12S0410000_26;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.AwS4S1210100_26;
import kotlin.jvm.internal.AwS62S1300000_26;

/* JADX INFO: renamed from: X.0vWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745480vWU {
    public static String LIZIZ;
    public static Integer LIZJ;
    public static Boolean LIZLLL;
    public static String LJ;
    public final AddressEditViewModel LIZ;

    public C1745480vWU(AddressEditViewModel addressEditViewModel) {
        this.LIZ = addressEditViewModel;
    }

    public static void LJIILJJIL(String str, HashMap map) {
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C048W(), new AwS115S1100000_1(str, map, 45));
        }
    }

    public static void LIZJ(String str, String str2, Map map) {
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new AnonymousClass0487(), new AwS45S2100000_26(str, str2, (String) map, (Map<String, ? extends Object>) 0));
        }
    }

    public static void LJIIJ(C1745480vWU c1745480vWU, String str, Integer num) {
        c1745480vWU.getClass();
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new AnonymousClass0488(), new AwS4S1210100_26(0L, num, 0L, str, false, 1));
        }
    }

    public final void LJIIIZ(String str, HashMap<String, Object> map, Map<String, ? extends Object> map2) {
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C10515049h(), new AwS62S1300000_26(this, (C1745480vWU) map, (HashMap<String, Object>) str, (String) map2, (Map<String, ? extends Object>) 2));
        }
    }

    public final void LJIILL(String str, String str2, String str3) {
        int i;
        Pair[] pairArr = new Pair[6];
        int i2 = 0;
        pairArr[0] = new Pair("sug_type", "geo_2");
        pairArr[1] = new Pair("button_type", str);
        pairArr[2] = new Pair("cancel_reason", str2);
        pairArr[3] = new Pair("input_box_name", str3);
        if (this.LIZ.LLLLZIL != null) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[4] = new Pair("has_auto_input", Integer.valueOf(i));
        if (this.LIZ.LLLLZIL != null) {
            i2 = 1;
        }
        pairArr[5] = new Pair("has_sug_input", Integer.valueOf(i2));
        LJ(this, "zipcode_unknown", null, C2097608Jq.LJIIIIZZ(pairArr), 2);
    }

    public final void LJI(C1745680vWo c1745680vWo, Long l, boolean z, Map<String, ? extends Object> map) {
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C10511049d(), new AwS12S0410000_26(this, (C1745480vWU) c1745680vWo, (C1745680vWo) l, (Long) map, (Map<String, ? extends Object>) z, false));
        }
    }

    public final void LJII(String str, String str2, HashMap map, Map map2) {
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C10516049i(), new AwS11S2300000_26(this, str, str2, map, map2, 1));
        }
    }

    public static void LIZ(String str, String str2, String str3, Map map, Map map2) {
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C048W(), new C1744800vVO(str, str2, str3, map2, map));
        }
    }

    public static void LJ(C1745480vWU c1745480vWU, String str, Map map, Map map2, int i) {
        Map map3 = map2;
        Map map4 = map;
        if ((i & 2) != 0) {
            map4 = new HashMap();
        }
        if ((i & 4) != 0) {
            map3 = null;
        }
        c1745480vWU.getClass();
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C049Y(), new AwS62S1300000_26(str, (String) c1745480vWU, (C1745480vWU) map4, (Map<String, ? extends Object>) map3, (Map<String, ? extends Object>) 10));
        }
    }

    public static void LJFF(C1745480vWU c1745480vWU, String str, Map map, Map map2, int i) {
        Map map3 = map2;
        Map map4 = map;
        if ((i & 2) != 0) {
            map4 = new HashMap();
        }
        if ((i & 4) != 0) {
            map3 = null;
        }
        c1745480vWU.getClass();
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C049X(), new AwS62S1300000_26(str, (String) c1745480vWU, (C1745480vWU) map4, (Map<String, ? extends Object>) map3, (Map<String, ? extends Object>) 11));
        }
    }

    public static void LJIILIIL(int i, C1745480vWU c1745480vWU, String str, String str2, HashMap map) {
        String str3 = str2;
        String str4 = str;
        if ((i & 2) != 0) {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        c1745480vWU.getClass();
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new AnonymousClass0487(), new AwS11S2300000_26(c1745480vWU, str4, str3, map, (Map) null, 2));
        }
    }

    public final void LJIIJJI(boolean z, HashMap<String, Object> map, String str, String str2, Map<String, ? extends Object> map2) {
        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
        if (addressEditFragment != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C048W(), new C1745500vWW(str, map, z, str2, this, map2));
        }
    }
}
