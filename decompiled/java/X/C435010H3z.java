package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435010H3z {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C435010H3z)) {
            return false;
        }
        C435010H3z c435010H3z = (C435010H3z) obj;
        return Intrinsics.LJFF(this.LIZ, c435010H3z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c435010H3z.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c435010H3z.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisInstantPlayPreviewRow(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", label=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C435010H3z(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
