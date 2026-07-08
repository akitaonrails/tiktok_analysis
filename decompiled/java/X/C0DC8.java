package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DC8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DC8 implements C0DCV {
    public final C0DB8 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DC8) && Intrinsics.LJFF(this.LIZ, ((C0DC8) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentCard(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DC8(C0DB8 c0db8) {
        this.LIZ = c0db8;
    }
}
