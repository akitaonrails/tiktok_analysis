package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905810ZgB {
    public final String LIZ;
    public final InterfaceC346201Wa<InterfaceC905820ZgC> LIZIZ;
    public final InterfaceC905820ZgC LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C905810ZgB)) {
            return false;
        }
        C905810ZgB c905810ZgB = (C905810ZgB) obj;
        return Intrinsics.LJFF(this.LIZ, c905810ZgB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c905810ZgB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c905810ZgB.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamFlowResult(clientMessageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", flow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", initialState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C905810ZgB(String str, C095D c095d, InterfaceC905820ZgC interfaceC905820ZgC) {
        this.LIZ = str;
        this.LIZIZ = c095d;
        this.LIZJ = interfaceC905820ZgC;
    }
}
