package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C224800tq extends AbstractC224700tp {
    public final C1A8R LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C224800tq) && Intrinsics.LJFF(this.LIZ, ((C224800tq) obj).LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToggleMode(toggleMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LIZ.LIZIZ();
    }

    public C224800tq(C1A8R c1a8r) {
        this.LIZ = c1a8r;
    }
}
