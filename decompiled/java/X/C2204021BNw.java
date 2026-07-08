package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204021BNw implements C1BOI {
    public static final Map<String, String> LIZJ;
    public final C1BOI LIZIZ;

    static {
        HashMap map = new HashMap();
        LIZJ = map;
        map.put("warmup.start", "pia_warmup_start");
        map.put("warmup.end", "pia_warmup_end");
        map.put("initialize.start", "pia_initialize_start");
        map.put("request_html.start", "pia_request_html_start");
        map.put("request_html.end", "pia_request_html_end");
        map.put("intercept_html.start", "pia_intercept_html_start");
        map.put("intercept_html.end", "pia_intercept_html_end");
        map.put("manifest_parse.end", "pia_manifest_parsed");
        map.put("request_worker.start", "pia_request_worker_start");
        map.put("request_worker.end", "pia_request_worker_end");
    }

    public C2204021BNw(C1BOI c1boi) {
        this.LIZIZ = c1boi;
    }

    @Override // X.C1BOI
    public final void LIZIZ(Object obj) {
        this.LIZIZ.LIZIZ(obj);
    }

    @Override // X.C1BOI
    public final void LIZ(Object obj, String str) {
        this.LIZIZ.LIZ(obj, str);
    }

    @Override // X.C1BOI
    public final void LIZJ(long j, String str) {
        this.LIZIZ.LIZJ(j, str);
        String str2 = (String) ((HashMap) LIZJ).get(str);
        if (str2 != null) {
            this.LIZIZ.LIZJ(j, str2);
        }
    }
}
