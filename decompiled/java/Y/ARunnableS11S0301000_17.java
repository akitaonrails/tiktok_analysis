package Y;

import X.C1086190eN7;
import X.C1098290egd;
import X.C1115570f8V;
import X.C1C7U;
import X.C2179971ATj;
import X.InterfaceC1631630sYr;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.viewmodule.NewTopRightBannerWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AwS261S0300000_17;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS11S0301000_17 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((View) this.l0).getParent() != null) {
            C1086190eN7 c1086190eN7 = (C1086190eN7) this.l1;
            View view = (View) this.l0;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.l2;
            int i = this.i3;
            c1086190eN7.getClass();
            if (!view.isAttachedToWindow()) {
                C1086190eN7.LIZ(view, layoutParams, true);
                return;
            }
            if (view.getWidth() <= 0) {
                C1086190eN7.LIZ(view, layoutParams, true);
                return;
            }
            layoutParams.height = -2;
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), 0);
            int measuredHeight = view.getMeasuredHeight();
            layoutParams.height = i;
            if (measuredHeight <= i) {
                C1086190eN7.LIZ(view, layoutParams, true);
                return;
            }
            AwS261S0300000_17 awS261S0300000_17 = new AwS261S0300000_17(c1086190eN7, view, layoutParams, 17);
            ValueAnimator valueAnimator = c1086190eN7.LIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, measuredHeight);
            valueAnimatorOfInt.setDuration(250L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS146S0300000_2(view, valueAnimatorOfInt, layoutParams, 2));
            valueAnimatorOfInt.addListener(new ALAdapterS13S0100000_17(awS261S0300000_17, 86));
            c1086190eN7.LIZ = valueAnimatorOfInt;
            valueAnimatorOfInt.start();
        }
    }

    public static final void run$0(ARunnableS11S0301000_17 aRunnableS11S0301000_17) {
        boolean zLIZ;
        C1C7U.LIZ("NewTopRightBannerWidget@7df5.requestExpand$1");
        try {
            ((NewTopRightBannerWidget) aRunnableS11S0301000_17.l0).S1(aRunnableS11S0301000_17.i3, (C1098290egd) aRunnableS11S0301000_17.l1, (InterfaceC1631630sYr) aRunnableS11S0301000_17.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewTopRightBannerWidget@7df5.requestExpand$1");
    }

    public static final void run$1(ARunnableS11S0301000_17 aRunnableS11S0301000_17) {
        try {
            C1115570f8V c1115570f8V = (C1115570f8V) aRunnableS11S0301000_17.l0;
            c1115570f8V.LIZ(c1115570f8V.LJIIIIZZ, (View) aRunnableS11S0301000_17.l1, aRunnableS11S0301000_17.i3, (EmoteModel) aRunnableS11S0301000_17.l2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$2(ARunnableS11S0301000_17 aRunnableS11S0301000_17) {
        boolean zLIZ;
        C1C7U.LIZ("CommentAudioTextExpandHelper@5843.updateWithExpandAnimation$1");
        try {
            aRunnableS11S0301000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentAudioTextExpandHelper@5843.updateWithExpandAnimation$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS11S0301000_17(Object obj, NewTopRightBannerWidget newTopRightBannerWidget, int i, C1098290egd c1098290egd, InterfaceC1631630sYr<? super C1098290egd, ? super Integer, ? super String, ? super Boolean, Unit> interfaceC1631630sYr) {
        this.$t = interfaceC1631630sYr;
        this.l0 = obj;
        this.i3 = newTopRightBannerWidget;
        this.l1 = i;
        this.l2 = c1098290egd;
    }
}
