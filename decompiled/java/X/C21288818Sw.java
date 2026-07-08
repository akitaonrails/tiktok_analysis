package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.18Sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.onboarding.AiChatOnboardingComponent$init$1$2", f = "AiChatOnboardingComponent.kt", l = {}, m = "invokeSuspend")
public final class C21288818Sw extends C09AX implements Function2<InterfaceC1157570gEF<? extends C909930Zmp>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1157570gEF<List<C342360DbW>> LLILLJJLI;
    public final /* synthetic */ C18U9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21288818Sw(InterfaceC1157570gEF<? extends List<C342360DbW>> interfaceC1157570gEF, C18U9 c18u9, InterfaceC1364105Vn<? super C21288818Sw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1157570gEF;
        this.LLILLL = c18u9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21288818Sw c21288818Sw = new C21288818Sw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c21288818Sw.LL = obj;
        return c21288818Sw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatOnboardingComponent@20e1.init$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1157570gEF interfaceC1157570gEF = (InterfaceC1157570gEF) this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init: lastMessageState= ");
        sbLIZ.append(interfaceC1157570gEF);
        C21290818Tq.LIZJ("CreationChatOnboarding", C2188811AlT.LIZIZ(sbLIZ));
        if (!(interfaceC1157570gEF instanceof C1157450gE3)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AiChatOnboardingComponent@20e1.init$1$2");
            return unit;
        }
        C869590Y9l c869590Y9l = ((C909930Zmp) ((C1157450gE3) interfaceC1157570gEF).LIZ).LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init: getLandingMsgs= ");
        sbLIZ2.append(this.LLILLJJLI);
        C21290818Tq.LIZJ("CreationChatOnboarding", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC1157570gEF<List<C342360DbW>> interfaceC1157570gEF2 = this.LLILLJJLI;
        if (!Intrinsics.LJFF(interfaceC1157570gEF2, C1157780gEa.LIZ)) {
            if (interfaceC1157570gEF2 instanceof C1155990gBh) {
                C21290818Tq.LIZIZ("CreationChatOnboarding", "init: load onboarding message failed", null);
            } else if (!(interfaceC1157570gEF2 instanceof C1157580gEG)) {
                if (interfaceC1157570gEF2 instanceof C1157450gE3) {
                    if (this.LLILLL.w2(c869590Y9l)) {
                        this.LLILLL.H2((List) ((C1157450gE3) this.LLILLJJLI).LIZ);
                    } else {
                        this.LLILLL.o2();
                    }
                } else {
                    throw new C1954807lC();
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatOnboardingComponent@20e1.init$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends C909930Zmp> interfaceC1157570gEF, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
