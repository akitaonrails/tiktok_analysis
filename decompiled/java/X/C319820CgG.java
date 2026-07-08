package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel$observeCommerceAgentInit$1", f = "MessageViewModel.kt", l = {199}, m = "invokeSuspend")
public final class C319820CgG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319820CgG(MessageViewModel messageViewModel, InterfaceC1364105Vn<? super C319820CgG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319820CgG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDr;
        C1C7U.LIZ("MessageViewModel@2947.observeCommerceAgentInit$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            MessageViewModel messageViewModel = this.LLILLJJLI;
            C320640Cha c320640Cha = messageViewModel.LLILLL;
            if (c320640Cha != null && (c2252331DDr = c320640Cha.LJIIIIZZ) != null) {
                AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(messageViewModel, 56);
                this.LL = 1;
                if (C2252331DDr.LJIIJ(c2252331DDr, agS285S0100000_4, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@2947.observeCommerceAgentInit$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageViewModel@2947.observeCommerceAgentInit$1");
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
