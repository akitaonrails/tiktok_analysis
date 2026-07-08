package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZH implements C0ZZM {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZH)) {
            return false;
        }
        C0ZZH c0zzh = (C0ZZH) obj;
        return Intrinsics.LJFF(this.LIZ, c0zzh.LIZ) && this.LIZIZ == c0zzh.LIZIZ && this.LIZJ == c0zzh.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WithTextUIState(commentText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxLines=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", marginBottom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZZH(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
