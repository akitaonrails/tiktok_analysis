package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787450Uul {
    public static final C787450Uul LIZLLL = new C787450Uul(-1, "", "");
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C787450Uul)) {
            return false;
        }
        C787450Uul c787450Uul = (C787450Uul) obj;
        return this.LIZ == c787450Uul.LIZ && Intrinsics.LJFF(this.LIZIZ, c787450Uul.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c787450Uul.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SIMInfo(subscriptionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", countryIso=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", operatorName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C787450Uul(int i, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
