package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05f2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1407005f2 extends AbstractC1406905f1 {
    public final InterfaceC1406105et LIZ;

    public C1407005f2() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1407005f2) && Intrinsics.LJFF(this.LIZ, ((C1407005f2) obj).LIZ);
    }

    public final int hashCode() {
        InterfaceC1406105et interfaceC1406105et = this.LIZ;
        if (interfaceC1406105et == null) {
            return 0;
        }
        return interfaceC1406105et.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cancelled(customContext=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1407005f2(InterfaceC1406105et interfaceC1406105et) {
        this.LIZ = interfaceC1406105et;
    }
}
