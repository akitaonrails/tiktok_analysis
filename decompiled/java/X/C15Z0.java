package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Z0, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15Z0 {
    public final InterfaceC2661011f LIZ;
    public final C15Z8 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15Z0)) {
            return false;
        }
        C15Z0 c15z0 = (C15Z0) obj;
        return Intrinsics.LJFF(this.LIZ, c15z0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c15z0.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSProtectionDataLayerInfo(retrofit=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", jsonConvert=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15Z0(InterfaceC2661011f interfaceC2661011f, C15Z8 c15z8) {
        this.LIZ = interfaceC2661011f;
        this.LIZIZ = c15z8;
    }
}
