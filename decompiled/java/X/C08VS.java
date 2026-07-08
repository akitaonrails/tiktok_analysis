package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08VS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.outreach.dispersion.monitor.OutreachVideoPlayTimer$onEventV3$4", f = "OutreachVideoPlayTimer.kt", l = {}, m = "invokeSuspend")
public final class C08VS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08VS(String str, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08VS(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OutreachVideoPlayTimer@c37a.onEventV3$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            JSONObject jSONObject = new JSONObject(this.LL);
            boolean z = C080M.LIZ;
            C080M.LIZJ(this.LLILLJJLI, jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("timer onEventV3 error. throwable:");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571615ec.getClass();
            C20571615ec.LIZIZ(strLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OutreachVideoPlayTimer@c37a.onEventV3$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
