package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714740uiu {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1714740uiu)) {
            return false;
        }
        C1714740uiu c1714740uiu = (C1714740uiu) obj;
        return this.LIZ == c1714740uiu.LIZ && Intrinsics.LJFF(this.LIZIZ, c1714740uiu.LIZIZ) && this.LIZJ == c1714740uiu.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerifyCandidateSwitchOption(candidateIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", verifyType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", labelResId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1714740uiu(int i, String str, int i2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = i2;
    }
}
