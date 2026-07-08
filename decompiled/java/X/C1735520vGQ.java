package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.AbsUsECLiveExplanationCardWidget$getIntroduceProductResponseV2$2$onResponse$2$2", f = "AbsUsECLiveExplanationCardWidget.kt", l = {2109}, m = "invokeSuspend")
public final class C1735520vGQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ AbstractC21194117wp LLILLL;
    public final /* synthetic */ PopProductResp LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ ECommerceMessage LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735520vGQ(boolean z, AbstractC21194117wp abstractC21194117wp, PopProductResp popProductResp, boolean z2, ECommerceMessage eCommerceMessage, boolean z3, InterfaceC1364105Vn<? super C1735520vGQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = abstractC21194117wp;
        this.LLILZ = popProductResp;
        this.LLILZIL = z2;
        this.LLILZLL = eCommerceMessage;
        this.LLIZ = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735520vGQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsUsECLiveExplanationCardWidget@dce0.getIntroduceProductResponseV2$2$onResponse$2$2");
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
            if (this.LLILLJJLI) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(400L, this) == objLJFF) {
                    C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.getIntroduceProductResponseV2$2$onResponse$2$2");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.LJJJJI(this.LLILZ, this.LLILZIL, false, this.LLILZLL, this.LLIZ, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.getIntroduceProductResponseV2$2$onResponse$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
