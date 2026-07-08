package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hVJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206590hVJ {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1206590hVJ)) {
            return false;
        }
        C1206590hVJ c1206590hVJ = (C1206590hVJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1206590hVJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1206590hVJ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingEntranceClick(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", method=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1206590hVJ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
