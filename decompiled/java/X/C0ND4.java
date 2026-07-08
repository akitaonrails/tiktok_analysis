package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ND4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ND4 implements InterfaceC900840ZVq {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ND4) && Intrinsics.LJFF(this.LIZ, ((C0ND4) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoSwapPongAnimationMask(uuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ND4(String str) {
        this.LIZ = str;
    }
}
