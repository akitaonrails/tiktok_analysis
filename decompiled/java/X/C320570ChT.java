package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ChT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel$observeMessageStatus$1", f = "MessageViewModel.kt", l = {444}, m = "invokeSuspend")
public final class C320570ChT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320570ChT(MessageViewModel messageViewModel, InterfaceC1364105Vn<? super C320570ChT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320570ChT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("MessageViewModel@2947.observeMessageStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C320610ChX c320610ChX = C320640Cha.LJIIJ;
            C320640Cha c320640Cha = this.LLILLJJLI.LLILLL;
            Integer numLJ = null;
            if (c320640Cha != null) {
                lLJFF = C2286608xc.LJFF(c320640Cha.LIZLLL);
            } else {
                lLJFF = null;
            }
            C320640Cha c320640Cha2 = this.LLILLJJLI.LLILLL;
            if (c320640Cha2 != null) {
                numLJ = C2286608xc.LJ(c320640Cha2.LJ);
            }
            C05YC c05ycLIZIZ = c320610ChX.LIZIZ(numLJ, lLJFF);
            if (c05ycLIZIZ != null) {
                AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLJJLI, 57);
                this.LL = 1;
                if (c05ycLIZIZ.collect(agS285S0100000_4, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@2947.observeMessageStatus$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageViewModel@2947.observeMessageStatus$1");
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
