package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ICe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462620ICe {
    public final C462630ICf LIZ;
    public final InterfaceC462610ICd LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462620ICe)) {
            return false;
        }
        C462620ICe c462620ICe = (C462620ICe) obj;
        return Intrinsics.LJFF(this.LIZ, c462620ICe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c462620ICe.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackgroundConfig(cornerConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", solidConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C462620ICe(C462630ICf c462630ICf, InterfaceC462610ICd interfaceC462610ICd) {
        this.LIZ = c462630ICf;
        this.LIZIZ = interfaceC462610ICd;
    }
}
