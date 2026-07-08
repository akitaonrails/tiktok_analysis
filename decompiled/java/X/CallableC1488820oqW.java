package X;

import Y.AObjectS366S0100000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0oqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class CallableC1488820oqW implements Callable<VideoCreation> {
    public final Lock LL;
    public final Condition LLILLJJLI;
    public final AtomicReference<UploadAuthKeyConfig> LLILLL;
    public final AtomicReference<Throwable> LLILZ;
    public final /* synthetic */ Map LLILZIL;

    @Override // java.util.concurrent.Callable
    public final VideoCreation call() throws Exception {
        C1C7U.LIZ("TTUploaderService@e032.refreshUploadAuthKeyConfig$1");
        ((ReentrantLock) this.LL).lock();
        try {
            try {
                C1444650nhH.LJ(false, this.LLILZIL, new AObjectS366S0100000_23(this, 2), new AObjectS366S0100000_23(this, 3));
                if (this.LLILLL.get() == null && this.LLILZ.get() == null) {
                    this.LLILLJJLI.await();
                }
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZJ("AuthKeyCacheHelper InterruptedException");
                C786410Ut5.u3().interrupt();
            }
            ((ReentrantLock) this.LL).unlock();
            if (this.LLILZ.get() != null) {
                if (this.LLILZ.get() instanceof Exception) {
                    throw this.LLILZ.get();
                }
                throw new Exception(this.LLILZ.get().getMessage(), this.LLILZ.get());
            }
            if (this.LLILLL.get() == null) {
                throw new Exception("null result");
            }
            UploadAuthKeyConfig uploadAuthKeyConfig = this.LLILLL.get();
            C1C7U.LIZIZ("TTUploaderService@e032.refreshUploadAuthKeyConfig$1");
            return uploadAuthKeyConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LL).unlock();
            throw th;
        }
    }

    public CallableC1488820oqW(Map map) {
        this.LLILZIL = map;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LL = reentrantLock;
        this.LLILLJJLI = reentrantLock.newCondition();
        this.LLILLL = new AtomicReference<>(null);
        this.LLILZ = new AtomicReference<>(null);
    }
}
