package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877107Wv {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1877107Wv)) {
            return false;
        }
        C1877107Wv c1877107Wv = (C1877107Wv) obj;
        return Intrinsics.LJFF(this.LIZ, c1877107Wv.LIZ) && this.LIZIZ == c1877107Wv.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1877107Wv.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetMinisFragmentRecord(clientKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ts=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", callStack=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1877107Wv(String str, long j, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
    }
}
