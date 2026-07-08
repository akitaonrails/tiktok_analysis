package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679440tny {
    public final int LIZ;
    public final C1692150u8T LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1679440tny)) {
            return false;
        }
        C1679440tny c1679440tny = (C1679440tny) obj;
        return this.LIZ == c1679440tny.LIZ && Intrinsics.LJFF(this.LIZIZ, c1679440tny.LIZIZ) && this.LIZJ == c1679440tny.LIZJ && this.LIZLLL == c1679440tny.LIZLLL;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        C1692150u8T c1692150u8T = this.LIZIZ;
        return ((((i + (c1692150u8T == null ? 0 : c1692150u8T.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaretFollowSignal(caret=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", viewportHeight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxScroll=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1679440tny(int i, C1692150u8T c1692150u8T, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = c1692150u8T;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
