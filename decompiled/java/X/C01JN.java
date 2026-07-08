package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01JN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.hybrid.interceptor.InterceptorMobHelper$sendSparkInerceptorEvent$1", f = "InterceptorMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C01JN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01JN(String str, String str2, String str3, String str4, long j, Map<String, String> map, InterfaceC1364105Vn<? super C01JN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = j;
        this.LLILZLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01JN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InterceptorMobHelper@f9c1.sendSparkInerceptorEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        long j = this.LLILZIL;
        Map<String, String> map = this.LLILZLL;
        linkedHashMap.put("name", str);
        linkedHashMap.put("channel", str2);
        linkedHashMap.put("bundle", str3);
        linkedHashMap.put("schema", str4);
        linkedHashMap.put("duration", String.valueOf(j));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C20684815ws.LJIILLIIL("rd_tiktokls_spark_interceptor", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InterceptorMobHelper@f9c1.sendSparkInerceptorEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
