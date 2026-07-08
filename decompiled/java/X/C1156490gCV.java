package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156490gCV extends AbstractC521460Kci {
    public final C1158720gG6 LIZ;
    public final Long LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1156500gCW(this));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156490gCV)) {
            return false;
        }
        C1156490gCV c1156490gCV = (C1156490gCV) obj;
        return Intrinsics.LJFF(this.LIZ, c1156490gCV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156490gCV.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Long l = this.LIZIZ;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadSuccess(smbPreviewData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", apiRequestDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156490gCV(C1158720gG6 c1158720gG6, Long l) {
        this.LIZ = c1158720gG6;
        this.LIZIZ = l;
    }
}
