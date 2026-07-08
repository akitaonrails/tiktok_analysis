package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.risk.AuthenPreRiskResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.bind.CashierBindPaymentMethodHelper$Companion$requestAuthPreRisk$1$1$1$1", f = "CashierBindPaymentMethodHelper.kt", l = {}, m = "invokeSuspend")
public final class C1708350uYb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ C0X52<BaseResponse<AuthenPreRiskResponse>> LLILLL;
    public final /* synthetic */ BaseResponse<AuthenPreRiskResponse> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1709570uaZ LLILZLL;
    public final /* synthetic */ C19EG LLIZ;
    public final /* synthetic */ Function1<String, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1708350uYb(boolean z, Function1<? super String, Unit> function1, C0X52<BaseResponse<AuthenPreRiskResponse>> c0x52, BaseResponse<AuthenPreRiskResponse> baseResponse, String str, C1709570uaZ c1709570uaZ, C19EG c19eg, Function1<? super String, Unit> function12, InterfaceC1364105Vn<? super C1708350uYb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = function1;
        this.LLILLL = c0x52;
        this.LLILZ = baseResponse;
        this.LLILZIL = str;
        this.LLILZLL = c1709570uaZ;
        this.LLIZ = c19eg;
        this.LLIZLLLIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1708350uYb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x017c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1708350uYb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
