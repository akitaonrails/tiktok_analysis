package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.PushServerIntelligentPopupHelper$processServerIntelligentAsync$1$1$1", f = "PushServerIntelligentPopupHelper.kt", l = {}, m = "invokeSuspend")
public final class C495501wP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C495501wP(Function2<? super Boolean, ? super Boolean, Unit> function2, InterfaceC1364105Vn<? super C495501wP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495501wP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushServerIntelligentPopupHelper@92aa.processServerIntelligentAsync$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(false, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushServerIntelligentPopupHelper@92aa.processServerIntelligentAsync$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
