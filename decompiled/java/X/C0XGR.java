package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0XGR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XGR {
    public final Map<String, String> LIZ = new HashMap();

    public final void LIZ(int i, String str) {
        LIZLLL(str, String.valueOf(i));
    }

    public final void LIZIZ(long j, String str) {
        LIZLLL(str, String.valueOf(j));
    }

    public final void LIZJ(String str, String str2) {
        LIZLLL(str, str2);
    }

    public final void LIZLLL(String str, String str2) {
        ((HashMap) this.LIZ).put(str, C0XGS.LIZ(str2));
    }
}
