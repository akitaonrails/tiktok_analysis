package X;

import com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentResponse;
import com.bytedance.pipo.verify.base.model.response.DoVerifyResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import com.ss.android.ugc.aweme.verify.id.IDVerifyVM;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ujH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.id.IDVerifyVM$verify$2$1", f = "IDVerifyVM.kt", l = {}, m = "invokeSuspend")
public final class C1714970ujH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IDVerifyVM LL;
    public final /* synthetic */ BaseResponse<DoVerifyResponse> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714970ujH(IDVerifyVM iDVerifyVM, BaseResponse<DoVerifyResponse> baseResponse, long j, String str, InterfaceC1364105Vn<? super C1714970ujH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iDVerifyVM;
        this.LLILLJJLI = baseResponse;
        this.LLILLL = j;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1714970ujH(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("IDVerifyVM@e43a.verify$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IDVerifyVM iDVerifyVM = this.LL;
        C1714660uim c1714660uim = iDVerifyVM.LLILLJJLI;
        if (c1714660uim != null) {
            C1714660uim.LIZLLL(c1714660uim, this.LLILLJJLI, iDVerifyVM.LLILZ, this.LLILLL, 8);
        }
        C1714180ui0 c1714180ui0 = this.LL.LLILLL;
        if (c1714180ui0 != null) {
            c1714180ui0.LJ("manual", C2097908Jt.LIZJ(new Pair("input_length", String.valueOf(this.LLILZ.length()))));
        }
        BaseResponse<DoVerifyResponse> baseResponse = this.LLILLJJLI;
        if (baseResponse != null) {
            str = baseResponse.resultCode;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "success")) {
            this.LL.setState(new AwS605S0100000_26(this.LLILLJJLI, (BaseResponse<SubmitPaymentResponse>) 589));
        } else {
            this.LL.setState(new AwS605S0100000_26(this.LLILLJJLI, (BaseResponse<SubmitPaymentResponse>) 590));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IDVerifyVM@e43a.verify$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
