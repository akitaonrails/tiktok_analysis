package Y;

import X.C1C7U;
import X.C21271218Mc;
import X.C786410Ut5;
import android.animation.Animator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.view.coupon.FlashSaleModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS20S0200100_32 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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
        if (((View) this.l0).isAttachedToWindow()) {
            View view = (View) this.l0;
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + ((View) this.l0).getRight()) / 2, (((View) this.l0).getTop() + ((View) this.l0).getBottom()) / 2, Math.max(((View) this.l0).getWidth(), ((View) this.l0).getHeight()), 0.0f);
            animatorCreateCircularReveal.setDuration(this.j2);
            animatorCreateCircularReveal.start();
            animatorCreateCircularReveal.addListener(new ALAdapterS26S0100000_32((Function0) this.l1, 1));
        }
    }

    public final void LIZ$1() {
        C21271218Mc c21271218Mc = (C21271218Mc) this.l0;
        FlashSaleModel flashSaleModel = (FlashSaleModel) this.l1;
        long j = this.j2;
        BPEAHandler bPEAHandler = c21271218Mc.LJ;
        ARunnableS132S0100000_32 aRunnableS132S0100000_32 = c21271218Mc.LJIIIZ;
        if (aRunnableS132S0100000_32 == null) {
            aRunnableS132S0100000_32 = null;
        }
        bPEAHandler.removeCallbacks(aRunnableS132S0100000_32);
        c21271218Mc.LJI = j;
        try {
            String str = flashSaleModel.countdown;
            long j2 = (str != null ? CastLongProtector.parseLong(str) : 0L) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            long j3 = j2 >= 0 ? j2 : 0L;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c21271218Mc.LIZIZ = jElapsedRealtime;
            c21271218Mc.LIZJ = jElapsedRealtime;
            c21271218Mc.LIZLLL = jElapsedRealtime + j3;
            BPEAHandler bPEAHandler2 = c21271218Mc.LJ;
            ARunnableS132S0100000_32 aRunnableS132S0100000_322 = c21271218Mc.LJIIIZ;
            C786410Ut5.LJJZZIII(bPEAHandler2, aRunnableS132S0100000_322 != null ? aRunnableS132S0100000_322 : null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void run$0(ARunnableS20S0200100_32 aRunnableS20S0200100_32) {
        boolean zLIZ;
        C1C7U.LIZ("Balloon@9a33.dismiss$$inlined$circularUnRevealed$1");
        try {
            aRunnableS20S0200100_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Balloon@9a33.dismiss$$inlined$circularUnRevealed$1");
    }

    public static final void run$1(ARunnableS20S0200100_32 aRunnableS20S0200100_32) {
        boolean zLIZ;
        C1C7U.LIZ("FlashSaleCountDownNewService@3fd0.startCountDownInMainThread$1");
        try {
            aRunnableS20S0200100_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FlashSaleCountDownNewService@3fd0.startCountDownInMainThread$1");
    }

    public ARunnableS20S0200100_32(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j2 = j;
        this.l1 = obj2;
    }
}
