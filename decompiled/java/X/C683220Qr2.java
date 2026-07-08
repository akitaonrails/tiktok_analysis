package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683220Qr2 {
    public String LIZ;
    public UrlModel LIZIZ;
    public CharSequence LIZJ;
    public List<FeedbackMultipleChoice> LIZLLL;
    public Map<String, String> LJ;
    public String LJFF;
    public final String LJI;
    public String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public String LJIIL;
    public Aweme LJIILIIL;
    public final JSONObject LJIILJJIL;
    public boolean LJIILL;
    public final Object LJIILLIIL;

    public C683220Qr2() {
        this(null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 524287);
    }

    public C683220Qr2(String str, UrlModel urlModel, CharSequence charSequence, List list, Map map, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, Aweme aweme, JSONObject jSONObject, C21419118s1 c21419118s1, int i) {
        List list2 = list;
        UrlModel urlModel2 = urlModel;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        Map linkedHashMap = map;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        C21419118s1 c21419118s12 = c21419118s1;
        JSONObject jSONObject2 = jSONObject;
        Aweme aweme2 = aweme;
        String str8 = (i & 1) != 0 ? "" : str;
        urlModel2 = (i & 2) != 0 ? null : urlModel2;
        CharSequence charSequence2 = (i & 4) == 0 ? charSequence : "";
        list2 = (i & 8) != 0 ? null : list2;
        linkedHashMap = (i & 16) != 0 ? new LinkedHashMap() : linkedHashMap;
        str7 = (i & 32) != 0 ? null : str7;
        str6 = (i & 64) != 0 ? null : str6;
        str5 = (i & 128) != 0 ? null : str5;
        z8 = (i & 256) != 0 ? false : z8;
        z7 = (i & 512) != 0 ? false : z7;
        z6 = (i & 1024) != 0 ? false : z6;
        z5 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z5;
        aweme2 = (i & 8192) != 0 ? null : aweme2;
        jSONObject2 = (32768 & i) != 0 ? null : jSONObject2;
        c21419118s12 = (i & 131072) != 0 ? null : c21419118s12;
        this.LIZ = str8;
        this.LIZIZ = urlModel2;
        this.LIZJ = charSequence2;
        this.LIZLLL = list2;
        this.LJ = linkedHashMap;
        this.LJFF = str7;
        this.LJI = str6;
        this.LJII = str5;
        this.LJIIIIZZ = z8;
        this.LJIIIZ = z7;
        this.LJIIJ = z6;
        this.LJIIJJI = z5;
        this.LJIIL = null;
        this.LJIILIIL = aweme2;
        this.LJIILJJIL = jSONObject2;
        this.LJIILL = false;
        this.LJIILLIIL = c21419118s12;
    }
}
