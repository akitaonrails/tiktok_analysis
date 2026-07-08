package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00tJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C221500tJ implements InterfaceC512170K6t {
    public final String LIZ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C221500tJ) && Intrinsics.LJFF(this.LIZ, ((C221500tJ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClosePackagePage(secUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
