package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626940OiS implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C626940OiS)) {
            return false;
        }
        C626940OiS c626940OiS = (C626940OiS) obj;
        return Intrinsics.LJFF(this.LL, c626940OiS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c626940OiS.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c626940OiS.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MovieDetailHierarchyData(movieId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C626940OiS() {
        this("", "", "");
    }

    public C626940OiS(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
