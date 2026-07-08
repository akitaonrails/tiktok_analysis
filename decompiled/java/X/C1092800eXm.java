package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092800eXm {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1092800eXm)) {
            return false;
        }
        C1092800eXm c1092800eXm = (C1092800eXm) obj;
        return Intrinsics.LJFF(this.LIZ, c1092800eXm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1092800eXm.LIZIZ) && this.LIZJ == c1092800eXm.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1092800eXm.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExposureRecord(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeTs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", guidanceKey=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1092800eXm(String str, String str2, long j, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = str3;
    }
}
