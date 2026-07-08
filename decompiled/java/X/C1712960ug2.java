package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0ug2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712960ug2 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Map<String, String> LJIIJ;
    public final boolean LJIIJJI;

    public C1712960ug2() {
        throw null;
    }

    public C1712960ug2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, Map map, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        str7 = (i & 64) != 0 ? null : str7;
        str8 = (i & 128) != 0 ? null : str8;
        str9 = (i & 256) != 0 ? CardStruct.IStatusCode.DEFAULT : str9;
        z = (i & 512) != 0 ? false : z;
        map = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C2097608Jq.LJ() : map;
        boolean z2 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = str9;
        this.LJIIIZ = z;
        this.LJIIJ = map;
        this.LJIIJJI = z2;
    }
}
