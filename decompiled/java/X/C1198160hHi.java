package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198160hHi implements InterfaceC111300bX {
    public final EnumC1198390hI5 LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final Integer LLILZ;
    public final String LLILZIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1198160hHi() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1198160hHi)) {
            return false;
        }
        C1198160hHi c1198160hHi = (C1198160hHi) obj;
        return this.LL == c1198160hHi.LL && Intrinsics.LJFF(this.LLILLJJLI, c1198160hHi.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1198160hHi.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1198160hHi.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1198160hHi.LLILZIL);
    }

    public final int hashCode() {
        EnumC1198390hI5 enumC1198390hI5 = this.LL;
        int iHashCode = (enumC1198390hI5 == null ? 0 : enumC1198390hI5.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        return ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusHierarchyData(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", challengeID=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hideShoot=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", userType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1198160hHi(EnumC1198390hI5 enumC1198390hI5, Integer num, Integer num2, int i) {
        this((i & 1) != 0 ? null : enumC1198390hI5, null, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? 0 : num2, (i & 16) != 0 ? "" : null);
    }

    public C1198160hHi(EnumC1198390hI5 enumC1198390hI5, String str, Integer num, Integer num2, String str2) {
        this.LL = enumC1198390hI5;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = num2;
        this.LLILZIL = str2;
    }
}
