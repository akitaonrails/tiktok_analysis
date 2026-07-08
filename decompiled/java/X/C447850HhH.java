package X;

import Y.AgS287S0100000_6;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem;
import com.ss.android.ugc.aweme.im.viewmodel.MentionPanelStateViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem$observeVisibilityInputs$1", f = "TypingRecommendationPanelAssem.kt", l = {281}, m = "invokeSuspend")
public final class C447850HhH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TypingRecommendationPanelAssem LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<EnumC430090Gtj> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C447850HhH(TypingRecommendationPanelAssem typingRecommendationPanelAssem, InterfaceC346201Wa<? extends EnumC430090Gtj> interfaceC346201Wa, InterfaceC1364105Vn<? super C447850HhH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = typingRecommendationPanelAssem;
        this.LLILLL = interfaceC346201Wa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447850HhH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationPanelAssem@d8fd.observeVisibilityInputs$1");
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
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLILZLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TypingRecommendationPanelAssem.LLJJL;
            C515901zh c515901zhLJIIIZ = C09IC.LJIIIZ(((PanelStateViewModel) assemVMLazy.getValue()).LLIZ, this.LLILLJJLI.uo().BQ2(), ((MentionPanelStateViewModel) this.LLILLJJLI.LLILZIL.getValue()).LLILLJJLI, this.LLILLL, new C447260HgK(null));
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 69);
            this.LL = 1;
            if (c515901zhLJIIIZ.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("TypingRecommendationPanelAssem@d8fd.observeVisibilityInputs$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TypingRecommendationPanelAssem@d8fd.observeVisibilityInputs$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
