package X;

import Y.ARunnableS34S0300000_1;
import android.os.Looper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C914703hp extends C09AY implements InterfaceC1631630sYr<String, String, String, Cashier, Unit> {
    public final /* synthetic */ PaymentInfo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<PaymentElement> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914703hp(PaymentInfo paymentInfo, String str, String str2, String str3, List list, AwS402S0200000_1 awS402S0200000_1, AwS545S0100000_1 awS545S0100000_1) {
        super(4);
        this.LL = paymentInfo;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = awS402S0200000_1;
        this.LLIZ = awS545S0100000_1;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, String str2, String str3, Cashier cashier) {
        String str4;
        PaymentElement next;
        PaymentElement next2;
        PaymentElement next3;
        PaymentElement next4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        PaymentMethodInfo paymentMethodInfo;
        String str10 = str2;
        C931003kS c931003kS = C932203ke.LIZ;
        C915203hu c915203hu = new C915203hu();
        PaymentInfo paymentInfo = this.LL;
        String str11 = this.LLILLJJLI;
        List<PaymentElement> list = this.LLILLL;
        String str12 = this.LLILZ;
        String str13 = this.LLILZIL;
        c915203hu.LIZJ = str;
        c915203hu.LIZIZ = String.valueOf(System.currentTimeMillis());
        c915203hu.LIZ = str10;
        c915203hu.LJ = str10;
        c915203hu.LJFF = str3;
        C03SY c03sy = C03SY.LIZ;
        PaymentElement paymentElement = null;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
            str4 = paymentMethodInfo.id;
        } else {
            str4 = null;
        }
        c03sy.getClass();
        c915203hu.LJI = C03SY.LIZIZ(str4);
        c915203hu.LJII = str11;
        c915203hu.LJIIIIZZ = C03SY.LJII(list);
        c915203hu.LJIIIZ = C03SY.LJIIIZ(list);
        c915203hu.LJIIJJI = C03SY.LJIIJ(list);
        c915203hu.LJIIJ = C03SY.LJIIJJI(list);
        c915203hu.LJIIL = C03SY.LJIIL(list);
        C915803i0 c915803i0 = new C915803i0();
        if (list != null) {
            Iterator<PaymentElement> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.element, "eg_ccdc_global_billing_address_country_regin")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentElement paymentElement2 = next;
            if (paymentElement2 != null && (str9 = paymentElement2.paramValue) != null) {
                c915803i0.LIZ = str9;
            }
            Iterator<PaymentElement> it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.element, "eg_ccdc_global_billing_address_state")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            PaymentElement paymentElement3 = next2;
            if (paymentElement3 != null && (str8 = paymentElement3.paramValue) != null) {
                c915803i0.LIZIZ = str8;
            }
            Iterator<PaymentElement> it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next3 = it4.next();
                    if (Intrinsics.LJFF(next3.element, "eg_ccdc_global_billing_address_city")) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            PaymentElement paymentElement4 = next3;
            if (paymentElement4 != null && (str7 = paymentElement4.paramValue) != null) {
                c915803i0.LIZJ = str7;
            }
            Iterator<PaymentElement> it5 = list.iterator();
            while (true) {
                if (it5.hasNext()) {
                    next4 = it5.next();
                    if (Intrinsics.LJFF(next4.element, "eg_ccdc_global_billing_address_postal_code")) {
                        break;
                    }
                } else {
                    next4 = null;
                    break;
                }
            }
            PaymentElement paymentElement5 = next4;
            if (paymentElement5 != null && (str6 = paymentElement5.paramValue) != null) {
                c915803i0.LIZLLL = str6;
            }
            Iterator<PaymentElement> it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                PaymentElement next5 = it6.next();
                if (Intrinsics.LJFF(next5.element, "eg_ccdc_global_billing_address_street")) {
                    paymentElement = next5;
                    break;
                }
            }
            PaymentElement paymentElement6 = paymentElement;
            if (paymentElement6 != null && (str5 = paymentElement6.paramValue) != null) {
                c915803i0.LJ = str5;
            }
        }
        c915203hu.LJIILIIL = c915803i0;
        if (str12 != null) {
            c915203hu.LJIILL = str12;
        }
        if (str13 != null) {
            c915203hu.LJIILJJIL = str13;
        }
        final Function0<Unit> function0 = this.LLILZLL;
        final Function0<Unit> function02 = this.LLIZ;
        InterfaceC920103ih interfaceC920103ih = new InterfaceC920103ih() { // from class: X.03i5
            @Override // X.InterfaceC920103ih
            public final void LIZ(C916003i2 c916003i2) {
                if (Intrinsics.LJFF(c916003i2.LIZJ, "success")) {
                    Function0<Unit> function03 = function0;
                    if (function03 != null) {
                        function03.invoke();
                        return;
                    }
                    return;
                }
                Function0<Unit> function04 = function02;
                if (function04 == null) {
                    return;
                }
                function04.invoke();
            }
        };
        if (c931003kS.LIZ.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get verify card installment with ");
            sbLIZ.append(c915203hu.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            C914603ho c914603ho = (C914603ho) C1724150uy5.LJIIL.LIZLLL();
            c914603ho.getClass();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new ARunnableS34S0300000_1(c914603ho, c915203hu, interfaceC920103ih, 10));
            } else {
                C914603ho.LIZLLL(c915203hu, interfaceC920103ih);
            }
            return Unit.LIZ;
        }
        throw new IllegalArgumentException("please init first");
    }
}
