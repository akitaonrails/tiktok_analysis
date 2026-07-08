package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AwS50S0100100_16;

/* JADX INFO: renamed from: X.0cup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030210cup implements InterfaceC1026360coc {
    public InterfaceC1023590ck9 LIZ;
    public AwemeRawAd LIZIZ;
    public final AtomicLong LIZJ = new AtomicLong(0);
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public final void LIZJ() {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ.set(0L);
        this.LIZLLL.set(false);
    }

    @Override // X.InterfaceC1026360coc
    public final void LIZ() {
        InterfaceC1023590ck9 interfaceC1023590ck9;
        if (!this.LIZLLL.get()) {
            LIZJ();
            return;
        }
        long jMax = Math.max(0L, SystemClock.elapsedRealtime() - this.LIZJ.get());
        if (jMax > 0 && (interfaceC1023590ck9 = this.LIZ) != null) {
            try {
                interfaceC1023590ck9.logAd(C1030230cur.LIZ, this.LIZIZ, new AwS50S0100100_16(jMax, this, 7));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LIZJ();
    }

    @Override // X.InterfaceC1026360coc
    public final void LIZIZ(InterfaceC1023590ck9 interfaceC1023590ck9, AwemeRawAd awemeRawAd) {
        if (this.LIZLLL.get()) {
            LIZJ();
        }
        this.LIZ = interfaceC1023590ck9;
        this.LIZIZ = awemeRawAd;
        this.LIZJ.set(SystemClock.elapsedRealtime());
        this.LIZLLL.set(true);
    }
}
