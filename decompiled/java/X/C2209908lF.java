package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08lF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2209908lF {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2209908lF)) {
            return false;
        }
        C2209908lF c2209908lF = (C2209908lF) obj;
        return this.LIZ == c2209908lF.LIZ && this.LIZIZ == c2209908lF.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2209908lF.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftPreviewLyricLine(startMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2209908lF(long j, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
    }
}
