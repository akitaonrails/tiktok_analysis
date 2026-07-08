package X;

import java.util.Random;

/* JADX INFO: renamed from: X.0YLW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public class C0YLW {
    public static C0YLW LIZIZ;
    public long LIZ;

    public final synchronized long LIZ() {
        long j;
        if (this.LIZ <= 0) {
            this.LIZ = 1L;
        }
        j = this.LIZ;
        this.LIZ = 1 + j;
        return j;
    }

    public C0YLW() {
        if (this.LIZ == 0) {
            this.LIZ = new Random().nextInt(1000000);
        }
    }
}
