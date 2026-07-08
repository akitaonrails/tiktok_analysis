package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0waG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786260waG {
    public final boolean LIZ;
    public final Integer LIZIZ;
    public final Integer LIZJ;
    public final CharSequence LIZLLL;
    public final CharSequence LJ;
    public final CharSequence LJFF;
    public final InterfaceC1785930wZj LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1786260waG() {
        this(false, (Integer) null, (Integer) (0 == true ? 1 : 0), (CharSequence) (0 == true ? 1 : 0), (CharSequence) (0 == true ? 1 : 0), (CharSequence) (0 == true ? 1 : 0), 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1786260waG)) {
            return false;
        }
        C1786260waG c1786260waG = (C1786260waG) obj;
        return this.LIZ == c1786260waG.LIZ && Intrinsics.LJFF(this.LIZIZ, c1786260waG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1786260waG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1786260waG.LIZLLL) && Intrinsics.LJFF(this.LJ, c1786260waG.LJ) && Intrinsics.LJFF(this.LJFF, c1786260waG.LJFF) && Intrinsics.LJFF(this.LJI, c1786260waG.LJI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        Integer num = this.LIZIZ;
        int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        CharSequence charSequence = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.LJFF;
        return ((iHashCode4 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusSpec(showLoading=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imageAttr=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", title=");
        sbLIZ.append((Object) this.LIZLLL);
        sbLIZ.append(", message=");
        sbLIZ.append((Object) this.LJ);
        sbLIZ.append(", buttonText=");
        sbLIZ.append((Object) this.LJFF);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1786260waG(boolean z, Integer num, Integer num2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : charSequence, (i & 16) != 0 ? null : charSequence2, (i & 32) != 0 ? null : charSequence3, (i & 64) != 0 ? C1785950wZl.LIZ : null);
    }

    public C1786260waG(boolean z, Integer num, Integer num2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC1785930wZj interfaceC1785930wZj) {
        this.LIZ = z;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = charSequence;
        this.LJ = charSequence2;
        this.LJFF = charSequence3;
        this.LJI = interfaceC1785930wZj;
    }
}
