package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ae0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C942900ae0 extends AbstractC942990ae9 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C942900ae0) && Intrinsics.LJFF(this.LIZ, ((C942900ae0) obj).LIZ);
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
        sbLIZ.append("DestroyModeFailed(errMsg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C942900ae0(String str) {
        this.LIZ = str;
    }
}
