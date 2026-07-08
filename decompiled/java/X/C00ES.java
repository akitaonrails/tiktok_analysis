package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00ES, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00ES implements C00ER {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Id(value=");
        sbLIZ.append(str);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        String str = this.LIZ;
        if (!(obj instanceof C00ES) || !Intrinsics.LJFF(str, ((C00ES) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
