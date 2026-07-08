package X;

import com.bytedance.android.starship.strategy.option.StrategyStabilityConfig;
import com.bytedance.android.starship.wrapper.StarshipWrapper2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.option.StrategyStabilityOption$trigger$2", f = "StrategyStabilityOption.kt", l = {}, m = "invokeSuspend")
public final class C1308050k8x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1308050k8x(InterfaceC1364105Vn<? super C1308050k8x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1308050k8x(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StrategyStabilityOption@d9ff.trigger$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1308060k8y.LIZ.getClass();
        C1308060k8y.LJII.getValue();
        try {
            for (StrategyStabilityConfig strategyStabilityConfig : (List) C1D1Q.LIZJ.getValue()) {
                if (C1308060k8y.LIZIZ >= 2 || strategyStabilityConfig.allowColdStart) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str = strategyStabilityConfig.name;
                    String str2 = strategyStabilityConfig.params;
                    int i = strategyStabilityConfig.option;
                    int i2 = strategyStabilityConfig.location;
                    StarshipWrapper2.Companion.getClass();
                    String strRunStrategy = StarshipWrapper2.runStrategy(0, str, str2, i, i2);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C1308060k8y c1308060k8y = C1308060k8y.LIZ;
                    String str3 = strategyStabilityConfig.name;
                    c1308060k8y.getClass();
                    C1308060k8y.LIZ(jCurrentTimeMillis2, str3, strRunStrategy);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1308060k8y.LIZJ.set(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StrategyStabilityOption@d9ff.trigger$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1308050k8x(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
