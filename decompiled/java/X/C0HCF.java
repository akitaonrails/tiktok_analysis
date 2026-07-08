package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HCF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.source.neo.action.UpdateSearchOuterFlowExposedSetActionKt$recordOuterFlowExposedItemId$1", f = "UpdateSearchOuterFlowExposedSetAction.kt", l = {}, m = "invokeSuspend")
public final class C0HCF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HCF(int i, InterfaceC1364105Vn<? super C0HCF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HCF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateSearchOuterFlowExposedSetActionKt@294b.recordOuterFlowExposedItemId$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0Q3E.LJI().fe(new C640010P8l(this.LL));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UpdateSearchOuterFlowExposedSetActionKt@294b.recordOuterFlowExposedItemId$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
