package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01V7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.nimble.mob.SearchNimbleCardMonitor$createNimbleCostTrace$1", f = "SearchNimbleCardMonitor.kt", l = {}, m = "invokeSuspend")
public final class C01V7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C01V8 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01V7(C01V8 c01v8, long j, String str, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C01V7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c01v8;
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01V7(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SearchNimbleCardMonitor@adb3.createNimbleCostTrace$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        C01V8 c01v8 = this.LL;
        long j = this.LLILLJJLI;
        String str = this.LLILLL;
        Map<String, Object> map = this.LLILZ;
        String str2 = c01v8.LIZ;
        if (str2 == null) {
            str2 = "unknown";
        }
        jSONObject.put("layout_name", str2);
        jSONObject.put("total_time_cost", j);
        jSONObject.put(str, j);
        jSONObject.put("stage", str);
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        AppLogNewUtils.onEventV3("search_nimble_perf", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchNimbleCardMonitor@adb3.createNimbleCostTrace$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
