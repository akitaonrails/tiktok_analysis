package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloader$initMemoryCallback$cleanPreloadView$1", f = "ECSparkPreloader.kt", l = {514}, m = "invokeSuspend")
public final class C1343205Nm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343205Nm(String str, InterfaceC1364105Vn<? super C1343205Nm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343205Nm(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator<String> it2;
        C1C7U.LIZ("ECSparkPreloader@6865.initMemoryCallback$cleanPreloadView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            it2 = C1523770pkt.LJ.iterator();
        }
        while (it2.hasNext()) {
            String next = it2.next();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1343105Nl c1343105Nl = new C1343105Nl(next, null);
            this.LL = it2;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1343105Nl) == objLJFF) {
                C1C7U.LIZIZ("ECSparkPreloader@6865.initMemoryCallback$cleanPreloadView$1");
                return objLJFF;
            }
        }
        C1523770pkt.LJ.clear();
        C1523770pkt c1523770pkt = C1523770pkt.LIZ;
        String str = this.LLILLL;
        c1523770pkt.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stage", str);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_common_spark_preload", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECSparkPreloader@6865.initMemoryCallback$cleanPreloadView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
