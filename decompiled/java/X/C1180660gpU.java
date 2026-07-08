package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180660gpU {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1180660gpU)) {
            return false;
        }
        C1180660gpU c1180660gpU = (C1180660gpU) obj;
        return Intrinsics.LJFF(this.LIZ, c1180660gpU.LIZ) && this.LIZIZ == c1180660gpU.LIZIZ && this.LIZJ == c1180660gpU.LIZJ && Float.compare(this.LIZLLL, c1180660gpU.LIZLLL) == 0;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    public C1180660gpU(int i, int i2, float f, String str) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = f;
    }
}
