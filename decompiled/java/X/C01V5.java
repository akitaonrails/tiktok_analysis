package X;

import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01V5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.nimble.mob.SearchNimbleCardMonitor$Companion$mobNimbleLayoutError$1", f = "SearchNimbleCardMonitor.kt", l = {}, m = "invokeSuspend")
public final class C01V5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01V5(int i, String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C01V5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01V5(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SearchNimbleCardMonitor$Companion@788.mobNimbleLayoutError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        int i = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        jSONObject.put("error_type", i);
        if (str != null) {
            jSONObject.put("error_layout_name", str);
        }
        if (str2 != null) {
            jSONObject.put("error_component_name", str2);
        }
        if (str3 != null) {
            jSONObject.put("error_network_msg", str3);
        }
        if (str4 != null) {
            jSONObject.put("error_decode_msg", str4);
        }
        AppLogNewUtils.onEventV3("search_nimble_layout_error", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchNimbleCardMonitor$Companion@788.mobNimbleLayoutError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
