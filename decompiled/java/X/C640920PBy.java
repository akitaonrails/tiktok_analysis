package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640920PBy implements C0PWT {
    public final Integer LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C640920PBy)) {
            return false;
        }
        C640920PBy c640920PBy = (C640920PBy) obj;
        return Intrinsics.LJFF(this.LL, c640920PBy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c640920PBy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c640920PBy.LLILLL) && Intrinsics.LJFF(this.LLILZ, c640920PBy.LLILZ);
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LLILZ;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchActivatedIdUpdateTopBarIdInfoAction(topBarType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", topBarId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", topBarKeyword=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasTopBar=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().cp2().LIZIZ(C13LE.LIZ(C640920PBy.class), AFwS293S0000000_10.get$arr$(158));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C640920PBy(Integer num, String str, String str2, Boolean bool) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = bool;
    }
}
