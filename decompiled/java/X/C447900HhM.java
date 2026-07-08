package X;

import Y.AgS165S0300000_6;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem$subscribeToPanelState$1", f = "TypingRecommendationPanelAssem.kt", l = {299}, m = "invokeSuspend")
public final class C447900HhM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TypingRecommendationPanelAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447900HhM(TypingRecommendationPanelAssem typingRecommendationPanelAssem, InterfaceC1364105Vn<? super C447900HhM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = typingRecommendationPanelAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447900HhM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationPanelAssem@d8fd.subscribeToPanelState$1");
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
            C259800zU c259800zU = new C259800zU();
            TypingRecommendationPanelAssem typingRecommendationPanelAssem = this.LLILLJJLI;
            AnonymousClass0951 anonymousClass0951 = typingRecommendationPanelAssem.LLJILJIL;
            AgS165S0300000_6 agS165S0300000_6 = new AgS165S0300000_6(c259800zU, c013c, typingRecommendationPanelAssem, 0);
            this.LL = 1;
            if (anonymousClass0951.collect(agS165S0300000_6, this) == objLJFF) {
                C1C7U.LIZIZ("TypingRecommendationPanelAssem@d8fd.subscribeToPanelState$1");
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
