package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialsharesearch.Coordinator$search$1", f = "Coordinator.kt", l = {52, 65}, m = "invokeSuspend")
public final class C498801ww extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C498901wx LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<List<? extends InterfaceC1381610m3b>, Double, Double, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C498801ww(C498901wx c498901wx, String str, InterfaceC1631620sYq<? super List<? extends InterfaceC1381610m3b>, ? super Double, ? super Double, Unit> interfaceC1631620sYq, InterfaceC1364105Vn<? super C498801ww> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c498901wx;
        this.LLILLL = str;
        this.LLILZ = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C498801ww(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<InterfaceC1381610m3b> listLIZ;
        C1C7U.LIZ("Coordinator@a411.search$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("Coordinator@a411.search$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("Coordinator@a411.search$1");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        for (InterfaceC1381610m3b interfaceC1381610m3b : this.LLILLJJLI.LIZ) {
            interfaceC1381610m3b.setPrimaryMatchMeta(null);
            interfaceC1381610m3b.setAllMatchMeta(C2097608Jq.LJ());
        }
        if (this.LLILLL.length() == 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C498701wv c498701wv = new C498701wv(this.LLILZ, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c498701wv) == objLJFF) {
                C1C7U.LIZIZ("Coordinator@a411.search$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("Coordinator@a411.search$1");
            return unit22;
        }
        long jNanoTime = System.nanoTime();
        C498901wx c498901wx = this.LLILLJJLI;
        List<InterfaceC1381610m3b> listLIZ2 = c498901wx.LIZIZ.LIZ(this.LLILLL, c498901wx.LIZ);
        double dNanoTime = (System.nanoTime() - jNanoTime) / 1000000.0d;
        long jNanoTime2 = System.nanoTime();
        InterfaceC499001wy interfaceC499001wy = this.LLILLJJLI.LIZJ;
        if (interfaceC499001wy != null && (listLIZ = interfaceC499001wy.LIZ(listLIZ2)) != null) {
            listLIZ2 = listLIZ;
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C498601wu c498601wu = new C498601wu(this.LLILZ, listLIZ2, dNanoTime, (System.nanoTime() - jNanoTime2) / 1000000.0d, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c498601wu) == objLJFF) {
            C1C7U.LIZIZ("Coordinator@a411.search$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("Coordinator@a411.search$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
