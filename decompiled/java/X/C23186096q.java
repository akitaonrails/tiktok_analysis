package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.ImageInfoList;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.params.NLEModelRequestConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.096q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23186096q {
    public final String LIZ;
    public final String LIZIZ;
    public final List<MetaExt> LIZJ;
    public final List<String> LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public List<ImageInfoList> LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public String LJIILIIL;
    public Map<String, String> LJIILJJIL;

    public C23186096q() {
        this(null, null, null, null, null, false, false, null, false, 65535);
    }

    public final String LIZ() {
        String str = this.LIZ;
        if (str == null) {
            str = "not_used";
        }
        String str2 = this.LIZIZ;
        List arrayList = this.LJIIJ;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        List arrayList2 = this.LIZLLL;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        NLEModelRequestConfig nLEModelRequestConfig = new NLEModelRequestConfig(str, str2, arrayList, arrayList2, this.LJII, this.LJIIIIZZ, this.LJI, this.LJFF);
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(nLEModelRequestConfig);
        return strLJI == null ? "" : strLJI;
    }

    public C23186096q(String str, String str2, List list, List list2, String str3, boolean z, boolean z2, String str4, boolean z3, int i) {
        boolean z4;
        Map<String, String> mapLJ;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? "" : str2;
        list = (i & 4) != 0 ? new ArrayList() : list;
        list2 = (i & 8) != 0 ? null : list2;
        str3 = (i & 16) != 0 ? "" : str3;
        z = (i & 32) != 0 ? false : z;
        if ((i & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        z2 = (i & 512) != 0 ? false : z2;
        str4 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str4;
        z3 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z3;
        String str5 = (i & 16384) == 0 ? null : "";
        if ((i & 32768) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = false;
        this.LJII = z4;
        this.LJIIIIZZ = false;
        this.LJIIIZ = z2;
        this.LJIIJ = null;
        this.LJIIJJI = str4;
        this.LJIIL = z3;
        this.LJIILIIL = str5;
        this.LJIILJJIL = mapLJ;
    }
}
