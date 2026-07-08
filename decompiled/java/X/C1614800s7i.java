package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614800s7i {
    public final EnumC1614900s7s LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1614800s7i)) {
            return false;
        }
        C1614800s7i c1614800s7i = (C1614800s7i) obj;
        return this.LIZ == c1614800s7i.LIZ && Intrinsics.LJFF(this.LIZIZ, c1614800s7i.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1614800s7i.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1614800s7i.LIZLLL) && this.LJ == c1614800s7i.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVipCtaUiState(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", textRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textArg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1614800s7i(EnumC1614900s7s enumC1614900s7s, Integer num, String str, boolean z, int i) {
        this(enumC1614900s7s, (String) null, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? true : z);
    }

    public C1614800s7i(EnumC1614900s7s enumC1614900s7s, String str, Integer num, String str2, boolean z) {
        this.LIZ = enumC1614900s7s;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = z;
    }
}
