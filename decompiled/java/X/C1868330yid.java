package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868330yid implements InterfaceC951240arS<Object> {
    public final C20361214lm LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868330yid)) {
            return false;
        }
        C1868330yid c1868330yid = (C1868330yid) obj;
        return Intrinsics.LJFF(this.LIZ, c1868330yid.LIZ) && this.LIZIZ == c1868330yid.LIZIZ && this.LIZJ == c1868330yid.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEntitySelectItem(playbookTask=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectedAndDisabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C1868330yid) {
            C1868330yid c1868330yid = (C1868330yid) obj;
            if (Intrinsics.LJFF(c1868330yid.LIZ, this.LIZ) && c1868330yid.LIZIZ == this.LIZIZ && c1868330yid.LIZJ == this.LIZJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C1868330yid;
    }

    public C1868330yid(C20361214lm c20361214lm, boolean z, boolean z2) {
        this.LIZ = c20361214lm;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
