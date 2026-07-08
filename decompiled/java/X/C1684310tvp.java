package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684310tvp {
    public final C1692220u8a LIZ;
    public final InterfaceC1692600u9C LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransformedText(text=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", offsetMapping=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1684310tvp)) {
            return false;
        }
        C1684310tvp c1684310tvp = (C1684310tvp) obj;
        if (Intrinsics.LJFF(this.LIZ, c1684310tvp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1684310tvp.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1684310tvp(C1692220u8a c1692220u8a, InterfaceC1692600u9C interfaceC1692600u9C) {
        this.LIZ = c1692220u8a;
        this.LIZIZ = interfaceC1692600u9C;
    }
}
