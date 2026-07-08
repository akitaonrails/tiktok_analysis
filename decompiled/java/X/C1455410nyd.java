package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455410nyd implements InterfaceC1456360o0A {
    public CountDownLatch LIZ;
    public final List<Runnable> LIZIZ = Collections.synchronizedList(new ArrayList());
    public CoverNewItem LIZJ;

    @Override // X.InterfaceC1456360o0A
    public final void LIZJ() {
        this.LIZJ = null;
        this.LIZ = new CountDownLatch(1);
    }

    @Override // X.InterfaceC1456360o0A
    public final CoverNewItem LIZIZ() {
        CoverNewItem coverNewItem = this.LIZJ;
        this.LIZJ = null;
        return coverNewItem;
    }

    @Override // X.InterfaceC1456360o0A
    public final boolean LJ() {
        CountDownLatch countDownLatch = this.LIZ;
        return countDownLatch == null || countDownLatch.getCount() == 0;
    }

    @Override // X.InterfaceC1456360o0A
    public final boolean LIZ(long j) {
        CountDownLatch countDownLatch = this.LIZ;
        boolean zAwait = true;
        if (countDownLatch == null) {
            return true;
        }
        try {
            try {
                zAwait = countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZ = null;
            return zAwait;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ = null;
            throw th;
        }
    }

    @Override // X.InterfaceC1456360o0A
    public final void LIZLLL(CoverNewItem coverNewItem) {
        this.LIZJ = coverNewItem;
        CountDownLatch countDownLatch = this.LIZ;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C01TT.LIZLLL(new AwS566S0100000_22(this, 833));
        this.LIZIZ.clear();
    }
}
