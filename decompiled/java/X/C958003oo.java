package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$clearUnreadMsgCountInCache$1$1", f = "PdpViewModel.kt", l = {}, m = "invokeSuspend")
public final class C958003oo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PdpViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C958003oo(String str, PdpViewModel pdpViewModel, InterfaceC1364105Vn<? super C958003oo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = pdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C958003oo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SellerInfo sellerInfo;
        Integer num;
        SellerInfo sellerInfoLIZ;
        C1C7U.LIZ("PdpViewModel@6cb1.clearUnreadMsgCountInCache$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProductPackStruct productPackStructLIZLLL = C1758140vqu.LIZLLL(this.LL);
        if (productPackStructLIZLLL != null && (sellerInfo = productPackStructLIZLLL.sellerInfo) != null && (num = sellerInfo.unreadMsgCount) != null && num.intValue() > 0) {
            SellerInfo sellerInfo2 = productPackStructLIZLLL.sellerInfo;
            if (sellerInfo2 != null) {
                sellerInfoLIZ = SellerInfo.LIZ(sellerInfo2, C2286608xc.LJ(0));
            } else {
                sellerInfoLIZ = null;
            }
            this.LLILLJJLI.kS2(ProductPackStruct.LIZ(productPackStructLIZLLL, sellerInfoLIZ, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, -1, -1, 2097151), this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpViewModel@6cb1.clearUnreadMsgCountInCache$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
