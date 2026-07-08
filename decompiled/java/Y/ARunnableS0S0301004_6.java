package Y;

import X.C0GZ3;
import X.C1C7U;
import X.C432070Gwv;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS0S0301004_6 implements Runnable {
    public final int $t;
    public float f4;
    public float f5;
    public float f6;
    public float f7;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S0301004_6 aRunnableS0S0301004_6) {
        boolean zLIZ;
        C1C7U.LIZ("GradientViewUtils@2c32.applyGradientIcon$1");
        try {
            C0GZ3.LIZIZ((ImageView) aRunnableS0S0301004_6.l0, (int[]) aRunnableS0S0301004_6.l1, (float[]) aRunnableS0S0301004_6.l2, aRunnableS0S0301004_6.f4, aRunnableS0S0301004_6.f5, aRunnableS0S0301004_6.f6, aRunnableS0S0301004_6.f7, aRunnableS0S0301004_6.i3 + 1, 0, 0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GradientViewUtils@2c32.applyGradientIcon$1");
    }

    public static final void run$1(ARunnableS0S0301004_6 aRunnableS0S0301004_6) {
        boolean zLIZ;
        C1C7U.LIZ("AiChatUIUtilsKt@35c5.applyGradientIcon$1");
        try {
            C432070Gwv.LIZ((TuxIconView) aRunnableS0S0301004_6.l0, (int[]) aRunnableS0S0301004_6.l1, (float[]) aRunnableS0S0301004_6.l2, aRunnableS0S0301004_6.f4, aRunnableS0S0301004_6.f5, aRunnableS0S0301004_6.f6, aRunnableS0S0301004_6.f7, aRunnableS0S0301004_6.i3 + 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AiChatUIUtilsKt@35c5.applyGradientIcon$1");
    }

    public ARunnableS0S0301004_6(Object obj, Object obj2, Object obj3, float f, float f2, float f3, float f4, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.f4 = f;
        this.f5 = f2;
        this.f6 = f3;
        this.f7 = f4;
        this.i3 = i;
    }
}
