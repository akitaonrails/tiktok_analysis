package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZW1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZW1 implements InterfaceC900840ZVq {
    public final InterfaceC460300I3g LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZW1) && Intrinsics.LJFF(this.LIZ, ((C0ZW1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WideSafetyMask(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZW1(InterfaceC460300I3g interfaceC460300I3g) {
        this.LIZ = interfaceC460300I3g;
    }
}
