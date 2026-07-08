package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556440qba implements InterfaceC1692820u9Y {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StringAnnotation(value=");
        sbLIZ.append(str);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        String str = this.LIZ;
        if (!(obj instanceof C1556440qba) || !Intrinsics.LJFF(str, ((C1556440qba) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
