package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1447805lc extends AbstractC1446905lT {
    public final InterfaceC1443605kw LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1447805lc) && Intrinsics.LJFF(this.LIZ, ((C1447805lc) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1447805lc(InterfaceC1443605kw interfaceC1443605kw) {
        this.LIZ = interfaceC1443605kw;
    }
}
