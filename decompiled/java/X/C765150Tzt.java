package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765150Tzt extends AbstractC764660Tz6 {
    public final long LIZ;
    public final List<C807880Vmc> LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C765150Tzt)) {
            return false;
        }
        C765150Tzt c765150Tzt = (C765150Tzt) obj;
        return this.LIZ == c765150Tzt.LIZ && Intrinsics.LJFF(this.LIZIZ, c765150Tzt.LIZIZ) && this.LIZJ == c765150Tzt.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchLyric(songId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lyricLines=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lyricsType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C765150Tzt(long j, List<C807880Vmc> list, int i) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = i;
    }
}
