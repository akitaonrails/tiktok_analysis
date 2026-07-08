package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NOM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.trace.TraceManager$uploadStrategyEvent$1", f = "TraceManager.kt", l = {}, m = "invokeSuspend")
public final class C0NOM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NON LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NOM(C0NON c0non, String str, InterfaceC1364105Vn<? super C0NOM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0non;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NOM(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TraceManager@b3cb.uploadStrategyEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0NOP c0nopRemove = this.LL.LIZIZ.remove(this.LLILLJJLI);
            if (c0nopRemove != null) {
                C0NON c0non = this.LL;
                Map<String, Object> map = c0nopRemove.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (((HashSet) C0NOR.LIZ.getValue()).contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIZILJ(linkedHashMap));
                jSONObject.put("strategy_name", c0non.LIZ);
                AppLogNewUtils.onEventV3("starship_strategy_runtime_event", jSONObject);
                c0non.LIZJ = System.currentTimeMillis();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TraceManager@b3cb.uploadStrategyEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
