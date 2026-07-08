package X;

import Y.ARunnableS13S0200100_9;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0MrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581460MrI {
    public static volatile C581460MrI LJFF;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public Aweme LIZIZ;
    public int LIZJ;
    public Runnable LIZLLL;
    public ARunnableS13S0200100_9 LJ;

    public static C581460MrI LIZ() {
        if (LJFF == null) {
            synchronized (C581460MrI.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C581460MrI();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }
}
