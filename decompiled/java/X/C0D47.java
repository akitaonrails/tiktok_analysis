package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D47, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D47 {
    public final String LIZ;
    public final String LIZIZ;
    public volatile C0D4A LIZJ;
    public volatile int LIZLLL;
    public volatile String LJ;
    public volatile long LJFF;
    public C09AE LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D47)) {
            return false;
        }
        C0D47 c0d47 = (C0D47) obj;
        return Intrinsics.LJFF(this.LIZ, c0d47.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d47.LIZIZ) && this.LIZJ == c0d47.LIZJ && this.LIZLLL == c0d47.LIZLLL && Intrinsics.LJFF(this.LJ, c0d47.LJ) && this.LJFF == c0d47.LJFF && Intrinsics.LJFF(this.LJI, c0d47.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + (this.LJ == null ? 0 : this.LJ.hashCode())) * 31) + C786410Ut5.Y2(this.LJFF)) * 31;
        C09AE c09ae = this.LJI;
        return iHashCode + (c09ae != null ? c09ae.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuTask(colorValue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", optionType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ucpRetryCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", stateTimestamp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", job=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D47(String str, String str2) {
        C0D4A c0d4a = C0D4A.IDLE;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c0d4a;
        this.LIZLLL = 0;
        this.LJ = null;
        this.LJFF = 0L;
        this.LJI = null;
    }
}
