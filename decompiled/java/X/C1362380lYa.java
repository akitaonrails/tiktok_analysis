package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362380lYa {
    public final Set<IMContact> LIZ;
    public final C1363240lZy LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362380lYa)) {
            return false;
        }
        C1362380lYa c1362380lYa = (C1362380lYa) obj;
        return Intrinsics.LJFF(this.LIZ, c1362380lYa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1362380lYa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1362380lYa.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitExtras(mutableSelectedContacts=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contactContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", defaultSelectUid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1362380lYa(Set<IMContact> set, C1363240lZy c1363240lZy, String str) {
        this.LIZ = set;
        this.LIZIZ = c1363240lZy;
        this.LIZJ = str;
    }
}
