package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFFeedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0hpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.assems.mainfragment.MFFeedAssem$doOnLaunchOnViewCreated$1", f = "MFFeedAssem.kt", l = {}, m = "invokeSuspend")
public final class C1218910hpB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MFFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218910hpB(MFFeedAssem mFFeedAssem, InterfaceC1364105Vn<? super C1218910hpB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mFFeedAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1218910hpB(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0haR] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0hpC] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MFFeedAssem@a8b8.doOnLaunchOnViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C128Y currentFragment = this.LL.getCurrentFragment();
        if (currentFragment != null && (currentFragment instanceof InterfaceC1566480qrm)) {
            InterfaceC1146704e9 interfaceC1146704e9Os = ((InterfaceC1566480qrm) currentFragment).Os();
            final boolean z = !Intrinsics.LJFF("", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase());
            if (interfaceC1146704e9Os instanceof InterfaceC1218930hpD) {
                final InterfaceC1218930hpD interfaceC1218930hpD = (InterfaceC1218930hpD) interfaceC1146704e9Os;
                interfaceC1218930hpD.LJJIL(new InterfaceC1218940hpE() { // from class: X.0hpC
                    @Override // X.InterfaceC1218940hpE
                    public final void LL() {
                        if (((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false) && z) {
                            interfaceC1218930hpD.go();
                        }
                    }
                });
            } else if (interfaceC1146704e9Os instanceof DetailFragmentPanel) {
                final InterfaceC1209760haQ interfaceC1209760haQ = (InterfaceC1209760haQ) interfaceC1146704e9Os;
                interfaceC1209760haQ.RA2(new InterfaceC1209280hZe() { // from class: X.0haR
                    @Override // X.InterfaceC1209280hZe
                    public final void LL() {
                        if (((IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class)).shouldShowForcedLogin(false) && z) {
                            interfaceC1209760haQ.go();
                        }
                    }
                });
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MFFeedAssem@a8b8.doOnLaunchOnViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
