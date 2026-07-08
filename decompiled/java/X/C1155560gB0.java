package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155560gB0 implements InterfaceC111300bX {
    public final C1713570uh1 LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155560gB0) && Intrinsics.LJFF(this.LL, ((C1155560gB0) obj).LL);
    }

    public final int hashCode() {
        C1713570uh1 c1713570uh1 = this.LL;
        if (c1713570uh1 == null) {
            return 0;
        }
        return c1713570uh1.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IDVerifyData(ctx=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155560gB0(C1713570uh1 c1713570uh1) {
        this.LL = c1713570uh1;
    }
}
