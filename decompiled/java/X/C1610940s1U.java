package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s1U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610940s1U {
    public final String LIZ;
    public final EnumC1576090r7H LIZIZ;
    public final double LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1610940s1U)) {
            return false;
        }
        C1610940s1U c1610940s1U = (C1610940s1U) obj;
        return Intrinsics.LJFF(this.LIZ, c1610940s1U.LIZ) && this.LIZIZ == c1610940s1U.LIZIZ && Double.compare(this.LIZJ, c1610940s1U.LIZJ) == 0 && this.LIZLLL == c1610940s1U.LIZLLL && Intrinsics.LJFF(this.LJ, c1610940s1U.LJ) && this.LJFF == c1610940s1U.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.X2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeIntentScore(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", intentType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", score=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", modelResult=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", pitayaTraceId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1610940s1U(String str, EnumC1576090r7H enumC1576090r7H, double d, int i, String str2, long j) {
        this.LIZ = str;
        this.LIZIZ = enumC1576090r7H;
        this.LIZJ = d;
        this.LIZLLL = i;
        this.LJ = str2;
        this.LJFF = j;
    }
}
