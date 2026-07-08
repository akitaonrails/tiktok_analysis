package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ui.TakoChatFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.preload.TakoViewPreload$preloadClassAsync$1", f = "TakoViewPreload.kt", l = {}, m = "invokeSuspend")
public final class C0CRF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C0CRF(InterfaceC1364105Vn<? super C0CRF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CRF c0crf = new C0CRF(interfaceC1364105Vn);
        c0crf.LL = obj;
        return c0crf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoViewPreload@2e88.preloadClassAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (!((Boolean) C0B17.LIZ.getValue()).booleanValue()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoViewPreload@2e88.preloadClassAsync$1");
            return unit;
        }
        if (!C1858450ySh.LIZIZ.compareAndSet(false, true)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TakoViewPreload@2e88.preloadClassAsync$1");
            return unit2;
        }
        C189200o6.m2constructorimpl(new TakoChatFragment());
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TakoViewPreload@2e88.preloadClassAsync$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
