package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0aCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925770aCN {
    public final Integer LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public C917760ZzS LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final String LJIIJ;
    public final long LJIIJJI;
    public final C926050aCp LJIIL;

    public C925770aCN() {
        this(null, 0, 0, false, 0, false, 0, 0L, null, 0L, null, 8191);
    }

    public final String toString() {
        return "GuestApplyInfo(position=" + this.LIZ + ", seiVersion=" + this.LIZIZ + ", source=" + this.LIZJ + ", followAnchor=" + this.LIZLLL + ", linkJoinType=" + this.LJ + ", isDirectlyApply=" + this.LJFF + ", shareRevenueSnapshot=" + this.LJI + ", applyingGuide=" + this.LJII + ", inviterRole=" + this.LJIIIIZZ + ", inviterUserId=" + this.LJIIIZ + ", originRequestParam=" + this.LJIIJ + ", joinGameSessionId=" + this.LJIIJJI + ", mgEnterCtx=" + this.LJIIL + ')';
    }

    public C925770aCN(Integer num, int i, int i2, boolean z, int i3, boolean z2, int i4, long j, String str, long j2, C926050aCp c926050aCp, int i5) {
        C917760ZzS c917760ZzS;
        boolean z3 = z;
        int i6 = i;
        int i7 = i4;
        boolean z4 = z2;
        int i8 = i3;
        String str2 = str;
        long j3 = j;
        long j4 = j2;
        Integer num2 = (i5 & 1) != 0 ? -1 : num;
        i6 = (i5 & 2) != 0 ? 0 : i6;
        int i9 = (i5 & 4) == 0 ? i2 : -1;
        z3 = (i5 & 8) != 0 ? false : z3;
        i8 = (i5 & 16) != 0 ? 0 : i8;
        if ((i5 & 64) != 0) {
            c917760ZzS = C917750ZzR.LIZ;
        } else {
            c917760ZzS = null;
        }
        z4 = (i5 & 128) != 0 ? false : z4;
        i7 = (i5 & 256) != 0 ? 0 : i7;
        j3 = (i5 & 512) != 0 ? 0L : j3;
        str2 = (i5 & 1024) != 0 ? null : str2;
        j4 = (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j4;
        C926050aCp c926050aCp2 = (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? c926050aCp : null;
        this.LIZ = num2;
        this.LIZIZ = i6;
        this.LIZJ = i9;
        this.LIZLLL = z3;
        this.LJ = i8;
        this.LJFF = false;
        this.LJI = c917760ZzS;
        this.LJII = z4;
        this.LJIIIIZZ = i7;
        this.LJIIIZ = j3;
        this.LJIIJ = str2;
        this.LJIIJJI = j4;
        this.LJIIL = c926050aCp2;
    }
}
