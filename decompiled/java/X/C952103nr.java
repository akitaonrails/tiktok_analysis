package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03nr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C952103nr {
    public final Integer LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C952103nr)) {
            return false;
        }
        C952103nr c952103nr = (C952103nr) obj;
        return Intrinsics.LJFF(this.LIZ, c952103nr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c952103nr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c952103nr.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c952103nr.LIZLLL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public C952103nr(Integer num, Integer num2, Boolean bool, String str) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = num2;
        this.LIZLLL = bool;
    }
}
