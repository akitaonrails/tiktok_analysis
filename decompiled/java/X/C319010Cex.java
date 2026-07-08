package X;

import Y.AgS195S0200000_4;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.network.ITakoNetworkGate;
import com.ss.android.ugc.aweme.tako.network.TakoNetworkState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$startSwitchConvNetworkWatch$2", f = "MessageViewModel.kt", l = {793}, m = "invokeSuspend")
public final class C319010Cex extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ITakoNetworkGate LLILLJJLI;
    public final /* synthetic */ C259800zU<TakoNetworkState> LLILLL;
    public final /* synthetic */ MessageViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319010Cex(ITakoNetworkGate iTakoNetworkGate, C259800zU<TakoNetworkState> c259800zU, MessageViewModel messageViewModel, InterfaceC1364105Vn<? super C319010Cex> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iTakoNetworkGate;
        this.LLILLL = c259800zU;
        this.LLILZ = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319010Cex(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.startSwitchConvNetworkWatch$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 state = this.LLILLJJLI.getState();
            AgS195S0200000_4 agS195S0200000_4 = new AgS195S0200000_4(this.LLILLL, this.LLILZ, 1);
            this.LL = 1;
            if (state.collect(agS195S0200000_4, this) == objLJFF) {
                C1C7U.LIZIZ("MessageViewModel@9229.startSwitchConvNetworkWatch$2");
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
