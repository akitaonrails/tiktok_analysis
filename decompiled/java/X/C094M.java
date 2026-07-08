package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.094M, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C094M extends C094O {
    public final Throwable LIZ;

    public final int hashCode() {
        Throwable th = this.LIZ;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // X.C094O
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Closed(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C094M(Throwable th) {
        this.LIZ = th;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C094M) && Intrinsics.LJFF(this.LIZ, ((C094M) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
