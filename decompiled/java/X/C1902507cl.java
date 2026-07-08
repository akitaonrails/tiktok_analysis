package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1902507cl implements InterfaceC1902607cm {
    public final String LIZ;
    public final InterfaceC1406105et LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1902507cl)) {
            return false;
        }
        C1902507cl c1902507cl = (C1902507cl) obj;
        return Intrinsics.LJFF(this.LIZ, c1902507cl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1902507cl.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArtifactUpdated(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1902507cl(String str, InterfaceC1406105et interfaceC1406105et) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1406105et;
    }
}
