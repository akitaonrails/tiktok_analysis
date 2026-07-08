package Y;

import X.C1041180dCW;
import X.C1C7U;
import X.C259800zU;
import X.InterfaceC1036190d4T;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS2S0111000_16 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

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

    public static final void run$0(ARunnableS2S0111000_16 aRunnableS2S0111000_16) {
        VerticalViewPager verticalViewPager = (VerticalViewPager) aRunnableS2S0111000_16.l0;
        int i = aRunnableS2S0111000_16.i2;
        boolean z = aRunnableS2S0111000_16.z1;
        int[] iArr = VerticalViewPager.a;
        verticalViewPager.getClass();
        C1C7U.LIZ("VerticalViewPager@894f.scrollToItem$1L");
        verticalViewPager.LJIJ(i, z);
        C1C7U.LIZIZ("VerticalViewPager@894f.scrollToItem$1L");
    }

    public static final void run$1(ARunnableS2S0111000_16 aRunnableS2S0111000_16) {
        VerticalViewPager verticalViewPager = (VerticalViewPager) aRunnableS2S0111000_16.l0;
        int i = aRunnableS2S0111000_16.i2;
        boolean z = aRunnableS2S0111000_16.z1;
        int[] iArr = VerticalViewPager.a;
        verticalViewPager.getClass();
        C1C7U.LIZ("VerticalViewPager@894f.scrollToItem$2L");
        verticalViewPager.LJIJ(i, z);
        C1C7U.LIZIZ("VerticalViewPager@894f.scrollToItem$2L");
    }

    public static final void run$2(ARunnableS2S0111000_16 aRunnableS2S0111000_16) {
        boolean zLIZ;
        InterfaceC1036190d4T interfaceC1036190d4T;
        C1C7U.LIZ("AdAutofillKeyboardManager@6061.handleAutofillKeyboardListener$2");
        try {
            if (C1041180dCW.LJ && (interfaceC1036190d4T = (InterfaceC1036190d4T) ((C259800zU) aRunnableS2S0111000_16.l0).element) != null) {
                interfaceC1036190d4T.LJIIJJI(aRunnableS2S0111000_16.i2, aRunnableS2S0111000_16.z1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdAutofillKeyboardManager@6061.handleAutofillKeyboardListener$2");
    }

    public ARunnableS2S0111000_16(Object obj, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.z1 = z;
    }
}
