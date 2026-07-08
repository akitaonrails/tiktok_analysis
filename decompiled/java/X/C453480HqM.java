package X;

import Y.AgS287S0100000_6;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatnotice.feature.suggestedstickers.TypingRecommendationStickerDataVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationBannerReusedUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationBannerReusedUISlotAssem$subscribeToDataUpdates$1", f = "TypingRecommendationBannerViewHolder.kt", l = {122}, m = "invokeSuspend")
public final class C453480HqM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TypingRecommendationBannerReusedUISlotAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C453480HqM(TypingRecommendationBannerReusedUISlotAssem typingRecommendationBannerReusedUISlotAssem, InterfaceC1364105Vn<? super C453480HqM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = typingRecommendationBannerReusedUISlotAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C453480HqM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationBannerReusedUISlotAssem@5190.subscribeToDataUpdates$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TypingRecommendationBannerReusedUISlotAssem.LLJLLIL;
            C2252321DDq c2252321DDq = ((TypingRecommendationStickerDataVM) assemVMLazy.getValue()).LLILLJJLI;
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 180);
            this.LL = 1;
            if (c2252321DDq.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("TypingRecommendationBannerReusedUISlotAssem@5190.subscribeToDataUpdates$1");
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
