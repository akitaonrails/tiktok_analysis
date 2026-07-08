package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156360gCI implements InterfaceC1782150wTd {
    public final String LIZ;
    public final String LIZIZ;

    public C1156360gCI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156360gCI)) {
            return false;
        }
        C1156360gCI c1156360gCI = (C1156360gCI) obj;
        return Intrinsics.LJFF(this.LIZ, c1156360gCI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1156360gCI.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceBioFooterItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1782150wTd
    public final String getTitle() {
        return this.LIZ;
    }

    public C1156360gCI(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
    }
}
