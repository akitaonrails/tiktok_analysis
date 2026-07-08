package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978040bYg {
    public final EnumC978030bYf LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C978040bYg)) {
            return false;
        }
        C978040bYg c978040bYg = (C978040bYg) obj;
        return this.LIZ == c978040bYg.LIZ && Intrinsics.LJFF(this.LIZIZ, c978040bYg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c978040bYg.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartAnimationRuleResolution(animationMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", matchRuleKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", teamRuleKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C978040bYg(EnumC978030bYf enumC978030bYf, String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        this.LIZ = enumC978030bYf;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
