package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05dG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1396005dG {
    public final String LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public C1396005dG() {
        this(null, 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1396005dG)) {
            return false;
        }
        C1396005dG c1396005dG = (C1396005dG) obj;
        return Intrinsics.LJFF(this.LIZ, c1396005dG.LIZ) && Float.compare(this.LIZIZ, c1396005dG.LIZIZ) == 0 && Float.compare(this.LIZJ, c1396005dG.LIZJ) == 0 && this.LIZLLL == c1396005dG.LIZLLL && this.LJ == c1396005dG.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftPlaybackUiState(playbackSessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", playbackProgress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lyricLineProgress=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lyricLineDurationMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", currentLyricLineIndex=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public /* synthetic */ C1396005dG(String str, int i, int i2) {
        this((i2 & 1) != 0 ? null : str, 0.0f, 0.0f, 0, (i2 & 16) != 0 ? 0 : i);
    }

    public C1396005dG(String str, float f, float f2, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
