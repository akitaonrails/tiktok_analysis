package X;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NH8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$onAllCacheLoadDone$1", f = "GoldenHouse.kt", l = {}, m = "invokeSuspend")
public final class C0NH8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NH6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NH8(C0NH6 c0nh6, InterfaceC1364105Vn<? super C0NH8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0nh6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NH8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoldenHouse@3441.onAllCacheLoadDone$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NH6.LJIILLIIL.LJIIJJI(new C591280NHa());
        this.LL.LJIILL.LIZIZ(C0NHK.INIT_DONE);
        C0NH6 c0nh6 = this.LL;
        c0nh6.getClass();
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL(c0nh6.LJFF);
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(c0nh6.LJFF);
        if (((Number) C283920BAw.LIZ.getValue()).intValue() > 0) {
            this.LL.LJ.put(C0NHJ.AFTER_LOAD_MORE, new C0NHQ());
        }
        Iterator<T> it2 = this.LL.LJ.values().iterator();
        while (it2.hasNext()) {
            ((C0NHE) it2.next()).LIZ();
        }
        this.LL.LJIILIIL.clear();
        C0NH0.LJFF = System.currentTimeMillis();
        C0NH1 c0nh1 = C0NH1.LIZ;
        long j = C0NH0.LJFF - C0NH0.LIZ;
        long j2 = C0NH0.LIZJ - C0NH0.LIZIZ;
        long j3 = C0NH0.LJ - C0NH0.LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
        c0nh1.getClass();
        EnumC308730C8h.Companion.getClass();
        C0NH1.LIZ("golden_house_init", C591500NHw.LIZ(new Pair("total_duration", Long.valueOf(j)), new Pair("io_duration", Long.valueOf(j2)), new Pair("api_verify_duration", Long.valueOf(j3)), new Pair("start_duration", Long.valueOf(jCurrentTimeMillis)), new Pair("config_level", C308750C8j.LIZ().name())));
        C0NG8 c0ng8 = this.LL.LJIILJJIL;
        if (c0ng8 != null) {
            c0ng8.LIZ = true;
            c0ng8.LIZIZ(5);
        }
        C1DFK c1dfk = this.LL.LJIIIZ;
        if (c1dfk != null) {
            Boolean.valueOf(c1dfk.LJFF());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoldenHouse@3441.onAllCacheLoadDone$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
