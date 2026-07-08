package Y;

import X.C1305710k5B;
import X.C1698860uJI;
import X.C1699310uK1;
import X.C1C7U;
import X.C2183341Ace;
import X.C2187451AjH;
import X.C2188811AlT;
import X.InterfaceC1279730jPH;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.b0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS2S0310100_20 implements Runnable {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.j4;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Push close task cost: ");
        sbLIZ.append(jCurrentTimeMillis);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        ((int[]) this.l0)[0] = ((b0) this.l2).close(this.z3, (Cert) this.l1);
        ((b0) this.l2).mIsCameraPendingClose = false;
        if (this.z3) {
            ((b0) this.l2).mCameraClientCondition.open();
        }
        C1305710k5B.LIZ(System.currentTimeMillis() - this.j4, "te_record_camera_close_cost");
    }

    public static final void run$0(ARunnableS2S0310100_20 aRunnableS2S0310100_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.close$1");
        try {
            aRunnableS2S0310100_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.close$1");
    }

    public static final void run$1(ARunnableS2S0310100_20 aRunnableS2S0310100_20) {
        C1698860uJI c1698860uJI = (C1698860uJI) aRunnableS2S0310100_20.l0;
        boolean z = aRunnableS2S0310100_20.z3;
        ExecutorService executorService = (ExecutorService) aRunnableS2S0310100_20.l1;
        long j = aRunnableS2S0310100_20.j4;
        InterfaceC1279730jPH interfaceC1279730jPH = (InterfaceC1279730jPH) aRunnableS2S0310100_20.l2;
        c1698860uJI.getClass();
        C1C7U.LIZ("TTKLivePlayer2@97f4.setSurfaceTexture$1L");
        c1698860uJI.LJJLIIIIJ("_setSurfaceTextureForLive");
        if (z && executorService != null && !executorService.isShutdown()) {
            try {
                executorService.submit(new ACallableS425S0100000_20(c1698860uJI, 13)).get(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                if (interfaceC1279730jPH != null) {
                    ((C1699310uK1) interfaceC1279730jPH).LIZ("InterruptedException");
                }
            } catch (ExecutionException e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (interfaceC1279730jPH != null) {
                    ((C1699310uK1) interfaceC1279730jPH).LIZ("ExecutionException");
                }
            } catch (TimeoutException e3) {
                TryCatchGuardChecker.doCheck(e3);
                if (interfaceC1279730jPH != null) {
                    ((C1699310uK1) interfaceC1279730jPH).LIZ("TimeoutException");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (interfaceC1279730jPH != null) {
                    ((C1699310uK1) interfaceC1279730jPH).LIZ("Exception");
                }
            }
        } else {
            c1698860uJI.LLILZ.LLLLLLLLLL(null);
        }
        C1C7U.LIZIZ("TTKLivePlayer2@97f4.setSurfaceTexture$1L");
    }

    public ARunnableS2S0310100_20(Object obj, long j, Object obj2, boolean z, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.j4 = j;
        this.l0 = obj2;
        this.z3 = z;
        this.l1 = obj3;
    }
}
