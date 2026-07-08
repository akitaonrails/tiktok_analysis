package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0j6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1267930j6F {
    public final WeakReference<C1266350j3h> LIZ;

    public final void LIZ() {
        InterfaceC1268640j7O interfaceC1268640j7O;
        C1266350j3h c1266350j3h = this.LIZ.get();
        if (c1266350j3h == null || (interfaceC1268640j7O = c1266350j3h.LLJLILLLLZIIL) == null || !(interfaceC1268640j7O instanceof C1272090jCx)) {
            return;
        }
        C1272090jCx c1272090jCx = (C1272090jCx) interfaceC1268640j7O;
        C1266350j3h c1266350j3h2 = this.LIZ.get();
        C1269160j8E c1269160j8E = c1266350j3h2 != null ? c1266350j3h2.LLILZLL : null;
        boolean z = false;
        if (c1269160j8E != null) {
            PushBase pushBase = c1269160j8E.LIZ.mPushBase;
            if (pushBase.LIZIZ == -1) {
                pushBase.LIZIZ = 1;
            }
            int i = pushBase.LIZIZ;
            boolean zLJJIL = pushBase.LJJIL();
            synchronized (c1269160j8E.LIZ.mPushBase.LJIIL) {
                try {
                    PushBase.Roi roiLIZ = c1269160j8E.LIZ.mPushBase.LJIIL.LIZ(i, zLJJIL);
                    if (roiLIZ != null) {
                        int i2 = roiLIZ.roiOn;
                        if (i2 == 1) {
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c1272090jCx.LLJL = z;
    }

    public C1267930j6F(C1266350j3h c1266350j3h) {
        this.LIZ = new WeakReference<>(c1266350j3h);
    }
}
