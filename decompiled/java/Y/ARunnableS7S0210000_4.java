package Y;

import X.C0CN5;
import X.C1BCA;
import X.C1C7U;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC312610CNf;
import X.InterfaceC1006670cIr;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SheetOptions;
import com.ss.android.ugc.aweme.subscription.pgc.core.design.sheet.SubscriptionSheetFragment;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS7S0210000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
        Integer numValueOf;
        int iLIZIZ;
        View view2 = ((SubscriptionSheetFragment) this.l0).getView();
        if (view2 == null) {
            return;
        }
        Object parent = view2.getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(view);
        SubscriptionSheetFragment subscriptionSheetFragment = (SubscriptionSheetFragment) this.l0;
        SheetOptions sheetOptions = (SheetOptions) this.l1;
        int i = subscriptionSheetFragment.getResources().getDisplayMetrics().heightPixels;
        if (sheetOptions != null && (numValueOf = Integer.valueOf(sheetOptions.sheetStyle)) != null) {
            if (numValueOf.intValue() == 7) {
                iLIZIZ = C814420VxA.LIZIZ(i * 0.73f);
            } else if (numValueOf.intValue() == 6) {
                iLIZIZ = C814420VxA.LIZIZ(i * 0.6f);
            }
            if (iLIZIZ > 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = iLIZIZ;
                C786410Ut5.W5(view, layoutParams);
                bottomSheetBehaviorFrom.setPeekHeight(iLIZIZ);
                bottomSheetBehaviorFrom.setSkipCollapsed(true);
                bottomSheetBehaviorFrom.setState(3);
            }
        }
        bottomSheetBehaviorFrom.setDraggable(this.z2);
    }

    public static final void run$0(ARunnableS7S0210000_4 aRunnableS7S0210000_4) {
        boolean zLIZ;
        C1C7U.LIZ("SubscriptionSheetFragment@7c68.onStart$1");
        try {
            aRunnableS7S0210000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubscriptionSheetFragment@7c68.onStart$1");
    }

    public static final void run$1(ARunnableS7S0210000_4 aRunnableS7S0210000_4) {
        InterfaceC1006670cIr interfaceC1006670cIr = (InterfaceC1006670cIr) aRunnableS7S0210000_4.l0;
        boolean z = aRunnableS7S0210000_4.z2;
        Runnable runnable = (Runnable) aRunnableS7S0210000_4.l1;
        C1C7U.LIZ("StartupStateUtils@39b4.delayRunAfterFirstFeedCompletedInner$2L");
        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, interfaceC1006670cIr);
        if (z) {
            C0CN5.LJIIIIZZ(runnable);
        } else {
            runnable.run();
        }
        C1C7U.LIZIZ("StartupStateUtils@39b4.delayRunAfterFirstFeedCompletedInner$2L");
    }

    public ARunnableS7S0210000_4(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
