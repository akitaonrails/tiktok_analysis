package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997070c3N extends AbstractC997150c3V {
    public final boolean LIZ;
    public final String LIZIZ;

    public C997070c3N() {
        this(false, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C997070c3N)) {
            return false;
        }
        C997070c3N c997070c3N = (C997070c3N) obj;
        return this.LIZ == c997070c3N.LIZ && Intrinsics.LJFF(this.LIZIZ, c997070c3N.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloseEvent(fromLynx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", refer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C997070c3N(boolean z, String str, int i) {
        z = (i & 1) != 0 ? false : z;
        str = (i & 2) != 0 ? null : str;
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
