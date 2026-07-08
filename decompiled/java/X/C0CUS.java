package X;

import android.os.SystemClock;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CUS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.newinstall.manager.EcUgFirstLaunchManager$updateTabs$1$1$1", f = "EcUgFirstLaunchManager.kt", l = {}, m = "invokeSuspend")
public final class C0CUS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ HomeTabAbility LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CUS(HomeTabAbility homeTabAbility, long j, InterfaceC1364105Vn<? super C0CUS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = homeTabAbility;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CUS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgFirstLaunchManager@5b6d.updateTabs$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        HomeTabAbility homeTabAbility = this.LL;
        long j = this.LLILLJJLI;
        try {
            EnumC1585090rLn enumC1585090rLn = EnumC1585090rLn.NUJ;
            homeTabAbility.Gx0(enumC1585090rLn);
            homeTabAbility.g62(enumC1585090rLn);
            if (homeTabAbility.zd1()) {
                C340370DVz c340370DVz = C340370DVz.LIZ;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                c340370DVz.getClass();
                C340370DVz.LIZIZ(jElapsedRealtime, "show bottom success", true);
                C314380CUa.LIZIZ = true;
            } else {
                C340370DVz c340370DVz2 = C340370DVz.LIZ;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                c340370DVz2.getClass();
                C340370DVz.LIZIZ(jElapsedRealtime2, "show bottom fail", false);
            }
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
        C1C7U.LIZIZ("EcUgFirstLaunchManager@5b6d.updateTabs$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
