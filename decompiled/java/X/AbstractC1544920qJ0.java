package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1544920qJ0 {
    public final String LIZ;
    public long LIZIZ;
    public long LIZJ;

    public final void LIZ() {
        this.LIZJ = System.currentTimeMillis();
    }

    public final void LIZJ() {
        this.LIZIZ = System.currentTimeMillis();
    }

    public AbstractC1544920qJ0(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(Map<String, Long> map) {
        Long lValueOf;
        long j = this.LIZIZ;
        if (j != 0) {
            long j2 = this.LIZJ;
            if (j2 != 0 && (lValueOf = Long.valueOf(j2 - j)) != null) {
                ((HashMap) map).put(this.LIZ, Long.valueOf(lValueOf.longValue()));
            }
        }
    }
}
