package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.002A, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C002A {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public C002A() {
        this(0, 0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C002A)) {
            return false;
        }
        C002A c002a = (C002A) obj;
        return this.LIZ == c002a.LIZ && this.LIZIZ == c002a.LIZIZ && Intrinsics.LJFF(this.LIZJ, c002a.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScanProgressInfo(current=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", total=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", assetId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C002A(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
