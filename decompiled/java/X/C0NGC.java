package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$SortTrigger$trySort$1$1", f = "GoldenHouse.kt", l = {323}, m = "invokeSuspend")
public final class C0NGC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NG8 LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NGC(C0NG8 c0ng8, int i, InterfaceC1364105Vn<? super C0NGC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ng8;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NGC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoldenHouse$SortTrigger@a993.trySort$1$1");
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
            long jMax = ((long) Math.max((C300690BqV.LIZ() >> 1) & 127, 3)) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jMax, this) == objLJFF) {
                C1C7U.LIZIZ("GoldenHouse$SortTrigger@a993.trySort$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZIZ(this.LLILLL - 1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoldenHouse$SortTrigger@a993.trySort$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
