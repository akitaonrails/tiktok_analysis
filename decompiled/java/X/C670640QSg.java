package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0QSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670640QSg {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final long LJIIJJI;
    public final long LJIIL;
    public final long LJIILIIL;
    public final long LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;

    public /* synthetic */ C670640QSg() {
        this("", "", null, "", "", "", false, "", "", "", false, 0L, 0L, 0L, 0L, "4", null);
    }

    public static C670640QSg LIZ(C670640QSg c670640QSg, String str, String str2, String str3, String str4, boolean z, long j, long j2, String str5, int i) {
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z2;
        String str10;
        long j3;
        long j4;
        String str11;
        long j5 = j;
        String str12 = str4;
        String str13 = str5;
        boolean z3 = z;
        long j6 = j2;
        String str14 = str2;
        String str15 = str3;
        String str16 = str;
        if ((i & 1) != 0) {
            str6 = c670640QSg.LIZ;
        } else {
            str6 = null;
        }
        if ((i & 2) != 0) {
            str7 = c670640QSg.LIZIZ;
        } else {
            str7 = null;
        }
        if ((i & 4) != 0) {
            str8 = c670640QSg.LIZJ;
        } else {
            str8 = null;
        }
        if ((i & 8) != 0) {
            str16 = c670640QSg.LIZLLL;
        }
        if ((i & 16) != 0) {
            str9 = c670640QSg.LJ;
        } else {
            str9 = null;
        }
        if ((i & 32) != 0) {
            str14 = c670640QSg.LJFF;
        }
        if ((i & 64) != 0) {
            z2 = c670640QSg.LJI;
        } else {
            z2 = false;
        }
        if ((i & 128) != 0) {
            str10 = c670640QSg.LJII;
        } else {
            str10 = null;
        }
        if ((i & 256) != 0) {
            str15 = c670640QSg.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            str12 = c670640QSg.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            z3 = c670640QSg.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j3 = c670640QSg.LJIIJJI;
        } else {
            j3 = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            j4 = c670640QSg.LJIIL;
        } else {
            j4 = 0;
        }
        if ((i & 8192) != 0) {
            j5 = c670640QSg.LJIILIIL;
        }
        if ((i & 16384) != 0) {
            j6 = c670640QSg.LJIILJJIL;
        }
        if ((32768 & i) != 0) {
            str13 = c670640QSg.LJIILL;
        }
        if ((i & 65536) != 0) {
            str11 = c670640QSg.LJIILLIIL;
        } else {
            str11 = null;
        }
        c670640QSg.getClass();
        String str17 = str15;
        String str18 = str12;
        boolean z4 = z3;
        return new C670640QSg(str6, str7, str8, str16, str9, str14, z2, str10, str17, str18, z4, j3, j4, j5, j6, str13, str11);
    }

    public C670640QSg(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, boolean z2, long j, long j2, long j3, long j4, String str10, String str11) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = z;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = z2;
        this.LJIIJJI = j;
        this.LJIIL = j2;
        this.LJIILIIL = j3;
        this.LJIILJJIL = j4;
        this.LJIILL = str10;
        this.LJIILLIIL = str11;
    }
}
