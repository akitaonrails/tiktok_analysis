package Y;

import X.C1295960jpS;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS1S1201000_6 implements Runnable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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
        View view;
        if (((Number) ((Function0) this.l1).invoke()).intValue() != this.i3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.s0);
            sbLIZ.append(" post-play epoch=");
            sbLIZ.append(this.i3);
            sbLIZ.append(" stale (current=");
            sbLIZ.append(((Number) ((Function0) this.l1).invoke()).intValue());
            sbLIZ.append(") — SKIPPING playAnimation");
            C20441214yg.LJIIL("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.s0);
        sbLIZ2.append(" post-play check — isShown=");
        sbLIZ2.append(((C1295960jpS) this.l2).isShown());
        sbLIZ2.append(" isAttached=");
        sbLIZ2.append(((C1295960jpS) this.l2).isAttachedToWindow());
        sbLIZ2.append(" visibility=");
        sbLIZ2.append(((C1295960jpS) this.l2).getVisibility());
        sbLIZ2.append(" parentVis=");
        Object parent = ((C1295960jpS) this.l2).getParent();
        Integer numValueOf = null;
        if ((parent instanceof View) && (view = (View) parent) != null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(" size=(");
        sbLIZ2.append(((C1295960jpS) this.l2).getWidth());
        sbLIZ2.append('x');
        sbLIZ2.append(((C1295960jpS) this.l2).getHeight());
        sbLIZ2.append(") hasComposition=");
        sbLIZ2.append(((C1295960jpS) this.l2).getComposition() != null);
        sbLIZ2.append(" → calling playAnimation()");
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ2));
        ((C1295960jpS) this.l2).playAnimation();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.s0);
        sbLIZ3.append(" playAnimation() returned — isAnimating=");
        sbLIZ3.append(((C1295960jpS) this.l2).isAnimating());
        sbLIZ3.append(" progress=");
        sbLIZ3.append(((C1295960jpS) this.l2).getProgress());
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static final void run$0(ARunnableS1S1201000_6 aRunnableS1S1201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("VisualSearchQRCodeScanAssem@571b.handleQRCodeScanResult$1");
        try {
            ((VisualSearchQRCodeScanAssem) aRunnableS1S1201000_6.l1).dp(aRunnableS1S1201000_6.s0, (Rect) aRunnableS1S1201000_6.l2, aRunnableS1S1201000_6.i3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VisualSearchQRCodeScanAssem@571b.handleQRCodeScanResult$1");
    }

    public static final void run$1(ARunnableS1S1201000_6 aRunnableS1S1201000_6) {
        boolean zLIZ;
        C1C7U.LIZ("QuickPairWaitingAnimComponent@a696.probeAndLoadLottie$onComposition$1$2");
        try {
            aRunnableS1S1201000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("QuickPairWaitingAnimComponent@a696.probeAndLoadLottie$onComposition$1$2");
    }

    public ARunnableS1S1201000_6(Object obj, String str, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.i3 = i;
    }
}
