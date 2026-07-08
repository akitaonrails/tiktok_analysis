package X;

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.wallet.zzh;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Wpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC835360Wpq implements InterfaceC834580Woa, Runnable {
    public static final zzh LLILZ = new zzh(Looper.getMainLooper());
    public static final SparseArray LLILZIL = new SparseArray(2);
    public static final AtomicInteger LLILZLL = new AtomicInteger();
    public int LL;
    public FragmentC835340Wpo LLILLJJLI;
    public AbstractC835450Wpz LLILLL;

    public final void LIZIZ() {
        if (this.LLILLL == null || this.LLILLJJLI == null) {
            return;
        }
        LLILZIL.delete(this.LL);
        LLILZ.removeCallbacks(this);
        FragmentC835340Wpo fragmentC835340Wpo = this.LLILLJJLI;
        if (fragmentC835340Wpo != null) {
            fragmentC835340Wpo.LIZ(this.LLILLL);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzc@25a.run");
        try {
            LLILZIL.delete(this.LL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzc@25a.run");
    }

    @Override // X.InterfaceC834580Woa
    public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
        this.LLILLL = abstractC835450Wpz;
        LIZIZ();
    }
}
