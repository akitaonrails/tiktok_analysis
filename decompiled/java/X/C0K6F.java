package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0K6F, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6F {
    public static final /* synthetic */ int LJ = 0;
    public String LIZ = "";
    public final Map<String, Object> LIZIZ = new LinkedHashMap();
    public final Map<String, Object> LIZJ = new LinkedHashMap();
    public final Map<String, String> LIZLLL = new LinkedHashMap();

    public final void LIZ(Throwable th) {
        if (th == null) {
            return;
        }
        this.LIZLLL.put("error_message", th.toString());
        if (!this.LIZIZ.containsKey("error_code")) {
            this.LIZIZ.put("error_code", -1);
        }
        this.LIZIZ.put("error_type", th.getClass().getSimpleName());
    }

    public final void LIZIZ(Object obj) {
        this.LIZLLL.put("time_stamp_milli", obj.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C0K6G r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K6F.LIZLLL(X.0K6G):void");
    }

    public final void LIZJ(Object obj, String str) {
        this.LIZLLL.put(str, obj.toString());
    }
}
