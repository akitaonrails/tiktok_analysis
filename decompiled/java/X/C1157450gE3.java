package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gE3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157450gE3<T> implements InterfaceC1157570gEF<T> {
    public final T LIZ;
    public final EnumC1156000gBi LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157450gE3)) {
            return false;
        }
        C1157450gE3 c1157450gE3 = (C1157450gE3) obj;
        return Intrinsics.LJFF(this.LIZ, c1157450gE3.LIZ) && this.LIZIZ == c1157450gE3.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157450gE3(T t, EnumC1156000gBi enumC1156000gBi) {
        this.LIZ = t;
        this.LIZIZ = enumC1156000gBi;
    }
}
