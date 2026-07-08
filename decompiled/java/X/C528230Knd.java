package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;

/* JADX INFO: renamed from: X.0Knd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528230Knd {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public String LJI;
    public String LJII;
    public final boolean LJIIIIZZ;
    public String LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public final AIGCEntranceInfo LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;

    public C528230Knd() {
        this(null, null, null, null, false, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, 33554431);
    }

    public final String LIZ() {
        return this.LJIIIIZZ ? "multi" : "single";
    }

    public C528230Knd(String str, String str2, String str3, String str4, boolean z, int i, String str5, String str6, boolean z2, boolean z3, boolean z4, AIGCEntranceInfo aIGCEntranceInfo, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i2) {
        String str15;
        String str16;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        String str17 = str6;
        String str18 = str5;
        int i3 = i;
        boolean z8 = z;
        String str19 = str4;
        String str20 = str3;
        String str21 = str2;
        String str22 = str14;
        String str23 = str13;
        String str24 = str12;
        String str25 = str11;
        String str26 = str10;
        String str27 = str9;
        String str28 = str8;
        String str29 = str7;
        AIGCEntranceInfo aIGCEntranceInfo2 = aIGCEntranceInfo;
        String str30 = (i2 & 1) != 0 ? "" : str;
        str21 = (i2 & 2) != 0 ? "" : str21;
        str20 = (i2 & 4) != 0 ? "" : str20;
        str19 = (i2 & 8) != 0 ? "" : str19;
        z8 = (i2 & 16) != 0 ? false : z8;
        i3 = (i2 & 32) != 0 ? 0 : i3;
        str18 = (i2 & 64) != 0 ? "" : str18;
        str17 = (i2 & 128) != 0 ? "" : str17;
        z7 = (i2 & 256) != 0 ? false : z7;
        if ((i2 & 512) != 0) {
            str15 = "";
        } else {
            str15 = null;
        }
        z6 = (i2 & 1024) != 0 ? false : z6;
        z5 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z5;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str16 = "";
        } else {
            str16 = null;
        }
        String str31 = (i2 & 8192) == 0 ? null : "";
        aIGCEntranceInfo2 = (32768 & i2) != 0 ? null : aIGCEntranceInfo2;
        str29 = (65536 & i2) != 0 ? null : str29;
        str28 = (131072 & i2) != 0 ? null : str28;
        str27 = (262144 & i2) != 0 ? null : str27;
        str26 = (1048576 & i2) != 0 ? null : str26;
        str25 = (2097152 & i2) != 0 ? null : str25;
        str24 = (4194304 & i2) != 0 ? null : str24;
        str23 = (8388608 & i2) != 0 ? null : str23;
        str22 = (i2 & 16777216) != 0 ? null : str22;
        this.LIZ = str30;
        this.LIZIZ = str21;
        this.LIZJ = str20;
        this.LIZLLL = str19;
        this.LJ = z8;
        this.LJFF = i3;
        this.LJI = str18;
        this.LJII = str17;
        this.LJIIIIZZ = z7;
        this.LJIIIZ = str15;
        this.LJIIJ = z6;
        this.LJIIJJI = z5;
        this.LJIIL = str16;
        this.LJIILIIL = str31;
        this.LJIILJJIL = false;
        this.LJIILL = aIGCEntranceInfo2;
        this.LJIILLIIL = str29;
        this.LJIIZILJ = str28;
        this.LJIJ = str27;
        this.LJIJI = str26;
        this.LJIJJ = str25;
        this.LJIJJLI = str24;
        this.LJIL = str23;
        this.LJJ = str22;
    }
}
