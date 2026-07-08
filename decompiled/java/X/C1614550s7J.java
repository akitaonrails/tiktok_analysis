package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s7J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614550s7J extends AbstractC1614570s7L {
    public final EnumC1614520s7G LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1614550s7J)) {
            return false;
        }
        C1614550s7J c1614550s7J = (C1614550s7J) obj;
        return this.LIZ == c1614550s7J.LIZ && Intrinsics.LJFF(this.LIZIZ, c1614550s7J.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WithMessage(sourceScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1614570s7L
    public final EnumC1614520s7G LIZ() {
        return this.LIZ;
    }

    public C1614550s7J(EnumC1614520s7G enumC1614520s7G, String str) {
        this.LIZ = enumC1614520s7G;
        this.LIZIZ = str;
    }
}
