package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690430R6j implements InterfaceC111300bX {
    public final C690870R8b LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C690430R6j) && Intrinsics.LJFF(this.LL, ((C690430R6j) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RootCellComponentData(cellContext=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C690430R6j(C690870R8b c690870R8b) {
        this.LL = c690870R8b;
    }
}
