package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DMV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.analytics.AppLogDualReporter$reportAppLogToSlardar$1$1", f = "AppLogDualReporter.kt", l = {}, m = "invokeSuspend")
public final class C0DMV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DMV(String str, Map<String, String> map, InterfaceC1364105Vn<? super C0DMV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DMV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        C1C7U.LIZ("AppLogDualReporter@e3c0.reportAppLogToSlardar$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C054G c054g = C0DMU.LIZ;
        String str = this.LL;
        Map<String, String> map = this.LLILLJJLI;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        C0DMU.LIZIZ(str, jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AppLogDualReporter@e3c0.reportAppLogToSlardar$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
