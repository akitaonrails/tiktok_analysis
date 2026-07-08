package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HIK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HIK extends AbstractC942990ae9 {
    public final long LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HIK)) {
            return false;
        }
        C0HIK c0hik = (C0HIK) obj;
        return this.LIZ == c0hik.LIZ && Intrinsics.LJFF(this.LIZIZ, c0hik.LIZIZ) && this.LIZJ == c0hik.LIZJ && this.LIZLLL == c0hik.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateModeSuccess(wallpaperId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", wallPaperUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", playerUserId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HIK(long j, String str, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = j2;
        this.LIZLLL = j3;
    }
}
