package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512080K6k implements InterfaceC512170K6t {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C512080K6k)) {
            return false;
        }
        C512080K6k c512080K6k = (C512080K6k) obj;
        return Intrinsics.LJFF(this.LIZ, c512080K6k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c512080K6k.LIZIZ) && this.LIZJ == c512080K6k.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlanChangeSuccess(secUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subscribePackageId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isAutoRenewSub=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C512080K6k(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
