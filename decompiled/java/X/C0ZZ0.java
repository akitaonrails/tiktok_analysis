package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZ0 implements C0ZZ3 {
    public final InterfaceC460300I3g LIZ;
    public final C1622006Ws<Boolean> LIZIZ = new C1622006Ws<>(Boolean.TRUE);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ZZ0) && Intrinsics.LJFF(this.LIZ, ((C0ZZ0) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveIsMasked(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZZ3
    public final C1622006Ws<Boolean> LIZ() {
        return this.LIZIZ;
    }

    public C0ZZ0(C1233704sB c1233704sB) {
        this.LIZ = c1233704sB;
    }
}
