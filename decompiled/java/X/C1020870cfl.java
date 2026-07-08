package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020870cfl {
    public String LIZ;
    public Boolean LIZIZ;
    public String LIZJ;

    public C1020870cfl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020870cfl)) {
            return false;
        }
        C1020870cfl c1020870cfl = (C1020870cfl) obj;
        return Intrinsics.LJFF(this.LIZ, c1020870cfl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1020870cfl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1020870cfl.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Boolean bool = this.LIZIZ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgenOneBigThreeSmallPageImageResultState(imageUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1020870cfl(int i) {
        this("", null, null);
    }

    public C1020870cfl(String str, Boolean bool, String str2) {
        this.LIZ = str;
        this.LIZIZ = bool;
        this.LIZJ = str2;
    }
}
