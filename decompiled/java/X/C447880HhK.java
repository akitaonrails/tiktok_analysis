package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.typingrecommendation.TypingRecommendationPanelAssem$startDraftWaitTimer$1", f = "TypingRecommendationPanelAssem.kt", l = {775}, m = "invokeSuspend")
public final class C447880HhK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TypingRecommendationPanelAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447880HhK(TypingRecommendationPanelAssem typingRecommendationPanelAssem, InterfaceC1364105Vn<? super C447880HhK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = typingRecommendationPanelAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447880HhK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationPanelAssem@d8fd.startDraftWaitTimer$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("TypingRecommendationPanelAssem@d8fd.startDraftWaitTimer$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.mo(C447890HhL.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TypingRecommendationPanelAssem@d8fd.startDraftWaitTimer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
