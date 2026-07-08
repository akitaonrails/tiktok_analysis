package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006450cIV {
    public final EnumC1006480cIY LIZ;
    public final Long LIZIZ;
    public final Integer LIZJ;
    public final String LIZLLL;

    public C1006450cIV() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1006450cIV)) {
            return false;
        }
        C1006450cIV c1006450cIV = (C1006450cIV) obj;
        return this.LIZ == c1006450cIV.LIZ && Intrinsics.LJFF(this.LIZIZ, c1006450cIV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1006450cIV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1006450cIV.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LIZLLL;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreBootState(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1006450cIV(EnumC1006480cIY enumC1006480cIY, int i) {
        this((i & 1) != 0 ? EnumC1006480cIY.IDLE : enumC1006480cIY, null, null, null);
    }

    public C1006450cIV(EnumC1006480cIY enumC1006480cIY, Long l, Integer num, String str) {
        this.LIZ = enumC1006480cIY;
        this.LIZIZ = l;
        this.LIZJ = num;
        this.LIZLLL = str;
    }
}
