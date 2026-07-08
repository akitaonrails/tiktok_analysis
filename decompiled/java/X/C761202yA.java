package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02yA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C761202yA implements InterfaceC0148002o {
    public final C7768031q LL;

    public C761202yA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C761202yA) && Intrinsics.LJFF(this.LL, ((C761202yA) obj).LL);
    }

    public final int hashCode() {
        C7768031q c7768031q = this.LL;
        if (c7768031q == null) {
            return 0;
        }
        return c7768031q.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentInfoState(paymentInfoListVO=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C761202yA(int i) {
        this.LL = null;
    }
}
