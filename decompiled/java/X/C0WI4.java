package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WI4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WI4 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0WI4)) {
            return false;
        }
        C0WI4 c0wi4 = (C0WI4) obj;
        return this.LIZ == c0wi4.LIZ && Intrinsics.LJFF(this.LIZIZ, c0wi4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0wi4.LIZJ) && this.LIZLLL == c0wi4.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProviderAccessResult(allowed=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", callerType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", checkType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", signatureHit=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0WI4(String str, boolean z) {
        this(-1, str, "self_package", z);
    }

    public C0WI4(int i, String str, String str2, boolean z) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
    }
}
