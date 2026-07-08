package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155340gAe implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final Boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155340gAe)) {
            return false;
        }
        C1155340gAe c1155340gAe = (C1155340gAe) obj;
        return Intrinsics.LJFF(this.LL, c1155340gAe.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1155340gAe.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1155340gAe.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSearchHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showBanner=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155340gAe() {
        this(null, null, Boolean.TRUE);
    }

    public C1155340gAe(String str, String str2, Boolean bool) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = bool;
    }
}
