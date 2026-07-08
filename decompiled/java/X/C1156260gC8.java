package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gC8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156260gC8 extends AbstractC1736670vIH {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156260gC8) && Intrinsics.LJFF(this.LIZ, ((C1156260gC8) obj).LIZ);
    }

    public final int hashCode() {
        Throwable th = this.LIZ;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FailUploadImage(e=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156260gC8(Throwable th) {
        this.LIZ = th;
    }
}
