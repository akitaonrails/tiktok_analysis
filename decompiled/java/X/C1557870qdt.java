package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557870qdt {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557870qdt)) {
            return false;
        }
        C1557870qdt c1557870qdt = (C1557870qdt) obj;
        return Intrinsics.LJFF(this.LIZ, c1557870qdt.LIZ) && this.LIZIZ == c1557870qdt.LIZIZ && this.LIZJ == c1557870qdt.LIZJ && this.LIZLLL == c1557870qdt.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushKey(musicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trimmedDurationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557870qdt(String str, int i, int i2, int i3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
