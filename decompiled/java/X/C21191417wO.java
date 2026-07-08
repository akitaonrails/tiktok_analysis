package X;

import com.lynx.tasm.TemplateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17wO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.list.DefaultShopBagList$getBagAssemble$3$1", f = "DefaultShopBagList.kt", l = {}, m = "invokeSuspend")
public final class C21191417wO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21208517z9 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21191417wO(C21208517z9 c21208517z9, String str, InterfaceC1364105Vn<? super C21191417wO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21208517z9;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21191417wO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultShopBagList@b462.getBagAssemble$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21208817zC c21208817zC = this.LL.LLJ;
        if (c21208817zC != null) {
            String str = this.LLILLJJLI;
            c21208817zC.LLIZLLLIL = str;
            c21208817zC.LLJ.setValue(str);
            C1537720q7O c1537720q7O = c21208817zC.LLILZ;
            if (c1537720q7O != null && c1537720q7O.LIZIZ() && C770702zh.LIZ(str)) {
                C1537720q7O c1537720q7O2 = c21208817zC.LLILZ;
                if (c1537720q7O2 != null) {
                    c1537720q7O2.updateData(TemplateData.LJII(C21208817zC.LIZ(str, "load first")));
                }
                c21208817zC.LLIZLLLIL = null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultShopBagList@b462.getBagAssemble$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
