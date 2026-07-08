package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08EJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EJ {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08EJ)) {
            return false;
        }
        C08EJ c08ej = (C08EJ) obj;
        return this.LIZ == c08ej.LIZ && Intrinsics.LJFF(this.LIZIZ, c08ej.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerifyResult(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", detail=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08EJ(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
