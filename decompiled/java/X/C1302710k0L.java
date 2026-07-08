package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0k0L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302710k0L extends AbstractC1302730k0N {
    public final int LIZ;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZ));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddCallResult(Error[errorCode=(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(")])");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1302710k0L(int i) {
        this.LIZ = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1302710k0L) && this.LIZ == ((C1302710k0L) obj).LIZ) {
            return true;
        }
        return false;
    }
}
