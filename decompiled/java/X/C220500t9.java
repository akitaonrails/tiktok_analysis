package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00t9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C220500t9 implements InterfaceC220300t7 {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Url(url=");
        sbLIZ.append(str);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        String str = this.LIZ;
        if (!(obj instanceof C220500t9) || !Intrinsics.LJFF(str, ((C220500t9) obj).LIZ)) {
            return false;
        }
        return true;
    }
}
