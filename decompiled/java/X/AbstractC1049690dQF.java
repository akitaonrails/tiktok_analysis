package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: X.0dQF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1049690dQF {
    public final C1050000dQk LIZ;
    public final C19JH LIZIZ;
    public String LIZJ;
    public Map<String, Object> LIZLLL;
    public String LJ;

    public abstract void LIZIZ();

    static {
        new HashSet(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    }

    public final void LIZ() {
        if (!TextUtils.isEmpty(this.LJ)) {
            C1050000dQk c1050000dQk = new C1050000dQk();
            c1050000dQk.LIZJ = "custom";
            c1050000dQk.LIZLLL = "emit";
            HashMap map = new HashMap();
            map.put("name", this.LJ);
            c1050000dQk.LJ = map;
            new C1049740dQK(this.LIZIZ, this.LIZJ, c1050000dQk).LIZIZ();
        }
    }

    public void LIZJ() {
        LIZ();
    }

    public AbstractC1049690dQF(C19JH c19jh, String str, C1050000dQk c1050000dQk) {
        this.LIZIZ = c19jh;
        this.LIZ = c1050000dQk;
        this.LIZJ = c1050000dQk.LIZLLL;
        Map<String, Object> map = c1050000dQk.LJ;
        this.LIZLLL = map;
        if (map != null && !((HashMap) map).isEmpty() && this.LIZLLL.containsKey("emitCustomEvent") && (this.LIZLLL.get("emitCustomEvent") instanceof String)) {
            this.LJ = (String) this.LIZLLL.get("emitCustomEvent");
        }
    }
}
