package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x8P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807430x8P implements InterfaceC1807470x8T {
    public final String LIZ = "";
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1807430x8P)) {
            return false;
        }
        C1807430x8P c1807430x8P = (C1807430x8P) obj;
        return Intrinsics.LJFF(this.LIZ, c1807430x8P.LIZ) && this.LIZIZ == c1807430x8P.LIZIZ && this.LIZJ == c1807430x8P.LIZJ && this.LIZLLL == c1807430x8P.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpannableStyledIconTemplate(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", start=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", drawableResId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1807430x8P(int i, int i2, int i3) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
