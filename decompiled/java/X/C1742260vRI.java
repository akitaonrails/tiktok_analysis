package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vRI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeadNavBarWidget$initSubscribe$15$1", f = "PdpHeadNavBarWidget.kt", l = {515}, m = "invokeSuspend")
public final class C1742260vRI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PdpHeadNavBarWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742260vRI(PdpHeadNavBarWidget pdpHeadNavBarWidget, InterfaceC1364105Vn<? super C1742260vRI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpHeadNavBarWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742260vRI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        List<Integer> listLJJLJ;
        C1C7U.LIZ("PdpHeadNavBarWidget@7218.initSubscribe$15$1");
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
            int i2 = C1742080vR0.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam = this.LLILLJJLI.LJIJI().LLJI;
            if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null) {
                map = new HashMap();
            }
            int[] iArrLJFF = C1742080vR0.LJFF(map);
            if (iArrLJFF == null || (listLJJLJ = C13LQ.LJJLJ(iArrLJFF)) == null) {
                listLJJLJ = C13BV.INSTANCE;
            }
            C1742190vRB c1742190vRB = C1742190vRB.LIZ;
            CartEntryFrom cartEntryFrom = CartEntryFrom.PDP;
            EnumC1742180vRA enumC1742180vRA = EnumC1742180vRA.CART_ENTRY;
            this.LL = 1;
            if (c1742190vRB.LJ(listLJJLJ, cartEntryFrom, enumC1742180vRA, "product_detail", this) == objLJFF) {
                C1C7U.LIZIZ("PdpHeadNavBarWidget@7218.initSubscribe$15$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpHeadNavBarWidget@7218.initSubscribe$15$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
