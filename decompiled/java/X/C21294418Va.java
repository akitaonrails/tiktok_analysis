package X;

import Y.AgS310S0100000_32;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18Va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.component.AiChatInputFeatureComponent$onCreate$1", f = "AiChatInputFeatureComponent.kt", l = {192}, m = "invokeSuspend")
public final class C21294418Va extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C18VZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21294418Va(C18VZ c18vz, InterfaceC1364105Vn<? super C21294418Va> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c18vz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21294418Va(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<AIChatGenPrompt> c05ydUM;
        C1C7U.LIZ("AiChatInputFeatureComponent@26d0.onCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC21295718Vn interfaceC21295718VnT5 = this.LLILLJJLI.t5();
            if (interfaceC21295718VnT5 != null && (c05ydUM = interfaceC21295718VnT5.uM()) != null) {
                AgS310S0100000_32 agS310S0100000_32 = new AgS310S0100000_32(this.LLILLJJLI, 1);
                this.LL = 1;
                if (c05ydUM.collect(agS310S0100000_32, this) == objLJFF) {
                    C1C7U.LIZIZ("AiChatInputFeatureComponent@26d0.onCreate$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AiChatInputFeatureComponent@26d0.onCreate$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
