package X;

import Y.ARunnableS113S0100000_13;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VVE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VVE {
    public final C0V2A LIZ;
    public final C0VV7 LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final ARunnableS113S0100000_13 LJFF = new ARunnableS113S0100000_13(this, 265);

    public final void LIZIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        this.LIZJ = SystemClock.uptimeMillis();
        this.LIZ.LJFF();
    }

    public final void LIZJ() {
        if (this.LIZLLL) {
            this.LIZLLL = false;
            if (this.LJ) {
                C2487409ou.LIZIZ().removeCallbacks(this.LJFF);
            }
            this.LJ = false;
            this.LIZIZ.LLILZIL = SystemClock.uptimeMillis() - this.LIZJ;
            this.LIZ.LJI();
            this.LIZJ = 0L;
        }
    }

    public final void LIZ(LagDataCallback lagDataCallback) {
        C0VV7 c0vv7 = this.LIZIZ;
        synchronized (c0vv7) {
            c0vv7.LLILLL = lagDataCallback;
        }
    }

    public C0VVE(String str, Function0<? extends HashMap<String, String>> function0) {
        C0VV7 c0vv7 = new C0VV7(str, function0);
        this.LIZIZ = c0vv7;
        C0V2A c0v2a = new C0V2A(str, true);
        this.LIZ = c0v2a;
        c0v2a.LIZLLL(c0vv7);
        c0v2a.LIZJ(c0vv7);
    }
}
