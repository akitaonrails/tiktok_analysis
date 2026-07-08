package Y;

import X.C0H1U;
import X.C12ES;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1C7U;
import X.C786410Ut5;
import X.C874103bH;
import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.Toast;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentViewHolder;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS7S1100000_1 implements Runnable {
    public final int $t;
    public Object l1;
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
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        TextPaint paint = ((SubPaymentViewHolder) this.l1).S5().getPaint();
        paint.setTextSize(((SubPaymentViewHolder) this.l1).S5().getTextSize());
        if (paint.measureText(this.s0) <= ((SubPaymentViewHolder) this.l1).S5().getWidth()) {
            C12ES.LJIILL(0, ((SubPaymentViewHolder) this.l1).S5());
            C0H1U.LIZIZ(((SubPaymentViewHolder) this.l1).R5());
        } else {
            C0H1U.LIZIZ(((SubPaymentViewHolder) this.l1).S5());
            C12ES.LJIILL(0, ((SubPaymentViewHolder) this.l1).R5());
            ((SubPaymentViewHolder) this.l1).R5().setText(this.s0);
        }
    }

    public final void LIZ$1() {
        TextPaint paint = ((C874103bH) this.l1).getTvExtraInfoRightFromXml().getPaint();
        paint.setTextSize(((C874103bH) this.l1).getTvExtraInfoRightFromXml().getTextSize());
        if (paint.measureText(this.s0) <= ((C874103bH) this.l1).getTvExtraInfoRightFromXml().getWidth()) {
            C12ES.LJIILL(0, ((C874103bH) this.l1).getTvExtraInfoRightFromXml());
            C0H1U.LIZIZ(((C874103bH) this.l1).getTvExtraInfoBelowFromXml());
        } else {
            C0H1U.LIZIZ(((C874103bH) this.l1).getTvExtraInfoRightFromXml());
            C12ES.LJIILL(0, ((C874103bH) this.l1).getTvExtraInfoBelowFromXml());
            ((C874103bH) this.l1).getTvExtraInfoBelowFromXml().setText(this.s0);
            ((C874103bH) this.l1).getTvExtraInfoBelowFromXml().setMaxLines(1);
        }
    }

    public static final void run$0(ARunnableS7S1100000_1 aRunnableS7S1100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("USAddonOrderCell@fbec.showToast$2");
        try {
            C1389880mGw c1389880mGw = new C1389880mGw(((USAddonOrderCell) aRunnableS7S1100000_1.l1).itemView);
            c1389880mGw.LJIIIZ(aRunnableS7S1100000_1.s0);
            c1389880mGw.LJI(R.attr.zi);
            c1389880mGw.LJIIJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("USAddonOrderCell@fbec.showToast$2");
    }

    public static final void run$1(ARunnableS7S1100000_1 aRunnableS7S1100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("PasskeyErrorHandler@84be.showErrorToast$1$1$1");
        try {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) aRunnableS7S1100000_1.l1);
            c1389890mGx.LJIIJ(aRunnableS7S1100000_1.s0);
            c1389890mGx.LIZLLL(3500L);
            c1389890mGx.LJIIJJI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PasskeyErrorHandler@84be.showErrorToast$1$1$1");
    }

    public static final void run$2(ARunnableS7S1100000_1 aRunnableS7S1100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.scrollToUncheckedProps$1$1$1");
        try {
            C1389880mGw c1389880mGw = new C1389880mGw((View) aRunnableS7S1100000_1.l1);
            c1389880mGw.LJIIIZ(((View) aRunnableS7S1100000_1.l1).getContext().getResources().getString(2131832582, aRunnableS7S1100000_1.s0));
            c1389880mGw.LJIIJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.scrollToUncheckedProps$1$1$1");
    }

    public static final void run$3(ARunnableS7S1100000_1 aRunnableS7S1100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("SubPaymentViewHolder@fb5d.updateExtraView$2$1");
        try {
            aRunnableS7S1100000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubPaymentViewHolder@fb5d.updateExtraView$2$1");
    }

    public static final void run$4(ARunnableS7S1100000_1 aRunnableS7S1100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("AdHybridLog@8f15.toast$1");
        try {
            C786410Ut5.re(Toast.makeText((Context) aRunnableS7S1100000_1.l1, aRunnableS7S1100000_1.s0, 0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdHybridLog@8f15.toast$1");
    }

    public static final void run$5(ARunnableS7S1100000_1 aRunnableS7S1100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("SubPaymentView@8202.updateExtraView$2$1");
        try {
            aRunnableS7S1100000_1.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubPaymentView@8202.updateExtraView$2$1");
    }

    public static final void run$6(ARunnableS7S1100000_1 aRunnableS7S1100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("CRouterLog@f8ff.toast$1$1");
        try {
            C786410Ut5.re(Toast.makeText((Context) aRunnableS7S1100000_1.l1, aRunnableS7S1100000_1.s0, 0));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CRouterLog@f8ff.toast$1$1");
    }

    public static final void run$7(ARunnableS7S1100000_1 aRunnableS7S1100000_1) {
        boolean zLIZ;
        C1C7U.LIZ("UsPurchaseLimitChecker@7ed6.check$1$1$1");
        try {
            C1389890mGx c1389890mGx = new C1389890mGx((View) aRunnableS7S1100000_1.l1);
            c1389890mGx.LJIIJ(aRunnableS7S1100000_1.s0);
            c1389890mGx.LJIIJJI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsPurchaseLimitChecker@7ed6.check$1$1$1");
    }

    public ARunnableS7S1100000_1(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
