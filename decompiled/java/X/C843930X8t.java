package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0X8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843930X8t {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final int LJIJI;
    public final String LJIJJ;
    public final int LJIJJLI;
    public final boolean LJIL;
    public final String LJJ;

    public C843930X8t(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i2, String str18, int i3, String str19, int i4) {
        String str20;
        boolean z2;
        String str21 = str10;
        String str22 = str9;
        String str23 = str8;
        String str24 = str7;
        String str25 = str3;
        String str26 = str6;
        String str27 = str2;
        String str28 = str5;
        int i5 = i3;
        String str29 = str18;
        int i6 = i2;
        String str30 = str17;
        String str31 = str16;
        String str32 = str13;
        String str33 = str12;
        String str34 = str11;
        String str35 = str15;
        boolean z3 = z;
        String str36 = "";
        String str37 = (i4 & 1) != 0 ? "" : str;
        str27 = (i4 & 2) != 0 ? "" : str27;
        str25 = (i4 & 4) != 0 ? "" : str25;
        str28 = (i4 & 32) != 0 ? "" : str28;
        str26 = (i4 & 64) != 0 ? "" : str26;
        str24 = (i4 & 128) != 0 ? "" : str24;
        str23 = (i4 & 256) != 0 ? "" : str23;
        str22 = (i4 & 512) != 0 ? "" : str22;
        str21 = (i4 & 1024) != 0 ? "" : str21;
        z3 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z3;
        str34 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str34;
        str33 = (i4 & 8192) != 0 ? "" : str33;
        str32 = (i4 & 16384) != 0 ? "" : str32;
        if ((32768 & i4) != 0) {
            str20 = "";
        } else {
            str20 = "";
            str36 = str14;
        }
        str35 = (131072 & i4) != 0 ? str20 : str35;
        str31 = (262144 & i4) != 0 ? str20 : str31;
        str30 = (524288 & i4) != 0 ? str20 : str30;
        i6 = (1048576 & i4) != 0 ? -1 : i6;
        str29 = (2097152 & i4) != 0 ? str20 : str29;
        i5 = (4194304 & i4) != 0 ? 0 : i5;
        if ((8388608 & i4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        str20 = (i4 & 16777216) == 0 ? str19 : str20;
        this.LIZ = str37;
        this.LIZIZ = str27;
        this.LIZJ = str25;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = str28;
        this.LJI = str26;
        this.LJII = str24;
        this.LJIIIIZZ = str23;
        this.LJIIIZ = str22;
        this.LJIIJ = str21;
        this.LJIIJJI = z3;
        this.LJIIL = str34;
        this.LJIILIIL = str33;
        this.LJIILJJIL = str32;
        this.LJIILL = str36;
        this.LJIILLIIL = str35;
        this.LJIIZILJ = str31;
        this.LJIJ = str30;
        this.LJIJI = i6;
        this.LJIJJ = str29;
        this.LJIJJLI = i5;
        this.LJIL = z2;
        this.LJJ = str20;
    }
}
