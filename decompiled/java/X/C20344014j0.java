package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14j0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20344014j0 extends AbstractC20344114j1 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20344014j0)) {
            return false;
        }
        C20344014j0 c20344014j0 = (C20344014j0) obj;
        return Intrinsics.LJFF(this.LIZ, c20344014j0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20344014j0.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Passkey(credentialAssertionData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", webauthnTicket=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20344014j0(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
