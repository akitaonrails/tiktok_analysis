package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.risk.AuthenPreRiskResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CCDCAddCardViewModel$doRealBindCcdc$1$1$1$1", f = "CCDCAddCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1708360uYc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0X52<BaseResponse<AuthenPreRiskResponse>> LLILLJJLI;
    public final /* synthetic */ BaseResponse<AuthenPreRiskResponse> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CCDCAddCardViewModel LLILZIL;
    public final /* synthetic */ List<POPayElement> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708360uYc(C0X52<BaseResponse<AuthenPreRiskResponse>> c0x52, BaseResponse<AuthenPreRiskResponse> baseResponse, String str, CCDCAddCardViewModel cCDCAddCardViewModel, List<POPayElement> list, InterfaceC1364105Vn<? super C1708360uYc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0x52;
        this.LLILLL = baseResponse;
        this.LLILZ = str;
        this.LLILZIL = cCDCAddCardViewModel;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1708360uYc c1708360uYc = new C1708360uYc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1708360uYc.LL = obj;
        return c1708360uYc;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1708360uYc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
