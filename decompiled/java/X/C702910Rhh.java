package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rhh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702910Rhh implements InterfaceC702960Rhm {
    public final C702940Rhk LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C702910Rhh) && Intrinsics.LJFF(this.LIZ, ((C702910Rhh) obj).LIZ);
    }

    public final int hashCode() {
        C702940Rhk c702940Rhk = this.LIZ;
        if (c702940Rhk == null) {
            return 0;
        }
        return c702940Rhk.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BindSnapshot(snapshot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C702910Rhh(C702940Rhk c702940Rhk) {
        this.LIZ = c702940Rhk;
    }
}
