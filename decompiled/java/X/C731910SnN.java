package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731910SnN {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C731910SnN)) {
            return false;
        }
        C731910SnN c731910SnN = (C731910SnN) obj;
        return Intrinsics.LJFF(this.LIZ, c731910SnN.LIZ) && this.LIZIZ == c731910SnN.LIZIZ && this.LIZJ == c731910SnN.LIZJ && this.LIZLLL == c731910SnN.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoDisplayState(displayCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", displayVisible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconDisplayVisible=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C731910SnN LIZ(C731910SnN c731910SnN, boolean z) {
        return new C731910SnN(c731910SnN.LIZ, c731910SnN.LIZIZ, z, c731910SnN.LIZLLL);
    }

    public C731910SnN(String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
