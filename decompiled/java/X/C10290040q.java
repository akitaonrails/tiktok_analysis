package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.ConfirmUserAuctionInfoRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.040q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionInfoApi$Companion$confirmAuctionInfo$2", f = "AuctionInfoApi.kt", l = {57}, m = "invokeSuspend")
public final class C10290040q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1026403zq>, Object> {
    public int LL;
    public final /* synthetic */ ConfirmUserAuctionInfoRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10290040q(ConfirmUserAuctionInfoRequest confirmUserAuctionInfoRequest, InterfaceC1364105Vn<? super C10290040q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = confirmUserAuctionInfoRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10290040q(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuctionInfoApi$Companion@12b6.confirmAuctionInfo$2");
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
            InterfaceC10295040v interfaceC10295040v = (InterfaceC10295040v) C10291040r.LIZIZ.create(InterfaceC10295040v.class);
            ConfirmUserAuctionInfoRequest confirmUserAuctionInfoRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC10295040v.LIZIZ(confirmUserAuctionInfoRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AuctionInfoApi$Companion@12b6.confirmAuctionInfo$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AuctionInfoApi$Companion@12b6.confirmAuctionInfo$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1026403zq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
