package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01SM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.photomode.CarouselStayTimer$start$1", f = "CarouselStayTimerManager.kt", l = {120}, m = "invokeSuspend")
public final class C01SM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C388901fD LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01SM(C388901fD c388901fD, long j, int i, InterfaceC1364105Vn<? super C01SM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c388901fD;
        this.LLILLL = j;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01SM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CarouselStayTimer@4e10.start$1");
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
            long j = this.LLILLJJLI.LIZ - this.LLILLL;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("CarouselStayTimer@4e10.start$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZJ.invoke(C2286608xc.LJ(this.LLILZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CarouselStayTimer@4e10.start$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
