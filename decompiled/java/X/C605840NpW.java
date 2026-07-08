package X;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0NpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605840NpW {
    public final long LIZ;
    public final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public final Set<String> LIZJ = Collections.newSetFromMap(new ConcurrentHashMap());

    public C605840NpW(long j) {
        this.LIZ = j;
    }

    public final void LIZ(long j, String str) {
        if (this.LIZJ.contains(str)) {
            return;
        }
        this.LIZIZ.putIfAbsent(str, Long.valueOf(j));
    }
}
