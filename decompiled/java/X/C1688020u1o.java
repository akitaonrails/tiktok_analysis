package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688020u1o extends AbstractC1688180u24 {
    public final InterfaceC1666960tTq LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1688020u1o) && Intrinsics.LJFF(this.LIZIZ, ((C1688020u1o) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalCrossAxisAlignment(horizontal=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1688020u1o(InterfaceC1666960tTq interfaceC1666960tTq) {
        this.LIZIZ = interfaceC1666960tTq;
    }

    @Override // X.AbstractC1688180u24
    public final int LIZ(int i, EnumC1671200tag enumC1671200tag) {
        return this.LIZIZ.LIZ(0, i, enumC1671200tag);
    }
}
