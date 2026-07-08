package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2205571BTv<T> {
    public final Map<T, C2205271BSr> LIZ = new HashMap();
    public final Map<C2205271BSr, T> LIZIZ = new HashMap();

    public final void LIZ(C2205271BSr c2205271BSr) {
        Object obj = ((HashMap) this.LIZIZ).get(c2205271BSr);
        ((HashMap) this.LIZIZ).remove(c2205271BSr);
        ((HashMap) this.LIZ).remove(obj);
    }
}
