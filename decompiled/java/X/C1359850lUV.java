package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lUV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359850lUV implements InterfaceC111300bX {
    public final String LL = "v3.0";
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1359850lUV)) {
            return false;
        }
        C1359850lUV c1359850lUV = (C1359850lUV) obj;
        return Intrinsics.LJFF(this.LL, c1359850lUV.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1359850lUV.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostPanelButtonHierarchyData(friendsV3Version=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", friendsV3Scene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1359850lUV(String str) {
        this.LLILLJJLI = str;
    }
}
