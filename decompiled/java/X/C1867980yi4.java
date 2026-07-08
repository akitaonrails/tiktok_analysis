package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yi4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867980yi4 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C1867980yi4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1867980yi4)) {
            return false;
        }
        C1867980yi4 c1867980yi4 = (C1867980yi4) obj;
        return Intrinsics.LJFF(this.LIZ, c1867980yi4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1867980yi4.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1867980yi4.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SOTLInitConfig(redirectUri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clientId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", appId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1867980yi4(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
    }
}
