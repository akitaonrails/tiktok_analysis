package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671240tak {
    public final float LIZ;
    public final float LIZIZ;
    public final C1693430uAX LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1671240tak)) {
            return false;
        }
        C1671240tak c1671240tak = (C1671240tak) obj;
        return C1668650tWZ.LIZJ(this.LIZ, c1671240tak.LIZ) && C1668650tWZ.LIZJ(this.LIZIZ, c1671240tak.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1671240tak.LIZJ) && C1668650tWZ.LIZJ(this.LIZLLL, c1671240tak.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TagAttr(heightDp=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(", paddingDp=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(", font=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconSizeDp=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZLLL));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C1671240tak(float f, float f2, C1693430uAX c1693430uAX, float f3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = c1693430uAX;
        this.LIZLLL = f3;
    }
}
