package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s7I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614540s7I extends AbstractC1614570s7L {
    public final C0KPG LIZ;
    public final EnumC1614520s7G LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1614540s7I)) {
            return false;
        }
        C1614540s7I c1614540s7I = (C1614540s7I) obj;
        return Intrinsics.LJFF(this.LIZ, c1614540s7I.LIZ) && this.LIZIZ == c1614540s7I.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapError(iapResult=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1614570s7L
    public final EnumC1614520s7G LIZ() {
        return this.LIZIZ;
    }

    public C1614540s7I(C0KPG c0kpg, EnumC1614520s7G enumC1614520s7G) {
        this.LIZ = c0kpg;
        this.LIZIZ = enumC1614520s7G;
    }
}
