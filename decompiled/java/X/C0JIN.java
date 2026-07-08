package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JIN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JIN extends C0JIO {
    public final InterfaceC489200JGk LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0JIN) && Intrinsics.LJFF(this.LIZ, ((C0JIN) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(courseVideo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JIN(InterfaceC489200JGk interfaceC489200JGk) {
        this.LIZ = interfaceC489200JGk;
    }
}
