package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMPackageModel;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1BkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2213721BkY {
    public String LIZ = "";
    public volatile AtomicLong LIZIZ = new AtomicLong(0);
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public int LIZLLL = -1;
    public String LJ;

    public abstract EnumC2213841Bkk LIZIZ();

    public abstract void LIZLLL(long j);

    public final long LIZJ() {
        return this.LIZIZ.get();
    }

    public final Object LJ(Function2<? super Long, ? super Integer, ? extends Object> function2) {
        while (true) {
            long j = this.LIZIZ.get();
            if (j == 0) {
                return null;
            }
            this.LIZJ.incrementAndGet();
            if (this.LIZIZ.get() != j) {
                this.LIZJ.decrementAndGet();
            } else {
                try {
                    Object objInvoke = function2.invoke(Long.valueOf(j), Integer.valueOf(this.LIZLLL));
                    this.LIZJ.decrementAndGet();
                    return objInvoke;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZJ.decrementAndGet();
                    throw th;
                }
            }
        }
    }

    public boolean LIZ(TTMPackageModel tTMPackageModel, C2213881Bko c2213881Bko) {
        String packageKey = tTMPackageModel.getPackageKey();
        if (packageKey != null && packageKey.length() != 0) {
            if (tTMPackageModel.getContentNativeAddress() == 0) {
                c2213881Bko.LIZ = EnumC2213771Bkd.TTMScenePackageContentNativeSaveError;
                return false;
            }
            this.LJ = tTMPackageModel.getContentMD5();
            this.LIZLLL = tTMPackageModel.getContentType();
            String packageKey2 = tTMPackageModel.getPackageKey();
            if (packageKey2 == null) {
                packageKey2 = "";
            }
            this.LIZ = packageKey2;
            this.LIZIZ.compareAndSet(0L, tTMPackageModel.getContentNativeAddress());
            if (tTMPackageModel.getContentNativeAddress() == 0) {
                return false;
            }
            return true;
        }
        c2213881Bko.LIZ = EnumC2213771Bkd.TTMScenePackageKeyIsNullOrEmpty;
        return false;
    }
}
