package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpHeadNavBarWidget$initSubscribe$20$1", f = "SeaPdpHeadNavBarWidget.kt", l = {401, 406}, m = "invokeSuspend")
public final class C1742250vRH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeaPdpHeadNavBarWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742250vRH(SeaPdpHeadNavBarWidget seaPdpHeadNavBarWidget, InterfaceC1364105Vn<? super C1742250vRH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpHeadNavBarWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742250vRH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        List<Integer> listLJJLJ;
        C1C7U.LIZ("SeaPdpHeadNavBarWidget@d989.initSubscribe$20$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SeaPdpHeadNavBarWidget@d989.initSubscribe$20$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = C075B.LIZ;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("SeaPdpHeadNavBarWidget@d989.initSubscribe$20$1");
                    return objLJFF;
                }
            }
        }
        int i2 = C1742080vR0.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LLILLJJLI.LJIL().LLIZ;
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
        this.LL = 2;
        if (c1742190vRB.LJ(listLJJLJ, cartEntryFrom, enumC1742180vRA, "product_detail", this) == objLJFF) {
            C1C7U.LIZIZ("SeaPdpHeadNavBarWidget@d989.initSubscribe$20$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpHeadNavBarWidget@d989.initSubscribe$20$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
