package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157680gEQ {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157680gEQ)) {
            return false;
        }
        C1157680gEQ c1157680gEQ = (C1157680gEQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1157680gEQ.LIZ) && this.LIZIZ == c1157680gEQ.LIZIZ && this.LIZJ == c1157680gEQ.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumPreuploadVideoResult(vid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157680gEQ(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
