package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17wN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.list.DefaultShopBagList$prepareToShow$3", f = "DefaultShopBagList.kt", l = {}, m = "invokeSuspend")
public final class C21191317wN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21208517z9 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21191317wN(C21208517z9 c21208517z9, InterfaceC1364105Vn<? super C21191317wN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21208517z9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21191317wN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultShopBagList@b462.prepareToShow$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21208517z9 c21208517z9 = this.LL;
        if (c21208517z9.LLIZLLLIL != null) {
            C21208817zC c21208817zC = c21208517z9.LLJ;
            if (c21208817zC != null) {
                c21208817zC.LIZIZ(c21208517z9.LLJJLIIIJLLLLLLLZ, c21208517z9.LLJJ, c21208517z9.LLJL);
            }
        } else {
            C21208817zC c21208817zC2 = c21208517z9.LLJ;
            if (c21208817zC2 != null) {
                c21208817zC2.LIZIZ(c21208517z9.LLJJLIIIJLLLLLLLZ, c21208517z9.LLJJ, false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultShopBagList@b462.prepareToShow$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
