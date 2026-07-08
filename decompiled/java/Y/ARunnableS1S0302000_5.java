package Y;

import X.C1C7U;
import X.C390810FTz;
import X.C817403Hg;
import android.content.res.Resources;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS1S0302000_5 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS1S0302000_5 aRunnableS1S0302000_5) {
        boolean zLIZ;
        C1C7U.LIZ("FunctionListTextViewUtil@a0d9.fitTopMarginAndTextSize$1$1$1$reduceTextSizeUntilFit$1");
        try {
            LIZ$0((Function0) aRunnableS1S0302000_5.l0, aRunnableS1S0302000_5.i3, (C817403Hg) aRunnableS1S0302000_5.l1, aRunnableS1S0302000_5.i4, (TuxTextView) aRunnableS1S0302000_5.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FunctionListTextViewUtil@a0d9.fitTopMarginAndTextSize$1$1$1$reduceTextSizeUntilFit$1");
    }

    public static final void run$1(ARunnableS1S0302000_5 aRunnableS1S0302000_5) {
        boolean zLIZ;
        C1C7U.LIZ("FunctionListTextViewUtil@a0d9.fitTopMarginAndTextSize$1$1$1");
        try {
            LIZ$0((Function0) aRunnableS1S0302000_5.l0, aRunnableS1S0302000_5.i3, (C817403Hg) aRunnableS1S0302000_5.l1, aRunnableS1S0302000_5.i4, (TuxTextView) aRunnableS1S0302000_5.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FunctionListTextViewUtil@a0d9.fitTopMarginAndTextSize$1$1$1");
    }

    public static final void LIZ$0(Function0<Integer> function0, int i, C817403Hg c817403Hg, int i2, TuxTextView tuxTextView) {
        if (function0.invoke().intValue() > C390810FTz.LIZ(i)) {
            float f = c817403Hg.element;
            float f2 = i2;
            if (f > f2) {
                float f3 = f - ((int) ((1.0f * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f));
                c817403Hg.element = f3;
                if (f3 < f2) {
                    c817403Hg.element = f2;
                }
                tuxTextView.setTextSize(0, c817403Hg.element);
                HandlerHook.viewPost(tuxTextView, new ARunnableS1S0302000_5(function0, i, c817403Hg, i2, tuxTextView, 0));
            }
        }
    }

    public ARunnableS1S0302000_5(Object obj, int i, Object obj2, int i2, Object obj3, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i3 = i;
        this.l1 = obj2;
        this.i4 = i2;
        this.l2 = obj3;
    }
}
