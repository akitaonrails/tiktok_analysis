package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460450I3v implements InterfaceC460900I5o {
    public final int LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460450I3v)) {
            return false;
        }
        C460450I3v c460450I3v = (C460450I3v) obj;
        return this.LIZ == c460450I3v.LIZ && Intrinsics.LJFF(this.LIZIZ, c460450I3v.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Integer num = this.LIZIZ;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxIcon(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tint=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C460450I3v(int i, Integer num) {
        this.LIZ = i;
        this.LIZIZ = num;
    }
}
