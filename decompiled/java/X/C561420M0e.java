package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561420M0e {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C561420M0e)) {
            return false;
        }
        C561420M0e c561420M0e = (C561420M0e) obj;
        return Intrinsics.LJFF(this.LIZ, c561420M0e.LIZ) && this.LIZIZ == c561420M0e.LIZIZ && this.LIZJ == c561420M0e.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftMeta(primaryKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", saveTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastEditTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C561420M0e(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
