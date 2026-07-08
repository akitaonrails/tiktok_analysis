package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19919812wm {
    public final InterfaceC19919712wl LIZ;
    public boolean LIZIZ;

    public C19919812wm(C20040913bD c20040913bD) {
        this.LIZ = c20040913bD;
    }

    public static void LIZ(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Param is not allowed to be List or JSONArray, rawString:\n ");
            sbLIZ.append(str);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            if (C1835380xrU.LIZ) {
                throw illegalArgumentException;
            }
        }
    }

    public final <T> String LIZIZ(T t) {
        String string;
        if (t == null) {
            return "{}";
        }
        if (!(t instanceof JSONObject) && !(t instanceof JSONArray)) {
            string = this.LIZ.LIZ(t);
        } else {
            string = t.toString();
        }
        LIZ(string);
        return string;
    }
}
