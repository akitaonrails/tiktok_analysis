package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS14S0200100_13;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0VVA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VVA {
    public final String LIZ;
    public C0VV8 LIZJ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public LagDataCallback LJIIIIZZ;
    public final C0VV8 LIZIZ = new C0VV8(-1, null);
    public LinkedList<C0VV8> LIZLLL = new LinkedList<>();
    public final ARunnableS113S0100000_13 LJ = new ARunnableS113S0100000_13(this, 263);
    public int LJIIIZ = LSPassThroughRecordSizeConfig.DEFAULT;

    public final void LIZJ() {
        if (this.LJFF) {
            this.LJFF = false;
            if (this.LJI) {
                C2487409ou.LIZIZ().removeCallbacks(this.LJ);
            }
            this.LJI = false;
            C0VV9 value = C0VV9.LLILZ.getValue();
            if (value != null) {
                ((ArrayList) value.LLILLJJLI).remove(this);
                if (((ArrayList) value.LLILLJJLI).isEmpty() && value.LLILLL) {
                    C791390V2r.LJJIII.LJIILLIIL(value);
                    value.LLILLL = false;
                }
            }
            LinkedList<C0VV8> linkedList = this.LIZLLL;
            this.LIZLLL = new LinkedList<>();
            C787900UvU.LIZ.LIZJ(new ARunnableS14S0200100_13(this, linkedList, SystemClock.uptimeMillis() - this.LJII, 2));
            this.LJII = 0L;
            C0VV8 c0vv8 = this.LIZIZ;
            c0vv8.LIZ = -1L;
            c0vv8.LIZIZ = null;
            c0vv8.LIZJ = -1L;
            c0vv8.LIZLLL = false;
            c0vv8.LJ = false;
            c0vv8.LJFF = false;
        }
    }

    public final void LIZIZ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        this.LJII = SystemClock.uptimeMillis();
        this.LIZLLL.clear();
        C0VV9 value = C0VV9.LLILZ.getValue();
        if (value != null) {
            ((ArrayList) value.LLILLJJLI).add(this);
            if (value.LLILLL) {
                return;
            }
            C791390V2r.LJJIII.LJ(value);
            value.LLILLL = true;
        }
    }

    public C0VVA(String str) {
        this.LIZ = str;
    }

    public final void LIZ(LagDataCallback lagDataCallback) {
        synchronized (this) {
            try {
                this.LJIIIIZZ = lagDataCallback;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
