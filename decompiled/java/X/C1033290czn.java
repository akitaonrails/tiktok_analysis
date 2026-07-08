package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0czn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033290czn extends AbstractC1033330czr {
    public final Throwable LIZ;

    @Override // X.AbstractC1033330czr
    public final int LIZ() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1033290czn) && Intrinsics.LJFF(this.LIZ, ((C1033290czn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThrowableFailure(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1033330czr
    public final String LIZIZ() {
        return C1033260czk.LIZIZ("ThrowableFailure", this.LIZ);
    }

    public C1033290czn(Throwable th) {
        this.LIZ = th;
    }
}
