package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344500l5k {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, Long.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), this.LIZLLL, Integer.valueOf(this.LJ), Integer.valueOf(this.LJFF)});
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPreloadKey(aid='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', cursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loadType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", surpriseType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1344500l5k)) {
            return false;
        }
        C1344500l5k c1344500l5k = (C1344500l5k) obj;
        if (Intrinsics.LJFF(this.LIZ, c1344500l5k.LIZ) && this.LIZIZ == c1344500l5k.LIZIZ && this.LIZJ == c1344500l5k.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1344500l5k.LIZLLL) && this.LJ == c1344500l5k.LJ && this.LJFF == c1344500l5k.LJFF) {
            return true;
        }
        return false;
    }

    public C1344500l5k(int i, int i2, int i3, long j, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.LJ = i2;
        this.LJFF = i3;
    }
}
