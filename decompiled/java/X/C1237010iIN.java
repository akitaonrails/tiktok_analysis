package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0iIN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237010iIN {
    public String LIZ;
    public String LIZIZ;
    public EnumC638250P1r LIZJ;
    public String LIZLLL;
    public final EnumC638250P1r LJ;
    public boolean LJFF;
    public boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public CharSequence LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public Integer LJIILLIIL;
    public String LJIIZILJ;
    public C1237030iIP LJIJ;
    public C1237030iIP LJIJI;
    public boolean LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public final Integer LJJI;

    public C1237010iIN(String str, String str2, boolean z, String str3, CharSequence charSequence, boolean z2, String str4, boolean z3, boolean z4, C1237030iIP c1237030iIP, boolean z5, String str5, String str6, String str7, Integer num, int i) {
        EnumC638250P1r enumC638250P1r;
        EnumC638250P1r enumC638250P1r2;
        String str8 = str2;
        boolean z6 = z4;
        String str9 = str4;
        boolean z7 = z2;
        CharSequence charSequence2 = charSequence;
        String str10 = str3;
        boolean z8 = z;
        Integer num2 = num;
        String str11 = str7;
        String str12 = str6;
        String str13 = str5;
        boolean z9 = z5;
        C1237030iIP c1237030iIP2 = c1237030iIP;
        String str14 = (i & 1) != 0 ? null : str;
        str8 = (i & 2) != 0 ? null : str8;
        if ((i & 4) != 0) {
            enumC638250P1r = EnumC638250P1r.SECONDARY;
        } else {
            enumC638250P1r = null;
        }
        if ((i & 16) != 0) {
            enumC638250P1r2 = EnumC638250P1r.SECONDARY;
        } else {
            enumC638250P1r2 = null;
        }
        z8 = (i & 32) != 0 ? true : z8;
        str10 = (i & 256) != 0 ? null : str10;
        charSequence2 = (i & 512) != 0 ? null : charSequence2;
        z7 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z7;
        str9 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str9;
        boolean z10 = (i & 8192) == 0 ? z3 : true;
        z6 = (32768 & i) != 0 ? false : z6;
        c1237030iIP2 = (524288 & i) != 0 ? null : c1237030iIP2;
        z9 = (2097152 & i) != 0 ? false : z9;
        str13 = (4194304 & i) != 0 ? null : str13;
        str12 = (8388608 & i) != 0 ? null : str12;
        str11 = (16777216 & i) != 0 ? null : str11;
        num2 = (i & 33554432) != 0 ? null : num2;
        this.LIZ = str14;
        this.LIZIZ = str8;
        this.LIZJ = enumC638250P1r;
        this.LIZLLL = null;
        this.LJ = enumC638250P1r2;
        this.LJFF = z8;
        this.LJI = false;
        this.LJII = null;
        this.LJIIIIZZ = str10;
        this.LJIIIZ = charSequence2;
        this.LJIIJ = z7;
        this.LJIIJJI = str9;
        this.LJIIL = z10;
        this.LJIILIIL = null;
        this.LJIILJJIL = z6;
        this.LJIILL = false;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJIJ = c1237030iIP2;
        this.LJIJI = null;
        this.LJIJJ = z9;
        this.LJIJJLI = str13;
        this.LJIL = str12;
        this.LJJ = str11;
        this.LJJI = num2;
    }
}
