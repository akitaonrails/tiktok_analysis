package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18TV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.service.AiChatGenerateService$observeGenerationTimeout$1", f = "AiChatGenerateService.kt", l = {350}, m = "invokeSuspend")
public final class C18TV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ C21289618Te LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18TV(C238400w2 c238400w2, C21289618Te c21289618Te, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C18TV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c238400w2;
        this.LLILLL = c21289618Te;
        this.LLILZ = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C18TV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatGenerateService@c920.observeGenerationTimeout$1");
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
            long j = this.LLILLJJLI.element;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("AiChatGenerateService@c920.observeGenerationTimeout$1");
                return objLJFF;
            }
        }
        C21289618Te c21289618Te = this.LLILLL;
        InterfaceC21289318Tb interfaceC21289318Tb = c21289618Te.LJIIIZ;
        if (interfaceC21289318Tb != null) {
            interfaceC21289318Tb.LIZ(c21289618Te.LJIJ(this.LLILZ));
        }
        this.LLILLL.LJIJJ(new C18TP(EnumC1778730wO7.GENERATION, EnumC1778740wO8.WAITING_TIME_OUT, new C909930Zmp(null)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatGenerateService@c920.observeGenerationTimeout$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
