package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0jzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302350jzl extends AbstractC1302360jzm {
    public final int LIZ;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZ));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallControlResult(Error[errorCode=(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(")])");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1302350jzl(int i) {
        this.LIZ = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1302350jzl) && this.LIZ == ((C1302350jzl) obj).LIZ) {
            return true;
        }
        return false;
    }
}
