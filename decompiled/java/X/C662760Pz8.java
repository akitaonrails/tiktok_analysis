package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662760Pz8 {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C662760Pz8)) {
            return false;
        }
        C662760Pz8 c662760Pz8 = (C662760Pz8) obj;
        return Intrinsics.LJFF(this.LIZ, c662760Pz8.LIZ) && this.LIZIZ == c662760Pz8.LIZIZ && this.LIZJ == c662760Pz8.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LcpBindInfo(cardType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C662760Pz8(String str, long j, int i) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
