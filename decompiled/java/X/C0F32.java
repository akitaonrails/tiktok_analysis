package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F32, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F32 {
    public final String LIZ;
    public final long LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F32)) {
            return false;
        }
        C0F32 c0f32 = (C0F32) obj;
        return Intrinsics.LJFF(this.LIZ, c0f32.LIZ) && this.LIZIZ == c0f32.LIZIZ && Float.compare(this.LIZJ, c0f32.LIZJ) == 0 && this.LIZLLL == c0f32.LIZLLL && this.LJ == c0f32.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrameItem(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public C0F32(int i, String str, long j, float f, int i2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = f;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
