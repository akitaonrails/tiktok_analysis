package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DI3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DI3 {
    public final C0DI5 LIZ;

    public C0DI3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DI3) && Intrinsics.LJFF(this.LIZ, ((C0DI3) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Options(fractionDigitsStrategy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DI3(int i) {
        this.LIZ = new C0DI4();
    }
}
