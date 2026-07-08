package X;

import Y.AgS285S0100000_4;
import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallDialog;
import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.PaywallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallDialog$initObserver$2$1", f = "EnigmaPaywallDialog.kt", l = {375}, m = "invokeSuspend")
public final class C319070Cf3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnigmaPaywallDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319070Cf3(EnigmaPaywallDialog enigmaPaywallDialog, InterfaceC1364105Vn<? super C319070Cf3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enigmaPaywallDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319070Cf3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0950 anonymousClass0950;
        C1C7U.LIZ("EnigmaPaywallDialog@c3ab.initObserver$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            EnigmaPaywallDialog enigmaPaywallDialog = this.LLILLJJLI;
            PaywallViewModel paywallViewModel = enigmaPaywallDialog.LLLFF;
            if (paywallViewModel != null && (anonymousClass0950 = paywallViewModel.LLJILJIL) != null) {
                AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(enigmaPaywallDialog, 9);
                this.LL = 1;
                if (anonymousClass0950.collect(agS285S0100000_4, this) == objLJFF) {
                    C1C7U.LIZIZ("EnigmaPaywallDialog@c3ab.initObserver$2$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EnigmaPaywallDialog@c3ab.initObserver$2$1");
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
