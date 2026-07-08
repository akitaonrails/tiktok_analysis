package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0CVI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CVI {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public final List<AbstractC315550CYn> LJ = new ArrayList();

    public final long LIZ() {
        if (this.LIZIZ == 0) {
            return 0L;
        }
        return (SystemClock.elapsedRealtime() - this.LIZLLL) + this.LIZIZ;
    }
}
