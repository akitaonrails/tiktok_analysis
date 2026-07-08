package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688040u1q extends AbstractC1688180u24 {
    public final InterfaceC1682270tsX LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1688040u1q) && Intrinsics.LJFF(this.LIZIZ, ((C1688040u1q) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerticalCrossAxisAlignment(vertical=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1688040u1q(InterfaceC1682270tsX interfaceC1682270tsX) {
        this.LIZIZ = interfaceC1682270tsX;
    }

    @Override // X.AbstractC1688180u24
    public final int LIZ(int i, EnumC1671200tag enumC1671200tag) {
        return this.LIZIZ.LIZ(0, i);
    }
}
