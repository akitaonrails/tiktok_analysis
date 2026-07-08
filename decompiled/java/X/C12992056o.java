package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.056o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12992056o {
    public final String LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12992056o)) {
            return false;
        }
        C12992056o c12992056o = (C12992056o) obj;
        return Intrinsics.LJFF(this.LIZ, c12992056o.LIZ) && this.LIZIZ == c12992056o.LIZIZ && this.LIZJ == c12992056o.LIZJ && this.LIZLLL == c12992056o.LIZLLL && this.LJ == c12992056o.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyncConfig(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastSyncMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", configVersion=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", syncPeriodMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12992056o(int i, long j, long j2, boolean z, String str) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = j2;
    }
}
