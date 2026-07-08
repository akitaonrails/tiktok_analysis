package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512070K6j {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C512070K6j)) {
            return false;
        }
        C512070K6j c512070K6j = (C512070K6j) obj;
        return Intrinsics.LJFF(this.LIZ, c512070K6j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c512070K6j.LIZIZ) && this.LIZJ == c512070K6j.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcPlanChangeSuccessData(secUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subscribePackageId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAutoRenewSub=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C512070K6j(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
