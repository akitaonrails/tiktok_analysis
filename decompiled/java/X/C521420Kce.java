package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521420Kce extends AbstractC521460Kci {
    public final int LIZ;
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C521420Kce)) {
            return false;
        }
        C521420Kce c521420Kce = (C521420Kce) obj;
        return this.LIZ == c521420Kce.LIZ && Intrinsics.LJFF(this.LIZIZ, c521420Kce.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C521420Kce(int i, Throwable th) {
        this.LIZ = i;
        this.LIZIZ = th;
    }
}
