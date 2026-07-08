package X;

import Y.AgS73S0400000_6;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.viewmodel.ITypingRecommendationVM;
import com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06nP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.handlers.TypingRecommendationBannerHandler$subscribeDataUpdate$1$1", f = "TypingRecommendationBannerHandler.kt", l = {243}, m = "invokeSuspend")
public final class C1713706nP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AssemVMLazy<InterfaceC0148002o, ITypingRecommendationVM> LLILLL;
    public final /* synthetic */ C452950HpV LLILZ;
    public final /* synthetic */ C452980HpY LLILZIL;
    public final /* synthetic */ C453470HqL LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713706nP(AssemVMLazy<InterfaceC0148002o, ITypingRecommendationVM> assemVMLazy, C452950HpV c452950HpV, C452980HpY c452980HpY, C453470HqL c453470HqL, InterfaceC1364105Vn<? super C1713706nP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = assemVMLazy;
        this.LLILZ = c452950HpV;
        this.LLILZIL = c452980HpY;
        this.LLILZLL = c453470HqL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1713706nP c1713706nP = new C1713706nP(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1713706nP.LLILLJJLI = obj;
        return c1713706nP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationBannerHandler@bd7a.subscribeDataUpdate$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AssemVMLazy<InterfaceC0148002o, ITypingRecommendationVM> assemVMLazy = this.LLILLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C452980HpY.LLJJJ;
            C2252321DDq c2252321DDq = ((TypingRecommendationVM) ((ITypingRecommendationVM) assemVMLazy.getValue())).LLILLL.LIZIZ;
            AgS73S0400000_6 agS73S0400000_6 = new AgS73S0400000_6(this.LLILZ, this.LLILZIL, interfaceC497601wk, this.LLILZLL, 6);
            this.LL = 1;
            if (c2252321DDq.collect(agS73S0400000_6, this) == objLJFF) {
                C1C7U.LIZIZ("TypingRecommendationBannerHandler@bd7a.subscribeDataUpdate$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
