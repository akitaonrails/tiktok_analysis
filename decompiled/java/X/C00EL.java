package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00EL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EL {
    public final boolean LIZ;
    public final List<C0XJX> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00EL)) {
            return false;
        }
        C00EL c00el = (C00EL) obj;
        return this.LIZ == c00el.LIZ && Intrinsics.LJFF(this.LIZIZ, c00el.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppInstallQueryConfig(userAgree=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", applist=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00EL(boolean z, C13BV c13bv) {
        this.LIZ = z;
        this.LIZIZ = c13bv;
    }
}
