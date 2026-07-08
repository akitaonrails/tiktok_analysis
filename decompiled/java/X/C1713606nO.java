package X;

import Y.AgS162S0300000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatnotice.feature.suggestedstickers.TypingRecommendationStickerDataVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06nO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.handlers.TypingRecommendationBannerHandler$subscribeStickerDataUpdate$1$1", f = "TypingRecommendationBannerHandler.kt", l = {213}, m = "invokeSuspend")
public final class C1713606nO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AssemVMLazy<InterfaceC0148002o, TypingRecommendationStickerDataVM> LLILLJJLI;
    public final /* synthetic */ C453470HqL LLILLL;
    public final /* synthetic */ C452980HpY LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713606nO(AssemVMLazy<InterfaceC0148002o, TypingRecommendationStickerDataVM> assemVMLazy, C453470HqL c453470HqL, C452980HpY c452980HpY, InterfaceC1364105Vn<? super C1713606nO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = assemVMLazy;
        this.LLILLL = c453470HqL;
        this.LLILZ = c452980HpY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1713606nO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationBannerHandler@bd7a.subscribeStickerDataUpdate$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C013C c013c = new C013C();
            AssemVMLazy<InterfaceC0148002o, TypingRecommendationStickerDataVM> assemVMLazy = this.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C452980HpY.LLJJJ;
            C2252321DDq c2252321DDq = ((TypingRecommendationStickerDataVM) assemVMLazy.getValue()).LLILLJJLI;
            AgS162S0300000_2 agS162S0300000_2 = new AgS162S0300000_2(c013c, this.LLILLL, this.LLILZ, 10);
            this.LL = 1;
            if (c2252321DDq.collect(agS162S0300000_2, this) == objLJFF) {
                C1C7U.LIZIZ("TypingRecommendationBannerHandler@bd7a.subscribeStickerDataUpdate$1$1");
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
