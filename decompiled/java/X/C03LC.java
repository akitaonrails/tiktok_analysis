package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS367S0200000_1;
import njp.a;

/* JADX INFO: renamed from: X.03LC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$updateGooglePayList$1", f = "OrderSubmitAssemViewModel.kt", l = {4596}, m = "invokeSuspend")
public final class C03LC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03LC(OrderSubmitAssemViewModel orderSubmitAssemViewModel, boolean z, InterfaceC1364105Vn<? super C03LC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03LC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.updateGooglePayList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLJJLI;
            boolean z = this.LLILLL;
            this.LL = 1;
            obj = orderSubmitAssemViewModel.MS2(z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.updateGooglePayList$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.updateGooglePayList$1");
            return unit;
        }
        C259800zU c259800zU = new C259800zU();
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = this.LLILLJJLI.LLJL;
        boolean z2 = this.LLILLL;
        ?? arrayList = new ArrayList();
        for (PaymentMethod paymentMethod : copyOnWriteArrayList) {
            GooglePayProcess.LIZ.getClass();
            if (!GooglePayProcess.LJIIIIZZ(paymentMethod) || z2) {
                arrayList.add(paymentMethod);
            }
        }
        c259800zU.element = arrayList;
        if (C03ZX.LIZIZ()) {
            Iterable iterable = (Iterable) c259800zU.element;
            ?? arrayList2 = new ArrayList();
            for (Object obj2 : iterable) {
                PaymentMethod paymentMethod2 = (PaymentMethod) obj2;
                GooglePayProcess.LIZ.getClass();
                if (GooglePayProcess.LIZLLL() || !GooglePayProcess.LJI(paymentMethod2)) {
                    arrayList2.add(obj2);
                }
            }
            c259800zU.element = arrayList2;
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLILLJJLI;
        orderSubmitAssemViewModel2.withState(new AwS367S0200000_1(orderSubmitAssemViewModel2, (OrderSubmitAssemViewModel) c259800zU, (C259800zU<List<PaymentMethod>>) 179));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.updateGooglePayList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
