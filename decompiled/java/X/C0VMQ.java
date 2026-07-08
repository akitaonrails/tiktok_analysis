package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VMQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMQ {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VMQ)) {
            return false;
        }
        C0VMQ c0vmq = (C0VMQ) obj;
        return Intrinsics.LJFF(this.LIZ, c0vmq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0vmq.LIZIZ) && this.LIZJ == c0vmq.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0vmq.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyPackage(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", md5=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", engineType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VMQ(String str, String str2, int i, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
    }
}
