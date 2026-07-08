package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K49, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K49 implements InterfaceC512170K6t {
    public final String LIZ = "sub_only_space";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0K49) && Intrinsics.LJFF(this.LIZ, ((C0K49) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenPackagePage(pageType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
