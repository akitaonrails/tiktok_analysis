package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08o2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2227208o2 {
    public final String LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2227208o2)) {
            return false;
        }
        C2227208o2 c2227208o2 = (C2227208o2) obj;
        return Intrinsics.LJFF(this.LIZ, c2227208o2.LIZ) && this.LIZIZ == c2227208o2.LIZIZ && this.LIZJ == c2227208o2.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LightMeta(fakeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", createdAt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2227208o2(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
