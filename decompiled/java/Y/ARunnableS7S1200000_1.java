package Y;

import X.C03BK;
import X.C03BN;
import X.C098200Yq;
import X.C123100dR;
import X.C1389880mGw;
import X.C181R;
import X.C189200o6;
import X.C197039127h;
import X.C1C7U;
import X.C719102rN;
import X.C799503Aj;
import X.C931303kV;
import X.InterfaceC931903kb;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS7S1200000_1 implements Runnable {
    public final int $t;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Layout layout;
        int lineCount;
        C03BN c03bn = (C03BN) this.l1;
        C719102rN c719102rN = (C719102rN) this.l2;
        String str = this.s0;
        try {
            if (c03bn.LLJILLL.getParent() != null && (lineCount = (layout = c03bn.LLJILLL.getLayout()).getLineCount()) > 0) {
                if (layout.getEllipsisCount(lineCount - 1) > 0) {
                    c03bn.LLJILJILJ.setText(c719102rN.LLJJLIIIJLLLLLLLZ);
                } else {
                    c03bn.LLJILJILJ.setText(str);
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$1() {
        Layout layout;
        int lineCount;
        C799503Aj c799503Aj = (C799503Aj) this.l1;
        C719102rN c719102rN = (C719102rN) this.l2;
        String str = this.s0;
        try {
            if (c799503Aj.LLJJIII.getParent() != null && (lineCount = (layout = c799503Aj.LLJJIII.getLayout()).getLineCount()) > 0) {
                if (layout.getEllipsisCount(lineCount - 1) > 0) {
                    c799503Aj.LLJJI.setText(c719102rN.LLJJLIIIJLLLLLLLZ);
                } else {
                    c799503Aj.LLJJI.setText(str);
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$2() {
        Layout layout;
        int lineCount;
        C03BK c03bk = (C03BK) this.l1;
        C719102rN c719102rN = (C719102rN) this.l2;
        String str = this.s0;
        try {
            if (c03bk.LLJJ.getParent() != null && (lineCount = (layout = c03bk.LLJJ.getLayout()).getLineCount()) > 0) {
                if (layout.getEllipsisCount(lineCount - 1) > 0) {
                    c03bk.LLJILLL.setText(c719102rN.LLJJLIIIJLLLLLLLZ);
                } else {
                    c03bk.LLJILLL.setText(str);
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ$3() {
        ((Function1) this.l1).invoke(Boolean.FALSE);
        if (C123100dR.LIZ(this.s0)) {
            C1389880mGw c1389880mGw = new C1389880mGw((C181R) this.l2);
            c1389880mGw.LJIIIZ(this.s0);
            c1389880mGw.LJIIJ();
        } else {
            C1389880mGw c1389880mGw2 = new C1389880mGw((C181R) this.l2);
            c1389880mGw2.LJIIIIZZ(2131833103);
            c1389880mGw2.LJIIJ();
        }
    }

    public final void LIZ$4() {
        View view;
        ViewGroup viewGroup;
        C197039127h c197039127h;
        PaymentFragment paymentFragment = (PaymentFragment) this.l1;
        String str = this.s0;
        Context context = (Context) this.l2;
        try {
            Fragment fragmentLJJJJZI = paymentFragment.getChildFragmentManager().LJJJJZI("OtherPaymentMethodConfirm");
            if (fragmentLJJJJZI != null && (view = fragmentLJJJJZI.getView()) != null && (viewGroup = (ViewGroup) view.findViewById(R.id.kx4)) != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof C197039127h) && (c197039127h = (C197039127h) childAt) != null) {
                        CharSequence text = c197039127h.getText();
                        if (Intrinsics.LJFF(text != null ? text.toString() : null, str)) {
                            c197039127h.LJJJJL(new AwS580S0100000_1(context, 135));
                            break;
                        }
                    }
                    i++;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS7S1200000_1 aRunnableS7S1200000_1) {
        boolean zLIZ;
        C1C7U.LIZ("USAddOnOrderHorizontalItemView@5640.bindSku$4");
        try {
            aRunnableS7S1200000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("USAddOnOrderHorizontalItemView@5640.bindSku$4");
    }

    public static final void run$1(ARunnableS7S1200000_1 aRunnableS7S1200000_1) {
        boolean zLIZ;
        C1C7U.LIZ("USAddOnOrderSingleItemView@3e21.bindProductMarketInfo$1");
        try {
            aRunnableS7S1200000_1.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("USAddOnOrderSingleItemView@3e21.bindProductMarketInfo$1");
    }

    public static final void run$2(ARunnableS7S1200000_1 aRunnableS7S1200000_1) {
        boolean zLIZ;
        C1C7U.LIZ("USAddOnOrderVerticalItemView@1ff1.bindSku$3");
        try {
            aRunnableS7S1200000_1.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("USAddOnOrderVerticalItemView@1ff1.bindSku$3");
    }

    public static final void run$3(ARunnableS7S1200000_1 aRunnableS7S1200000_1) {
        boolean zLIZ;
        C1C7U.LIZ("UsBidPopCardBaseView@fbef.handleButtonClickCommon$3$1");
        try {
            aRunnableS7S1200000_1.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsBidPopCardBaseView@fbef.handleButtonClickCommon$3$1");
    }

    public static final void run$4(ARunnableS7S1200000_1 aRunnableS7S1200000_1) {
        boolean zLIZ;
        C1C7U.LIZ("PaymentFragment@e997.applyOtherPaymentMethodConfirmPrimaryButtonStyle$1");
        try {
            aRunnableS7S1200000_1.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PaymentFragment@e997.applyOtherPaymentMethodConfirmPrimaryButtonStyle$1");
    }

    public static final void run$5(ARunnableS7S1200000_1 aRunnableS7S1200000_1) {
        boolean zLIZ;
        C1C7U.LIZ("StarlingService@89d5.initStarlingKey$3");
        try {
            C931303kV c931303kV = (C931303kV) aRunnableS7S1200000_1.l2;
            c931303kV.LIZJ(c931303kV.LIZJ, (InterfaceC931903kb) aRunnableS7S1200000_1.l1, aRunnableS7S1200000_1.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StarlingService@89d5.initStarlingKey$3");
    }

    public ARunnableS7S1200000_1(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
