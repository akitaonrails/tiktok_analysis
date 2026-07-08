package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652840Pj8 implements InterfaceC655790Pnt {
    public final boolean LIZ;
    public final String LIZIZ;

    public C652840Pj8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C652840Pj8)) {
            return false;
        }
        C652840Pj8 c652840Pj8 = (C652840Pj8) obj;
        return this.LIZ == c652840Pj8.LIZ && Intrinsics.LJFF(this.LIZIZ, c652840Pj8.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text(useAwemeVideoTag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customLabel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C652840Pj8(int i) {
        this.LIZ = true;
        this.LIZIZ = null;
    }
}
