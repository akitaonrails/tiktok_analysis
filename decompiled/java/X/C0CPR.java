package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressAutoLocationModel;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0CPR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CPR {
    public static final AddressAutoLocationModel LIZ = new AddressAutoLocationModel(C1697810uHb.LJIIJJI("MY", "TH", "SG"));

    public static boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AddressAutoLocationModel addressAutoLocationModel = LIZ;
        AddressAutoLocationModel addressAutoLocationModel2 = (AddressAutoLocationModel) c0c64LJIILLIIL.LJJII(AddressAutoLocationModel.class, addressAutoLocationModel, "ecom_address_auto_location", true);
        if (addressAutoLocationModel2 != null) {
            addressAutoLocationModel = addressAutoLocationModel2;
        }
        List<String> list = addressAutoLocationModel.disableRegions;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (u.LJIJI(it2.next(), str, true)) {
                return true;
            }
        }
        return false;
    }
}
