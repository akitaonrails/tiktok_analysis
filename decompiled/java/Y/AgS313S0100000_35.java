package Y;

import X.AbstractC336760DIc;
import X.C1954807lC;
import X.C2097608Jq;
import X.C2250081D5a;
import X.C2266361DnG;
import X.C2266371DnH;
import X.C2266381DnI;
import X.C2266391DnJ;
import X.C2266411DnL;
import X.C2266431DnN;
import X.C335000DBi;
import X.C336750DIb;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS45S0000100_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public class AgS313S0100000_35 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS313S0100000_35(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS313S0100000_35 agS313S0100000_35, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC336760DIc abstractC336760DIc = (AbstractC336760DIc) obj;
        CheckoutFragment checkoutFragment = (CheckoutFragment) agS313S0100000_35.l0;
        checkoutFragment.getClass();
        if (abstractC336760DIc instanceof C336750DIb) {
            long j = ((C336750DIb) abstractC336760DIc).LIZ;
            CheckoutFragment.RR("checkout_ucp_checkout_show", C2097608Jq.LJII(new Pair("load_duration_ms", String.valueOf(j))));
            C335000DBi c335000DBi = checkoutFragment.LLIZ;
            if (c335000DBi != null) {
                c335000DBi.logAd(C2250081D5a.LIZ, checkoutFragment.ee(), new AwS45S0000100_35(j, 2));
            }
        } else if (abstractC336760DIc instanceof C2266371DnH) {
            C2266371DnH c2266371DnH = (C2266371DnH) abstractC336760DIc;
            CheckoutFragment.RR("checkout_ucp_payment_submit", C2097608Jq.LJII(new Pair("order_amount", c2266371DnH.LIZ), new Pair("payment_method", c2266371DnH.LIZIZ), new Pair("checkout_type", c2266371DnH.LIZJ), new Pair("has_coupon_applied", String.valueOf(c2266371DnH.LIZLLL)), new Pair("quantity", String.valueOf(c2266371DnH.LJ)), new Pair("place_order_session_id", c2266371DnH.LJFF)));
            C335000DBi c335000DBi2 = checkoutFragment.LLIZ;
            if (c335000DBi2 != null) {
                c335000DBi2.logAd(C2266361DnG.LIZ, checkoutFragment.ee(), new AwS614S0100000_35(c2266371DnH, 243));
            }
        } else if (abstractC336760DIc instanceof C2266391DnJ) {
            C2266391DnJ c2266391DnJ = (C2266391DnJ) abstractC336760DIc;
            CheckoutFragment.RR("checkout_ucp_payment_result_success", C2097608Jq.LJII(new Pair("order_id", c2266391DnJ.LIZ), new Pair("order_amount", c2266391DnJ.LIZIZ), new Pair("payment_method", c2266391DnJ.LIZJ), new Pair("payment_status", "1"), new Pair("payment_duration_ms", String.valueOf(c2266391DnJ.LJ)), new Pair("place_order_session_id", c2266391DnJ.LJFF)));
            C335000DBi c335000DBi3 = checkoutFragment.LLIZ;
            if (c335000DBi3 != null) {
                c335000DBi3.logAd(C2266411DnL.LIZ, checkoutFragment.ee(), new AwS614S0100000_35(c2266391DnJ, 242));
            }
        } else if (abstractC336760DIc instanceof C2266381DnI) {
            C2266381DnI c2266381DnI = (C2266381DnI) abstractC336760DIc;
            CheckoutFragment.RR("checkout_ucp_payment_result_failure", C2097608Jq.LJII(new Pair("order_amount", c2266381DnI.LIZ), new Pair("payment_method", c2266381DnI.LIZIZ), new Pair("payment_status", CardStruct.IStatusCode.DEFAULT), new Pair("error_code", c2266381DnI.LIZLLL), new Pair("error_message", c2266381DnI.LJ), new Pair("payment_duration_ms", String.valueOf(c2266381DnI.LJFF)), new Pair("place_order_session_id", c2266381DnI.LJI)));
            C335000DBi c335000DBi4 = checkoutFragment.LLIZ;
            if (c335000DBi4 != null) {
                c335000DBi4.logAd(C2266431DnN.LIZ, checkoutFragment.ee(), new AwS614S0100000_35(c2266381DnI, 241));
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS313S0100000_35 agS313S0100000_35, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC336760DIc abstractC336760DIc = (AbstractC336760DIc) obj;
        OnestepCheckoutFragment onestepCheckoutFragment = (OnestepCheckoutFragment) agS313S0100000_35.l0;
        onestepCheckoutFragment.getClass();
        if (abstractC336760DIc instanceof C336750DIb) {
            long j = ((C336750DIb) abstractC336760DIc).LIZ;
            C335000DBi c335000DBi = onestepCheckoutFragment.LLJILLL;
            if (c335000DBi != null) {
                c335000DBi.logAd(C2250081D5a.LIZ, onestepCheckoutFragment.ee(), new AwS45S0000100_35(j, 1));
            }
        } else if (abstractC336760DIc instanceof C2266371DnH) {
            C2266371DnH c2266371DnH = (C2266371DnH) abstractC336760DIc;
            C335000DBi c335000DBi2 = onestepCheckoutFragment.LLJILLL;
            if (c335000DBi2 != null) {
                c335000DBi2.logAd(C2266361DnG.LIZ, onestepCheckoutFragment.ee(), new AwS614S0100000_35(c2266371DnH, 146));
            }
        } else if (abstractC336760DIc instanceof C2266391DnJ) {
            C2266391DnJ c2266391DnJ = (C2266391DnJ) abstractC336760DIc;
            C335000DBi c335000DBi3 = onestepCheckoutFragment.LLJILLL;
            if (c335000DBi3 != null) {
                c335000DBi3.logAd(C2266411DnL.LIZ, onestepCheckoutFragment.ee(), new AwS614S0100000_35(c2266391DnJ, 145));
            }
        } else if (abstractC336760DIc instanceof C2266381DnI) {
            C2266381DnI c2266381DnI = (C2266381DnI) abstractC336760DIc;
            C335000DBi c335000DBi4 = onestepCheckoutFragment.LLJILLL;
            if (c335000DBi4 != null) {
                c335000DBi4.logAd(C2266431DnN.LIZ, onestepCheckoutFragment.ee(), new AwS614S0100000_35(c2266381DnI, 144));
            }
        }
        return Unit.LIZ;
    }
}
