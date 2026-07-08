package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C336401Sg {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C336401Sg)) {
            return false;
        }
        C336401Sg c336401Sg = (C336401Sg) obj;
        return Intrinsics.LJFF(this.LIZ, c336401Sg.LIZ) && this.LIZIZ == c336401Sg.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefetchCacheResolution(telemetryStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", skipNetwork=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C336401Sg(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
