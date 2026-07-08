package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0PJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC642900PJo {
    public Long LIZ;
    public Long LIZIZ;
    public String LIZJ = "";
    public C642910PJp LIZLLL;

    public void LIZJ() {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = "";
        this.LIZLLL = null;
    }

    public final int LIZ() {
        Long l = this.LIZIZ;
        Long l2 = this.LIZ;
        if (l == null || l2 == null) {
            return -1;
        }
        return (int) (l.longValue() - l2.longValue());
    }

    public void LIZIZ() {
        this.LIZIZ = Long.valueOf(SystemClock.elapsedRealtime());
    }
}
