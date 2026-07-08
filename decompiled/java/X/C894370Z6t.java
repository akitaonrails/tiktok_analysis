package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894370Z6t implements InterfaceC2172841A1y {
    public final C06WA LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C894370Z6t)) {
            return false;
        }
        C894370Z6t c894370Z6t = (C894370Z6t) obj;
        return Intrinsics.LJFF(this.LIZ, c894370Z6t.LIZ) && this.LIZIZ == c894370Z6t.LIZIZ && this.LIZJ == c894370Z6t.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatDetailIconUiConfig(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconRes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2172841A1y
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LIZIZ);
    }

    @Override // X.InterfaceC2172841A1y
    public final C06WA getType() {
        return this.LIZ;
    }

    public C894370Z6t(C06WA c06wa, int i, int i2) {
        this.LIZ = c06wa;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
