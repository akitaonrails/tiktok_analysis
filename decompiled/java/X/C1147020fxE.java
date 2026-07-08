package X;

import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147020fxE {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final EnumC1142190fpR LJ;
    public final String LJFF;
    public final String LJI;
    public final long LJII;
    public final int LJIIIIZZ;
    public final MusicGiftMood LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1147020fxE() {
        long j = 0;
        this(j, j, j, j, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 0, 0 == true ? 1 : 0, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147020fxE)) {
            return false;
        }
        C1147020fxE c1147020fxE = (C1147020fxE) obj;
        return this.LIZ == c1147020fxE.LIZ && this.LIZIZ == c1147020fxE.LIZIZ && this.LIZJ == c1147020fxE.LIZJ && this.LIZLLL == c1147020fxE.LIZLLL && this.LJ == c1147020fxE.LJ && Intrinsics.LJFF(this.LJFF, c1147020fxE.LJFF) && Intrinsics.LJFF(this.LJI, c1147020fxE.LJI) && this.LJII == c1147020fxE.LJII && this.LJIIIIZZ == c1147020fxE.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1147020fxE.LJIIIZ);
    }

    public final int hashCode() {
        int iY2 = ((((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        String str = this.LJI;
        int iHashCode = (((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + this.LJIIIIZZ) * 31;
        MusicGiftMood musicGiftMood = this.LJIIIZ;
        return iHashCode + (musicGiftMood != null ? musicGiftMood.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftSecondaryPageParam(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", moodId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", snippetId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", entrySource=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", playbackSessionId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", positionMs=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", lyricLineIndex=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", initialMood=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1147020fxE(long j, long j2, long j3, long j4, EnumC1142190fpR enumC1142190fpR, String str, String str2, long j5, int i, MusicGiftMood musicGiftMood) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = enumC1142190fpR;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = j5;
        this.LJIIIIZZ = i;
        this.LJIIIZ = musicGiftMood;
    }

    public /* synthetic */ C1147020fxE(long j, long j2, long j3, long j4, EnumC1142190fpR enumC1142190fpR, String str, String str2, long j5, int i, MusicGiftMood musicGiftMood, int i2) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0L : j3, (i2 & 8) != 0 ? 0L : j4, (i2 & 16) != 0 ? EnumC1142190fpR.UNKNOWN : enumC1142190fpR, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? null : str2, (i2 & 128) == 0 ? j5 : 0L, (i2 & 256) != 0 ? 0 : i, (i2 & 512) == 0 ? musicGiftMood : null);
    }
}
