package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566060qr6 {
    public String LIZ;
    public String LIZIZ;
    public String LJ;
    public String LIZJ = null;
    public String LIZLLL = null;
    public final C01GW LJFF = C452501pT.LIZIZ(new C1566120qrC());

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1566060qr6)) {
            return false;
        }
        C1566060qr6 c1566060qr6 = (C1566060qr6) obj;
        return Intrinsics.LJFF(this.LIZ, c1566060qr6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1566060qr6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1566060qr6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1566060qr6.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("extra={");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("},logId={");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("} aids={");
        Object[] objArr = (Object[]) this.LJFF.getValue();
        sbLIZ.append(objArr != null ? Arrays.toString(objArr) : null);
        sbLIZ.append("},bindAid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",fragment={");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("}, lifecycleState={");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1566060qr6(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
