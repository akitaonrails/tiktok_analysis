package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ftv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144970ftv {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C1144970ftv LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1144970ftv)) {
            return false;
        }
        C1144970ftv c1144970ftv = (C1144970ftv) obj;
        return Intrinsics.LJFF(this.LIZ, c1144970ftv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1144970ftv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1144970ftv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1144970ftv.LIZLLL) && Intrinsics.LJFF(this.LJ, c1144970ftv.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        C1144970ftv c1144970ftv = this.LJ;
        return iHashCode + (c1144970ftv == null ? 0 : c1144970ftv.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpecialEffectEnterAnimConfig(fileName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", channel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatarImageId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sentImageId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fallback=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1144970ftv(String str, String str2, String str3, String str4, C1144970ftv c1144970ftv) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = c1144970ftv;
    }
}
