package X;

import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0j4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266650j4B implements InterfaceC1267340j5I {
    public final WeakReference<C1266350j3h> LIZ;
    public final PushBase LIZIZ;
    public int LIZJ;

    @Override // X.InterfaceC1267340j5I
    public final void LIZ() {
        this.LIZIZ.getClass();
    }

    public C1266650j4B(C1266350j3h c1266350j3h) {
        this.LIZ = new WeakReference<>(c1266350j3h);
        PushBase pushBase = c1266350j3h.LLILZLL.LIZ.mPushBase;
        this.LIZIZ = pushBase;
        this.LIZJ = pushBase.LJJ();
    }
}
