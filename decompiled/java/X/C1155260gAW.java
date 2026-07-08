package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0gAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155260gAW {
    public final Object LIZ;

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisplayCutoutCompat{");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155260gAW(Object obj) {
        this.LIZ = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1155260gAW.class == obj.getClass()) {
            return Objects.equals(this.LIZ, ((C1155260gAW) obj).LIZ);
        }
        return false;
    }
}
