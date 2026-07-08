package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316340Cae implements InterfaceC549230LgP {
    public final Integer LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C316340Cae) && Intrinsics.LJFF(this.LIZ, ((C316340Cae) obj).LIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Generating(percentage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C316340Cae(Integer num) {
        this.LIZ = num;
    }
}
