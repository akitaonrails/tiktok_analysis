package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0X32, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X32 {
    public boolean LIZ;
    public int LIZIZ = -1;
    public boolean LIZJ;

    public final void LIZ(TimeUnit timeUnit) {
        int i = Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i = (int) seconds;
        }
        this.LIZIZ = i;
    }
}
