package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0dRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050680dRq {
    public final String LIZ;
    public final String LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Integer LJIIJJI;
    public final Long LJIIL;
    public final Long LJIILIIL;
    public final boolean LJIILJJIL;

    public C1050680dRq(String str, String str2, Long l, Integer num, Integer num2, int i, String str3, String str4, String str5, String str6, Integer num3, Long l2, Long l3, boolean z, int i2) {
        String str7;
        Integer num4 = num;
        Long l4 = l;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        int i3 = i;
        Integer num5 = num2;
        boolean z2 = z;
        Long l5 = l3;
        Long l6 = l2;
        Integer num6 = num3;
        String str11 = (i2 & 1) != 0 ? "" : str;
        l4 = (i2 & 4) != 0 ? -1L : l4;
        if ((i2 & 8) != 0) {
            str7 = "";
        } else {
            str7 = null;
        }
        num4 = (i2 & 16) != 0 ? -1 : num4;
        num5 = (i2 & 32) != 0 ? -1 : num5;
        i3 = (i2 & 64) != 0 ? 0 : i3;
        str10 = (i2 & 128) != 0 ? "" : str10;
        str9 = (i2 & 256) != 0 ? "" : str9;
        str8 = (i2 & 512) != 0 ? "" : str8;
        String str12 = (i2 & 1024) == 0 ? str6 : "";
        num6 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : num6;
        l6 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1L : l6;
        l5 = (i2 & 8192) != 0 ? -1L : l5;
        z2 = (i2 & 16384) != 0 ? false : z2;
        this.LIZ = str11;
        this.LIZIZ = str2;
        this.LIZJ = l4;
        this.LIZLLL = str7;
        this.LJ = num4;
        this.LJFF = num5;
        this.LJI = i3;
        this.LJII = str10;
        this.LJIIIIZZ = str9;
        this.LJIIIZ = str8;
        this.LJIIJ = str12;
        this.LJIIJJI = num6;
        this.LJIIL = l6;
        this.LJIILIIL = l5;
        this.LJIILJJIL = z2;
    }
}
