package X;

import Y.AgS195S0200000_4;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.vm.TakoChatBotSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$observeWaitingStatus$1", f = "MessageViewModel.kt", l = {1277}, m = "invokeSuspend")
public final class C319660Cg0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ TakoChatBotSharedViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319660Cg0(MessageViewModel messageViewModel, TakoChatBotSharedViewModel takoChatBotSharedViewModel, InterfaceC1364105Vn<? super C319660Cg0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = takoChatBotSharedViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319660Cg0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        Integer numLJ;
        C1C7U.LIZ("MessageViewModel@9229.observeWaitingStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1863420yai c1863420yai = C1863380yae.LJJII;
            C1863380yae c1863380yae = this.LLILLJJLI.LLJJJJ;
            String str = null;
            if (c1863380yae != null) {
                lLJFF = C2286608xc.LJFF(c1863380yae.LJII);
            } else {
                lLJFF = null;
            }
            C1863380yae c1863380yae2 = this.LLILLJJLI.LLJJJJ;
            if (c1863380yae2 != null) {
                numLJ = C2286608xc.LJ(c1863380yae2.LJIIIIZZ);
            } else {
                numLJ = null;
            }
            C1863380yae c1863380yae3 = this.LLILLJJLI.LLJJJJ;
            if (c1863380yae3 != null) {
                str = c1863380yae3.LJIILIIL;
            }
            InterfaceC332260D0u interfaceC332260D0uLIZLLL = c1863420yai.LIZLLL(numLJ, lLJFF, str);
            if (interfaceC332260D0uLIZLLL != null) {
                AgS195S0200000_4 agS195S0200000_4 = new AgS195S0200000_4(this.LLILLJJLI, this.LLILLL, 0);
                this.LL = 1;
                if (interfaceC332260D0uLIZLLL.collect(agS195S0200000_4, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.observeWaitingStatus$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageViewModel@9229.observeWaitingStatus$1");
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
