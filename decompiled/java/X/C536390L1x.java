package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536390L1x {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C536390L1x)) {
            return false;
        }
        C536390L1x c536390L1x = (C536390L1x) obj;
        return Intrinsics.LJFF(this.LIZ, c536390L1x.LIZ) && this.LIZIZ == c536390L1x.LIZIZ && this.LIZJ == c536390L1x.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoInfo(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C536390L1x(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
