package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Ya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C096600Ya {
    public final long LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C096600Ya)) {
            return false;
        }
        C096600Ya c096600Ya = (C096600Ya) obj;
        return this.LIZ == c096600Ya.LIZ && this.LIZIZ == c096600Ya.LIZIZ && Intrinsics.LJFF(this.LIZJ, c096600Ya.LIZJ);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorGiftListCacheKey(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isInMultiGuestMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", esVersion=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C096600Ya(long j, boolean z, String str) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
