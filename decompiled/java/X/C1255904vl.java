package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1255904vl {
    public final String LIZ;
    public final Map<String, String> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1255904vl)) {
            return false;
        }
        C1255904vl c1255904vl = (C1255904vl) obj;
        return Intrinsics.LJFF(this.LIZ, c1255904vl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1255904vl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1255904vl.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutNetworkRequest(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", headers=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", body=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1255904vl(String str, Map<String, String> map, String str2) {
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = str2;
    }
}
