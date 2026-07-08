package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.AbsECLiveExplanationCardWidget$getIntroduceProductResponseV2$2$onResponse$2$2", f = "AbsECLiveExplanationCardWidget.kt", l = {2160}, m = "invokeSuspend")
public final class C1735590vGX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ AbstractC21194217wq LLILLL;
    public final /* synthetic */ PopProductResp LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ ECommerceMessage LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735590vGX(boolean z, AbstractC21194217wq abstractC21194217wq, PopProductResp popProductResp, String str, boolean z2, ECommerceMessage eCommerceMessage, boolean z3, boolean z4, InterfaceC1364105Vn<? super C1735590vGX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = abstractC21194217wq;
        this.LLILZ = popProductResp;
        this.LLILZIL = str;
        this.LLILZLL = z2;
        this.LLIZ = eCommerceMessage;
        this.LLIZLLLIL = z3;
        this.LLJ = z4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735590vGX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsECLiveExplanationCardWidget@7dc4.getIntroduceProductResponseV2$2$onResponse$2$2");
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
                    C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.getIntroduceProductResponseV2$2$onResponse$2$2");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.LJJJJI(this.LLILZ, this.LLILZIL, this.LLILZLL, false, this.LLIZ, this.LLIZLLLIL, this.LLJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.getIntroduceProductResponseV2$2$onResponse$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
