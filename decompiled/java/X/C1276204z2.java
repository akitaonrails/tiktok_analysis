package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04z2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1276204z2 {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1276204z2)) {
            return false;
        }
        C1276204z2 c1276204z2 = (C1276204z2) obj;
        return this.LIZ == c1276204z2.LIZ && Intrinsics.LJFF(this.LIZIZ, c1276204z2.LIZIZ) && this.LIZJ == c1276204z2.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocketMetricDropDecision(samplingRate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", drop=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1276204z2(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
