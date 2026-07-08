package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635690OwZ {
    public final String LIZ;
    public final int LIZJ;
    public final int LIZIZ = 1;
    public final boolean LIZLLL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C635690OwZ)) {
            return false;
        }
        C635690OwZ c635690OwZ = (C635690OwZ) obj;
        return Intrinsics.LJFF(this.LIZ, c635690OwZ.LIZ) && this.LIZIZ == c635690OwZ.LIZIZ && this.LIZJ == c635690OwZ.LIZJ && this.LIZLLL == c635690OwZ.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxMinisRequestData(clientKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", categorySource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", triggerSource=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", useCache=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C635690OwZ(String str, int i) {
        this.LIZ = str;
        this.LIZJ = i;
    }
}
