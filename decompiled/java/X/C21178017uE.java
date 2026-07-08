package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.AudienceApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17uE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.popcard.click.ProductCardClickListener$onClick$1$1", f = "ProductCardClickListener.kt", l = {52}, m = "invokeSuspend")
public final class C21178017uE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21211817zg LLILLJJLI;
    public final /* synthetic */ PopupCardVO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21178017uE(C21211817zg c21211817zg, PopupCardVO popupCardVO, InterfaceC1364105Vn<? super C21178017uE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21211817zg;
        this.LLILLL = popupCardVO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21178017uE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZJ;
        C1C7U.LIZ("ProductCardClickListener@d0ca.onClick$1$1");
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
            C20153613tO c20153613tO = AudienceApi.LIZ;
            C1743900vTw c1743900vTw = this.LLILLJJLI.LIZ.LLIZLLLIL;
            String strLIZJ2 = null;
            if (c1743900vTw != null) {
                strLIZJ = c1743900vTw.LIZJ("room_id");
            } else {
                strLIZJ = null;
            }
            C1743900vTw c1743900vTw2 = this.LLILLJJLI.LIZ.LLIZLLLIL;
            if (c1743900vTw2 != null) {
                strLIZJ2 = c1743900vTw2.LIZJ("author_id");
            }
            String strValueOf = String.valueOf(this.LLILLL.productId);
            this.LL = 1;
            if (c20153613tO.LIZ(strLIZJ, strLIZJ2, strValueOf, 1, this) == objLJFF) {
                C1C7U.LIZIZ("ProductCardClickListener@d0ca.onClick$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProductCardClickListener@d0ca.onClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
