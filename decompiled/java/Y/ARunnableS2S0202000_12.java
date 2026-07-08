package Y;

import X.C1273890jFr;
import X.C1C7U;
import X.C772530USd;
import X.InterfaceC774920UaY;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS2S0202000_12 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
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
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((RecyclerView) this.l0).findViewHolderForAdapterPosition(this.i2);
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            ((RecyclerView) this.l0).smoothScrollToPosition(this.i2);
            RecyclerView recyclerView = (RecyclerView) this.l0;
            HandlerHook.viewPost(recyclerView, new ARunnableS2S0202000_12(this.i2, this.i3, recyclerView, (PickYourPlanPageFragment) this.l1, 1));
            return;
        }
        Rect rect = new Rect();
        viewHolderFindViewHolderForAdapterPosition.itemView.getDrawingRect(rect);
        ((RecyclerView) this.l0).offsetDescendantRectToMyCoords(viewHolderFindViewHolderForAdapterPosition.itemView, rect);
        int paddingTop = ((RecyclerView) this.l0).getPaddingTop();
        int height = ((RecyclerView) this.l0).getHeight() - ((RecyclerView) this.l0).getPaddingBottom();
        int i = rect.bottom;
        if (i > height) {
            ((RecyclerView) this.l0).smoothScrollBy(0, i - height);
            return;
        }
        int i2 = rect.top;
        if (i2 < paddingTop) {
            ((RecyclerView) this.l0).smoothScrollBy(0, i2 - paddingTop);
        }
    }

    public static final void run$0(ARunnableS2S0202000_12 aRunnableS2S0202000_12) {
        boolean zLIZ;
        String message;
        C1C7U.LIZ("LiveStream@b84d.errorListener$1$3");
        try {
            C1273890jFr c1273890jFr = (C1273890jFr) aRunnableS2S0202000_12.l0;
            if (c1273890jFr.LJIILJJIL == -1) {
                c1273890jFr.LJIILJJIL = aRunnableS2S0202000_12.i2;
            }
            Exception exc = (Exception) aRunnableS2S0202000_12.l1;
            String str = "";
            if (exc == null) {
                message = "";
            } else {
                message = exc.getMessage();
            }
            C1273890jFr c1273890jFr2 = (C1273890jFr) aRunnableS2S0202000_12.l0;
            if (c1273890jFr2.LJIIJ != null) {
                int i = c1273890jFr2.LJIILJJIL;
                int i2 = aRunnableS2S0202000_12.i3;
                if (message != null) {
                    str = message;
                }
                c1273890jFr2.LJIJ.removeCallbacksAndMessages(null);
                InterfaceC774920UaY interfaceC774920UaY = c1273890jFr2.LJIIJ;
                if (interfaceC774920UaY != null) {
                    interfaceC774920UaY.ku(i, i2, str);
                }
                C772530USd.LIZ(Integer.MAX_VALUE);
            }
            ((C1273890jFr) aRunnableS2S0202000_12.l0).LJIILJJIL = -1;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@b84d.errorListener$1$3");
    }

    public static final void run$1(ARunnableS2S0202000_12 aRunnableS2S0202000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PickYourPlanPageFragment@c526.scrollItemFullyIntoView$1$1");
        try {
            PickYourPlanPageFragment pickYourPlanPageFragment = (PickYourPlanPageFragment) aRunnableS2S0202000_12.l0;
            RecyclerView recyclerView = (RecyclerView) aRunnableS2S0202000_12.l1;
            int i = aRunnableS2S0202000_12.i2;
            int i2 = aRunnableS2S0202000_12.i3 + 1;
            pickYourPlanPageFragment.getClass();
            if (i2 < 5) {
                HandlerHook.viewPost(recyclerView, new ARunnableS2S0202000_12(i, i2, recyclerView, pickYourPlanPageFragment, 2));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PickYourPlanPageFragment@c526.scrollItemFullyIntoView$1$1");
    }

    public static final void run$2(ARunnableS2S0202000_12 aRunnableS2S0202000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PickYourPlanPageFragment@c526.scrollItemFullyIntoView$1");
        try {
            aRunnableS2S0202000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PickYourPlanPageFragment@c526.scrollItemFullyIntoView$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS2S0202000_12(int r2, int r3, androidx.recyclerview.widget.RecyclerView r4, com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 1 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r4
            r0.i2 = r2
            r0.l1 = r5
            r0.i3 = r3
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.i2 = r2
            r0.i3 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S0202000_12.<init>(int, int, androidx.recyclerview.widget.RecyclerView, com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.PickYourPlanPageFragment, int):void");
    }

    public ARunnableS2S0202000_12(C1273890jFr c1273890jFr, int i, Exception exc, int i2, int i3) {
        this.$t = i3;
        this.l0 = c1273890jFr;
        this.i2 = i;
        this.l1 = exc;
        this.i3 = i2;
    }
}
