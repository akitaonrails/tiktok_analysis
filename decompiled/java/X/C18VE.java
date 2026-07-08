package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18VE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18VE implements C18VI {
    public final C869590Y9l LIZ;
    public final EnumC212372189a LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18VE)) {
            return false;
        }
        C18VE c18ve = (C18VE) obj;
        return Intrinsics.LJFF(this.LIZ, c18ve.LIZ) && this.LIZIZ == c18ve.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteAction(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deleteType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C18VE(C869590Y9l c869590Y9l, EnumC212372189a enumC212372189a) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = enumC212372189a;
    }
}
