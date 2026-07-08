package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689170R1n {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C689170R1n)) {
            return false;
        }
        C689170R1n c689170R1n = (C689170R1n) obj;
        return this.LIZ == c689170R1n.LIZ && Intrinsics.LJFF(this.LIZIZ, c689170R1n.LIZIZ) && this.LIZJ == c689170R1n.LIZJ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleMarkdownParams(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C689170R1n(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
