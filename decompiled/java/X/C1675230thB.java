package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0thB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675230thB extends AbstractC1675210th9 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1675230thB) && Intrinsics.LJFF(this.LIZ, ((C1675230thB) obj).LIZ);
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
        sbLIZ.append("Donate(sessionToken=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1675230thB(String str) {
        this.LIZ = str;
    }
}
