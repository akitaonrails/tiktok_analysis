package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.preload.TakoViewPreload$preloadBaseAssemSubclassesAsync$1", f = "TakoViewPreload.kt", l = {}, m = "invokeSuspend")
public final class C315090CWt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C315090CWt(InterfaceC1364105Vn<? super C315090CWt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C315090CWt c315090CWt = new C315090CWt(interfaceC1364105Vn);
        c315090CWt.LL = obj;
        return c315090CWt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoViewPreload@2e88.preloadBaseAssemSubclassesAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (((Boolean) C0AXG.LIZ.getValue()).booleanValue()) {
            C1858450ySh.LIZ.getClass();
            if (TakoEnterMethodListExperiment.LIZ(false)) {
                if (!C1858450ySh.LIZJ.compareAndSet(false, true)) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoViewPreload@2e88.preloadBaseAssemSubclassesAsync$1");
                    return unit;
                }
                for (C13IQ<?> c13iq : C1858190ySH.LIZ) {
                    Class.forName(C09R7.LIZ(c13iq).getName(), false, C09R7.LIZ(c13iq).getClassLoader());
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TakoViewPreload@2e88.preloadBaseAssemSubclassesAsync$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TakoViewPreload@2e88.preloadBaseAssemSubclassesAsync$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
