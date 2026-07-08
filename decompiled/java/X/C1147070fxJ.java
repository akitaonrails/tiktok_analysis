package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147070fxJ {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147070fxJ)) {
            return false;
        }
        C1147070fxJ c1147070fxJ = (C1147070fxJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1147070fxJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1147070fxJ.LIZIZ) && this.LIZJ == c1147070fxJ.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftAudioResourceModel(audioUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lyricsUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", snippetId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1147070fxJ(String str, String str2, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
    }
}
