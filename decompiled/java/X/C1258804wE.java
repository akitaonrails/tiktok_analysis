package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1258804wE extends AbstractC1254204vU {
    public final C840660WyO LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1258804wE)) {
            return false;
        }
        C1258804wE c1258804wE = (C1258804wE) obj;
        return Intrinsics.LJFF(this.LIZ, c1258804wE.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1258804wE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1258804wE.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1258804wE.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateLegacyEventDomains(event=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originDomain=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tncDomain=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dynamicCdnDomain=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1258804wE(C840660WyO c840660WyO, String str, String str2, String str3) {
        this.LIZ = c840660WyO;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
