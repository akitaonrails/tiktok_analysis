package X;

import Y.ARunnableS104S0100000_4;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.image.experiment.EcomImgFrameData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS208S0000000_20;
import kotlin.jvm.internal.AwS10S1100100_4;
import kotlin.jvm.internal.AwS169S1100000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326240kcI {
    public static final C01GW<C1326240kcI> LJIIIIZZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(55));
    public final Handler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final C1326300kcO LIZIZ = new C1326300kcO();
    public final C1326300kcO LIZJ = new C1326300kcO();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final int LJFF;
    public final long LJI;
    public final ARunnableS104S0100000_4 LJII;

    public C1326240kcI() {
        EcomImgFrameData ecomImgFrameData = C1326290kcN.LIZ;
        this.LJFF = ecomImgFrameData.maxTaskPerFrame;
        this.LJI = ecomImgFrameData.maxFrameMsBudget;
        this.LJII = new ARunnableS104S0100000_4(this, 70);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, X.0CFS] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.0CFS] */
    public final void LIZIZ() {
        C1326250kcJ.LIZ(new AwS169S1100000_20(this, 2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C259800zU c259800zU = new C259800zU();
        ?? LIZ = LIZ(this.LIZJ, jElapsedRealtime, 0);
        c259800zU.element = LIZ;
        if (!LIZ.LIZIZ) {
            c259800zU.element = LIZ(this.LIZIZ, jElapsedRealtime, LIZ.LIZ);
        }
        if (((C0CFS) c259800zU.element).LIZ == 0) {
            this.LIZLLL.set(false);
            if (this.LIZIZ.LIZ() && this.LIZJ.LIZ()) {
                return;
            }
            LIZLLL();
            return;
        }
        C1326250kcJ.LIZ(new C0CFR(c259800zU, jElapsedRealtime));
        this.LIZLLL.set(false);
        if (!((C0CFS) c259800zU.element).LIZIZ && this.LIZIZ.LIZ() && this.LIZJ.LIZ()) {
            return;
        }
        LIZLLL();
    }

    public final void LIZLLL() {
        if (this.LIZLLL.compareAndSet(false, true)) {
            Message messageObtain = Message.obtain(this.LIZ, this.LJII);
            messageObtain.setAsynchronous(true);
            C786410Ut5.LJLJJLL(this.LIZ, messageObtain);
        }
    }

    public final void LIZJ(String str, String str2) {
        EcomImgFrameData ecomImgFrameData = C1326290kcN.LIZ;
        if (ecomImgFrameData.renderWithUI == 1 && ecomImgFrameData.inlineFlushPoints.contains(str)) {
            if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C1326250kcJ.LIZ(AFwS208S0000000_20.get$arr$(56));
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C0CFS c0cfsLIZ = LIZ(this.LIZJ, jElapsedRealtime, 0);
            if (c0cfsLIZ.LIZ > 0) {
                C1326250kcJ.LIZ(new AwS10S1100100_4(str2, c0cfsLIZ, jElapsedRealtime, 0));
            }
            if (c0cfsLIZ.LIZIZ || !this.LIZIZ.LIZ() || !this.LIZJ.LIZ()) {
                LIZLLL();
            }
        }
    }

    public final C0CFS LIZ(C1326300kcO c1326300kcO, long j, int i) {
        while (SystemClock.elapsedRealtime() - j < this.LJI && i < this.LJFF) {
            C1326280kcM c1326280kcMPoll = c1326300kcO.LIZ.poll();
            if (c1326280kcMPoll == null) {
                return new C0CFS(i, false);
            }
            try {
                c1326280kcMPoll.LIZ.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            i++;
        }
        return new C0CFS(i, !c1326300kcO.LIZ());
    }
}
