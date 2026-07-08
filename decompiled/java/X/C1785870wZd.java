package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785870wZd {
    public final EnumC1785890wZf LIZ;
    public final InterfaceC1785930wZj LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785870wZd)) {
            return false;
        }
        C1785870wZd c1785870wZd = (C1785870wZd) obj;
        return this.LIZ == c1785870wZd.LIZ && Intrinsics.LJFF(this.LIZIZ, c1785870wZd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1785870wZd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1785870wZd.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorRankingFallbackNode(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", messageResId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", buttonTextResId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1785870wZd(EnumC1785890wZf enumC1785890wZf, C1785970wZn c1785970wZn, Integer num, int i) {
        this(enumC1785890wZf, (i & 2) != 0 ? C1785950wZl.LIZ : c1785970wZn, (i & 4) != 0 ? null : num, (Integer) null);
    }

    public C1785870wZd(EnumC1785890wZf enumC1785890wZf, InterfaceC1785930wZj interfaceC1785930wZj, Integer num, Integer num2) {
        this.LIZ = enumC1785890wZf;
        this.LIZIZ = interfaceC1785930wZj;
        this.LIZJ = num;
        this.LIZLLL = num2;
    }
}
