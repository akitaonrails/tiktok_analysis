package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.11YX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11YX {
    public final Map<String, String> LIZ = new LinkedHashMap();
    public boolean LIZIZ;

    public final C11YY LIZ() {
        C11YY c11yy = new C11YY(this.LIZ);
        c11yy.LIZIZ = this.LIZIZ;
        return c11yy;
    }

    public final void LIZIZ(Integer num) {
        if (num == null) {
            return;
        }
        this.LIZ.put("error_code", num.toString());
    }

    public final void LIZJ(String str) {
        if (str == null) {
            return;
        }
        this.LIZ.put("error_msg", str);
    }

    public final void LIZLLL(C11YJ c11yj) {
        if (c11yj == null) {
            return;
        }
        this.LIZ.put("error_source", c11yj.getValue());
    }

    public final void LJ(String str) {
        this.LIZ.put("event_name", str);
    }

    public final void LJFF(String str) {
        if (str == null) {
            return;
        }
        this.LIZ.put("task_id", str);
    }
}
