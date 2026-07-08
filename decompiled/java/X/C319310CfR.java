package X;

import Y.AgS309S0100000_31;
import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallFragment;
import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.PaywallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallFragment$bindEvents$1$1", f = "EnigmaPaywallFragment.kt", l = {265}, m = "invokeSuspend")
public final class C319310CfR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnigmaPaywallFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319310CfR(EnigmaPaywallFragment enigmaPaywallFragment, InterfaceC1364105Vn<? super C319310CfR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enigmaPaywallFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319310CfR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0950 anonymousClass0950;
        C1C7U.LIZ("EnigmaPaywallFragment@49a1.bindEvents$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            EnigmaPaywallFragment enigmaPaywallFragment = this.LLILLJJLI;
            PaywallViewModel paywallViewModel = enigmaPaywallFragment.LL;
            if (paywallViewModel != null && (anonymousClass0950 = paywallViewModel.LLJILJIL) != null) {
                AgS309S0100000_31 agS309S0100000_31 = new AgS309S0100000_31(enigmaPaywallFragment, 1);
                this.LL = 1;
                if (anonymousClass0950.collect(agS309S0100000_31, this) == objLJFF) {
                    C1C7U.LIZIZ("EnigmaPaywallFragment@49a1.bindEvents$1$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EnigmaPaywallFragment@49a1.bindEvents$1$1");
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
