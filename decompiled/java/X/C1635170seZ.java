package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;

/* JADX INFO: renamed from: X.0seZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635170seZ {
    public final int LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final List<String> LJIILIIL;
    public final String LJIILJJIL;

    public static C1635170seZ LIZ(C1635170seZ c1635170seZ, int i, String str, boolean z, String str2, String str3, String str4, int i2) {
        String str5;
        long j;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12 = str3;
        int i3 = i;
        String str13 = str2;
        boolean z2 = z;
        String str14 = str4;
        String str15 = str;
        if ((i2 & 1) != 0) {
            i3 = c1635170seZ.LIZ;
        }
        List<String> list = null;
        if ((i2 & 2) != 0) {
            str5 = c1635170seZ.LIZIZ;
        } else {
            str5 = null;
        }
        if ((i2 & 4) != 0) {
            j = c1635170seZ.LIZJ;
        } else {
            j = 0;
        }
        if ((i2 & 8) != 0) {
            str15 = c1635170seZ.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            str6 = c1635170seZ.LJ;
        } else {
            str6 = null;
        }
        if ((i2 & 32) != 0) {
            str7 = c1635170seZ.LJFF;
        } else {
            str7 = null;
        }
        if ((i2 & 64) != 0) {
            z2 = c1635170seZ.LJI;
        }
        if ((i2 & 128) != 0) {
            str13 = c1635170seZ.LJII;
        }
        if ((i2 & 256) != 0) {
            str8 = c1635170seZ.LJIIIIZZ;
        } else {
            str8 = null;
        }
        if ((i2 & 512) != 0) {
            str12 = c1635170seZ.LJIIIZ;
        }
        if ((i2 & 1024) != 0) {
            str9 = c1635170seZ.LJIIJ;
        } else {
            str9 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str10 = c1635170seZ.LJIIJJI;
        } else {
            str10 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = c1635170seZ.LJIIL;
        } else {
            str11 = null;
        }
        if ((i2 & 8192) != 0) {
            list = c1635170seZ.LJIILIIL;
        }
        if ((i2 & 16384) != 0) {
            str14 = c1635170seZ.LJIILJJIL;
        }
        c1635170seZ.getClass();
        return new C1635170seZ(i3, str5, j, str15, str6, str7, z2, str13, str8, str12, str9, str10, str11, list, str14);
    }

    public C1635170seZ(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i) {
        this(0, str, j, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, false, null, (i & 256) != 0 ? null : str5, null, (i & 1024) != 0 ? null : str6, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str7, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str8, (i & 8192) != 0 ? C13BV.INSTANCE : list, (i & 16384) != 0 ? "" : null);
    }

    public C1635170seZ(int i, String str, long j, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list, String str11) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = z;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
        this.LJIIJ = str8;
        this.LJIIJJI = str9;
        this.LJIIL = str10;
        this.LJIILIIL = list;
        this.LJIILJJIL = str11;
    }
}
