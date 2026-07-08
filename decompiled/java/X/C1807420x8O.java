package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807420x8O implements InterfaceC1807470x8T {
    public final String LIZ = "";
    public final int LIZIZ;
    public final int LIZJ;
    public final C1807450x8R LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1807420x8O)) {
            return false;
        }
        C1807420x8O c1807420x8O = (C1807420x8O) obj;
        return Intrinsics.LJFF(this.LIZ, c1807420x8O.LIZ) && this.LIZIZ == c1807420x8O.LIZIZ && this.LIZJ == c1807420x8O.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1807420x8O.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        C1807450x8R c1807450x8R = this.LIZLLL;
        return iHashCode + (c1807450x8R == null ? 0 : c1807450x8R.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpannableStyledTextTemplate(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", start=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", styledTextTemplate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1807420x8O(int i, int i2, C1807450x8R c1807450x8R) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = c1807450x8R;
    }
}
