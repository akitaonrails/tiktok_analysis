package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807210VlX {
    public final boolean LIZ;
    public final EnumC807050VlH LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final long LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final long LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C807210VlX)) {
            return false;
        }
        C807210VlX c807210VlX = (C807210VlX) obj;
        return this.LIZ == c807210VlX.LIZ && this.LIZIZ == c807210VlX.LIZIZ && Intrinsics.LJFF(this.LIZJ, c807210VlX.LIZJ) && this.LIZLLL == c807210VlX.LIZLLL && this.LJ == c807210VlX.LJ && Intrinsics.LJFF(this.LJFF, c807210VlX.LJFF) && this.LJI == c807210VlX.LJI && Intrinsics.LJFF(this.LJII, c807210VlX.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c807210VlX.LJIIIIZZ) && this.LJIIIZ == c807210VlX.LJIIIZ && this.LJIIJ == c807210VlX.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c807210VlX.LJIIJJI);
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31;
        String str = this.LJFF;
        int iHashCode = (((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LJI)) * 31;
        String str2 = this.LJII;
        return ((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "KeyLogModel(hasRefLog=" + this.LIZ + ", logType=" + this.LIZIZ + ", btm=" + this.LIZJ + ", btmPageOpen=" + this.LIZLLL + ", btmPageCount=" + this.LJ + ", event=" + this.LJFF + ", threadId=" + this.LJI + ", threadName=" + this.LJII + ", url=" + this.LJIIIIZZ + ", statusCode=" + this.LJIIIZ + ", duration=" + this.LJIIJ + ", logid=" + this.LJIIJJI + ')';
    }

    public C807210VlX(boolean z, EnumC807050VlH enumC807050VlH, String str, boolean z2, int i, String str2, long j, String str3, String str4, int i2, long j2, String str5, int i3) {
        String str6 = str;
        boolean z3 = z2;
        String str7 = str2;
        long j3 = j;
        int i4 = i2;
        String str8 = str4;
        z = (i3 & 1) != 0 ? true : z;
        str6 = (i3 & 4) != 0 ? "" : str6;
        z3 = (i3 & 8) != 0 ? false : z3;
        int i5 = (i3 & 16) == 0 ? i : 0;
        str7 = (i3 & 32) != 0 ? null : str7;
        j3 = (i3 & 64) != 0 ? -1L : j3;
        String str9 = (i3 & 128) == 0 ? str3 : null;
        str8 = (i3 & 256) != 0 ? "" : str8;
        i4 = (i3 & 512) != 0 ? -1 : i4;
        long j4 = (i3 & 1024) == 0 ? j2 : -1L;
        String str10 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str5 : "";
        this.LIZ = z;
        this.LIZIZ = enumC807050VlH;
        this.LIZJ = str6;
        this.LIZLLL = z3;
        this.LJ = i5;
        this.LJFF = str7;
        this.LJI = j3;
        this.LJII = str9;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = i4;
        this.LJIIJ = j4;
        this.LJIIJJI = str10;
    }
}
