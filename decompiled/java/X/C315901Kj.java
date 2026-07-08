package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.monitor.UsSeiLatencyHelper$register$1$1", f = "UsSeiLatencyHelper.kt", l = {}, m = "invokeSuspend")
public final class C315901Kj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315901Kj(String str, InterfaceC1364105Vn<? super C315901Kj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315901Kj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObjectOptJSONObject;
        Long lLJFF;
        C1C7U.LIZ("UsSeiLatencyHelper@f1ac.register$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            JSONObject jSONObject = new JSONObject(this.LL);
            if (jSONObject.has("video_e2e_delay") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("video_e2e_delay")) != null && (lLJFF = C2286608xc.LJFF(jSONObjectOptJSONObject.optLong("capture_camera", -1L))) != null && lLJFF.longValue() > 0) {
                C319201Lq.LIZJ = lLJFF;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsSeiLatencyHelper@f1ac.register$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
