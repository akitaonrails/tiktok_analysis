package X;

import android.os.Bundle;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;

/* JADX INFO: renamed from: X.0umg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717080umg {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C1716350ulV LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final String LJI;
    public final Map<String, Object> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final Bundle LJIIZILJ;
    public final String LJIJ;
    public final Integer LJIJI;
    public final String LJIJJ;

    public static C1717080umg LIZ(C1717080umg c1717080umg, String str, int i) {
        String str2;
        String str3;
        String str4;
        C1716350ulV c1716350ulV;
        String str5;
        long j;
        Map<String, Object> map;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        Bundle bundle;
        String str15;
        Integer num;
        String str16 = str;
        String str17 = null;
        if ((i & 1) != 0) {
            str2 = c1717080umg.LIZ;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str3 = c1717080umg.LIZIZ;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str4 = c1717080umg.LIZJ;
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            c1716350ulV = c1717080umg.LIZLLL;
        } else {
            c1716350ulV = null;
        }
        if ((i & 16) != 0) {
            str5 = c1717080umg.LJ;
        } else {
            str5 = null;
        }
        if ((i & 32) != 0) {
            j = c1717080umg.LJFF;
        } else {
            j = 0;
        }
        if ((i & 64) != 0) {
            str16 = c1717080umg.LJI;
        }
        if ((i & 128) != 0) {
            map = c1717080umg.LJII;
        } else {
            map = null;
        }
        if ((i & 256) != 0) {
            str6 = c1717080umg.LJIIIIZZ;
        } else {
            str6 = null;
        }
        if ((i & 512) != 0) {
            str7 = c1717080umg.LJIIIZ;
        } else {
            str7 = null;
        }
        if ((i & 1024) != 0) {
            str8 = c1717080umg.LJIIJ;
        } else {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str9 = c1717080umg.LJIIJJI;
        } else {
            str9 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str10 = c1717080umg.LJIIL;
        } else {
            str10 = null;
        }
        if ((i & 8192) != 0) {
            str11 = c1717080umg.LJIILIIL;
        } else {
            str11 = null;
        }
        if ((i & 16384) != 0) {
            str12 = c1717080umg.LJIILJJIL;
        } else {
            str12 = null;
        }
        if ((32768 & i) != 0) {
            str13 = c1717080umg.LJIILL;
        } else {
            str13 = null;
        }
        if ((65536 & i) != 0) {
            str14 = c1717080umg.LJIILLIIL;
        } else {
            str14 = null;
        }
        if ((131072 & i) != 0) {
            bundle = c1717080umg.LJIIZILJ;
        } else {
            bundle = null;
        }
        if ((262144 & i) != 0) {
            str15 = c1717080umg.LJIJ;
        } else {
            str15 = null;
        }
        if ((524288 & i) != 0) {
            num = c1717080umg.LJIJI;
        } else {
            num = null;
        }
        if ((i & 1048576) != 0) {
            str17 = c1717080umg.LJIJJ;
        }
        return new C1717080umg(str2, str3, str4, c1716350ulV, str5, j, str16, (Map<String, ? extends Object>) map, str6, str7, str8, str9, str10, str11, str12, str13, str14, bundle, str15, num, str17);
    }

    public /* synthetic */ C1717080umg(String str, String str2, String str3, C1716350ulV c1716350ulV, String str4, long j, Map map, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Bundle bundle, String str14, Integer num, String str15, int i) {
        this(str, str2, str3, c1716350ulV, (i & 16) != 0 ? "" : str4, j, (i & 64) == 0 ? null : "", (Map<String, ? extends Object>) ((i & 128) != 0 ? null : map), (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str8, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (32768 & i) != 0 ? null : str12, (65536 & i) != 0 ? null : str13, (131072 & i) != 0 ? null : bundle, (262144 & i) != 0 ? null : str14, (524288 & i) != 0 ? null : num, (i & 1048576) == 0 ? str15 : null);
    }

    public C1717080umg(String str, String str2, String str3, C1716350ulV c1716350ulV, String str4, long j, String str5, Map<String, ? extends Object> map, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Bundle bundle, String str15, Integer num, String str16) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c1716350ulV;
        this.LJ = str4;
        this.LJFF = j;
        this.LJI = str5;
        this.LJII = map;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = str7;
        this.LJIIJ = str8;
        this.LJIIJJI = str9;
        this.LJIIL = str10;
        this.LJIILIIL = str11;
        this.LJIILJJIL = str12;
        this.LJIILL = str13;
        this.LJIILLIIL = str14;
        this.LJIIZILJ = bundle;
        this.LJIJ = str15;
        this.LJIJI = num;
        this.LJIJJ = str16;
    }
}
