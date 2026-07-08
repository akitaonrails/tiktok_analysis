package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112120f2w {
    public final Handler LIZ;
    public final Handler LIZIZ;
    public final Looper LIZJ;
    public final Looper LIZLLL;

    public final void LIZIZ(Runnable runnable) {
        if (!Intrinsics.LJFF(Looper.myLooper(), this.LIZLLL)) {
            C786410Ut5.LJJZZIII(this.LIZIZ, runnable);
        } else {
            runnable.run();
        }
    }

    public final void LIZJ(Runnable runnable) {
        if (!Intrinsics.LJFF(Looper.myLooper(), this.LIZJ)) {
            C786410Ut5.LJJZZIII(this.LIZ, runnable);
        } else {
            runnable.run();
        }
    }

    public C1112120f2w(BPEAHandler bPEAHandler, BPEAHandler bPEAHandler2) {
        this.LIZ = bPEAHandler;
        this.LIZIZ = bPEAHandler2;
        this.LIZJ = bPEAHandler.getLooper();
        this.LIZLLL = bPEAHandler2.getLooper();
    }

    public final void LIZ(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, this.LIZIZ, runnable);
    }
}
