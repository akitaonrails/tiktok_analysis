package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaService;
import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.EnigmaPaywallDialog;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.enigma.EnigmaService$openEnigmaPaywall$1", f = "EnigmaService.kt", l = {}, m = "invokeSuspend")
public final class C482020IvI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnigmaService LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ FragmentManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482020IvI(EnigmaService enigmaService, Bundle bundle, FragmentManager fragmentManager, InterfaceC1364105Vn<? super C482020IvI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enigmaService;
        this.LLILLJJLI = bundle;
        this.LLILLL = fragmentManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C482020IvI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLIZ;
        C1C7U.LIZ("EnigmaService@185c.openEnigmaPaywall$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnigmaService enigmaService = this.LL;
        Bundle bundle = this.LLILLJJLI;
        enigmaService.getClass();
        EnigmaPaywallDialog enigmaPaywallDialog = new EnigmaPaywallDialog();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIIZI(bundle2, bundle, "arg_enigma_paywall_results");
        enigmaPaywallDialog.setArguments(bundle2);
        FragmentManager fragmentManager = this.LLILLL;
        IHostPad iHostPad = (IHostPad) C1161920gLG.LIZJ(IHostPad.class);
        if (iHostPad != null) {
            iLIZ = C467770IVz.LIZ(iHostPad);
        } else {
            iLIZ = 0;
        }
        C19322110iZ.LJFF(fragmentManager, enigmaPaywallDialog, "enigma_paywal_dialog", null, iLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnigmaService@185c.openEnigmaPaywall$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
