package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class RunnableC1212740hfE implements Runnable {
    public final /* synthetic */ C21459118yT LL;

    public final void LIZ() {
        C21459118yT c21459118yT;
        C21459118yT c21459118yT2 = this.LL;
        C444890HcV c444890HcV = c21459118yT2.LL;
        if (c444890HcV == null) {
            return;
        }
        c21459118yT2.LLIZLLLIL = c444890HcV.measureText(c21459118yT2.LLILLL);
        if (!C300350Bpx.LIZIZ()) {
            StringBuilder sb = new StringBuilder(this.LL.LLILLL);
            while (true) {
                c21459118yT = this.LL;
                if (c21459118yT.LLIZLLLIL >= c21459118yT.LLJILJIL) {
                    break;
                }
                sb.append(c21459118yT.LLILLL);
                C21459118yT c21459118yT3 = this.LL;
                c21459118yT3.LLIZLLLIL = c21459118yT3.LL.measureText(sb.toString());
            }
            c21459118yT.LLILLL = sb.toString();
        }
        C21459118yT c21459118yT4 = this.LL;
        c21459118yT4.LLIZ = 0.0f;
        c21459118yT4.LLJI = 0L;
        try {
            HandlerHook.viewPost(this.LL, new Runnable() { // from class: X.0hfD
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MarqueeView@f2bc.setText$1$1");
                    try {
                        this.LL.LL.requestLayout();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MarqueeView@f2bc.setText$1$1");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MarqueeView@f2bc.setText$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MarqueeView@f2bc.setText$1");
    }

    public RunnableC1212740hfE(C21459118yT c21459118yT) {
        this.LL = c21459118yT;
    }
}
