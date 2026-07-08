package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08lG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2210008lG {
    public final long LIZ;
    public final Long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2210008lG)) {
            return false;
        }
        C2210008lG c2210008lG = (C2210008lG) obj;
        return this.LIZ == c2210008lG.LIZ && Intrinsics.LJFF(this.LIZIZ, c2210008lG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2210008lG.LIZJ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        Long l = this.LIZIZ;
        return ((iY2 + (l == null ? 0 : l.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftLyricLineUiModel(startMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2210008lG(long j, String str, Long l) {
        this.LIZ = j;
        this.LIZIZ = l;
        this.LIZJ = str;
    }
}
