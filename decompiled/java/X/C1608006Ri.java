package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.06Ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.res.StreakGeckoResourceUtil$loadGeckoResource$1", f = "StreakGeckoResourceUtil.kt", l = {}, m = "invokeSuspend")
public final class C1608006Ri extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1608206Rk LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608006Ri(C1608206Rk c1608206Rk, InterfaceC1364105Vn<? super C1608006Ri> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1608206Rk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1608006Ri(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakGeckoResourceUtil@e715.loadGeckoResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1608106Rj c1608106Rj = C1608106Rj.LIZIZ;
        C1608206Rk c1608206Rk = this.LL;
        c1608106Rj.getClass();
        try {
            Forest forest = (Forest) C1608106Rj.LJFF.getValue();
            C1533910q1F c1533910q1FFetchResourceAsync = null;
            if (forest != null) {
                RequestParams requestParams = new RequestParams(null, 1, null);
                requestParams.disableBuiltin = true;
                requestParams.resourceScene = EnumC1533980q1M.OTHER;
                requestParams.enableRequestReuse = true;
                Boolean bool = Boolean.TRUE;
                requestParams.enableMemoryCache = bool;
                requestParams.enableCDNCache = bool;
                requestParams.waitGeckoUpdate = true;
                requestParams.channel = c1608206Rk.LIZ;
                requestParams.bundle = c1608206Rk.LIZIZ;
                c1533910q1FFetchResourceAsync = forest.fetchResourceAsync("", requestParams, new AwS581S0100000_2(c1608206Rk, 639));
            }
            C189200o6.m2constructorimpl(c1533910q1FFetchResourceAsync);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakGeckoResourceUtil@e715.loadGeckoResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
