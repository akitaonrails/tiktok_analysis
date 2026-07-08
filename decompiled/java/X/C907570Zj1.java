package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.CombinedSearchContentEngine$clear$1", f = "SupervisorSearchContentUpdateEngine.kt", l = {}, m = "invokeSuspend")
public final class C907570Zj1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C907600Zj4 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907570Zj1(C907600Zj4 c907600Zj4, InterfaceC1364105Vn<? super C907570Zj1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c907600Zj4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C907570Zj1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CombinedSearchContentEngine@35ee.clear$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C23250099c.LJ(C23271099x.INSTANCE, new C907580Zj2(this.LL, null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2296808zG.LIZJ(this.LL.LIZIZ(), null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CombinedSearchContentEngine@35ee.clear$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
