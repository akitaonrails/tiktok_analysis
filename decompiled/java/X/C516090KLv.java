package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516090KLv {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C516090KLv)) {
            return false;
        }
        C516090KLv c516090KLv = (C516090KLv) obj;
        return Intrinsics.LJFF(this.LIZ, c516090KLv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c516090KLv.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeProductGroupingKey(packageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", basePlanId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C516090KLv(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
