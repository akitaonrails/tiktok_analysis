package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CUE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.newinstall.manager.EcUgFirstLaunchManager$checkShopTabStatusAfterLogin$1$1", f = "EcUgFirstLaunchManager.kt", l = {}, m = "invokeSuspend")
public final class C0CUE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ HomeTabAbility LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CUE(HomeTabAbility homeTabAbility, InterfaceC1364105Vn<? super C0CUE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = homeTabAbility;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CUE(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgFirstLaunchManager@5b6d.checkShopTabStatusAfterLogin$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        HomeTabAbility homeTabAbility = this.LL;
        try {
            EnumC1585090rLn enumC1585090rLn = EnumC1585090rLn.NUJ;
            homeTabAbility.Gx0(enumC1585090rLn);
            homeTabAbility.g62(enumC1585090rLn);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgFirstLaunchManager@5b6d.checkShopTabStatusAfterLogin$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
