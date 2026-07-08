package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667800QHi implements InterfaceC663910Q2j {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C667800QHi)) {
            return false;
        }
        C667800QHi c667800QHi = (C667800QHi) obj;
        return this.LIZ == c667800QHi.LIZ && this.LIZIZ == c667800QHi.LIZIZ && Intrinsics.LJFF(this.LIZJ, c667800QHi.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c667800QHi.LIZLLL);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchUpdateBlankPageAction(launchTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", blankPageEnterForm=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", blankPageEnterMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C667800QHi(long j, long j2, String str, String str2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
