package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatActionBarComponent$init$1", f = "AiChatActionBarComponent.kt", l = {93}, m = "invokeSuspend")
public final class C432340GxM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21287718Sl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432340GxM(C21287718Sl c21287718Sl, InterfaceC1364105Vn<? super C432340GxM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21287718Sl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432340GxM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatActionBarComponent@6a99.init$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C21287718Sl c21287718Sl = this.LLILLJJLI;
            InterfaceC332260D0u<AIChatGenPrompt> interfaceC332260D0u = c21287718Sl.LLJJIJI;
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(c21287718Sl, 106);
            this.LL = 1;
            if (interfaceC332260D0u.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("AiChatActionBarComponent@6a99.init$1");
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
