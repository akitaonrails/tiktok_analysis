package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AuctionCheckResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17xS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel$checkAuctionPermission$1", f = "UsBidViewModel.kt", l = {}, m = "invokeSuspend")
public final class C21198017xS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UsBidViewModel LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ Function2<AuctionCheckResp, Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21198017xS(UsBidViewModel usBidViewModel, Function1<? super String, Unit> function1, Long l, Function2<? super AuctionCheckResp, ? super Boolean, Unit> function2, InterfaceC1364105Vn<? super C21198017xS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = usBidViewModel;
        this.LLILLJJLI = function1;
        this.LLILLL = l;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21198017xS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (r4.actionAgreement != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        r0 = r4.addressPaymentSchema;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        if (r0.length() != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        r2 = X.C21198117xT.LIZ;
        r0 = r15.LL;
        r2.getClass();
        X.C21198117xT.LIZ("auction_shipment_and_payment_confirmed", r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e1, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (r4.actionAgreement != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e7, code lost:
    
        r0 = r4.addressPaymentSchema;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e9, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        if (r0.length() != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f1, code lost:
    
        r15.LL.LLJILLL.put(java.lang.String.valueOf(r15.LLILLL), true);
        r1 = r15.LLILZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0104, code lost:
    
        if (r1 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0106, code lost:
    
        r1.invoke(null, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010d, code lost:
    
        r0 = kotlin.Unit.LIZ;
        X.C1C7U.LIZIZ("UsBidViewModel@6bee.checkAuctionPermission$1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0112, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:
    
        r15.LL.LLJILLL.put(java.lang.String.valueOf(r15.LLILLL), false);
        r1 = r15.LLILZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0129, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        r1.invoke(r4, false);
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21198017xS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
