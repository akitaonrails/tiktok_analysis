package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$SortTrigger$trySort$1", f = "GoldenHouse.kt", l = {335}, m = "invokeSuspend")
public final class C0NGB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C0NG8 LLILLL;
    public final /* synthetic */ C0NH6 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NGB(int i, C0NG8 c0ng8, C0NH6 c0nh6, InterfaceC1364105Vn<? super C0NGB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c0ng8;
        this.LLILZ = c0nh6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NGB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoldenHouse$SortTrigger@a993.trySort$1");
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
            if (this.LLILLJJLI > 0 && this.LLILLL.LIZ && this.LLILLL.LIZIZ && this.LLILLL.LIZJ) {
                if (this.LLILZ.LIZLLL.get() > 0) {
                    C23250099c.LIZLLL(this.LLILZ.LJII, null, null, new C0NGC(this.LLILLL, this.LLILLJJLI, null), 3);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GoldenHouse$SortTrigger@a993.trySort$1");
                    return unit;
                }
                int andAdd = this.LLILLL.LIZLLL.getAndAdd(1);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.LLILLL.LJ.get();
                if (andAdd < Math.max((C300690BqV.LIZ() >> 8) & 15, 1) && jCurrentTimeMillis - j >= ((long) Math.max((C300690BqV.LIZ() >> 1) & 127, 3)) * 60 * 1000) {
                    this.LLILLL.LJ.set(jCurrentTimeMillis);
                    C0NG8 c0ng8 = this.LLILLL;
                    this.LL = 1;
                    if (c0ng8.LIZ(this) == objLJFF) {
                        C1C7U.LIZIZ("GoldenHouse$SortTrigger@a993.trySort$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("GoldenHouse$SortTrigger@a993.trySort$1");
                    return unit2;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("GoldenHouse$SortTrigger@a993.trySort$1");
                return unit3;
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("GoldenHouse$SortTrigger@a993.trySort$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
