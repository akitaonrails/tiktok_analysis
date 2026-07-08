package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdPerformceShowEvent$track$1", f = "SearchAdPerformceShowEvent.kt", l = {}, m = "invokeSuspend")
public final class C1007840cKk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1007830cKj LL;
    public final /* synthetic */ List<EnumC1007780cKe> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1007840cKk(C1007830cKj c1007830cKj, List<? extends EnumC1007780cKe> list, InterfaceC1364105Vn<? super C1007840cKk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1007830cKj;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007840cKk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String value;
        C1C7U.LIZ("SearchAdPerformceShowEvent@b41d.track$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bind_cost", this.LL.LIZ);
        jSONObject.put("attach_cost", this.LL.LIZIZ);
        jSONObject.put("cid", this.LL.LIZJ);
        EnumC658110Prd enumC658110Prd = this.LL.LIZLLL;
        if (enumC658110Prd != null) {
            value = enumC658110Prd.getValue();
        } else {
            value = null;
        }
        jSONObject.put("module_type", value);
        jSONObject.put("hit_preload", C1011530cQh.LIZ().enableSearchPreload);
        jSONObject.put("has_preload_parts", this.LLILLJJLI);
        jSONObject.put("first_track_after_bind", this.LL.LJI);
        jSONObject.put("appear_to_didshow_cost", this.LL.LJIIIIZZ);
        jSONObject.put("anole_hybrid_card_show_success", this.LL.LJII);
        AppLogNewUtils.onEventV3("search_ad_performance_show", jSONObject);
        this.LL.LJI = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdPerformceShowEvent@b41d.track$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
