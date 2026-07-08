package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N98, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N98 {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N98)) {
            return false;
        }
        C0N98 c0n98 = (C0N98) obj;
        return Intrinsics.LJFF(this.LIZ, c0n98.LIZ) && this.LIZIZ == c0n98.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefetchRecord(contentType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0N98(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }
}
