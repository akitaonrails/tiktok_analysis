package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777860wMi {
    public final String LIZ;
    public final C1547470qN7 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777860wMi)) {
            return false;
        }
        C1777860wMi c1777860wMi = (C1777860wMi) obj;
        return Intrinsics.LJFF(this.LIZ, c1777860wMi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777860wMi.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VConsoleConfig(clientKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", runtime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777860wMi(String str, C1547470qN7 c1547470qN7) {
        this.LIZ = str;
        this.LIZIZ = c1547470qN7;
    }
}
