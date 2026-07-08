package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0D2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332820D2y implements Serializable {
    public final boolean availableForSale;
    public final boolean eligibleForNativeCheckout;
    public final String id;
    public final List<String> imageUrls;
    public final Map<String, String> options;
    public final String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332820D2y)) {
            return false;
        }
        C332820D2y c332820D2y = (C332820D2y) obj;
        return Intrinsics.LJFF(this.id, c332820D2y.id) && Intrinsics.LJFF(this.title, c332820D2y.title) && Intrinsics.LJFF(this.options, c332820D2y.options) && this.availableForSale == c332820D2y.availableForSale && Intrinsics.LJFF(this.imageUrls, c332820D2y.imageUrls) && this.eligibleForNativeCheckout == c332820D2y.eligibleForNativeCheckout;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.options.hashCode()) * 31) + C786410Ut5.Z2(this.availableForSale)) * 31) + this.imageUrls.hashCode()) * 31) + C786410Ut5.Z2(this.eligibleForNativeCheckout);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpVariantState(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", options=");
        sbLIZ.append(this.options);
        sbLIZ.append(", availableForSale=");
        sbLIZ.append(this.availableForSale);
        sbLIZ.append(", imageUrls=");
        sbLIZ.append(this.imageUrls);
        sbLIZ.append(", eligibleForNativeCheckout=");
        sbLIZ.append(this.eligibleForNativeCheckout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean match(Map<String, String> map) {
        if (map.isEmpty() || map.isEmpty()) {
            return true;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Set<Map.Entry<String, String>> setEntrySet = this.options.entrySet();
            if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
                Iterator<T> it2 = setEntrySet.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    String str = (String) entry2.getKey();
                    String str2 = (String) entry2.getValue();
                    if (!u.LJIJI(str, key, true) || !u.LJIJI(str2, value, true)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C332820D2y(String str, String str2, Map<String, String> map, boolean z, List<String> list, boolean z2) {
        this.id = str;
        this.title = str2;
        this.options = map;
        this.availableForSale = z;
        this.imageUrls = list;
        this.eligibleForNativeCheckout = z2;
    }

    public C332820D2y(String str, String str2, Map map, boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, map, z, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) != 0 ? false : z2);
    }
}
