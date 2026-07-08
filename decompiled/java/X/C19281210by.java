package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10by, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.eventbus.SharedEventManager$processEvent$2$1", f = "SharedEventManager.kt", l = {130}, m = "invokeSuspend")
public final class C19281210by extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC19280610bs LLILLJJLI;
    public final /* synthetic */ C19280810bu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19281210by(AbstractC19280610bs abstractC19280610bs, C19280810bu c19280810bu, InterfaceC1364105Vn<? super C19281210by> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC19280610bs;
        this.LLILLL = c19280810bu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19281210by(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharedEventManager@12aa.processEvent$2$1");
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
            C1865740yeS c1865740yeS = C1865740yeS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SharedEventManager processEvent async handle: ");
            sbLIZ.append(this.LLILLJJLI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1865740yeS.getClass();
            C1865740yeS.LIZJ("Event_Handler", strLIZIZ);
            C19281310bz c19281310bz = C19281310bz.LIZ;
            AbstractC19280610bs abstractC19280610bs = this.LLILLJJLI;
            C19280810bu c19280810bu = this.LLILLL;
            this.LL = 1;
            if (c19281310bz.LIZLLL(abstractC19280610bs, c19280810bu, this) == objLJFF) {
                C1C7U.LIZIZ("SharedEventManager@12aa.processEvent$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharedEventManager@12aa.processEvent$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
