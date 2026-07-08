package X;

import Y.ARunnableS71S0200000_2;
import android.os.Looper;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1592306Lh {
    public static final C1592306Lh LIZ = new C1592306Lh();

    public static void LIZ(C1592306Lh c1592306Lh, final C197039127h c197039127h, final Function0 function0) {
        final boolean z = true;
        final long j = 2000;
        c1592306Lh.getClass();
        try {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                c197039127h.setEnabled(true);
                c197039127h.setClickable(true);
                HandlerHook.viewPostDelay(c197039127h, new ARunnableS71S0200000_2(c197039127h, function0, 22), 2000L);
            } else {
                try {
                    ExecutorC1592406Li.LLILLJJLI.execute(new Runnable() { // from class: X.06Lg
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("EcProductAddViewUtils@6d00.viewChangeAfterClick$$inlined$runOnMainThreadImmediate$1");
                            try {
                                c197039127h.setEnabled(z);
                                c197039127h.setClickable(z);
                                if (z) {
                                    C197039127h c197039127h2 = c197039127h;
                                    HandlerHook.viewPostDelay(c197039127h2, new ARunnableS71S0200000_2(c197039127h2, function0, 22), j);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("EcProductAddViewUtils@6d00.viewChangeAfterClick$$inlined$runOnMainThreadImmediate$1");
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
