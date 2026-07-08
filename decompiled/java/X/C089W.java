package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.089W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C089W extends BPEAThread {
    public final WeakReference<AdvertisingIdClient> LL;
    public final long LLILLJJLI;
    public final CountDownLatch LLILLL = new CountDownLatch(1);
    public boolean LLILZ = false;

    public C089W(AdvertisingIdClient advertisingIdClient, long j) {
        this.LL = new WeakReference<>(advertisingIdClient);
        this.LLILLJJLI = j;
        start();
    }

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        C1C7U.LIZ("AdvertisingIdClient$zza@f893.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            try {
                if (!this.LLILLL.await(this.LLILLJJLI, TimeUnit.MILLISECONDS) && (advertisingIdClient = this.LL.get()) != null) {
                    advertisingIdClient.LIZ();
                    this.LLILZ = true;
                }
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                AdvertisingIdClient advertisingIdClient2 = this.LL.get();
                if (advertisingIdClient2 != null) {
                    advertisingIdClient2.LIZ();
                    this.LLILZ = true;
                }
            }
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("AdvertisingIdClient$zza@f893.run");
    }
}
