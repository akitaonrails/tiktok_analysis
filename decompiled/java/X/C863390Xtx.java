package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xtx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.feed.instantplay.flow.MinisInstantPlayMemoryWarningWatcher$scheduleFire$1", f = "MinisInstantPlayMemoryWarningWatcher.kt", l = {203}, m = "invokeSuspend")
public final class C863390Xtx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1006490cIZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863390Xtx(C1006490cIZ c1006490cIZ, InterfaceC1364105Vn<? super C863390Xtx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1006490cIZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863390Xtx(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisInstantPlayMemoryWarningWatcher@7482.scheduleFire$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.LIZIZ;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MinisInstantPlayMemoryWarningWatcher@7482.scheduleFire$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LJ.get()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MinisInstantPlayMemoryWarningWatcher@7482.scheduleFire$1");
            return unit;
        }
        C1006530cId.LIZIZ(this.LLILLJJLI);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MinisInstantPlayMemoryWarningWatcher@7482.scheduleFire$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
