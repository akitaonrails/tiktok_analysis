package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C876403be {
    public final InterfaceC497601wk LIZ;
    public final String LIZIZ;
    public final C876803bi LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C876403be)) {
            return false;
        }
        C876403be c876403be = (C876403be) obj;
        return Intrinsics.LJFF(this.LIZ, c876403be.LIZ) && Intrinsics.LJFF(this.LIZIZ, c876403be.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c876403be.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c876403be.LIZLLL) && Intrinsics.LJFF(this.LJ, c876403be.LJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C876803bi c876803bi = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c876803bi == null ? 0 : c876803bi.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideLaunchContext(scope=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paySource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", agreementData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pipoHost=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", trackParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C876403be(InterfaceC497601wk interfaceC497601wk, String str, C876803bi c876803bi, String str2, Map<String, ? extends Object> map) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = str;
        this.LIZJ = c876803bi;
        this.LIZLLL = str2;
        this.LJ = map;
    }
}
