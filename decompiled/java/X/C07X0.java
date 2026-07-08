package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07X0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07X0 {
    public final C07X1 LIZ;
    public final C1877507Wz LIZIZ;

    public C07X0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07X0)) {
            return false;
        }
        C07X0 c07x0 = (C07X0) obj;
        return Intrinsics.LJFF(this.LIZ, c07x0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07x0.LIZIZ);
    }

    public final int hashCode() {
        C07X1 c07x1 = this.LIZ;
        int iHashCode = (c07x1 == null ? 0 : c07x1.hashCode()) * 31;
        C1877507Wz c1877507Wz = this.LIZIZ;
        return iHashCode + (c1877507Wz != null ? c1877507Wz.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialDownloadConfig(musicConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", urlConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07X0(C07X1 c07x1, C1877507Wz c1877507Wz) {
        this.LIZ = c07x1;
        this.LIZIZ = c1877507Wz;
    }
}
