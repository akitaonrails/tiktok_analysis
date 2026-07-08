package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.11bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19533711bb {
    public static void LIZIZ(C19536911c7 c19536911c7) {
        for (C19536311c1 c19536311c1 : c19536911c7.LIZLLL) {
            if (!c19536311c1.LJIIIIZZ) {
                LIZ(!c19536311c1.LJIIIZ ? 1 : 0, "is_compensation_upload");
                LIZ(c19536311c1.LJIIJ, "origin_file_length");
                LIZ(c19536311c1.LJIIJJI, "upload_file_length");
                LIZ(c19536311c1.LJIIL, "error_code");
                String str = c19536311c1.LJIILIIL;
                ConcurrentHashMap<String, String> concurrentHashMap = C19533911bd.LIZ;
                concurrentHashMap.put("error_msg", str);
                LIZ(c19536311c1.LJIILJJIL, "pipeline_error_stage");
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJII(concurrentHashMap);
                C20684815ws.LJIILLIIL("voice_conversion_effect_file_pre", c2344009Gk.LIZ);
            }
        }
        C19533911bd.LIZ.clear();
    }

    public static void LIZ(int i, String str) {
        C19533911bd.LIZ.put(str, String.valueOf(i));
    }
}
