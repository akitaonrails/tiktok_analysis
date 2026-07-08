package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.debug.DebugPreviewMixPageHost$onRequestDSL$1", f = "DebugPreviewMixPageHost.kt", l = {}, m = "invokeSuspend")
public final class C1881160z3K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1881170z3L LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881160z3K(C1881170z3L c1881170z3L, InterfaceC1364105Vn<? super C1881160z3K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1881170z3L;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1881160z3K(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("DebugPreviewMixPageHost@e8e5.onRequestDSL$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1881170z3L c1881170z3L = this.LL;
        try {
            JSONObject jSONObject = new JSONObject(c1881170z3L.LLJILJILJ.LIZJ);
            c1881170z3L.LJIJ(C1881030z37.LIZIZ(new C1881820z4O(jSONObject.optString("dsl"), jSONObject.optJSONObject("data"))), false);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1881170z3L c1881170z3L2 = this.LL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            c1881170z3L2.LJIJ(C1881030z37.LIZ(-1, message), false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DebugPreviewMixPageHost@e8e5.onRequestDSL$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
