package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateFragment;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS112S0110000_26;

/* JADX INFO: renamed from: X.0vYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746780vYa {
    public Map<String, ? extends Object> LIZ = C2097608Jq.LJ();
    public String LIZIZ = "suggested_address_list";

    public static void LIZ(HashMap map, boolean z) {
        AddressAssociateFragment addressAssociateFragment = AddressAssociateFragment.LLJJLIIIJLLLLLLLZ;
        if (addressAssociateFragment != null) {
            C1748720vbi.LIZIZ(addressAssociateFragment, new C048W(), new AwS112S0110000_26(map, (HashMap<String, Object>) z, true));
        }
    }

    public static void LIZIZ(Long l, String str, String str2, String str3, boolean z) {
        AddressAssociateFragment addressAssociateFragment = AddressAssociateFragment.LLJJLIIIJLLLLLLLZ;
        if (addressAssociateFragment != null) {
            C1748720vbi.LIZIZ(addressAssociateFragment, new C10511049d(), new C1746820vYe(l, str, str3, str2, z));
        }
    }

    public static void LIZJ(Integer num, Long l, String str, String str2, String str3, String str4, boolean z) {
        AddressAssociateFragment addressAssociateFragment = AddressAssociateFragment.LLJJLIIIJLLLLLLLZ;
        if (addressAssociateFragment != null) {
            C1748720vbi.LIZIZ(addressAssociateFragment, new C10508049a(), new C1746830vYf(num, l, str, str2, str3, str4, z));
        }
    }
}
