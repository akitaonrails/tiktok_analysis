package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K44, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K44 {
    public int LIZ;
    public String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K44)) {
            return false;
        }
        C0K44 c0k44 = (C0K44) obj;
        return this.LIZ == c0k44.LIZ && Intrinsics.LJFF(this.LIZIZ, c0k44.LIZIZ) && this.LIZJ == c0k44.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollItemContent(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fixed=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K44(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
