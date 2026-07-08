package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.applog.priority.original.InsertCache$eventCacheListener$1$onEventCacheAddFirst$1", f = "SqliteDatabaseOpt.kt", l = {78}, m = "invokeSuspend")
public final class C418101jv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2191631Aq1 LLILLJJLI;
    public final /* synthetic */ C418201jw LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C418101jv(C2191631Aq1 c2191631Aq1, C418201jw c418201jw, InterfaceC1364105Vn<? super C418101jv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2191631Aq1;
        this.LLILLL = c418201jw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C418101jv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InsertCache@f002.eventCacheListener$1$onEventCacheAddFirst$1");
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
            long j = this.LLILLJJLI.LL.cacheTime;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("InsertCache@f002.eventCacheListener$1$onEventCacheAddFirst$1");
                return objLJFF;
            }
        }
        this.LLILLL.LIZ.LIZ(0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InsertCache@f002.eventCacheListener$1$onEventCacheAddFirst$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
