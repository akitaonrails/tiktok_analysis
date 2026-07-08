package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688030Qyn {
    public final int LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C688030Qyn)) {
            return false;
        }
        C688030Qyn c688030Qyn = (C688030Qyn) obj;
        return this.LIZ == c688030Qyn.LIZ && this.LIZIZ == c688030Qyn.LIZIZ && Intrinsics.LJFF(this.LIZJ, c688030Qyn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c688030Qyn.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyncLocationProbe(errCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", encryptedLatitude=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", encryptedLongitude=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C688030Qyn(int i, String str, long j, String str2) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
