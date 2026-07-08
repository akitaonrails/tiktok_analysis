package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C392701fp extends AbstractC392801fq {
    public final C386801es LIZ;
    public final String LIZIZ = "error";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C392701fp) && Intrinsics.LJFF(this.LIZ, ((C392701fp) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC392801fq
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C392701fp(C386801es c386801es) {
        this.LIZ = c386801es;
    }
}
