package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LDY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LDY {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LDY)) {
            return false;
        }
        C0LDY c0ldy = (C0LDY) obj;
        return Intrinsics.LJFF(this.LIZ, c0ldy.LIZ) && this.LIZIZ == c0ldy.LIZIZ && this.LIZJ == c0ldy.LIZJ && this.LIZLLL == c0ldy.LIZLLL && this.LJ == c0ldy.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SummaryComposerConfig(outputDir=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageDurationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", targetWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", targetFps=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LDY(int i, int i2, int i3, String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
