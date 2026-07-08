package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PRA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRA implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PRA)) {
            return false;
        }
        C0PRA c0pra = (C0PRA) obj;
        return Intrinsics.LJFF(this.LL, c0pra.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pra.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0pra.LLILLL);
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
        sbLIZ.append("UpdateSearchOriginalEntranceAction(reqSearchEnterMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", reqSearchEnterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterGroupId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Ph1().LIZIZ(C13LE.LIZ(C0PRA.class), AFwS293S0000000_10.get$arr$(124));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0PRA(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
