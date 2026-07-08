package Y;

import X.C0DK4;
import X.C0DR4;
import X.C339610DTb;
import X.C937280aUw;
import X.InterfaceC1631620sYq;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeReasonModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class ACListenerS48S0101000_4 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public ACListenerS48S0101000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(ACListenerS48S0101000_4 aCListenerS48S0101000_4, View view) {
        Function1<? super Integer, Unit> function1 = ((C0DK4) aCListenerS48S0101000_4.l0).LLILLJJLI;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(aCListenerS48S0101000_4.i1));
        }
    }

    public static final void onClick$1(ACListenerS48S0101000_4 aCListenerS48S0101000_4, View view) {
        String str;
        int i = aCListenerS48S0101000_4.i1 + 1;
        aCListenerS48S0101000_4.i1 = i;
        if (i < 3) {
            return;
        }
        aCListenerS48S0101000_4.i1 = 0;
        OnestepCheckoutFragment onestepCheckoutFragment = (OnestepCheckoutFragment) aCListenerS48S0101000_4.l0;
        CheckoutViewModel checkoutViewModel = onestepCheckoutFragment.LLILLL;
        if (checkoutViewModel != null && (str = checkoutViewModel.LLJJIJIL.LIZJ) != null) {
            onestepCheckoutFragment.SR(str);
        }
    }

    public static final void onClick$2(ACListenerS48S0101000_4 aCListenerS48S0101000_4, View view) {
        C339610DTb c339610DTb = (C339610DTb) aCListenerS48S0101000_4.l0;
        if (c339610DTb.LLILLL == aCListenerS48S0101000_4.i1) {
            c339610DTb.LLIZ.invoke();
            return;
        }
        if (!C937280aUw.LIZ(c339610DTb.LL) && (!((C339610DTb) aCListenerS48S0101000_4.l0).LLILZ.invoke(Integer.valueOf(aCListenerS48S0101000_4.i1)).booleanValue() || !((C339610DTb) aCListenerS48S0101000_4.l0).LLILZIL.invoke(Integer.valueOf(aCListenerS48S0101000_4.i1)).booleanValue())) {
            return;
        }
        C339610DTb c339610DTb2 = (C339610DTb) aCListenerS48S0101000_4.l0;
        int iIndexOf = c339610DTb2.LLILLJJLI.indexOf(Integer.valueOf(c339610DTb2.LLILLL));
        C339610DTb c339610DTb3 = (C339610DTb) aCListenerS48S0101000_4.l0;
        int i = aCListenerS48S0101000_4.i1;
        c339610DTb3.LLILLL = i;
        int iIndexOf2 = c339610DTb3.LLILLJJLI.indexOf(Integer.valueOf(i));
        if (iIndexOf != -1) {
            ((C339610DTb) aCListenerS48S0101000_4.l0).notifyItemChanged(iIndexOf);
        }
        if (iIndexOf2 != -1) {
            ((C339610DTb) aCListenerS48S0101000_4.l0).notifyItemChanged(iIndexOf2);
        }
        ((C339610DTb) aCListenerS48S0101000_4.l0).LLILZLL.invoke(Integer.valueOf(aCListenerS48S0101000_4.i1));
    }

    public static final void onClick$3(ACListenerS48S0101000_4 aCListenerS48S0101000_4, View view) {
        C0DR4 c0dr4 = (C0DR4) aCListenerS48S0101000_4.l0;
        InterfaceC1631620sYq<String, String, Integer, Unit> interfaceC1631620sYq = c0dr4.LLILLJJLI;
        String str = ((AdDislikeReasonModel) ListProtector.get(c0dr4.LL, aCListenerS48S0101000_4.i1)).toast;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = ((AdDislikeReasonModel) ListProtector.get(((C0DR4) aCListenerS48S0101000_4.l0).LL, aCListenerS48S0101000_4.i1)).key;
        if (str3 != null) {
            str2 = str3;
        }
        interfaceC1631620sYq.invoke(str, str2, Integer.valueOf(aCListenerS48S0101000_4.i1));
    }

    public static final void onClick$4(ACListenerS48S0101000_4 aCListenerS48S0101000_4, View view) {
        int i = aCListenerS48S0101000_4.i1 + 1;
        aCListenerS48S0101000_4.i1 = i;
        if (i < 3) {
            return;
        }
        aCListenerS48S0101000_4.i1 = 0;
        String str = ((CheckoutFragment) aCListenerS48S0101000_4.l0).MR().LLJJIJIL.LIZJ;
        if (str == null) {
            return;
        }
        ((CheckoutFragment) aCListenerS48S0101000_4.l0).NR(str);
    }

    public ACListenerS48S0101000_4(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
