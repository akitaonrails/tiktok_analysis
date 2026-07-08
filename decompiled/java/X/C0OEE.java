package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0OEE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OEE {
    public static boolean LIZJ;
    public static C1445970njP LIZLLL;
    public static final C0OEE LIZ = new C0OEE();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final C0N9D LJ = C0N9D.LL;

    @C14EU(sticky = true)
    public final void onPublishStatus(C1445970njP c1445970njP) {
        if (c1445970njP != null && c1445970njP.LIZ == 10) {
            LIZLLL = c1445970njP;
        }
    }
}
