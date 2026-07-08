package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.14hU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20334614hU {
    public final Map<Integer, C20334714hV> LIZ = new HashMap();
    public final Map<Integer, C20334714hV> LIZIZ = new HashMap();

    public final synchronized void LIZIZ(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                ((HashMap) this.LIZIZ).remove(Integer.valueOf(i2));
            }
        } else {
            ((HashMap) this.LIZ).remove(Integer.valueOf(i2));
        }
    }

    public final synchronized void LIZ(int i, int i2, C20334714hV c20334714hV) {
        if (i != 0) {
            if (i == 1) {
                ((HashMap) this.LIZIZ).put(Integer.valueOf(i2), c20334714hV);
            }
        } else {
            ((HashMap) this.LIZ).put(Integer.valueOf(i2), c20334714hV);
        }
    }
}
