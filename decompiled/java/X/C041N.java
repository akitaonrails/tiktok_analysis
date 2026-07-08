package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.041N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.track.ECEvent$post$1", f = "ECEvent.kt", l = {}, m = "invokeSuspend")
public final class C041N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C041O LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C041N(C041O c041o, InterfaceC1364105Vn<? super C041N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c041o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C041N(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECEvent@2274.post$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            HashMap<String, Object> mapLIZ = this.LL.LIZ();
            if (mapLIZ != null) {
                this.LL.LIZIZ.putAll(mapLIZ);
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : this.LL.LIZIZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            String str = this.LL.LIZ;
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL(str, jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECEvent@2274.post$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
