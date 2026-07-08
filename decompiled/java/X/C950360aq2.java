package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0aq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950360aq2 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C955540ayO LIZLLL;
    public final List<String> LJ;
    public final Object LJFF;
    public final Map<String, String> LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final C943870afZ LJIIL;
    public final String LJIILIIL;
    public final Integer LJIILJJIL;
    public final C500400Jjq LJIILL;

    public C950360aq2() {
        throw null;
    }

    public C950360aq2(String str, String str2, String str3, C955540ayO c955540ayO, List list, InterfaceC950290apv interfaceC950290apv, Map map, boolean z, String str4, String str5, int i, String str6, C943870afZ c943870afZ, String str7, Integer num, C500400Jjq c500400Jjq, int i2) {
        Map map2 = map;
        String str8 = str5;
        String str9 = str4;
        boolean z2 = z;
        C943870afZ c943870afZ2 = c943870afZ;
        String str10 = str6;
        int i3 = i;
        Integer num2 = num;
        String str11 = str7;
        InterfaceC950290apv interfaceC950290apv2 = (i2 & 64) != 0 ? null : interfaceC950290apv;
        map2 = (i2 & 128) != 0 ? null : map2;
        z2 = (i2 & 256) != 0 ? true : z2;
        str9 = (i2 & 1024) != 0 ? null : str9;
        str8 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str8;
        i3 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i3;
        str10 = (i2 & 8192) != 0 ? null : str10;
        c943870afZ2 = (i2 & 16384) != 0 ? null : c943870afZ2;
        str11 = (32768 & i2) != 0 ? null : str11;
        num2 = (65536 & i2) != 0 ? null : num2;
        C500400Jjq c500400Jjq2 = (i2 & 131072) == 0 ? c500400Jjq : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c955540ayO;
        this.LJ = list;
        this.LJFF = interfaceC950290apv2;
        this.LJI = map2;
        this.LJII = z2;
        this.LJIIIIZZ = str9;
        this.LJIIIZ = str8;
        this.LJIIJ = i3;
        this.LJIIJJI = str10;
        this.LJIIL = c943870afZ2;
        this.LJIILIIL = str11;
        this.LJIILJJIL = num2;
        this.LJIILL = c500400Jjq2;
    }
}
