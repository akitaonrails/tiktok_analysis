package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionBidRequest;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionBidResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.181S, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel$startBid$1", f = "UsBidViewModel.kt", l = {}, m = "invokeSuspend")
public final class C181S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UsBidViewModel LL;
    public final /* synthetic */ AuctionBidRequest LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, AuctionBidResp, String, Unit> LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ Function1<Function0<Unit>, Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C181S(UsBidViewModel usBidViewModel, AuctionBidRequest auctionBidRequest, InterfaceC1631620sYq<? super Boolean, ? super AuctionBidResp, ? super String, Unit> interfaceC1631620sYq, C19EG c19eg, Function1<? super Function0<Unit>, Unit> function1, boolean z, Long l, InterfaceC1364105Vn<? super C181S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = usBidViewModel;
        this.LLILLJJLI = auctionBidRequest;
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = c19eg;
        this.LLILZIL = function1;
        this.LLILZLL = z;
        this.LLIZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C181S(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0265  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C181S.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
