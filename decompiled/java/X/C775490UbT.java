package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775490UbT extends AbstractC775500UbU {
    public final InterfaceC775610Ubf LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C775490UbT)) {
            return false;
        }
        C775490UbT c775490UbT = (C775490UbT) obj;
        return Intrinsics.LJFF(this.LIZ, c775490UbT.LIZ) && this.LIZIZ == c775490UbT.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitializeNoiseSuppression(noiseDetector=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C775490UbT(InterfaceC775610Ubf interfaceC775610Ubf, long j) {
        this.LIZ = interfaceC775610Ubf;
        this.LIZIZ = j;
    }
}
