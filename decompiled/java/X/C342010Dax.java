package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C342010Dax {
    public final InterfaceC342000Daw LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C342010Dax)) {
            return false;
        }
        C342010Dax c342010Dax = (C342010Dax) obj;
        return Intrinsics.LJFF(this.LIZ, c342010Dax.LIZ) && this.LIZIZ == c342010Dax.LIZIZ && this.LIZJ == c342010Dax.LIZJ;
    }

    public final int hashCode() {
        InterfaceC342000Daw interfaceC342000Daw = this.LIZ;
        return ((((interfaceC342000Daw == null ? 0 : interfaceC342000Daw.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadMarkdownContentResult(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAwaitPreload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", awaitPreloadTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C342010Dax(InterfaceC342000Daw interfaceC342000Daw, boolean z, long j) {
        this.LIZ = interfaceC342000Daw;
        this.LIZIZ = z;
        this.LIZJ = j;
    }
}
