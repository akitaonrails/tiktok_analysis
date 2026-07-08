package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438670HIb extends AbstractC942990ae9 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C438670HIb) && Intrinsics.LJFF(this.LIZ, ((C438670HIb) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateModeFailed(errMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C438670HIb(String str) {
        this.LIZ = str;
    }
}
