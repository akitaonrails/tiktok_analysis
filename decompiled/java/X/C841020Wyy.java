package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841020Wyy {
    public final C0V0Q LIZ;
    public final C840750WyX LIZIZ;
    public final C841010Wyx LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C841020Wyy)) {
            return false;
        }
        C841020Wyy c841020Wyy = (C841020Wyy) obj;
        return Intrinsics.LJFF(this.LIZ, c841020Wyy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c841020Wyy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c841020Wyy.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkTransaction(ref=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", invokeContext=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", executionTarget=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C841020Wyy(C0V0Q c0v0q, C840750WyX c840750WyX, C841010Wyx c841010Wyx) {
        this.LIZ = c0v0q;
        this.LIZIZ = c840750WyX;
        this.LIZJ = c841010Wyx;
    }
}
