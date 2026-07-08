package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03pH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$clearUnreadMsgCountInCache$1", f = "SeaPdpViewModel.kt", l = {}, m = "invokeSuspend")
public final class C960903pH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaPdpViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C960903pH(SeaPdpViewModel seaPdpViewModel, InterfaceC1364105Vn<? super C960903pH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seaPdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C960903pH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SellerInfo sellerInfo;
        Integer num;
        SellerInfo sellerInfoLIZ;
        C1C7U.LIZ("SeaPdpViewModel@98e7.clearUnreadMsgCountInCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ProductPackStruct productPackStructLIZJ = C1757830vqP.LIZJ(this.LL.LLIZ);
        if (productPackStructLIZJ != null && (sellerInfo = productPackStructLIZJ.sellerInfo) != null && (num = sellerInfo.unreadMsgCount) != null && num.intValue() > 0) {
            SellerInfo sellerInfo2 = productPackStructLIZJ.sellerInfo;
            if (sellerInfo2 != null) {
                sellerInfoLIZ = SellerInfo.LIZ(sellerInfo2, C2286608xc.LJ(0));
            } else {
                sellerInfoLIZ = null;
            }
            this.LL.uS2(ProductPackStruct.LIZ(productPackStructLIZJ, sellerInfoLIZ, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, -1, -1, 2097151));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpViewModel@98e7.clearUnreadMsgCountInCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
