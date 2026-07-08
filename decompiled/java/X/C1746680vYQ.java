package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0vYQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746680vYQ {
    public static final String LIZ(Address address) {
        List<AddressItem> list;
        if (address == null || (list = address.items) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AddressItem addressItem : list) {
            C1746460vY4.LIZ.getClass();
            if (!C13LP.LJJJJ(addressItem.key, C1746460vY4.LJ)) {
                arrayList.add(addressItem);
            }
        }
        return C1741890vQh.LJIIIIZZ(arrayList);
    }
}
