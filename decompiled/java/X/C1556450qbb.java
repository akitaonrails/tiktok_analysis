package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC1294060jmO
public final class C1556450qbb implements InterfaceC1692820u9Y {
    public final String LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlAnnotation(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556450qbb(String str) {
        this.LIZ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1556450qbb) && Intrinsics.LJFF(this.LIZ, ((C1556450qbb) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
