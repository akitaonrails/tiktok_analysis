package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559190qg1 implements InterfaceC2753014t, InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559190qg1)) {
            return false;
        }
        C1559190qg1 c1559190qg1 = (C1559190qg1) obj;
        return Intrinsics.LJFF(this.LL, c1559190qg1.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1559190qg1.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1559190qg1.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1559190qg1.LLILZ) && this.LLILZIL == c1559190qg1.LLILZIL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MiniDramaCenterNewStyleHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", startScene=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", startCategoryId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isFromInnerfeedDiscover=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1559190qg1(String str, String str2, String str3, String str4, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = z;
    }
}
