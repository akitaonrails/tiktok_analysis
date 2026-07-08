package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.jsb.impl.PipoPreCheckPaymentRiskMethod$handle$1", f = "PipoPreCheckPaymentRiskMethod.kt", l = {32}, m = "invokeSuspend")
public final class C1503840pEk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ InterfaceC1503850pEl LLILLL;
    public final /* synthetic */ CompletionBlock<InterfaceC1503880pEo> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503840pEk(Activity activity, InterfaceC1503850pEl interfaceC1503850pEl, CompletionBlock<InterfaceC1503880pEo> completionBlock, InterfaceC1364105Vn<? super C1503840pEk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = activity;
        this.LLILLL = interfaceC1503850pEl;
        this.LLILZ = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1503840pEk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PipoPreCheckPaymentRiskMethod@a9cb.handle$1");
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
            C886203dE c886203dE = C886203dE.LIZ;
            Activity activity = this.LLILLJJLI;
            String payerId = this.LLILLL.getPayerId();
            String event = this.LLILLL.getEvent();
            String region = this.LLILLL.getRegion();
            String riskInfo = this.LLILLL.getRiskInfo();
            this.LL = 1;
            obj = c886203dE.LJII(activity, payerId, event, region, riskInfo, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PipoPreCheckPaymentRiskMethod@a9cb.handle$1");
                return objLJFF;
            }
        }
        CompletionBlock<InterfaceC1503880pEo> completionBlock = this.LLILZ;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1503880pEo.class, null);
        ((InterfaceC1503880pEo) xBaseModelLIZJ).setResult((String) obj);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoPreCheckPaymentRiskMethod@a9cb.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
