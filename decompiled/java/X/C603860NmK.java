package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.PipoContainerEventUtils$sendWebViewTerminateEvent$1", f = "PipoContainerEventUtils.kt", l = {427}, m = "invokeSuspend")
public final class C603860NmK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C603860NmK(JSONObject jSONObject, InterfaceC1364105Vn<? super C603860NmK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C603860NmK(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        JSONObject jSONObject;
        C1C7U.LIZ("PipoContainerEventUtils@c75.sendWebViewTerminateEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    jSONObject = (JSONObject) this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                jSONObject = this.LLILLL;
                C1725270uzt c1725270uzt = C1725270uzt.LIZ;
                C1725270uzt.LIZ(jSONObject.optString("biz"), null, jSONObject);
                this.LL = jSONObject;
                this.LLILLJJLI = 1;
                if (c1725270uzt.LIZIZ(jSONObject, this) == objLJFF) {
                    C1C7U.LIZIZ("PipoContainerEventUtils@c75.sendWebViewTerminateEvent$1");
                    return objLJFF;
                }
            }
            C1725270uzt.LJ(C1725270uzt.LIZ, "rd_pipo_universal_container_url_did_terminate", jSONObject, null, 12);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoContainerEventUtils@c75.sendWebViewTerminateEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
