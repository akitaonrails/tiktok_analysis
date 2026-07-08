package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.188H, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C188H extends AbstractC1572300r1A {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C188H() {
        int i = 0;
        this(i, i, (String) null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C188H)) {
            return false;
        }
        C188H c188h = (C188H) obj;
        return Intrinsics.LJFF(this.LIZ, c188h.LIZ) && this.LIZIZ == c188h.LIZIZ && Intrinsics.LJFF(this.LIZJ, c188h.LIZJ) && this.LIZLLL == c188h.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(toastMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", apiDurationMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C188H(int i, int i2, String str, int i3) {
        this((String) null, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? -1 : i2);
    }

    public C188H(String str, int i, String str2, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = i2;
    }
}
