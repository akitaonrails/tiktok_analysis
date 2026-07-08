package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900910ZVx implements InterfaceC900840ZVq {
    public final InterfaceC460300I3g LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C900910ZVx)) {
            return false;
        }
        C900910ZVx c900910ZVx = (C900910ZVx) obj;
        return Intrinsics.LJFF(this.LIZ, c900910ZVx.LIZ) && this.LIZIZ == c900910ZVx.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TallSafetyMask(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isShowPlay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C900910ZVx(InterfaceC460300I3g interfaceC460300I3g, boolean z) {
        this.LIZ = interfaceC460300I3g;
        this.LIZIZ = z;
    }
}
