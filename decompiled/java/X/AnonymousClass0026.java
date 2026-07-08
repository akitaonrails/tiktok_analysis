package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0026, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0026 {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public AnonymousClass0026() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0026)) {
            return false;
        }
        AnonymousClass0026 anonymousClass0026 = (AnonymousClass0026) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass0026.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass0026.LIZIZ) && Intrinsics.LJFF(this.LIZJ, anonymousClass0026.LIZJ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApiErrorPayload(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0026(Integer num, String str, String str2) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
