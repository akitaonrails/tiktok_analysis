package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D7X, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7X {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D7X)) {
            return false;
        }
        C0D7X c0d7x = (C0D7X) obj;
        return Intrinsics.LJFF(this.LIZ, c0d7x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d7x.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d7x.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpPaymentSpec(handlerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", credentialType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", instrumentType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D7X(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
