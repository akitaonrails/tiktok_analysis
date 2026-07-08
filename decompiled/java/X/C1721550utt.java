package X;

import com.bytedance.pipo.ttpay.recharge.RechargeViewmodel;
import com.bytedance.pipo.ttpay.recharge.network.ConsultResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0utt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.recharge.RechargeViewmodel$consultRecharge$2$1$3", f = "RechargeViewmodel.kt", l = {}, m = "invokeSuspend")
public final class C1721550utt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RechargeViewmodel LL;
    public final /* synthetic */ C0X52<BaseResponse<ConsultResponse>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721550utt(RechargeViewmodel rechargeViewmodel, C0X52<BaseResponse<ConsultResponse>> c0x52, InterfaceC1364105Vn<? super C1721550utt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = rechargeViewmodel;
        this.LLILLJJLI = c0x52;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1721550utt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        BaseResponse<ConsultResponse> baseResponse;
        ConsultResponse consultResponse;
        C1C7U.LIZ("RechargeViewmodel@cc63.consultRecharge$2$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RechargeViewmodel rechargeViewmodel = this.LL;
        EnumC488160JCk enumC488160JCk = EnumC488160JCk.ERROR;
        C1721650uu3 c1721650uu3 = EnumC1721510utp.Companion;
        C0X52<BaseResponse<ConsultResponse>> c0x52 = this.LLILLJJLI;
        if (c0x52 != null && (baseResponse = c0x52.LIZIZ) != null && (consultResponse = baseResponse.data) != null) {
            str = consultResponse.consultResult;
        } else {
            str = null;
        }
        c1721650uu3.getClass();
        rechargeViewmodel.DQ2(enumC488160JCk, C1721650uu3.LIZ(str));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargeViewmodel@cc63.consultRecharge$2$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
