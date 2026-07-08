package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;

/* JADX INFO: renamed from: X.0QYH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QYH {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C672110QXx LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final List<String> LJIIJ;

    public C0QYH(String str, String str2, String str3, String str4, C672110QXx c672110QXx, String str5, String str6, String str7, String str8, String str9, List list, int i) {
        String str10 = str2;
        String str11 = str4;
        String str12 = str3;
        String str13 = str7;
        String str14 = str6;
        String str15 = str5;
        String str16 = str9;
        String str17 = str8;
        C672110QXx c672110QXx2 = c672110QXx;
        String str18 = (i & 1) != 0 ? null : str;
        str10 = (i & 4) != 0 ? null : str10;
        str12 = (i & 8) != 0 ? null : str12;
        str11 = (i & 16) != 0 ? null : str11;
        c672110QXx2 = (i & 128) != 0 ? new C672110QXx(null, null, null, null, null) : c672110QXx2;
        str15 = (i & 256) != 0 ? null : str15;
        str14 = (i & 512) != 0 ? null : str14;
        str13 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str13;
        str17 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str17;
        str16 = (i & 8192) != 0 ? null : str16;
        List list2 = (i & 16384) == 0 ? list : null;
        this.LIZ = str18;
        this.LIZIZ = str10;
        this.LIZJ = str12;
        this.LIZLLL = str11;
        this.LJ = c672110QXx2;
        this.LJFF = str15;
        this.LJI = str14;
        this.LJII = str13;
        this.LJIIIIZZ = str17;
        this.LJIIIZ = str16;
        this.LJIIJ = list2;
    }
}
