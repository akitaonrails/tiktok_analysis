package X;

import java.util.LinkedList;

/* JADX INFO: renamed from: X.08J9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08J9 {
    public final LinkedList<Long> LIZ = new LinkedList<>();
    public final long LIZIZ = 1000;

    public final boolean LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.LIZIZ;
        while ((!this.LIZ.isEmpty()) && ((Number) C13LP.LJJJJZI(this.LIZ)).longValue() < j) {
            this.LIZ.removeFirst();
        }
        if (this.LIZ.size() >= 3) {
            return false;
        }
        this.LIZ.addLast(Long.valueOf(jCurrentTimeMillis));
        return true;
    }
}
