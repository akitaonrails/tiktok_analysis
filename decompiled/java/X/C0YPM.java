package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YPM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPM {
    public final InterfaceC873710YPh LIZ;
    public final C0Y3I LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YPM)) {
            return false;
        }
        C0YPM c0ypm = (C0YPM) obj;
        return Intrinsics.LJFF(this.LIZ, c0ypm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ypm.LIZIZ) && this.LIZJ == c0ypm.LIZJ && this.LIZLLL == c0ypm.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalSendInput(msgSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tracer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", disableAutoResend=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isMedia=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YPM(InterfaceC873710YPh interfaceC873710YPh, C0Y3I c0y3i, boolean z, boolean z2) {
        this.LIZ = interfaceC873710YPh;
        this.LIZIZ = c0y3i;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
