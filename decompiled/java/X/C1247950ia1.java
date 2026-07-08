package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ia1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247950ia1 {
    public final int LIZ;
    public final CharSequence LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1247950ia1)) {
            return false;
        }
        C1247950ia1 c1247950ia1 = (C1247950ia1) obj;
        return this.LIZ == c1247950ia1.LIZ && Intrinsics.LJFF(this.LIZIZ, c1247950ia1.LIZIZ) && this.LIZJ == c1247950ia1.LIZJ && Float.compare(this.LIZLLL, c1247950ia1.LIZLLL) == 0 && this.LJ == c1247950ia1.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NicknameLayoutPlan(maxLines=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", displayText=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", isEllipsized=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textSizePx=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isWordBroken=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public /* synthetic */ C1247950ia1(CharSequence charSequence, float f) {
        this(1, charSequence, false, f, false);
    }

    public C1247950ia1(int i, CharSequence charSequence, boolean z, float f, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = charSequence;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = z2;
    }
}
