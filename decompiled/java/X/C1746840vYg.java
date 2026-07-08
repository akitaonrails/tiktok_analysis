package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746840vYg {
    public static final C01GW<C1746840vYg> LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(336));
    public final List<InterfaceC1747220vZI> LIZ = new ArrayList();

    public final void LIZ(Address address, Boolean bool, String str, String str2, Integer num, String str3, Integer num2, String str4) {
        Iterator<InterfaceC1747220vZI> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(address, bool, str, str2, num, str3, num2, str4);
        }
    }
}
