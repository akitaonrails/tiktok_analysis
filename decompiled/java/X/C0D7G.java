package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D7G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7G {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D7G)) {
            return false;
        }
        C0D7G c0d7g = (C0D7G) obj;
        return Intrinsics.LJFF(this.LIZ, c0d7g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d7g.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d7g.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AcpPaymentSpec(handlerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", credentialType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", instrumentType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D7G(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
