package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.14Tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20271614Tq {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final int LJIIZILJ;
    public final String LJIJ;

    public static C20271614Tq LIZ(C20271614Tq c20271614Tq, String str, String str2, int i, String str3, String str4, int i2, int i3) {
        String str5;
        String str6;
        String str7;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str8 = str4;
        int i7 = i2;
        int i8 = i;
        String str9 = str3;
        String str10 = str2;
        String str11 = str;
        String str12 = null;
        if ((i3 & 1) != 0) {
            str5 = c20271614Tq.LIZ;
        } else {
            str5 = null;
        }
        if ((i3 & 2) != 0) {
            str11 = c20271614Tq.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            str6 = c20271614Tq.LIZJ;
        } else {
            str6 = null;
        }
        if ((i3 & 8) != 0) {
            str7 = c20271614Tq.LIZLLL;
        } else {
            str7 = null;
        }
        if ((i3 & 16) != 0) {
            str10 = c20271614Tq.LJ;
        }
        if ((i3 & 32) != 0) {
            i4 = c20271614Tq.LJFF;
        } else {
            i4 = 0;
        }
        if ((i3 & 64) != 0) {
            i5 = c20271614Tq.LJI;
        } else {
            i5 = 0;
        }
        if ((i3 & 128) != 0) {
            i8 = c20271614Tq.LJII;
        }
        if ((i3 & 256) != 0) {
            i6 = c20271614Tq.LJIIIIZZ;
        } else {
            i6 = 0;
        }
        if ((i3 & 512) != 0) {
            str9 = c20271614Tq.LJIIIZ;
        }
        if ((i3 & 1024) != 0) {
            str8 = c20271614Tq.LJIIJ;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z = c20271614Tq.LJIIJJI;
        } else {
            z = false;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = c20271614Tq.LJIIL;
        } else {
            z2 = false;
        }
        if ((i3 & 8192) != 0) {
            z3 = c20271614Tq.LJIILIIL;
        } else {
            z3 = false;
        }
        if ((i3 & 16384) != 0) {
            z4 = c20271614Tq.LJIILJJIL;
        } else {
            z4 = false;
        }
        if ((32768 & i3) != 0) {
            z5 = c20271614Tq.LJIILL;
        } else {
            z5 = false;
        }
        if ((65536 & i3) != 0) {
            z6 = c20271614Tq.LJIILLIIL;
        } else {
            z6 = false;
        }
        if ((131072 & i3) != 0) {
            i7 = c20271614Tq.LJIIZILJ;
        }
        if ((i3 & 262144) != 0) {
            str12 = c20271614Tq.LJIJ;
        }
        c20271614Tq.getClass();
        return new C20271614Tq(str5, str11, str6, str7, str10, i4, i5, i8, i6, str9, str8, z, z2, z3, z4, z5, z6, i7, str12);
    }

    public C20271614Tq(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i5, String str8) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = str6;
        this.LJIIJ = str7;
        this.LJIIJJI = z;
        this.LJIIL = z2;
        this.LJIILIIL = z3;
        this.LJIILJJIL = z4;
        this.LJIILL = z5;
        this.LJIILLIIL = z6;
        this.LJIIZILJ = i5;
        this.LJIJ = str8;
    }
}
