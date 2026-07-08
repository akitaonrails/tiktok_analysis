package X;

import Y.AgS305S0100000_25;
import com.ss.android.ugc.aweme.account.pin.CreateOrResetPINFragment;
import com.ss.android.ugc.aweme.account.pin.CreateOrResetPINViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.pin.CreateOrResetPINFragment$onCreateView$1$1", f = "CreateOrResetPINFragment.kt", l = {83}, m = "invokeSuspend")
public final class C756040TlC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreateOrResetPINFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C756040TlC(CreateOrResetPINFragment createOrResetPINFragment, InterfaceC1364105Vn<? super C756040TlC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = createOrResetPINFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C756040TlC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateOrResetPINFragment@6a4a.onCreateView$1$1");
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
            InterfaceC346201Wa<AbstractC1682720ttG> interfaceC346201Wa = ((CreateOrResetPINViewModel) this.LLILLJJLI.LLIZLLLIL.getValue()).LLILZ;
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLJJLI, 5);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("CreateOrResetPINFragment@6a4a.onCreateView$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreateOrResetPINFragment@6a4a.onCreateView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
