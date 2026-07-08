package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670790QSv {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C670790QSv)) {
            return false;
        }
        C670790QSv c670790QSv = (C670790QSv) obj;
        return Intrinsics.LJFF(this.LIZ, c670790QSv.LIZ) && this.LIZIZ == c670790QSv.LIZIZ && this.LIZJ == c670790QSv.LIZJ && this.LIZLLL == c670790QSv.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchSugRequestMeta(searchPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFirstSug=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", keywordLength=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C670790QSv(String str, int i, boolean z, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = i2;
    }
}
