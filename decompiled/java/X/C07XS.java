package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07XS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XS implements C07XT {
    public final InterfaceC395901gL LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07XS) && Intrinsics.LJFF(this.LIZ, ((C07XS) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(iBoard=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07XS(InterfaceC395901gL interfaceC395901gL) {
        this.LIZ = interfaceC395901gL;
    }
}
