package X;

import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionsListKt$PurchaseOptionsList$1$1$1$1", f = "PurchaseOptionsList.kt", l = {}, m = "invokeSuspend")
public final class C1566330qrX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<PurchaseOptionWithPrice> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function1<AbstractC1556970qcR, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566330qrX(int i, List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566330qrX(this.LLILLJJLI, this.LL, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PurchaseOptionsListKt@1407.PurchaseOptionsList$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PurchaseOptionWithPrice purchaseOptionWithPrice = (PurchaseOptionWithPrice) C13LP.LJJJLZIJ(this.LLILLJJLI, this.LL);
        if (purchaseOptionWithPrice != null) {
            this.LLILLL.invoke(new C1556990qcT(purchaseOptionWithPrice));
        }
        this.LLILLL.invoke(new C1556950qcP(this.LL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurchaseOptionsListKt@1407.PurchaseOptionsList$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
