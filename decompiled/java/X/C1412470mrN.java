package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mrN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412470mrN {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1412470mrN)) {
            return false;
        }
        C1412470mrN c1412470mrN = (C1412470mrN) obj;
        return Intrinsics.LJFF(this.LIZ, c1412470mrN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1412470mrN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1412470mrN.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LIZJ;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public C1412470mrN(String str, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
    }
}
