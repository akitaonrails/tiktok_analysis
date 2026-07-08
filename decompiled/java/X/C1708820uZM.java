package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.v3.CashierPaymentOptionInfoResp;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0uZM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.repository.CashierRepository$operator$1$cashierBasicInfo$2$1", f = "CashierRepository.kt", l = {}, m = "invokeSuspend")
public final class C1708820uZM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseResponse<CashierPaymentOptionInfoResp> LL;
    public final /* synthetic */ C1708990uZd LLILLJJLI;
    public final /* synthetic */ CashierKey LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C1708920uZW LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ C1709570uaZ LLIZ;
    public final /* synthetic */ C1708930uZX LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708820uZM(BaseResponse<CashierPaymentOptionInfoResp> baseResponse, C1708990uZd c1708990uZd, CashierKey cashierKey, C013C c013c, C1708920uZW c1708920uZW, Context context, C1709570uaZ c1709570uaZ, C1708930uZX c1708930uZX, InterfaceC1364105Vn<? super C1708820uZM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseResponse;
        this.LLILLJJLI = c1708990uZd;
        this.LLILLL = cashierKey;
        this.LLILZ = c013c;
        this.LLILZIL = c1708920uZW;
        this.LLILZLL = context;
        this.LLIZ = c1709570uaZ;
        this.LLIZLLLIL = c1708930uZX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1708820uZM(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC1631620sYq<String, String, String, Unit> interfaceC1631620sYq;
        C1709570uaZ c1709570uaZLIZJ;
        C1C7U.LIZ("CashierRepository@61ed.operator$1$cashierBasicInfo$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CashierPaymentOptionInfoResp cashierPaymentOptionInfoResp = this.LL.data;
        Unit unit = null;
        if (cashierPaymentOptionInfoResp != null && (c1709570uaZLIZJ = cashierPaymentOptionInfoResp.LIZJ(this.LLILLJJLI, this.LLILLL.payRequestId)) != null) {
            this.LLILZ.element = true;
            C1708920uZW c1708920uZW = this.LLILZIL;
            Context context = this.LLILZLL;
            C1709570uaZ c1709570uaZ = this.LLIZ;
            C1708930uZX c1708930uZX = this.LLIZLLLIL;
            c1708920uZW.getClass();
            C1708920uZW.LIZ(context, c1709570uaZ, c1709570uaZLIZJ, c1708930uZX);
            unit = Unit.LIZ;
        } else {
            C1708710uZB.LIZ("Cashier").LIZ(6, "Fail to generate final v3 data");
            C1708930uZX c1708930uZX2 = this.LLIZLLLIL;
            if (c1708930uZX2 != null && (interfaceC1631620sYq = c1708930uZX2.LIZIZ) != null) {
                BaseResponse<CashierPaymentOptionInfoResp> baseResponse = this.LL;
                interfaceC1631620sYq.invoke(baseResponse.errorCode, baseResponse.errorContent, baseResponse.pipoErrorAction);
                unit = Unit.LIZ;
            }
        }
        C1C7U.LIZIZ("CashierRepository@61ed.operator$1$cashierBasicInfo$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
