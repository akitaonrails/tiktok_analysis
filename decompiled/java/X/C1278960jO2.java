package X;

import Y.ARunnableS0S3201200_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.utils.TimeUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1278960jO2 implements InterfaceC1279060jOC {
    public WeakReference<C1278740jNg> LIZ;

    @Override // X.InterfaceC1279060jOC
    public final /* synthetic */ int getType() {
        return 0;
    }

    public C1278960jO2(C1278740jNg c1278740jNg) {
        this.LIZ = new WeakReference<>(c1278740jNg);
    }

    @Override // X.InterfaceC1279060jOC
    public final void LIZ(int i, String str, String str2, Throwable th) {
        LIZIZ(i, str, null, str2, th);
    }

    @Override // X.InterfaceC1279060jOC
    public final void LIZIZ(int i, String str, String str2, String str3, Throwable th) {
        C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            ARunnableS0S3201200_20 aRunnableS0S3201200_20 = new ARunnableS0S3201200_20(i, System.currentTimeMillis(), TimeUtils.nativeNanoTime() / 1000000, c1278740jNg, str3, str, str2, th, 0);
            try {
                if (!C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, aRunnableS0S3201200_20)) {
                    aRunnableS0S3201200_20.run();
                }
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
    }

    @Override // X.InterfaceC1279060jOC
    public final void LIZJ(int i, String str, String str2, String str3, Throwable th) {
        C1278740jNg c1278740jNg = this.LIZ.get();
        if (c1278740jNg != null) {
            ARunnableS0S3201200_20 aRunnableS0S3201200_20 = new ARunnableS0S3201200_20(i, System.currentTimeMillis(), TimeUtils.nativeNanoTime() / 1000000, c1278740jNg, str3, str, str2, th, 1);
            try {
                if (!C786410Ut5.LJJZZIII(c1278740jNg.LLILZIL, aRunnableS0S3201200_20)) {
                    aRunnableS0S3201200_20.run();
                }
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
    }
}
