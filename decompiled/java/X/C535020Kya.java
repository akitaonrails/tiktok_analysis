package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0Kya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535020Kya {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final long LJIILJJIL;
    public final int LJIILL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumAiContent{");
        sbLIZ.append(C0LO4.LIZ(this.LIZJ));
        sbLIZ.append(',');
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(',');
        sbLIZ.append(this.LIZ);
        sbLIZ.append(',');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",{");
        sbLIZ.append(this.LJ);
        sbLIZ.append('*');
        sbLIZ.append(this.LJFF);
        sbLIZ.append("},");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C535020Kya LIZ(C535020Kya c535020Kya, int i, int i2, int i3, String str, boolean z, int i4, int i5) {
        String str2;
        String str3;
        int i6;
        int i7;
        String str4;
        String str5;
        String str6;
        String str7;
        long j;
        int i8 = i4;
        String str8 = str;
        int i9 = i3;
        int i10 = i2;
        boolean z2 = z;
        int i11 = i;
        String str9 = null;
        if ((i5 & 1) != 0) {
            str2 = c535020Kya.LIZ;
        } else {
            str2 = null;
        }
        if ((i5 & 2) != 0) {
            str3 = c535020Kya.LIZIZ;
        } else {
            str3 = null;
        }
        if ((i5 & 4) != 0) {
            i6 = c535020Kya.LIZJ;
        } else {
            i6 = 0;
        }
        if ((i5 & 8) != 0) {
            i7 = c535020Kya.LIZLLL;
        } else {
            i7 = 0;
        }
        if ((i5 & 16) != 0) {
            i11 = c535020Kya.LJ;
        }
        if ((i5 & 32) != 0) {
            i10 = c535020Kya.LJFF;
        }
        if ((i5 & 64) != 0) {
            i9 = c535020Kya.LJI;
        }
        if ((i5 & 128) != 0) {
            str8 = c535020Kya.LJII;
        }
        if ((i5 & 256) != 0) {
            str4 = c535020Kya.LJIIIIZZ;
        } else {
            str4 = null;
        }
        if ((i5 & 512) != 0) {
            z2 = c535020Kya.LJIIIZ;
        }
        if ((i5 & 1024) != 0) {
            str5 = c535020Kya.LJIIJ;
        } else {
            str5 = null;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = c535020Kya.LJIIJJI;
        } else {
            str6 = null;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str7 = c535020Kya.LJIIL;
        } else {
            str7 = null;
        }
        if ((i5 & 8192) != 0) {
            str9 = c535020Kya.LJIILIIL;
        }
        if ((i5 & 16384) != 0) {
            j = c535020Kya.LJIILJJIL;
        } else {
            j = 0;
        }
        if ((i5 & 32768) != 0) {
            i8 = c535020Kya.LJIILL;
        }
        c535020Kya.getClass();
        return new C535020Kya(str2, str3, i6, i7, i11, i10, i9, str8, str4, z2, str5, str6, str7, str9, j, i8);
    }

    public /* synthetic */ C535020Kya(String str, String str2, int i, int i2, int i3, int i4, String str3, String str4, boolean z, String str5, String str6, String str7, long j, int i5) {
        this(str, str2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, 0, (i5 & 128) != 0 ? null : str3, (i5 & 256) != 0 ? null : str4, (i5 & 512) != 0 ? true : z, (i5 & 1024) != 0 ? null : str5, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str6, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str7, null, (i5 & 16384) != 0 ? System.currentTimeMillis() : j, 0);
    }

    public C535020Kya(String str, String str2, int i, int i2, int i3, int i4, int i5, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, long j, int i6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = z;
        this.LJIIJ = str5;
        this.LJIIJJI = str6;
        this.LJIIL = str7;
        this.LJIILIIL = str8;
        this.LJIILJJIL = j;
        this.LJIILL = i6;
    }
}
