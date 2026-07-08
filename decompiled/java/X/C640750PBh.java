package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640750PBh implements C0PBZ {
    public final int LIZ;
    public final C640750PBh LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C640750PBh)) {
            return false;
        }
        C640750PBh c640750PBh = (C640750PBh) obj;
        return this.LIZ == c640750PBh.LIZ && Intrinsics.LJFF(this.LIZIZ, c640750PBh.LIZIZ) && this.LIZJ == c640750PBh.LIZJ && this.LIZLLL == c640750PBh.LIZLLL;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        C640750PBh c640750PBh = this.LIZIZ;
        return ((((i + (c640750PBh == null ? 0 : c640750PBh.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChildTask(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nextLevelTask=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needOffsetZero=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", offset=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C640750PBh(int i, C640750PBh c640750PBh, boolean z, int i2, int i3) {
        c640750PBh = (i3 & 2) != 0 ? null : c640750PBh;
        z = (i3 & 4) != 0 ? false : z;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.LIZ = i;
        this.LIZIZ = c640750PBh;
        this.LIZJ = z;
        this.LIZLLL = i2;
    }
}
