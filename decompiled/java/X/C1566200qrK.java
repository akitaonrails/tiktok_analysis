package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent$onParentViewCreated$1", f = "LoadMorePerfComponent.kt", l = {}, m = "invokeSuspend")
public final class C1566200qrK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LoadMorePerfComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566200qrK(LoadMorePerfComponent loadMorePerfComponent, InterfaceC1364105Vn<? super C1566200qrK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = loadMorePerfComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1566200qrK c1566200qrK = new C1566200qrK(this.LLILLJJLI, interfaceC1364105Vn);
        c1566200qrK.LL = obj;
        return c1566200qrK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        JSONObject jSONObject;
        C1C7U.LIZ("LoadMorePerfComponent@d571.onParentViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LLILLJJLI.m341do().getLong("reach_bottom_duration", 0L);
        Object obj3 = null;
        try {
            String string = this.LLILLJJLI.m341do().getString("reach_bottom_param_json", null);
            if (string != null && string.length() > 0) {
                JSONObject jSONObject2 = new JSONObject(string);
                jSONObject2.put("duration", j);
                jSONObject2.put("is_compensate", 1);
                jSONObject2.remove("duration_from_last");
                jSONObject2.remove("prf_cnt");
                jSONObject = jSONObject2;
            } else {
                jSONObject = null;
            }
            C189200o6.m2constructorimpl(jSONObject);
            obj2 = jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj2)) {
            obj3 = obj2;
        }
        JSONObject jSONObject3 = (JSONObject) obj3;
        if (jSONObject3 == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LoadMorePerfComponent@d571.onParentViewCreated$1");
            return unit;
        }
        C0NH6.LJIILLIIL.LIZIZ(AFwS213S0000000_24.get$arr$(415));
        C20684815ws.LJIJ("prf_feed_loading_time", jSONObject3);
        this.LLILLJJLI.m341do().clear();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LoadMorePerfComponent@d571.onParentViewCreated$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
