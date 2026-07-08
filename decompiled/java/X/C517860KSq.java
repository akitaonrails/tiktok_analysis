package X;

import kotlin.jvm.internal.Intrinsics;
import tikcast.api.fans.GetNonFansUserDataResponse;

/* JADX INFO: renamed from: X.0KSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517860KSq {
    public final C0KSY<GetNonFansUserDataResponse.Data> LIZ;
    public final C0KS8 LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C517860KSq)) {
            return false;
        }
        C517860KSq c517860KSq = (C517860KSq) obj;
        return Intrinsics.LJFF(this.LIZ, c517860KSq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c517860KSq.LIZIZ) && this.LIZJ == c517860KSq.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchSnapshot(product=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", payModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", privilegeQueryScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C517860KSq(C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8, int i) {
        this.LIZ = c0ksy;
        this.LIZIZ = c0ks8;
        this.LIZJ = i;
    }
}
