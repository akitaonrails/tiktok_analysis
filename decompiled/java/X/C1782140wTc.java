package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782140wTc implements InterfaceC1782170wTf {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782140wTc)) {
            return false;
        }
        C1782140wTc c1782140wTc = (C1782140wTc) obj;
        return Intrinsics.LJFF(this.LIZ, c1782140wTc.LIZ) && this.LIZIZ == c1782140wTc.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1782140wTc.LIZJ) && this.LIZLLL == c1782140wTc.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidCourseItem(coverUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", playCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", courseId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1782140wTc(long j, long j2, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
        this.LIZLLL = j2;
    }
}
