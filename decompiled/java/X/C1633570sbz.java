package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633570sbz implements InterfaceC1633630sc5 {
    public final Throwable LIZ;
    public final EnumC1641410sod LIZIZ;
    public final C1633710scD LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1633570sbz)) {
            return false;
        }
        C1633570sbz c1633570sbz = (C1633570sbz) obj;
        return Intrinsics.LJFF(this.LIZ, c1633570sbz.LIZ) && this.LIZIZ == c1633570sbz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1633570sbz.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamError(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", metrics=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1633630sc5
    public final Throwable LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1633630sc5
    public final C1633710scD getMetrics() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1633630sc5
    public final EnumC1641410sod getType() {
        return this.LIZIZ;
    }

    public C1633570sbz(Throwable th, EnumC1641410sod enumC1641410sod, C1633710scD c1633710scD) {
        this.LIZ = th;
        this.LIZIZ = enumC1641410sod;
        this.LIZJ = c1633710scD;
    }
}
