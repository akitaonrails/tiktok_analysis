package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D7P, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7P {
    public final C0D7Q LIZ;
    public final InterfaceC333970D7j LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D7P)) {
            return false;
        }
        C0D7P c0d7p = (C0D7P) obj;
        return Intrinsics.LJFF(this.LIZ, c0d7p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d7p.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutSceneComponents(checkoutGateway=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mapper=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D7P(C0D7Q c0d7q, InterfaceC333970D7j interfaceC333970D7j) {
        this.LIZ = c0d7q;
        this.LIZIZ = interfaceC333970D7j;
    }
}
