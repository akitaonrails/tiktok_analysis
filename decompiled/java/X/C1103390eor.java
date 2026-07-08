package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103390eor extends AbstractC1103480ep0 {
    public final Throwable LIZ;

    public C1103390eor() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1103390eor) && Intrinsics.LJFF(this.LIZ, ((C1103390eor) obj).LIZ);
    }

    public final int hashCode() {
        Throwable th = this.LIZ;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    @Override // X.AbstractC1103480ep0
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1103390eor(Throwable th) {
        this.LIZ = th;
    }
}
