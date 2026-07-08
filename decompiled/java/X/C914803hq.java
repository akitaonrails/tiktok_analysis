package X;

import Y.ARunnableS34S0300000_1;
import android.os.Looper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C914803hq extends C09AY implements InterfaceC1631630sYr<String, String, String, Cashier, Unit> {
    public final /* synthetic */ PaymentInfo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<PaymentElement> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL = "";
    public final /* synthetic */ Function1<C915503hx, Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C914803hq(PaymentInfo paymentInfo, String str, String str2, String str3, List list, AwS545S0100000_1 awS545S0100000_1, AwS100S0400000_1 awS100S0400000_1) {
        super(4);
        this.LL = paymentInfo;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLIZ = awS100S0400000_1;
        this.LLIZLLLIL = awS545S0100000_1;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, String str2, String str3, Cashier cashier) {
        String str4;
        PaymentMethodInfo paymentMethodInfo;
        String str5 = str;
        String str6 = str2;
        C931003kS c931003kS = C932203ke.LIZ;
        C914903hr c914903hr = new C914903hr();
        PaymentInfo paymentInfo = this.LL;
        String str7 = this.LLILLJJLI;
        List<PaymentElement> list = this.LLILLL;
        String str8 = this.LLILZ;
        String str9 = this.LLILZIL;
        String str10 = this.LLILZLL;
        c914903hr.LIZJ = str5;
        c914903hr.LJIILLIIL = str5;
        c914903hr.LIZIZ = String.valueOf(System.currentTimeMillis());
        c914903hr.LIZ = str6;
        c914903hr.LJ = str6;
        c914903hr.LJFF = str3;
        C03SY c03sy = C03SY.LIZ;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
            str4 = paymentMethodInfo.id;
        } else {
            str4 = null;
        }
        c03sy.getClass();
        c914903hr.LJI = C03SY.LIZIZ(str4);
        c914903hr.LJII = str7;
        c914903hr.LJIIIIZZ = C03SY.LJII(list);
        c914903hr.LJIIIZ = C03SY.LJIIIZ(list);
        if (str8 != null) {
            c914903hr.LJIIJJI = str8;
        }
        if (str9 != null) {
            c914903hr.LJIIJ = str9;
        }
        c914903hr.LJIIL = C03SY.LJIIJ(list);
        c914903hr.LJIILIIL = C03SY.LJIIJJI(list);
        c914903hr.LJIILJJIL = C03SY.LJIIL(list);
        c914903hr.LJIILL = str10;
        final Function1<C915503hx, Unit> function1 = this.LLIZ;
        final Function0<Unit> function0 = this.LLIZLLLIL;
        InterfaceC919603ic interfaceC919603ic = new InterfaceC919603ic() { // from class: X.03i1
            @Override // X.InterfaceC919603ic
            public final void LIZ(C915503hx c915503hx) {
                if (Intrinsics.LJFF(c915503hx.LIZJ, "success")) {
                    Function1<C915503hx, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(c915503hx);
                        return;
                    }
                    return;
                }
                Function0<Unit> function02 = function0;
                if (function02 == null) {
                    return;
                }
                function02.invoke();
            }
        };
        if (c931003kS.LIZ.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get unified bin detail with ");
            sbLIZ.append(c914903hr.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            C914603ho c914603ho = (C914603ho) C1724150uy5.LJIIL.LIZLLL();
            c914603ho.getClass();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new ARunnableS34S0300000_1(c914603ho, c914903hr, interfaceC919603ic, 12));
            } else {
                C914603ho.LIZ(c914903hr, interfaceC919603ic);
            }
            return Unit.LIZ;
        }
        throw new IllegalArgumentException("please init first");
    }
}
