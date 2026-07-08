package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309260kAu {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1309260kAu() {
        int i = 0;
        this(i, i, (String) null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1309260kAu)) {
            return false;
        }
        C1309260kAu c1309260kAu = (C1309260kAu) obj;
        return this.LIZ == c1309260kAu.LIZ && this.LIZIZ == c1309260kAu.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1309260kAu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1309260kAu.LIZLLL);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StarshipPitayaError(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", domain=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1309260kAu(int i, int i2, String str, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str, (String) null);
    }

    public C1309260kAu(int i, int i2, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
