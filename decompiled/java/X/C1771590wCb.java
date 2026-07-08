package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0wCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771590wCb {
    public static boolean LJIILLIIL;
    public static long LJIIZILJ;
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final Map<String, ? extends Object> LJII;
    public final Boolean LJIIIIZZ;
    public final Map<String, ? extends Object> LJIIIZ;
    public final Map<String, ? extends Object> LJIIJ;
    public final Long LJIIJJI;
    public final Map<String, Object> LJIIL;
    public final boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;

    public C1771590wCb() {
        throw null;
    }

    public C1771590wCb(String str, int i, String str2, String str3, String str4, Map map, Map map2, Map map3, Long l, Map map4, boolean z, int i2) {
        Boolean bool;
        i = (i2 & 2) != 0 ? -1 : i;
        if ((i2 & 256) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        map2 = (i2 & 512) != 0 ? null : map2;
        map3 = (i2 & 1024) != 0 ? null : map3;
        l = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : l;
        map4 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new LinkedHashMap() : map4;
        z = (i2 & 8192) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = map;
        this.LJIIIIZZ = bool;
        this.LJIIIZ = map2;
        this.LJIIJ = map3;
        this.LJIIJJI = l;
        this.LJIIL = map4;
        this.LJIILIIL = z;
        this.LJIILJJIL = false;
        this.LJIILL = 0;
    }
}
