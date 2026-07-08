package X;

import Y.AComparatorS33S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860410Xp9 implements Comparable<C860410Xp9> {
    public final InterfaceC879330YeZ LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final EnumC879230YeP LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C860410Xp9)) {
            return false;
        }
        C860410Xp9 c860410Xp9 = (C860410Xp9) obj;
        return Intrinsics.LJFF(this.LL, c860410Xp9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c860410Xp9.LLILLJJLI) && this.LLILLL == c860410Xp9.LLILLL && this.LLILZ == c860410Xp9.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMReactionListSheetData(reaction=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", userType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C860410Xp9 c860410Xp9) {
        AComparatorS33S0000000_14 aComparatorS33S0000000_14;
        C860410Xp9 c860410Xp92 = c860410Xp9;
        if (this.LLILZ.isSelf() != c860410Xp92.LLILZ.isSelf()) {
            aComparatorS33S0000000_14 = new AComparatorS33S0000000_14(24);
        } else if (this.LLILZ.isSelf()) {
            aComparatorS33S0000000_14 = new AComparatorS33S0000000_14(25);
        } else {
            aComparatorS33S0000000_14 = new AComparatorS33S0000000_14(23);
        }
        return aComparatorS33S0000000_14.compare(this, c860410Xp92);
    }

    public C860410Xp9(InterfaceC879330YeZ interfaceC879330YeZ, String str, long j, EnumC879230YeP enumC879230YeP) {
        this.LL = interfaceC879330YeZ;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = enumC879230YeP;
    }
}
