package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00tL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C221700tL implements InterfaceC512170K6t {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C221700tL) && Intrinsics.LJFF(this.LIZ, ((C221700tL) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeSuccessToast(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C221700tL(String str) {
        this.LIZ = str;
    }
}
