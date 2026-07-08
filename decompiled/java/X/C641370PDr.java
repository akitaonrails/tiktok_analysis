package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PDr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641370PDr extends AbstractC641380PDs {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C641370PDr) && Intrinsics.LJFF(this.LIZ, ((C641370PDr) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitDetail(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C641370PDr(String str) {
        this.LIZ = str;
    }
}
