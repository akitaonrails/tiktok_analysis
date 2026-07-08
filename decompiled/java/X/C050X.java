package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C050X {
    public final String LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C050X)) {
            return false;
        }
        C050X c050x = (C050X) obj;
        return Intrinsics.LJFF(this.LIZ, c050x.LIZ) && this.LIZIZ == c050x.LIZIZ && this.LIZJ == c050x.LIZJ && this.LIZLLL == c050x.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPollGuideStorageState(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasEverCreatedPoll=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastShowTimestamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canShowByStorageGate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C050X(long j, String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = z2;
    }
}
