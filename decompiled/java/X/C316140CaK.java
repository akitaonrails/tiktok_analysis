package X;

import Y.AgS307S0100000_27;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$observeSugList$1", f = "MessageViewModel.kt", l = {2203}, m = "invokeSuspend")
public final class C316140CaK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316140CaK(boolean z, MessageViewModel messageViewModel, InterfaceC1364105Vn<? super C316140CaK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316140CaK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDr;
        C1863380yae c1863380yae;
        C1C7U.LIZ("MessageViewModel@9229.observeSugList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI && (c1863380yae = this.LLILLL.LLJJJJ) != null) {
                c1863380yae.LJIJ = C09IR.LIZIZ(20, 20, null, 4);
            }
            MessageViewModel messageViewModel = this.LLILLL;
            C1863380yae c1863380yae2 = messageViewModel.LLJJJJ;
            if (c1863380yae2 != null && (c2252331DDr = c1863380yae2.LJIJ) != null) {
                AgS307S0100000_27 agS307S0100000_27 = new AgS307S0100000_27(messageViewModel, 1);
                this.LL = 1;
                if (C2252331DDr.LJIIJ(c2252331DDr, agS307S0100000_27, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.observeSugList$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageViewModel@9229.observeSugList$1");
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
