package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09JH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09JH extends C09JG {
    public final String LIZ;
    public final String LIZIZ;

    public C09JH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09JH)) {
            return false;
        }
        C09JH c09jh = (C09JH) obj;
        return Intrinsics.LJFF(this.LIZ, c09jh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c09jh.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotifyTaskInput(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C09JH(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
    }
}
